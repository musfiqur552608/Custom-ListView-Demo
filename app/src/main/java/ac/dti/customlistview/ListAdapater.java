package ac.dti.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapater extends ArrayAdapter<User> {

    public ListAdapater(@NonNull Context context, ArrayList<User> userArrayList) {
        super(context, R.layout.list_item, userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        User user = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.personImage);
        TextView userName = convertView.findViewById(R.id.personName);
        TextView lastMsg = convertView.findViewById(R.id.lastMsg);
        TextView time = convertView.findViewById(R.id.lastMsgTime);

        imageView.setImageResource(user.imageId);
        userName.setText(user.name);
        lastMsg.setText(user.lastMsg);
        time.setText(user.lastMsgTime);

        return convertView;
    }
}
