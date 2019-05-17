package com.example.absin.firebasebus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*텍스트 뷰에 줄 넣으려고*/
        TextView textView = (TextView) findViewById(R.id.main_search);
        LinearLayout go_search = (LinearLayout) findViewById(R.id.go_to_search); //검색 화면으로 가기 위해서 이 화면을 클릭해야한다

        final LinearLayout main_map = (LinearLayout) findViewById(R.id.main_tap_map); //final은 내부 클래스에서 동작을 해야할때 써야된다는데 혹시 어떻게 될지 몰라서 써두었다.
        final LinearLayout main_home = (LinearLayout) findViewById(R.id.main_tap_home);

        String sitename = "검색창 수정예정";
        textView.setText(Html.fromHtml("<u>" + sitename + "</u>"));


        //검색창을 누르면 검색 화면으로 넘어가는 코드
        go_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_barJ.class);
                startActivity(intent);
            }
        });

        main_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /*
                android:clickable="true"
                android:background="?attr/selectableItemBackground"
                XML 코드에 이 부분 추가해서 클릭할때 그림자 이펙트가 들도록 했다.
                일반 그림자가 아니라 색이 있는 그림자 퍼짐 효과를 원할떄는
                https://soulduse.tistory.com/52 여기 보고 하면 될 것 같음!
                 */
            }
        });

        main_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_map.setBackgroundResource(R.color.tab_blue);
                //여긴 클릭을 하면 아예 파란색으로 바꾸는 걸로 해봤는데 생각보다 촌스러워서 그림자 지는게 더 좋을것 같다.
            }
        });




    }
}
