package com.example.project_43;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project_43.R;
import com.example.project_43.databinding.M001ActBinding;

public class m001_mainAct extends AppCompatActivity implements View.OnClickListener {
        private M001ActBinding binding ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        binding = M001ActBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        initView();
    }

    private void initView() {
        binding.btSub.setOnClickListener(this);
        binding.btSum.setOnClickListener(this);
    }
    private void sum(String NumA,String NumB)
    {
         Double sum = Double.parseDouble(NumA) + Double.parseDouble(NumB)  ;
        Toast.makeText(this, "kết quả : " + sum, Toast.LENGTH_SHORT).show();
    }
    private void sub(String NumA,String NumB)
    {
         Double sub = Double.parseDouble(NumA) - Double.parseDouble(NumB)  ;
        Toast.makeText(this, "kết quả : " + sub, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view) {
            String txtNumA = binding.edtNumA.getText().toString() ;
            String txtNumB = binding.edtNumB.getText().toString() ;
            if(txtNumA.isEmpty() || txtNumB.isEmpty()) {
                Toast.makeText(this, "Chưa nhập số tính cái đầu buổi", Toast.LENGTH_SHORT).show();
                return ;
            }
            if(view.getId() == R.id.bt_sum) sum(txtNumA,txtNumB);
            if(view.getId() == R.id.bt_sub) sub(txtNumA,txtNumB);
    }
}
