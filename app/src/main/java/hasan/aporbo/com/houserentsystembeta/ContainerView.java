package hasan.aporbo.com.houserentsystembeta;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import hasan.aporbo.com.houserentsystembeta.Views.Accounts;
import hasan.aporbo.com.houserentsystembeta.Views.GenerateBill;
import hasan.aporbo.com.houserentsystembeta.Views.RegisterRenter;
import hasan.aporbo.com.houserentsystembeta.Views.RenterInfoBill;
import hasan.aporbo.com.houserentsystembeta.Views.RenterList;
import hasan.aporbo.com.houserentsystembeta.Views.Reports;

import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.ACCOUNT;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.BILLINFO;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.GENERATEBILL;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.REGISTER;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.RENTERLIST;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.REPORTS;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_ACCOUNTT;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_BILLGENEGATE;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_BILLINFO;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_REGISTER;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_RENTERLIST;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_REPORTS;

;

public class ContainerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container_view);
        String action = getIntent().getStringExtra("action");
        action(action);
        //Log.e(this.toString(),"Oncreate Call");
    }


    private void action(String action) {
        Fragment fragment = null;
        if (action != null) {
            switch (action) {
                case ACCOUNT:
                    setTitle(TITLE_ACCOUNTT);
                    fragment = new Accounts();
                    break;

                case GENERATEBILL:
                    setTitle(TITLE_BILLGENEGATE);
                    fragment = new GenerateBill();
                    break;

                case REGISTER:
                    setTitle(TITLE_REGISTER);
                    fragment = new RegisterRenter();
                    break;

                case RENTERLIST:
                    setTitle(TITLE_RENTERLIST);
                    fragment = new RenterList();
                    break;

                case BILLINFO:
                    setTitle(TITLE_BILLINFO);
                    fragment = new RenterInfoBill();
                    break;

                case REPORTS:
                    setTitle(TITLE_REPORTS);
                    fragment = new Reports();
                    break;
            }
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.containerView, fragment);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();

        }
    }
}
