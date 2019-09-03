var gulp = require("gulp");
var path = require("path");
var eslint = require("gulp-eslint");
var clean = require("gulp-clean");
var rev = require('gulp-rev');
var revCollector = require('gulp-rev-collector');
var uglify = require('gulp-uglify');
var cleanCss = require('gulp-clean-css');

var base = 'src/main/webapp';
var sourceBase = base + '/resources';
var viewSource = base + '/view';
var distBase = base + '/WEB-INF';
var viewDest = distBase + '/jsp';
var dest = distBase + '/dist';

gulp.task('eslint', function () {
    return gulp.src(jsFiles)
        .pipe(eslint())
        .pipe(eslint.format())
        .pipe(eslint.failAfterError());
});

gulp.task('clean', function () {
    return gulp.src([dest, viewDest], {read: false, allowEmpty: true})
        .pipe(clean());
});

gulp.task('revCss', function () {
    return gulp.src(sourceBase + '/css/*.css')
        .pipe(rev())
        .pipe(cleanCss({compatibility: 'ie8'}))
        .pipe(gulp.dest(dest + '/css'))
        .pipe(rev.manifest())
        .pipe(gulp.dest(dest + '/css'));
});

gulp.task('revJs', function () {
    return gulp.src(sourceBase + '/script/*.js')
        .pipe(rev())
        .pipe(uglify())
        .pipe(gulp.dest(dest + '/script'))
        .pipe(rev.manifest())
        .pipe(gulp.dest(dest + '/script'))
});

gulp.task('revJsp', function () {
    return gulp.src([dest + '/css/*.json', dest + '/script/*.json', viewSource + '/**/*.jsp'])
        .pipe(revCollector({
            replaceReved: true,
            dirReplacements: {
                "/script/": "/script/",
                "/css/": "/css/"
            }
        }))
        .pipe(gulp.dest(viewDest));
});

gulp.task('copy', function () {
    return gulp.src([sourceBase + '/**/*', '!' + sourceBase + '/script/*.js', '!' + sourceBase + '/css/*.css'])
        .pipe(gulp.dest(dest));
});

gulp.task('default', gulp.series('clean', 'copy', 'revCss', 'revJs', 'revJsp'));

gulp.task("watch", function () {
    gulp.watch([sourceBase + '/**/*', viewSource], gulp.series('default'));
});