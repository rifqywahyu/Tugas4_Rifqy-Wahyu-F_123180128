package com.example.tugas_4_rifqy_wahyu_123180128;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView tvJudul,tvIsi ;
    private ImageView ivImg,ivReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tv_judul);
        tvIsi = findViewById(R.id.tv_isi);
        ivImg = findViewById(R.id.iv_img);
        ivReturn = findViewById(R.id.iv_return);

        tvJudul.setText(getIntent().getStringExtra("judul"));
        tvIsi.setText(getIntent().getStringExtra("isi"));
        int iImg = getIntent().getIntExtra("img",0);

        Glide.with(this).load(iImg).into(ivImg);

        ivReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}