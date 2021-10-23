
public class Ex4_99 {
	public static void main(String[] args) {
		int n = 0; 
		int[] a = {1, 0, 1, 1, 0};
		int temp;
		int i, j;
		
		for(i=0; i<5; i++) {
			temp=1;
			for(j=1;j<=5-1-i;j++)
				temp = temp*2;
			n=n+a[i]*temp;
			
		}
		System.out.println(n);
		}

	}


