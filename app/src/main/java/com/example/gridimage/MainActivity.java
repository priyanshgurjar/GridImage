package com.example.gridimage;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Set click listeners for each album with Spotify links
        setImageClickListener(R.id.imageView, "Tyler, The Creator", "Album: CHROMAKOPIA\nReleased: Oct 28, 2024\nTracks: 14", "https://open.spotify.com/album/0U28P0QVB1QRxpqp5IHOlH?si=j9Y67qG4SKS1QZMKK4sTBg");
        setImageClickListener(R.id.imageView2, "Kendrick Lamar", "Album: GNX\nReleased: Nov 22, 2024\nTracks: 12", "https://open.spotify.com/album/0hvT3yIEysuuvkK73vgdcW?si=66N31D25RFmKiK3jmcKDgw");
        setImageClickListener(R.id.imageView3, "Sabrina Carpenter", "Album: Short n’ Sweet\nReleased: Aug 23, 2024\nTracks: 12", "https://open.spotify.com/album/3iPSVi54hsacKKl1xIR2eH?si=mi6oc3vXSgaU2wf3KPS7Ug");
        setImageClickListener(R.id.imageView4, "Charli XCX", "Album: BRAT\nReleased: Jun 7, 2024\nTracks: 15", "https://open.spotify.com/album/2lIZef4lzdvZkiiCzvPKj7?si=F5hskt3OTq-lPe1hTS3H7Q");
        setImageClickListener(R.id.imageView5, "The Weeknd", "Album: Hurry Up Tomorrow\nReleased: Jan 31, 2025\nTracks: 22", "https://open.spotify.com/album/3OxfaVgvTxUTy7276t7SPU?si=wZpcJWOfRKuS_lzh9EQPeQ");
        setImageClickListener(R.id.imageView6, "Chappell Roan", "Album: The Rise and Fall of a Midwest Princess\nReleased: Sep 22, 2023\nTracks: 14", "https://open.spotify.com/album/0EiI8ylL0FmWWpgHVTsZjZ?si=iFq_sZ4JR9mePrj_X3R53Q");
        setImageClickListener(R.id.imageView7, "Doechii", "Album: Alligator Bites Never Heal\nR  eleased: Mar 8, 2025\nTracks: 11", "https://open.spotify.com/album/60UzB8mOCMpc7xkuJE6Bwc?si=AL_MGNJyT96WD0UHPikqog");
        setImageClickListener(R.id.imageView8, "Billie Eilish", "Album: HIT ME HARD AND SOFT\nReleased: May 17, 2024\nTracks: 10", "https://open.spotify.com/album/7aJuG4TFXa2hmE4z1yxc3n?si=74AGAZOUTxq64ncyfcKQCQ");
        setImageClickListener(R.id.imageView9, "Dua Lipa", "Album: Radical Optimism\nReleased: Apr 26, 2024\nTracks: 11", "https://open.spotify.com/album/1Mo92916G2mmG7ajpmSVrc?si=s53dKjXrQSiAYT3NIC-0bw");
        setImageClickListener(R.id.imageView10, "beabadoobee", "Album: This Is How Tomorrow Moves\nReleased: Jun 14, 2025\nTracks: 13", "https://open.spotify.com/album/5oT7xqbRbQCevZ0XC5aBFu?si=xDG1UD7dRmea5DB2GWMPHQ");
    }

    private void setImageClickListener(int imageViewId, String title, String message, String spotifyLink) {
        ImageView imageView = findViewById(imageViewId);
        imageView.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(title)
                    .setMessage(message)
                    .setPositiveButton("OK", null)
                    .setNegativeButton("Open in Spotify", (dialogInterface, i) -> {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(spotifyLink));
                        startActivity(intent);
                    })
                    .show();
        });
    }

}