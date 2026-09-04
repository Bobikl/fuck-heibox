package org.apache.tools.tar;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import org.apache.tools.ant.taskdefs.condition.z;
import org.apache.tools.zip.r;

/* JADX INFO: compiled from: TarEntry.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements c {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f137305r0 = 31;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f137306s0 = 16877;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f137307t0 = 33188;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f137308u0 = 1000;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f137309a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f137310b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f137311c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f137312d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f137313e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private long f137314f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private byte f137315g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private String f137316h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private String f137317i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private String f137318j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f137319k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f137320l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f137321m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f137322n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f137323o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f137324p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private File f137325q0;

    private d() {
        this.f137317i0 = c.U;
        this.f137318j0 = c.V;
        this.f137309a0 = "";
        this.f137316h0 = "";
        String property = System.getProperty("user.name", "");
        property = property.length() > 31 ? property.substring(0, 31) : property;
        this.f137311c0 = 0L;
        this.f137312d0 = 0L;
        this.f137319k0 = property;
        this.f137320l0 = "";
        this.f137325q0 = null;
    }

    public d(File file) {
        this(file, file.getPath());
    }

    public d(File file, String str) {
        this();
        String strI = I(str, false);
        this.f137325q0 = file;
        this.f137316h0 = "";
        if (file.isDirectory()) {
            this.f137310b0 = 16877;
            this.f137315g0 = c.K;
            int length = strI.length();
            if (length == 0 || strI.charAt(length - 1) != '/') {
                this.f137309a0 = strI + "/";
            } else {
                this.f137309a0 = strI;
            }
            this.f137313e0 = 0L;
        } else {
            this.f137310b0 = 33188;
            this.f137315g0 = c.F;
            this.f137313e0 = file.length();
            this.f137309a0 = strI;
        }
        this.f137314f0 = file.lastModified() / 1000;
        this.f137321m0 = 0;
        this.f137322n0 = 0;
    }

    public d(String str) {
        this(str, false);
    }

    public d(String str, byte b10) {
        this(str);
        this.f137315g0 = b10;
        if (b10 == 76) {
            this.f137317i0 = c.W;
            this.f137318j0 = c.X;
        }
    }

    public d(String str, boolean z10) {
        this();
        String strI = I(str, z10);
        boolean zEndsWith = strI.endsWith("/");
        this.f137321m0 = 0;
        this.f137322n0 = 0;
        this.f137309a0 = strI;
        this.f137310b0 = zEndsWith ? 16877 : 33188;
        this.f137315g0 = zEndsWith ? c.K : c.F;
        this.f137311c0 = 0L;
        this.f137312d0 = 0L;
        this.f137313e0 = 0L;
        this.f137314f0 = new Date().getTime() / 1000;
        this.f137316h0 = "";
        this.f137319k0 = "";
        this.f137320l0 = "";
    }

    public d(byte[] bArr) {
        this();
        J(bArr);
    }

    public d(byte[] bArr, r rVar) throws IOException {
        this();
        K(bArr, rVar);
    }

    private static boolean H(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        return w(bytes, 0, bytes.length, bArr, i10, i11, false);
    }

    private static String I(String str, boolean z10) {
        int iIndexOf;
        String lowerCase = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
        if (lowerCase != null) {
            if (lowerCase.startsWith("windows")) {
                if (str.length() > 2) {
                    char cCharAt = str.charAt(0);
                    if (str.charAt(1) == ':' && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                        str = str.substring(2);
                    }
                }
            } else if (lowerCase.contains(z.f133972n) && (iIndexOf = str.indexOf(58)) != -1) {
                str = str.substring(iIndexOf + 1);
            }
        }
        String strReplace = str.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
        while (!z10 && strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        return strReplace;
    }

    private void L(byte[] bArr, r rVar, boolean z10) throws IOException {
        this.f137309a0 = z10 ? h.o(bArr, 0, 100) : h.p(bArr, 0, 100, rVar);
        this.f137310b0 = (int) h.r(bArr, 100, 8);
        this.f137311c0 = (int) h.r(bArr, 108, 8);
        this.f137312d0 = (int) h.r(bArr, 116, 8);
        this.f137313e0 = h.r(bArr, 124, 12);
        this.f137314f0 = h.r(bArr, 136, 12);
        this.f137315g0 = bArr[156];
        this.f137316h0 = z10 ? h.o(bArr, bb.c.b.f30528b0, 100) : h.p(bArr, bb.c.b.f30528b0, 100, rVar);
        this.f137317i0 = h.o(bArr, 257, 6);
        this.f137318j0 = h.o(bArr, 263, 2);
        this.f137319k0 = z10 ? h.o(bArr, bb.c.b.f30623f2, 32) : h.p(bArr, bb.c.b.f30623f2, 32, rVar);
        this.f137320l0 = z10 ? h.o(bArr, bb.c.b.L2, 32) : h.p(bArr, bb.c.b.L2, 32, rVar);
        this.f137321m0 = (int) h.r(bArr, bb.c.b.f30899r3, 8);
        this.f137322n0 = (int) h.r(bArr, bb.c.b.f31075z3, 8);
        if (b(bArr) == 2) {
            this.f137323o0 = h.n(bArr, bb.c.b.f30834o6);
            this.f137324p0 = h.q(bArr, bb.c.b.f30857p6, 12);
            return;
        }
        String strO = z10 ? h.o(bArr, bb.c.b.H3, 155) : h.p(bArr, bb.c.b.H3, 155, rVar);
        if (v() && !this.f137309a0.endsWith("/")) {
            this.f137309a0 += "/";
        }
        if (strO.isEmpty()) {
            return;
        }
        this.f137309a0 = strO + "/" + this.f137309a0;
    }

    private int b(byte[] bArr) {
        if (H(c.W, bArr, 257, 6)) {
            return 2;
        }
        return H(c.U, bArr, 257, 6) ? 3 : 0;
    }

    private int e0(long j10, byte[] bArr, int i10, int i11, boolean z10) {
        return (z10 || (j10 >= 0 && j10 < (1 << ((i11 + (-1)) * 3)))) ? h.g(j10, bArr, i10, i11) : h.f(0L, bArr, i10, i11);
    }

    private static boolean w(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, boolean z10) {
        int i14 = i11 < i13 ? i11 : i13;
        for (int i15 = 0; i15 < i14; i15++) {
            if (bArr[i10 + i15] != bArr2[i12 + i15]) {
                return false;
            }
        }
        if (i11 == i13) {
            return true;
        }
        if (!z10) {
            return false;
        }
        if (i11 > i13) {
            while (i13 < i11) {
                if (bArr[i10 + i13] != 0) {
                    return false;
                }
                i13++;
            }
        } else {
            while (i11 < i13) {
                if (bArr2[i12 + i11] != 0) {
                    return false;
                }
                i11++;
            }
        }
        return true;
    }

    public boolean A() {
        return this.f137315g0 == 75;
    }

    public boolean B() {
        return this.f137315g0 == 76;
    }

    public boolean C() {
        return this.f137315g0 == 83;
    }

    public boolean D() {
        return this.f137315g0 == 103;
    }

    public boolean E() {
        return this.f137315g0 == 49;
    }

    public boolean F() {
        byte b10 = this.f137315g0;
        return b10 == 120 || b10 == 88;
    }

    public boolean G() {
        return this.f137315g0 == 50;
    }

    public void J(byte[] bArr) {
        try {
            try {
                K(bArr, h.f137367b);
            } catch (IOException unused) {
                L(bArr, h.f137367b, true);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void K(byte[] bArr, r rVar) throws IOException {
        L(bArr, rVar, false);
    }

    public void M(int i10) {
        if (i10 >= 0) {
            this.f137321m0 = i10;
            return;
        }
        throw new IllegalArgumentException("Major device number is out of range: " + i10);
    }

    public void N(int i10) {
        if (i10 >= 0) {
            this.f137322n0 = i10;
            return;
        }
        throw new IllegalArgumentException("Minor device number is out of range: " + i10);
    }

    public void O(int i10) {
        P(i10);
    }

    public void P(long j10) {
        this.f137312d0 = j10;
    }

    public void Q(String str) {
        this.f137320l0 = str;
    }

    public void R(int i10, int i11) {
        Z(i10);
        O(i11);
    }

    public void S(String str) {
        this.f137316h0 = str;
    }

    public void T(long j10) {
        this.f137314f0 = j10 / 1000;
    }

    public void U(Date date) {
        this.f137314f0 = date.getTime() / 1000;
    }

    public void V(int i10) {
        this.f137310b0 = i10;
    }

    public void W(String str) {
        this.f137309a0 = I(str, false);
    }

    public void X(String str, String str2) {
        b0(str);
        Q(str2);
    }

    public void Y(long j10) {
        if (j10 >= 0) {
            this.f137313e0 = j10;
            return;
        }
        throw new IllegalArgumentException("Size is out of range: " + j10);
    }

    public void Z(int i10) {
        a0(i10);
    }

    public boolean a(d dVar) {
        return dVar != null && n().equals(dVar.n());
    }

    public void a0(long j10) {
        this.f137311c0 = j10;
    }

    public void b0(String str) {
        this.f137319k0 = str;
    }

    public int c() {
        return this.f137321m0;
    }

    public void c0(byte[] bArr) {
        try {
            try {
                d0(bArr, h.f137367b, false);
            } catch (IOException unused) {
                d0(bArr, h.f137368c, false);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int d() {
        return this.f137322n0;
    }

    public void d0(byte[] bArr, r rVar, boolean z10) throws IOException {
        int iE0 = e0(this.f137314f0, bArr, e0(this.f137313e0, bArr, e0(this.f137312d0, bArr, e0(this.f137311c0, bArr, e0(this.f137310b0, bArr, h.i(this.f137309a0, bArr, 0, 100, rVar), 8, z10), 8, z10), 8, z10), 12, z10), 12, z10);
        int i10 = 0;
        int i11 = iE0;
        while (i10 < 8) {
            bArr[i11] = 32;
            i10++;
            i11++;
        }
        bArr[i11] = this.f137315g0;
        for (int iE1 = e0(this.f137322n0, bArr, e0(this.f137321m0, bArr, h.i(this.f137320l0, bArr, h.i(this.f137319k0, bArr, h.h(this.f137318j0, bArr, h.h(this.f137317i0, bArr, h.i(this.f137316h0, bArr, i11 + 1, 100, rVar), 6), 2), 32, rVar), 32, rVar), 8, z10), 8, z10); iE1 < bArr.length; iE1++) {
            bArr[iE1] = 0;
        }
        h.d(h.a(bArr), bArr, iE0, 8);
    }

    public d[] e() {
        File file = this.f137325q0;
        if (file == null || !file.isDirectory()) {
            return new d[0];
        }
        String[] list = this.f137325q0.list();
        d[] dVarArr = new d[list.length];
        for (int i10 = 0; i10 < list.length; i10++) {
            dVarArr[i10] = new d(new File(this.f137325q0, list[i10]));
        }
        return dVarArr;
    }

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && a((d) obj);
    }

    public File f() {
        return this.f137325q0;
    }

    @Deprecated
    public int g() {
        return (int) this.f137312d0;
    }

    public String h() {
        return this.f137320l0;
    }

    public int hashCode() {
        return n().hashCode();
    }

    public String i() {
        return this.f137316h0;
    }

    public long j() {
        return this.f137312d0;
    }

    public long k() {
        return this.f137311c0;
    }

    public Date l() {
        return new Date(this.f137314f0 * 1000);
    }

    public int m() {
        return this.f137310b0;
    }

    public String n() {
        return this.f137309a0;
    }

    public long o() {
        return this.f137324p0;
    }

    public long p() {
        return this.f137313e0;
    }

    @Deprecated
    public int q() {
        return (int) this.f137311c0;
    }

    public String r() {
        return this.f137319k0;
    }

    public boolean s() {
        return this.f137315g0 == 52;
    }

    public boolean t() {
        return this.f137315g0 == 51;
    }

    public boolean u(d dVar) {
        return dVar.n().startsWith(n());
    }

    public boolean v() {
        File file = this.f137325q0;
        if (file != null) {
            return file.isDirectory();
        }
        return this.f137315g0 == 53 || n().endsWith("/");
    }

    public boolean x() {
        return this.f137323o0;
    }

    public boolean y() {
        return this.f137315g0 == 54;
    }

    public boolean z() {
        File file = this.f137325q0;
        if (file != null) {
            return file.isFile();
        }
        byte b10 = this.f137315g0;
        return b10 == 0 || b10 == 48 || !n().endsWith("/");
    }
}
