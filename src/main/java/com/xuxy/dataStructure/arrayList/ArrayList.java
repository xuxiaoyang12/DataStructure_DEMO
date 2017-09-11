package com.xuxy.dataStructure.arrayList;

import com.xuxy.dataStructure.List;

/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description:
 */
public class ArrayList implements List {

    private Object[] elementDate = new Object[8];
    private int size = 0;

    public void  add(Object o){
        //判断当前的数组长度需不需要扩充
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
        //添加数据
        elementDate[size] = o;
        //长度加一
        size++;
    }

    public void add(int index, Object o) {

    }

    public Object get(int index) {
        return elementDate[index];
    }

    public Object remove(int index) {
        //删除数据  判断是否需要往前移动数组
        if(index < size-1){
            int j = 0;
            Object[] objects = new Object[elementDate.length];
            for(int i = 0; i < elementDate.length; i++){

                if(index == i){
                    j--;
                }
                objects[i] = elementDate[j++];

            }
        }else if(index > size-1){
            try {
                throw new Exception("不存在此索引值");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public void set(int index, Object o) {

    }
}
