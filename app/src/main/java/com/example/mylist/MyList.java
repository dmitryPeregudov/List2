package com.example.mylist;

import android.util.Log;

public class MyList {

    private ListElement head;
    private ListElement tail;
    int count;


    String TAG = "MyLog";

    public void add(int data) {
        ListElement a = new
                ListElement(data);

        if (head == null) {
            head = a;
            tail = a;
            Log.d(TAG, "if " + tail.data);
            count++;
        } else {
            tail.next = a;
            tail = a;
            Log.d(TAG, "ELSE " + tail.data);
           ++ count;
        }

    }


    public void sort() {

        int []a=new int[count];
        ListElement t = head;
        int i=0;

        while (t != null) {
                a[i]=t.data;
                i++;
                t = t.next;

            }
                 bubbleSort(a);
                    t=head;
                    for (int j=0;j<a.length;j++){
                        t.data=a[j];
                        if (t.next==null)break;
                        t=t.next;
                    }
    }

    public int recursionSort(ListElement e) {
        int a=0;

        if (e.next!=null) {


            if (tail.data<e.data){
                a = e.data;
            e.data = tail.data;
            tail.data = a;}

            if (e.data==recursionSort(e.next)){recursionSort(e.next);}
if (e.data<head.data){
    a = e.data;
    e.data = head.data;
    head.data = a;
}
            if (e.data > recursionSort(e.next)) {
                                a = e.data;
                e.data = e.next.data;
                e.next.data = a;
            }

        }


return e.data;
    }

    public String print() {
        String result = "Null";

        ListElement t = head;
        if (t != null) {
            result = "";
            while (t != null) {
                result += t.data + " ";
                Log.d(TAG, "!!!! " + t.data);
                t = t.next;

            }
        }
        return result;
    }


    private static void bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

public ListElement getFirstListElement(){
      return head;
}
}
