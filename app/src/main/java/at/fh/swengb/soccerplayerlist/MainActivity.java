package at.fh.swengb.soccerplayerlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.soccerplayerlist.model.Player;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private List<Player> listPlayer;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myPlayerList);

        listPlayer = new ArrayList<>();
        listPlayer.add(new Player("Marco","Reus","25","Germany","BVB Dortmund"));
        listPlayer.add(new Player("Sebastian","Prödl","30","Austria","FC Watford"));
        listPlayer.add(new Player("Lionel","Messi","39","Argentinia","FC Barcelona"));
        listPlayer.add(new Player("Arnel","Jakupovic","18","Austria","FC Middlesbrough"));
        listPlayer.add(new Player("Zlatan","Ibrahimovic","35","Sweden","Manchester United"));
        listPlayer.add(new Player("Cristiano","Ronaldo","31","Portugal","Real Madrid"));
        listPlayer.add(new Player("Marko","Arnautovic","27","Austria","Stoke City"));

        myAdapter = new CustomAdapter(this,listPlayer);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Player selectedPlayer = listPlayer.get(i);
        Intent intent = new Intent(view.getContext(),ShowPlayerActivity.class);
        intent.putExtra("player",selectedPlayer);
        startActivity(intent);

    }
}
