package com.example.rupeshl.qasim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Log.v("API","apiService  getData");
        Call<AnmolData> call=apiService.getData();
        call.enqueue(new Callback<AnmolData>() {
            @Override
            public void onResponse(Call<AnmolData> call, Response<AnmolData> response) {
                Log.d("TAG","onResponse Called");

                    System.out.println("isSuccessful");
                    Log.v("API","apiService response isSuccessful");
                AnmolData dataDao=response.body();
                Log.i("MainActivity",""+dataDao.getCount());
                    textView.setText("id "+dataDao.getCount());
                    //RecordItem value=dataDao.getData();
                    List<RecordItem> stateDetail=dataDao.getData();
                    RecordItem recordItem=stateDetail.get(0);
                      // textView.setText("recordItem "+recordItem.getRecord());
                    //textView.setText("\n values \n"+"ID= "+value.getId()+"\n"+"Rev= "+value.getRev()+"\n Type= "+value.getType()+"\n states\n state name= "+stateDetail.get(0).getStateName());



               // System.out.println("isSuccessful false");
            }

            @Override
            public void onFailure(Call<AnmolData> call, Throwable t) {
                System.out.println("onFailure");
                t.printStackTrace();
                t.getMessage();
                Log.v("API","apiService response onFailure");
                Log.v("API",t.getMessage());
            }
        });




    }

    private void initViews() {
        textView=(TextView)findViewById(R.id.tv);
    }
}
