package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/properties/input.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("data"));
		
		String[] data = prop.getProperty("data").split(",");
		
	// �ִ밪 
		
	// �ּҰ� 
		
	// ��
		
	// ���

		int max = 0;
		int min = Integer.parseInt(data[0]);
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			
			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}
			
			sum += intValue;
		}
		
		avg = (double) sum / data.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			sum += Integer.parseInt(data[i]); // ������ ���� 11�� �ȴ�����. ������? 
												// ���� ����� �� ���Ѱſ��� ����
		}
		System.out.println();
		System.out.println(sum);
		
		
	}

}
