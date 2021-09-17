package com.ss.fs.deadlock;

public class DeadlockImplementation {

	public static void main(String[] args) {
		
		String s1 = "This should never be output.";
		String s2 = "This shouldn't either.";
		
		Runnable t1 = new Runnable() {
			@Override
			public void run()
			{
				try
				{
					synchronized(s1)
					{
						Thread.sleep(500);
						synchronized(s2)
						{
							System.out.println(s1 + "/" + s2);
						}
					}
				}
				catch (Exception e) {}
			}
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run()
			{
				try
				{
					synchronized(s2)
					{
						Thread.sleep(500);
						synchronized(s1)
						{
							System.out.println(s1 + "/" + s2);
						}
					}
				}
				catch (Exception e) {}
			}
		};

		System.out.println("Testing deadlock...");
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.out.println("Check that the JVM is still running. If it is, deadlock has been achieved.");
	}

}
