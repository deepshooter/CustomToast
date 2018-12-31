package com.deepshooter.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.deepshooter.customtoast.ToastUtils.plainToast;
import static com.deepshooter.customtoast.ToastUtils.showToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plainToastButton = findViewById(R.id.plain_toast_button);
        Button toastWithImageButton = findViewById(R.id.toast_with_image_button);

        plainToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plainToast(getString(R.string.something_went_wrong),MainActivity.this);
            }
        });

        toastWithImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(getString(R.string.successfully_downloaded),MainActivity.this);
            }
        });

    }

}
