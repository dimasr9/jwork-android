package dimasradhitya.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class yang menyimpan fungsi request selesai job
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class JobSelesaiRequest extends StringRequest {
    private static String URL = "http://10.0.2.2/invoice/InvoiceStatus/";
    private Map<String, String> params;

    /**
     * constructor job selesai request
     * @param id
     * @param listener
     */
    public JobSelesaiRequest(String id, Response.Listener<String> listener) {
        super(Method.PUT, URL+id, listener, null);
        params = new HashMap<>();
        params.put("id", id);
        params.put("invoiceStatus", "Finished");
    }

    /**
     * method getparams
     * @return params
     */
    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
