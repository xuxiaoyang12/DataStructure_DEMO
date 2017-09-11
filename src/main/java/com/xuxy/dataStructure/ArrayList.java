package com.xuxy.dataStructure;


/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description: arraylist集合测试类
 */
public class ArrayList {

    //测试入口 arraylist
    public static void main(String[] args) {
        System.out.println("实现arrayList集合");
        //测试arraylist
        List list = new com.xuxy.dataStructure.arrayList.ArrayList();
        String str = "测试数据";
        //遍历元素 添加默认测试数据
        for (int i = 0; i < 13; i++) {
            list.add(str + i);
        }
        //移除指定下标元素
        //list.remove(1);
        //测试添加通过索引添加新元素
        list.add(1,"新元素");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("集合数组中元素的数量：" + list.size());

    }
}
