package data.kiosk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class ListAdapter extends ArrayAdapter<Menu> {

    private int resourceLayout;
    private Context mContext;

    public ListAdapter(Context context, int resource, List<Menu> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            v = vi.inflate(resourceLayout, null);
        }

        Menu menu = getItem(position);

        if (menu != null) {
//            ImageView icon = v.findViewById(R.id.imageView1);
            TextView name = v.findViewById(R.id.name);
            TextView desc = v.findViewById(R.id.desc);

//            if (icon != null) {
//                icon.setImageResource(menu.resourceIcon);
//            }

            if (name != null) {
                name.setText(menu.name);
            }

            if (desc != null) {
                desc.setText(menu.toString());
            }
        }

        return v;
    }

}