package com.example.matt.llr_toolkit;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class ImportAdd extends Fragment {
    private static final String TAG = "ImportAdd";

    private Spinner spnClient;
    private EditText etOrderNum, etShippingNum;
    private Button btnAdd;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clientadd,container,false);

        spnClient = (Spinner) view.findViewById(R.id.spn_importadd_client);
        etOrderNum = (EditText) view.findViewById(R.id.et_importadd_ordernum);
        etShippingNum = (EditText) view.findViewById(R.id.et_importadd_shippingnum);
        btnAdd = (Button) view.findViewById(R.id.btn_clientadd_add);

        return view;
    }
}