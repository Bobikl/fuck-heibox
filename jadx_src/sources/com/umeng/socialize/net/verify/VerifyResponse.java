package com.umeng.socialize.net.verify;

import com.umeng.socialize.net.base.SocializeReseponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyResponse extends SocializeReseponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106347b;

    public VerifyResponse(Integer num, JSONObject jSONObject) {
        super(null);
        this.f106346a = num.intValue();
        this.f106347b = false;
        parseJsonObject(jSONObject);
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public boolean isHttpOK() {
        return this.f106346a == 200;
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public boolean isOk() {
        return this.f106347b;
    }

    public void parseJsonObject(JSONObject jSONObject) {
        try {
            if (jSONObject.getString("result").startsWith("success")) {
                this.f106347b = true;
            } else {
                this.f106347b = false;
            }
        } catch (JSONException e10) {
            SLog.error(UmengText.NET.PARSEERROR, e10);
        }
    }
}
