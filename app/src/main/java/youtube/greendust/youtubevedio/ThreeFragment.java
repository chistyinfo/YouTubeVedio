package youtube.greendust.youtubevedio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class ThreeFragment extends Fragment {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private View view;
    ListView list3;
    String[] itemname ={};
    String[] urlStrArray ={};

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname,null);
        list3 = (ListView) rootView.findViewById(R.id.list3);
        list3.setAdapter(adapter);
        view=rootView;

        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                         @Override
                                         public void onItemClick(AdapterView<?> parent, View view,
                                                                 int position, long id) {


                                             String Slecteditem = itemname[+position];
                                             view.setSelected(true);
                                             Intent intent = new Intent(getActivity(), MainActivity.class);
                                             intent.putExtra("url", urlStrArray[position]);
                                             startActivity(intent);


                                         }





                                     }

        );





        return rootView;


    }

}