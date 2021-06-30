package dimasradhitya.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Class yang menyimpan fungsi aktivitas register
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class RegisterActivity extends AppCompatActivity implements Response.ErrorListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText editTextName = findViewById(R.id.editTextName_Register);
        EditText editTextEmail = findViewById(R.id.editTextEmail_Register);
        EditText editTextPassword = findViewById(R.id.editTextPassword_Register);
        Button buttonRegister = findViewById(R.id.buttonRegister_Register);

            buttonRegister.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    String name = editTextName.getText().toString();
                    String email = editTextEmail.getText().toString();
                    String password = editTextPassword.getText().toString();
    
                    Response.Listener<String> responseListener = new Response.Listener<String>(){
                        @Override
                        public void onResponse(String response){
                            try{
                                JSONObject jsonObject = new JSONObject(response);
                                if(jsonObject != null){
                                    Toast.makeText(RegisterActivity.this, "Register Successful",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }catch(JSONException error){
                                Toast.makeText(RegisterActivity.this, "Register Failed",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    };
                    RegisterRequest registerRequest = new RegisterRequest(name, email, password, responseListener, RegisterActivity.this);
                    RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                    queue.add(registerRequest);
                }
            });
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }
}