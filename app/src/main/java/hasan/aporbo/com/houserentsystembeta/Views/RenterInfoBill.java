package hasan.aporbo.com.houserentsystembeta.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hasan.aporbo.com.houserentsystembeta.R;

public class RenterInfoBill extends Fragment {

    public RenterInfoBill() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.renter_info_bill, container, false);
    }

}
