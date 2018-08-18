package me.ferdz.tutorfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import me.ferdz.tutorfinder.features.onboarding.ActivityStudentOnboarding;
import me.ferdz.tutorfinder.features.signup.SignupActivity;

import static me.ferdz.tutorfinder.Constants.IS_TUTOR_EXTRA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.select_student_button)
    public void onClick_selectStudentButton(View view) {
        Intent intent = new Intent(this, ActivityStudentOnboarding.class);
        startActivity(intent);
    }

    @OnClick(R.id.select_tutor_button)
    public void onClick_selectTutorButton(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        intent.putExtra(IS_TUTOR_EXTRA, true);
        startActivity(intent);
    }
}
