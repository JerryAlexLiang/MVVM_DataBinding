package com.example.databinding_demo02;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinding_demo02.databinding.ItemRvBinding;

import java.util.List;

/**
 * 创建日期：2018/4/14 on 上午2:22
 * 描述:RecyclerView的适配器(结合DataBinding)
 * 作者:yangliang
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    private List<UserBean> mList;
    private Context mContext;
    private LayoutInflater mInflater;

    public RvAdapter(List<UserBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
    }

    /**
     * 创建视图
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemRvBinding binding = DataBindingUtil.inflate(mInflater, R.layout.item_rv,
                parent, false);
        //这里没有将View传入MyViewHolder，而是传入了ItemRvBinding
        return new MyViewHolder(binding);
    }

    /**
     * 绑定数据
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //数据映射
        UserBean userBean = mList.get(position);
        //将相应position的UserBean赋值给绑定的布局文件
        holder.binding.setUserbean(userBean);
//        holder.getBinding().setUserbean(userBean);

    }

    /**
     * 返回数目
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ItemRvBinding binding;

//        public MyViewHolder(View itemView) {
//            super(itemView);
//        }

        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = (ItemRvBinding) binding;
        }

        /**
         * 在MyViewHolder中没有使用findViewById来找到相应的控件，
         * 而是提供了返回ItemRvBinding的方法getBinding()方法
         *
         * @return
         */
        public ItemRvBinding getBinding() {
            //返回ItemRvBinding
            return binding;
        }

    }
}
