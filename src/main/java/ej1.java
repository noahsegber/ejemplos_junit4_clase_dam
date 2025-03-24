import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ej1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		List<Integer> list = new ArrayList<Integer>();
		int num = (int)(Math.random()* 11);
		int suma = 0;
		int media;
		int min = -1;
		int max = -1;
		int i = 0;
		
		while (num > 20) {
			
			int src = (int) (Math.random() * 101);
			list.add(src);
			suma += src;
			if ( min == -1 || min > src) {
				min = src;
			}
			if (max == -1 || max < src) {
				max = src;
			}
			num++;
			i++;
		}
		
		media = suma / i;
		Collections.sort(list);;
		
		
		
		
	}

}
