package mrz.android.mosbytest;

import com.hannesdorfmann.mosby.mvp.rx.lce.MvpLceRxPresenter;

public class MainPresenter extends MvpLceRxPresenter<MainView, String> {

    public void loadString() {
        if(isViewAttached()) {
            getView().setString("A new string");
        }
    }

}
