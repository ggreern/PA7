
package barchart;
import javax.swing.*;
import java.awt.*;



public class BarChartFrame extends JFrame{
    
    BarChartPanel bcp;
    public BarChartFrame(String title, int[] values, String[] labels, String[] info) {
        
        bcp = new BarChartPanel(values, labels, info, values.length);
        getContentPane().add(bcp, BorderLayout.CENTER);        
	setSize(800,400);
        this.setTitle(title);
	show();  
        
    }
    

    
    public void BarChartStart(double[] array1) {
        
        // set up data
        int[] values1 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            values1[1] = (int) array1[i];
        }
        int [] values = {10, 20, 20};
        String[] labels = {"Bar 0","Bar 1","Bar 2", "Bar 3", "Bar 4", "Bar 5"};
        String[] info = {"one stuff\nhi","two stuff\n\tbye","three stuff\n\thi\n\tbye"};
        
        // instantiate and display
        BarChartFrame bcf = new BarChartFrame("Array Values", values1,labels, info);
        
        // only do this if you want the application to exit when window is closed
        bcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
