package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c0;
import com.google.android.exoplayer2.util.m0;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.e {

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    protected static final float f46646c4 = -1.0f;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f46647d4 = "MediaCodecRenderer";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final long f46648e4 = 1000;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f46649f4 = 10;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f46650g4 = 0;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f46651h4 = 1;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f46652i4 = 2;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final int f46653j4 = 0;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f46654k4 = 1;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f46655l4 = 2;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f46656m4 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f46657n4 = 1;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int f46658o4 = 2;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f46659p4 = 3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final int f46660q4 = 0;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final int f46661r4 = 1;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final int f46662s4 = 2;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final byte[] f46663t4 = {0, 0, 1, org.apache.tools.tar.c.S, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, com.google.common.base.a.B, -96, 0, 47, -65, com.google.common.base.a.F, org.apache.tools.tar.c.G, -61, 39, 93, org.apache.tools.tar.c.Q};

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final int f46664u4 = 32;
    private final long[] A;

    @p0
    private a2 B;

    @p0
    private a2 C;

    @p0
    private DrmSession D;

    @p0
    private DrmSession E;

    @p0
    private MediaCrypto F;
    private boolean G;
    private boolean G2;
    private boolean G3;
    private long H;
    private float I;
    private float J;
    private boolean J3;

    @p0
    private m K;
    private boolean K3;

    @p0
    private a2 L;
    private int L3;

    @p0
    private MediaFormat M;
    private int M3;
    private boolean N;
    private int N3;
    private float O;
    private boolean O3;

    @p0
    private ArrayDeque<n> P;
    private boolean P3;

    @p0
    private DecoderInitializationException Q;
    private boolean Q3;

    @p0
    private n R;
    private long R3;
    private int S;
    private long S3;
    private boolean T;
    private boolean T3;
    private boolean U;
    private boolean U3;
    private boolean V;
    private boolean V3;
    private boolean W;
    private boolean W3;
    private boolean X;

    @p0
    private ExoPlaybackException X3;
    private boolean Y;
    protected com.google.android.exoplayer2.decoder.g Y3;
    private boolean Z;
    private long Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f46665a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private long f46666a4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f46667b0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f46668b4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f46669c0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m.b f46670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f46671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f46672p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private j f46673p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f46674p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f46675p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f46676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DecoderInputBuffer f46677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f46678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f46679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final i f46680u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final m0<a2> f46681v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f46682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f46683x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f46684x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @p0
    private ByteBuffer f46685x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long[] f46686y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f46687y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f46688y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long[] f46689z;

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f46690g = -50000;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f46691h = -49999;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f46692i = -49998;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final n f46695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f46696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final DecoderInitializationException f46697f;

        public DecoderInitializationException(a2 a2Var, @p0 Throwable th2, boolean z10, int i10) {
            String strValueOf = String.valueOf(a2Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
            sb2.append("Decoder init failed: [");
            sb2.append(i10);
            sb2.append("], ");
            sb2.append(strValueOf);
            this(sb2.toString(), th2, a2Var.f43593m, z10, null, b(i10), null);
        }

        public DecoderInitializationException(a2 a2Var, @p0 Throwable th2, boolean z10, n nVar) {
            String str = nVar.f46797a;
            String strValueOf = String.valueOf(a2Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
            sb2.append("Decoder init failed: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(strValueOf);
            this(sb2.toString(), th2, a2Var.f43593m, z10, nVar, u0.f51536a >= 21 ? d(th2) : null, null);
        }

        private DecoderInitializationException(String str, @p0 Throwable th2, String str2, boolean z10, @p0 n nVar, @p0 String str3, @p0 DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f46693b = str2;
            this.f46694c = z10;
            this.f46695d = nVar;
            this.f46696e = str3;
            this.f46697f = decoderInitializationException;
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder(str.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(iAbs);
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.j
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f46693b, this.f46694c, this.f46695d, this.f46696e, decoderInitializationException);
        }

        @w0(21)
        @p0
        private static String d(@p0 Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }
    }

    public MediaCodecRenderer(int i10, m.b bVar, p pVar, boolean z10, float f10) {
        super(i10);
        this.f46670n = bVar;
        this.f46671o = (p) com.google.android.exoplayer2.util.a.g(pVar);
        this.f46672p = z10;
        this.f46676q = f10;
        this.f46677r = DecoderInputBuffer.r();
        this.f46678s = new DecoderInputBuffer(0);
        this.f46679t = new DecoderInputBuffer(2);
        i iVar = new i();
        this.f46680u = iVar;
        this.f46681v = new m0<>();
        this.f46682w = new ArrayList<>();
        this.f46683x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = com.google.android.exoplayer2.j.f46377b;
        this.f46686y = new long[10];
        this.f46689z = new long[10];
        this.A = new long[10];
        this.Z3 = com.google.android.exoplayer2.j.f46377b;
        this.f46666a4 = com.google.android.exoplayer2.j.f46377b;
        iVar.o(0);
        iVar.f44488e.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.L3 = 0;
        this.f46687y1 = -1;
        this.f46674p2 = -1;
        this.f46684x1 = com.google.android.exoplayer2.j.f46377b;
        this.R3 = com.google.android.exoplayer2.j.f46377b;
        this.S3 = com.google.android.exoplayer2.j.f46377b;
        this.M3 = 0;
        this.N3 = 0;
    }

    private boolean A0(long j10) {
        int size = this.f46682w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f46682w.get(i10).longValue() == j10) {
                this.f46682w.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean B0(IllegalStateException illegalStateException) {
        if (u0.f51536a >= 21 && C0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @w0(21)
    private static boolean C0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @w0(21)
    private static boolean D0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void F0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        if (this.P == null) {
            try {
                List<n> listK0 = k0(z10);
                ArrayDeque<n> arrayDeque = new ArrayDeque<>();
                this.P = arrayDeque;
                if (this.f46672p) {
                    arrayDeque.addAll(listK0);
                } else if (!listK0.isEmpty()) {
                    this.P.add(listK0.get(0));
                }
                this.Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.B, e10, z10, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new DecoderInitializationException(this.B, (Throwable) null, z10, -49999);
        }
        while (this.K == null) {
            n nVarPeekFirst = this.P.peekFirst();
            if (!f1(nVarPeekFirst)) {
                return;
            }
            try {
                z0(nVarPeekFirst, mediaCrypto);
            } catch (Exception e11) {
                String strValueOf = String.valueOf(nVarPeekFirst);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 30);
                sb2.append("Failed to initialize decoder: ");
                sb2.append(strValueOf);
                com.google.android.exoplayer2.util.u.n(f46647d4, sb2.toString(), e11);
                this.P.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.B, e11, z10, nVarPeekFirst);
                G0(decoderInitializationException);
                if (this.Q == null) {
                    this.Q = decoderInitializationException;
                } else {
                    this.Q = this.Q.c(decoderInitializationException);
                }
                if (this.P.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    private void N() throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.i(!this.T3);
        b2 b2VarZ = z();
        this.f46679t.f();
        do {
            this.f46679t.f();
            int iL = L(b2VarZ, this.f46679t, 0);
            if (iL == -5) {
                J0(b2VarZ);
                return;
            }
            if (iL != -4) {
                if (iL != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f46679t.k()) {
                    this.T3 = true;
                    return;
                }
                if (this.V3) {
                    a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(this.B);
                    this.C = a2Var;
                    K0(a2Var, null);
                    this.V3 = false;
                }
                this.f46679t.p();
            }
        } while (this.f46680u.t(this.f46679t));
        this.G3 = true;
    }

    private boolean O(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        com.google.android.exoplayer2.util.a.i(!this.U3);
        if (this.f46680u.A()) {
            i iVar = this.f46680u;
            if (!P0(j10, j11, null, iVar.f44488e, this.f46674p2, 0, iVar.z(), this.f46680u.x(), this.f46680u.j(), this.f46680u.k(), this.C)) {
                return false;
            }
            L0(this.f46680u.y());
            this.f46680u.f();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.T3) {
            this.U3 = true;
            return z10;
        }
        if (this.G3) {
            com.google.android.exoplayer2.util.a.i(this.f46680u.t(this.f46679t));
            this.G3 = z10;
        }
        if (this.J3) {
            if (this.f46680u.A()) {
                return true;
            }
            a0();
            this.J3 = z10;
            E0();
            if (!this.f46675p3) {
                return z10;
            }
        }
        N();
        if (this.f46680u.A()) {
            this.f46680u.p();
        }
        if (this.f46680u.A() || this.T3 || this.J3) {
            return true;
        }
        return z10;
    }

    @TargetApi(23)
    private void O0() throws ExoPlaybackException {
        int i10 = this.N3;
        if (i10 == 1) {
            h0();
            return;
        }
        if (i10 == 2) {
            h0();
            l1();
        } else if (i10 == 3) {
            S0();
        } else {
            this.U3 = true;
            U0();
        }
    }

    private int Q(String str) {
        int i10 = u0.f51536a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = u0.f51539d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = u0.f51537b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private void Q0() {
        this.Q3 = true;
        MediaFormat outputFormat = this.K.getOutputFormat();
        if (this.S != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f46667b0 = true;
            return;
        }
        if (this.Z) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.M = outputFormat;
        this.N = true;
    }

    private static boolean R(String str, a2 a2Var) {
        return u0.f51536a < 21 && a2Var.f43595o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private boolean R0(int i10) throws ExoPlaybackException {
        b2 b2VarZ = z();
        this.f46677r.f();
        int iL = L(b2VarZ, this.f46677r, i10 | 4);
        if (iL == -5) {
            J0(b2VarZ);
            return true;
        }
        if (iL != -4 || !this.f46677r.k()) {
            return false;
        }
        this.T3 = true;
        O0();
        return false;
    }

    private static boolean S(String str) {
        if (u0.f51536a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(u0.f51538c)) {
            String str2 = u0.f51537b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void S0() throws ExoPlaybackException {
        T0();
        E0();
    }

    private static boolean T(String str) {
        int i10 = u0.f51536a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = u0.f51537b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean U(String str) {
        return u0.f51536a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean V(n nVar) {
        String str = nVar.f46797a;
        int i10 = u0.f51536a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(u0.f51538c) && "AFTS".equals(u0.f51539d) && nVar.f46803g));
    }

    private static boolean W(String str) {
        int i10 = u0.f51536a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && u0.f51539d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean X(String str, a2 a2Var) {
        return u0.f51536a <= 18 && a2Var.f43606z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void X0() {
        this.f46687y1 = -1;
        this.f46678s.f44488e = null;
    }

    private static boolean Y(String str) {
        return u0.f51536a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void Y0() {
        this.f46674p2 = -1;
        this.f46685x2 = null;
    }

    private void Z0(@p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.D, drmSession);
        this.D = drmSession;
    }

    private void a0() {
        this.J3 = false;
        this.f46680u.f();
        this.f46679t.f();
        this.G3 = false;
        this.f46675p3 = false;
    }

    private boolean b0() {
        if (this.O3) {
            this.M3 = 1;
            if (this.U || this.W) {
                this.N3 = 3;
                return false;
            }
            this.N3 = 1;
        }
        return true;
    }

    private void c0() throws ExoPlaybackException {
        if (!this.O3) {
            S0();
        } else {
            this.M3 = 1;
            this.N3 = 3;
        }
    }

    @TargetApi(23)
    private boolean d0() throws ExoPlaybackException {
        if (this.O3) {
            this.M3 = 1;
            if (this.U || this.W) {
                this.N3 = 3;
                return false;
            }
            this.N3 = 2;
        } else {
            l1();
        }
        return true;
    }

    private void d1(@p0 DrmSession drmSession) {
        com.google.android.exoplayer2.drm.k.b(this.E, drmSession);
        this.E = drmSession;
    }

    private boolean e0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zP0;
        int iE;
        if (!x0()) {
            if (this.X && this.P3) {
                try {
                    iE = this.K.e(this.f46683x);
                } catch (IllegalStateException unused) {
                    O0();
                    if (this.U3) {
                        T0();
                    }
                    return false;
                }
            } else {
                iE = this.K.e(this.f46683x);
            }
            if (iE < 0) {
                if (iE == -2) {
                    Q0();
                    return true;
                }
                if (this.f46669c0 && (this.T3 || this.M3 == 2)) {
                    O0();
                }
                return false;
            }
            if (this.f46667b0) {
                this.f46667b0 = false;
                this.K.releaseOutputBuffer(iE, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f46683x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                O0();
                return false;
            }
            this.f46674p2 = iE;
            ByteBuffer byteBufferK = this.K.k(iE);
            this.f46685x2 = byteBufferK;
            if (byteBufferK != null) {
                byteBufferK.position(this.f46683x.offset);
                ByteBuffer byteBuffer = this.f46685x2;
                MediaCodec.BufferInfo bufferInfo2 = this.f46683x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f46683x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.R3;
                    if (j12 != com.google.android.exoplayer2.j.f46377b) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.f46688y2 = A0(this.f46683x.presentationTimeUs);
            long j13 = this.S3;
            long j14 = this.f46683x.presentationTimeUs;
            this.G2 = j13 == j14;
            m1(j14);
        }
        if (this.X && this.P3) {
            try {
                m mVar = this.K;
                ByteBuffer byteBuffer2 = this.f46685x2;
                int i10 = this.f46674p2;
                MediaCodec.BufferInfo bufferInfo4 = this.f46683x;
                z10 = false;
                try {
                    zP0 = P0(j10, j11, mVar, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f46688y2, this.G2, this.C);
                } catch (IllegalStateException unused2) {
                    O0();
                    if (this.U3) {
                        T0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            m mVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f46685x2;
            int i11 = this.f46674p2;
            MediaCodec.BufferInfo bufferInfo5 = this.f46683x;
            zP0 = P0(j10, j11, mVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f46688y2, this.G2, this.C);
        }
        if (zP0) {
            L0(this.f46683x.presentationTimeUs);
            boolean z11 = (this.f46683x.flags & 4) != 0 ? true : z10;
            Y0();
            if (!z11) {
                return true;
            }
            O0();
        }
        return z10;
    }

    private boolean e1(long j10) {
        return this.H == com.google.android.exoplayer2.j.f46377b || SystemClock.elapsedRealtime() - j10 < this.H;
    }

    private boolean f0(n nVar, a2 a2Var, @p0 DrmSession drmSession, @p0 DrmSession drmSession2) throws ExoPlaybackException {
        c0 c0VarS0;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || u0.f51536a < 23) {
            return true;
        }
        UUID uuid = com.google.android.exoplayer2.j.Y1;
        if (uuid.equals(drmSession.w()) || uuid.equals(drmSession2.w()) || (c0VarS0 = s0(drmSession2)) == null) {
            return true;
        }
        return !nVar.f46803g && (c0VarS0.f44697c ? false : drmSession2.y(a2Var.f43593m));
    }

    private boolean g0() throws ExoPlaybackException {
        m mVar = this.K;
        if (mVar == null || this.M3 == 2 || this.T3) {
            return false;
        }
        if (this.f46687y1 < 0) {
            int iJ = mVar.j();
            this.f46687y1 = iJ;
            if (iJ < 0) {
                return false;
            }
            this.f46678s.f44488e = this.K.h(iJ);
            this.f46678s.f();
        }
        if (this.M3 == 1) {
            if (!this.f46669c0) {
                this.P3 = true;
                this.K.queueInputBuffer(this.f46687y1, 0, 0, 0L, 4);
                X0();
            }
            this.M3 = 2;
            return false;
        }
        if (this.f46665a0) {
            this.f46665a0 = false;
            ByteBuffer byteBuffer = this.f46678s.f44488e;
            byte[] bArr = f46663t4;
            byteBuffer.put(bArr);
            this.K.queueInputBuffer(this.f46687y1, 0, bArr.length, 0L, 0);
            X0();
            this.O3 = true;
            return true;
        }
        if (this.L3 == 1) {
            for (int i10 = 0; i10 < this.L.f43595o.size(); i10++) {
                this.f46678s.f44488e.put(this.L.f43595o.get(i10));
            }
            this.L3 = 2;
        }
        int iPosition = this.f46678s.f44488e.position();
        b2 b2VarZ = z();
        try {
            int iL = L(b2VarZ, this.f46678s, 0);
            if (f()) {
                this.S3 = this.R3;
            }
            if (iL == -3) {
                return false;
            }
            if (iL == -5) {
                if (this.L3 == 2) {
                    this.f46678s.f();
                    this.L3 = 1;
                }
                J0(b2VarZ);
                return true;
            }
            if (this.f46678s.k()) {
                if (this.L3 == 2) {
                    this.f46678s.f();
                    this.L3 = 1;
                }
                this.T3 = true;
                if (!this.O3) {
                    O0();
                    return false;
                }
                try {
                    if (!this.f46669c0) {
                        this.P3 = true;
                        this.K.queueInputBuffer(this.f46687y1, 0, 0, 0L, 4);
                        X0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw w(e10, this.B, u0.e0(e10.getErrorCode()));
                }
            }
            if (!this.O3 && !this.f46678s.l()) {
                this.f46678s.f();
                if (this.L3 == 2) {
                    this.L3 = 1;
                }
                return true;
            }
            boolean zQ = this.f46678s.q();
            if (zQ) {
                this.f46678s.f44487d.b(iPosition);
            }
            if (this.T && !zQ) {
                com.google.android.exoplayer2.util.z.b(this.f46678s.f44488e);
                if (this.f46678s.f44488e.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f46678s;
            long jD = decoderInputBuffer.f44490g;
            j jVar = this.f46673p1;
            if (jVar != null) {
                jD = jVar.d(this.B, decoderInputBuffer);
                this.R3 = Math.max(this.R3, this.f46673p1.b(this.B));
            }
            long j10 = jD;
            if (this.f46678s.j()) {
                this.f46682w.add(Long.valueOf(j10));
            }
            if (this.V3) {
                this.f46681v.a(j10, this.B);
                this.V3 = false;
            }
            this.R3 = Math.max(this.R3, j10);
            this.f46678s.p();
            if (this.f46678s.i()) {
                w0(this.f46678s);
            }
            N0(this.f46678s);
            try {
                if (zQ) {
                    this.K.f(this.f46687y1, 0, this.f46678s.f44487d, j10, 0);
                } else {
                    this.K.queueInputBuffer(this.f46687y1, 0, this.f46678s.f44488e.limit(), j10, 0);
                }
                X0();
                this.O3 = true;
                this.L3 = 0;
                this.Y3.f44514c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw w(e11, this.B, u0.e0(e11.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            G0(e12);
            R0(0);
            h0();
            return true;
        }
    }

    private void h0() {
        try {
            this.K.flush();
        } finally {
            V0();
        }
    }

    protected static boolean i1(a2 a2Var) {
        int i10 = a2Var.F;
        return i10 == 0 || i10 == 2;
    }

    private List<n> k0(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List<n> listR0 = r0(this.f46671o, this.B, z10);
        if (listR0.isEmpty() && z10) {
            listR0 = r0(this.f46671o, this.B, false);
            if (!listR0.isEmpty()) {
                String str = this.B.f43593m;
                String strValueOf = String.valueOf(listR0);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + strValueOf.length());
                sb2.append("Drm session requires secure decoder for ");
                sb2.append(str);
                sb2.append(", but no secure decoder available. Trying to proceed with ");
                sb2.append(strValueOf);
                sb2.append(".");
                com.google.android.exoplayer2.util.u.m(f46647d4, sb2.toString());
            }
        }
        return listR0;
    }

    private boolean k1(a2 a2Var) throws ExoPlaybackException {
        if (u0.f51536a >= 23 && this.K != null && this.N3 != 3 && getState() != 0) {
            float fP0 = p0(this.J, a2Var, C());
            float f10 = this.O;
            if (f10 == fP0) {
                return true;
            }
            if (fP0 == -1.0f) {
                c0();
                return false;
            }
            if (f10 == -1.0f && fP0 <= this.f46676q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fP0);
            this.K.setParameters(bundle);
            this.O = fP0;
        }
        return true;
    }

    @w0(23)
    private void l1() throws ExoPlaybackException {
        try {
            this.F.setMediaDrmSession(s0(this.E).f44696b);
            Z0(this.E);
            this.M3 = 0;
            this.N3 = 0;
        } catch (MediaCryptoException e10) {
            throw w(e10, this.B, 6006);
        }
    }

    @p0
    private c0 s0(DrmSession drmSession) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.c cVarT = drmSession.t();
        if (cVarT == null || (cVarT instanceof c0)) {
            return (c0) cVarT;
        }
        String strValueOf = String.valueOf(cVarT);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 43);
        sb2.append("Expecting FrameworkCryptoConfig but found: ");
        sb2.append(strValueOf);
        throw w(new IllegalArgumentException(sb2.toString()), this.B, 6001);
    }

    private boolean x0() {
        return this.f46674p2 >= 0;
    }

    private void y0(a2 a2Var) {
        a0();
        String str = a2Var.f43593m;
        if (com.google.android.exoplayer2.util.y.A.equals(str) || "audio/mpeg".equals(str) || com.google.android.exoplayer2.util.y.V.equals(str)) {
            this.f46680u.C(32);
        } else {
            this.f46680u.C(1);
        }
        this.f46675p3 = true;
    }

    private void z0(n nVar, MediaCrypto mediaCrypto) throws Exception {
        String str = nVar.f46797a;
        float fP0 = u0.f51536a < 23 ? -1.0f : p0(this.J, this.B, C());
        float f10 = fP0 > this.f46676q ? fP0 : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strValueOf = String.valueOf(str);
        o0.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        this.K = this.f46670n.a(t0(nVar, this.B, mediaCrypto, f10));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.R = nVar;
        this.O = f10;
        this.L = this.B;
        this.S = Q(str);
        this.T = R(str, this.L);
        this.U = W(str);
        this.V = Y(str);
        this.W = T(str);
        this.X = U(str);
        this.Y = S(str);
        this.Z = X(str, this.L);
        this.f46669c0 = V(nVar) || n0();
        if (this.K.b()) {
            this.K3 = true;
            this.L3 = 1;
            this.f46665a0 = this.S != 0;
        }
        if ("c2.android.mp3.decoder".equals(nVar.f46797a)) {
            this.f46673p1 = new j();
        }
        if (getState() == 2) {
            this.f46684x1 = SystemClock.elapsedRealtime() + 1000;
        }
        this.Y3.f44512a++;
        H0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    @Override // com.google.android.exoplayer2.e
    protected void E() {
        this.B = null;
        this.Z3 = com.google.android.exoplayer2.j.f46377b;
        this.f46666a4 = com.google.android.exoplayer2.j.f46377b;
        this.f46668b4 = 0;
        j0();
    }

    protected final void E0() throws ExoPlaybackException {
        a2 a2Var;
        if (this.K != null || this.f46675p3 || (a2Var = this.B) == null) {
            return;
        }
        if (this.E == null && g1(a2Var)) {
            y0(this.B);
            return;
        }
        Z0(this.E);
        String str = this.B.f43593m;
        DrmSession drmSession = this.D;
        if (drmSession != null) {
            if (this.F == null) {
                c0 c0VarS0 = s0(drmSession);
                if (c0VarS0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(c0VarS0.f44695a, c0VarS0.f44696b);
                        this.F = mediaCrypto;
                        this.G = !c0VarS0.f44697c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw w(e10, this.B, 6006);
                    }
                } else if (this.D.q() == null) {
                    return;
                }
            }
            if (c0.f44694d) {
                int state = this.D.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) com.google.android.exoplayer2.util.a.g(this.D.q());
                    throw w(drmSessionException, this.B, drmSessionException.f44664b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            F0(this.F, this.G);
        } catch (DecoderInitializationException e11) {
            throw w(e11, this.B, 4001);
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
        this.Y3 = new com.google.android.exoplayer2.decoder.g();
    }

    @Override // com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) throws ExoPlaybackException {
        this.T3 = false;
        this.U3 = false;
        this.W3 = false;
        if (this.f46675p3) {
            this.f46680u.f();
            this.f46679t.f();
            this.G3 = false;
        } else {
            i0();
        }
        if (this.f46681v.l() > 0) {
            this.V3 = true;
        }
        this.f46681v.c();
        int i10 = this.f46668b4;
        if (i10 != 0) {
            this.f46666a4 = this.f46689z[i10 - 1];
            this.Z3 = this.f46686y[i10 - 1];
            this.f46668b4 = 0;
        }
    }

    protected void G0(Exception exc) {
    }

    @Override // com.google.android.exoplayer2.e
    protected void H() {
        try {
            a0();
            T0();
        } finally {
            d1(null);
        }
    }

    protected void H0(String str, long j10, long j11) {
    }

    @Override // com.google.android.exoplayer2.e
    protected void I() {
    }

    protected void I0(String str) {
    }

    @Override // com.google.android.exoplayer2.e
    protected void J() {
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    @androidx.annotation.i
    @p0
    protected com.google.android.exoplayer2.decoder.i J0(b2 b2Var) throws ExoPlaybackException {
        int i10;
        boolean z10 = true;
        this.V3 = true;
        a2 a2Var = (a2) com.google.android.exoplayer2.util.a.g(b2Var.f44366b);
        if (a2Var.f43593m == null) {
            throw w(new IllegalArgumentException(), a2Var, 4005);
        }
        d1(b2Var.f44365a);
        this.B = a2Var;
        if (this.f46675p3) {
            this.J3 = true;
            return null;
        }
        m mVar = this.K;
        if (mVar == null) {
            this.P = null;
            E0();
            return null;
        }
        n nVar = this.R;
        a2 a2Var2 = this.L;
        if (f0(nVar, a2Var, this.D, this.E)) {
            c0();
            return new com.google.android.exoplayer2.decoder.i(nVar.f46797a, a2Var2, a2Var, 0, 128);
        }
        boolean z11 = this.E != this.D;
        com.google.android.exoplayer2.util.a.i(!z11 || u0.f51536a >= 23);
        com.google.android.exoplayer2.decoder.i iVarP = P(nVar, a2Var2, a2Var);
        int i11 = iVarP.f44547d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (k1(a2Var)) {
                        this.L = a2Var;
                        if (z11 && !d0()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (k1(a2Var)) {
                    this.K3 = true;
                    this.L3 = 1;
                    int i12 = this.S;
                    if (i12 != 2 && (i12 != 1 || a2Var.f43598r != a2Var2.f43598r || a2Var.f43599s != a2Var2.f43599s)) {
                        z10 = false;
                    }
                    this.f46665a0 = z10;
                    this.L = a2Var;
                    if (z11 && !d0()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (k1(a2Var)) {
                this.L = a2Var;
                if (!z11 ? !b0() : !d0()) {
                    i10 = 2;
                }
            } else {
                i10 = 16;
            }
            return (iVarP.f44547d != 0 || (this.K == mVar && this.N3 != 3)) ? iVarP : new com.google.android.exoplayer2.decoder.i(nVar.f46797a, a2Var2, a2Var, 0, i10);
        }
        c0();
        i10 = 0;
        if (iVarP.f44547d != 0) {
        }
    }

    @Override // com.google.android.exoplayer2.e
    protected void K(a2[] a2VarArr, long j10, long j11) throws ExoPlaybackException {
        if (this.f46666a4 == com.google.android.exoplayer2.j.f46377b) {
            com.google.android.exoplayer2.util.a.i(this.Z3 == com.google.android.exoplayer2.j.f46377b);
            this.Z3 = j10;
            this.f46666a4 = j11;
            return;
        }
        int i10 = this.f46668b4;
        long[] jArr = this.f46689z;
        if (i10 == jArr.length) {
            long j12 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            com.google.android.exoplayer2.util.u.m(f46647d4, sb2.toString());
        } else {
            this.f46668b4 = i10 + 1;
        }
        long[] jArr2 = this.f46686y;
        int i11 = this.f46668b4;
        jArr2[i11 - 1] = j10;
        this.f46689z[i11 - 1] = j11;
        this.A[i11 - 1] = this.R3;
    }

    protected void K0(a2 a2Var, @p0 MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @androidx.annotation.i
    protected void L0(long j10) {
        while (true) {
            int i10 = this.f46668b4;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f46686y;
            this.Z3 = jArr[0];
            this.f46666a4 = this.f46689z[0];
            int i11 = i10 - 1;
            this.f46668b4 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f46689z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f46668b4);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f46668b4);
            M0();
        }
    }

    protected void M0() {
    }

    protected void N0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected com.google.android.exoplayer2.decoder.i P(n nVar, a2 a2Var, a2 a2Var2) {
        return new com.google.android.exoplayer2.decoder.i(nVar.f46797a, a2Var, a2Var2, 0, 1);
    }

    protected abstract boolean P0(long j10, long j11, @p0 m mVar, @p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, a2 a2Var) throws ExoPlaybackException;

    /* JADX WARN: Multi-variable type inference failed */
    protected void T0() {
        try {
            m mVar = this.K;
            if (mVar != null) {
                mVar.release();
                this.Y3.f44513b++;
                I0(this.R.f46797a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                Z0(null);
                W0();
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.F = null;
                Z0(null);
                W0();
            }
        }
    }

    protected void U0() throws ExoPlaybackException {
    }

    @androidx.annotation.i
    protected void V0() {
        X0();
        Y0();
        this.f46684x1 = com.google.android.exoplayer2.j.f46377b;
        this.P3 = false;
        this.O3 = false;
        this.f46665a0 = false;
        this.f46667b0 = false;
        this.f46688y2 = false;
        this.G2 = false;
        this.f46682w.clear();
        this.R3 = com.google.android.exoplayer2.j.f46377b;
        this.S3 = com.google.android.exoplayer2.j.f46377b;
        j jVar = this.f46673p1;
        if (jVar != null) {
            jVar.c();
        }
        this.M3 = 0;
        this.N3 = 0;
        this.L3 = this.K3 ? 1 : 0;
    }

    @androidx.annotation.i
    protected void W0() {
        V0();
        this.X3 = null;
        this.f46673p1 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.Q3 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f46669c0 = false;
        this.K3 = false;
        this.L3 = 0;
        this.G = false;
    }

    protected MediaCodecDecoderException Z(Throwable th2, @p0 n nVar) {
        return new MediaCodecDecoderException(th2, nVar);
    }

    @Override // com.google.android.exoplayer2.o3
    public final int a(a2 a2Var) throws ExoPlaybackException {
        try {
            return h1(this.f46671o, a2Var);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw w(e10, a2Var, 4002);
        }
    }

    protected final void a1() {
        this.W3 = true;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean b() {
        return this.U3;
    }

    protected final void b1(ExoPlaybackException exoPlaybackException) {
        this.X3 = exoPlaybackException;
    }

    public void c1(long j10) {
        this.H = j10;
    }

    protected boolean f1(n nVar) {
        return true;
    }

    protected boolean g1(a2 a2Var) {
        return false;
    }

    protected abstract int h1(p pVar, a2 a2Var) throws MediaCodecUtil.DecoderQueryException;

    protected final boolean i0() throws ExoPlaybackException {
        boolean zJ0 = j0();
        if (zJ0) {
            E0();
        }
        return zJ0;
    }

    @Override // com.google.android.exoplayer2.m3
    public boolean isReady() {
        return this.B != null && (D() || x0() || (this.f46684x1 != com.google.android.exoplayer2.j.f46377b && SystemClock.elapsedRealtime() < this.f46684x1));
    }

    @Override // com.google.android.exoplayer2.m3
    public void j(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.W3) {
            this.W3 = false;
            O0();
        }
        ExoPlaybackException exoPlaybackException = this.X3;
        if (exoPlaybackException != null) {
            this.X3 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.U3) {
                U0();
                return;
            }
            if (this.B != null || R0(2)) {
                E0();
                if (this.f46675p3) {
                    o0.a("bypassRender");
                    while (O(j10, j11)) {
                    }
                    o0.c();
                } else if (this.K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    o0.a("drainAndFeed");
                    while (e0(j10, j11) && e1(jElapsedRealtime)) {
                    }
                    while (g0() && e1(jElapsedRealtime)) {
                    }
                    o0.c();
                } else {
                    this.Y3.f44515d += M(j10);
                    R0(1);
                }
                this.Y3.c();
            }
        } catch (IllegalStateException e10) {
            if (!B0(e10)) {
                throw e10;
            }
            G0(e10);
            if (u0.f51536a >= 21 && D0(e10)) {
                z10 = true;
            }
            if (z10) {
                T0();
            }
            throw x(Z(e10, m0()), this.B, z10, 4003);
        }
    }

    protected boolean j0() {
        if (this.K == null) {
            return false;
        }
        if (this.N3 == 3 || this.U || ((this.V && !this.Q3) || (this.W && this.P3))) {
            T0();
            return true;
        }
        h0();
        return false;
    }

    protected final boolean j1() throws ExoPlaybackException {
        return k1(this.L);
    }

    @p0
    protected final m l0() {
        return this.K;
    }

    @p0
    protected final n m0() {
        return this.R;
    }

    protected final void m1(long j10) throws ExoPlaybackException {
        boolean z10;
        a2 a2VarJ = this.f46681v.j(j10);
        if (a2VarJ == null && this.N) {
            a2VarJ = this.f46681v.i();
        }
        if (a2VarJ != null) {
            this.C = a2VarJ;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.N && this.C != null)) {
            K0(this.C, this.M);
            this.N = false;
        }
    }

    protected boolean n0() {
        return false;
    }

    protected float o0() {
        return this.O;
    }

    protected float p0(float f10, a2 a2Var, a2[] a2VarArr) {
        return -1.0f;
    }

    @p0
    protected final MediaFormat q0() {
        return this.M;
    }

    protected abstract List<n> r0(p pVar, a2 a2Var, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.m3
    public void t(float f10, float f11) throws ExoPlaybackException {
        this.I = f10;
        this.J = f11;
        k1(this.L);
    }

    protected abstract m.a t0(n nVar, a2 a2Var, @p0 MediaCrypto mediaCrypto, float f10);

    protected final long u0() {
        return this.f46666a4;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.o3
    public final int v() {
        return 8;
    }

    protected float v0() {
        return this.I;
    }

    protected void w0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }
}
