package berak_statement_exp;

public class Berak_statement_exp 
{
    public static void main(String[] args) 
    {
        int i=7;
        loop1:
        while(i<20)
        {
            if(i==10)
            {
                break loop1;
            }
            System.out.println("i= "+i);
            i++;
        }
        System.out.println("Out of loop");
    }
    
}
