package com.hafiizh.simplesharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitleToolbar(SharedPref.getTitle("title"));

        final EditText edt_title = (EditText) findViewById(R.id.title);
        Button btn_change = (Button) findViewById(R.id.btn_change);

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_title.getText().toString().isEmpty()) {
                    edt_title.setError("Toolbar name is empty !");
                } else {
                    SharedPref.setTitle("title", edt_title.getText().toString());
                    setTitleToolbar(SharedPref.getTitle("title"));
                }
            }
        });
    }

    private void setTitleToolbar(String title) {
        getSupportActionBar().setTitle(title);
    }
}
