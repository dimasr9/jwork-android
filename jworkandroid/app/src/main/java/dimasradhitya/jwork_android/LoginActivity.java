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

/**
 * Class yang menyimpan fungsi aktivitas login
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class LoginActivity extends AppCompatActivity {

    /**
     * class oncreate saat pembuatan view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextEmail = findViewById(R.id.editTextEmail_Login);
        EditText editTextPassword = findViewById(R.id.editTextPassword_Login);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        TextView plainTextRegister = findViewById(R.id.plainTextRegister_Login);
        editTextEmail.setText("dimasradhitya9@gmail.com");
        editTextPassword.setText("Password123");

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            /**
             * method membaca oncreate
             * @param view
             */
           public void onClick(View view){
               String email = editTextEmail.getText().toString();
               String password = editTextPassword.getText().toString();
               Response.Listener<String> responseListener = response -> {
                       try {
                       JSONObject jsonObject = new JSONObject(response);
                       if ( jsonObject != null ) {
                           Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                           loginIntent.putExtra("jobseekerId", jsonObject.getInt("id"));
                           loginIntent.addFlags(loginIntent.FLAG_ACTIVITY_CLEAR_TOP);
                           Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                           startActivity(loginIntent);
                           finish();
                            }
                       } catch (JSONException error){
                           Toast.makeText(LoginActivity.this, "Login Failed",
                                   Toast.LENGTH_SHORT).show();
                       }
               };
               LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
               RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
               queue.add(loginRequest);
           }
        });

        plainTextRegister.setOnClickListener(new View.OnClickListener(){
            /**
             * method untuk membaca tombol ditekan
             * @param view
             */
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}