package com.xuxy.dataStructure;

/**
 * Created by Intellij IDEA
 *
 * @author:xuxiaoyang
 * @Date: ${date}  ${time}
 * @Description:
 */
public interface List {


    /**
     * @param o
     */
    public void add(Object o);
    public void add(int index,Object o);

    public Object get(int index);
    public Object remove(int index);

    public int size();
    public void set(int index,Object o);
}
