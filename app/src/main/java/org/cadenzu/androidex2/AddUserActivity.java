package org.cadenzu.androidex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

    }

    public void createNewUser(View view) {

        EditText firstNameInput = findViewById(R.id.txtUserFirstName);
        EditText lastNameInput = findViewById(R.id.txtUserLastName);
        EditText emailInput = findViewById(R.id.txtUserEmail);

        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String email = emailInput.getText().toString();

        RadioGroup degreeProgramInput = findViewById(R.id.rgDegreeProgram);
        String degreeProgram = "Degree Program";

        switch (degreeProgramInput.getCheckedRadioButtonId()) {
            case R.id.rbTietotekniikka:
                degreeProgram = "Tietotekniikka";
                break;

            case R.id.rbTuotantotalous:
                degreeProgram = "Tuotantotalous";
                break;

            case R.id.rbLaskennallinen:
                degreeProgram = "Laskennallinen tekniikka";
                break;

            case R.id.rbSahkotekniikka:
                degreeProgram = "Sähkötekniikka";
                break;

        }


        User user = new User(firstName, lastName, degreeProgram, email);
        System.out.println(user.getFirstName() + "" + user.getLastName() + "" + user.getDegreeProgram() + "" + user.getEmail());
        UserStorage.getInstance().addUser(user);

    }
}