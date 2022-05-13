package com.example.opsc_7311_poe;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ItemAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] itemName;
    String[] itemDescription;



    public ItemAdapter(Context context, String[] itemName, int[] images, String[] itemDescription) {
        super(context, R.layout.list_single, R.id.textView1, itemName);
        this.context = context;
        this.images = images;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View singleItem = convertView;

        ItemViewHolder holder = null;

        if(singleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.list_single, parent, false);

            holder = new ItemViewHolder(singleItem);

            singleItem.setTag(holder);
        }
        // If singleItem is not null then we'll be recycling
        else{
            // Get the stored holder object
            holder = (ItemViewHolder) singleItem.getTag();
        }
        // Set the values for your views in your item by accessing them through the holder
        holder.itemImage.setImageResource(images[position]);
        holder.itemTitle.setText(itemName[position]);
        holder.itemDescription.setText(itemDescription[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You clicked:"+ itemName[position], Toast.LENGTH_SHORT).show();
                //Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                //context.startActivity(openLinksIntent);
            }
        });
        return singleItem;
    }
}