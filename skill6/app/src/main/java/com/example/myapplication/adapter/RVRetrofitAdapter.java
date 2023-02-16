package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.networking.ProductResult;

import java.util.List;

public class RVRetrofitAdapter extends RecyclerView.Adapter<RVRetrofitAdapter.RVHolderRetrofit> {

    Context nContext;
    List<ProductResult> productResults;
    public RVRetrofitAdapter(Context nContext, List<ProductResult> productResults){
        this.nContext = nContext;
        this.productResults = productResults;
    }
    @NonNull
    @Override
    public RVHolderRetrofit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(nContext).inflate(R.layout.rv_product_item, parent, false);
        return new RVHolderRetrofit(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVRetrofitAdapter.RVHolderRetrofit holder, int position) {
        holder.tvTitle.setText(productResults.get(position).getTitle());
        Glide.with(nContext)
                .load(productResults.get(position).getProductImage()).placeholder(R.drawable.camino)
                .error(R.drawable.ic_launcher_background).into(holder.ivImage);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RVHolderRetrofit extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivImage;
        public RVHolderRetrofit (@NonNull View itemView){
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}
