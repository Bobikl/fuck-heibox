package com.max.xiaoheihe.bean;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class NativeParamsObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("class")
    private String clazz;
    private JsonElement value;

    public String getClazz() {
        return this.clazz;
    }

    public JsonElement getValue() {
        return this.value;
    }

    public void setClazz(String str) {
        this.clazz = str;
    }

    public void setValue(JsonElement jsonElement) {
        this.value = jsonElement;
    }
}
