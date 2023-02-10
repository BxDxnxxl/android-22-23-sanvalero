package com.example.myapplication.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.retrofit.Interface.JsonPlaceHolder;
import com.example.myapplication.retrofit.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView mJsonTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJsonTxtView = findViewById(R.id.jsonText);
    }

    private void getPosts(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/posts")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);
        Call<List<Posts>> call = (Call<List<Posts>>) jsonPlaceHolder.getPosts();
        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                if(!response.isSuccessful()){
                    mJsonTxtView.setText("codigo "+ response.code());
                }
                List<Posts> postsList = response.body();
                for(Posts post: postsList ){
                    String content= "";
                    content += "userId: "+post.getUserId() + "\n";
                    content += "id: "+post.getId() + "\n";
                    content += "Tittle: "+post.getTitle() + "\n";
                    content += "Body: "+post.getBody() + "\n";
                    mJsonTxtView.append(content);
                    getPosts();


                }
            }
            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                mJsonTxtView.setText(t.getMessage());
            }
        });
    }
}