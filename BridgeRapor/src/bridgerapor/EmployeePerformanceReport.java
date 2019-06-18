
package bridgerapor;

public class EmployeePerformanceReport extends Report{
    
    public EmployeePerformanceReport(IReportFormat reportFormat) {
        super(reportFormat);
    }
    public void Display(){
        System.out.println("----Çalışan Performans Raporu----");
        super.Display();
    }
}
