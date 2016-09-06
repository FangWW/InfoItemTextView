package com.infoitemtextview.infoitemtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.itemtextview.InfoItemTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfoItemTextView mtv_auth_information = (InfoItemTextView) findViewById(R.id.mtv_auth_information);
        final InfoItemTextView mtv_auth_information2 = (InfoItemTextView) findViewById(R.id.mtv_auth_information2);
        mtv_auth_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "最后一个item输入内容" + mtv_auth_information2.getRightText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
