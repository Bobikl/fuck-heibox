package com.alipay.deviceid.module.x;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: compiled from: LogTag.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f38373g;

    public u(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f38367a = str;
        this.f38368b = str2;
        this.f38369c = str3;
        this.f38370d = str4;
        this.f38371e = str5;
        this.f38372f = str6;
        this.f38373g = str7;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38367a);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38368b);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38369c);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38370d);
        if (e.a(this.f38371e) || this.f38371e.length() < 20) {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38371e);
        } else {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38371e.substring(0, 20));
        }
        if (e.a(this.f38372f) || this.f38372f.length() < 20) {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38372f);
        } else {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38372f.substring(0, 20));
        }
        if (e.a(this.f38373g) || this.f38373g.length() < 20) {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38373g);
        } else {
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP + this.f38373g.substring(0, 20));
        }
        return stringBuffer.toString();
    }
}
