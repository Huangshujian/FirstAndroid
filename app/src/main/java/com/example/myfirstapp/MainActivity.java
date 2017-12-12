package com.example.myfirstapp;
import com.example.myfirst.temp.User;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mUserName,mPassword,mFirmPassword;
    RadioButton mMale,mFemale;
    CheckBox mPlay,mSleep,mlove;
    Spinner mCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_register);
        initView();
    }

    private void initView() {
        mUserName = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mFirmPassword = (EditText) findViewById(R.id.firmpassword);

        mMale = (RadioButton)findViewById(R.id.manradiobtn);
        mFemale = (RadioButton)findViewById(R.id.femenradiobtn);

        mPlay = (CheckBox)findViewById(R.id.play);
        mSleep = (CheckBox)findViewById(R.id.sleep);
        mlove = (CheckBox)findViewById(R.id.love);

        mCity = (Spinner) findViewById(R.id.city);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.exitbtn:
                finish();    //关闭当前Activity
                break;
            case R.id.registerbtn:
                String Username = mUserName.getText().toString();
                if(TextUtils.isEmpty(Username)) {
                    Toast.makeText(this,"用户名不能为空",Toast.LENGTH_SHORT).show();
                    return ;
                }
                String Password = mPassword.getText().toString();
                if (TextUtils.isEmpty(Password)) {
                   // Toast.makeText(this,"密码不能为空",Toast.LENGTH_SHORT).show();
                    mPassword.setError("密码不能为空");
                    return ;
                }
                String FirmPassword = mFirmPassword.getText().toString();
                if(TextUtils.isEmpty(FirmPassword)) {
                    mFirmPassword.setError("确认密码不能为空");
                    return ;
                }
                if(!FirmPassword.equals(Password)) {
                    mFirmPassword.setError("与密码不一致！！");
                    return ;
                }
                char sex;
                if(mMale.isChecked()) {
                    sex = mMale.getText().toString().charAt(0);
                }
                else if(mFemale.isChecked()) {
                    sex = mFemale.getText().toString().charAt(0);
                }
                else {
                    sex = '无';
                }

                StringBuilder sb = new StringBuilder();
                if(mPlay.isChecked()) {
                    sb.append(mPlay.getText().toString());
                }
                if(mSleep.isChecked()) {
                    sb.append(" ").append(mSleep.getText().toString());
                }
                if(mlove.isChecked()) {
                    sb.append(" ").append(mlove.getText().toString());
                }
                String city = mCity.getSelectedItem().toString();
                User user = new User(Username,Password,sex,sb.toString(),city);
                Toast.makeText(this,"注册成功："+user.toString(),Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
