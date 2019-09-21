package com.androdocs.simplehttprequest;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androdocs.httprequest.HttpRequest;

public class MainActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        new webTask().execute();
    }


    class webTask extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            findViewById(R.id.loader).setVisibility(View.VISIBLE);
        }

        protected String doInBackground(String... args) {
            String response = HttpRequest.excuteGet("https://www.androdocs.com/files/uploads/original/sample-json-data-1567767983.txt");
            return response;
        }

        @Override
        protected void onPostExecute(String result) {

            findViewById(R.id.loader).setVisibility(View.GONE);
            resultText.setText(result);

        }
    }
}
