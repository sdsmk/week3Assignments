package Day3Assignments;

class MyWrapper{
	String str,total="";
}

public class Assignment3 {
	public static MyWrapper mw = new MyWrapper();
	
	public static void main(String[] args) {
		NotifyWaitB0 b = new NotifyWaitB0();
		b.start();
		
		synchronized(mw)
		{
			try{
				System.out.println("A:waiting for b thread to complete...");
				mw.str="Satya";
				mw.wait();
				System.out.println("after wait()....");
			}catch(Exception e) {
				System.out.println("Interrupted Exception:"+e.getMessage());
				e.printStackTrace();
			}
			
			System.out.println("Reverse of string:"+mw.total);
		}
	}

}


class NotifyWaitB0 extends Thread{
	public void run(){
		
		System.out.println("in run() method of Child thread");
		synchronized(Assignment3.mw)
		{
			try
			{
			for(int i=Assignment3.mw.str.length()-1;i>=0;i--)
			
			{
				Assignment3.mw.total += Assignment3.mw.str.charAt(i);
			}
			}
			catch(Exception e){ e.printStackTrace(); }
			Assignment3.mw.notify();
			System.out.println("notify() invoked from Child thread");
		}
		
	}
}
