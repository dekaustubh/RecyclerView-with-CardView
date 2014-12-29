package com.recyclerviewwithcards.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.recyclerviewwithcards.R;


/**
 * Created by kaustubh on 29/12/14.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "###RecyclerViewAdapter###";
    private String[] mHeaderSet;
    private String[] mDescriptionSet;

    public RecyclerViewAdapter(final String[] headerSet, final String[] descriptionSet){
        mHeaderSet = headerSet;
        mDescriptionSet = descriptionSet;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }


    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder viewHolder, int i) {
        final TextView header = (TextView) viewHolder.cardView.findViewById(R.id.textview);
        final TextView description = (TextView) viewHolder.cardView.findViewById(R.id.desc);
        header.setText(mHeaderSet[i]);
        description.setText(mDescriptionSet[i]);
    }

    @Override
    public int getItemCount() {
        return mHeaderSet.length;
    }
}
