package com.igexin.sdk.message;

import com.igexin.push.core.d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class BaseMessage implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64097a = d.f63655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64098b = d.f63669c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64099c = d.f63685s;

    public String getAppid() {
        return this.f64097a;
    }

    public String getClientId() {
        return this.f64099c;
    }

    public String getPkgName() {
        return this.f64098b;
    }

    public void setAppid(String str) {
        this.f64097a = str;
    }

    public void setClientId(String str) {
        this.f64099c = str;
    }

    public void setPkgName(String str) {
        this.f64098b = str;
    }
}
