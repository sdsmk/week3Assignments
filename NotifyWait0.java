package Day3Assignments;

class MyWrapper{
	String str,total="";
}

public class NotifyWait0 {
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
		synchronized(NotifyWait0.mw)
		{
			try
			{
			for(int i=NotifyWait0.mw.str.length()-1;i>=0;i--)
			
			{
				NotifyWait0.mw.total += NotifyWait0.mw.str.charAt(i);
			}
			}
			catch(Exception e){ e.printStackTrace(); }
			NotifyWait0.mw.notify();
			System.out.println("notify() invoked from Child thread");
		}
		
	}
}
