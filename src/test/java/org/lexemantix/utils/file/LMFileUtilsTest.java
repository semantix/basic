package org.lexemantix.utils.file;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LMFileUtilsTest extends TestCase
{
    @Test
    public void testSetContents() throws Exception
    {
        List<File> foundFiles = new ArrayList<File>();
        String testText = (new Date()).toString() + "\nThis is the test string that gets written into this file by Program!!!!";
        File startDir = new File(System.getProperty("user.dir"));
        LMFileFilter fileFilter = new LMFileFilter("TestFileToAddToClassPath.txt");
        LMClassPathManager.scan(startDir, foundFiles, fileFilter);

        assertTrue(foundFiles.size() > 0);

        int written = 0;
        for(File file : foundFiles)
        {
            LMFileUtils.setContents(file, testText, false);
            written++;
        }
        assertTrue(written > 0);
    }
    @Test
    public void testGetAllFiles() throws Exception
    {
        assertTrue(LMFileUtils.getAllFiles(".\\.txt").size() > 0);
        assertEquals(1, LMFileUtils.getAllFiles("JU.java").size());
    }

    @Test
    public void testGetURLContents() throws Exception
    {
        URL readme = new URL("https://github.com/semantix/basic/blob/master/README.md");
        assertTrue(LMFileUtils.getURLContents(readme).length() > 0);
        assertTrue(LMFileUtils.getURLContents(readme).contains("basic"));
    }
}