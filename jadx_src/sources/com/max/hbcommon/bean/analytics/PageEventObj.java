package com.max.hbcommon.bean.analytics;

import bb.c;
import com.google.gson.JsonObject;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class PageEventObj implements Serializable {
    public static final String CLICK = "4";
    public static final String EXPOSURE = "3";
    public static final String STAY_DURATOIN = "2";
    public static final String STAY_DURATOIN_TOTAL = "5";
    public static final String TYPE_VISIT = "1";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2318687281863499363L;
    private JsonObject addition;
    private String path;
    private ArrayList<ArrayList<PathSrcNode>> src;
    private String stay_duration;
    private String stay_duration_ms;
    private String time;
    private String total_stay_duration_ms;
    private String type;

    public JsonObject getAddition() {
        return this.addition;
    }

    public String getPath() {
        return this.path;
    }

    public ArrayList<ArrayList<PathSrcNode>> getSrc() {
        return this.src;
    }

    public String getStay_duration() {
        return this.stay_duration;
    }

    public String getStay_duration_ms() {
        return this.stay_duration_ms;
    }

    public String getTime() {
        return this.time;
    }

    public String getTotal_stay_duration_ms() {
        return this.total_stay_duration_ms;
    }

    public String getType() {
        return this.type;
    }

    public void setAddition(JsonObject jsonObject) {
        this.addition = jsonObject;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSrc(ArrayList<ArrayList<PathSrcNode>> arrayList) {
        this.src = arrayList;
    }

    public void setStay_duration(String str) {
        this.stay_duration = str;
    }

    public void setStay_duration_ms(String str) {
        this.stay_duration_ms = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTotal_stay_duration_ms(String str) {
        this.total_stay_duration_ms = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public PageEventEntity toEntity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31132b5, new Class[0], PageEventEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (PageEventEntity) patchProxyResultProxy.result;
        }
        String str = this.path;
        String str2 = str != null ? str : "";
        String str3 = this.time;
        String str4 = str3 != null ? str3 : "";
        String str5 = this.type;
        return new PageEventEntity(0, str2, str4, str5 != null ? str5 : "", this.stay_duration, this.stay_duration_ms, k.p(this.src), this.addition);
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31155c5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PageEventObj{time='" + this.time + "', type='" + this.type + "', stay_duration='" + this.stay_duration + "', path='" + this.path + "', addition='" + this.addition + "'}";
    }
}
