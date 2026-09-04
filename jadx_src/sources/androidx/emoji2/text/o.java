package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.w0;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.x1;

/* JADX INFO: compiled from: MetadataListReader.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23159a = 1164798569;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f23160b = 1701669481;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23161c = 1835365473;

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class a implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final ByteBuffer f23162c;

        a(@n0 ByteBuffer byteBuffer) {
            this.f23162c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o.d
        public void c(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f23162c;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.o.d
        public int d() throws IOException {
            return this.f23162c.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long e() throws IOException {
            return o.e(this.f23162c.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public long getPosition() {
            return this.f23162c.position();
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            return o.f(this.f23162c.getShort());
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class b implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final byte[] f23163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @n0
        private final ByteBuffer f23164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @n0
        private final InputStream f23165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f23166f = 0;

        b(@n0 InputStream inputStream) {
            this.f23165e = inputStream;
            byte[] bArr = new byte[4];
            this.f23163c = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f23164d = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void a(@f0(from = 0, to = 4) int i10) throws IOException {
            if (this.f23165e.read(this.f23163c, 0, i10) != i10) {
                throw new IOException("read failed");
            }
            this.f23166f += (long) i10;
        }

        @Override // androidx.emoji2.text.o.d
        public void c(int i10) throws IOException {
            while (i10 > 0) {
                int iSkip = (int) this.f23165e.skip(i10);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i10 -= iSkip;
                this.f23166f += (long) iSkip;
            }
        }

        @Override // androidx.emoji2.text.o.d
        public int d() throws IOException {
            this.f23164d.position(0);
            a(4);
            return this.f23164d.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long e() throws IOException {
            this.f23164d.position(0);
            a(4);
            return o.e(this.f23164d.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public long getPosition() {
            return this.f23166f;
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            this.f23164d.position(0);
            a(2);
            return o.f(this.f23164d.getShort());
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f23167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f23168b;

        c(long j10, long j11) {
            this.f23167a = j10;
            this.f23168b = j11;
        }

        long a() {
            return this.f23168b;
        }

        long b() {
            return this.f23167a;
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f23169a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f23170b = 4;

        void c(int i10) throws IOException;

        int d() throws IOException;

        long e() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private o() {
    }

    private static c a(d dVar) throws IOException {
        long jE;
        dVar.c(4);
        int unsignedShort = dVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        dVar.c(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jE = -1;
                break;
            }
            int iD = dVar.d();
            dVar.c(4);
            jE = dVar.e();
            dVar.c(4);
            if (1835365473 == iD) {
                break;
            }
            i10++;
        }
        if (jE != -1) {
            dVar.c((int) (jE - dVar.getPosition()));
            dVar.c(12);
            long jE2 = dVar.e();
            for (int i11 = 0; i11 < jE2; i11++) {
                int iD2 = dVar.d();
                long jE3 = dVar.e();
                long jE4 = dVar.e();
                if (f23159a == iD2 || f23160b == iD2) {
                    return new c(jE3 + jE, jE4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static androidx.emoji2.text.flatbuffer.o b(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.o oVarC = c(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return oVarC;
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static androidx.emoji2.text.flatbuffer.o c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c cVarA = a(bVar);
        bVar.c((int) (cVarA.b() - bVar.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) cVarA.a());
        int i10 = inputStream.read(byteBufferAllocate.array());
        if (i10 == cVarA.a()) {
            return androidx.emoji2.text.flatbuffer.o.G(byteBufferAllocate);
        }
        throw new IOException("Needed " + cVarA.a() + " bytes, got " + i10);
    }

    static androidx.emoji2.text.flatbuffer.o d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).b());
        return androidx.emoji2.text.flatbuffer.o.G(byteBufferDuplicate);
    }

    static long e(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    static int f(short s10) {
        return s10 & x1.f128661e;
    }
}
