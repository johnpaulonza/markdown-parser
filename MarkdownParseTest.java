import static org.junit.Assert.*;   //import junit assert methods, why is it static?
import org.junit.*; //import junit

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test   //Tells vscode to ignore missing main and that it's a test?
    public void addition(){     //Header of a test
        assertEquals(2, 1+1);   //Test, compare if 2 is equal to 1 + 1
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }
}
