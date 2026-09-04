package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class FeedbackCmdMessage extends GTCmdMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64105d;

    public FeedbackCmdMessage() {
    }

    public FeedbackCmdMessage(String str, String str2, String str3, long j10, int i10) {
        super(i10);
        this.f64102a = str;
        this.f64103b = str2;
        this.f64104c = str3;
        this.f64105d = j10;
    }

    public String getActionId() {
        return this.f64103b;
    }

    public String getResult() {
        return this.f64104c;
    }

    public String getTaskId() {
        return this.f64102a;
    }

    public long getTimeStamp() {
        return this.f64105d;
    }

    public void setActionId(String str) {
        this.f64103b = str;
    }

    public void setResult(String str) {
        this.f64104c = str;
    }

    public void setTaskId(String str) {
        this.f64102a = str;
    }

    public void setTimeStamp(long j10) {
        this.f64105d = j10;
    }
}
