package ac.dti.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import ac.dti.customlistview.databinding.ActivityMainBinding;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserDetails extends AppCompatActivity {
    TextView personName, personPhone, personCountry;
    CircleImageView personImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        personName = findViewById(R.id.personName);
        personPhone = findViewById(R.id.personPhnNumber);
        personCountry = findViewById(R.id.personCountry);
        personImageView = findViewById(R.id.personImage);

        Intent intent = this.getIntent();

        if(intent != null){
            String name = intent. getStringExtra("name");
            String phone = intent. getStringExtra("phone");
            String country = intent. getStringExtra("country");
            int image = intent.getIntExtra("image", R.drawable.person);

            personName.setText(name);
            personPhone.setText(phone);
            personCountry.setText(country);
            personImageView.setImageResource(image);

        }
    }
}