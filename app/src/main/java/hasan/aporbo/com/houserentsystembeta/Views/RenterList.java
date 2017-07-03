package hasan.aporbo.com.houserentsystembeta.Views;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import hasan.aporbo.com.houserentsystembeta.R;
import hasan.aporbo.com.houserentsystembeta.control.RenterListViewAdapter;
import hasan.aporbo.com.houserentsystembeta.models.Renter;


/**
 * A simple {@link Fragment} subclass.
 */
public class RenterList extends Fragment {
    Context context;
    ListView listView;
    ArrayList<Renter> renters;

    public RenterList() {
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
        View v = inflater.inflate(R.layout.renter_list, container, false);
        listView = (ListView) v.findViewById(R.id.renterListView);
        Renter renter = new Renter();
        renters = renter.Allrenterrenters();
        RenterListViewAdapter renterAdapter = new RenterListViewAdapter(context, renters);
        listView.setAdapter(renterAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(context, renters.get(i).getRenterName(), Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();


    }

}
