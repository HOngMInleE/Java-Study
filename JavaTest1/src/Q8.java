
public class Q8 {

	public static void main(String[] args) {
		int [][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20,},
				{30,30,30,30,30,}
		};
		int total = 0;
		
//		for(int[] col : arr) {
//			for(int row : col) {
////				System.out.println(row);
//				total += row;
//			}
//		}
		
		for(int i=0; i< arr.length;i++) {
			for(int j=0; j< arr[i].length;j++) {
				total += arr[i][j];
			}
		}
		
		
		
		System.out.println("total = " + total);
		System.out.println(total / (arr.length * arr[0].length)); //��� ���ϱ�
	}

}
