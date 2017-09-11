package com.xuxy.dataStructure.arrayList;

import com.xuxy.dataStructure.List;

/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description: 实现 arraylist集合 其中超出下标设置为不提示
 */
public class ArrayList implements List {

    //基于数组实现
    private Object[] elementDate = new Object[8];
    //记录集合长度
    private int size = 0;

    //集合中添加元素
    public void  add(Object o){
        //判断当前的数组长度需不需要扩充
        if(size > elementDate.length-1){
         //扩充数组 扩充当前数组的一半
            Object[] newData = new Object[elementDate.length+elementDate.length/2];
            //复制数组
            for(int i =0; i < elementDate.length; i++){
                newData[i] = elementDate[i];
            }
            //新数组赋值
            elementDate = newData;
        }
        //添加数据 并怎加集合长度
        elementDate[size++] = o;
    }

    //通过索引添加元素  会涉及到数组的重排
    public void add(int index, Object o) {
        //判断当前的数组长度需不需要扩充
        //TODO 如果下标超出的比较多这里先不考虑
        if(size > elementDate.length-1){
            //扩充数组
            Object[] newData = new Object[elementDate.length+elementDate.length/2];
            //复制数组
            for(int i =0; i < elementDate.length; i++){
                newData[i] = elementDate[i];
            }
            //新数组赋值
            elementDate = newData;
        }
        //添加并且重排索引后的数组
        //获取指定索引的数组
        Object temp = o;//添加的新元素
        for(int i = index ; i < size + 1 ; i ++){
            //新数据添加到数组 数据复制到下一个
            Object oldEmement = elementDate[i];//获取这个位置原本的值
            elementDate[i] = temp;//赋予新添加的值
            temp = oldEmement;//将更新掉的值赋予下一个信息进行循环
        }
        size++;

    }
    //获取指定索引位置的元素
    public Object get(int index) {
        //判断索引是否超出集合长度
        if(index < size){
            return elementDate[index];
        }
       return null;
    }
    //移除指定索引位置的元素
    public Object remove(int index) {
        //判断下标是否超出长度
        if(index < size){
            Object removeElement = null;
            //删除数据  判断是否需要往前移动数组
            if(index < size-1){
                int j = 0;
                //创建一个新的数组
                Object[] objects = new Object[elementDate.length];
                //遍历数组将没有删除的元素存放到新的数组中去
                for(int i = 0; i < elementDate.length; i++){
                    //判断要删除的下标元素
                    if(index == i){
                        removeElement = elementDate[j];
                        j++;
                    }
                    if(j>= elementDate.length){

                    }else{
                        objects[i] = elementDate[j++];
                    }


                }
                size--;
                //新数组赋值到全局中
                elementDate = objects;
            }else if(index > size-1){
                try {
                    throw new Exception("不存在此索引值");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return removeElement;
        }
        return null;

    }
    //返回集合中元素的个数
    public int size() {
        return this.size;
    }
    //指定索引位置的元素更新
    public void set(int index, Object o) {
        if(index < size){
            //通过下标更新元素值
            elementDate[index] = o;
        }
    }
}
