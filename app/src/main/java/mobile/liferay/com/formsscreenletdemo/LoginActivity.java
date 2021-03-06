package mobile.liferay.com.formsscreenletdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.liferay.mobile.screens.auth.login.LoginListener;
import com.liferay.mobile.screens.auth.login.LoginScreenlet;
import com.liferay.mobile.screens.context.User;

public class LoginActivity extends AppCompatActivity implements LoginListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        LoginScreenlet loginScreenlet = findViewById(R.id.login);
        loginScreenlet.setListener(this);
    }

    @Override
    public void onLoginSuccess(User user) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }

    @Override
    public void onLoginFailure(Exception e) {

    }

    @Override
    public void onAuthenticationBrowserShown() {

    }
}
