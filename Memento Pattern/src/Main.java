public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        VersionControl versionControl = new VersionControl();

        doc.setContent("Version 1");
        versionControl.saveVersion(doc.save());

        doc.setContent("Version 2");
        versionControl.saveVersion(doc.save());

        doc.setContent("Version 3");
        versionControl.saveVersion(doc.save());

        System.out.println("Current content: " + doc.getContent());
        doc.restore(versionControl.getVersion(0));
        System.out.println("Restored to: " + doc.getContent());
    }
}
