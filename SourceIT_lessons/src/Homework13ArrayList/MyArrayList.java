package Homework13ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Class description
 *
 * @author lobseer
 * @version 21.11.2016
 */
public class MyArrayList<T> {

    private T[] array;

    private int size;

    public MyArrayList() {
        array = (T[])new Object[10];
    }

    public MyArrayList(int size) {
        if(size<0) throw new NegativeArraySizeException("Size: "+size);
        array = (T[])new Object[(int)(size*1.5)];
    }

    public int size() {
        return size;
    }

    public int length() {
        return array.length;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void add(T value) {
        if(size == array.length) {
            T[] temp = (T[])new Object[(int)(size*1.5)];
            for(int i = 0; i < size; i++) temp[i] = array[i];
            array = temp;
        }
        array[size] = value;
        size++;
    }

    public void add(int index, T value) {
        if(index<0 || index>size) throw new ArrayIndexOutOfBoundsException("Size: "+size+"; Index: "+index);
        if(size == array.length) {
            T[] temp = (T[])new Object[(int)(size*1.5)];
            int i ;
            for(i=0; i < index; i++) temp[i] = array[i];
            temp[index]=value;
            for(int j = i+1; j<size+1;j++)
                temp[j] = array[j-1];
            array = temp;
        } else {
            for(int i = size; i>index ;i--) {
                array[i]=array[i-1];
            }
            array[index]=value;
        }
        size++;
    }

    public void addAll(Collection<? extends T> c) {
        for(Iterator<? extends T> iter = c.iterator();iter.hasNext();) {
            add(iter.next());
        }
    }

    public void addAll(int index, Collection<? extends T> c) {
        for(Iterator<? extends T> iter = c.iterator();iter.hasNext();index++) {
            add(index, iter.next());
        }
    }

    public void addAll(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void addAll(int index, T[] arr) {
        for(int i = 0; i < arr.length; i++, index++) {
            add(index, arr[i]);
        }
    }

    public boolean remove(T value) {
        int index = find(value);
        if(index == -1) return false;
        leftShift(index,1);
        return !isEmpty();
    }

    public boolean remove(int index) {
        leftShift(index,1);
        return !isEmpty();
    }

    public boolean removeAll(int fromIndex, int count) {
        leftShift(fromIndex, count);
        return !isEmpty();
    }

    public T minValue(Comparator<T> compr) {
        if(isEmpty()) return null;
        T min = array[0];
        for(int i=1;i<size;i++) {
            if(compr.compare(min, array[i])>0) min=array[i];
        }
        return min;
    }

    public T maxValue(Comparator<T> compr) {
        if(isEmpty()) return null;
        T max = array[0];
        for(int i=1;i<size;i++) {
            if(compr.compare(max, array[i])<0) max=array[i];
        }
        return max;
    }

    //Импровизированная версия
    public T agvValue(Comparator<T> compr) {
        if(isEmpty()) return null;
        T[] tempArr = Arrays.copyOf(array,size);
        Arrays.sort(tempArr,compr);
        T agv = tempArr[(int)(tempArr.length/2)];
        return agv;
    }

    public void clear() {
        for(int i=size-1; i>=0; i--, size--) array[i]=null;
    }

    public T get(int index) {
        if(isEmpty()) return null;
        if(index<0 || index>=size) throw new IndexOutOfBoundsException("Size: "+size+"; Index: "+index);
        T res = array[index];
        leftShift(index,1);
        return res;
    }

    public T peek(int index) {
        if(isEmpty()) return null;
        if(index<0 || index>=size) throw new IndexOutOfBoundsException("Size: "+size+"; Index: "+index);
        return  array[index];
    }

    public void set(int index, T value) {
        if(index<0 || index>=size) throw new IndexOutOfBoundsException("Size: "+size+"; Index: "+index);
        array[index]=value;
    }

    public T replace(int index, T value) {
        if(isEmpty()) return null;
        if(index<0 || index>=size) throw new IndexOutOfBoundsException("Size: "+size+"; Index: "+index);
        T res = array[index];
        array[index]=value;
        return res;
    }

    public int indexOf(T value) {
        return find(value);
    }

    public MyArrayList<T> subArray(int fromIndex, int count) {
        if(fromIndex<0 || count<0 || size<=fromIndex+count) throw new IndexOutOfBoundsException("Size:"+size+"; Index:"+fromIndex+"; Count:"+count);
        MyArrayList<T> result = new MyArrayList<>(count);
        for(int i = fromIndex; i<count; i++) {
            result.add(array[i]);
        }
        return result;
    }

    public boolean contains(T val) {
        return find(val)!=-1;
    }

    public boolean containsAll(Collection c) {
        for(Iterator<T> iter = c.iterator();iter.hasNext();) {
            if(find(iter.next())==-1) return false;
        }
        return true;
    }

    private void leftShift(int index, int count) {
        if(index<0 || count<0 || index+count>size) throw new IndexOutOfBoundsException("Size:"+size+"; Index:"+index+"; Count:"+count);
        size-=count;
        for(int i=index;i<size;i++) {
            array[i]=array[i+count];
        }
        for (int i=size; i<size+count; i++)
            array[i]=null;
    }

    private int find(T value) {
        if(isEmpty()) return -1;
        for (int i=0; i<size; i++) {
            if (value == array[i] || value.equals(array[i])) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if(!isEmpty()) {
            for (int i = 0; i < size - 1; i++) sb.append(array[i] + ", ");
            sb.append(array[size - 1] + "]");
        } else sb.append(']');
        return sb.toString();
    }
}
