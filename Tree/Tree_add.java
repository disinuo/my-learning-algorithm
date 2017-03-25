package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by disinuo on 17/2/19.
 */
public class Tree {
    public Tree left;
    public Tree right;
    public int value;
    public Tree(int value){
        this.value=value;
    }
    public void add(int ele){
        if(ele>value){
            if(right==null){
                right=new Tree(ele);
            }else {
                right.add(ele);
            }
        }else if(ele<value){
            if(left==null){
                left=new Tree(ele);
            }else {
                left.add(ele);
            }
        }else {
            //Do nothing
        }
    }

    public void preOrder(){//先序遍历
        System.out.print(value+"  ");
        if(left!=null) left.preOrder();
        if(right!=null) right.preOrder();
    }
}
