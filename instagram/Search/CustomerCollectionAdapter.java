package com.example.instagram.Search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerCollectionAdapter extends RecyclerView.Adapter<CustomerCollectionAdapter.MyViewHolder>
        implements Filterable {

    private Context mContext;
    private List<CustomerCollectionLists> customerCollectionLists;
    private ArrayList<CustomerCollectionLists> mStringFilterList;
    private CustomerCollectionAdapter.ValueFilter valueFilter;

    class MyViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout const_collectionHeader;
        RelativeLayout rel_listHeader;
        TextView tv_itemValue,tv_itemCodeValue;
        ImageView iv_minus, iv_plus;
        EditText et_qty;

        MyViewHolder(View view) {
            super(view);

            const_collectionHeader = view.findViewById(R.id.const_collectionHeader);
            rel_listHeader = view.findViewById(R.id.rel_listHeader);
            tv_itemValue = view.findViewById(R.id.tv_itemValue);
            tv_itemCodeValue = view.findViewById(R.id.tv_itemCodeValue);
            iv_minus = view.findViewById(R.id.iv_minus);
            iv_plus = view.findViewById(R.id.iv_plus);
            et_qty = view.findViewById(R.id.et_qty);

        }

    }

    public CustomerCollectionAdapter(Context context, List<CustomerCollectionLists> detailsLists) {
        this.mContext = context;
        this.customerCollectionLists = detailsLists;
        customerCollectionLists.remove(new CustomerCollectionLists( null, null,null));
        this.mStringFilterList = (ArrayList<CustomerCollectionLists>) customerCollectionLists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.customercollection_adapter, parent, false);

        return new MyViewHolder(itemView);

    }



    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        final CustomerCollectionLists item = customerCollectionLists.get(holder.getAdapterPosition());

        if (item.getQty() == (null)
                && item.getTitle() == (null)
        ){
            holder.const_collectionHeader.setVisibility(View.INVISIBLE);
        }
        else {
            holder.const_collectionHeader.setVisibility(View.VISIBLE);
        }

        holder.tv_itemValue.setText(item.getTitle());
        holder.tv_itemCodeValue.setText(item.getItemcode());
        holder.et_qty.setText(item.getQty());

        holder.et_qty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

//                i = Integer.parseInt(holder.et_qty.getText().toString());
//
//                customerCollectionLists.set(holder.getAdapterPosition(),
//                        new CustomerCollectionLists(item.getTitle(), item.getItemcode(),
//                                String.valueOf(i)));
//                notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable editable) {



            }
        });


        holder.iv_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int t = Integer.parseInt(holder.et_qty.getText().toString());

                if (!(t <=0)) {
                    t--;

                    customerCollectionLists.set(holder.getAdapterPosition(),
                            new CustomerCollectionLists(item.getTitle(), item.getItemcode(),
                                    String.valueOf(t)));
                    notifyDataSetChanged();

                }
            }
        });

        holder.iv_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int t = Integer.parseInt(holder.et_qty.getText().toString());

                t++;

                customerCollectionLists.set(holder.getAdapterPosition(),
                        new CustomerCollectionLists(item.getTitle(), item.getItemcode(),
                                String.valueOf(t)));
                notifyDataSetChanged();

            }
        });

        setupUI(holder.rel_listHeader);

    }

    @Override
    public int getItemCount() {
        return customerCollectionLists.size();
    }

    @Override
    public Filter getFilter() {
        if(valueFilter==null) {
            valueFilter=new CustomerCollectionAdapter.ValueFilter();
        }
        return valueFilter;
    }

    private class ValueFilter extends Filter {
        //Invoked in a worker thread to filter the data according to the constraint.
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results=new FilterResults();
            if(constraint!=null && constraint.length()>0){
                ArrayList<CustomerCollectionLists> filterList = new ArrayList<>();
                for(int i=0;i<mStringFilterList.size();i++){
                    if( (mStringFilterList.get(i).getTitle()).toLowerCase()
                            .contains(constraint.toString().toLowerCase())
                    ) {
                        CustomerCollectionLists collectionList = new CustomerCollectionLists(
                                mStringFilterList.get(i).getTitle(),
                                mStringFilterList.get(i).getItemcode(),
                                mStringFilterList.get(i).getQty()

                        );
                        collectionList.setTitle(mStringFilterList.get(i).getTitle());
                        collectionList.setTitle(mStringFilterList.get(i).getItemcode());
                        collectionList.setQty(mStringFilterList.get(i).getQty());

                        filterList.add(collectionList);
                    }
                }
                results.count= filterList.size();
                results.values= filterList;
            }
            else{
                results.count=mStringFilterList.size();
                results.values=mStringFilterList;
            }
            return results;
        }

        //Invoked in the UI thread to publish the filtering results in the user interface.
        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            customerCollectionLists = (ArrayList<CustomerCollectionLists>) filterResults.values;
            notifyDataSetChanged();
            if (customerCollectionLists.size() == 0){
                ((CustomerCollectionActivity)mContext).setNoDataLabelVisibility(true);
            }
            else {
                ((CustomerCollectionActivity)mContext).setNoDataLabelVisibility(false);
            }
        }

    }

    private void setupUI(View view) {

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

    private void hideSoftKeyboard(View view) {
        InputMethodManager in = (InputMethodManager)
                Objects.requireNonNull((CustomerCollectionActivity)mContext)
                        .getSystemService(Context.INPUT_METHOD_SERVICE);
        if (in != null){
            in.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


}
