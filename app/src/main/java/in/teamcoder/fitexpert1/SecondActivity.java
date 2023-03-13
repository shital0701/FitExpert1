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

public class SecondActivity extends AppCompatActivity {


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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.id_privacy){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;
        }

        if (id == R.id.id_term){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;
        }

        if (id == R.id.id_dashboard){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;
        }

        if (id == R.id.id_myplan){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;
        }

        if (id == R.id.rate){

            try {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));


            } catch (Exception ex){

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details>id=" + getPackageName())));


            }

            return true;
        }

        if (id == R.id.more){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Leap+Fitness+Group"));
            startActivity(intent);

            return true;
        }

        if (id == R.id.share){

            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "This is the best for yoga \n By this app you can stretch your body \n This is free Downlaod Now \n" + "https://play.google.com/store/apps/details>id=in.teamcoder.fitexpert1&h1=en";
            String sharehub = "FitExpert";
            myIntent.putExtra(Intent.EXTRA_SUBJECT, sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT, sharebody);
            startActivity(Intent.createChooser(myIntent, "share using"));




            return true;
        }

        return  true;
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){
            if(view.getId()==newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}