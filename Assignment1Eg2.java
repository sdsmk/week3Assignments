package Day3Assignments;

public class Assignment1Eg2 {
	
	static void fun() throws IllegalAccessException 
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]) 
    {
           try  
            {  
                fun();  
            }   
            catch (IllegalAccessException e)   
            {  
                e.printStackTrace();  
            }              
            
    }

}