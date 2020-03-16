package com.shoedazzle.m.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonShowCustomDialog);

              // add button listener
              button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button
                TextView title = (TextView) dialog.findViewById(R.id.title);
                EditText from = (EditText) dialog.findViewById(R.id.dialogButton_from);
                EditText to =  (EditText) dialog.findViewById(R.id.dialogButton_to);
                EditText from_dollar = (EditText) dialog.findViewById(R.id.dialogButton_from_dollar);
                EditText to_dollar =  (EditText) dialog.findViewById(R.id.dialogButton_to_dollar);

                Button button_back = (Button) dialog.findViewById(R.id.dialogButton_Back);
                Button button_ok = (Button) dialog.findViewById(R.id.dialogButton_ok);

                //Extra Work;
                //text.setText("Android custom dialog example!");
                //CircleImageView imageView = dialog.findViewById(R.id.image);
                //ImageView image = (ImageView) dialog.findViewById(R.id.image);
                //image.setImageResource(R.drawable.ic_warning_black_24dp);

                /*Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                }); */
                

                dialog.show();
            }
        });
    }
}
