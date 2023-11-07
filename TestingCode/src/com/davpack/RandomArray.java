package com.davpack;

import java.util.ArrayList;
import java.util.List;

public class RandomArray {
    public List<Integer> randomArray(int size){
        List<Integer> array = new ArrayList<>(size);
        int min = -1000000;
        int max = 1000000;
        for(int i=0; i< size; i++){
                array.add(i, (int)Math.floor(Math.random() *(max - min + 1) + min));
                }
        return array;
    }

}
