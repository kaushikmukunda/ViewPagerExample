package sketch.km.com.viewpagerexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {
    private TextView mInfo;
    private String mDisplayText;
    private static final String TEXT_KEY = "info";

    static public PageFragment newInstance(String text) {
        Bundle args = new Bundle();
        args.putString(TEXT_KEY, text);
        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDisplayText = getArguments().getString(TEXT_KEY, "Empty");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        configureView(view);
        return  view;
    }

    private void configureView(View view) {
        mInfo = (TextView) view.findViewById(R.id.info);
        mInfo.setText(mDisplayText);
    }
}
