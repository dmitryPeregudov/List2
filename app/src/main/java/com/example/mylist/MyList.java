package com.example.mylist;

import android.util.Log;

public class MyList {

    private ListElement head;
    private ListElement tail;
    int count;
    int recursionCount;

    String TAG = "MyLog";

    public void add(int data) {
        ListElement a = new
                ListElement(data);

        if (head == null) {
            head = a;
            tail = a;


            count++;
        } else {
            tail.next = a;
            tail = a;
            recursionCount=count;
           ++ count;
        }

    }


    public void sort() {
       ListElement a=head;
       int buffer[]=new int [count];
       while (a!=null){
           for (int i=0;i<count;i++){
               buffer[i]=a.data;
               a=a.next;
           }
       }
       a=head;

       for (int j=count-1;j>=0;j--) {
           a.data = buffer[j];
           if (a.next==null)break;
           a=a.next;

       }

    }

    public int recursionSort(ListElement e) {

if (e.next==null){return e.data;}
int a=e.data;
e.data=recursionSort(e.next);
e.next.data=a;


     return e.data; }
     public void recurs (ListElement e){
        while (e.next!=null){
            recursionSort(e);
            e=e.next;
        }
     }

    public String print() {
        String result = "Null";

        ListElement t = head;
        if (t != null) {
            result = "";
            while (t != null) {
                result += t.data + " ";
                      t = t.next;

            }
        }
        return result;
    }




public ListElement getFirstListElement(){
      return head;
}
}
