
public class Sqrt {
	public int mySqrt(int x) {
	    if(x<0) return -1;  
	    if(x==0) return 0;  
	    int l=1;  
	    int r=x;
	    int m = 0;
	    while(l<=r)  
	    {  
	         m = (l+r)/2;  
	        if(m<=x/m && x/(m+1)<m+1)  
	            break; 
	        if(x/m<m)  
	        {  
	            r = m-1;  
	        }  
	        else  
	        {  
	            l = m+1;  
	        }  
	    }  
	    return m;  
    }
}
