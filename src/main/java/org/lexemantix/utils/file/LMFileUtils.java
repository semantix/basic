package org.lexemantix.utils.file;

import java.io.*;

/**
 * Created by dks02 on 6/15/15.
 */
public class LMFileUtils
{
    public static void setContents(File aFile, String aContents, boolean append)
            throws FileNotFoundException, IOException
    {
        if (aFile == null)
        {
            throw new IllegalArgumentException("File should not be null.");
        }
        if (!aFile.exists())
        {
            throw new FileNotFoundException ("File does not exist: " + aFile);
        }
        if (!aFile.isFile())
        {
            throw new IllegalArgumentException("Should not be a directory: " + aFile);
        }

        if (!aFile.canWrite())
        {
            throw new IllegalArgumentException("File cannot be written: " + aFile);
        }

        //use buffering
        Writer output = new BufferedWriter(new FileWriter(aFile));
        try
        {
            //FileWriter always assumes default encoding is OK!
            if (append)
                output.append(aContents);
            else
                output.write( aContents );

            output.flush();
        }
        finally
        {
            output.close();
        }
    }

}
