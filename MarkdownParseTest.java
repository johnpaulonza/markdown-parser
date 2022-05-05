import static org.junit.Assert.*;   //import junit assert methods, why is it static?
import org.junit.*; //import junit

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test   //Tells vscode to ignore missing main and that it's a test? 
    public void addition(){     //Header of a test.
        assertEquals(2, 1+1);   //Test, compare if 2 is equal to 1 + 1
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testGetLinks2() throws IOException{
        Path fileName2 = Path.of("test-file2.md");
        String contents2 = Files.readString(fileName2);
        assertEquals(List.of("https://something.com", "some-page.html" ), MarkdownParse.getLinks(contents2));
    }

    @Test
    public void testGetLinks3() throws IOException{
        Path fileName3 = Path.of("test-file3.md");
        String contents3 = Files.readString(fileName3);
        assertEquals(List.of(), MarkdownParse.getLinks(contents3));
    }

    @Test
    public void testGetLinks4() throws IOException{
        Path fileName4 = Path.of("test-file4.md");
        String contents4 = Files.readString(fileName4);
        assertEquals(List.of(), MarkdownParse.getLinks(contents4));
    }

    @Test
    public void testGetLinks5() throws IOException{
        Path fileName5 = Path.of("test-file5.md");
        String contents5 = Files.readString(fileName5);
        assertEquals(List.of(), MarkdownParse.getLinks(contents5));
    }

    @Test
    public void testGetLinks6() throws IOException{
        Path fileName6 = Path.of("test-file6.md");
        String contents6 = Files.readString(fileName6);
        assertEquals(List.of("page.com"), MarkdownParse.getLinks(contents6));
    }

    @Test
    public void testGetLinks7() throws IOException{
        Path fileName7 = Path.of("test-file7.md");
        String contents7 = Files.readString(fileName7);
        assertEquals(List.of(), MarkdownParse.getLinks(contents7));
    }
    
    @Test
    public void testGetLinks8() throws IOException{
        Path fileName8 = Path.of("test-file8.md");
        String contents8 = Files.readString(fileName8);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(contents8));
    }
}
