package hhh.zjh.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LogActivity2 extends AppCompatActivity {

    private static final String LIFT_TAG="LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(LogActivity2.LIFT_TAG,"SecondActivity--->onCreate");
        setContentView(R.layout.activity_log2);
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG,"SecondActivity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG, "SecondActivity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG, "SecondActivity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG, "SecondActivity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG, "SecondActivity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(LogActivity2.LIFT_TAG, "SecondActivity --->onStop");
        super.onStop();
    }
}
