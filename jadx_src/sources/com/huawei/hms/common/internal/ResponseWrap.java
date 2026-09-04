package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseWrap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResponseHeader f60553b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f60553b = responseHeader;
    }

    public boolean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f60553b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f60553b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.f60553b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f60553b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f60553b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f60553b.setAppID(JsonUtil.getStringValue(jSONObject, "app_id"));
            this.f60553b.setPkgName(JsonUtil.getStringValue(jSONObject, Constants.PARAM_PKG_NAME));
            this.f60553b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f60553b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.f60553b.setResolution(JsonUtil.getStringValue(jSONObject, "resolution"));
            this.f60552a = JsonUtil.getStringValue(jSONObject, "body");
            return true;
        } catch (JSONException e10) {
            HMSLog.e("ResponseWrap", "fromJson failed: " + e10.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f60552a)) {
            this.f60552a = new JSONObject().toString();
        }
        return this.f60552a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f60553b;
    }

    public void setBody(String str) {
        this.f60552a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f60553b = responseHeader;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f60553b.getStatusCode());
            jSONObject.put("error_code", this.f60553b.getErrorCode());
            jSONObject.put("error_reason", this.f60553b.getErrorReason());
            jSONObject.put("srv_name", this.f60553b.getSrvName());
            jSONObject.put("api_name", this.f60553b.getApiName());
            jSONObject.put("app_id", this.f60553b.getAppID());
            jSONObject.put(Constants.PARAM_PKG_NAME, this.f60553b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f60553b.getTransactionId());
            jSONObject.put("resolution", this.f60553b.getResolution());
            String sessionId = this.f60553b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f60552a)) {
                jSONObject.put("body", this.f60552a);
            }
        } catch (JSONException e10) {
            HMSLog.e("ResponseWrap", "toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f60552a + "', responseHeader=" + this.f60553b + '}';
    }
}
