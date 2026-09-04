package com.igexin.push.core.bean;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PushTaskBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<BaseAction> f63565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f63566g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f63569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f63570k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, String> f63572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f63574o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f63567h = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f63571l = false;

    public String getAction() {
        return this.f63560a;
    }

    public List<BaseAction> getActionChains() {
        return this.f63565f;
    }

    public String getAppKey() {
        return this.f63567h;
    }

    public String getAppid() {
        return this.f63561b;
    }

    public BaseAction getBaseAction(String str) {
        for (BaseAction baseAction : getActionChains()) {
            if (baseAction.getActionId().equals(str)) {
                return baseAction;
            }
        }
        return null;
    }

    public Map<String, String> getConditionMap() {
        return this.f63572m;
    }

    public int getCurrentActionid() {
        return this.f63568i;
    }

    public int getExecuteTimes() {
        return this.f63574o;
    }

    public String getId() {
        return this.f63562c;
    }

    public String getMessageId() {
        return this.f63563d;
    }

    public String getMsgAddress() {
        return this.f63570k;
    }

    public byte[] getMsgExtra() {
        return this.f63566g;
    }

    public int getPerActionid() {
        return this.f63569j;
    }

    public int getStatus() {
        return this.f63573n;
    }

    public String getTaskId() {
        return this.f63564e;
    }

    public boolean isStop() {
        return this.f63571l;
    }

    public void parse(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("appid");
        String string3 = jSONObject.getString("messageid");
        String string4 = jSONObject.getString("taskid");
        String string5 = jSONObject.has("appkey") ? jSONObject.getString("appkey") : null;
        if (string2.equals(com.igexin.push.core.d.f63655a)) {
            setAppid(string2);
            setMessageId(string3);
            setTaskId(string4);
            setId(string);
            if (TextUtils.isEmpty(string5)) {
                string5 = "";
            }
            setAppKey(string5);
            setCurrentActionid(1);
        }
    }

    public void setAction(String str) {
        this.f63560a = str;
    }

    public void setActionChains(List<BaseAction> list) {
        this.f63565f = list;
    }

    public void setAppKey(String str) {
        this.f63567h = str;
    }

    public void setAppid(String str) {
        this.f63561b = str;
    }

    public void setConditionMap(Map<String, String> map) {
        this.f63572m = map;
    }

    public void setCurrentActionid(int i10) {
        this.f63568i = i10;
    }

    public void setExecuteTimes(int i10) {
        this.f63574o = i10;
    }

    public void setId(String str) {
        this.f63562c = str;
    }

    public void setMessageId(String str) {
        this.f63563d = str;
    }

    public void setMsgAddress(String str) {
        this.f63570k = str;
    }

    public void setMsgExtra(byte[] bArr) {
        this.f63566g = bArr;
    }

    public void setPerActionid(int i10) {
        this.f63569j = i10;
    }

    public void setStatus(int i10) {
        this.f63573n = i10;
    }

    public void setStop(boolean z10) {
        this.f63571l = z10;
    }

    public void setTaskId(String str) {
        this.f63564e = str;
    }
}
