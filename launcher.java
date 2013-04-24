import java.io.FileNotFoundException;
import java.io.IOException;

public class launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				boolean run = true;
				if(run==true)
					{ 
				//attempt to run Internet Explorer
						try{
					Runtime rt = Runtime.getRuntime();  
					Process p = rt.exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE");  ;
				 } catch (FileNotFoundException e) {
				    System.err.println("FileNotFoundException: " + e.getMessage());
				    throw new Exception(e);
					
				} catch (IOException e) {
				    System.err.println("Caught IOException: " + e.getMessage());
				}}else {
				//attempt to run Mozilla Firefox
					try{
						Runtime rt = Runtime.getRuntime();  
						Process p = rt.exec("C:/Program Files/Internet Explorer/IEXPLORE.EXE");  
				}catch (FileNotFoundException e) {
				    System.err.println("FileNotFoundException: " + e.getMessage());
				    throw new Exception(e);

				} catch (IOException e) {
				    System.err.println("Caught IOException: " + e.getMessage());} 
				} else {
				//attempt to run Google Chrome
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

	}

}
