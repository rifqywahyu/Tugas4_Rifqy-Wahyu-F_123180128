package com.example.tugas_4_rifqy_wahyu_123180128;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ViewHolder> {
    public ArrayList<ArtikelModel> artikelModels;
    private Context context;

    public ArrayList<ArtikelModel> getArtikelModels() {
        return getArtikelModels();
    }

    public void setArtikelModels(ArrayList<ArtikelModel> artikelModels) {
        this.artikelModels = artikelModels;
    }

    public ArtikelAdapter(ArrayList<ArtikelModel> listData, Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_artikel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Glide.with(context).load(getArtikelModels().get(i).getGambarArtikel()).into(holder.img);
        holder.tvJudul.setText(getArtikelModels().get(i).getJudulArtikel());
        holder.tvIsi.setText(getArtikelModels().get(i).getIsiArtikel());
        holder.cvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("img", getArtikelModels().get(i).getGambarArtikel());
                intent.putExtra("judul", getArtikelModels().get(i).getJudulArtikel());
                intent.putExtra("isi", getArtikelModels().get(i).getIsiArtikel());
                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return artikelModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img ;
        private TextView tvJudul,tvIsi;
        private CardView cvCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.iv_img);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvIsi = itemView.findViewById(R.id.tv_isi);
            cvCardView = itemView.findViewById(R.id.cv_item);
        }
    }
}
