package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultAudioSink implements AudioSink {
    public static boolean A0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final float f43965e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final float f43966f0 = 0.1f;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final float f43967g0 = 8.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final float f43968h0 = 0.1f;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final float f43969i0 = 8.0f;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final boolean f43970j0 = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f43971k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f43972l0 = 1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f43973m0 = 2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f43974n0 = 3;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f43975o0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f43976p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f43977q0 = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final long f43978r0 = 250000;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final long f43979s0 = 750000;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final long f43980t0 = 250000;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final long f43981u0 = 50000000;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f43982v0 = 4;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f43983w0 = 2;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f43984x0 = -32;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f43985y0 = 100;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f43986z0 = "DefaultAudioSink";
    private b3 A;

    @androidx.annotation.p0
    private ByteBuffer B;
    private int C;
    private long D;
    private long E;
    private long F;
    private long G;
    private int H;
    private boolean I;
    private boolean J;
    private long K;
    private float L;
    private AudioProcessor[] M;
    private ByteBuffer[] N;

    @androidx.annotation.p0
    private ByteBuffer O;
    private int P;

    @androidx.annotation.p0
    private ByteBuffer Q;
    private byte[] R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private x Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f43987a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f43988b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f43989c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f43990d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.audio.h f43991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f43992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f43993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f43994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u0 f43995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AudioProcessor[] f43996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AudioProcessor[] f43997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ConditionVariable f43998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w f43999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque<e> f44000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f44001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f44002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private i f44003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g<AudioSink.InitializationException> f44004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final g<AudioSink.WriteException> f44005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private AudioSink.a f44006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private c f44007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f44008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private AudioTrack f44009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.f f44010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    private e f44011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e f44012z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }

        /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }
    }

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AudioTrack f44013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f44013b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f44013b.flush();
                this.f44013b.release();
            } finally {
                DefaultAudioSink.this.f43998l.open();
            }
        }
    }

    public interface b {
        AudioProcessor[] a();

        b3 b(b3 b3Var);

        long c();

        long d(long j10);

        boolean e(boolean z10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a2 f44015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f44020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f44021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f44022h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioProcessor[] f44023i;

        public c(a2 a2Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, AudioProcessor[] audioProcessorArr) {
            this.f44015a = a2Var;
            this.f44016b = i10;
            this.f44017c = i11;
            this.f44018d = i12;
            this.f44019e = i13;
            this.f44020f = i14;
            this.f44021g = i15;
            this.f44023i = audioProcessorArr;
            this.f44022h = c(i16, z10);
        }

        private int c(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f44017c;
            if (i11 == 0) {
                return m(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                return l(DefaultAudioSink.f43981u0);
            }
            if (i11 == 2) {
                return l(250000L);
            }
            throw new IllegalStateException();
        }

        private AudioTrack d(boolean z10, com.google.android.exoplayer2.audio.f fVar, int i10) {
            int i11 = com.google.android.exoplayer2.util.u0.f51536a;
            if (i11 >= 29) {
                return f(z10, fVar, i10);
            }
            return i11 >= 21 ? e(z10, fVar, i10) : g(fVar, i10);
        }

        @androidx.annotation.w0(21)
        private AudioTrack e(boolean z10, com.google.android.exoplayer2.audio.f fVar, int i10) {
            return new AudioTrack(j(fVar, z10), DefaultAudioSink.K(this.f44019e, this.f44020f, this.f44021g), this.f44022h, 1, i10);
        }

        @androidx.annotation.w0(29)
        private AudioTrack f(boolean z10, com.google.android.exoplayer2.audio.f fVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(j(fVar, z10)).setAudioFormat(DefaultAudioSink.K(this.f44019e, this.f44020f, this.f44021g)).setTransferMode(1).setBufferSizeInBytes(this.f44022h).setSessionId(i10).setOffloadedPlayback(this.f44017c == 1).build();
        }

        private AudioTrack g(com.google.android.exoplayer2.audio.f fVar, int i10) {
            int iQ0 = com.google.android.exoplayer2.util.u0.q0(fVar.f44122d);
            return i10 == 0 ? new AudioTrack(iQ0, this.f44019e, this.f44020f, this.f44021g, this.f44022h, 1) : new AudioTrack(iQ0, this.f44019e, this.f44020f, this.f44021g, this.f44022h, 1, i10);
        }

        @androidx.annotation.w0(21)
        private static AudioAttributes j(com.google.android.exoplayer2.audio.f fVar, boolean z10) {
            return z10 ? k() : fVar.c();
        }

        @androidx.annotation.w0(21)
        private static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private int l(long j10) {
            int iQ = DefaultAudioSink.Q(this.f44021g);
            if (this.f44021g == 5) {
                iQ *= 2;
            }
            return (int) ((j10 * ((long) iQ)) / 1000000);
        }

        private int m(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f44019e, this.f44020f, this.f44021g);
            com.google.android.exoplayer2.util.a.i(minBufferSize != -2);
            int iS = com.google.android.exoplayer2.util.u0.s(minBufferSize * 4, ((int) h(250000L)) * this.f44018d, Math.max(minBufferSize, ((int) h(DefaultAudioSink.f43979s0)) * this.f44018d));
            return f10 != 1.0f ? Math.round(iS * f10) : iS;
        }

        public AudioTrack a(boolean z10, com.google.android.exoplayer2.audio.f fVar, int i10) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(z10, fVar, i10);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f44019e, this.f44020f, this.f44022h, this.f44015a, o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new AudioSink.InitializationException(0, this.f44019e, this.f44020f, this.f44022h, this.f44015a, o(), e10);
            }
        }

        public boolean b(c cVar) {
            return cVar.f44017c == this.f44017c && cVar.f44021g == this.f44021g && cVar.f44019e == this.f44019e && cVar.f44020f == this.f44020f && cVar.f44018d == this.f44018d;
        }

        public long h(long j10) {
            return (j10 * ((long) this.f44019e)) / 1000000;
        }

        public long i(long j10) {
            return (j10 * 1000000) / ((long) this.f44019e);
        }

        public long n(long j10) {
            return (j10 * 1000000) / ((long) this.f44015a.A);
        }

        public boolean o() {
            return this.f44017c == 1;
        }
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f44024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q0 f44025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s0 f44026c;

        public d(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new q0(), new s0());
        }

        public d(AudioProcessor[] audioProcessorArr, q0 q0Var, s0 s0Var) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f44024a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f44025b = q0Var;
            this.f44026c = s0Var;
            audioProcessorArr2[audioProcessorArr.length] = q0Var;
            audioProcessorArr2[audioProcessorArr.length + 1] = s0Var;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public AudioProcessor[] a() {
            return this.f44024a;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public b3 b(b3 b3Var) {
            this.f44026c.i(b3Var.f44371b);
            this.f44026c.h(b3Var.f44372c);
            return b3Var;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long c() {
            return this.f44025b.o();
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long d(long j10) {
            return this.f44026c.f(j10);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public boolean e(boolean z10) {
            this.f44025b.u(z10);
            return z10;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b3 f44027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f44028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f44029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f44030d;

        private e(b3 b3Var, boolean z10, long j10, long j11) {
            this.f44027a = b3Var;
            this.f44028b = z10;
            this.f44029c = j10;
            this.f44030d = j11;
        }

        /* synthetic */ e(b3 b3Var, boolean z10, long j10, long j11, a aVar) {
            this(b3Var, z10, j10, j11);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public static final class g<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f44031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private T f44032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f44033c;

        public g(long j10) {
            this.f44031a = j10;
        }

        public void a() {
            this.f44032b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f44032b == null) {
                this.f44032b = t10;
                this.f44033c = this.f44031a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f44033c) {
                T t11 = this.f44032b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f44032b;
                a();
                throw t12;
            }
        }
    }

    public final class h implements w.a {
        private h() {
        }

        /* synthetic */ h(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.audio.w.a
        public void a(long j10, long j11, long j12, long j13) {
            long jT = DefaultAudioSink.this.T();
            long jU = DefaultAudioSink.this.U();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(jT);
            sb2.append(", ");
            sb2.append(jU);
            String string = sb2.toString();
            if (DefaultAudioSink.A0) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            com.google.android.exoplayer2.util.u.m(DefaultAudioSink.f43986z0, string);
        }

        @Override // com.google.android.exoplayer2.audio.w.a
        public void b(long j10) {
            if (DefaultAudioSink.this.f44006t != null) {
                DefaultAudioSink.this.f44006t.b(j10);
            }
        }

        @Override // com.google.android.exoplayer2.audio.w.a
        public void c(long j10, long j11, long j12, long j13) {
            long jT = DefaultAudioSink.this.T();
            long jU = DefaultAudioSink.this.U();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(jT);
            sb2.append(", ");
            sb2.append(jU);
            String string = sb2.toString();
            if (DefaultAudioSink.A0) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            com.google.android.exoplayer2.util.u.m(DefaultAudioSink.f43986z0, string);
        }

        @Override // com.google.android.exoplayer2.audio.w.a
        public void d(int i10, long j10) {
            if (DefaultAudioSink.this.f44006t != null) {
                DefaultAudioSink.this.f44006t.c(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f43988b0);
            }
        }

        @Override // com.google.android.exoplayer2.audio.w.a
        public void e(long j10) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j10);
            com.google.android.exoplayer2.util.u.m(DefaultAudioSink.f43986z0, sb2.toString());
        }
    }

    @androidx.annotation.w0(29)
    public final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f44035a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f44036b;

        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f44038a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f44038a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                com.google.android.exoplayer2.util.a.i(audioTrack == DefaultAudioSink.this.f44009w);
                if (DefaultAudioSink.this.f44006t == null || !DefaultAudioSink.this.W) {
                    return;
                }
                DefaultAudioSink.this.f44006t.f();
            }

            public void onTearDown(AudioTrack audioTrack) {
                com.google.android.exoplayer2.util.a.i(audioTrack == DefaultAudioSink.this.f44009w);
                if (DefaultAudioSink.this.f44006t == null || !DefaultAudioSink.this.W) {
                    return;
                }
                DefaultAudioSink.this.f44006t.f();
            }
        }

        public i() {
            this.f44036b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f44035a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.emoji2.text.b(handler), this.f44036b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f44036b);
            this.f44035a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(@androidx.annotation.p0 com.google.android.exoplayer2.audio.h hVar, b bVar, boolean z10, boolean z11, int i10) {
        this.f43991e = hVar;
        this.f43992f = (b) com.google.android.exoplayer2.util.a.g(bVar);
        int i11 = com.google.android.exoplayer2.util.u0.f51536a;
        this.f43993g = i11 >= 21 && z10;
        this.f44001o = i11 >= 23 && z11;
        this.f44002p = i11 < 29 ? 0 : i10;
        this.f43998l = new ConditionVariable(true);
        this.f43999m = new w(new h(this, null));
        z zVar = new z();
        this.f43994h = zVar;
        u0 u0Var = new u0();
        this.f43995i = u0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p0(), zVar, u0Var);
        Collections.addAll(arrayList, bVar.a());
        this.f43996j = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f43997k = new AudioProcessor[]{new k0()};
        this.L = 1.0f;
        this.f44010x = com.google.android.exoplayer2.audio.f.f44114g;
        this.Y = 0;
        this.Z = new x(0, 0.0f);
        b3 b3Var = b3.f44367e;
        this.f44012z = new e(b3Var, false, 0L, 0L, null);
        this.A = b3Var;
        this.T = -1;
        this.M = new AudioProcessor[0];
        this.N = new ByteBuffer[0];
        this.f44000n = new ArrayDeque<>();
        this.f44004r = new g<>(100L);
        this.f44005s = new g<>(100L);
    }

    public DefaultAudioSink(@androidx.annotation.p0 com.google.android.exoplayer2.audio.h hVar, AudioProcessor[] audioProcessorArr) {
        this(hVar, audioProcessorArr, false);
    }

    public DefaultAudioSink(@androidx.annotation.p0 com.google.android.exoplayer2.audio.h hVar, AudioProcessor[] audioProcessorArr, boolean z10) {
        this(hVar, new d(audioProcessorArr), z10, false, 0);
    }

    private void E(long j10) {
        b3 b3VarB = l0() ? this.f43992f.b(L()) : b3.f44367e;
        boolean zE = l0() ? this.f43992f.e(d()) : false;
        this.f44000n.add(new e(b3VarB, zE, Math.max(0L, j10), this.f44008v.i(U()), null));
        k0();
        AudioSink.a aVar = this.f44006t;
        if (aVar != null) {
            aVar.a(zE);
        }
    }

    private long F(long j10) {
        while (!this.f44000n.isEmpty() && j10 >= this.f44000n.getFirst().f44030d) {
            this.f44012z = this.f44000n.remove();
        }
        e eVar = this.f44012z;
        long j11 = j10 - eVar.f44030d;
        if (eVar.f44027a.equals(b3.f44367e)) {
            return this.f44012z.f44029c + j11;
        }
        if (this.f44000n.isEmpty()) {
            return this.f44012z.f44029c + this.f43992f.d(j11);
        }
        e first = this.f44000n.getFirst();
        return first.f44029c - com.google.android.exoplayer2.util.u0.k0(first.f44030d - j10, this.f44012z.f44027a.f44371b);
    }

    private long G(long j10) {
        return j10 + this.f44008v.i(this.f43992f.c());
    }

    private AudioTrack H() throws AudioSink.InitializationException {
        try {
            return ((c) com.google.android.exoplayer2.util.a.g(this.f44008v)).a(this.f43987a0, this.f44010x, this.Y);
        } catch (AudioSink.InitializationException e10) {
            a0();
            AudioSink.a aVar = this.f44006t;
            if (aVar != null) {
                aVar.s(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean I() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.T = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.T
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.M
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.c0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.T
            int r0 = r0 + r2
            r9.T = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L3b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.I():boolean");
    }

    private void J() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.M;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.N[i10] = audioProcessor.d();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(21)
    public static AudioFormat K(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private b3 L() {
        return R().f44027a;
    }

    private static int M(int i10) {
        int i11 = com.google.android.exoplayer2.util.u0.f51536a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(com.google.android.exoplayer2.util.u0.f51537b) && i10 == 1) {
            i10 = 2;
        }
        return com.google.android.exoplayer2.util.u0.N(i10);
    }

    @androidx.annotation.p0
    private static Pair<Integer, Integer> N(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.audio.h hVar) {
        if (hVar == null) {
            return null;
        }
        int iF = com.google.android.exoplayer2.util.y.f((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.f43590j);
        int iP = 6;
        if (!(iF == 5 || iF == 6 || iF == 18 || iF == 17 || iF == 7 || iF == 8 || iF == 14)) {
            return null;
        }
        if (iF == 18 && !hVar.g(18)) {
            iF = 6;
        } else if (iF == 8 && !hVar.g(8)) {
            iF = 7;
        }
        if (!hVar.g(iF)) {
            return null;
        }
        if (iF != 18) {
            iP = a2Var.f43606z;
            if (iP > hVar.f()) {
                return null;
            }
        } else if (com.google.android.exoplayer2.util.u0.f51536a >= 29 && (iP = P(18, a2Var.A)) == 0) {
            com.google.android.exoplayer2.util.u.m(f43986z0, "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iM = M(iP);
        if (iM == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iM));
    }

    private static int O(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return com.google.android.exoplayer2.audio.b.d(byteBuffer);
            case 7:
            case 8:
                return j0.e(byteBuffer);
            case 9:
                int iM = n0.m(com.google.android.exoplayer2.util.u0.P(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unexpected audio encoding: ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            case 14:
                int iA = com.google.android.exoplayer2.audio.b.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return com.google.android.exoplayer2.audio.b.h(byteBuffer, iA) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.google.android.exoplayer2.audio.c.c(byteBuffer);
        }
    }

    @androidx.annotation.w0(29)
    private static int P(int i10, int i11) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(com.google.android.exoplayer2.util.u0.N(i12)).build(), audioAttributesBuild)) {
                return i12;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Q(int i10) {
        switch (i10) {
            case 5:
                return com.google.android.exoplayer2.audio.b.f44079a;
            case 6:
            case 18:
                return com.google.android.exoplayer2.audio.b.f44080b;
            case 7:
                return j0.f44139a;
            case 8:
                return j0.f44140b;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return com.google.android.exoplayer2.audio.b.f44081c;
            case 15:
                return 8000;
            case 16:
                return com.google.android.exoplayer2.audio.a.f44048i;
            case 17:
                return com.google.android.exoplayer2.audio.c.f44104c;
        }
    }

    private e R() {
        e eVar = this.f44011y;
        if (eVar != null) {
            return eVar;
        }
        return !this.f44000n.isEmpty() ? this.f44000n.getLast() : this.f44012z;
    }

    @androidx.annotation.w0(29)
    @SuppressLint({"WrongConstant"})
    private int S(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = com.google.android.exoplayer2.util.u0.f51536a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && com.google.android.exoplayer2.util.u0.f51539d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        c cVar = this.f44008v;
        return cVar.f44017c == 0 ? this.D / ((long) cVar.f44016b) : this.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long U() {
        c cVar = this.f44008v;
        return cVar.f44017c == 0 ? this.F / ((long) cVar.f44018d) : this.G;
    }

    private void V() throws AudioSink.InitializationException {
        this.f43998l.block();
        AudioTrack audioTrackH = H();
        this.f44009w = audioTrackH;
        if (Y(audioTrackH)) {
            d0(this.f44009w);
            if (this.f44002p != 3) {
                AudioTrack audioTrack = this.f44009w;
                a2 a2Var = this.f44008v.f44015a;
                audioTrack.setOffloadDelayPadding(a2Var.C, a2Var.D);
            }
        }
        this.Y = this.f44009w.getAudioSessionId();
        w wVar = this.f43999m;
        AudioTrack audioTrack2 = this.f44009w;
        c cVar = this.f44008v;
        wVar.t(audioTrack2, cVar.f44017c == 2, cVar.f44021g, cVar.f44018d, cVar.f44022h);
        h0();
        int i10 = this.Z.f44350a;
        if (i10 != 0) {
            this.f44009w.attachAuxEffect(i10);
            this.f44009w.setAuxEffectSendLevel(this.Z.f44351b);
        }
        this.J = true;
    }

    private static boolean W(int i10) {
        return (com.google.android.exoplayer2.util.u0.f51536a >= 24 && i10 == -6) || i10 == f43984x0;
    }

    private boolean X() {
        return this.f44009w != null;
    }

    private static boolean Y(AudioTrack audioTrack) {
        return com.google.android.exoplayer2.util.u0.f51536a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean Z(a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.audio.h hVar) {
        return N(a2Var, hVar) != null;
    }

    private void a0() {
        if (this.f44008v.o()) {
            this.f43989c0 = true;
        }
    }

    private void b0() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f43999m.h(U());
        this.f44009w.stop();
        this.C = 0;
    }

    private void c0(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.M.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.N[i10 - 1];
            } else {
                byteBuffer = this.O;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f43946a;
                }
            }
            if (i10 == length) {
                o0(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.M[i10];
                if (i10 > this.T) {
                    audioProcessor.a(byteBuffer);
                }
                ByteBuffer byteBufferD = audioProcessor.d();
                this.N[i10] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @androidx.annotation.w0(29)
    private void d0(AudioTrack audioTrack) {
        if (this.f44003q == null) {
            this.f44003q = new i();
        }
        this.f44003q.a(audioTrack);
    }

    private void e0() {
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.f43990d0 = false;
        this.H = 0;
        this.f44012z = new e(L(), d(), 0L, 0L, null);
        this.K = 0L;
        this.f44011y = null;
        this.f44000n.clear();
        this.O = null;
        this.P = 0;
        this.Q = null;
        this.V = false;
        this.U = false;
        this.T = -1;
        this.B = null;
        this.C = 0;
        this.f43995i.m();
        J();
    }

    private void f0(b3 b3Var, boolean z10) {
        e eVarR = R();
        if (b3Var.equals(eVarR.f44027a) && z10 == eVarR.f44028b) {
            return;
        }
        e eVar = new e(b3Var, z10, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, null);
        if (X()) {
            this.f44011y = eVar;
        } else {
            this.f44012z = eVar;
        }
    }

    @androidx.annotation.w0(23)
    private void g0(b3 b3Var) {
        if (X()) {
            try {
                this.f44009w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(b3Var.f44371b).setPitch(b3Var.f44372c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                com.google.android.exoplayer2.util.u.n(f43986z0, "Failed to set playback params", e10);
            }
            b3Var = new b3(this.f44009w.getPlaybackParams().getSpeed(), this.f44009w.getPlaybackParams().getPitch());
            this.f43999m.u(b3Var.f44371b);
        }
        this.A = b3Var;
    }

    private void h0() {
        if (X()) {
            if (com.google.android.exoplayer2.util.u0.f51536a >= 21) {
                i0(this.f44009w, this.L);
            } else {
                j0(this.f44009w, this.L);
            }
        }
    }

    @androidx.annotation.w0(21)
    private static void i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void k0() {
        AudioProcessor[] audioProcessorArr = this.f44008v.f44023i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.M = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.N = new ByteBuffer[size];
        J();
    }

    private boolean l0() {
        return (this.f43987a0 || !com.google.android.exoplayer2.util.y.I.equals(this.f44008v.f44015a.f43593m) || m0(this.f44008v.f44015a.B)) ? false : true;
    }

    private boolean m0(int i10) {
        return this.f43993g && com.google.android.exoplayer2.util.u0.G0(i10);
    }

    private boolean n0(a2 a2Var, com.google.android.exoplayer2.audio.f fVar) {
        int iF;
        int iN;
        int iS;
        if (com.google.android.exoplayer2.util.u0.f51536a < 29 || this.f44002p == 0 || (iF = com.google.android.exoplayer2.util.y.f((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.f43590j)) == 0 || (iN = com.google.android.exoplayer2.util.u0.N(a2Var.f43606z)) == 0 || (iS = S(K(a2Var.A, iN, iF), fVar.c())) == 0) {
            return false;
        }
        if (iS == 1) {
            return ((a2Var.C != 0 || a2Var.D != 0) && (this.f44002p == 1)) ? false : true;
        }
        if (iS == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void o0(ByteBuffer byteBuffer, long j10) throws Exception {
        int iP0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                com.google.android.exoplayer2.util.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.R = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.R, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.S = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (com.google.android.exoplayer2.util.u0.f51536a < 21) {
                int iC = this.f43999m.c(this.F);
                if (iC > 0) {
                    iP0 = this.f44009w.write(this.R, this.S, Math.min(iRemaining2, iC));
                    if (iP0 > 0) {
                        this.S += iP0;
                        byteBuffer.position(byteBuffer.position() + iP0);
                    }
                } else {
                    iP0 = 0;
                }
            } else if (this.f43987a0) {
                com.google.android.exoplayer2.util.a.i(j10 != com.google.android.exoplayer2.j.f46377b);
                iP0 = q0(this.f44009w, byteBuffer, iRemaining2, j10);
            } else {
                iP0 = p0(this.f44009w, byteBuffer, iRemaining2);
            }
            this.f43988b0 = SystemClock.elapsedRealtime();
            if (iP0 < 0) {
                boolean zW = W(iP0);
                if (zW) {
                    a0();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iP0, this.f44008v.f44015a, zW);
                AudioSink.a aVar = this.f44006t;
                if (aVar != null) {
                    aVar.s(writeException);
                }
                if (writeException.f43963c) {
                    throw writeException;
                }
                this.f44005s.b(writeException);
                return;
            }
            this.f44005s.a();
            if (Y(this.f44009w)) {
                long j11 = this.G;
                if (j11 > 0) {
                    this.f43990d0 = false;
                }
                if (this.W && this.f44006t != null && iP0 < iRemaining2 && !this.f43990d0) {
                    this.f44006t.d(this.f43999m.e(j11));
                }
            }
            int i10 = this.f44008v.f44017c;
            if (i10 == 0) {
                this.F += (long) iP0;
            }
            if (iP0 == iRemaining2) {
                if (i10 != 0) {
                    com.google.android.exoplayer2.util.a.i(byteBuffer == this.O);
                    this.G += (long) (this.H * this.P);
                }
                this.Q = null;
            }
        }
    }

    @androidx.annotation.w0(21)
    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @androidx.annotation.w0(21)
    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.B == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.B = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.B.putInt(1431633921);
        }
        if (this.C == 0) {
            this.B.putInt(4, i10);
            this.B.putLong(8, j10 * 1000);
            this.B.position(0);
            this.C = i10;
        }
        int iRemaining = this.B.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.B, iRemaining, 1);
            if (iWrite < 0) {
                this.C = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iP0 = p0(audioTrack, byteBuffer, i10);
        if (iP0 < 0) {
            this.C = 0;
            return iP0;
        }
        this.C -= iP0;
        return iP0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(a2 a2Var) {
        return q(a2Var) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b() {
        return !X() || (this.U && !n());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c() {
        if (this.f43987a0) {
            this.f43987a0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean d() {
        return R().f44028b;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e(b3 b3Var) {
        b3 b3Var2 = new b3(com.google.android.exoplayer2.util.u0.r(b3Var.f44371b, 0.1f, 8.0f), com.google.android.exoplayer2.util.u0.r(b3Var.f44372c, 0.1f, 8.0f));
        if (!this.f44001o || com.google.android.exoplayer2.util.u0.f51536a < 23) {
            f0(b3Var2, d());
        } else {
            g0(b3Var2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(int i10) {
        if (this.Y != i10) {
            this.Y = i10;
            this.X = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (X()) {
            e0();
            if (this.f43999m.j()) {
                this.f44009w.pause();
            }
            if (Y(this.f44009w)) {
                ((i) com.google.android.exoplayer2.util.a.g(this.f44003q)).b(this.f44009w);
            }
            AudioTrack audioTrack = this.f44009w;
            this.f44009w = null;
            if (com.google.android.exoplayer2.util.u0.f51536a < 21 && !this.X) {
                this.Y = 0;
            }
            c cVar = this.f44007u;
            if (cVar != null) {
                this.f44008v = cVar;
                this.f44007u = null;
            }
            this.f43999m.r();
            this.f43998l.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f44005s.a();
        this.f44004r.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public b3 g() {
        return this.f44001o ? this.A : L();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h(x xVar) {
        if (this.Z.equals(xVar)) {
            return;
        }
        int i10 = xVar.f44350a;
        float f10 = xVar.f44351b;
        AudioTrack audioTrack = this.f44009w;
        if (audioTrack != null) {
            if (this.Z.f44350a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f44009w.setAuxEffectSendLevel(f10);
            }
        }
        this.Z = xVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(com.google.android.exoplayer2.audio.f fVar) {
        if (this.f44010x.equals(fVar)) {
            return;
        }
        this.f44010x = fVar;
        if (this.f43987a0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(float f10) {
        if (this.L != f10) {
            this.L = f10;
            h0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(boolean z10) {
        f0(L(), z10);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void l() {
        if (com.google.android.exoplayer2.util.u0.f51536a < 25) {
            flush();
            return;
        }
        this.f44005s.a();
        this.f44004r.a();
        if (X()) {
            e0();
            if (this.f43999m.j()) {
                this.f44009w.pause();
            }
            this.f44009w.flush();
            this.f43999m.r();
            w wVar = this.f43999m;
            AudioTrack audioTrack = this.f44009w;
            c cVar = this.f44008v;
            wVar.t(audioTrack, cVar.f44017c == 2, cVar.f44021g, cVar.f44018d, cVar.f44022h);
            this.J = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        com.google.android.exoplayer2.util.a.i(com.google.android.exoplayer2.util.u0.f51536a >= 21);
        com.google.android.exoplayer2.util.a.i(this.X);
        if (this.f43987a0) {
            return;
        }
        this.f43987a0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean n() {
        return X() && this.f43999m.i(U());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean o(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.O;
        com.google.android.exoplayer2.util.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f44007u != null) {
            if (!I()) {
                return false;
            }
            if (this.f44007u.b(this.f44008v)) {
                this.f44008v = this.f44007u;
                this.f44007u = null;
                if (Y(this.f44009w) && this.f44002p != 3) {
                    this.f44009w.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f44009w;
                    a2 a2Var = this.f44008v.f44015a;
                    audioTrack.setOffloadDelayPadding(a2Var.C, a2Var.D);
                    this.f43990d0 = true;
                }
            } else {
                b0();
                if (n()) {
                    return false;
                }
                flush();
            }
            E(j10);
        }
        if (!X()) {
            try {
                V();
            } catch (AudioSink.InitializationException e10) {
                if (e10.f43958c) {
                    throw e10;
                }
                this.f44004r.b(e10);
                return false;
            }
        }
        this.f44004r.a();
        if (this.J) {
            this.K = Math.max(0L, j10);
            this.I = false;
            this.J = false;
            if (this.f44001o && com.google.android.exoplayer2.util.u0.f51536a >= 23) {
                g0(this.A);
            }
            E(j10);
            if (this.W) {
                play();
            }
        }
        if (!this.f43999m.l(U())) {
            return false;
        }
        if (this.O == null) {
            com.google.android.exoplayer2.util.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f44008v;
            if (cVar.f44017c != 0 && this.H == 0) {
                int iO = O(cVar.f44021g, byteBuffer);
                this.H = iO;
                if (iO == 0) {
                    return true;
                }
            }
            if (this.f44011y != null) {
                if (!I()) {
                    return false;
                }
                E(j10);
                this.f44011y = null;
            }
            long jN = this.K + this.f44008v.n(T() - this.f43995i.l());
            if (!this.I && Math.abs(jN - j10) > 200000) {
                this.f44006t.s(new AudioSink.UnexpectedDiscontinuityException(j10, jN));
                this.I = true;
            }
            if (this.I) {
                if (!I()) {
                    return false;
                }
                long j11 = j10 - jN;
                this.K += j11;
                this.I = false;
                E(j10);
                AudioSink.a aVar = this.f44006t;
                if (aVar != null && j11 != 0) {
                    aVar.e();
                }
            }
            if (this.f44008v.f44017c == 0) {
                this.D += (long) byteBuffer.remaining();
            } else {
                this.E += (long) (this.H * i10);
            }
            this.O = byteBuffer;
            this.P = i10;
        }
        c0(j10);
        if (!this.O.hasRemaining()) {
            this.O = null;
            this.P = 0;
            return true;
        }
        if (!this.f43999m.k(U())) {
            return false;
        }
        com.google.android.exoplayer2.util.u.m(f43986z0, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void p(AudioSink.a aVar) {
        this.f44006t = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.W = false;
        if (X() && this.f43999m.q()) {
            this.f44009w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.W = true;
        if (X()) {
            this.f43999m.v();
            this.f44009w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int q(a2 a2Var) {
        if (!com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m)) {
            return ((this.f43989c0 || !n0(a2Var, this.f44010x)) && !Z(a2Var, this.f43991e)) ? 0 : 2;
        }
        if (com.google.android.exoplayer2.util.u0.H0(a2Var.B)) {
            int i10 = a2Var.B;
            return (i10 == 2 || (this.f43993g && i10 == 4)) ? 2 : 1;
        }
        int i11 = a2Var.B;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid PCM encoding: ");
        sb2.append(i11);
        com.google.android.exoplayer2.util.u.m(f43986z0, sb2.toString());
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void r() throws AudioSink.WriteException {
        if (!this.U && X() && I()) {
            b0();
            this.U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f43996j) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f43997k) {
            audioProcessor2.reset();
        }
        this.W = false;
        this.f43989c0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long s(boolean z10) {
        if (!X() || this.J) {
            return Long.MIN_VALUE;
        }
        return G(F(Math.min(this.f43999m.d(z10), this.f44008v.i(U()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t() {
        this.I = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u(a2 a2Var, int i10, @androidx.annotation.p0 int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int iO0;
        int iIntValue;
        int iIntValue2;
        int i11;
        int i12;
        int iO1;
        int[] iArr2;
        if (com.google.android.exoplayer2.util.y.I.equals(a2Var.f43593m)) {
            com.google.android.exoplayer2.util.a.a(com.google.android.exoplayer2.util.u0.H0(a2Var.B));
            iO0 = com.google.android.exoplayer2.util.u0.o0(a2Var.B, a2Var.f43606z);
            AudioProcessor[] audioProcessorArr2 = m0(a2Var.B) ? this.f43997k : this.f43996j;
            this.f43995i.n(a2Var.C, a2Var.D);
            if (com.google.android.exoplayer2.util.u0.f51536a < 21 && a2Var.f43606z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.f43994h.l(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(a2Var.A, a2Var.f43606z, a2Var.B);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a aVarE = audioProcessor.e(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarE;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10, a2Var);
                }
            }
            int i14 = aVar.f43950c;
            i11 = aVar.f43948a;
            iIntValue2 = com.google.android.exoplayer2.util.u0.N(aVar.f43949b);
            audioProcessorArr = audioProcessorArr2;
            iIntValue = i14;
            iO1 = com.google.android.exoplayer2.util.u0.o0(i14, aVar.f43949b);
            i12 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i15 = a2Var.A;
            if (n0(a2Var, this.f44010x)) {
                audioProcessorArr = audioProcessorArr3;
                iO0 = -1;
                iIntValue = com.google.android.exoplayer2.util.y.f((String) com.google.android.exoplayer2.util.a.g(a2Var.f43593m), a2Var.f43590j);
                iO1 = -1;
                i11 = i15;
                i12 = 1;
                iIntValue2 = com.google.android.exoplayer2.util.u0.N(a2Var.f43606z);
            } else {
                Pair<Integer, Integer> pairN = N(a2Var, this.f43991e);
                if (pairN == null) {
                    String strValueOf = String.valueOf(a2Var);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(strValueOf);
                    throw new AudioSink.ConfigurationException(sb2.toString(), a2Var);
                }
                audioProcessorArr = audioProcessorArr3;
                iO0 = -1;
                iIntValue = ((Integer) pairN.first).intValue();
                iIntValue2 = ((Integer) pairN.second).intValue();
                i11 = i15;
                i12 = 2;
                iO1 = -1;
            }
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(a2Var);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i12);
            sb3.append(") for: ");
            sb3.append(strValueOf2);
            throw new AudioSink.ConfigurationException(sb3.toString(), a2Var);
        }
        if (iIntValue2 != 0) {
            this.f43989c0 = false;
            c cVar = new c(a2Var, iO0, i12, iO1, i11, iIntValue2, iIntValue, i10, this.f44001o, audioProcessorArr);
            if (X()) {
                this.f44007u = cVar;
                return;
            } else {
                this.f44008v = cVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(a2Var);
        StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 54);
        sb4.append("Invalid output channel config (mode=");
        sb4.append(i12);
        sb4.append(") for: ");
        sb4.append(strValueOf3);
        throw new AudioSink.ConfigurationException(sb4.toString(), a2Var);
    }
}
