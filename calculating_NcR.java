package fundamentals.lecture8FunctionsAndScope;

public class calculating_NcR {
	public static int fact(int n) {
		int fact  =1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static int ncR(int n ,int r) {
		int factn = fact(n);
		int factr =fact(r);
		int factn_r=fact(n-r);
		int result = factn/(factr*factn_r);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,r=6;
		int ans = ncR(n,r);
		System.out.print(ans);
//	    int factn=1,factr=1,factnr=1;
//	    for(int i=2;i<=n;i++)
//	    {
//	        factn*=i;
//	        if(i<=r)
//	            factr*=i;
//	        if(i<=n-r)
//	            factnr*=i;
//	    }
//	    int ncr=factn/(factr*factnr);
//	    System.out.print(ncr);
	    

	}

}
//	public static void func(int a, int b){
//	    System.out.println(a + b);
//	    }
//
//	    public static void main(String[] args) {
//	    int a = 7;
//	    func(a, 12);
//	    }
//}