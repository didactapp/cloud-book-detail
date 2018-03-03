package com.didactapp.android.cloudbookdetail;

/**
 * class to handle books presentation logic
 */
public final class DetailPresenter implements DetailContract.Presenter {
    private DetailContract.View view;

    @Override
    public void openLibrary() {

    }

    @Override
    public void takeView(DetailContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }
}
