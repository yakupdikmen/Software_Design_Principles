
package bridgerapor;

public class BridgeRapor {

    public static void main(String[] args) {
       Report report=new EmployeePerformanceReport(new DektopFormat());
       report.Display();
       
       Report report1=new SalesReport(new WebFormat());
       report1.Display();
       
       Report report2=new EmployeePerformanceReport(new WebFormat());
       report2.Display();
       
       Report report3=new SalesReport(new DektopFormat());
       report3.Display();
    }
    
}
