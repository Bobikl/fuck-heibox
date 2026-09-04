package org.apache.tools.tar;

import com.huawei.hms.framework.common.ContainerUtils;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.tools.zip.r;
import org.apache.tools.zip.s;

/* JADX INFO: compiled from: TarOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class g extends FilterOutputStream {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f137342r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f137343s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f137344t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f137345u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f137346v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f137347w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f137348x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final r f137349y = s.b("ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f137350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f137351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f137352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f137353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f137354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected byte[] f137355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f137356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected byte[] f137357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f137358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f137359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f137360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f137361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f137362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f137363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f137364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f137365q;

    public g(OutputStream outputStream) {
        this(outputStream, 10240, 512);
    }

    public g(OutputStream outputStream, int i10) {
        this(outputStream, i10, 512);
    }

    public g(OutputStream outputStream, int i10, int i11) {
        this(outputStream, i10, i11, null);
    }

    public g(OutputStream outputStream, int i10, int i11, String str) {
        super(outputStream);
        this.f137359k = 0;
        this.f137360l = 0;
        this.f137361m = false;
        this.f137362n = false;
        this.f137363o = false;
        this.f137365q = false;
        this.f137364p = s.b(str);
        this.f137358j = new b(outputStream, i10, i11);
        this.f137350b = false;
        this.f137356h = 0;
        this.f137357i = new byte[i11];
        this.f137355g = new byte[i11];
        this.f137354f = new byte[1];
    }

    public g(OutputStream outputStream, int i10, String str) {
        this(outputStream, i10, 512, str);
    }

    public g(OutputStream outputStream, String str) {
        this(outputStream, 10240, 512, str);
    }

    private void a(Map<String, String> map, String str, long j10, long j11) {
        if (j10 < 0 || j10 > j11) {
            map.put(str, String.valueOf(j10));
        }
    }

    private void b(Map<String, String> map, d dVar) {
        a(map, UiKitSpanObj.TYPE_SIZE, dVar.p(), c.f137288j);
        a(map, "gid", dVar.j(), c.f137285g);
        a(map, "mtime", dVar.l().getTime() / 1000, c.f137288j);
        a(map, "uid", dVar.k(), c.f137285g);
        a(map, "SCHILY.devmajor", dVar.c(), c.f137285g);
        a(map, "SCHILY.devminor", dVar.d(), c.f137285g);
        d("mode", dVar.m(), c.f137285g);
    }

    private void d(String str, long j10, long j11) {
        e(str, j10, j11, "");
    }

    private void e(String str, long j10, long j11, String str2) {
        if (j10 < 0 || j10 > j11) {
            throw new RuntimeException(str + " '" + j10 + "' is too big ( > " + j11 + " )");
        }
    }

    private void f(String str, long j10, long j11) {
        e(str, j10, j11, " Use STAR or POSIX extensions to overcome this limit");
    }

    private void g(d dVar) {
        d("entry size", dVar.p(), c.f137288j);
        f("group id", dVar.j(), c.f137285g);
        d("last modification time", dVar.l().getTime() / 1000, c.f137288j);
        d("user id", dVar.k(), c.f137285g);
        d("mode", dVar.m(), c.f137285g);
        d("major device number", dVar.c(), c.f137285g);
        d("minor device number", dVar.d(), c.f137285g);
    }

    private boolean m(d dVar, String str, Map<String, String> map, String str2, byte b10, String str3) throws IOException {
        ByteBuffer byteBufferA = this.f137364p.a(str);
        int iLimit = byteBufferA.limit() - byteBufferA.position();
        if (iLimit >= 100) {
            int i10 = this.f137359k;
            if (i10 == 3) {
                map.put(str2, str);
                return true;
            }
            if (i10 == 2) {
                d dVar2 = new d(c.Z, b10);
                dVar2.Y(iLimit + 1);
                x(dVar, dVar2);
                n(dVar2);
                write(byteBufferA.array(), byteBufferA.arrayOffset(), iLimit);
                write(0);
                c();
            } else if (i10 != 1) {
                throw new RuntimeException(str3 + " '" + str + "' is too long ( > 100 bytes)");
            }
        }
        return false;
    }

    private String t(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (char c10 : str.toCharArray()) {
            char c11 = (char) (c10 & com.google.common.base.a.N);
            if (c11 != 0) {
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    private void x(d dVar, d dVar2) {
        Date dateL = dVar.l();
        long time = dateL.getTime() / 1000;
        if (time < 0 || time > c.f137288j) {
            dateL = new Date(0L);
        }
        dVar2.U(dateL);
    }

    private void z() throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f137355g;
            if (i10 >= bArr.length) {
                this.f137358j.m(bArr);
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    void A(d dVar, String str, Map<String, String> map) throws IOException {
        String strSubstring = "./PaxHeaders.X/" + t(str);
        if (strSubstring.length() >= 100) {
            strSubstring = strSubstring.substring(0, 99);
        }
        while (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        d dVar2 = new d(strSubstring, c.Q);
        x(dVar, dVar2);
        StringWriter stringWriter = new StringWriter();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            int length = key.length() + value.length() + 3 + 2;
            String str2 = length + " " + key + ContainerUtils.KEY_VALUE_DELIMITER + value + "\n";
            int length2 = str2.getBytes(StandardCharsets.UTF_8).length;
            while (length != length2) {
                str2 = length2 + " " + key + ContainerUtils.KEY_VALUE_DELIMITER + value + "\n";
                int i10 = length2;
                length2 = str2.getBytes(StandardCharsets.UTF_8).length;
                length = i10;
            }
            stringWriter.write(str2);
        }
        byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
        dVar2.Y(bytes.length);
        n(dVar2);
        write(bytes);
        c();
    }

    public void c() throws IOException {
        byte[] bArr;
        if (this.f137363o) {
            throw new IOException("Stream has already been finished");
        }
        if (!this.f137362n) {
            throw new IOException("No current entry to close");
        }
        int i10 = this.f137356h;
        if (i10 > 0) {
            while (true) {
                bArr = this.f137357i;
                if (i10 >= bArr.length) {
                    break;
                }
                bArr[i10] = 0;
                i10++;
            }
            this.f137358j.m(bArr);
            this.f137353e += (long) this.f137356h;
            this.f137356h = 0;
        }
        if (this.f137353e >= this.f137351c) {
            this.f137362n = false;
            return;
        }
        throw new IOException("entry '" + this.f137352d + "' closed at '" + this.f137353e + "' before the '" + this.f137351c + "' bytes specified in the header were written");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f137363o) {
            i();
        }
        if (this.f137361m) {
            return;
        }
        this.f137358j.a();
        ((FilterOutputStream) this).out.close();
        this.f137361m = true;
    }

    public void i() throws IOException {
        if (this.f137363o) {
            throw new IOException("This archive has already been finished");
        }
        if (this.f137362n) {
            throw new IOException("This archives contains unclosed entries.");
        }
        z();
        z();
        this.f137358j.b();
        this.f137363o = true;
    }

    public int k() {
        return this.f137358j.f();
    }

    public void n(d dVar) throws IOException {
        if (this.f137363o) {
            throw new IOException("Stream has already been finished");
        }
        HashMap map = new HashMap();
        String strN = dVar.n();
        boolean zM = m(dVar, strN, map, FlutterActivityLaunchConfigs.EXTRA_PATH, c.O, "file name");
        String strI = dVar.i();
        boolean z10 = (strI == null || strI.isEmpty() || !m(dVar, strI, map, "linkpath", c.N, "link name")) ? false : true;
        int i10 = this.f137360l;
        if (i10 == 2) {
            b(map, dVar);
        } else if (i10 != 1) {
            g(dVar);
        }
        if (this.f137365q && !zM && !f137349y.b(strN)) {
            map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, strN);
        }
        if (this.f137365q && !z10 && ((dVar.E() || dVar.G()) && !f137349y.b(strI))) {
            map.put("linkpath", strI);
        }
        if (map.size() > 0) {
            A(dVar, strN, map);
        }
        dVar.d0(this.f137355g, this.f137364p, this.f137360l == 1);
        this.f137358j.m(this.f137355g);
        this.f137353e = 0L;
        if (dVar.v()) {
            this.f137351c = 0L;
        } else {
            this.f137351c = dVar.p();
        }
        this.f137352d = strN;
        this.f137362n = true;
    }

    public void o(boolean z10) {
        this.f137365q = z10;
    }

    public void p(int i10) {
        this.f137360l = i10;
    }

    public void q(boolean z10) {
        this.f137358j.j(z10);
    }

    public void r(boolean z10) {
        this.f137350b = z10;
    }

    public void s(int i10) {
        this.f137359k = i10;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f137354f;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f137353e + ((long) i11) > this.f137351c) {
            throw new IOException("request to write '" + i11 + "' bytes exceeds size in header of '" + this.f137351c + "' bytes for entry '" + this.f137352d + "'");
        }
        int i12 = this.f137356h;
        if (i12 > 0) {
            int i13 = i12 + i11;
            byte[] bArr2 = this.f137355g;
            if (i13 >= bArr2.length) {
                int length = bArr2.length - i12;
                System.arraycopy(this.f137357i, 0, bArr2, 0, i12);
                System.arraycopy(bArr, i10, this.f137355g, this.f137356h, length);
                this.f137358j.m(this.f137355g);
                this.f137353e += (long) this.f137355g.length;
                i10 += length;
                i11 -= length;
                this.f137356h = 0;
            } else {
                System.arraycopy(bArr, i10, this.f137357i, i12, i11);
                i10 += i11;
                this.f137356h += i11;
                i11 = 0;
            }
        }
        while (i11 > 0) {
            if (i11 < this.f137355g.length) {
                System.arraycopy(bArr, i10, this.f137357i, this.f137356h, i11);
                this.f137356h += i11;
                return;
            } else {
                this.f137358j.n(bArr, i10);
                int length2 = this.f137355g.length;
                this.f137353e += (long) length2;
                i11 -= length2;
                i10 += length2;
            }
        }
    }
}
