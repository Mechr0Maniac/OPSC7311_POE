package com.example.opsc_7311_poe;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemViewHolder {
    // Declare the object references for our views
    ImageView itemImage;
    TextView itemTitle;
    TextView itemDescription;
    // Get the handles by calling findViewById() on View object inside the constructor
    ItemViewHolder(View v)
    {
        itemImage = v.findViewById(R.id.imageView);
        itemTitle = v.findViewById(R.id.textView1);
        itemDescription = v.findViewById(R.id.textView2);
}   }
