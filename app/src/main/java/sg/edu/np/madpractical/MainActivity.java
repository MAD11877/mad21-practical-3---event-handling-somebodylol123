package sg.edu.np.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    private TextView header;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent data = getIntent();
        int ranNum = data.getIntExtra("ranVal",0);
        header = findViewById(R.id.txtName);
        header.setText("MAD" + " " + ranNum);
        Button followBtn = findViewById(R.id.follow);
        User user  = new User(true);
        if (user.getFollowed() == true){
            followBtn.setText("UNFOLLOW");
        }
        else{
            followBtn.setText("FOLLOW");
        }
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getFollowed() == false){
                    user.setFollowed(true);
                    followBtn.setText("UNFOLLOW");
                    Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
                }
                else{
                    user.setFollowed(false);
                    followBtn.setText("FOLLOW");
                    Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    
}