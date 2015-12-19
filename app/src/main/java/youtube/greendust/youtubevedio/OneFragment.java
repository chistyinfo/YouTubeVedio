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


public class OneFragment extends Fragment {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private View view;
    ListView list1;
    String[] itemname ={
            "লেকচার ১ (ক)\nঅ্যান্ড্রয়েড অ্যাপ্লিকেশন ডেভেলপমেন্ট: লেকচার ১: এন্ড্রয়েড প্ল্যাটফর্ম পরিচিতি, প্রয়োজনীয় টুলস এবং প্রথম এপ্লিকেশন",
            "লেকচার ১ (খ)\nঅ্যান্ড্রয়েড অ্যাপ্লিকেশন ডেভেলপমেন্ট: লেকচার ১: এন্ড্রয়েড প্ল্যাটফর্ম পরিচিতি, প্রয়োজনীয় টুলস এবং প্রথম এপ্লিকেশন",
            "লেকচার 2 (ক)\nঅ্যান্ড্রয়েড অ্যাপ্লিকেশন ডেভেলপমেন্ট: লেকচার ২: প্রজেক্ট স্ট্রাকচার (ক্যালকুলেটর প্রোজেক্ট) ও Android Internals:সংক্ষিপ্ত পরিচিতি",
            "লেকচার ২ (খ)\nAndroid Internals:সংক্ষিপ্ত পরিচিতি",
            "লেকচার ৩[খ]\nএপ্লিকেশনের কম্পোনেন্টসমূহ ও এক্টিভিটির লাইফসাইকেল",
            "লেকচার ৩[গ]\nমাল্টিপল স্ক্রিন এপ্লিকেশন ও নেভিগেশন",
            "লেকচার ৪: \nইউজার ইন্টারফেস ১) বাটন, ইমেজ বাটন\n" +
                    "২) স্পিনার ও অটোকমপ্লিট টেক্সটফিল্ড",
            "লেকচার ৪: \n" +
                    "ইউজার ইন্টারফেস ১) রেডিও বাটন, চেকবক্স ও টোগল বাটন\n" +
                    "২) ডেটপিকার ও টাইমপিকার",
            "লেকচার ৫: (ক)\nডেটা স্টোরেজঃ SQLite ডেটাবেজ, ফাইলস এবং অন্যান্য\n১) এপ্লিকেশনের ডেটা কত রকম ভাবে সেভ করা যায়\n" +
                    "২) কিভাবে এপ্লিকেশনের ডেটা SQLite ডেটাবেজে সেভ করা যায়\n" +
                    "৩) কিভাবে ডেটাবেজ তৈরি করতে হয়\n" +
                    "৪) কিভাবে টেবল তৈরি করে ডেটা ইনসার্ট ও কুয়েরি করা যায়",
            "লেকচার ৫: (খ)\nডেটা স্টোরেজঃ SQLite ডেটাবেজ, ফাইলস এবং অন্যান্য\n১) ADB Shell ব্যবহার করে SQLite CLI এ কাজ করা\n" +
                    "২)DDMS এর File Explorer ব্যবহার করে ডেটাবেজ পুল করা ও SQLiteManager Application দিয়ে ওপেন করা\n" +
                    "৩)আরো কিছু অপারেশন (কুয়েরি ও আপডেট)",
            "লেকচার ৬:(ক) ডেটা স্টোরেজঃ\n১) কিভাবে একটি Prepopulated ডেটাবেজ ব্যবহার করে এপ্লিকেশন তৈরি করা যায়। (অর্থাৎ ডেটাবেজে আগে থেকেই\n কিছু ডেটা আছে এমন ক্ষেত্রে কিভাবে সেই ডেটাবেজটি ব্যবহার করা যায়)\n" +
                    "২) ডেটাবেজ তৈরি ও ব্যবহারের কিছু Good Practice (DatabaseHelper এর ডিজাইনের কিছু সমস্যা ও সমাধান)",
            "লেকচার ৬(খ): ডেটা স্টোরেজঃ \nDatabaseHelper এর ডিজাইনের কিছু সমস্যা ও সমাধান",
            "লেকচার ৬(গ): ডেটা স্টোরেজঃ \nএনক্রিপ্টেড স্টোরেজ ও SQLCipher",
            "লেকচার ৭(ক): ইউজার ইন্টারফেসঃ\n ListActivity-র ব্যবহার",
            "লেকচার ৭(খ): ইউজার ইন্টারফেসঃ\n ListView-র ব্যবহার",
            "লেকচার ৭(গ): ইউজার ইন্টারফেসঃ\n Customized ListView-এর ব্যবহার",
            "লেকচার ৮(ক): এপ্লিকেশনের কম্পোনেন্টঃ\n BroadcastReceiver কি এবং কিভাবে ব্যবহার করা যায়",
            "লেকচার ৮(খ): এপ্লিকেশনের কম্পোনেন্টঃ \nBroadcastReceiver-এর আরো কিছু ব্যবহার",
            "লেকচার ৮(গ): AlarmManager এর ব্যবহার"};


    String[] urlStrArray=
            {"grGDZyFoEio",
            "BbksheH7y5k",
            "h3EzIxmMVfQ",
            "kxedwrp9iJc",
            "U946N5gwlyM",
            "zdXGmM5D3lM",
            "hoK0SLCmGVY",
            "xZadA4kGkb8",
            "TKAyXjFn15k",
            "2nXuVQyQxa0",
            "rT8MQj05daI",
            "S1MnU_0iuyE",
            "gLQha1whNXA",
            "xvrhXWh0Tos",
            "py0s1l_uyys",
            "cgnJvYV_t-I",
            "eilUPWLOKJg",
            "e5OxHVDwanI",
            "V6FvM-5zvJo"};


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

        toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);


        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname,null);
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
