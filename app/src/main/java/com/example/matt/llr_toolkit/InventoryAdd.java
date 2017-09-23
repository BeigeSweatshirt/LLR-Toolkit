package com.example.matt.llr_toolkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class InventoryAdd extends Fragment {

    private ImageButton ibPrint;
    private AutoCompleteTextView actvStyle;
    private Spinner spnSize, spnImport;
    private EditText etTags, etWholesale, etDate, etRetail;
    private Button btnAdd;

    public InventoryAdd () {
    }

    public static InventoryAdd newInstance (int page) {
        return new InventoryAdd();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inventoryadd, container, false);

        ibPrint = (ImageButton) view.findViewById(R.id.ib_inventoryadd_print);
        actvStyle = (AutoCompleteTextView) view.findViewById(R.id.actv_inventoryadd_style);
        spnSize = (Spinner) view.findViewById(R.id.spn_inventoryadd_size);
        spnImport = (Spinner) view.findViewById(R.id.spn_inventoryadd_import);
        etTags = (EditText) view.findViewById(R.id.et_inventoryadd_tags);
        etWholesale = (EditText) view.findViewById(R.id.et_inventoryadd_wholesale);
        etDate = (EditText) view.findViewById(R.id.et_inventoryadd_date);
        etRetail = (EditText) view.findViewById(R.id.et_inventoryadd_retail);
        btnAdd = (Button) view.findViewById(R.id.btn_inventoryadd_add);

        return view;
    }
}

