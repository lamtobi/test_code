package com.example.test_code;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserviewHodel>{
    private Context mconContext;
    private List<User>muser;

    public UserAdapter(Context mconContext) {
        this.mconContext = mconContext;
    }
    public  void setdata(List<User>list){
        this.muser=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserviewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new UserviewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserviewHodel holder, int position) {
User user=muser.get(position);
if (user==null){
    return;
}else{
    holder.img.setImageResource(user.src);
    holder.txt.setText(user.text);
}
    }

    @Override
    public int getItemCount() {
        if(muser!=null){
            return muser.size();
        }
        return 0;
    }

    public class UserviewHodel extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;
        public UserviewHodel(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            txt=itemView.findViewById(R.id.txt);
        }
    }
}
