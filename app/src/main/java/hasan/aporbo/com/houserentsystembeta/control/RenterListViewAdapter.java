package hasan.aporbo.com.houserentsystembeta.control;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hasan.aporbo.com.houserentsystembeta.R;
import hasan.aporbo.com.houserentsystembeta.models.Renter;

public class RenterListViewAdapter extends ArrayAdapter<Renter> {
    ArrayList<Renter> renters;
    Context context;

    public RenterListViewAdapter(@NonNull Context context, ArrayList<Renter> renters) {
        super(context, R.layout.renter_row_view, renters);
        this.renters = renters;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.renter_row_view, parent, false);
        if (convertView != null) {
            ImageView imageView = (ImageView) convertView.findViewById(R.id.renter_image);
            TextView name = (TextView) convertView.findViewById(R.id.renter_name);
            TextView date = (TextView) convertView.findViewById(R.id.current_date);
            TextView paid = (TextView) convertView.findViewById(R.id.paid_or_not);
            TextView due = (TextView) convertView.findViewById(R.id.due_amount);
            TextView total = (TextView) convertView.findViewById(R.id.total_rent);
            name.setText(renters.get(position).getRenterName());
            date.setText(renters.get(position).getCurrentDate());
            paid.setText("Paid");
            due.setText("200");
            total.setText("50000");
        }


        return convertView;
    }
}
