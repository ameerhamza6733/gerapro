package com.example.ameerhamza.gerapro.adupters;

/**
 * Created by AmeerHamza on 1/13/2018.
 */
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ameerhamza.gerapro.R;
import com.example.ameerhamza.gerapro.activitys.detailsActivty;
import com.example.ameerhamza.gerapro.model.item;

import java.util.List;

public class viewAllTitalAdupter extends RecyclerView.Adapter<viewAllTitalAdupter.ViewHolder> {
    private static final String TAG = "viewAllTitalAdupter";

    private static List<item> mDataSet;

    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleName;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                    Intent itemDetailItent =  new Intent(v.getContext(),detailsActivty.class);
                    itemDetailItent.putExtra(detailsActivty.DETAIL_INTENT_KEY,mDataSet.get(getAdapterPosition()));
                    v.getContext().startActivity(itemDetailItent);
                }
            });
            titleName = (TextView) v.findViewById(R.id.titleName);
        }

        public TextView getTitleName() {
            return titleName;
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public viewAllTitalAdupter(List dataSet) {
        mDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.each_tital_item, viewGroup, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTitleName().setText(mDataSet.get(viewHolder.getAdapterPosition()).getName());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}

