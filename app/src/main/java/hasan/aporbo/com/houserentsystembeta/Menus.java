package hasan.aporbo.com.houserentsystembeta;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Menus extends Fragment {
    ImageButton btnAccount;

    public Menus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View v = inflater.inflate(R.layout.menus, container, false);
        btnAccount = (ImageButton) v.findViewById(R.id.btn_account);
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Accounts accounts = new Accounts();
                ft.replace(R.id.fragmentContainer, accounts);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        return v;

    }

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);


    }
}
