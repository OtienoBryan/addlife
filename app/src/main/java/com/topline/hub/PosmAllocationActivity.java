package com.topline.hub;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class PosmAllocationActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Posm_model> appoint;
    private PosmAdapter adapter;
    private ApiInterface apiInterface;
    private ProgressBar progressBar;

    private EditText editSearch;
    String userId,outletId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posm_allocation);

        //getSupportActionBar().setHomeButtonEnabled(true);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressBar = (ProgressBar)findViewById(R.id.progress);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        editSearch = (EditText)findViewById(R.id.posm_search);

        userId = SharedPrefManager.getInstance(this).getUserId().toString();
        outletId = SharedPrefManager.getInstance(this).getOutletId().toString();




        editSearch.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {



            }

            @Override
            public void afterTextChanged(Editable newText) {
                //after the change calling the method and passing the search input
                //filter(editable.toString());
                fetchPosm( newText.toString(), userId);
            }
        });

        fetchPosm("",outletId);

    }


    public void fetchPosm(String key,String userId){

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        retrofit2.Call<List<Posm_model>> call = apiInterface.getPosm(key,userId);

        call.enqueue(new Callback<List<Posm_model>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Posm_model>> call, Response<List<Posm_model>> response) {

                progressBar.setVisibility(View.GONE);

                appoint = response.body();
                adapter = new
                        PosmAdapter(appoint, PosmAllocationActivity.this);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(retrofit2.Call<List<Posm_model>> call, Throwable t) {

                progressBar.setVisibility(View.GONE);
                Toast.makeText(PosmAllocationActivity.this, "Error Loading Data Try again", Toast.LENGTH_SHORT).show();

            }
        });


    }


    public void onBackPressed(){
        //super.onBackPressed();

        Intent intent = new Intent(PosmAllocationActivity.this, QuestionsActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
