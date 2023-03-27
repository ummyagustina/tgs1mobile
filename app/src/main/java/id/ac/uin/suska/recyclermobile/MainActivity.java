package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerv);

        List<itemRec> items = new ArrayList<itemRec>();
        items.add(new itemRec("facebook", "merupakan apk pertemanan jarak jauh dan dekat ", R.drawable.facebook));
        items.add(new itemRec("spotify", "penawaran khusus ramadhan sebagai pengguna premiu", R.drawable.spotify));
        items.add(new itemRec("Google", "Bantuan perkuat keamanan akun google", R.drawable.google));
        items.add(new itemRec("appmusic", "mendengarkan musiv dimana saja kapanpun", R.drawable.appmusic));
        items.add(new itemRec("whatsapp", "chatan dengan orang terdekat", R.drawable.whatsapps));
        items.add(new itemRec("kpop", "K-pop ummy pacar nya suga", R.drawable.kpop));
        items.add(new itemRec("instagram", "Instagram umie_y memposting foto", R.drawable.instagram));
        items.add(new itemRec("pop", "lagu yang enak di dengar", R.drawable.pop));
        items.add(new itemRec("rock", "bikin sakit telinga", R.drawable.rock));
        items.add(new itemRec("twitter", "merupakan apk buat tertawa", R.drawable.twitter));
        items.add(new itemRec("wecverse", "this is a guide regarding transmisi", R.drawable.weverse));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListemailAdapter(getApplicationContext(), items));
    }
}