
package bridgerapor;

public  class Report {
    public IReportFormat reportFormat;

    public IReportFormat getReporFormat() {
        return reportFormat;
    }

    private void setReporFormat(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }
    public Report(IReportFormat reportFormat){
        this.reportFormat=reportFormat;
    }
    public void Display(){
        reportFormat.Generate();
    }
}
