public static void main(String[] args) {
           
    for ( i=1; i<=n; i++)
    {
        if(i<=n/2)
        {
            for (int k=1; k<(n/2)-i+2; k++)
            {
                System.out.print("-");
            }
            System.out.print("*");
        
            for (int k=1; k<(i*2)-2; k++)
            {
                System.out.print(" ");
            }
            
            if(i != 1) {
                System.out.print("*");
            }
            
            for (int k=1; k<(n/2)-i+2; k++)
            {
                System.out.print("-");
            }
        }
        else
        {
            for (int k=1; k<i-(n/2); k++)
            {
                System.out.print("-");
            }
            
            System.out.print("*");
        
            for (int k=1; k<(n*2)-(i*2); k++)
            {
                System.out.print(" ");
            }
            
            if(i != n) {
                System.out.print("*");
            }
            
            for (int k=1; k<i-(n/2); k++)
            {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    
}


