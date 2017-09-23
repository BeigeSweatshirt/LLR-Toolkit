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

public class ClientAdd extends Fragment {
    private static final String TAG = "ClientAdd";

    private ImageButton ibImage;
    private EditText etFName, etLName, etDOB, etAddress, etPhone, etEmail, etNotes;
    private Button btnAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clientadd,container,false);

        ibImage = (ImageButton) view.findViewById(R.id.ib_clientadd_image);
        etFName = (EditText) view.findViewById(R.id.et_clientadd_fname);
        etLName = (EditText) view.findViewById(R.id.et_clientadd_lname);
        etDOB = (EditText) view.findViewById(R.id.et_clientadd_dob);
        etAddress = (EditText) view.findViewById(R.id.et_clientadd_address);
        etPhone = (EditText) view.findViewById(R.id.et_clientadd_phone);
        etEmail = (EditText) view.findViewById(R.id.et_clientadd_email);
        etNotes = (EditText) view.findViewById(R.id.et_clientadd_notes);
        btnAdd = (Button) view.findViewById(R.id.btn_clientadd_add);

        return view;
    }
}