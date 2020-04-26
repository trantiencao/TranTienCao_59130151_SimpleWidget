package vn.edu.ntu.trantiencao.trantiencao_59130151_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ten, ngaySinh, soThichKhac;
    RadioGroup rdgGioiTinh, rdgSoThich;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    private void addView() {
        ten = findViewById(R.id.edtTen);
        ngaySinh = findViewById(R.id.edtNgaySinh);
        soThichKhac = findViewById(R.id.edtSoThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        rdgSoThich = findViewById(R.id.rdgSoThich);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outToast();
            }
        });
    }

    private void outToast() {
        String gt;
        switch (rdgGioiTinh.getCheckedRadioButtonId()) {
            case R.id.rbtnNam:
                gt="Nam";
                break;
            case R.id.rbtnNu:
                gt="Nữ";
                break;
            default:
                gt = "";
                break;
        }
        Toast.makeText(getApplicationContext(),ten.getText().toString()+"\n"
                +"Ngày sinh: "+ngaySinh.getText().toString()+"\n"
                +"Giới tính: "+gt+"\n"
                +"Sở thích: ", Toast.LENGTH_SHORT).show();
    }
}
