//package com.example.instagram.Search;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.instagram.R;
//import com.example.instagram.model.Example;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Filter;
//import java.util.logging.LogRecord;
//
//import javax.annotation.Nullable;
//
//public class ExampleAdapter<ExampleItem> extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> implements filterable {
//    private List<ExampleItem> exampleList;
//    private List<ExampleItem> exampleListFull;
//
//    class ExampleViewHolder extends RecyclerView.ViewHolder {
//        public TextView mTextView1;
//        public TextView mTextView2;
//
//        ExampleViewHolder(View iteamView) {
//            super(iteamView);
//            imageView = itemView.findViewById(R.id.imageView);
//            mTextView1 = iteamView.findViewById(R.id.textView1);
//            mTextView2 = iteamView.findViewById(R.id.textView2);
//        }
//    }
//
//    ExampleAdapter(List<ExampleItem> exampleList) {
//        this.exampleList = exampleList;
//        exampleListFull = new ArrayList<>(exampleList);
//    }
//
//
//    @Nullable
//    @Override
//    public ExampleViewHolder OnCreateHolder(@Nullable ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
//        return new ExampleViewHolder(v);
//    }
//
//
//@Override
//        public void onBindViewHolder(ExampleViewHolder holder,int position){
//    ExampleItem currentItem = exampleList.get(position);
//
//            holder.imageView.setImageResource(currentItem.getImageResource());
//            holder.textView1.setText(currentItem.getText1());
//            holder.textView2.setText(currentItem.getText2());
//
//        }
//        @Override
//                public  int getItemCount() {
//            return exampleList.size();
//        }
//              @Override
//private Filter getFilter(){
//    return exampleFilter;
//}
//private Filter exampleFilter = new Filter() {
//    @Override
//    protected FilterResults performFiltering(CharSequence constraint) {
//       List<ExamleItem>
//    }
//    @Override
//    protected void publishResults(CharSequence constraint,FilterResults results){
//
//    }
//};
//}