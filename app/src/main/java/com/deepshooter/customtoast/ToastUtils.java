package com.deepshooter.customtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToastUtils {


    public static void plainToast(String text,Context context){
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.plain_toast_layout, null);
        TextView toastTextView = view.findViewById(R.id.textViewToast);
        toastTextView.setText(text);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    public static void showToast(String text,Context context){
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        TextView toastTextView = view.findViewById(R.id.textViewToast);
        toastTextView.setText(text);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}
