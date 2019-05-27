package com.code.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * stage 2
 *  support converting the digits from 0 to 99 into letters
 */
public class NumberIntoLettersImprove {
    private static final char[][] letterCache = new char[][]{
            {},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}
            ,{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'},{'*'},{'#'}
    };

    public static void numberIntoLettersWithArray(int[] param) {
        if (param ==null || param.length<=0) {
            System.out.println("The Input Must Be  Not  Null Or Empty");
            return;
        }

        for (int i=0;i<param.length;i++) {
            if (param[i]>99 || param[i]<0) {
                System.out.println("Element Of  The Array Input Must Be  Between 0 then 9");
                return;
            }
        }
        List<Integer> target=new ArrayList<>();
        for (int x=0;x<param.length;x++) {
            if (param[x]<=9) {
                target.add(param[x]);
            }else{
                int ten =param[x]/10;
                int mod =param[x]%10;
                target.add(ten);
                target.add(mod);
            }
        }
        Integer[] targetArray=new Integer[target.size()];
        target.toArray(targetArray);
        StringBuffer combine=new StringBuffer();
        if (targetArray.length == 1) {
            char[] letterArray = letterCache[targetArray[0]];
            for (int x = 0; x < letterArray.length; x++) {
                combine.append(letterArray[x] + "").append(" ");
            }
        } else {
            for (int j=0;j<targetArray.length-1;j++) {
                int ele =targetArray[j];
                char[] letterArray =  letterCache[ele];
                for (int y=j+1;y<targetArray.length;y++) {
                    char[] nextLetterArray =  letterCache[targetArray[y]];
                    for (int k=0;k<letterArray.length;k++) {
                        for (int l=0;l<nextLetterArray.length;l++) {
                            combine.append(letterArray[k]+""+nextLetterArray[l]).append(" ");
                        }
                    }
                }

            }
        }

        if (combine.toString().equals("")) {
            System.out.println("No letter Mapping");
        } else {
            System.out.println(combine.toString());
        }

    }
}
