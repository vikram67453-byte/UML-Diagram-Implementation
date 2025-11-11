package fig1;

public class Dropbox implements CloudStorageProvider {
    @Override
    public void storeFile(String name) {
        System.out.println("[Dropbox] Storing file: " + name);
    }

    @Override
    public String getFile(String name) {
        System.out.println("[Dropbox] Retrieving file: " + name);
        return "Dropbox content: " + name;
    }

    @Override
    public String toString() {
        return "Dropbox";
    }
}
