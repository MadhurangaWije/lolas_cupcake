package me.kithumini.lolascupcake;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CakeItemViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView price;
    private TextView description;
    private ImageView image;

    public CakeItemViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.item_title_text_view);
        price = itemView.findViewById(R.id.item_title_price_textview);
        description = itemView.findViewById(R.id.item_description_textview);
        image = itemView.findViewById(R.id.item_image_view);
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getPrice() {
        return price;
    }

    public TextView getDescription() {
        return description;
    }

    public ImageView getImage() {
        return image;
    }
}
