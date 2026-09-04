package org.apache.tools.zip;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: ZipEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class t extends ZipEntry implements Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f137476l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f137477m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f137478n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f137479o = 65535;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f137480p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f137481q = new byte[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final u[] f137482r = new u[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f137484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f137486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f137487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u[] f137488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f137489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f137490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f137491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f137492k;

    protected t() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(File file, String str) {
        if (file.isDirectory() && !str.endsWith("/")) {
            str = str + "/";
        }
        this(str);
        if (file.isFile()) {
            setSize(file.length());
        }
        setTime(file.lastModified());
    }

    public t(String str) {
        super(str);
        this.f137483b = -1;
        this.f137484c = -1L;
        this.f137485d = 0;
        this.f137486e = 0;
        this.f137487f = 0L;
        this.f137489h = null;
        this.f137490i = null;
        this.f137491j = null;
        this.f137492k = new f();
        J(str);
    }

    public t(ZipEntry zipEntry) throws ZipException {
        super(zipEntry);
        this.f137483b = -1;
        this.f137484c = -1L;
        this.f137485d = 0;
        this.f137486e = 0;
        this.f137487f = 0L;
        this.f137489h = null;
        this.f137490i = null;
        this.f137491j = null;
        this.f137492k = new f();
        J(zipEntry.getName());
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            F(d.f(extra, true, d.a.f137399g));
        } else {
            E();
        }
        setMethod(zipEntry.getMethod());
        this.f137484c = zipEntry.getSize();
    }

    public t(t tVar) throws ZipException {
        this((ZipEntry) tVar);
        H(tVar.m());
        D(tVar.h());
        F(f());
        M(tVar.s());
        f fVarL = tVar.l();
        G(fVarL == null ? null : (f) fVarL.clone());
    }

    private u[] c(u[] uVarArr) {
        return d(uVarArr, uVarArr.length);
    }

    private u[] d(u[] uVarArr, int i10) {
        u[] uVarArr2 = new u[i10];
        System.arraycopy(uVarArr, 0, uVarArr2, 0, Math.min(uVarArr.length, i10));
        return uVarArr2;
    }

    private u[] e() {
        u[] uVarArrF = f();
        return uVarArrF == this.f137488g ? c(uVarArrF) : uVarArrF;
    }

    private u[] f() {
        u[] uVarArr = this.f137488g;
        if (uVarArr == null) {
            return w();
        }
        return this.f137489h != null ? p() : uVarArr;
    }

    private u[] p() {
        u[] uVarArr = this.f137488g;
        u[] uVarArrD = d(uVarArr, uVarArr.length + 1);
        uVarArrD[this.f137488g.length] = this.f137489h;
        return uVarArrD;
    }

    private u[] q() {
        u[] uVarArrR = r();
        return uVarArrR == this.f137488g ? c(uVarArrR) : uVarArrR;
    }

    private u[] r() {
        u[] uVarArr = this.f137488g;
        return uVarArr == null ? f137482r : uVarArr;
    }

    private u[] w() {
        m mVar = this.f137489h;
        return mVar == null ? f137482r : new u[]{mVar};
    }

    private void x(u[] uVarArr, boolean z10) throws ZipException {
        if (this.f137488g == null) {
            F(uVarArr);
            return;
        }
        for (u uVar : uVarArr) {
            u uVarI = uVar instanceof m ? this.f137489h : i(uVar.d());
            if (uVarI == null) {
                b(uVar);
            } else if (z10 || !(uVarI instanceof c)) {
                byte[] bArrE = uVar.e();
                uVarI.g(bArrE, 0, bArrE.length);
            } else {
                byte[] bArrA = uVar.a();
                ((c) uVarI).b(bArrA, 0, bArrA.length);
            }
        }
        E();
    }

    public void B(byte[] bArr) {
        try {
            x(d.f(bArr, false, d.a.f137399g), false);
        } catch (ZipException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    @Deprecated
    public void C(long j10) {
        setCompressedSize(j10);
    }

    public void D(long j10) {
        this.f137487f = j10;
    }

    protected void E() {
        super.setExtra(d.c(k(true)));
    }

    public void F(u[] uVarArr) {
        ArrayList arrayList = new ArrayList();
        for (u uVar : uVarArr) {
            if (uVar instanceof m) {
                this.f137489h = (m) uVar;
            } else {
                arrayList.add(uVar);
            }
        }
        this.f137488g = (u[]) arrayList.toArray(new u[arrayList.size()]);
        E();
    }

    public void G(f fVar) {
        this.f137492k = fVar;
    }

    public void H(int i10) {
        this.f137485d = i10;
    }

    protected void J(String str) {
        if (str != null && s() == 0 && !str.contains("/")) {
            str = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        }
        this.f137490i = str;
    }

    protected void K(String str, byte[] bArr) {
        J(str);
        this.f137491j = bArr;
    }

    protected void M(int i10) {
        this.f137486e = i10;
    }

    public void O(int i10) {
        D(((i10 & 128) == 0 ? 1 : 0) | (i10 << 16) | (isDirectory() ? 16 : 0));
        this.f137486e = 3;
    }

    public void a(u uVar) {
        if (uVar instanceof m) {
            this.f137489h = (m) uVar;
        } else {
            if (i(uVar.d()) != null) {
                y(uVar.d());
            }
            u[] uVarArr = this.f137488g;
            u[] uVarArr2 = new u[uVarArr != null ? uVarArr.length + 1 : 1];
            this.f137488g = uVarArr2;
            uVarArr2[0] = uVar;
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 1, uVarArr2.length - 1);
            }
        }
        E();
    }

    public void b(u uVar) {
        if (uVar instanceof m) {
            this.f137489h = (m) uVar;
        } else if (this.f137488g == null) {
            this.f137488g = new u[]{uVar};
        } else {
            if (i(uVar.d()) != null) {
                y(uVar.d());
            }
            u[] uVarArr = this.f137488g;
            u[] uVarArrD = d(uVarArr, uVarArr.length + 1);
            uVarArrD[this.f137488g.length] = uVar;
            this.f137488g = uVarArrD;
        }
        E();
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        t tVar = (t) super.clone();
        tVar.H(m());
        tVar.D(h());
        tVar.F(f());
        return tVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        String name = getName();
        String name2 = tVar.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = tVar.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        return getTime() == tVar.getTime() && comment.equals(comment2) && m() == tVar.m() && s() == tVar.s() && h() == tVar.h() && getMethod() == tVar.getMethod() && getSize() == tVar.getSize() && getCrc() == tVar.getCrc() && getCompressedSize() == tVar.getCompressedSize() && Arrays.equals(g(), tVar.g()) && Arrays.equals(o(), tVar.o()) && this.f137492k.equals(tVar.f137492k);
    }

    public byte[] g() {
        return d.b(k(true));
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.f137483b;
    }

    @Override // java.util.zip.ZipEntry
    public String getName() {
        String str = this.f137490i;
        return str == null ? super.getName() : str;
    }

    @Override // java.util.zip.ZipEntry
    public long getSize() {
        return this.f137484c;
    }

    public long h() {
        return this.f137487f;
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        return getName().hashCode();
    }

    public u i(a0 a0Var) {
        u[] uVarArr = this.f137488g;
        if (uVarArr == null) {
            return null;
        }
        for (u uVar : uVarArr) {
            if (a0Var.equals(uVar.d())) {
                return uVar;
            }
        }
        return null;
    }

    @Override // java.util.zip.ZipEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    public u[] j() {
        return q();
    }

    public u[] k(boolean z10) {
        return z10 ? e() : q();
    }

    public f l() {
        return this.f137492k;
    }

    public int m() {
        return this.f137485d;
    }

    public Date n() {
        return new Date(getTime());
    }

    public byte[] o() {
        byte[] extra = getExtra();
        return extra != null ? extra : f137481q;
    }

    public int s() {
        return this.f137486e;
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) throws RuntimeException {
        try {
            x(d.f(bArr, true, d.a.f137399g), true);
        } catch (ZipException e10) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e10.getMessage(), e10);
        }
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i10) {
        if (i10 >= 0) {
            this.f137483b = i10;
            return;
        }
        throw new IllegalArgumentException("ZIP compression method can not be negative: " + i10);
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("invalid entry size");
        }
        this.f137484c = j10;
    }

    public byte[] t() {
        byte[] bArr = this.f137491j;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int u() {
        if (this.f137486e != 3) {
            return 0;
        }
        return (int) ((h() >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    public m v() {
        return this.f137489h;
    }

    public void y(a0 a0Var) {
        if (this.f137488g == null) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f137488g) {
            if (!a0Var.equals(uVar.d())) {
                arrayList.add(uVar);
            }
        }
        if (this.f137488g.length == arrayList.size()) {
            throw new NoSuchElementException();
        }
        this.f137488g = (u[]) arrayList.toArray(new u[arrayList.size()]);
        E();
    }

    public void z() {
        if (this.f137489h == null) {
            throw new NoSuchElementException();
        }
        this.f137489h = null;
        E();
    }
}
