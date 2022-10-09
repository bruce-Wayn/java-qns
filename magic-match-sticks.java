//change the class name to make it work

public class practice{
	public static void main(String args[]) {
//		praktice prak = new praktice();
		
		//magic match-stick problem
		/*in this problem set we are given n number of match boxes, 
		 * you need to add matches in a match that is 
		 * the n number of matches in each box,
		 * but the catch is instead of adding the matches, 
		 * you need to subtract the matches pair that you will be inserting in place 
		 * of every new match stick until there is only last box left with final match stick score
		 * eg: 1st match box: 4match sticks: 1,2,3,4 match numbers
		 * 2nd time: 2 match sticks : (1-2), (3-4)=> 1, 1
		 * last time: (1-1) => 0
		 * 
		 * i know i cannot explain the problem correctly in english, but i will be able to explain it to you in hindi v well
		 * also if you can understand the code, you will understand the question
		 * this took me one day to solve, many minor mistakes i did
		 * this is a geeks for geeks interview question
		 * question name magical matchsticks*/
		
		int a[] = {1,2,3,4,5,6};
		int num;
        int count;
        int n = a.length;
        
	    do {
	
	    	num=0;
	    	count=0;
	    	
	        if(n==1){
	            System.out.println(a[0]+"last");;
	        }
	        
	        else if(n>1){
	        	
	            
	            if(n%2==0){
	            	n=n/2;
	            	
	                for(int i = 0; i<((n)) ; i++){
	                	
	                    a[i] = a[num]-a[num+1];
	                    
	                    if(a[i]<0){
	                        a[i] = a[i]*(-1);
	                        System.out.print(a[i]+" "+a[i + 1]);
	                    }
	                    
	                    System.out.println(" a ");
	                    
	                    num = num + 2;
	                    count++;
	                    
	                }
	            }
	            else if(n%2==1){
	            	n = (n/2) +1;
	                for(int i = 0; i<(n); i++){
	                    a[i] = a[num]-a[num+1];
	                    if(a[i]<0){
	                        a[i] = a[i]*(-1);
	                        System.out.print(a[i]+" "+a[i + 1]);
	                    }
	                    System.out.println("b ");
	                    num = num + 2;
	                    count++;
	                }
	                
	            }
	        }
	        System.out.println(n);
	        for(int j = 0; j<a.length;j++) {
	        	System.out.print(a[j]);
	        }
	        System.out.println(" ");
	            
	    }while(n>1); 
	    
	    
	    for(int k = 0; k<a.length;k++) {
        	System.out.print(a[k]);
        }
        System.out.println(" ");
        
        
	}
}
