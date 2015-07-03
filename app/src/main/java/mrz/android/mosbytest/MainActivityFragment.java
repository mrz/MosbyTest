package mrz.android.mosbytest;

import com.hannesdorfmann.mosby.mvp.lce.MvpLceFragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends MvpLceFragment<TextView, String, MainView, MainPresenter> implements MainView {

    private TextView mTextView;

    private Button mButton;

    public MainActivityFragment() {
    }

    @Override public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTextView = (TextView) view.findViewById(R.id.contentView);

        mButton = (Button) view.findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                presenter.loadString();
            }
        });

    }

    @Override protected String getErrorMessage(Throwable throwable, boolean b) {
        return "An error";
    }

    @Override public void setData(String data) {
    }

    @Override public void loadData(boolean pullToRefresh) {
    }

    @Override protected int getLayoutRes() {
        return R.layout.fragment_main;
    }

    @Override public void setString(String aString) {
        mTextView.setText(aString);
    }
}
