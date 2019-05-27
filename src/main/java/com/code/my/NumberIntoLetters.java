package com.code.my;

/**
 * stage 1
 *  convert the digits from 0 to 9 into letters
 */
public class NumberIntoLetters {
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
            if (param[i]>9 || param[i]<0) {
                System.out.println("Element Of  The Array Input Must Be  Between 0 then 9");
                return;
            }
        }

        StringBuffer combine=new StringBuffer();
        if (param.length == 1) {
            char[] letterArray = letterCache[param[0]];
            for (int x = 0; x < letterArray.length; x++) {
                combine.append(letterArray[x] + "").append(" ");
            }
        } else {
            for (int j=0;j<param.length-1;j++) {
                int ele =param[j];
                char[] letterArray =  letterCache[ele];
                for (int y=j+1;y<param.length;y++) {
                    char[] nextLetterArray =  letterCache[param[y]];
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
