package kr.pe.burt.android.saylib;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import kr.pe.burt.android.saylib.library.Say;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Say say = new Say();
        String hello = say.hello(getResources());
        TextView sayTv = (TextView)findViewById(R.id.say);
        sayTv.setText(hello);
    }
}
