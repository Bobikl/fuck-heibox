package org.apache.tools.tar;

import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.tools.zip.r;
import org.apache.tools.zip.s;

/* JADX INFO: compiled from: TarInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends FilterInputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f137327m = 256;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f137328n = 8192;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f137329o = 32768;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f137330p = 255;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f137331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f137332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f137333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f137334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f137335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f137336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected byte[] f137337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected b f137338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected d f137339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected byte[] f137340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final r f137341l;

    public f(InputStream inputStream) {
        this(inputStream, 10240, 512);
    }

    public f(InputStream inputStream, int i10) {
        this(inputStream, i10, 512);
    }

    public f(InputStream inputStream, int i10, int i11) {
        this(inputStream, i10, i11, null);
    }

    public f(InputStream inputStream, int i10, int i11, String str) {
        super(inputStream);
        this.f137331b = new byte[8192];
        this.f137332c = new byte[256];
        this.f137338i = new b(inputStream, i10, i11);
        this.f137337h = null;
        this.f137340k = new byte[1];
        this.f137333d = false;
        this.f137334e = false;
        this.f137341l = s.b(str);
    }

    public f(InputStream inputStream, int i10, String str) {
        this(inputStream, i10, 512, str);
    }

    public f(InputStream inputStream, String str) {
        this(inputStream, 10240, 512, str);
    }

    private void b(Map<String, String> map) {
        map.forEach(new BiConsumer() { // from class: org.apache.tools.tar.e
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f137326a.m((String) obj, (String) obj2);
            }
        });
    }

    private byte[] g() throws IOException {
        if (this.f137334e) {
            return null;
        }
        byte[] bArrI = this.f137338i.i();
        if (bArrI == null) {
            if (this.f137333d) {
                System.err.println("READ NULL RECORD");
            }
            this.f137334e = true;
        } else if (this.f137338i.g(bArrI)) {
            if (this.f137333d) {
                System.err.println("READ EOF RECORD");
            }
            this.f137334e = true;
        }
        if (this.f137334e) {
            return null;
        }
        return bArrI;
    }

    private boolean k() {
        d dVar = this.f137339j;
        return dVar != null && dVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, String str2) {
        str.hashCode();
        switch (str) {
            case "SCHILY.devmajor":
                this.f137339j.M(Integer.parseInt(str2));
                break;
            case "SCHILY.devminor":
                this.f137339j.N(Integer.parseInt(str2));
                break;
            case "gid":
                this.f137339j.P(Long.parseLong(str2));
                break;
            case "uid":
                this.f137339j.a0(Long.parseLong(str2));
                break;
            case "path":
                this.f137339j.W(str2);
                break;
            case "size":
                this.f137339j.Y(Long.parseLong(str2));
                break;
            case "gname":
                this.f137339j.Q(str2);
                break;
            case "mtime":
                this.f137339j.T((long) (Double.parseDouble(str2) * 1000.0d));
                break;
            case "uname":
                this.f137339j.b0(str2);
                break;
            case "linkpath":
                this.f137339j.S(str2);
                break;
        }
    }

    private void o() throws IOException {
        Map<String, String> mapN = n(this);
        f();
        b(mapN);
    }

    private void p() throws IOException {
        byte[] bArrG;
        if (this.f137339j.x()) {
            do {
                bArrG = g();
                if (this.f137334e) {
                    this.f137339j = null;
                    return;
                }
            } while (new a(bArrG).a());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (k()) {
            return 0;
        }
        long j10 = this.f137335f;
        long j11 = this.f137336g;
        if (j10 - j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) (j10 - j11);
    }

    public boolean c(d dVar) {
        return !dVar.C();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f137338i.a();
    }

    public void d(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int i10 = read(bArr, 0, 32768);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    protected byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = read(this.f137332c);
            if (i10 < 0) {
                break;
            }
            byteArrayOutputStream.write(this.f137332c, 0, i10);
        }
        f();
        if (this.f137339j == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    public d f() throws IOException {
        if (this.f137334e) {
            return null;
        }
        if (this.f137339j != null) {
            long j10 = this.f137335f - this.f137336g;
            if (this.f137333d) {
                System.err.println("TarInputStream: SKIP currENTRY '" + this.f137339j.n() + "' SZ " + this.f137335f + " OFF " + this.f137336g + "  skipping " + j10 + " bytes");
            }
            while (j10 > 0) {
                long jSkip = skip(j10);
                if (jSkip <= 0) {
                    throw new IOException("failed to skip current tar entry");
                }
                j10 -= jSkip;
            }
            this.f137337h = null;
        }
        byte[] bArrG = g();
        if (this.f137334e) {
            this.f137339j = null;
            return null;
        }
        try {
            this.f137339j = new d(bArrG, this.f137341l);
            if (this.f137333d) {
                System.err.println("TarInputStream: SET CURRENTRY '" + this.f137339j.n() + "' size = " + this.f137339j.p());
            }
            this.f137336g = 0L;
            this.f137335f = this.f137339j.p();
            if (this.f137339j.A()) {
                byte[] bArrE = e();
                if (bArrE == null) {
                    return null;
                }
                this.f137339j.S(this.f137341l.decode(bArrE));
            }
            if (this.f137339j.B()) {
                byte[] bArrE2 = e();
                if (bArrE2 == null) {
                    return null;
                }
                this.f137339j.W(this.f137341l.decode(bArrE2));
            }
            if (this.f137339j.F()) {
                o();
            }
            if (this.f137339j.C()) {
                p();
            }
            this.f137335f = this.f137339j.p();
            return this.f137339j;
        } catch (IllegalArgumentException e10) {
            throw new IOException("Error detected parsing the header", e10);
        }
    }

    public int i() {
        return this.f137338i.f();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    Map<String, String> n(InputStream inputStream) throws IOException {
        int i10;
        int i11;
        HashMap map = new HashMap();
        do {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = inputStream.read();
                if (i10 == -1) {
                    break;
                }
                i12++;
                if (i10 == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        i11 = inputStream.read();
                        if (i11 == -1) {
                            break;
                        }
                        i12++;
                        if (i11 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int i14 = i13 - i12;
                            byte[] bArr = new byte[i14];
                            int i15 = 0;
                            while (i15 < i14) {
                                i11 = inputStream.read();
                                if (i11 == -1) {
                                    break;
                                }
                                bArr[i15] = (byte) i11;
                                i15++;
                            }
                            if (i15 == i14) {
                                map.put(string, new String(bArr, 0, i14 - 1, StandardCharsets.UTF_8));
                                break;
                            }
                            throw new IOException("Failed to read Paxheader. Expected " + i14 + " bytes, read " + i15);
                        }
                        byteArrayOutputStream.write((byte) i11);
                    }
                    i10 = i11;
                    break;
                }
                i13 = (i13 * 10) + (i10 - 48);
            }
        } while (i10 != -1);
        return map;
    }

    public void q(boolean z10) {
        this.f137333d = z10;
        this.f137338i.j(z10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (read(this.f137340k, 0, 1) == -1) {
            return -1;
        }
        return this.f137340k[0] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (this.f137336g >= this.f137335f || k()) {
            return -1;
        }
        long j10 = this.f137336g;
        long j11 = ((long) i11) + j10;
        long j12 = this.f137335f;
        if (j11 > j12) {
            i11 = (int) (j12 - j10);
        }
        byte[] bArr2 = this.f137337h;
        if (bArr2 != null) {
            int length = i11 > bArr2.length ? bArr2.length : i11;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            byte[] bArr3 = this.f137337h;
            if (length >= bArr3.length) {
                this.f137337h = null;
            } else {
                int length2 = bArr3.length - length;
                byte[] bArr4 = new byte[length2];
                System.arraycopy(bArr3, length, bArr4, 0, length2);
                this.f137337h = bArr4;
            }
            i12 = length + 0;
            i11 -= length;
            i10 += length;
        } else {
            i12 = 0;
        }
        while (i11 > 0) {
            byte[] bArrI = this.f137338i.i();
            if (bArrI == null) {
                throw new IOException("unexpected EOF with " + i11 + " bytes unread");
            }
            int length3 = bArrI.length;
            if (length3 > i11) {
                System.arraycopy(bArrI, 0, bArr, i10, i11);
                int i13 = length3 - i11;
                byte[] bArr5 = new byte[i13];
                this.f137337h = bArr5;
                System.arraycopy(bArrI, i11, bArr5, 0, i13);
                length3 = i11;
            } else {
                System.arraycopy(bArrI, 0, bArr, i10, length3);
            }
            i12 += length3;
            i11 -= length3;
            i10 += length3;
        }
        this.f137336g += (long) i12;
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        if (j10 <= 0 || k()) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            byte[] bArr = this.f137331b;
            int i10 = read(bArr, 0, (int) (j11 > ((long) bArr.length) ? bArr.length : j11));
            if (i10 == -1) {
                break;
            }
            j11 -= (long) i10;
        }
        return j10 - j11;
    }
}
