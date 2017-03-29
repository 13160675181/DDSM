package hhh.zjh.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button myButton;
    static final String LIFT_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onCreate");
        myButton = (Button)findViewById(R.id.myButton);
        myButton.setText("firstActivity");
        myButton.setOnClickListener(new ButtonOnClickListener());
    }

    class ButtonOnClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,LogActivity2.class);
            MainActivity.this.startActivity(intent);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(MainActivity.LIFT_TAG,"FirstAcvity-->onRestart");
    }
}
