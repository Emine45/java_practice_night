package day_09;

public class Question20 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("name1");
		sb.append("name2");
		sb.append(true);
		sb.append('a');
		sb.append(5);
		
		System.out.println(sb);
		System.out.println(sb.delete(1,sb.length()));
		System.out.println(sb);
	}
}