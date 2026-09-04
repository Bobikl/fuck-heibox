package y9;

import com.heytap.msp.push.mode.BaseMode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CallBackResult.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends BaseMode {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f141611i = "&";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f141612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f141613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f141614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f141615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f141617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f141618g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f141619h;

    public static <T> String g(List<T> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append("&");
        }
        return sb2.toString();
    }

    public String a() {
        return this.f141612a;
    }

    public String b() {
        return this.f141613b;
    }

    public int c() {
        return this.f141616e;
    }

    public String d() {
        return this.f141614c;
    }

    public int e() {
        return this.f141618g;
    }

    public String f() {
        return this.f141615d;
    }

    public String getAppPackage() {
        return this.f141619h;
    }

    public String getContent() {
        return this.f141617f;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return 4105;
    }

    public void h(String str) {
        this.f141612a = str;
    }

    public void i(String str) {
        this.f141613b = str;
    }

    public void j(int i10) {
        this.f141616e = i10;
    }

    public void k(String str) {
        this.f141614c = str;
    }

    public void l(int i10) {
        this.f141618g = i10;
    }

    public void m(String str) {
        this.f141615d = str;
    }

    public void setAppPackage(String str) {
        this.f141619h = str;
    }

    public void setContent(String str) {
        this.f141617f = str;
    }

    public String toString() {
        return "CallBackResult{, mRegisterID='" + this.f141614c + "', mSdkVersion='" + this.f141615d + "', mCommand=" + this.f141616e + "', mContent='" + this.f141617f + "', mAppPackage=" + this.f141619h + "', mResponseCode=" + this.f141618g + '}';
    }
}
