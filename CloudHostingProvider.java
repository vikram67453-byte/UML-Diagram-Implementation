package fig1;

public interface CloudHostingProvider {
    void createServer(String region);
    String[] listServers(String region);
}
