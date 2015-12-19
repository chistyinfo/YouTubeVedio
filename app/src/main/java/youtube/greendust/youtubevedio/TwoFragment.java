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


public class TwoFragment extends Fragment {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private View view;
    ListView list2;
    String[] itemname ={"লেকচার ১ – \nকোর্সের ওভারভিউ এবং হ্যালো ওয়ার্ল্ড প্রোগ্রাম",
    "লেকচার ২ – \nVariable, Data type, Method, Operator, Array ও প্রাকটিস",
    "লেকচার ৩ – \nString, Multidimensional Array, if-then-else, switch, conditional operator ও প্রাকটিস",
    "Java: লেকচার ৪ – \nreturn type, while, do-while,for loop,try-catch-finally block ও প্রাকটিস",
    "Java (OOP): লেকচার ৫ – \nClass, Object, Inheritance, public, private, static, protected ইত্যাদি",
    "Java (OOP): লেকচার ৬ –\n Package, interface, Inheritance, Protected ও Class নিয়ে আলোচনা ",
    "Java (OOP): লেকচার ৭ –\n Thread ও Debugging নিয়ে আলোচনা ",
    "Java (OOP): লেকচার ৮ –\n Runnable ও File input output নিয়ে আলোচনা, Android ADT প্রস্তুতি",
    "Android: লেকচার ৯ – (Android-১)",
    "Android: লেকচার ১০ –\n (Android-২ লিস্ট ভিউ, Toast, List adapter)",
    "Android: লেকচার ১১  –\n (Android Game Development-১) ",
    "Android: লেকচার ১২  – \n(Android Game Development-২)",
    "Android: লেকচার ১৩ –\n (Android Game Development-৩)",
    "Android: লেকচার ১৪ – \n(Android Game Development-৪)(শেষ)",
    "Android: লেকচার ১৫ – \n(SQLite ব্যবহার করে একটি Dictionary অ্যাপ তৈরি করা, Shared Preference)"};


    String[] urlStrArray ={"XjwTPNKs6Tc",
                            "Ywxg4Hxa2jA",
                            "WA-mnTgOSd0",
                            "yz8nWplwmIs",
                            "oyzuWcHbRos",
                            "ufwj-sKBPx0",
                            "DcXM75va5jM",
                            "5ErRTPGo0PA",
                            "qIc7R8HLylQ",
                            "bqj9Ud6K9es",
                            "kIJyh7Z9L1Q",
                            "B8FdbHaadBM",
                            "tXVupjKMRiQ",
                            "KJ59FWv_I1w",
                            "OQEfwSH3go8"};

    public TwoFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname,null);
        list2 = (ListView) rootView.findViewById(R.id.list2);
        list2.setAdapter(adapter);
        view=rootView;

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

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
