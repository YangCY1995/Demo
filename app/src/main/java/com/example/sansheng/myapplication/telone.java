package com.example.sansheng.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sansheng on 2015/8/25.
 */
public class telone extends Fragment{
    public telone(){
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_telone, container, false);
        final TextView textView=(TextView)view.findViewById(R.id.text1);
        Button button=(Button)view.findViewById(R.id.but1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("tfwefgewf222");
            }
        });
        return view;
    }
}
