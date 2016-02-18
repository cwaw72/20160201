package com.fit.basic.kr.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.fit.basic.kr.R;

public class Activity_group_view extends FragmentActivity {


    TestFragmentAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mPager.setOffscreenPageLimit(4);

        mIndicator = (IconPageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

        init();
    }

    private void init() {

        Toast.makeText(this, "액티버티를 초기화합니다.", Toast.LENGTH_SHORT).show();

        // 개발자가 만드는 element_는 element_layout.xml을 복사해서 만듬
        // 가능하면 다른 개발자도 공용 디자인객체로 사용할 수 있도록 만듬

        // TextView tv_element_notice_screen_title = (TextView)
        // v.findViewById(R.id.tv_element_notice_screen_title);
        // tv_element_notice_screen_title.setText("advitising banner or network failed \n reconnect");

        LayoutInflater inflater = getLayoutInflater();

        // 헤더와 풋터 초기화
        LinearLayout ll_header = (LinearLayout) findViewById(R.id.ll_header);
        LinearLayout ll_footer = (LinearLayout) findViewById(R.id.ll_footer);
        // 헤더메뉴 R.layout.element_header과 같은 디자인 앨리먼트는 직접 수정하지않음
        // 수정이 필요하면 요구하고, 수정전에는 수정이 되었다고 가정하고 작업함
        // 당연히 프로그램적으로 메모리에 로딩된 것을 수정하는 것은 개발자의 자유

        View element_header = inflater.inflate(R.layout.element_header, ll_header);
        View element_footer = inflater.inflate(R.layout.element_footer, ll_footer);
        // 주의 이런식으로 앨리먼트가 inflate되기 때문에 element의 소속객체 id끼리 중복될수 있다.
        // element 개발자는 소속객체의 id가 중복되지 않기하기 위해서 노력해야한다.
        // 필요시 독립된 캡술화된 객체로 만들수도 있으나 권장하지않음

    }
}
