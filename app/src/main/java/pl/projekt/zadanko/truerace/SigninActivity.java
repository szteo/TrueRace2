package pl.projekt.zadanko.truerace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class SigninActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email = (EditText) findViewById(R.id.signin_email);
        password = (EditText) findViewById(R.id.signin_password);
        button = (Button) findViewById(R.id.signin_button);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //zapisanie emailu i passwordu do serwera
                Intent intent = new Intent(getApplicationContext(), Signin2Activity.class);

                Toast.makeText(getApplicationContext(), "Sign in successfuly", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

    }


}
