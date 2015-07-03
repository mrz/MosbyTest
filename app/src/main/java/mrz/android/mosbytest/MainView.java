package mrz.android.mosbytest;

import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

public interface MainView extends MvpLceView<String> {

    void setString(String aString);

}
