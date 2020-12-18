package ArrayOneDimensional;

public class exercises2 {

	public static void main(String[] args) {
		
		
		//write a statement that declare a string array initialize with the following string:
		//sunday,monday,tuesday,wednesday,thursday,friday,saturday
		//write a loop that displ content of each element in the array that u declared
		
		String[] days = {"sunday","monday","tuesday","wesnesday","thursday","friday","saturday" };
        for (int i=0; i<days.length; i++) {
        	System.out.println(days[i]);
        }
        System.out.println();
        int a =0;
        while(a <days.length ) {
        	System.out.println(days[a]);
        	a++;
        }
        
        System.out.println();
        int b=0;
        		do {
        			System.out.println(days[b]);
        			b++;
        			
        		}while (b<days.length);
        
        
        
        
        
	}

}
