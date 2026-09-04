package androidx.constraintlayout.core.parser;

import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: CLElement.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static int f18066g = 80;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static int f18067h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f18068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f18069c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f18070d = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f18071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18072f;

    public c(char[] cArr) {
        this.f18068b = cArr;
    }

    protected String A() {
        return "";
    }

    protected void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public String b() {
        String str = new String(this.f18068b);
        long j10 = this.f18070d;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f18069c;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f18069c;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public c e() {
        return this.f18071e;
    }

    protected String g() {
        if (!CLParser.f18051d) {
            return "";
        }
        return o() + " -> ";
    }

    public long h() {
        return this.f18070d;
    }

    public float i() {
        if (this instanceof e) {
            return ((e) this).i();
        }
        return Float.NaN;
    }

    public int j() {
        if (this instanceof e) {
            return ((e) this).j();
        }
        return 0;
    }

    public int l() {
        return this.f18072f;
    }

    public long m() {
        return this.f18069c;
    }

    protected String o() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean q() {
        return this.f18070d != Long.MAX_VALUE;
    }

    public boolean s() {
        return this.f18069c > -1;
    }

    public boolean t() {
        return this.f18069c == -1;
    }

    public String toString() {
        long j10 = this.f18069c;
        long j11 = this.f18070d;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f18069c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f18070d + ")";
        }
        return o() + " (" + this.f18069c + " : " + this.f18070d + ") <<" + new String(this.f18068b).substring((int) this.f18069c, ((int) this.f18070d) + 1) + ">>";
    }

    public void u(b bVar) {
        this.f18071e = bVar;
    }

    public void v(long j10) {
        if (this.f18070d != Long.MAX_VALUE) {
            return;
        }
        this.f18070d = j10;
        if (CLParser.f18051d) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f18071e;
        if (bVar != null) {
            bVar.B(this);
        }
    }

    public void w(int i10) {
        this.f18072f = i10;
    }

    public void x(long j10) {
        this.f18069c = j10;
    }

    protected String y(int i10, int i11) {
        return "";
    }
}
