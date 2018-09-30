package com.loonggg.rvbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.loonggg.rvbanner.lib.RecyclerViewBanner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerViewBanner recyclerViewBanner1 = (RecyclerViewBanner) findViewById(R.id.rv_banner_1);
        RecyclerViewBanner recyclerViewBanner2 = (RecyclerViewBanner) findViewById(R.id.rv_banner_2);
        RecyclerViewBanner recyclerViewBanner3 = (RecyclerViewBanner) findViewById(R.id.rv_banner_3);
        RecyclerViewBanner recyclerViewBanner4 = (RecyclerViewBanner) findViewById(R.id.rv_banner_4);
        RecyclerViewBanner recyclerViewBanner5 = (RecyclerViewBanner) findViewById(R.id.rv_banner_5);

        final List<String> banners = new ArrayList<>();
        banners.add("https://gss1.bdstatic.com/-vo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268%3Bg%3D0/sign=48e3169db5fb43161a1f7d7c189f211e/7e3e6709c93d70cf4e49dc5bffdcd100baa12b30.jpg");
        banners.add("https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268%3Bg%3D0/sign=4092eea4d20735fa91f049bfa66a688e/cb8065380cd791237c57d8cbab345982b3b780de.jpg");
        banners.add("https://thumb1.shutterstock.com/display_pic_with_logo/191161/137554559/stock-photo-number-three-on-athletics-all-weather-running-track-137554559.jpg");
        banners.add("http://www.shejiye.com/uploadfile/icon/2017/0203/shejiyeicongd5x12jczpr.png");
        banners.add("https://gss1.bdstatic.com/-vo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268%3Bg%3D0/sign=173dce080d24ab18e016e6310dc181f0/b3119313b07eca80206312c9952397dda14483bd.jpg");
        //recyclerViewBanner1.setRvAutoPlaying(false);

        recyclerViewBanner1.setAdapter(new MyAdapter(this, banners));

    }
}
