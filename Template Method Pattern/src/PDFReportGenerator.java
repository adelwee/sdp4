public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("PDF Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("PDF Body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("PDF Footer");
    }
}