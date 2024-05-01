package com.example.recyler_viwes;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] captions;
    private int[] imageIds;

    public CaptionedImagesAdapter(String[] captions, int[] ids) {
    }


    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardimage, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CaptionedImagesAdapter.ViewHolder holder, int position) {
        CardView card = holder.cardView;
        ImageView V = (ImageView) card.findViewById(R.id.image);
        Drawable d = ContextCompat.getDrawable(card.getContext(), imageIds[position]);
        V.setImageDrawable(d);

        TextView txt = card.findViewById(R.id.txtName);
        txt.setText(captions[position]);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView = cardView;
        }
    }
}
