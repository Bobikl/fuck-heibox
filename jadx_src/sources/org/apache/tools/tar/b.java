package org.apache.tools.tar;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: TarBuffer.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f137268j = 512;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f137269k = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f137270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f137271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f137273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f137274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f137275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f137277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f137278i;

    public b(InputStream inputStream) {
        this(inputStream, 10240);
    }

    public b(InputStream inputStream, int i10) {
        this(inputStream, i10, 512);
    }

    public b(InputStream inputStream, int i10, int i11) {
        this(inputStream, null, i10, i11);
    }

    private b(InputStream inputStream, OutputStream outputStream, int i10, int i11) {
        this.f137270a = inputStream;
        this.f137271b = outputStream;
        this.f137278i = false;
        this.f137272c = i10;
        this.f137273d = i11;
        int i12 = i10 / i11;
        this.f137274e = i12;
        this.f137275f = new byte[i10];
        if (inputStream != null) {
            this.f137276g = -1;
            this.f137277h = i12;
        } else {
            this.f137276g = 0;
            this.f137277h = 0;
        }
    }

    public b(OutputStream outputStream) {
        this(outputStream, 10240);
    }

    public b(OutputStream outputStream, int i10) {
        this(outputStream, i10, 512);
    }

    public b(OutputStream outputStream, int i10, int i11) {
        this(null, outputStream, i10, i11);
    }

    private boolean h() throws IOException {
        if (this.f137278i) {
            System.err.println("ReadBlock: blkIdx = " + this.f137276g);
        }
        if (this.f137270a == null) {
            throw new IOException("reading from an output buffer");
        }
        this.f137277h = 0;
        int i10 = this.f137272c;
        int i11 = 0;
        while (i10 > 0) {
            long j10 = this.f137270a.read(this.f137275f, i11, i10);
            if (j10 == -1) {
                if (i11 != 0) {
                    Arrays.fill(this.f137275f, i11, i10 + i11, (byte) 0);
                    break;
                }
                return false;
            }
            i11 = (int) (((long) i11) + j10);
            i10 = (int) (((long) i10) - j10);
            if (j10 != this.f137272c && this.f137278i) {
                System.err.println("ReadBlock: INCOMPLETE READ " + j10 + " of " + this.f137272c + " bytes read.");
            }
        }
        this.f137276g++;
        return true;
    }

    private void l() throws IOException {
        if (this.f137278i) {
            System.err.println("WriteBlock: blkIdx = " + this.f137276g);
        }
        OutputStream outputStream = this.f137271b;
        if (outputStream == null) {
            throw new IOException("writing to an input buffer");
        }
        outputStream.write(this.f137275f, 0, this.f137272c);
        this.f137271b.flush();
        this.f137277h = 0;
        this.f137276g++;
        Arrays.fill(this.f137275f, (byte) 0);
    }

    public void a() throws IOException {
        if (this.f137278i) {
            System.err.println("TarBuffer.closeBuffer().");
        }
        if (this.f137271b == null) {
            InputStream inputStream = this.f137270a;
            if (inputStream != null) {
                if (inputStream != System.in) {
                    inputStream.close();
                }
                this.f137270a = null;
                return;
            }
            return;
        }
        b();
        OutputStream outputStream = this.f137271b;
        if (outputStream == System.out || outputStream == System.err) {
            return;
        }
        outputStream.close();
        this.f137271b = null;
    }

    void b() throws IOException {
        if (this.f137278i) {
            System.err.println("TarBuffer.flushBlock() called.");
        }
        if (this.f137271b == null) {
            throw new IOException("writing to an input buffer");
        }
        if (this.f137277h > 0) {
            l();
        }
    }

    public int c() {
        return this.f137272c;
    }

    public int d() {
        return this.f137276g;
    }

    public int e() {
        return this.f137277h - 1;
    }

    public int f() {
        return this.f137273d;
    }

    public boolean g(byte[] bArr) {
        int iF = f();
        for (int i10 = 0; i10 < iF; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public byte[] i() throws IOException {
        if (this.f137278i) {
            System.err.println("ReadRecord: recIdx = " + this.f137277h + " blkIdx = " + this.f137276g);
        }
        if (this.f137270a == null) {
            if (this.f137271b == null) {
                throw new IOException("input buffer is closed");
            }
            throw new IOException("reading from an output buffer");
        }
        if (this.f137277h >= this.f137274e && !h()) {
            return null;
        }
        int i10 = this.f137273d;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f137275f, this.f137277h * i10, bArr, 0, i10);
        this.f137277h++;
        return bArr;
    }

    public void j(boolean z10) {
        this.f137278i = z10;
    }

    public void k() throws IOException {
        if (this.f137278i) {
            System.err.println("SkipRecord: recIdx = " + this.f137277h + " blkIdx = " + this.f137276g);
        }
        if (this.f137270a == null) {
            throw new IOException("reading (via skip) from an output buffer");
        }
        if (this.f137277h < this.f137274e || h()) {
            this.f137277h++;
        }
    }

    public void m(byte[] bArr) throws IOException {
        if (this.f137278i) {
            System.err.println("WriteRecord: recIdx = " + this.f137277h + " blkIdx = " + this.f137276g);
        }
        if (this.f137271b == null) {
            if (this.f137270a != null) {
                throw new IOException("writing to an input buffer");
            }
            throw new IOException("Output buffer is closed");
        }
        if (bArr.length != this.f137273d) {
            throw new IOException("record to write has length '" + bArr.length + "' which is not the record size of '" + this.f137273d + "'");
        }
        if (this.f137277h >= this.f137274e) {
            l();
        }
        byte[] bArr2 = this.f137275f;
        int i10 = this.f137277h;
        int i11 = this.f137273d;
        System.arraycopy(bArr, 0, bArr2, i10 * i11, i11);
        this.f137277h++;
    }

    public void n(byte[] bArr, int i10) throws IOException {
        if (this.f137278i) {
            System.err.println("WriteRecord: recIdx = " + this.f137277h + " blkIdx = " + this.f137276g);
        }
        if (this.f137271b == null) {
            if (this.f137270a != null) {
                throw new IOException("writing to an input buffer");
            }
            throw new IOException("Output buffer is closed");
        }
        if (this.f137273d + i10 <= bArr.length) {
            if (this.f137277h >= this.f137274e) {
                l();
            }
            byte[] bArr2 = this.f137275f;
            int i11 = this.f137277h;
            int i12 = this.f137273d;
            System.arraycopy(bArr, i10, bArr2, i11 * i12, i12);
            this.f137277h++;
            return;
        }
        throw new IOException("record has length '" + bArr.length + "' with offset '" + i10 + "' which is less than the record size of '" + this.f137273d + "'");
    }
}
