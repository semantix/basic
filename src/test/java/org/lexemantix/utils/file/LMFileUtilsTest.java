package org.lexemantix.utils.file;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.util.Date;

public class LMFileUtilsTest extends TestCase
{
    @Test
    public void testSetContents() throws Exception
    {
        String testText = (new Date()).toString() + "\nThis is the test string that gets written into this file by Program!!!!";
        File fileToSetTextWith = new File(System.getProperty("user.dir") + "/src/main/resources/TestFileToAddToClassPath.txt");

        LMFileUtils.setContents(fileToSetTextWith, testText, false);
    }
}