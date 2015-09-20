package sketch.km.com.viewpagerexample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import sketch.km.com.viewpagerexample.PageFragment;

public class PageAdapter extends FragmentPagerAdapter {
    private final int NUM_PAGES = 3;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment page = PageFragment.newInstance("This is page " + i);
        return page;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
