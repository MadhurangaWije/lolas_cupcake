package me.kithumini.lolascupcake;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CakeListAdapter extends RecyclerView.Adapter<CakeItemViewHolder> {

    private List<Cake> cakeList;

    public CakeListAdapter(List<Cake> cakeList) {
        this.cakeList = cakeList;
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.cup_cake_card_layout;
    }

    @NonNull
    @Override
    public CakeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new CakeItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CakeItemViewHolder holder, int position) {
        holder.getTitle().setText(cakeList.get(position).getTitle());
        holder.getPrice().setText(String.valueOf(cakeList.get(position).getPrice()));
        holder.getDescription().setText(cakeList.get(position).getDescription());
//        holder.getImage().setImageDrawable(cakeList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return cakeList.size();
    }
}
