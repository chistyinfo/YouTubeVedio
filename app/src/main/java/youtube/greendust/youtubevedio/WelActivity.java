package youtube.greendust.youtubevedio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class WelActivity extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "দৈনিক প্রথমআলো",
            "দৈনিক যুগান্তর"};
    Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2};

    String[] urlStrArray={"2_TnC3fB1iA",
            "_97QGjxgg_E"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                        @Override
                                        public void onItemClick(AdapterView<?> parent, View view,
                                                                int position, long id) {


                                                String Slecteditem = itemname[+position];
                                                view.setSelected(true);
                                                Intent intent = new Intent(WelActivity.this, MainActivity.class);
                                                intent.putExtra("url", urlStrArray[position]);
                                                 WelActivity.this.startActivity(intent);


                                            }





                                    }

        );
    }
}
