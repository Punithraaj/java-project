package com.punith;

import java.util.AbstractList;

public class SimpleList extends AbstractList {
    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return super.remove(index);
    }

    @Override
    public Object set(int index, Object element) {
        return super.set(index, element);
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args){
        SimpleList letters = new SimpleList();
        for (int i=0; i<5; i++)
            letters.add((char)(97+i*2));
            System.out.println(letters);
//        if (letters.size() == 5 && letters.get(0) == 'a'){
//            System.out.println("Yay 1");
//        }
//
//        if (letters.set(1,'b') == 'c' && letters.get(1) == 'b'){
//            System.out.println("Yay 2");
//        }
//
//        letters.add(2,'c');
//        if (letters.size() == 6 && letters.get(2) == 'c' && letters.get(3)=='e'){
//            System.out.println("Yay 3");
//        }
//
//        if (letters.remove(3)=='e' && letters.size() == 5 && letters.get(3)=='g'){
//            System.out.println("Yay 4");
//        }
    }
}
