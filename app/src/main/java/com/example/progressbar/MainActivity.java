package com.example.progressbar;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go1(View view) {

        ProgressDialog x = new ProgressDialog(this);
        x.setTitle("This is my title");
        x.setMessage("This is The Message");
        x.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        x.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancle", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
        x.show();

    }

    public void go2(View view) {

        ProgressDialog y = new ProgressDialog(this);
        y.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

        // Use Spinner Or Circle

        y.setMessage("Please Wait............");
        y.setIndeterminate(false); // in spinner this is true
        y.setCancelable(false);
        y.show();
        y.setProgress(50); // in spinner this is not in there



    }
}
