package threadExam;

public class ThreadExam {
	
	
	// 메인메서드도 스레드 중 하나이다
	public static void main(String[] args) {
		// 프로세스 : 프로그램 -> 메모리, 메모리자원, 스레드 -> 프로세스
		// 스레드 : 실질적으로 작업 수행
		// 멀티스레드 : 싱글스레드에서 요청마다 프로세스를 생성하는 것보다 
		// 새로운 스레드를 생성하는 것이 더 빠르고 공간절약이 된다.
		// 대신에 동기화, 교착상태같은 문제들을 고려해서 프로그래밍을 해야한다.
		
		// 스레드를 구현방법 : Thread클래스 상속, Runnable인터페이스 구현
		// 대개 Runnable를 구현해서 다중 상속을 받아 코드의 일관성과 재사용성을 높이는 게 더 좋은 방법
		
		ThreadEx1 th1 = new ThreadEx1();
		ThreadEx2 r = new ThreadEx2();
		
		// runnable은 매개변수로 생성자를 스레드 클래스에게 줘야한다.
		Thread th2 = new Thread(r);
		
		
		// start()는 스레드에 필요한 호출스택을 생성하고 run메서드를 호출한다
		// 스레드마다 os의 스케쥴러에 의해 순서대로 실행이 되고 실행대기였다가 자기 차례가 되면 실행이 된다
		// 한 번 실행되고 종료되면 다시는 실행할 수 없다
		th1.start();
		th2.start();
		/*
		 Thread-0
		 Thread-1 
		 */
	
	}

}


class ThreadEx1 extends Thread{
	
	// run() : 스레드의 작업을 채운다
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 조상 스레드의 이름 반환
			System.out.println(getName());
		}
	}
}

class ThreadEx2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 현재 실행중인 스레드 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}


