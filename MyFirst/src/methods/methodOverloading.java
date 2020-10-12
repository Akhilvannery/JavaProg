package methods;

public class methodOverloading {

	
		// TODO Auto-generated method stub
		static int area(int x,int y) {
			//System.out.println("area of rectangle is :" );
			return x*y;
		}
		
		
		static int area(int r) {
			System.out.println("area of circle is ");
			return 3.14*r*r;
		}
		
		
		
	    public static void main(String[] args) {
	    	int a=area(3,4);
	    	//double b=area(2);
	    	
	    }
	
	

}
