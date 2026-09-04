package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class GTNotificationMessage extends GTPushMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f64110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f64111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f64112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f64113g;

    public GTNotificationMessage() {
    }

    public GTNotificationMessage(String str, String str2, String str3, String str4) {
        this.f64107a = str;
        this.f64108b = str2;
        this.f64109c = str3;
        this.f64110d = str4;
    }

    public GTNotificationMessage(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f64107a = str;
        this.f64108b = str2;
        this.f64109c = str3;
        this.f64110d = str4;
        this.f64112f = str5;
        this.f64113g = str6;
        this.f64111e = str7;
    }

    public String getContent() {
        return this.f64110d;
    }

    public String getIntentUri() {
        return this.f64113g;
    }

    public String getMessageId() {
        return this.f64108b;
    }

    public String getPayload() {
        return this.f64111e;
    }

    public String getTaskId() {
        return this.f64107a;
    }

    public String getTitle() {
        return this.f64109c;
    }

    public String getUrl() {
        return this.f64112f;
    }

    public void setContent(String str) {
        this.f64110d = str;
    }

    public void setIntentUri(String str) {
        this.f64113g = str;
    }

    public void setMessageId(String str) {
        this.f64108b = str;
    }

    public void setPayload(String str) {
        this.f64111e = str;
    }

    public void setTaskId(String str) {
        this.f64107a = str;
    }

    public void setTitle(String str) {
        this.f64109c = str;
    }

    public void setUrl(String str) {
        this.f64112f = str;
    }
}
