package com.axel.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FelinAdapter extends
        RecyclerView.Adapter<FelinAdapter.FelinViewHolder> {

    private List<Felin> felinList;

    public FelinAdapter(List<Felin> felinList) {
        this.felinList = felinList;
    }

    @NonNull
    @Override
    public FelinAdapter.FelinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.felin_item, parent, false);

        return new FelinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FelinAdapter.FelinViewHolder holder, int position) {
        Felin felin = felinList.get(position);
        holder.textView.setText(felin.getNom());
        holder.imageView.setImageResource(felin.getImage());
    }

    @Override
    public int getItemCount() {
        return felinList.size();
    }

    public class FelinViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public FelinViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.felinImage);
            textView = itemView.findViewById(R.id.felinText);
        }
    }
}
