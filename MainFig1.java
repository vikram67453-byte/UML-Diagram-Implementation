package fig1;

public class MainFig1 {
    public static void main(String[] args) {
        System.out.println("--- Fig1 Demo: Granular Interfaces ---");
        Amazon amazon = new Amazon();
        amazon.createServer("us-east");
        for (String s : amazon.listServers("us-east")) {
            System.out.println("  server: " + s);
        }
        amazon.storeFile("report.pdf");
        System.out.println("  CDN: " + amazon.getCDNAddress());

        Dropbox dropbox = new Dropbox();
        dropbox.storeFile("image.png");
        System.out.println(dropbox.getFile("image.png"));
    }
}
