package com.ada.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private AutoCompleteTextView  autoText=null;
    private MultiAutoCompleteTextView multiText=null;
    private String[] books=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        books=new String[]{
                "java",
                "android",
                "eclipse",
                "android studio"
        };

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,books);
        autoText=(AutoCompleteTextView) findViewById(R.id.auto_complete);
        autoText.setAdapter(aa);

        multiText=(MultiAutoCompleteTextView) findViewById(R.id.multi_auto_text);
        multiText.setAdapter(aa);
        multiText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
