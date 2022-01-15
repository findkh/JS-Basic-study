
public class Exercise4_4 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)+.. 과 같은 식으로 더해나갔을 때 
		// 몇까지 더해야 총합이 100이상이 되는지
		int i;
		int sum = 0;
				
		for(i=1; true; i++) {
			sum = (i%2==0 ? sum-i : sum+i);
				if (sum >=100)
					break;
		}
		System.out.println(i);
	}
	
	}


	

