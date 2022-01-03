/**
 * Asia Lewis
 * September 24, 2021 
 * Data Structure and Algorithms
 * Unit 4 Assignment
 */

package chapter04;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Assignment04 {
	
	//Making a method for each algorithm that returns the runtime
	
	//Algorithm A
	public static long algA(long n) {
		
		long timeElapsed;//stores the time it takes to run method
		long startTime = System.currentTimeMillis();//starts time for method
		
				long sum = 0;
				for (long i = 1; i <= n; i++) {
					sum = sum + i;
				}
		long endTime = System.currentTimeMillis();//ends time for method
		
		 timeElapsed = (endTime-startTime);//computes total run time in ms of method
		 
		return timeElapsed;
	}//end of algA
	
	//Algorithm B
	public static long algB(long n) {
		
		long timeElapsed;//stores the time it takes to run method
		long startTime = System.currentTimeMillis();//starts time for method
		
				long sum = 0;
				for (long i = 1; i <= n; i++)
				{
				for (long j = 1; j <= i; j++)
				sum = sum + 1;
				} // end for
				
		long endTime = System.currentTimeMillis();//ends time for method
		
		timeElapsed = (endTime-startTime);//computes total run time of method
		
		return timeElapsed;
	}//end algB
	
	//Algorithm C
	public static long algC(long n) {
		
	long timeElapsed;//stores the time it takes to run method
	long startTime = System.currentTimeMillis();//starts time for method
	
		long sum=n*(n+1)/2;
		
	long endTime = System.currentTimeMillis();//ends time for method
	
	timeElapsed = (endTime-startTime);//computes total run time of method
	
	return timeElapsed;
	
	}//end algC
	
	public static void main(String[] args) {
		//main method displays table that shows the runtime of each algorithm after n input
       
   // Column Names for table
        String[] columnNames = { "n", "A(msec)", "B(msec)" ,"C(msec)"};
        
        // Data to be displayed in the Table
        String[][] data = {
            {"1000", Long.toString(algA(1000)), 
            	Long.toString(algB(1000)), Long.toString(algC(1000)) },
            
            {"2000", Long.toString(algA(2000)), 
                	Long.toString(algB(2000)), Long.toString(algC(2000)) },
            
            {"3000", Long.toString(algA(3000)), 
                    Long.toString(algB(3000)), Long.toString(algC(3000)) },
            
            {"4000", Long.toString(algA(4000)), 
                    Long.toString(algB(4000)), Long.toString(algC(4000)) },
            
            {"5000", Long.toString(algA(5000)), 
                    Long.toString(algB(5000)), Long.toString(algC(5000)) },
            
            {"6000", Long.toString(algA(6000)), 
                    Long.toString(algB(6000)), Long.toString(algC(6000)) },
            
            {"7000", Long.toString(algA(7000)), 
                    Long.toString(algB(7000)), Long.toString(algC(7000)) },
            
            {"8000", Long.toString(algA(8000)), 
                    Long.toString(algB(8000)), Long.toString(algC(8000)) },
            
            {"9000", Long.toString(algA(9000)), 
                    Long.toString(algB(9000)), Long.toString(algC(9000)) },
            
            {"10000", Long.toString(algA(10000)), 
                    Long.toString(algB(10000)), Long.toString(algC(10000)) },
            
            {"11000", Long.toString(algA(11000)), Long.toString(algB(11000)), Long.toString(algC(11000))},
            
            {"12000", Long.toString(algA(12000)), Long.toString(algB(12000)), Long.toString(algC(12000))},
            
            {"13000", Long.toString(algA(13000)), Long.toString(algB(13000)), Long.toString(algC(13000))},
            
            {"14000", Long.toString(algA(14000)), Long.toString(algB(14000)), Long.toString(algC(14000))},
            
            {"15000", Long.toString(algA(15000)), Long.toString(algB(15000)), Long.toString(algC(15000))}
                    
        };//end of data array
  
        // Initializing JTable
        JTable table = new JTable(data, columnNames);
        
        //Initializing JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Assignment 04");
        
        // adding JScrollPane to frame
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        
        // Frame Size
        frame.setSize(500, 500);
        
        // Frame Visible = true
        frame.setVisible(true);
		
	}//end of main method

}//end of Assignment04
