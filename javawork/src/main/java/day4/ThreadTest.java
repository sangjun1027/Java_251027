package day4;

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {		
		// JVM 예외처리 : throws InterruptedException -> 멈춤
		
		// job1은 스레드임
		Job1 job1 = new Job1();
		// start()는 새 스레드를 만들고 그 것을 실행
		job1.start();
		
		// job2는 스레드가 안짐
		Thread thread = new Thread(new Job2());
		thread.start();
		
		// class생성과 실행을 익명class를 활용해 동시에 진행
		Thread thread2 = new Thread(() -> {
				for(int i = 200; i < 210; i++) {
					System.out.println(i);
					try {
						Thread.sleep(400);
					}catch(InterruptedException e) {
						e.printStackTrace();
					} // end try / catch
				} // end for
				}); // end thread2
		thread2.start();
		} // end of main
	} // end of class
	  
