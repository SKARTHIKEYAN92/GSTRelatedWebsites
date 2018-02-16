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
    //ImageButton  gmail,face,twiter,whatsapp,youtube,tn,daily,dinamalr;
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
     /**  gmail=(ImageButton)findViewById (R.id.gmail);
        face=(ImageButton)findViewById (R.id.facebook);
        twiter=(ImageButton)findViewById (R.id.twitter);
        whatsapp=(ImageButton)findViewById (R.id.whatsapp);
        youtube=(ImageButton)findViewById (R.id.youtube);
        tn=(ImageButton)findViewById (R.id.tamilnews);
        daily=(ImageButton)findViewById (R.id.dinathandhi);
        dinamalr=(ImageButton)findViewById (R.id.dinamalar); **/









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

        /** gmail.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://www.google.com/gmail"));
                ctx.startActivity (MyIntent);
            }
        });

        face.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://www.facebook.com/"));
                ctx.startActivity (MyIntent);
            }
        });

        twiter.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://twitter.com/login"));
                ctx.startActivity (MyIntent);
            }
        });

        youtube.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://www.youtube.com/"));
                ctx.startActivity (MyIntent);
            }
        });

        whatsapp.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://web.whatsapp.com/%F0%9F%8C%90/en"));
                ctx.startActivity (MyIntent);
            }
        });

        tn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("https://tamil.oneindia.com"));
                ctx.startActivity (MyIntent);
            }
        });

        daily.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("http://www.dailythanthi.com"));
                ctx.startActivity (MyIntent);
            }
        });

        dinamalr.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent  MyIntent =new Intent (Intent.ACTION_VIEW, Uri.parse ("http://www.dinamalar.com"));
                ctx.startActivity (MyIntent);
            }
        }); **/






    }
}
