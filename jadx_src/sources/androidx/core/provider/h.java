package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* JADX INFO: compiled from: FontRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f21010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21012f;

    public h(@n0 String str, @n0 String str2, @n0 String str3, @androidx.annotation.e int i10) {
        this.f21007a = (String) o.l(str);
        this.f21008b = (String) o.l(str2);
        this.f21009c = (String) o.l(str3);
        this.f21010d = null;
        o.a(i10 != 0);
        this.f21011e = i10;
        this.f21012f = a(str, str2, str3);
    }

    public h(@n0 String str, @n0 String str2, @n0 String str3, @n0 List<List<byte[]>> list) {
        this.f21007a = (String) o.l(str);
        this.f21008b = (String) o.l(str2);
        this.f21009c = (String) o.l(str3);
        this.f21010d = (List) o.l(list);
        this.f21011e = 0;
        this.f21012f = a(str, str2, str3);
    }

    private String a(@n0 String str, @n0 String str2, @n0 String str3) {
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str3;
    }

    @p0
    public List<List<byte[]>> b() {
        return this.f21010d;
    }

    @androidx.annotation.e
    public int c() {
        return this.f21011e;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    String d() {
        return this.f21012f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f21012f;
    }

    @n0
    public String f() {
        return this.f21007a;
    }

    @n0
    public String g() {
        return this.f21008b;
    }

    @n0
    public String h() {
        return this.f21009c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f21007a + ", mProviderPackage: " + this.f21008b + ", mQuery: " + this.f21009c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f21010d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f21010d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append(z5.g.f141884d);
        sb2.append("mCertificatesArray: " + this.f21011e);
        return sb2.toString();
    }
}
