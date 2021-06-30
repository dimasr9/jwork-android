package dimasradhitya.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class JobFetchRequest extends StringRequest {
    //Variabel yang digunakan
    private static final String URLJobseeker = "http://10.0.2.2/invoice/Jobseeker/";
    private Map<String, String> params;

    /**
     * Konstruktur kelas dengan parameter id jobseeker
     * @param jobseekerID
     * @param listener
     */
    public JobFetchRequest(String jobseekerID, Response.Listener<String> listener) {
        super(Method.GET, URLJobseeker+jobseekerID, listener, null);
        params = new HashMap<>();
    }
}

