package com.qoobico.remindme.Fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by neil on 4/13/2016.
 */
public class AbstractTabFragment extends Fragment {
    protected String title;
    protected Context context;
    protected View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
