package com.didactapp.android.cloudbookdetail;

import com.didactapp.android.coreapp.base.BasePresenter;
import com.didactapp.android.coreapp.base.BaseView;


public interface DetailContract {

    interface View extends BaseView<Presenter> {

        void showDetail();

        void hideDetail();

        void showSpinner();

        void hideSpinner();

        void showLoadError();

        void hideLoadError();

        void showNoNetwork();

        void hideNoNetwork();

        void showCloudLibraryUi();

    }

    interface Presenter extends BasePresenter<View> {
        void openLibrary();
    }

}
