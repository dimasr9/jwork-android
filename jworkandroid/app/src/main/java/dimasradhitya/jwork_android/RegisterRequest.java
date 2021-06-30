package dimasradhitya.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class yang menyimpan fungsi request register
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class RegisterRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2/jobseeker/register";
    private Map<String, String> params;

    /**
     * constructor register request
     * @param name
     * @param email
     * @param password
     * @param listener
     */
    public RegisterRequest(String name, String email, String password,
                           Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, URL, listener, errorListener);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
    }

    /**
     * method getter params
     * @return params
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }

}
