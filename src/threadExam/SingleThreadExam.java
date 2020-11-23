package threadExam;

public class SingleThreadExam {

	public static void main(String[] args) {
		
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime));
		
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - startTime));
		// 대충 소요 시간1 : 2  소요시간2 : 3,4 가 나온다. 
	}

}
