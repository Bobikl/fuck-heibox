package qb;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: CaptchaInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f138641d = "confirm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f138642e = "canceled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f138643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f138644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f138645c;

    public a() {
    }

    public a(String str, String str2, String str3) {
        this.f138643a = str;
        this.f138644b = str2;
        this.f138645c = str3;
    }

    public String a() {
        return this.f138643a;
    }

    public String b() {
        return this.f138645c;
    }

    public String c() {
        return this.f138644b;
    }

    public void d(String str) {
        this.f138643a = str;
    }

    public void e(String str) {
        this.f138645c = str;
    }

    public void f(String str) {
        this.f138644b = str;
    }
}
