package com.vivo.push.model;

import android.text.TextUtils;
import com.vivo.push.util.m;
import com.vivo.push.util.p;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UnvarnishedMessage {
    private static final String TAG = "UnvarnishedMessage";
    private String mMessage;
    private long mMsgId;
    private Map<String, String> mParams = new HashMap();
    private int mTargetType;
    private String mTragetContent;

    public UnvarnishedMessage() {
    }

    public UnvarnishedMessage(String str) {
        packToObj(str);
    }

    private void packToObj(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                p.a(TAG, "unvarnishedMsg pack to obj is null");
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            this.mTargetType = jSONArray.optInt(0);
            this.mTragetContent = jSONArray.getString(1);
            this.mMessage = jSONArray.getString(2);
            this.mParams = m.a(new JSONObject(jSONArray.getString(3)));
        } catch (JSONException e10) {
            e10.printStackTrace();
            p.a(TAG, "unvarnishedMsg pack to obj error", e10);
        }
    }

    public String getMessage() {
        return this.mMessage;
    }

    public long getMsgId() {
        return this.mMsgId;
    }

    public Map<String, String> getParams() {
        return this.mParams;
    }

    public int getTargetType() {
        return this.mTargetType;
    }

    public String getTragetContent() {
        return this.mTragetContent;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setMsgId(long j10) {
        this.mMsgId = j10;
    }

    public void setParams(Map<String, String> map) {
        this.mParams = map;
    }

    public void setTargetType(int i10) {
        this.mTargetType = i10;
    }

    public void setTragetContent(String str) {
        this.mTragetContent = str;
    }

    public String unpackToJson() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.mTargetType);
        jSONArray.put(this.mTragetContent);
        jSONArray.put(this.mMessage);
        Object map = this.mParams;
        if (map == null) {
            map = new HashMap();
        }
        jSONArray.put(map);
        return jSONArray.toString();
    }
}
