package com.google.android.exoplayer2.audio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: TeeAudioProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t0 extends y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f44271i;

    /* JADX INFO: compiled from: TeeAudioProcessor.java */
    public interface a {
        void a(ByteBuffer byteBuffer);

        void b(int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: TeeAudioProcessor.java */
    public static final class b implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f44272j = "WaveFileAudioBufferSink";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f44273k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f44274l = 40;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f44275m = 44;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f44276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f44277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteBuffer f44278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f44280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f44281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private RandomAccessFile f44282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f44283h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f44284i;

        public b(String str) {
            this.f44276a = str;
            byte[] bArr = new byte[1024];
            this.f44277b = bArr;
            this.f44278c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String c() {
            int i10 = this.f44283h;
            this.f44283h = i10 + 1;
            return com.google.android.exoplayer2.util.u0.H("%s-%04d.wav", this.f44276a, Integer.valueOf(i10));
        }

        private void d() throws IOException {
            if (this.f44282g != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
            g(randomAccessFile);
            this.f44282g = randomAccessFile;
            this.f44284i = 44;
        }

        private void e() throws IOException {
            RandomAccessFile randomAccessFile = this.f44282g;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.f44278c.clear();
                this.f44278c.putInt(this.f44284i - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.f44277b, 0, 4);
                this.f44278c.clear();
                this.f44278c.putInt(this.f44284i - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f44277b, 0, 4);
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.n(f44272j, "Error updating file size", e10);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.f44282g = null;
            }
        }

        private void f(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) com.google.android.exoplayer2.util.a.g(this.f44282g);
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f44277b.length);
                byteBuffer.get(this.f44277b, 0, iMin);
                randomAccessFile.write(this.f44277b, 0, iMin);
                this.f44284i += iMin;
            }
        }

        private void g(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(v0.f44313a);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(v0.f44314b);
            randomAccessFile.writeInt(v0.f44315c);
            this.f44278c.clear();
            this.f44278c.putInt(16);
            this.f44278c.putShort((short) v0.b(this.f44281f));
            this.f44278c.putShort((short) this.f44280e);
            this.f44278c.putInt(this.f44279d);
            int iO0 = com.google.android.exoplayer2.util.u0.o0(this.f44281f, this.f44280e);
            this.f44278c.putInt(this.f44279d * iO0);
            this.f44278c.putShort((short) iO0);
            this.f44278c.putShort((short) ((iO0 * 8) / this.f44280e));
            randomAccessFile.write(this.f44277b, 0, this.f44278c.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // com.google.android.exoplayer2.audio.t0.a
        public void a(ByteBuffer byteBuffer) {
            try {
                d();
                f(byteBuffer);
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(f44272j, "Error writing data", e10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.t0.a
        public void b(int i10, int i11, int i12) {
            try {
                e();
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(f44272j, "Error resetting", e10);
            }
            this.f44279d = i10;
            this.f44280e = i11;
            this.f44281f = i12;
        }
    }

    public t0(a aVar) {
        this.f44271i = (a) com.google.android.exoplayer2.util.a.g(aVar);
    }

    private void l() {
        if (isActive()) {
            a aVar = this.f44271i;
            AudioProcessor.a aVar2 = this.f44352b;
            aVar.b(aVar2.f43948a, aVar2.f43949b, aVar2.f43950c);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        this.f44271i.a(byteBuffer.asReadOnlyBuffer());
        k(iRemaining).put(byteBuffer).flip();
    }

    @Override // com.google.android.exoplayer2.audio.y
    public AudioProcessor.a g(AudioProcessor.a aVar) {
        return aVar;
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void h() {
        l();
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void i() {
        l();
    }

    @Override // com.google.android.exoplayer2.audio.y
    protected void j() {
        l();
    }
}
