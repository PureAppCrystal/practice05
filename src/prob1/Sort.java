package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		// 
		for ( int i=0; i<count; i++) {
			//System.out.println(i+1+"회");
			for ( int j=i+1; j<count-1; j++) {
				if ( array[i] < array[j]) {
					//System.out.printf("%d와 %d를 비교해서 뒤가 크므로 바꾼다 \n", array[i], array[j]);
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					/*
					System.out.print("[");
					for (int l = 0; l < count; l++) {
						
						System.out.print( array[ l ] + " " );
					}
					System.out.print("]");
					System.out.println("");
					*/
					
				} else {
					//System.out.printf("%d와 %d를 비교해서 뒤가 작으므로 제자리 \n", array[i], array[j]);
				}
			}
		}	
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}