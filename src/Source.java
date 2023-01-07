
public class Source {

	public static void main(String[] args) {
try {
		Calculator.doAverage(1,3,4);
		Calculator.doAverage(3,4,5,6,7);
		Calculator.doAverage();
		Calculator.doAverage(12,4,5);


	}
     catch(CountByZeroException ex){
	System.out.println(ex.getMessage());
}
	}
}
 




