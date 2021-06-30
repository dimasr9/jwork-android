package dimasradhitya.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;


import java.util.HashMap;
import java.util.Map;

/**
 * Class yang menyimpan fungsi request login
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class LoginRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2/jobseeker/login";
    private Map<String, String> params;

    /**
     * constructor login request
     * @param email
     * @param password
     * @param listener
     */
    public LoginRequest(String email, String password,
                           Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    /**
     * method getparams
     * @return params
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
