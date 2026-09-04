package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public final class UdpDataSource extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f50916o = 2000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f50917p = 8000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f50918q = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f50920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final DatagramPacket f50921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f50922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private DatagramSocket f50923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private MulticastSocket f50924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private InetAddress f50925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f50926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50927n;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f50919f = i11;
        byte[] bArr = new byte[i10];
        this.f50920g = bArr;
        this.f50921h = new DatagramPacket(bArr, 0, i10);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws UdpDataSourceException {
        Uri uri = rVar.f51194a;
        this.f50922i = uri;
        String str = (String) com.google.android.exoplayer2.util.a.g(uri.getHost());
        int port = this.f50922i.getPort();
        y(rVar);
        try {
            this.f50925l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f50925l, port);
            if (this.f50925l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f50924k = multicastSocket;
                multicastSocket.joinGroup(this.f50925l);
                this.f50923j = this.f50924k;
            } else {
                this.f50923j = new DatagramSocket(inetSocketAddress);
            }
            this.f50923j.setSoTimeout(this.f50919f);
            this.f50926m = true;
            z(rVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
        this.f50922i = null;
        MulticastSocket multicastSocket = this.f50924k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) com.google.android.exoplayer2.util.a.g(this.f50925l));
            } catch (IOException unused) {
            }
            this.f50924k = null;
        }
        DatagramSocket datagramSocket = this.f50923j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f50923j = null;
        }
        this.f50925l = null;
        this.f50927n = 0;
        if (this.f50926m) {
            this.f50926m = false;
            x();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f50923j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f50922i;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f50927n == 0) {
            try {
                ((DatagramSocket) com.google.android.exoplayer2.util.a.g(this.f50923j)).receive(this.f50921h);
                int length = this.f50921h.getLength();
                this.f50927n = length;
                w(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f50921h.getLength();
        int i12 = this.f50927n;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f50920g, length2 - i12, bArr, i10, iMin);
        this.f50927n -= iMin;
        return iMin;
    }
}
