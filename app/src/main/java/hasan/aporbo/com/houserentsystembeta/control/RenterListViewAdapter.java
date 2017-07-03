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
    private ArrayList<Renter> renters;
    private Context context;

    public RenterListViewAdapter(@NonNull Context context, ArrayList<Renter> renters) {
        super(context, R.layout.renter_row_view, renters);
        this.renters = renters;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.renter_row_view, parent, false);
            holder.imageView = (ImageView) convertView.findViewById(R.id.renter_image);
            holder.nameTV = (TextView) convertView.findViewById(R.id.renter_name);
            holder.dateTV = (TextView) convertView.findViewById(R.id.current_date);
            holder.paidTV = (TextView) convertView.findViewById(R.id.paid_or_not);
            holder.dueTV = (TextView) convertView.findViewById(R.id.due_amount);
            holder.totalTV = (TextView) convertView.findViewById(R.id.total_rent);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.imageView.setImageResource(R.drawable.background);
        holder.nameTV.setText(renters.get(position).getRenterName());
        holder.dateTV.setText(renters.get(position).getCurrentDate());
        holder.paidTV.setText("Paid");
        holder.dueTV.setText("200");
        holder.totalTV.setText("50000");

        return convertView;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView nameTV;
        TextView dateTV;
        TextView paidTV;
        TextView dueTV;
        TextView totalTV;
    }
}
