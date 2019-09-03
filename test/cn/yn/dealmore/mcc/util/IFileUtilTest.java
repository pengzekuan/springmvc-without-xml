package cn.yn.dealmore.mcc.util; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* IFileUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>Apr 28, 2019</pre> 
* @version 1.0 
*/ 
public class IFileUtilTest {

    private String basePath;

    @Before
    public void before() throws Exception {
        basePath = "/Users/pengzekuan/IdeaProjects/DMMCC/trunk/out/test/trunk/out/artifacts/trunk_war_exploded/";
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: download(String url, String tarPath)
    *
    */
    @Test
    public void testDownload() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getFilePath(String file, Boolean absolute)
    *
    */
    @Test
    public void testGetFilePath() throws Exception {
        Assert.assertEquals("/upload/xxx/", IFileUtil.getFilePath("upload/xxx", null));
        Assert.assertEquals(basePath + "upload/xxx/", IFileUtil.getFilePath("upload/xxx", basePath));
    }

    /**
    *
    * Method: copy(String path, String tarPath, String tarFileName)
    *
    */
    @Test
    public void testCopyForPathTarPathTarFileName() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: copy(String path, String tarPath)
    *
    */
    @Test
    public void testCopyForPathTarPath() throws Exception {
//        Assert.assertEquals(true, IFileUtil.copy("upload/tmp/0d91149e3b0c430bac032dda4a7b3f00.png", "upload/keTmp"));
    }

    /**
    *
    * Method: uploadFile(HttpServletRequest request, String pathBase, FileType fileType)
    *
    */
    @Test
    public void testUploadFile() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getFileTypeByType(String type)
    *
    */
    @Test
    public void testGetFileTypeByType() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: enableSuffix(String string)
    *
    */
    @Test
    public void testEnableSuffix() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: enableSize(long size)
    *
    */
    @Test
    public void testEnableSize() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getType()
    *
    */
    @Test
    public void testGetType() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getSuffix()
    *
    */
    @Test
    public void testGetSuffix() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: getMaxSize()
    *
    */
    @Test
    public void testGetMaxSize() throws Exception {
    //TODO: Test goes here...
    }


    /**
    *
    * Method: setAllowSuffix()
    *
    */
    @Test
    public void testSetAllowSuffix() throws Exception {
    //TODO: Test goes here...
    /*
    try {
       Method method = IFileUtil.getClass().getMethod("setAllowSuffix");
       method.setAccessible(true);
       method.invoke(<Object>, <Parameters>);
    } catch(NoSuchMethodException e) {
    } catch(IllegalAccessException e) {
    } catch(InvocationTargetException e) {
    }
    */
    }

} 
