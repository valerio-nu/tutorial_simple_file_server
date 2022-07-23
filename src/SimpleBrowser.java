import com.sun.net.httpserver.SimpleFileServer;
import java.io.File;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SimpleBrowser {
    public static void main(String[] args) {
        // parameters
        Integer port = 8080;
        File myFile = new File("Pages");
        String path = myFile.getAbsolutePath();
        System.out.println(path);
        SimpleFileServer.OutputLevel outputLevel = SimpleFileServer.OutputLevel.VERBOSE;

        // create the server
        var server = SimpleFileServer.createFileServer(
                new InetSocketAddress(port),
                Path.of(path),
                outputLevel);

        // start the server
        server.start();
    }
}
