package com.didactapp.android.cloudbookdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;


public final class BookDetailView extends ScrollView implements DetailContract.View {

    private ProgressBar spinner;
    private TextView noNetwork;
    private TextView loadError;
    private DetailContract.Presenter presenter;

    public BookDetailView(Context context) {
        this(context, null);
    }

    public BookDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        /* inflate layout */
        inflate(getContext(), R.layout.view_book_detail, this);

        /* get layout elements */
//        spinner = findViewById(R.id.progress_spinner);
//        noNetwork = findViewById(R.id.no_network);
//        loadError = findViewById(R.id.loading_error);

        /* init presenter */
        presenter = new DetailPresenter();
        presenter.takeView(this);

    }

    @Override
    public void showDetail() {

    }

    @Override
    public void hideDetail() {

    }

    @Override
    public void showSpinner() {

    }

    @Override
    public void hideSpinner() {

    }

    @Override
    public void showLoadError() {

    }

    @Override
    public void hideLoadError() {

    }

    @Override
    public void showNoNetwork() {

    }

    @Override
    public void hideNoNetwork() {

    }

    @Override
    public void showCloudLibraryUi() {

    }
}

