package com.davpack;

import java.util.ArrayList;
import java.util.List;

public class autoComplete {
    public List<Integer> autoComplete(int size){
        List<Integer> array = new ArrayList<>(size);
        for(int i=0; i< size; i++){
            array.add(i);
        }
        return array;
    }
}
