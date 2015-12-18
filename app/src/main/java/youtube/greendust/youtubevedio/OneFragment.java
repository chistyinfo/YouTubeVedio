package youtube.greendust.youtubevedio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class OneFragment extends Fragment {
    private View view;
    ListView list1;
    String[] itemname ={
            "দৈনিক প্রথমআলো",
            "দৈনিক যুগান্তর"};
    Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2};

    String[] urlStrArray={"2_TnC3fB1iA",
            "_97QGjxgg_E"};

    public OneFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname, imgid);
        list1 = (ListView) rootView.findViewById(R.id.list1);
        list1.setAdapter(adapter);
        view=rootView;

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

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
