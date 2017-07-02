package hasan.aporbo.com.houserentsystembeta;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accounts extends Fragment {
    Context context;
    ListView listView;
    String Countries[] = {"Bangladesh", "Canada", "India", "Spain"};
    ArrayAdapter<CharSequence> countryAdapter;

    public Accounts() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.accounts, container, false);
        listView = (ListView) v.findViewById(R.id.countryList);
        countryAdapter = new ArrayAdapter<CharSequence>(context, android.R.layout.simple_expandable_list_item_1, Countries);
        listView.setAdapter(countryAdapter);


        return v;
    }

}
