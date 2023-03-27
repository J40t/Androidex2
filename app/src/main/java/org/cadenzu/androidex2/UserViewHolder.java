package org.cadenzu.androidex2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView userFullName, userDegreeProgram, userEmail;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        userFullName = itemView.findViewById(R.id.txtName);
        userDegreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
        userEmail = itemView.findViewById(R.id.txtEmail);
    }
}
