package com.kelsonprime.cardtree;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.widget.CardScrollAdapter;

public class ScrollAdapter extends CardScrollAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public int findIdPosition(Object o) {
        return 0;
    }

    @Override
    public int findItemPosition(Object o) {
        return 0;
    }
}
