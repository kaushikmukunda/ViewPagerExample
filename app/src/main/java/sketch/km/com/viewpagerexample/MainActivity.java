package sketch.km.com.viewpagerexample;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import sketch.km.com.viewpagerexample.adapter.PageAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager mPager;
    FragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new PageAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);

    }
}
