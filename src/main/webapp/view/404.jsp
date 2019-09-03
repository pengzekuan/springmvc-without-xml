<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>404 NOT FOUND</title>
    <meta name="viewport" content="width=device-width,minimum-scale=1.0 maximum-scale=1.0 user-scalable=no">
    <style type="text/css">

        .tit-1 {
            font-size: 400px;
            text-align: center;
        }

        .tit-2 {
            font-size: 128px;
            text-align: center;
            font-variant: small-caps;
        }

        .tit-3 {
            font-size: 16px;
            text-align: center;
        }

        @media screen and (max-width: 800px) {
            .tit-1 {
                font-size: 4.4rem;
                text-align: center;
            }

            .tit-2 {
                font-size: 1.8rem;
                text-align: center;
                font-variant: small-caps;
            }

            .tit-3 {
                font-size: .6rem;
                text-align: center;
            }

            .error-info {
                margin-top: 30%;
            }
        }
    </style>
</head>
<body bgcolor="linen" text="black">
<div class="error-info">
    <div class="tit-1 ">404</div>
    <div class="tit-2">Not Found
        <c:if test="${error != null}">${error}</c:if>
    </div>
    <div class="tit-3">
        The document you requested could not be found. Please check the URL and try again. This is a recording.
    </div>
</div>
</body>
</html>