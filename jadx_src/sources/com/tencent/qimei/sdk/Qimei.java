package com.tencent.qimei.sdk;

import android.text.TextUtils;
import com.tencent.qimei.v.d;

/* JADX INFO: loaded from: classes4.dex */
public final class Qimei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101439c;

    public Qimei() {
        this("", "");
    }

    public Qimei(String str, String str2) {
        this.f101438b = str == null ? "" : str;
        this.f101439c = str2 == null ? "" : str2;
    }

    public String a() {
        return this.f101438b;
    }

    @Deprecated
    public void a(String str) {
        this.f101438b = str;
    }

    public String b() {
        return this.f101439c;
    }

    public void b(String str) {
        this.f101439c = str;
    }

    public String getQimei16() {
        return !d.a(this.f101437a).h() ? "" : this.f101438b;
    }

    public String getQimei36() {
        return !d.a(this.f101437a).C() ? "" : this.f101439c;
    }

    public boolean isEmpty() {
        String str;
        String str2 = this.f101438b;
        return (str2 == null || str2.isEmpty()) && ((str = this.f101439c) == null || str.isEmpty());
    }

    public void setAppKey(String str) {
        this.f101437a = str;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Qimei:");
        sb2.append(this.f101438b);
        if (TextUtils.isEmpty(this.f101439c)) {
            str = "";
        } else {
            str = "\nQimei3:" + this.f101439c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
