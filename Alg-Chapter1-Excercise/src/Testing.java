import java.util.ArrayList;
import java.util.List;


public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		int r=0;
		while(list.iterator().hasNext()){
			r=(r+3);
		}
		
		int r1=0;
		for(int n=10 ; n>0; n--){
			r1= (r1+3)%10;
			r1 = r1 % n;
			System.out.println(r1);
			list.remove(r1);
			if(r1==n-1){
				r1=0;
			}else{
				r1++;
			}
		}
			
		
		
		
	}

}
