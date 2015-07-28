package org.lexemantix.utils.file;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;

public class LMClassPathManagerTest extends TestCase
{

    private String exactFileName = "TestFileToAddToClassPath.txt";
    private String fileNameRegexGood = "^TestFile.*";
    private String fineNameRegexFail = "abcd";

    private LMFileFilter fileFilter = new LMFileFilter(exactFileName);

    @Rule
    ExpectedException exception = ExpectedException.none();
    @Test
    public void testWithResource1() throws Exception
    {
        File startDir = new File(System.getProperty("user.dir"));
        LMClassPathManager.findItAndAddToClassPath(startDir, exactFileName, fileFilter);
    }
}