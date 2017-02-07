package pl.projekt.zadanko.truerace;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class LoginActivity extends Activity {

    EditText email;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.login_email);
        password = (EditText) findViewById(R.id.login_password);
        button = (Button) findViewById(R.id.login_button);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //dodać sprawdzenie czy istnieje takie konto
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Toast.makeText(getApplicationContext(), "Login succesfully" , Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });


    }

}
