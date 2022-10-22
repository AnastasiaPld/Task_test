package com.lab.project.com;

public class Threads extends Thread {

	private Examination examination1;
	private Examination examination2;

	public Threads(Examination examination1, Examination examination2) {
		this.examination1 = examination1;
		this.examination2 = examination2;
	}

	@Override
	public void run() {
		synchronized (examination1) {
			System.out.println("Thread 1 start:" + examination1.toString());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (examination2) {
				System.out.println("Thread 2 start" + examination2.toString());
			}
		}
	}

}
