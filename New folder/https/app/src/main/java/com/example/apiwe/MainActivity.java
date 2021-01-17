package com.example.apiwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    private Button MBtnCallApi;
    private RecyclerView recyclerView;
    private List<ResponseClass> responseClassList = new ArrayList<>();
    private PostAdapter postAdapter;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            URL url = null;
            try{
                url = new URL(" https://jsonplaceholder.typicode.com/posts");
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                int data = inputStreamReader.read();
                StringBuffer stringBuffer = new StringBuffer();

                while (data != -1){
                    char ch = (char) data;
                    stringBuffer.append(ch);
                    data = inputStreamReader.read();

                }
                bulidResponseData(stringBuffer);

            }catch (Exception e){
            e.printStackTrace();
            }
        }

        private void bulidResponseData(StringBuffer stringBuffer) {
            String json = stringBuffer.toString();
            List<ResponseClass> responseClasseList = new ArrayList<>();
            try{
                JSONArray jsonArray = new JSONArray(json);
                for(int i= 0; i<jsonArray.length(); i++){
                    JSONObject eachJsonObject = jsonArray.getJSONObject(i);
                    int id = eachJsonObject.getInt("id");
                    int userId = eachJsonObject.getInt("userId");
                    String tittle = eachJsonObject.getString("title");
                    String body = eachJsonObject.getString("body");
                    ResponseClass responseClass = new ResponseClass(id, userId, tittle, body  );
                    responseClasseList.add(responseClass);
                    updateAdapter();



            }}
            catch (JSONException e){
                e.printStackTrace();
            }
        }

    };
    private  void updateAdapter(){
         runOnUiThread(new Runnable() {
             @Override
             public void run() {
                 postAdapter.updateRecyclerViewList(responseClassList);


             }
         });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsAndListners();
        setRecyclerAdapter();

    }

    private void initViewsAndListners() {

        MBtnCallApi  = findViewById(R.id.BtnCallApi);
        recyclerView = findViewById(R.id.recvyclerView);
        MBtnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBackgroudThread();
            }
        });
    }
    private void setRecyclerAdapter(){
        postAdapter = new PostAdapter(responseClassList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(postAdapter);


    }
    private void startBackgroudThread(){
        Thread thread = new Thread(runnable);
        thread.start();
    }
}