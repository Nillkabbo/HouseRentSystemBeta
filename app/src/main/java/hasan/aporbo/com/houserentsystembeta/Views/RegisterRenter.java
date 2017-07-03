package hasan.aporbo.com.houserentsystembeta.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hasan.aporbo.com.houserentsystembeta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterRenter extends Fragment {


    public RegisterRenter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.register_renter, container, false);
    }

}
