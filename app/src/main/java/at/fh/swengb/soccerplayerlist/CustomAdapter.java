package at.fh.swengb.soccerplayerlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.soccerplayerlist.model.Player;

/**
 * Created by Lukas on 24.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<Player> listPlayer;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Player> listPlayer) {
        this.context = applicationContext;
        this.listPlayer= listPlayer;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listPlayer.size();
    }

    @Override
    public Object getItem(int i) {
        return listPlayer.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListNation);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListClub);
        TextView viewAge=(TextView)view.findViewById(R.id.textViewListAge);

        Player player = listPlayer.get(i);
        viewName.setText(player.getFirstName()+" "+player.getLastName());
        viewAddress.setText(player.getNation());
        viewPhone.setText(player.getClub());
        viewAge.setText(player.getAge()+" years old");

        return view;
    }

}
