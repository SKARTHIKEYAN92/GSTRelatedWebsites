package com.gsk.www.gstrelatedwebsites;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton google,gst,eway,dgft,icegate,hsn;
    Context ctx;
@Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        ctx=this;
        setContentView (R.layout.activity_main);
        google=(ImageButton)findViewById (R.id.google);
        gst=(ImageButton)findViewById (R.id.gst);
        eway=(ImageButton)findViewById (R.id.eway);
        dgft=(ImageButton)findViewById (R.id.dgft);
        icegate=(ImageButton)findViewById (R.id.icegate);
        hsn=(ImageButton)findViewById (R.id.hsn);
     

google.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                      Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://www.google.co.in"));
                        ctx.startActivity (MyIntent);
                    }
                });

        gst.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://gst.gov.in"));
                ctx.startActivity (MyIntent);
            }
        });

        icegate.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://icegate.gov.in"));
                ctx.startActivity (MyIntent);
            }
        });

        dgft.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://dgft.gov.in"));
                ctx.startActivity (MyIntent);
            }
        });

        eway.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://ewaybill.nic.in"));
                ctx.startActivity (MyIntent);
            }
        });

        hsn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://cleartax.in/s/gst-hsn-lookup"));
                ctx.startActivity (MyIntent);
            }
        });

       }
}
