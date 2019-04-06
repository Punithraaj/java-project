package com.punith;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class OrderingStringByFrequenceandlength {

    public static void main(String args[]){

        String str = "India is a great country and I will work towards making our country the better India";
        HashMap<String,Integer> map = new HashMap<>();
//        SortedMap<Integer,List<String>> uniquemap =  new TreeMap<>();
        String Str1[] =  str.split(" ");
        int max = 1;
        for(int i =0;i<Str1.length;i++){
            if(map.containsKey(Str1[i])) {
                map.replace(Str1[i], map.get(Str1[i]) + 1); }
            else {
                map.put(Str1[i],1);
            }
        }

        //getting all the keys whose having common values and storing into hash map

        Map<Integer, List<String>> reverseMap = new HashMap<>(
                map.entrySet().stream()
                        .collect(Collectors.groupingBy(Map.Entry::getValue)).values().stream()
                        .collect(Collectors.toMap(
                                item -> item.get(0).getValue(),
                                item -> new ArrayList<>(
                                        item.stream()
                                                .map(Map.Entry::getKey)
                                                .collect(Collectors.toList())
                                ))
                        ));

        //reverse the map based Keys in decending order
        List<Entry<Integer, List<String>>> sortedEntries = new ArrayList<Entry<Integer, List<String>>>(reverseMap.entrySet());

        Collections.sort(sortedEntries, new Comparator<Entry<Integer, List<String>>>() {

            public int compare(Entry<Integer, List<String>> e1, Entry<Integer, List<String>> e2) {
                return e2.getKey().compareTo(e1.getKey());
            }
        });

        //Listing all the unique values based on length
        List<String> uniqueString = new ArrayList<>();
        for(Map.Entry mapentry:sortedEntries){
            List<String> newList = (List)mapentry.getValue();
            Collections.sort(newList, Comparator.comparingInt(String::length).reversed());
            uniqueString.addAll(newList);
        }

        System.out.print(uniqueString);
    }
}
