
public class threadPro{
	public static void main(String[] args) throws Exception{
		Account a = new Account(1,"san",100);
		Thread t1=new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					a.deposit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2=new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					a.withdraw();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
