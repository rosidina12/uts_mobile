package com.example.uts_resep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button btn_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void msc(View view) {
        String url = "https://www.briliofood.net/resep/11-resep-bumbu-sate-ayam-ala-rumahan-gurih-praktis-dan-sederhana-220103b.html";
        Intent bukadrive = new Intent(Intent.ACTION_VIEW);
        bukadrive.setData(Uri.parse(url));
        startActivity(bukadrive);
    }

    public void rendang(View view) {
        String url = "https://www.briliofood.net/resep/11-resep-bumbu-sate-ayam-ala-rumahan-gurih-praktis-dan-sederhana-220103b.html";
        Intent bukadrive = new Intent(Intent.ACTION_VIEW);
        bukadrive.setData(Uri.parse(url));
        startActivity(bukadrive);
    }

    public void sate(View view) {
        String url = "https://www.briliofood.net/resep/11-resep-bumbu-sate-ayam-ala-rumahan-gurih-praktis-dan-sederhana-220103b.html";
        Intent bukadrive = new Intent(Intent.ACTION_VIEW);
        bukadrive.setData(Uri.parse(url));
        startActivity(bukadrive);
    }

    public void fragment(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new TampilanFragment()).commit();
    }
}