package com.igexin.push.core.bean;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public class k extends BaseAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63635d;

    private String d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.igexin.push.core.d.f63671e.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                return "mobile";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String a() {
        return this.f63632a;
    }

    public void a(String str) {
        this.f63632a = str;
    }

    public void a(boolean z10) {
        this.f63633b = z10;
    }

    public String b() {
        return this.f63635d;
    }

    public void b(String str) {
        this.f63635d = str;
    }

    public void b(boolean z10) {
        this.f63634c = z10;
    }

    public String c() {
        String strD;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String str2;
        String string = this.f63632a;
        if (this.f63633b) {
            if (string.indexOf("?") > 0) {
                sb3 = new StringBuilder();
                sb3.append(string);
                str2 = "&cid=";
            } else {
                sb3 = new StringBuilder();
                sb3.append(string);
                str2 = "?cid=";
            }
            sb3.append(str2);
            sb3.append(com.igexin.push.core.d.f63685s);
            string = sb3.toString();
        }
        if (!this.f63634c || (strD = d()) == null) {
            return string;
        }
        if (string.indexOf("?") > 0) {
            sb2 = new StringBuilder();
            sb2.append(string);
            str = "&nettype=";
        } else {
            sb2 = new StringBuilder();
            sb2.append(string);
            str = "?nettype=";
        }
        sb2.append(str);
        sb2.append(strD);
        return sb2.toString();
    }
}
