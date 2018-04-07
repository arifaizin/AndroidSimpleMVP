package net.krearive.javamvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    private EditText edAlas;
    private EditText edTinggi;
    private Button btnHitung;
    private TextView tvHasil;
    private MainPresenterImp presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initPresenter();

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double alas = Double.valueOf(edAlas.getText().toString());
                Double tinggi = Double.valueOf(edTinggi.getText().toString());

                presenter.hitungLuas(alas, tinggi);
//                //logika
//                Double luas = alas * tinggi;
//                //atur view
//                tvHasil.setText(luas.toString());
            }
        });
    }

    private void initPresenter() {
        presenter = new MainPresenterImp(this);
    }

    private void initView() {
        edAlas = (EditText) findViewById(R.id.ed_alas);
        edTinggi = (EditText) findViewById(R.id.ed_tinggi);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);
    }

    @Override
    public void updateTextHasil(Double luas) {
        tvHasil.setText(luas.toString());
    }
}
