package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: SntpClient.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51415a = "time.android.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51416b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51417c = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f51418d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f51419e = 40;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51420f = 48;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51421g = 123;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51422h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51423i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f51424j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f51425k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f51426l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f51427m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51428n = 15;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f51429o = 2208988800L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f51430p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f51431q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.b0("valueLock")
    private static boolean f51432r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.b0("valueLock")
    private static long f51433s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.b0("valueLock")
    private static String f51434t = "time.android.com";

    /* JADX INFO: compiled from: SntpClient.java */
    public interface b {
        void a(IOException iOException);

        void b();
    }

    /* JADX INFO: compiled from: SntpClient.java */
    public static final class c implements Loader.b<Loader.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private final b f51435b;

        public c(@androidx.annotation.p0 b bVar) {
            this.f51435b = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void p(Loader.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void q(Loader.e eVar, long j10, long j11) {
            if (this.f51435b != null) {
                if (i0.k()) {
                    this.f51435b.b();
                } else {
                    this.f51435b.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c s(Loader.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f51435b;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return Loader.f50885k;
        }
    }

    /* JADX INFO: compiled from: SntpClient.java */
    public static final class d implements Loader.e {
        private d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() throws IOException {
            synchronized (i0.f51430p) {
                synchronized (i0.f51431q) {
                    if (i0.f51432r) {
                        return;
                    }
                    long jL = i0.l();
                    synchronized (i0.f51431q) {
                        long unused = i0.f51433s = jL;
                        boolean unused2 = i0.f51432r = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
        }
    }

    private i0() {
    }

    private static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("SNTP: Untrusted mode: ");
            sb2.append((int) b11);
            throw new IOException(sb2.toString());
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("SNTP: Untrusted stratum: ");
            sb3.append(i10);
            throw new IOException(sb3.toString());
        }
    }

    public static long h() {
        long j10;
        synchronized (f51431q) {
            j10 = f51432r ? f51433s : com.google.android.exoplayer2.j.f46377b;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f51431q) {
            str = f51434t;
        }
        return str;
    }

    public static void j(@androidx.annotation.p0 Loader loader, @androidx.annotation.p0 b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f51431q) {
            z10 = f51432r;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = com.google.common.base.a.E;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, jN3);
            long j11 = (j10 + (((jN2 - jN) + (jN3 - j10)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long n(byte[] bArr, int i10) {
        long jM = m(bArr, i10);
        long jM2 = m(bArr, i10 + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - f51429o) * 1000) + ((jM2 * 1000) / 4294967296L);
    }

    public static void o(String str) {
        synchronized (f51431q) {
            if (!f51434t.equals(str)) {
                f51434t = str;
                f51432r = false;
            }
        }
    }

    private static void p(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + f51429o;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
