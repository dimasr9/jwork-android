package dimasradhitya.jwork_android;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class yang menyimpan fungsi request apply job
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class ApplyJobRequest extends StringRequest {
    private static String URLBank = "http://10.0.2.2/invoice/createBankPayment";
    private static String URLEwallet = "http://10.0.2.2/invoice/createEWalletPayment";
    private Map<String, String> params;

    /**
     * constructor dengan admin fee
     * @param jobId
     * @param jobseekerId
     * @param listener
     */
    public ApplyJobRequest(String jobId, String jobseekerId, Response.Listener<String> listener) {
        super(Method.POST, URLBank, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", jobId);
        params.put("jobseekerId", jobseekerId);
        params.put("adminFee", "1500");
    }

    /**
     * constructor dengan referral code
     * @param jobId
     * @param jobseekerId
     * @param referralCode
     * @param listener
     */
    public ApplyJobRequest(String jobId, String jobseekerId, String referralCode, Response.Listener<String> listener) {
        super(Method.POST, URLEwallet, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", jobId);
        params.put("jobseekerId", jobseekerId);
        params.put("referralCode", referralCode);
    }

    /**
     * method getparam
     * @return
     */
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}