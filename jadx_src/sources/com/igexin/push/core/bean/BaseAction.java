package com.igexin.push.core.bean;

/* JADX INFO: loaded from: classes.dex */
public class BaseAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63559d = true;

    public String getActionId() {
        return this.f63556a;
    }

    public String getDoActionId() {
        return this.f63558c;
    }

    public String getType() {
        return this.f63557b;
    }

    public boolean isSupportExt() {
        return this.f63559d;
    }

    public void setActionId(String str) {
        this.f63556a = str;
    }

    public void setDoActionId(String str) {
        this.f63558c = str;
    }

    public void setSupportExt(boolean z10) {
        this.f63559d = z10;
    }

    public void setType(String str) {
        this.f63557b = str;
    }
}
