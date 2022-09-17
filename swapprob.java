
public class swapprob {
	

	    public static void main(String[] args) {

	        float first = 1.20f, second = 2.45f;

	        System.out.println("--Before swap--");
	        System.out.println("First num = " + first);
	        System.out.println("Second num = " + second);

	       
	        float temporary = first;

	       
	        first = second;

	      
	        second = temporary;

	        System.out.println("--After swap--");
	        System.out.println("First num = " + first);
	        System.out.println("Second num = " + second);
	    }
	}

