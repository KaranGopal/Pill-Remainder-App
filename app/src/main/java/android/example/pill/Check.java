package android.example.pill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
    }
    public void aboutUs(View view) {
        startActivity(new Intent(Check.this, AboutUs.class));
    }
    public void Activity(View view) {
        startActivity(new Intent(Check.this, Activity.class));
    }

    public void addyourReminder(View view) {
        startActivity(new Intent(Check.this, AddYourReminder.class));
    }

    public void  changePassword(View view) {
        startActivity(new Intent(Check.this, ChangePassword.class));
    }



    public void Login(View view) {
        startActivity(new Intent(Check.this, Login.class));
    }

    public void Medication(View view) {
        startActivity(new Intent(Check.this, Medication.class));
    }

    public void myAlarm(View view) {
        startActivity(new Intent(Check.this, MyAlarm.class));
    }

    public void Planned(View view) {
        startActivity(new Intent(Check.this, Planned.class));
    }

    public void Record(View view) {
        startActivity(new Intent(Check.this, Record.class));
    }

    public void Regular(View view) {
        startActivity(new Intent(Check.this, Regular.class));
    }

    public void Report(View view) {
        startActivity(new Intent(Check.this, Report.class));
    }

    public void Settings(View view) {
        startActivity(new Intent(Check.this, Settings.class));
    }

    public void signUp(View view) {
        startActivity(new Intent(Check.this, SignUp.class));
    }

    public void Theropy(View view) {
        startActivity(new Intent(Check.this, Theropy.class));
    }

    public void Today(View view) {
        startActivity(new Intent(Check.this, Today.class));
    }

    public void Welcome(View view) {
        startActivity(new Intent(Check.this, Welcome.class));
    }

}
