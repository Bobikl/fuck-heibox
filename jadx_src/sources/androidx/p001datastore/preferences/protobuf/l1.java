package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes6.dex */
public class l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p0 f22506e = p0.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteString f22507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p0 f22508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile z1 f22509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile ByteString f22510d;

    public l1() {
    }

    public l1(p0 p0Var, ByteString byteString) {
        a(p0Var, byteString);
        this.f22508b = p0Var;
        this.f22507a = byteString;
    }

    private static void a(p0 p0Var, ByteString byteString) {
        if (p0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static l1 e(z1 z1Var) {
        l1 l1Var = new l1();
        l1Var.m(z1Var);
        return l1Var;
    }

    private static z1 j(z1 z1Var, ByteString byteString, p0 p0Var) {
        try {
            return z1Var.t().h1(byteString, p0Var).build();
        } catch (InvalidProtocolBufferException unused) {
            return z1Var;
        }
    }

    public void b() {
        this.f22507a = null;
        this.f22509c = null;
        this.f22510d = null;
    }

    public boolean c() {
        ByteString byteString;
        ByteString byteString2 = this.f22510d;
        ByteString byteString3 = ByteString.f22239f;
        return byteString2 == byteString3 || (this.f22509c == null && ((byteString = this.f22507a) == null || byteString == byteString3));
    }

    protected void d(z1 z1Var) {
        if (this.f22509c != null) {
            return;
        }
        synchronized (this) {
            if (this.f22509c != null) {
                return;
            }
            try {
                if (this.f22507a != null) {
                    this.f22509c = z1Var.w().s(this.f22507a, this.f22508b);
                    this.f22510d = this.f22507a;
                } else {
                    this.f22509c = z1Var;
                    this.f22510d = ByteString.f22239f;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f22509c = z1Var;
                this.f22510d = ByteString.f22239f;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        z1 z1Var = this.f22509c;
        z1 z1Var2 = l1Var.f22509c;
        if (z1Var == null && z1Var2 == null) {
            return n().equals(l1Var.n());
        }
        if (z1Var == null || z1Var2 == null) {
            return z1Var != null ? z1Var.equals(l1Var.g(z1Var.r())) : g(z1Var2.r()).equals(z1Var2);
        }
        return z1Var.equals(z1Var2);
    }

    public int f() {
        if (this.f22510d != null) {
            return this.f22510d.size();
        }
        ByteString byteString = this.f22507a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f22509c != null) {
            return this.f22509c.u();
        }
        return 0;
    }

    public z1 g(z1 z1Var) {
        d(z1Var);
        return this.f22509c;
    }

    public void h(l1 l1Var) {
        ByteString byteString;
        if (l1Var.c()) {
            return;
        }
        if (c()) {
            k(l1Var);
            return;
        }
        if (this.f22508b == null) {
            this.f22508b = l1Var.f22508b;
        }
        ByteString byteString2 = this.f22507a;
        if (byteString2 != null && (byteString = l1Var.f22507a) != null) {
            this.f22507a = byteString2.l(byteString);
            return;
        }
        if (this.f22509c == null && l1Var.f22509c != null) {
            m(j(l1Var.f22509c, this.f22507a, this.f22508b));
        } else if (this.f22509c == null || l1Var.f22509c != null) {
            m(this.f22509c.t().A(l1Var.f22509c).build());
        } else {
            m(j(this.f22509c, l1Var.f22507a, l1Var.f22508b));
        }
    }

    public int hashCode() {
        return 1;
    }

    public void i(w wVar, p0 p0Var) throws IOException {
        if (c()) {
            l(wVar.x(), p0Var);
            return;
        }
        if (this.f22508b == null) {
            this.f22508b = p0Var;
        }
        ByteString byteString = this.f22507a;
        if (byteString != null) {
            l(byteString.l(wVar.x()), this.f22508b);
        } else {
            try {
                m(this.f22509c.t().b1(wVar, p0Var).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void k(l1 l1Var) {
        this.f22507a = l1Var.f22507a;
        this.f22509c = l1Var.f22509c;
        this.f22510d = l1Var.f22510d;
        p0 p0Var = l1Var.f22508b;
        if (p0Var != null) {
            this.f22508b = p0Var;
        }
    }

    public void l(ByteString byteString, p0 p0Var) {
        a(p0Var, byteString);
        this.f22507a = byteString;
        this.f22508b = p0Var;
        this.f22509c = null;
        this.f22510d = null;
    }

    public z1 m(z1 z1Var) {
        z1 z1Var2 = this.f22509c;
        this.f22507a = null;
        this.f22510d = null;
        this.f22509c = z1Var;
        return z1Var2;
    }

    public ByteString n() {
        if (this.f22510d != null) {
            return this.f22510d;
        }
        ByteString byteString = this.f22507a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f22510d != null) {
                return this.f22510d;
            }
            if (this.f22509c == null) {
                this.f22510d = ByteString.f22239f;
            } else {
                this.f22510d = this.f22509c.z0();
            }
            return this.f22510d;
        }
    }

    void o(Writer writer, int i10) throws IOException {
        if (this.f22510d != null) {
            writer.i(i10, this.f22510d);
            return;
        }
        ByteString byteString = this.f22507a;
        if (byteString != null) {
            writer.i(i10, byteString);
        } else if (this.f22509c != null) {
            writer.K(i10, this.f22509c);
        } else {
            writer.i(i10, ByteString.f22239f);
        }
    }
}
