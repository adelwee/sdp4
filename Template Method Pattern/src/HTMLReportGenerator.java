public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<html><head>HTML Header</head>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<body>HTML Body</body>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("</html>");
    }
}