package org.apache.tools.ant.types;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

/* JADX INFO: compiled from: Resource.java */
/* JADX INFO: loaded from: classes5.dex */
public class s1 extends s implements Comparable<s1>, u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f136490l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f136491m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f136492n = j2("Resource".getBytes());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f136493o = j2("null name".getBytes());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f136494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f136495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f136496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f136497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Long f136498k;

    public s1() {
        this.f136494g = null;
        this.f136495h = null;
        this.f136496i = null;
        this.f136497j = null;
        this.f136498k = null;
    }

    public s1(String str) {
        this(str, false, 0L, false);
    }

    public s1(String str, boolean z10, long j10) {
        this(str, z10, j10, false);
    }

    public s1(String str, boolean z10, long j10, boolean z11) {
        this(str, z10, j10, z11, -1L);
    }

    public s1(String str, boolean z10, long j10, boolean z11, long j11) {
        this.f136495h = null;
        this.f136496i = null;
        this.f136497j = null;
        this.f136498k = null;
        this.f136494g = str;
        t2(str);
        r2(z10);
        s2(j10);
        q2(z11);
        u2(j11);
    }

    protected static int j2(byte[] bArr) {
        return new BigInteger(bArr).intValue();
    }

    public boolean O() {
        return (Y1() && m2().O()) || e2(org.apache.tools.ant.types.resources.y.class) != null;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) {
        if (this.f136494g != null || this.f136495h != null || this.f136496i != null || this.f136497j != null || this.f136498k != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new UnsupportedOperationException("CloneNotSupportedException for a Resource caught. Derived classes must support cloning.");
        }
    }

    public <T> T e2(Class<T> cls) {
        if (cls.isAssignableFrom(getClass())) {
            return cls.cast(this);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Y1()) {
            return m2().equals(obj);
        }
        return obj != null && obj.getClass().equals(getClass()) && compareTo((s1) obj) == 0;
    }

    public <T> Optional<T> f2(Class<T> cls) {
        return Optional.ofNullable(e2(cls));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public int compareTo(s1 s1Var) {
        return Y1() ? m2().compareTo(s1Var) : toString().compareTo(s1Var.toString());
    }

    public InputStream h2() throws IOException {
        if (Y1()) {
            return m2().h2();
        }
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        if (Y1()) {
            return m2().hashCode();
        }
        String strK2 = k2();
        return f136492n * (strK2 == null ? f136493o : strK2.hashCode());
    }

    public long i2() {
        Long l10;
        if (Y1()) {
            return m2().i2();
        }
        if (!p2() || (l10 = this.f136496i) == null) {
            return 0L;
        }
        long jLongValue = l10.longValue();
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<s1> iterator() {
        return Y1() ? m2().iterator() : Collections.singleton(this).iterator();
    }

    public String k2() {
        return Y1() ? m2().k2() : this.f136494g;
    }

    public OutputStream l2() throws IOException {
        if (Y1()) {
            return m2().l2();
        }
        throw new UnsupportedOperationException();
    }

    protected s1 m2() {
        return (s1) O1(s1.class);
    }

    public long n2() {
        if (Y1()) {
            return m2().n2();
        }
        if (!p2()) {
            return 0L;
        }
        Long l10 = this.f136498k;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    public boolean o2() {
        if (Y1()) {
            return m2().o2();
        }
        Boolean bool = this.f136497j;
        return bool != null && bool.booleanValue();
    }

    public boolean p2() {
        if (Y1()) {
            return m2().p2();
        }
        Boolean bool = this.f136495h;
        return bool == null || bool.booleanValue();
    }

    public void q2(boolean z10) {
        B1();
        this.f136497j = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void r2(boolean z10) {
        B1();
        this.f136495h = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void s2(long j10) {
        B1();
        this.f136496i = Long.valueOf(j10);
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        if (Y1()) {
            return m2().size();
        }
        return 1;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }

    public void t2(String str) {
        B1();
        this.f136494g = str;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return m2().toString();
        }
        String strK2 = k2();
        return strK2 == null ? "(anonymous)" : strK2;
    }

    public void u2(long j10) {
        B1();
        if (j10 <= -1) {
            j10 = -1;
        }
        this.f136498k = Long.valueOf(j10);
    }

    public final String v2() {
        if (Y1()) {
            return m2().v2();
        }
        return U1() + " \"" + toString() + kotlin.text.y.f128593b;
    }
}
