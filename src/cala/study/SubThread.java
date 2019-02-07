package cala.study;

public class SubThread implements Runnable{
	private int id;
	
	public SubThread(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is "+ id + "Thread!");
	}

}
