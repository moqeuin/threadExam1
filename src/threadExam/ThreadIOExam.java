package threadExam;

import javax.swing.JOptionPane;

public class ThreadIOExam {

	public static void main(String[] args) {
		
		ThreadEx4 th = new ThreadEx4();
		
		th.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력한 값은 : " + input + "입니다.");
		// 다른자원(입력, 출력)을 실행할 때는 멀티스레드가 더 효율적일 수 있다.
		/*
		 	10
			9
			8
			7
			6
			5
			4
			3
			2
			1
			입력한 값은 : 테스트입력입니다.
		 */
		// 입력하기 전까지 다른 스레드로 출력을 실행할 수 있다.
	}

}

class ThreadEx4 extends Thread{
	public void run() {
		
		for (int i = 10; i > 0 ; i--) {
			System.out.println(i);
		}
	}
}
