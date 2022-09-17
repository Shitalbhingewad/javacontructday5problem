

	
	 
	
	 import java.io.*;
	public class harmonicprob {
	     
	// Find harmonic number
	static double nthHarmonic(int N)
	{
	    // H1 = 1
	    float harmonic = 1;
	 
	    
	    // H = H1 + H2 + H3 ... + 
	    for (int i = 2; i <= N; i++) {
	        harmonic += (float)1 / i;
	    }
	 
	    return harmonic;
	}
	 
	
	   public static void main (String[] args) {
	            int N = 8;
	     
	    System.out.print(nthHarmonic(N));
	     
	    }
	}

