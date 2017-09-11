package com.xuxy.dataStructure;


/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description: 实现arraylist集合
 */
public class ArrayList {

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
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("集合数组中元素的数量：" + list.size());
    }
}
