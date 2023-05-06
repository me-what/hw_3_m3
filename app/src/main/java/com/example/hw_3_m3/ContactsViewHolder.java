package com.example.hw_3_m3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView, nameTextViewTwo;
    ImageView icon;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Contact contact) {
        onBindTwo();
        icon.setImageResource(contact.getIcon());
        nameTextView.setText(contact.getNameTextView());
        nameTextViewTwo.setText(contact.getNameTextViewTwo());
    }

    public void onBindTwo() {
        nameTextView = itemView.findViewById(R.id.textViewName);
        nameTextViewTwo = itemView.findViewById(R.id.textViewNameTwo);
        icon = itemView.findViewById(R.id.imageView);
    }
}


