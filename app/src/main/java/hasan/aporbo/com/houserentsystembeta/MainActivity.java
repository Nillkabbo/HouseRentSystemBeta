package hasan.aporbo.com.houserentsystembeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.ACCOUNT;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.BILLINFO;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.GENERATEBILL;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.REGISTER;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.RENTERLIST;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.REPORTS;
import static hasan.aporbo.com.houserentsystembeta.models.StaticFields.TITLE_MENUS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(TITLE_MENUS);


    }

    public void MenuClick(View view) {
        Intent intent = new Intent(this, ContainerView.class);
        switch (view.getId()) {
            case R.id.btn_account:
                Toast.makeText(this, "Account Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", ACCOUNT);
                startActivity(intent);
                break;
            case R.id.generateBill:
                Toast.makeText(this, "GenerateBill Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", GENERATEBILL);
                startActivity(intent);
                break;
            case R.id.register:
                Toast.makeText(this, "Register Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", REGISTER);
                startActivity(intent);
                break;
            case R.id.btn_renterList:
                Toast.makeText(this, "Renter List Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", RENTERLIST);
                startActivity(intent);
                break;
            case R.id.billInfo:
                Toast.makeText(this, "Bill Info Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", BILLINFO);
                startActivity(intent);
                break;
            case R.id.reports:
                Toast.makeText(this, "Reports Button Clicked", Toast.LENGTH_SHORT).show();
                intent.putExtra("action", REPORTS);
                startActivity(intent);
                break;
        }
    }
}
