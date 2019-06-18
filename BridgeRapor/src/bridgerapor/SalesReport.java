
package bridgerapor;

public class SalesReport extends Report {
    
    public SalesReport(IReportFormat reportFormat) {
        super(reportFormat);
    }
   
    public void Display(){
        System.out.println("-----satış raporu----");
        super.Display();
    }
            
    
}
