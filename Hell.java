package com.practiceQuestions;
import java.util.*;
import java.util.stream.Collectors;
public class Hell {
    public static void main(String[] args) {
    HashMap<Integer,String>hs=new HashMap<Integer,String>();
    hs.put(1, "Kishore");
    hs.put(2,"Daya");
    hs.put(1, "Raja");
    List<Integer>hhm=new ArrayList<Integer>();
   for(Map.Entry<Integer, String> ms:hs.entrySet())
   {
	   int i=ms.getKey();
//	   String name=ms.getValue();
//	   System.out.println(i+" "+name);
	   hhm.add(i);   
   }
//   System.out.println(hs.containsKey(1));   
//   System.out.println(hs.get(2)); 
   Collections.sort(hhm);
   hhm.forEach(i ->System.out.println(i));
   
   
   
   String s="Kishore";
   List<String>lm=Arrays.asList(s);
   if(lm.stream().anyMatch(m ->m.equals("Kishore")))
   {
	   System.out.println("Matched:");
   }
   else
   {
	   System.out.println("Not Matched");
   }
 long sum= lm.stream().filter(l ->l.equalsIgnoreCase("Kishore")).count();
 System.out.println(sum+"=================");
   
   
   
  
   if(hhm.stream().allMatch(i -> i%2==0))
   {
	   System.out.println("all are EvenNumber");
   }
   else
   {
	   System.out.println("not all are Even Numbers");
   } 
   System.out.println("==========================");
   List<Integer>kp=Arrays.asList(5,1,2,8,9,10,1);
   kp.forEach(q ->System.out.println(q));
// kp.stream().distinct.collect(Collectors.toList());
   List<Integer> l=kp.stream().collect(Collectors.toList());
   System.out.println("+++++++++++++++++++++++++++++");
   l.forEach(q ->System.out.println(q));
   System.out.println("----------------------------");
   List<Integer> u=kp.stream().distinct().collect(Collectors.toList());
   System.out.println("+++++++++++++++++++++++++++++");
   u.forEach(q ->System.out.println(q));
   System.out.println("00000000000000000000000000000000");
   List<Integer> y=kp.stream().distinct().sorted().collect(Collectors.toList());
   System.out.println("+++++++++++++++++++++++++++++");
   y.forEach(q ->System.out.println(q));
   System.out.println("============================");
   System.out.println("Its Completed::::::::::::::::::");
   
   
   
    }
}
