package dimasradhitya.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class yang menyimpan fungsi request batal job
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class JobBatalRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2/invoice/InvoiceStatus/";
    private final Map<String, String> params;

    public JobBatalRequest(String id, Response.Listener<String> listener) {
        super(Method.PUT, URL + id, listener, null);
        params = new HashMap<>();
        params.put("id", id);
        params.put("invoiceStatus", "Cancelled");
    }

    /**
     * method getparam
     *
     * @return params
     */
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}