package com.tencent.thumbplayer.tcmedia.e;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f102617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f102618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f102619e;

    public b(b bVar, String str) {
        this.f102615a = "";
        this.f102616b = "";
        this.f102617c = "";
        this.f102618d = "";
        this.f102619e = "TPLogger";
        a(bVar, str);
    }

    public b(String str) {
        this(str, "", "", "");
    }

    public b(String str, String str2, String str3, String str4) {
        this.f102619e = "TPLogger";
        this.f102615a = str;
        this.f102616b = str2;
        this.f102617c = str3;
        this.f102618d = str4;
        b();
    }

    private void b() {
        this.f102619e = this.f102615a;
        if (!TextUtils.isEmpty(this.f102616b)) {
            this.f102619e += "_C" + this.f102616b;
        }
        if (!TextUtils.isEmpty(this.f102617c)) {
            this.f102619e += "_T" + this.f102617c;
        }
        if (TextUtils.isEmpty(this.f102618d)) {
            return;
        }
        this.f102619e += lg.a.f131412e + this.f102618d;
    }

    public String a() {
        return this.f102619e;
    }

    public void a(b bVar, String str) {
        String str2;
        if (bVar != null) {
            this.f102615a = bVar.f102615a;
            this.f102616b = bVar.f102616b;
            str2 = bVar.f102617c;
        } else {
            str2 = "";
            this.f102615a = "";
            this.f102616b = "";
        }
        this.f102617c = str2;
        this.f102618d = str;
        b();
    }

    public void a(String str) {
        this.f102617c = str;
        b();
    }

    public String toString() {
        return "TPLoggerContext{prefix='" + this.f102615a + "', classId='" + this.f102616b + "', taskId='" + this.f102617c + "', model='" + this.f102618d + "', tag='" + this.f102619e + "'}";
    }
}
