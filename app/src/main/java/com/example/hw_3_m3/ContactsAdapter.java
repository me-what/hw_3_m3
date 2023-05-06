package com.example.hw_3_m3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    ArrayList<Contact> arraylist;

    public ContactsAdapter(ArrayList<Contact> arrayList) {
        arraylist = arrayList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_just, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.onBind(arraylist.get(position));
    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }
}

