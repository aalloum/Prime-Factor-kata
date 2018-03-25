import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> generate(int input){
      List<Integer> primes =  new ArrayList<Integer>();

      //*************** ETAPE 1 **************
     /* if(input>1) {
          //   primes.add(2);
          primes.add(input);
      }
      */
     //************** END ETAPE 1 *************

     //************** ETAPE 2 ****************
     /* if(input>1){
          if(input % 2 == 0){
              primes.add(2);
              input /=2;
          }
          if(input>1)
              primes.add(input);
      }
      */
      //************** END ETAPE 2 ****************

      //************** ETAPE 3 ********************
      /*  if(input>1){
            while(input % 2 == 0){
                primes.add(2);
                input /=2;
            }
            if(input>1)
                primes.add(input);
        }
       */
      //*************** END ETAPE 3 *****************

        //************** ETAPE 4 ********************
        /* int candidate = 2;
        if(input>1){
            while(input % candidate == 0){
                primes.add(candidate);
                input /=candidate;
            }
        }
            if(input>1)
                primes.add(input);
            return primes;
          */
        //*************** END ETAPE 4 *******************

        //************** ETAPE 5 ************************
      /*  int candidate = 2;
        while(input>1){
            while(input % candidate == 0){
                primes.add(candidate);
                input /=candidate;
            }
            candidate++;
        }
        return primes;
        */
        //*************** END ETAPE 5 *******************

        //************** ETAPE 6 ************************
        for( int candidate=2; input>1 ; candidate++)
            for(; input % candidate == 0; input /=candidate)
                primes.add(candidate);
        return primes;
    }
}
