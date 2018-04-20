package com.ajinkyad.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class CountriesListAdapter extends RecyclerView.Adapter<CountriesListAdapter.CountryNameItemHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<String> arrlstData;

    public CountriesListAdapter(Context context, List<String> arrlstData) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.arrlstData = arrlstData;
    }

    @Override
    public CountryNameItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CountryNameItemHolder(inflater.inflate(R.layout.custom_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final CountryNameItemHolder holder, final int position) {
        final String currentData = arrlstData.get(position);
        holder.txtvwTitle.setText(currentData);
    }

    @Override
    public int getItemCount() {
        return arrlstData.size();
    }


    class CountryNameItemHolder extends RecyclerView.ViewHolder {
        TextView txtvwTitle;

        CountryNameItemHolder(View view) {
            super(view);
            txtvwTitle = view.findViewById(R.id.txtvwTitle);
        }
    }


}
