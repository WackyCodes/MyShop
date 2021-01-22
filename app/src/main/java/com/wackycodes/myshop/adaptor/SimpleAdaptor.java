package com.wackycodes.myshop.adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wackycodes.myshop.R;

/**
 * Created by Shailendra (WackyCodes) on 16/01/2021 20:09
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */

public class SimpleAdaptor extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.layout_recycler_item, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Bind Data..
        ((ViewHolder)holder).setData( position );
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // View Holder...
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super( itemView );
        }

        // Set Data...
        private void setData( int position ){

        }

    }


}
