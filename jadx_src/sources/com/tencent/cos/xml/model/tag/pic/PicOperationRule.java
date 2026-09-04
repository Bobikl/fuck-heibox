package com.tencent.cos.xml.model.tag.pic;

import android.text.TextUtils;
import com.tencent.cos.xml.BeaconService;
import org.json.JSONException;
import org.json.JSONObject;
import x9.b;

/* JADX INFO: loaded from: classes4.dex */
public class PicOperationRule {
    private static final String TAG = "PicOperationRule";
    private String bucket;
    private String fileId;
    private String rule;

    public PicOperationRule(String str) {
        this.fileId = this.fileId;
        this.rule = str;
    }

    public PicOperationRule(String str, String str2) {
        this.fileId = str;
        this.rule = str2;
    }

    public PicOperationRule(String str, String str2, String str3) {
        this.bucket = str;
        this.fileId = str2;
        this.rule = str3;
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.bucket)) {
                jSONObject.put("bucket", this.bucket);
            }
            if (!TextUtils.isEmpty(this.fileId)) {
                jSONObject.put("fileid", this.fileId);
            }
            jSONObject.put(b.f141151p, this.rule);
        } catch (JSONException e10) {
            BeaconService.getInstance().reportError(TAG, e10);
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
