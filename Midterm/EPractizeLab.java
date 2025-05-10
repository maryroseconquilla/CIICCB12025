package Midterm;

import java.util.ArrayList;
import java.util.function.DoublePredicate;

public class EPractizeLab {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
			list.add(21.6);
			list.add(21.39);
			list.add(21.5d);
			list.add(21.41);
	
			DoublePredicate ip = i -> i > 21.4;
			
			for(Double d : list){
				if(ip.test(d)){
					System.out.println(d);
				}
			}
		}
    }

