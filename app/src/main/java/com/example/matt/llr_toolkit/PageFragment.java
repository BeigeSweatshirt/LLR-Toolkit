package com.example.matt.llr_toolkit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PageFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public PageFragment () {
    }

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int page = getArguments().getInt(ARG_PAGE_NUMBER, -1);
        if (page == 1) {
            return inflater.inflate(R.layout.fragment_importadd, container, false);
        }
        else if (page == 2) {
            return inflater.inflate(R.layout.fragment_inventoryadd, container, false);
        }
        else {
            return inflater.inflate(R.layout.fragment_clientadd, container, false);
        }
    }
}
