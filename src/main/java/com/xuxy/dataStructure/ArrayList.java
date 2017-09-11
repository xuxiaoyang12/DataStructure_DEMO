package com.xuxy.dataStructure;



/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description: 实现arraylist集合
 */
public class ArrayList {

    public static void main(String[] args){
        System.out.println("实现arrayList集合");
    //测试arraylist
        java.util.List lsits  = new java.util.ArrayList();

       List list = new com.xuxy.dataStructure.arrayList.ArrayList();
       StringBuffer stringBuffer = new StringBuffer("daxiao");
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
       list.add(stringBuffer);
      for(int i = 0 ; i < list.size() ; i++){
          System.out.println(list.get(i));
      }
      System.out.println(list.size());
    }
}
