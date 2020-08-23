package Week_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*
分组异味字符串
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if ( strs.length == 0) { return  new ArrayList<>(); }

        HashMap<String,List<String>> parmMap =  new HashMap<String,List<String>>();
        for (String str1: strs) {
            char[] cr  = str1.toCharArray();
            Arrays.sort(cr);
            String key =  String.valueOf(cr);
            if (!parmMap.containsKey(key)) { parmMap.put(key,new ArrayList<>());}
            parmMap.get(key).add(str1);
        }
        return  new ArrayList(parmMap.values());


    }
}
