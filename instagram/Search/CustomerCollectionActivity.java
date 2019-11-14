package com.example.instagram.Search;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;
import java.util.List;

public class CustomerCollectionActivity extends AppCompatActivity {

    RelativeLayout rel_customerHeader, rel_customerDetailParent, rel_viewSummary;
    //    ExpandableLayout el_accountDetails;
    ImageView ivback;
    TextView tv_toolbarLabel,
            tv_chooseOrderLabel, tv_itemLabel, tv_qtyLabel,
            tv_viewSummaryLabel, tv_noMoreDataLabel;
    EditText et_SearchList;

    Spinner sp_orderType;
    List<SpinnerList> spinnerLists;
    SpinnerAdapter spinnerAdapter;

    RecyclerView rv_collectionCount;
    RecyclerView.LayoutManager mLayoutManager;
    CustomerCollectionAdapter detailsAdapter;
    List<CustomerCollectionLists> detailsLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_collection);

        cast();

        mLayoutManager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
        rv_collectionCount.setLayoutManager(mLayoutManager);
        rv_collectionCount.setAdapter(detailsAdapter);

        createCollectionList();
//        createSpinnerList();



        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        rel_viewSummary.setOnClickListener(new View.OnClickListener() {
             class SaveSharedPreference {
            }

            @Override
            public void onClick(View v) {
//                SaveSharedPreference.getCustomerCollectionLists(detailsLists);
                startActivity(new Intent(getApplicationContext(), CustomerCollectionActivity.class));
            }
        });

        et_SearchList.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (detailsAdapter != null){
                    detailsAdapter.getFilter().filter(s.toString().toLowerCase());
                }
            }
        });

        setupUI(rel_customerDetailParent);

    }



//    private void createSpinnerList() {
//        String[] orderType = {"Staff Laundry", "Uniform", "Guest Laundry"};
//        for (String anOrderType : orderType) {
//            spinnerLists.add(new SpinnerList(anOrderType));
//        }
//        spinnerAdapter = new SpinnerAdapter(getApplicationContext(), spinnerLists) {
//            @Override
//            public void registerDataSetObserver(DataSetObserver observer) {
//
//            }
//
//            @Override
//            public void unregisterDataSetObserver(DataSetObserver observer) {
//
//            }
//
//            @Override
//            public int getCount() {
//                return 0;
//            }
//
//            @Override
//            public Object getItem(int position) {
//                return null;
//            }
//
//            @Override
//            public long getItemId(int position) {
//                return 0;
//            }
//
//            @Override
//            public boolean hasStableIds() {
//                return false;
//            }
//
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                return null;
//            }
//
//            @Override
//            public int getItemViewType(int position) {
//                return 0;
//            }
//
//            @Override
//            public int getViewTypeCount() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Nullable
//            @Override
//            public CharSequence[] getAutofillOptions() {
//                return new CharSequence[0];
//            }
//
//            @Override
//            public View getDropDownView(int position, View convertView, ViewGroup parent) {
//                return null;
//            }
//        };
//        sp_orderType.setAdapter(spinnerAdapter);
//    }

    private void cast() {
        rel_customerHeader = findViewById(R.id.rel_customerHeader);
//        el_accountDetails = findViewById(R.id.el_accountDetails);
        rel_customerDetailParent = findViewById(R.id.rel_customerDetailParent);
        detailsLists = new ArrayList<>();
        rel_viewSummary = findViewById(R.id.rel_viewSummary);
        ivback = findViewById(R.id.ivback);
        tv_toolbarLabel = findViewById(R.id.tv_toolbarLabel);
        tv_chooseOrderLabel = findViewById(R.id.tv_chooseOrderLabel);
        tv_itemLabel = findViewById(R.id.tv_itemLabel);
        tv_qtyLabel = findViewById(R.id.tv_qtyLabel);
        tv_viewSummaryLabel = findViewById(R.id.tv_viewSummaryLabel);
        et_SearchList = findViewById(R.id.et_SearchList);
        sp_orderType = findViewById(R.id.sp_orderType);
        rv_collectionCount = findViewById(R.id.rv_collectionCount);
        spinnerLists = new ArrayList<>();
        tv_noMoreDataLabel = findViewById(R.id.tv_noMoreDataLabel);
    }

    public void hideSoftKeyboard(View view) {
        InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (in != null){
            in.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public void setupUI(View view) {

        //Set up touch listener for non-text box views to hide keyboard.
        if(!(view instanceof EditText)) {

            view.setOnTouchListener(new View.OnTouchListener() {

                @SuppressLint("ClickableViewAccessibility")
                public boolean onTouch(View v, MotionEvent event) {
                    hideSoftKeyboard(v);
                    return false;
                }

            });
        }

        //If a layout container, iterate over children and seed recursion.
        if (view instanceof ViewGroup) {

            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {

                View innerView = ((ViewGroup) view).getChildAt(i);

                setupUI(innerView);
            }
        }
    }

    private void createCollectionList() {

        String[] title = {"Gents Shirt", "Gents Pants", "Curtains", "Gloves", "Towel"};

        String[] itemcode = {"ITM-001", "ITM-002", "ITM-002", "ITM-004", "ITM-005"};

        String[] qty = {"15", "10", "0", "11", "0"};


        for (int i = 0; i < title.length; i++) {
            detailsLists.add(new CustomerCollectionLists(title[i],itemcode[i], qty[i]));
        }
        detailsAdapter = new CustomerCollectionAdapter(CustomerCollectionActivity.this, detailsLists);
        rv_collectionCount.setAdapter(detailsAdapter);

    }

    public void setNoDataLabelVisibility(boolean status){
        if (status){
            tv_noMoreDataLabel.setVisibility(View.VISIBLE);
        }
        else {
            tv_noMoreDataLabel.setVisibility(View.GONE);
        }
    }

    private class SpinnerList {
        public SpinnerList(String anOrderType) {
        }
    }
}

