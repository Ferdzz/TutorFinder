package me.ferdz.tutorfinder.features.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.ferdz.tutorfinder.R;
import me.ferdz.tutorfinder.models.UserSignupRequest;

import static me.ferdz.tutorfinder.Constants.IS_TUTOR_EXTRA;

public class SignupActivity extends AppCompatActivity {

    @BindView(R.id.signup_firstName)
    protected EditText firstName;
    @BindView(R.id.signup_lastName)
    protected EditText lastName;
    @BindView(R.id.signup_email)
    protected EditText email;
    @BindView(R.id.signup_password)
    protected EditText password;
    @BindView(R.id.signup_confirmPassword)
    protected EditText confirmPassword;

    boolean isTutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

        // This is needed to determine which signup flow and type of account is being created
        isTutor = getIntent().getBooleanExtra(IS_TUTOR_EXTRA, true);
    }

    @OnClick(R.id.signup_btn)
    protected void Signup() {
        // TODO: 8/18/2018 Execute signup logic and field validation here
    }
}
