package keyalive.com.educatin.LoginRegister;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import keyalive.com.educatin.MainActivity;
import keyalive.com.educatin.MenuActivity;
import keyalive.com.educatin.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView2;
    private ImageView btnNext;
    private TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNext:
                startActivity(new Intent(this, MenuActivity.class));
                break;
            case R.id.btn_back:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }

    private void initView() {
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        btnNext = (ImageView) findViewById(R.id.btnNext);
        btnBack = (TextView) findViewById(R.id.btn_back);
    }
}
