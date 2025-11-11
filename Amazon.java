package fig1;

import java.util.Arrays;

public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {
    @Override
    public void createServer(String region) {
        System.out.println("[Amazon] Creating server in " + region);
    }

    @Override
    public String[] listServers(String region) {
        System.out.println("[Amazon] Listing servers in " + region);
        return new String[]{"us-east-1a", "us-east-1b"};
    }

    @Override
    public void storeFile(String name) {
        System.out.println("[Amazon] Storing file: " + name);
    }

    @Override
    public String getFile(String name) {
        System.out.println("[Amazon] Retrieving file: " + name);
        return "Contents of " + name;
    }

    @Override
    public String getCDNAddress() {
        return "https://cdn.amazon.example/";
    }

    @Override
    public String toString() {
        return "Amazon";
    }
}
