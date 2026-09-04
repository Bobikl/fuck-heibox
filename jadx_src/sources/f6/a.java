package f6;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118758c;

    public a(String str, String str2, long j10) {
        this.f118756a = str;
        this.f118757b = str2;
        this.f118758c = j10;
    }

    public static boolean d(a aVar) {
        return aVar == null || TextUtils.isEmpty(aVar.f118756a);
    }

    public String a() {
        return this.f118756a;
    }

    public String b() {
        return this.f118757b;
    }

    public long c() {
        return this.f118758c;
    }
}
