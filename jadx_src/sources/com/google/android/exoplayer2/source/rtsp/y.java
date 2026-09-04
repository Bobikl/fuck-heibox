package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: RtspMessageChannel.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Charset f48977h = com.google.common.base.c.f56721c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48978i = "RtspMessageChannel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48979j = 554;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f48980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Loader f48981c = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, b> f48982d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f48983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Socket f48984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f48985g;

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public interface b {
        void p(byte[] bArr);
    }

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public final class c implements Loader.b<f> {
        private c() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void p(f fVar, long j10, long j11, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(f fVar, long j10, long j11) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!y.this.f48985g) {
                y.this.f48980b.c(iOException);
            }
            return Loader.f50885k;
        }
    }

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public interface d {
        void a(List<String> list, Exception exc);

        void b(List<String> list);

        void c(Exception exc);
    }

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f48987d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f48988e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f48989f = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f48990a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48991b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f48992c;

        private ImmutableList<String> a(byte[] bArr) {
            com.google.android.exoplayer2.util.a.i(this.f48991b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f48990a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, y.f48977h) : new String(bArr, 0, bArr.length - 2, y.f48977h));
            ImmutableList<String> immutableListV = ImmutableList.v(this.f48990a);
            e();
            return immutableListV;
        }

        @androidx.annotation.p0
        private ImmutableList<String> b(byte[] bArr) throws ParserException {
            com.google.android.exoplayer2.util.a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, y.f48977h);
            this.f48990a.add(str);
            int i10 = this.f48991b;
            if (i10 == 1) {
                if (!c0.e(str)) {
                    return null;
                }
                this.f48991b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long jF = c0.f(str);
            if (jF != -1) {
                this.f48992c = jF;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f48992c > 0) {
                this.f48991b = 3;
                return null;
            }
            ImmutableList<String> immutableListV = ImmutableList.v(this.f48990a);
            e();
            return immutableListV;
        }

        private static byte[] d(byte b10, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b11 = dataInputStream.readByte();
                bArr[1] = b11;
                byteArrayOutputStream.write(b11);
            }
        }

        private void e() {
            this.f48990a.clear();
            this.f48991b = 1;
            this.f48992c = 0L;
        }

        public ImmutableList<String> c(byte b10, DataInputStream dataInputStream) throws IOException {
            ImmutableList<String> immutableListB = b(d(b10, dataInputStream));
            while (immutableListB == null) {
                if (this.f48991b == 3) {
                    long j10 = this.f48992c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iD = Ints.d(j10);
                    com.google.android.exoplayer2.util.a.i(iD != -1);
                    byte[] bArr = new byte[iD];
                    dataInputStream.readFully(bArr, 0, iD);
                    immutableListB = a(bArr);
                } else {
                    immutableListB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return immutableListB;
        }
    }

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public final class f implements Loader.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte f48993e = 36;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DataInputStream f48994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f48995b = new e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f48996c;

        public f(InputStream inputStream) {
            this.f48994a = new DataInputStream(inputStream);
        }

        private void b() throws IOException {
            int unsignedByte = this.f48994a.readUnsignedByte();
            int unsignedShort = this.f48994a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f48994a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) y.this.f48982d.get(Integer.valueOf(unsignedByte));
            if (bVar == null || y.this.f48985g) {
                return;
            }
            bVar.p(bArr);
        }

        private void d(byte b10) throws IOException {
            if (y.this.f48985g) {
                return;
            }
            y.this.f48980b.b(this.f48995b.c(b10, this.f48994a));
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() throws IOException {
            while (!this.f48996c) {
                byte b10 = this.f48994a.readByte();
                if (b10 == 36) {
                    b();
                } else {
                    d(b10);
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
            this.f48996c = true;
        }
    }

    /* JADX INFO: compiled from: RtspMessageChannel.java */
    public final class g implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OutputStream f48998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f48999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f49000d;

        public g(OutputStream outputStream) {
            this.f48998b = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f48999c = handlerThread;
            handlerThread.start();
            this.f49000d = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(byte[] bArr, List list) {
            try {
                this.f48998b.write(bArr);
            } catch (Exception e10) {
                if (y.this.f48985g) {
                    return;
                }
                y.this.f48980b.a(list, e10);
            }
        }

        public void c(final List<String> list) {
            final byte[] bArrA = c0.a(list);
            this.f49000d.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48649b.b(bArrA, list);
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f49000d;
            final HandlerThread handlerThread = this.f48999c;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.b0
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f48999c.join();
            } catch (InterruptedException unused) {
                this.f48999c.interrupt();
            }
        }
    }

    public y(d dVar) {
        this.f48980b = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f48985g) {
            return;
        }
        try {
            g gVar = this.f48983e;
            if (gVar != null) {
                gVar.close();
            }
            this.f48981c.l();
            Socket socket = this.f48984f;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f48985g = true;
        }
    }

    public void d(Socket socket) throws IOException {
        this.f48984f = socket;
        this.f48983e = new g(socket.getOutputStream());
        this.f48981c.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void e(int i10, b bVar) {
        this.f48982d.put(Integer.valueOf(i10), bVar);
    }

    public void f(List<String> list) {
        com.google.android.exoplayer2.util.a.k(this.f48983e);
        this.f48983e.c(list);
    }
}
