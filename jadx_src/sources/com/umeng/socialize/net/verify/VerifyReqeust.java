package com.umeng.socialize.net.verify;

import android.content.Context;
import android.util.Base64;
import com.umeng.socialize.net.base.SocializeReseponse;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyReqeust extends URequest {
    public VerifyReqeust(Context context, String str, Class<? extends SocializeReseponse> cls, URequest.RequestMethod requestMethod) {
        super(str);
        this.mContext = context;
        this.mMethod = requestMethod;
        this.mMimeType = URequest.MIME.JSON;
        this.mResponseClz = cls;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> buildParams() {
        return new HashMap();
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> getBodyPair() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<String> stringSet = this.mContext.getSharedPreferences("umeng_verify", 0).getStringSet("verify_log", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                jSONArray.put(Base64.encodeToString(it.next().getBytes(), 2));
            }
        }
        try {
            jSONObject.put("content", jSONArray);
            jSONObject.put("ts", String.valueOf(System.currentTimeMillis()));
        } catch (JSONException e10) {
            SLog.error(UmengText.NET.PARSEERROR, e10);
        }
        HashMap map = new HashMap();
        map.put("data", jSONObject.toString());
        return map;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        super.onPrepareRequest();
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String toGetUrl() {
        return generateGetURL(getBaseUrl(), buildParams());
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public JSONObject toJson() {
        return null;
    }
}
