package in.teamcoder.fitexpert1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        newArray = new int[]{

                R.id.bow_pose,R.id.bridge_pose, R.id.chair_pose,R.id.child_pose, R.id.cobler_pose, R.id.cow_pose, R.id.playji_pose, R.id.pauseji_pose, R.id.plank_pose,R.id.crunches_pose, R.id.situp_pose, R.id.rotation_pose, R.id.twist_pose,R.id.windmill_pose, R.id.legup_pose,


        };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home){

            Intent intent = new Intent(SecondActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        else if (id == R.id.menu_refresh){
            startActivity(getIntent());
            finish();
            overridePendingTransition(0,0);
        }

        else if (id == R.id.id_myprofile){

            Intent intent = new Intent(SecondActivity2.this, SecondActivity.class);
            startActivity(intent);
            finish();
        }

        else if (id == R.id.id_myplans){

            Intent intent = new Intent(SecondActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        else if (id == R.id.id_logout){

            Intent intent = new Intent(SecondActivity2.this, SecondActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(SecondActivity2.this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }



    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){
            if(view.getId()==newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}