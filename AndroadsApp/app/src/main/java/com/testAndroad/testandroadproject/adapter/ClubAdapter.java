package com.testAndroad.testandroadproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testAndroad.testandroadproject.R;
import com.testAndroad.testandroadproject.model.ClubModel;

import java.util.List;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.MemberViewHolder> {
    private List<ClubModel> memberList;
    private Context context;

    public ClubAdapter(List<ClubModel> memberList, Context context) {
        this.memberList = memberList;
        this.context = context;

    }

    @NonNull
    @Override
    public ClubAdapter.MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_view_member, parent, false);

        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.MemberViewHolder holder, int position) {

        ClubModel member = memberList.get(position);
        holder.bind(member);

    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    static class MemberViewHolder extends RecyclerView.ViewHolder {


        private TextView nameTextView;

        private TextView clubPositonTestView;

        private TextView address1TextView;

        private TextView address2TextView;

        private TextView phoneTextView;
        private TextView spouseNameTextView;
        private TextView membershipNoTextView;
        private TextView districtPositionTextView;
        private TextView cellTextView;
        private TextView emailTextView;
        private ImageView memberImage;
        private ImageView spouseImage;
        private ImageView callButton;
        private ImageView emailButton;
        private ImageView textButton;

        public MemberViewHolder(@NonNull View itemView){

            super(itemView);

            nameTextView =itemView.findViewById(R.id.name);
            clubPositonTestView =itemView.findViewById(R.id.clubPosition);
            callButton =itemView.findViewById(R.id.callBtn);
            emailButton =itemView.findViewById(R.id.emailBtn);
             textButton=itemView.findViewById(R.id.massageBtn);
            address1TextView =itemView.findViewById(R.id.address);
            address2TextView =itemView.findViewById(R.id.address2);
            emailTextView =itemView.findViewById(R.id.email);
            phoneTextView =itemView.findViewById(R.id.phone);
            cellTextView =itemView.findViewById(R.id.call);

        }

        public void bind(ClubModel member){

            nameTextView.setText("Name :"+member.getName());
            clubPositonTestView.setText("Club position :"+member.getMemberId());
            address1TextView.setText("Address-1 :"+member.getAddress1());
            address2TextView.setText("Address-2 :"+member.getAddress2());
            emailTextView.setText("Email :"+member.getEmail());
            phoneTextView.setText("Phone :"+member.getPhone());
           cellTextView.setText("call :"+member.getCell());

        }
    }
}


