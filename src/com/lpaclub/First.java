package com.lpaclub;

public class First {

	public static void main(String[] args) {
		int fp=1,lp=8,ls=1,rs=8;
        while(fp!=lp)
        {
                    if(ls<rs)
                    {
                        fp++;
                        ls+=fp;
                    }
            else if(rs<ls)
            {
                lp--;
                rs+=lp;
            }
            
            else break;
                    
        }
        if(ls==rs)
        {
            if(lp-fp==2||lp-fp==0)
            	System.out.println(fp+1);
            else System.out.println(-1);
            
        }

        else
        {
        	System.out.println(-1);
        	System.out.println(-1);
        	System.out.println(-1);
        }
       
	}

}
