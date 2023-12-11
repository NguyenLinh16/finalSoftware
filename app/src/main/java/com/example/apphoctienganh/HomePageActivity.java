package com.example.apphoctienganh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apphoctienganh.dienkhuyet.DienKhuyetActivity;
import com.example.apphoctienganh.hoctuvung.HocTuVungActivity;
import com.example.apphoctienganh.luyennghe.LuyenNgheActivity;
import com.example.apphoctienganh.sapxepcau.SapXepCauActivity;
import com.example.apphoctienganh.tracnghiem.TracNghiemActivity;
import com.example.apphoctienganh.xephang.XepHangActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apphoctienganh.databinding.ActivityHomePageBinding;

public class HomePageActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    TextView tv_HTV, tv_LN, tv_TN, tv_DK, tv_XH, tv_SXC;

    ImageView iv_HTV, iv_LN, iv_TN, iv_DK, iv_XH, iv_SXC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        tv_HTV = findViewById(R.id.tvHTV);
        iv_HTV = findViewById(R.id.ivHTV);

        tv_HTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, HocTuVungActivity.class);
                startActivity(intent);
            }
        });
        iv_HTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, HocTuVungActivity.class);
                startActivity(intent);
            }
        });

        tv_LN = findViewById(R.id.tvLN);
        iv_LN = findViewById(R.id.ivLN);

        tv_LN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, LuyenNgheActivity.class);
                startActivity(intent);
            }
        });
        iv_LN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, LuyenNgheActivity.class);
                startActivity(intent);
            }
        });

        tv_SXC = findViewById(R.id.tvSXC);
        iv_SXC = findViewById(R.id.ivSXC);

        tv_SXC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, SapXepCauActivity.class);
                startActivity(intent);
            }
        });
        iv_SXC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, SapXepCauActivity.class);
                startActivity(intent);
            }
        });

        tv_TN = findViewById(R.id.tvTN);
        iv_TN = findViewById(R.id.ivTN);

        tv_TN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, TracNghiemActivity.class);
                startActivity(intent);
            }
        });
        iv_TN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, TracNghiemActivity.class);
                startActivity(intent);
            }
        });

        tv_DK = findViewById(R.id.tvDK);
        iv_DK = findViewById(R.id.ivDK);

        tv_DK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, DienKhuyetActivity.class);
                startActivity(intent);
            }
        });
        iv_DK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, DienKhuyetActivity.class);
                startActivity(intent);
            }
        });

        tv_XH = findViewById(R.id.tvXH);
        iv_XH = findViewById(R.id.ivXH);

        tv_XH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, XepHangActivity.class);
                startActivity(intent);
            }
        });
        iv_XH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, XepHangActivity.class);
                startActivity(intent);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home_page);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}