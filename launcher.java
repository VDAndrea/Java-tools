import java.io.FileNotFoundException;
import java.io.IOException;


public class launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//attempts run internet explorer
			try{
				Runtime rt = Runtime.getRuntime();  
				Process p = rt.exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE");  ;
			 } catch (FileNotFoundException e) {
			    System.err.println("FileNotFoundException: " + e.getMessage());
			    throw new Exception(e);
				
			} catch (IOException e) {
			    System.err.println("Caught IOException: " + e.getMessage());
			}{
			//attempts to run firefox
				try{
					Runtime rt = Runtime.getRuntime();  
					Process p = rt.exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE");  
			}catch (FileNotFoundException e) {
			    System.err.println("FileNotFoundException: " + e.getMessage());
			    throw new Exception(e);

			} catch (IOException e) {
			    System.err.println("Caught IOException: " + e.getMessage());} 
			}else{
			//attempts to run chrome
				try{
					Runtime rt = Runtime.getRuntime();  
					Process p = rt.exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE");  
			}catch (FileNotFoundException e) {
			    System.err.println("FileNotFoundException: " + e.getMessage());
			    throw new Exception(e);

			} catch (IOException e) {
			    System.err.println("Caught IOException: " + e.getMessage());} }	
				}
	}


