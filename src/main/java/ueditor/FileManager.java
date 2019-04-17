package ueditor;

import java.io.InputStream;
import java.net.URL;

public interface FileManager {
	void addFileFromInputStream(InputStream input);

	void addFileFromBase64(String input);

	void addFileFromURL(URL url);
}
