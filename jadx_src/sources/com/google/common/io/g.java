package com.google.common.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f58669a = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58670b = 524288;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58671c = 2147483639;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58672d = 20;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final OutputStream f58673e = new a();

    /* JADX INFO: compiled from: ByteStreams.java */
    public class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            com.google.common.base.w.E(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            com.google.common.base.w.E(bArr);
            com.google.common.base.w.f0(i10, i11 + i10, bArr.length);
        }
    }

    /* JADX INFO: compiled from: ByteStreams.java */
    public static class b implements com.google.common.io.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataInput f58674b;

        b(ByteArrayInputStream byteArrayInputStream) {
            this.f58674b = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f58674b.readBoolean();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public byte readByte() {
            try {
                return this.f58674b.readByte();
            } catch (EOFException e10) {
                throw new IllegalStateException(e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public char readChar() {
            try {
                return this.f58674b.readChar();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public double readDouble() {
            try {
                return this.f58674b.readDouble();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public float readFloat() {
            try {
                return this.f58674b.readFloat();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.f58674b.readFully(bArr);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            try {
                this.f58674b.readFully(bArr, i10, i11);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readInt() {
            try {
                return this.f58674b.readInt();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        @CheckForNull
        public String readLine() {
            try {
                return this.f58674b.readLine();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public long readLong() {
            try {
                return this.f58674b.readLong();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public short readShort() {
            try {
                return this.f58674b.readShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public String readUTF() {
            try {
                return this.f58674b.readUTF();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f58674b.readUnsignedByte();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f58674b.readUnsignedShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.b, java.io.DataInput
        public int skipBytes(int i10) {
            try {
                return this.f58674b.skipBytes(i10);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: ByteStreams.java */
    public static class c implements com.google.common.io.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DataOutput f58675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ByteArrayOutputStream f58676c;

        c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f58676c = byteArrayOutputStream;
            this.f58675b = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.c
        public byte[] k() {
            return this.f58676c.toByteArray();
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(int i10) {
            try {
                this.f58675b.write(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.f58675b.write(bArr);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void write(byte[] bArr, int i10, int i11) {
            try {
                this.f58675b.write(bArr, i10, i11);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeBoolean(boolean z10) {
            try {
                this.f58675b.writeBoolean(z10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeByte(int i10) {
            try {
                this.f58675b.writeByte(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.f58675b.writeBytes(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeChar(int i10) {
            try {
                this.f58675b.writeChar(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.f58675b.writeChars(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeDouble(double d10) {
            try {
                this.f58675b.writeDouble(d10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeFloat(float f10) {
            try {
                this.f58675b.writeFloat(f10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeInt(int i10) {
            try {
                this.f58675b.writeInt(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeLong(long j10) {
            try {
                this.f58675b.writeLong(j10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeShort(int i10) {
            try {
                this.f58675b.writeShort(i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.c, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.f58675b.writeUTF(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: ByteStreams.java */
    public static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f58677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f58678c;

        d(InputStream inputStream, long j10) {
            super(inputStream);
            this.f58678c = -1L;
            com.google.common.base.w.E(inputStream);
            com.google.common.base.w.e(j10 >= 0, "limit must be non-negative");
            this.f58677b = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f58677b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f58678c = this.f58677b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f58677b == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f58677b--;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f58677b;
            if (j10 == 0) {
                return -1;
            }
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
            if (i12 != -1) {
                this.f58677b -= (long) i12;
            }
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f58678c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f58677b = this.f58678c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f58677b));
            this.f58677b -= jSkip;
            return jSkip;
        }
    }

    private g() {
    }

    private static byte[] a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i10) {
            return bArrRemove;
        }
        int length = i10 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i10);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    @s9.a
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        com.google.common.base.w.E(inputStream);
        com.google.common.base.w.E(outputStream);
        byte[] bArrD = d();
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArrD);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArrD, 0, i10);
            j10 += (long) i10;
        }
    }

    @s9.a
    public static long c(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        com.google.common.base.w.E(readableByteChannel);
        com.google.common.base.w.E(writableByteChannel);
        long jWrite = 0;
        if (!(readableByteChannel instanceof FileChannel)) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(d());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                s.b(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                s.a(byteBufferWrap);
            }
            return jWrite;
        }
        FileChannel fileChannel = (FileChannel) readableByteChannel;
        long jPosition = fileChannel.position();
        long j10 = jPosition;
        while (true) {
            long jTransferTo = fileChannel.transferTo(j10, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel);
            j10 += jTransferTo;
            fileChannel.position(j10);
            if (jTransferTo <= 0 && j10 >= fileChannel.size()) {
                return j10 - jPosition;
            }
        }
    }

    static byte[] d() {
        return new byte[8192];
    }

    @o9.a
    @s9.a
    public static long e(InputStream inputStream) throws IOException {
        byte[] bArrD = d();
        long j10 = 0;
        while (true) {
            long j11 = inputStream.read(bArrD);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @o9.a
    public static InputStream f(InputStream inputStream, long j10) {
        return new d(inputStream, j10);
    }

    @o9.a
    public static com.google.common.io.b g(ByteArrayInputStream byteArrayInputStream) {
        return new b((ByteArrayInputStream) com.google.common.base.w.E(byteArrayInputStream));
    }

    @o9.a
    public static com.google.common.io.b h(byte[] bArr) {
        return g(new ByteArrayInputStream(bArr));
    }

    @o9.a
    public static com.google.common.io.b i(byte[] bArr, int i10) {
        com.google.common.base.w.d0(i10, bArr.length);
        return g(new ByteArrayInputStream(bArr, i10, bArr.length - i10));
    }

    @o9.a
    public static com.google.common.io.c j() {
        return l(new ByteArrayOutputStream());
    }

    @o9.a
    public static com.google.common.io.c k(int i10) {
        if (i10 >= 0) {
            return l(new ByteArrayOutputStream(i10));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i10)));
    }

    @o9.a
    public static com.google.common.io.c l(ByteArrayOutputStream byteArrayOutputStream) {
        return new c((ByteArrayOutputStream) com.google.common.base.w.E(byteArrayOutputStream));
    }

    @o9.a
    public static OutputStream m() {
        return f58673e;
    }

    @o9.a
    @s9.a
    public static int n(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        com.google.common.base.w.E(inputStream);
        com.google.common.base.w.E(bArr);
        int i12 = 0;
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i11)));
        }
        com.google.common.base.w.f0(i10, i10 + i11, bArr.length);
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }

    @a0
    @s9.a
    @o9.a
    public static <T> T o(InputStream inputStream, com.google.common.io.d<T> dVar) throws IOException {
        int i10;
        com.google.common.base.w.E(inputStream);
        com.google.common.base.w.E(dVar);
        byte[] bArrD = d();
        do {
            i10 = inputStream.read(bArrD);
            if (i10 == -1) {
                break;
            }
        } while (dVar.a(bArrD, 0, i10));
        return dVar.getResult();
    }

    @o9.a
    public static void p(InputStream inputStream, byte[] bArr) throws IOException {
        q(inputStream, bArr, 0, bArr.length);
    }

    @o9.a
    public static void q(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int iN = n(inputStream, bArr, i10, i11);
        if (iN == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("reached end of stream after reading ");
        sb2.append(iN);
        sb2.append(" bytes; ");
        sb2.append(i11);
        sb2.append(" bytes expected");
        throw new EOFException(sb2.toString());
    }

    @o9.a
    public static void r(InputStream inputStream, long j10) throws IOException {
        long jT = t(inputStream, j10);
        if (jT >= j10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("reached end of stream after skipping ");
        sb2.append(jT);
        sb2.append(" bytes; ");
        sb2.append(j10);
        sb2.append(" bytes expected");
        throw new EOFException(sb2.toString());
    }

    private static long s(InputStream inputStream, long j10) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j10));
    }

    static long t(InputStream inputStream, long j10) throws IOException {
        byte[] bArr = null;
        long j11 = 0;
        while (j11 < j10) {
            long j12 = j10 - j11;
            long jS = s(inputStream, j12);
            if (jS == 0) {
                int iMin = (int) Math.min(j12, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jS = inputStream.read(bArr, 0, iMin);
                if (jS == -1) {
                    break;
                }
            }
            j11 += jS;
        }
        return j11;
    }

    public static byte[] u(InputStream inputStream) throws IOException {
        com.google.common.base.w.E(inputStream);
        return w(inputStream, new ArrayDeque(20), 0);
    }

    static byte[] v(InputStream inputStream, long j10) throws IOException {
        com.google.common.base.w.p(j10 >= 0, "expectedSize (%s) must be non-negative", j10);
        if (j10 > 2147483639) {
            StringBuilder sb2 = new StringBuilder(62);
            sb2.append(j10);
            sb2.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(sb2.toString());
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i10 - i11;
            int i13 = inputStream.read(bArr, i12, i11);
            if (i13 == -1) {
                return Arrays.copyOf(bArr, i12);
            }
            i11 -= i13;
        }
        int i14 = inputStream.read();
        if (i14 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i14});
        return w(inputStream, arrayDeque, i10 + 1);
    }

    private static byte[] w(InputStream inputStream, Queue<byte[]> queue, int i10) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < f58671c) {
            int iMin2 = Math.min(iMin, f58671c - i10);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return a(queue, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = com.google.common.math.f.u(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, f58671c);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
