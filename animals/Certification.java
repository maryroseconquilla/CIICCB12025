package animals;

import java.util.ArrayList;
import java.util.List;

public class Certification {
    private String name;
	private double price;
	
	public Certification(String s,double d){
			name = s;
			price = d;
		}
	
		public double getPrice(){
			return price;
		}

	public String getName(){
			return name;
		}
	}
	
	//Assume necessary imports have done
	
	public class CertifyTest {

		public static void main(String[] args) {
				List<Certification> certs = new ArrayList<Certification>();
	
			certs.add(new Certification("1Z0-803",120));		
			certs.add(new Certification("1Z0-804",250));
		certs.add(new Certification("1Z0-805",175));
		certs.add(new Certification("1Z0-808",150));
			certs.add(new Certification("1Z0-810",225));

		Supplier <Certification>  filter = (c) -> {return c.getPrice() > 180;};
		for(Certification c : certs){
			if(filter.test(c)){
			System.out.println(c.getName());
				}
			}
		}
}
