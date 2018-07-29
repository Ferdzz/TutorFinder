package me.ferdz.tutorfinder;

import android.content.Intent;
import android.support.v4.provider.SelfDestructiveThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

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
        Toast.makeText(this, "Selected student button", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.select_tutor_button)
    public void onClick_selectTutorButton(View view) {
        Toast.makeText(this, "Selected tutor button", Toast.LENGTH_SHORT).show();
    }
}
