package threadExam;

public class PriorityExam {

	public static void main(String[] args) {
		// 우선순위 : 1~10 높을수록 더 높은 우선순위를 갖는다
		// 메인스레드(우선순위5)내에 생성된 스레드는 상속을 받아 우선순위을 상속받아 자동으로 5가 된다. 
		ThreadEx51 th1 = new ThreadEx51();
		ThreadEx52 th2 = new ThreadEx52();
		
		// 우선순위 7로 지정, 더 많은 작업시간을 갖게 된다
		th2.setPriority(7);
		
		System.out.println("Priority of th1() : " + th1.getPriority());
		System.out.println("Priority of th2() : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}

}


class ThreadEx51 extends Thread {
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int x = 0; x < 10000000; x++);
		}
	}
}


class ThreadEx52 extends Thread {
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int x = 0; x < 10000000; x++);
		}
	}
}