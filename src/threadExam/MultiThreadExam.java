package threadExam;

public class MultiThreadExam {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		
		ThreadEx3 th3 = new ThreadEx3();
		th3.start();
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s" , new String("-"));
		}
		System.out.println();
		System.out.print("소요시간1: " + (System.currentTimeMillis() - MultiThreadExam.startTime));
		// 소요시간1 : 3 소요시간2 : 32~33 정도 걸린다.
	}
}


class ThreadEx3 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s" , new String("-"));
		}
		System.out.println();
		System.out.print("소요시간2: " + (System.currentTimeMillis() - MultiThreadExam.startTime));
	}
}