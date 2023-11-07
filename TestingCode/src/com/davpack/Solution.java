package com.davpack;

import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(List<Integer> a) throws Exception {
        int b = 100000;

        if(a == null){
            throw new NotInitializedException("List is not initalized");
        }

        else if (a.isEmpty()){
            throw new InvalidSizeException("List is empty");
        }

        else if(a.size() >= 10000){
            throw new InvalidSizeException("List is too long");
        }

        for(int j = 0; j<a.size(); j++){
            if(a.get(j) > 1000000 || a.get(j) <-1000000){
                throw new InvalidSizeException("Element in list is too large");
            }
        }

        for(int l = 0; l<a.size(); l++){
            System.out.println(a.get(l));
        }


        Collections.sort(a);
        int i = 1;
        while (i <= a.size()) {
            if (a.contains(i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }
}



