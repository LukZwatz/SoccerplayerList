package at.fh.swengb.soccerplayerlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.soccerplayerlist.model.Player;

public class ShowPlayerActivity extends AppCompatActivity {

    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_player);

        Intent intent = getIntent();
        player = (Player)intent.getExtras().get("player");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView viewAge = (TextView) findViewById(R.id.textViewAge);
        TextView viewNation = (TextView) findViewById(R.id.textViewNation);
        TextView viewClub = (TextView) findViewById(R.id.textViewClub);

        viewFirstName.setText(player.getFirstName());
        viewLastName.setText(player.getLastName());
        viewAge.setText(player.getAge());
        viewNation.setText(player.getNation());
        viewClub.setText(player.getClub());

    }

    public void showOnMap(View view) {
        Uri location = Uri.parse("geo:0,0?q="+player.getNation());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
    public void google(View view) {
        Uri uri = Uri.parse("https://www.google.at/#q="+player.getLastName()+"+"+player.getFirstName());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }


}
