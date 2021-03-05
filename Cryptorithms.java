/*    Crypotorithms or Alphabetical coding where alphabets is assigned a code so that the problem is to be solved using given summation.



      S A T R U N 
    + U R A N U S
    ---------------
    P L A N E T S
    
    
    Find the unique numrics code(0 to 9) of alphabets to satisfy the above sum. 
 */


public class CryptoArithmatic {
    public static void main(String[] args)
    {
        int T = 0 , A = 0 , U = 0 , R = 0, N = 0 , S = 0 , P = 0 , E = 0 , L = 0;
        boolean keepGoing = true;

        while (keepGoing)
        {
        for (S = 0 ;  S < 10 ; S++)
        {
            for (A = 0 ; A < 10 ; A++)
            {
                for (T = 0 ; T < 10 ; T++)
                {
                    for (U = 0 ; U < 10 ; U++)
                    {
                        for(R=0;R<10;R++)
                        {
                            for(N=0;N <10;N++)
                            {
                                for(P=0;P <10;P++)
                                {
                                    for(L=0;L <10;L++)
                                    {
                                        for(E=0;E <10;E++)
                                        {
                                            if (S==A || S==T || S==U || S==R || S==N || S==P || S==L || S==E ||
                                                    A== T || A==U ||A==R || A==N || A==P ||A==L || A==E ||
                                                     T==U || T==R || T==N || T==P || T==L || T==E ||
                                                    U == R || U==N || U==P || U==L || U==E ||
                                                    R==N || R==P || R==L || R==E ||
                                                    N==P || N==L || N==E ||
                                                    P==L || P==E ||
                                                    L == E)
                                            {
                                                keepGoing = true;
                                                continue;
                                            }

                                            else if (100000*S + 10000*A + 1000*T + 100*U + 10*R + N +100000*U + 10000*R + 1000*A + 100*N + 10*U + S 
                                                    == 1000000*P +100000*L + 10000*A + 1000*N + 100*E + 10*T + S)
                                            {
                                                keepGoing = false;
                                                System.out.println("S = "+S);
                                                System.out.println("A = "+A);
                                                System.out.println("U = "+U);
                                                System.out.println("R = "+R);
                                                System.out.println("N = "+N);
                                                System.out.println("P = "+P);
                                                System.out.println("T = "+T);
                                                System.out.println("L = "+L);
                                                System.out.println("E = "+E);
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        }
    }
}

