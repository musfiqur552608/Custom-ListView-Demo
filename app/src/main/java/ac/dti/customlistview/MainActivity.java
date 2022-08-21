package ac.dti.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import ac.dti.customlistview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int imageId[] = {R.drawable.person, R.drawable.person, R.drawable.person, R.drawable.person, R.drawable.person};
        String name[] = {"Musfiqur Rahman", "Sakibur Rahman", "Saifur Rahman", "Ripa Rahman", "Samima Rahman"};
        String lastMassage[] = {"Hi, How are you?", "I am fine.", "What are you doing?", "What about your father?", "Am I know you?"};
        String lastMsgTime[] = {"10:00 AM", "11:35 PM", "12:30 AM", "12:25 PM", "1:00 PM"};
        String phoneNumber[] = {"01638352180", "01829011648", "01763448178", "01827391899", "01951829991"};
        String country[] = {"Bangladesh", "Bangladesh", "Bangladesh", "Bangladesh", "Bangladesh"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0; i<imageId.length; i++){
            User user = new User(name[i],lastMassage[i], lastMsgTime[i],phoneNumber[i], country[i], imageId[i]);
            userArrayList.add(user);
        }
        ListAdapater listAdapater = new ListAdapater(MainActivity.this, userArrayList);

        binding.listView.setAdapter(listAdapater);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, UserDetails.class);
                intent.putExtra("name", name[i]);
                intent.putExtra("phone", phoneNumber[i]);
                intent.putExtra("country", country[i]);
                intent.putExtra("image", imageId[i]);
                startActivity(intent);

            }
        });
    }
}