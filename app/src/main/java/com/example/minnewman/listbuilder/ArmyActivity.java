package com.example.minnewman.listbuilder;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArmyActivity extends AppCompatActivity {

    private Button mArmyButton;
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<Faction>> listHash;
    private List<Faction> imperiumList = new ArrayList<>();
    private List<Faction> chaosList = new ArrayList<>();
    private List<Faction> xenosList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armylayout);
        //setContentView(R.layout.army_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






      mArmyButton  = (Button) findViewById(R.id.addArmyButton);

      mArmyButton.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v){


              setContentView(R.layout.army_select);
              listView = (ExpandableListView) findViewById(R.id.armyExpand);
              initData();
              listAdapter = new ExpandableListAdapter(getApplicationContext(), listDataHeader, listHash);
              listView.setAdapter(listAdapter);
              listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){
                  @Override
                  public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                      Toast.makeText(getApplicationContext(), listHash.get(listDataHeader.get(groupPosition)).get(childPosition).toString(), Toast.LENGTH_SHORT).show();

                      return false;
                  }
              });




              Toast.makeText(getApplicationContext(), "Select An Army", Toast.LENGTH_SHORT).show();



          }
      });


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_army, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();
        listDataHeader.add("Imperium");
        listDataHeader.add("Chaos");
        listDataHeader.add("Xenos");

        Faction spaceMarine = new Faction("Spae Marines");
        Faction imperialGuard = new Faction("Imperial Guard");
        imperiumList.add(spaceMarine);
        imperiumList.add(imperialGuard);

        Faction chaosMarines = new Faction("Chaos Space Marines");
        chaosList.add(chaosMarines);



        Faction orks = new Faction("Orks");
        Faction eldar = new Faction("Craftworld Eldar");
        Faction necrons = new Faction("Necrons");
        xenosList.add(eldar);
        xenosList.add(orks);
        xenosList.add(necrons);

        listHash.put(listDataHeader.get(0), imperiumList);
        listHash.put(listDataHeader.get(1), chaosList);
        listHash.put(listDataHeader.get(2), xenosList);
    }




    }
