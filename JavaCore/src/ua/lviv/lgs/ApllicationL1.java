package ua.lviv.lgs;

public class ApllicationL1 {
//1.	�������� �� ���� ����� ������� ���� ���������� ���� �����.
	
	public static void main(String[] args) {
		boolean bool = false;
		byte b = 55;
		char c = 'f';
		double d = 215.46;
		float f = 45.56f;
		int i = 60;
		long l = 365852136;
		short s = 11694;
		
		
		System.out.println("boolean" + " = " + bool);
		System.out.println("byte" + " = "  + b);
		System.out.println("char" + " = "  + c);
		System.out.println("double" + " = "  + d);
		System.out.println("float" + " = "  + f);
		System.out.println("int" + " = "  + i);
		System.out.println("long" + " = "  + l);
		System.out.println("short" + " = "  + s);
		
//	2.	������� �� ������� �������� � ����������� �������� ���� �����. 
//		���� ����������� �� ��������� System.out.println(); ta Java Wrappers (�������� �������� ).	
		System.out.println();
		
		System.out.println("Byte(max and min value) = " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
		System.out.println("Char(max and min value) = " + Character.MAX_VALUE + " " + Character.MIN_VALUE);
		System.out.println("Double(max and min value) =" + Double.MAX_VALUE + " " + Double.MIN_VALUE);
		System.out.println("Float(max and min value) =" + Float.MAX_VALUE + " " + Float.MIN_VALUE);
		System.out.println("Int(max and min value) =" + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println("Long(max and min value) =" + Long.MAX_VALUE + " " + Long.MIN_VALUE);
		System.out.println("Short(max and min value) =" + Short.MAX_VALUE + " " + Short.MIN_VALUE);
		
		System.out.println();
		
//3.	�������� �����, ��������� ���� 10 ���������� ���� int , 
//		������ ����������� �� �������� �������� � ����� �� ������� �� �� ������� . 
		
		
		int array[] = new int [10];
		int j;
		
		for(j = 0; j < 10; j++)
			array[j] = j;
		
		for(j = 0; j < 10; j++)
			System.out.println("����� [" + j + "]: " + array[j]);
		
		
		int arrayValue [] = new int[10];
		int min, max;
		
		arrayValue [0] = 100;
		arrayValue [1] = -56;
		arrayValue [2] = 105698;
		arrayValue [3] = 5;
		arrayValue [4] = -658;
		arrayValue [5] = 7894;
		arrayValue [6] = 321;
		arrayValue [7] = -89;
		arrayValue [8] = 369;
		arrayValue [9] = 13;
		
		System.out.println();
		
		min = max = arrayValue [0];
		for(int q = 1; q < 10; q++) {
			if(arrayValue[q] < min) min = arrayValue[q];
			if(arrayValue[q] > max) max = arrayValue[q];
		}
		System.out.println("min i max: " + min + " " + max);
		
			
		
		
	}
}
