//print 4 digit number,which are perfect sqaure and all digits in that are even

public class SquareRootAndEven {
    static boolean SqaureEven(int n)
    {
        double sq = Math.sqrt(n);
        if(sq-Math.floor(sq)!=0 )
            return false;
        while(n>0)
        {
            if((n%10)%2!=0)
                return false;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i = 1000;i<10000;i+=2)
            if(SqaureEven(i))
                System.out.print(i+" ");
    }
}
