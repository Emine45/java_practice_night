package day_09;

//Is there any issue? If not, What is the result?
public class Question25 {
	public static void main(String[] args) {
		int num [][]= {{1,2},{3,4}};
		for(int i=num.length-1;i>=0;i--) {
			for (int j:num[i]){
				System.out.print(j+" ");
			}
		}
	}
}