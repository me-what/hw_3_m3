package com.example.hw_3_m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> arrayList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList();
        recyclerMethod();
        sortingNumbers();
        System.out.println("");
        listEvenAndOddNumbers();
    }

    private void contactList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Contact("ELDAR", "ELDAR"));
        arrayList.add(new Contact("ZULFIA", "ZULFIA"));
        arrayList.add(new Contact("VARIS", "VARIS"));
        arrayList.add(new Contact("KENCH", "KENCH"));
        arrayList.add(new Contact("SULTAN", "SULTAN"));
        arrayList.add(new Contact("BAYAS", "BAYAS"));
        arrayList.add(new Contact("RYSYA", "RYSYA"));
    }

    private void recyclerMethod() {
        ContactsAdapter adapter = new ContactsAdapter(arrayList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private void sortingNumbers() {
        int[] numbers = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("----------------------------");
    }

    private void listEvenAndOddNumbers() {
        int[] numbers = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        List<Integer> oddNumbers = new ArrayList<Integer>();
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i:numbers) {
            if ((i & 1) == 1){
                oddNumbers.add(i);
            }else{
                evenNumbers.add(i);
            }
        }
        Collections.sort(oddNumbers);
        Collections.sort(evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("----------------------------");
    }
}