package com.bumptech.glide.util;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f41974a = 16384;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f41975b = new AtomicReference<>();

    /* JADX INFO: renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static class C0346a extends InputStream {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f41976d = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final ByteBuffer f41977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41978c = -1;

        C0346a(@n0 ByteBuffer byteBuffer) {
            this.f41977b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f41977b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f41978c = this.f41977b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f41977b.hasRemaining()) {
                return this.f41977b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(@n0 byte[] bArr, int i10, int i11) {
            if (!this.f41977b.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f41977b.get(bArr, i10, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i10 = this.f41978c;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f41977b.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f41977b.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            ByteBuffer byteBuffer = this.f41977b;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }

    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f41979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f41981c;

        b(@n0 byte[] bArr, int i10, int i11) {
            this.f41981c = bArr;
            this.f41979a = i10;
            this.f41980b = i11;
        }
    }

    private a() {
    }

    @n0
    public static ByteBuffer a(@n0 File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @n0
    public static ByteBuffer b(@n0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f41975b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(andSet);
            if (i10 < 0) {
                f41975b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i10);
        }
    }

    @p0
    private static b c(@n0 ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @n0
    public static byte[] e(@n0 ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f41979a == 0 && bVarC.f41980b == bVarC.f41981c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(@n0 ByteBuffer byteBuffer, @n0 File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @n0
    public static InputStream g(@n0 ByteBuffer byteBuffer) {
        return new C0346a(byteBuffer);
    }

    public static void h(@n0 ByteBuffer byteBuffer, @n0 OutputStream outputStream) throws IOException {
        b bVarC = c(byteBuffer);
        if (bVarC != null) {
            byte[] bArr = bVarC.f41981c;
            int i10 = bVarC.f41979a;
            outputStream.write(bArr, i10, bVarC.f41980b + i10);
            return;
        }
        byte[] andSet = f41975b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int iMin = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, iMin);
            outputStream.write(andSet, 0, iMin);
        }
        f41975b.set(andSet);
    }
}
