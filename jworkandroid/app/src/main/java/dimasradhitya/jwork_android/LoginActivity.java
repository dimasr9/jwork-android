package dimasradhitya.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextEmail = findViewById(R.id.editTextEmail_Login);
        EditText editTextPassword = findViewById(R.id.editTextPassword_Login);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        TextView plainTextRegister = findViewById(R.id.plainTextRegister_Login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view){
               String email = editTextEmail.getText().toString();
               String password = editTextPassword.getText().toString();
               Response.Listener<String> responseListener = new Response.Listener<String>(){
                   @Override
                   public void onResponse(String response){
                       try {
                       JSONObject jsonObject = new JSONObject(response);
                       if ( jsonObject != null ) {
                           Toast.makeText(LoginActivity.this, "Login Successful",
                                   Toast.LENGTH_SHORT).show();
                            }
                       } catch (JSONException error){
                           Toast.makeText(LoginActivity.this, "Login Failed",
                                   Toast.LENGTH_SHORT).show();
                       }
                   }
               };
               LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
               RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
               queue.add(loginRequest);
           }
        });

        plainTextRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this,
                        RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}