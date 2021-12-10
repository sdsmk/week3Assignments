package Day3Assignments;

import com.customerror.InvalidDataException;
import com.custom.StockLogic;

public class Assignment2 {

	

	 

	
	    public static void main(String[] args) {
	        try{
	            StockLogic slobj = new StockLogic();
	            slobj.compute_avg("abcd.xls");
	        }catch(InvalidDataException ide){
	            System.out.println(ide.getMessage());
	        }
	    }
	}

