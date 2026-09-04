package com.umeng.socialize.net.base;

import android.text.TextUtils;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.UResponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SocializeReseponse extends UResponse {
    protected static final String TAG = "SocializeReseponse";
    private int mHttpCode;
    protected JSONObject mJsonData;
    public String mMsg;
    public int mStCode;

    public SocializeReseponse(Integer num, JSONObject jSONObject) {
        this(jSONObject);
        this.mHttpCode = num == null ? -1 : num.intValue();
    }

    public SocializeReseponse(JSONObject jSONObject) {
        super(jSONObject);
        this.mStCode = -103;
        this.mJsonData = parseStatus(jSONObject);
        parseJsonObject();
    }

    private void parseErrorMsg(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                if (TextUtils.isEmpty(jSONObject2.getString("msg"))) {
                    jSONObject2.getJSONObject("data").getString(SocializeProtocolConstants.PROTOCOL_KEY_PLATFORM_ERROR);
                }
            }
        } catch (Exception e10) {
            SLog.error(e10);
        }
    }

    public JSONObject getJsonData() {
        return this.mJsonData;
    }

    public boolean isHttpOK() {
        return this.mHttpCode == 200;
    }

    public boolean isOk() {
        return this.mStCode == 200;
    }

    public void parseJsonObject() {
    }

    public JSONObject parseStatus(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int iOptInt = jSONObject.optInt("st", 1998);
            this.mStCode = iOptInt;
            if (iOptInt == 0) {
                return null;
            }
            this.mMsg = jSONObject.optString("msg", "");
            String strOptString = jSONObject.optString("data", null);
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            if (this.mStCode != 200) {
                parseErrorMsg(strOptString);
            }
            return new JSONObject(strOptString);
        } catch (JSONException e10) {
            SLog.error(UmengText.NET.PARSEERROR, e10);
            return null;
        }
    }
}
