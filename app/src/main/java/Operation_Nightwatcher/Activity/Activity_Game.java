package Operation_Nightwatcher.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.td.OperationNightwatcher.R;

public class Activity_Game extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onRestart(){ super.onRestart(); }
}
