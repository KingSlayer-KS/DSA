package Recursion.Recursion_advance;

public class Number_of_ways_one_can_invite_N_ppl_to_a_party {
    public static int call_ppl(int n) {
        if (n <= 1) {
            return 1;
        }

        //single_calling(piche n-1 log reh jae ge)
        int way_single=call_ppl(n-1);

        //pair_calling(piche n-2 log log reh jae ge)
        int way_pair=(n-1)*call_ppl(n-2);

        return way_pair+way_single;
    }

    public static void main(String[] args) {
        int n= 4;
        System.out.println(call_ppl(n));
        
    }
}
