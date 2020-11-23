package threadExam;

public class DaemonThread implements Runnable{
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// 다른 스레드를 돕는 보조적인 스레드로 다른 스레드가 모두 종료될 때 종료되는 특징을 가지고 있다(또는 프로그램 종료시)
		// 예로 가비지 컬렉터, 워드프로세서 저장등이 있다
		
		// 데몬스레드
		Thread th = new Thread(new DaemonThread());
		// 데몬스레드로 지정,start()를 하기 전에 지정해야한다.
		th.setDaemon(true);
		th.start();
		
		// 메인스레드 실행, 1초마다 카운트한 수 출력
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			// 5초가 지나면 자동저장, 데몬스레드를 실행
			if( i==5) autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(autoSave) autoSave();
		}
		
	}
	public void autoSave() {
		System.out.println("자동저장이 되었습니다.");
	}
}