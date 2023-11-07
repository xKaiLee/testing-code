package com.davpack;

import java.util.ArrayList;
import java.util.List;

public class Main extends Solution{

    public static void main(String[] args) throws Exception {
        List<Integer> l1 = null;
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        autoComplete ac = new autoComplete();
        l2.add(1); l2.add(3); l2.add(5); l2.add(7); l2.add(10000000);
        RandomArray RA = new RandomArray();

        Solution sol = new Solution();
        System.out.println(sol.solution(l1));
        System.out.println(sol.solution(l2));
        System.out.println(sol.solution(l4));



    }
}
