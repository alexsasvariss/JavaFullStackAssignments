package com.ss.fs.consumerproducer;

import java.util.Random;

public class ConsumerProducerImplementation {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		Runnable consumer = new Runnable() {
			@Override
			public void run()
			{
				System.out.println("Starting consumer...");
				Character consumed = null;
				
				while (true)
				{
					if (!sb.isEmpty())
					{
						consumed = sb.charAt(0);
						System.out.println("Consumer consumed: " + consumed);
						sb.deleteCharAt(0);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Runnable producer = new Runnable() {
			@Override
			public void run()
			{
				System.out.println("Starting producer...");
				Random rand = new Random();
				char c;
				
				while (true) 
				{
					if (sb.length() < 50)
					{
						int num = rand.nextInt(26)+97;
						c = (char)num;
						sb.append(c);
						System.out.println("Buffer: " + sb.toString());
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		new Thread(producer).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(consumer).start();
	}

}
