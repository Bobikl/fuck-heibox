package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public class h extends MediaCodecRenderer {

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private static final String f51765e5 = "MediaCodecVideoRenderer";

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    private static final String f51766f5 = "crop-left";

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    private static final String f51767g5 = "crop-right";

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    private static final String f51768h5 = "crop-bottom";

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    private static final String f51769i5 = "crop-top";

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    private static final int[] f51770j5 = {1920, 1600, bb.c.b.Ko, 1280, bb.c.b.f31065yf, bb.c.b.f31019wd, bb.c.b.f30883q9, 540, 480};

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    private static final float f51771k5 = 1.5f;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    private static final long f51772l5 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    private static boolean f51773m5;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    private static boolean f51774n5;
    private final boolean A4;
    private a B4;
    private boolean C4;
    private boolean D4;

    @p0
    private Surface E4;

    @p0
    private DummySurface F4;
    private boolean G4;
    private int H4;
    private boolean I4;
    private boolean J4;
    private boolean K4;
    private long L4;
    private long M4;
    private long N4;
    private int O4;
    private int P4;
    private int Q4;
    private long R4;
    private long S4;
    private long T4;
    private int U4;
    private int V4;
    private int W4;
    private int X4;
    private float Y4;

    @p0
    private a0 Z4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private boolean f51775a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private int f51776b5;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @p0
    b f51777c5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    @p0
    private j f51778d5;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private final Context f51779v4;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private final m f51780w4;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private final y.a f51781x4;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private final long f51782y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private final int f51783z4;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51786c;

        public a(int i10, int i11, int i12) {
            this.f51784a = i10;
            this.f51785b = i11;
            this.f51786c = i12;
        }
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @w0(23)
    public final class b implements com.google.android.exoplayer2.mediacodec.m.c, Handler.Callback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f51787d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f51788b;

        public b(com.google.android.exoplayer2.mediacodec.m mVar) {
            Handler handlerZ = u0.z(this);
            this.f51788b = handlerZ;
            mVar.g(this, handlerZ);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.f51777c5) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.O1();
                return;
            }
            try {
                hVar.N1(j10);
            } catch (ExoPlaybackException e10) {
                h.this.b1(e10);
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.m.c
        public void a(com.google.android.exoplayer2.mediacodec.m mVar, long j10, long j11) {
            if (u0.f51536a >= 30) {
                b(j10);
            } else {
                this.f51788b.sendMessageAtFrontOfQueue(Message.obtain(this.f51788b, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(u0.x1(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.m.b bVar, com.google.android.exoplayer2.mediacodec.p pVar, long j10, boolean z10, @p0 Handler handler, @p0 y yVar, int i10) {
        this(context, bVar, pVar, j10, z10, handler, yVar, i10, 30.0f);
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.m.b bVar, com.google.android.exoplayer2.mediacodec.p pVar, long j10, boolean z10, @p0 Handler handler, @p0 y yVar, int i10, float f10) {
        super(2, bVar, pVar, z10, f10);
        this.f51782y4 = j10;
        this.f51783z4 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f51779v4 = applicationContext;
        this.f51780w4 = new m(applicationContext);
        this.f51781x4 = new y.a(handler, yVar);
        this.A4 = t1();
        this.M4 = com.google.android.exoplayer2.j.f46377b;
        this.V4 = -1;
        this.W4 = -1;
        this.Y4 = -1.0f;
        this.H4 = 1;
        this.f51776b5 = 0;
        q1();
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.p pVar) {
        this(context, pVar, 0L);
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.p pVar, long j10) {
        this(context, pVar, j10, null, null, 0);
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.p pVar, long j10, @p0 Handler handler, @p0 y yVar, int i10) {
        this(context, com.google.android.exoplayer2.mediacodec.m.b.f46794a, pVar, j10, false, handler, yVar, i10, 30.0f);
    }

    public h(Context context, com.google.android.exoplayer2.mediacodec.p pVar, long j10, boolean z10, @p0 Handler handler, @p0 y yVar, int i10) {
        this(context, com.google.android.exoplayer2.mediacodec.m.b.f46794a, pVar, j10, z10, handler, yVar, i10, 30.0f);
    }

    protected static int A1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var) {
        if (a2Var.f43594n == -1) {
            return w1(nVar, a2Var);
        }
        int size = a2Var.f43595o.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += a2Var.f43595o.get(i10).length;
        }
        return a2Var.f43594n + length;
    }

    private static boolean D1(long j10) {
        return j10 < -30000;
    }

    private static boolean E1(long j10) {
        return j10 < -500000;
    }

    private void G1() {
        if (this.O4 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f51781x4.n(this.O4, jElapsedRealtime - this.N4);
            this.O4 = 0;
            this.N4 = jElapsedRealtime;
        }
    }

    private void I1() {
        int i10 = this.U4;
        if (i10 != 0) {
            this.f51781x4.B(this.T4, i10);
            this.T4 = 0L;
            this.U4 = 0;
        }
    }

    private void J1() {
        int i10 = this.V4;
        if (i10 == -1 && this.W4 == -1) {
            return;
        }
        a0 a0Var = this.Z4;
        if (a0Var != null && a0Var.f51712b == i10 && a0Var.f51713c == this.W4 && a0Var.f51714d == this.X4 && a0Var.f51715e == this.Y4) {
            return;
        }
        a0 a0Var2 = new a0(this.V4, this.W4, this.X4, this.Y4);
        this.Z4 = a0Var2;
        this.f51781x4.D(a0Var2);
    }

    private void K1() {
        if (this.G4) {
            this.f51781x4.A(this.E4);
        }
    }

    private void L1() {
        a0 a0Var = this.Z4;
        if (a0Var != null) {
            this.f51781x4.D(a0Var);
        }
    }

    private void M1(long j10, long j11, a2 a2Var) {
        j jVar = this.f51778d5;
        if (jVar != null) {
            jVar.a(j10, j11, a2Var, q0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1() {
        a1();
    }

    @w0(17)
    private void P1() {
        Surface surface = this.E4;
        DummySurface dummySurface = this.F4;
        if (surface == dummySurface) {
            this.E4 = null;
        }
        dummySurface.release();
        this.F4 = null;
    }

    @w0(29)
    private static void S1(com.google.android.exoplayer2.mediacodec.m mVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mVar.setParameters(bundle);
    }

    private void T1() {
        this.M4 = this.f51782y4 > 0 ? SystemClock.elapsedRealtime() + this.f51782y4 : com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.video.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.e, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.video.h] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.exoplayer2.video.DummySurface] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void U1(@p0 Object obj) throws ExoPlaybackException {
        ?? C;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            DummySurface dummySurface = this.F4;
            if (dummySurface != null) {
                C = surface;
                C = dummySurface;
            } else {
                com.google.android.exoplayer2.mediacodec.n nVarM0 = m0();
                if (nVarM0 != null && Z1(nVarM0)) {
                    C = surface;
                    C = DummySurface.c(this.f51779v4, nVarM0.f46803g);
                    this.F4 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        if (this.E4 == C) {
            if (C == 0 || C == this.F4) {
                return;
            }
            L1();
            K1();
            return;
        }
        this.E4 = C;
        this.f51780w4.o(C);
        this.G4 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.m mVarL0 = l0();
        if (mVarL0 != null) {
            if (u0.f51536a < 23 || C == 0 || this.C4) {
                T0();
                E0();
            } else {
                V1(mVarL0, C);
            }
        }
        if (C == 0 || C == this.F4) {
            q1();
            p1();
            return;
        }
        L1();
        p1();
        if (state == 2) {
            T1();
        }
    }

    private boolean Z1(com.google.android.exoplayer2.mediacodec.n nVar) {
        return u0.f51536a >= 23 && !this.f51775a5 && !r1(nVar.f46797a) && (!nVar.f46803g || DummySurface.b(this.f51779v4));
    }

    private void p1() {
        com.google.android.exoplayer2.mediacodec.m mVarL0;
        this.I4 = false;
        if (u0.f51536a < 23 || !this.f51775a5 || (mVarL0 = l0()) == null) {
            return;
        }
        this.f51777c5 = new b(mVarL0);
    }

    private void q1() {
        this.Z4 = null;
    }

    @w0(21)
    private static void s1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean t1() {
        return "NVIDIA".equals(u0.f51538c);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static boolean v1() {
        /*
            Method dump skipped, instruction units count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.h.v1():boolean");
    }

    private static int w1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var) {
        int iM;
        int iIntValue;
        int i10 = a2Var.f43598r;
        int i11 = a2Var.f43599s;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = a2Var.f43593m;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairQ = MediaCodecUtil.q(a2Var);
            str = (pairQ == null || !((iIntValue = ((Integer) pairQ.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iM = i10 * i11;
                i12 = 2;
                return (iM * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iM = i10 * i11;
                return (iM * 3) / (i12 * 2);
            case "video/avc":
                String str2 = u0.f51539d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(u0.f51538c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && nVar.f46803g)))) {
                    return -1;
                }
                iM = u0.m(i10, 16) * u0.m(i11, 16) * 16 * 16;
                i12 = 2;
                return (iM * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    private static Point x1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var) {
        int i10 = a2Var.f43599s;
        int i11 = a2Var.f43598r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f51770j5) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (u0.f51536a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointB = nVar.b(i15, i13);
                if (nVar.w(pointB.x, pointB.y, a2Var.f43600t)) {
                    return pointB;
                }
            } else {
                try {
                    int iM = u0.m(i13, 16) * 16;
                    int iM2 = u0.m(i14, 16) * 16;
                    if (iM * iM2 <= MediaCodecUtil.N()) {
                        int i16 = z10 ? iM2 : iM;
                        if (!z10) {
                            iM = iM2;
                        }
                        return new Point(i16, iM);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List<com.google.android.exoplayer2.mediacodec.n> z1(com.google.android.exoplayer2.mediacodec.p pVar, a2 a2Var, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> pairQ;
        String str = a2Var.f43593m;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.n> listU = MediaCodecUtil.u(pVar.a(str, z10, z11), a2Var);
        if ("video/dolby-vision".equals(str) && (pairQ = MediaCodecUtil.q(a2Var)) != null) {
            int iIntValue = ((Integer) pairQ.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listU.addAll(pVar.a("video/hevc", z10, z11));
            } else if (iIntValue == 512) {
                listU.addAll(pVar.a("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(listU);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat B1(a2 a2Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairQ;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(org.apache.tools.ant.taskdefs.email.b.I, str);
        mediaFormat.setInteger("width", a2Var.f43598r);
        mediaFormat.setInteger("height", a2Var.f43599s);
        com.google.android.exoplayer2.util.x.j(mediaFormat, a2Var.f43595o);
        com.google.android.exoplayer2.util.x.d(mediaFormat, "frame-rate", a2Var.f43600t);
        com.google.android.exoplayer2.util.x.e(mediaFormat, "rotation-degrees", a2Var.f43601u);
        com.google.android.exoplayer2.util.x.c(mediaFormat, a2Var.f43605y);
        if ("video/dolby-vision".equals(a2Var.f43593m) && (pairQ = MediaCodecUtil.q(a2Var)) != null) {
            com.google.android.exoplayer2.util.x.e(mediaFormat, com.google.android.gms.common.m.f52595a, ((Integer) pairQ.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f51784a);
        mediaFormat.setInteger("max-height", aVar.f51785b);
        com.google.android.exoplayer2.util.x.e(mediaFormat, "max-input-size", aVar.f51786c);
        if (u0.f51536a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            s1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    protected Surface C1() {
        return this.E4;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void E() {
        q1();
        p1();
        this.G4 = false;
        this.f51780w4.g();
        this.f51777c5 = null;
        try {
            super.E();
        } finally {
            this.f51781x4.m(this.Y3);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void F(boolean z10, boolean z11) throws ExoPlaybackException {
        super.F(z10, z11);
        boolean z12 = y().f47323a;
        com.google.android.exoplayer2.util.a.i((z12 && this.f51776b5 == 0) ? false : true);
        if (this.f51775a5 != z12) {
            this.f51775a5 = z12;
            T0();
        }
        this.f51781x4.o(this.Y3);
        this.f51780w4.h();
        this.J4 = z11;
        this.K4 = false;
    }

    protected boolean F1(long j10, boolean z10) throws ExoPlaybackException {
        int iM = M(j10);
        if (iM == 0) {
            return false;
        }
        com.google.android.exoplayer2.decoder.g gVar = this.Y3;
        gVar.f44520i++;
        int i10 = this.Q4 + iM;
        if (z10) {
            gVar.f44517f += i10;
        } else {
            b2(i10);
        }
        i0();
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void G(long j10, boolean z10) throws ExoPlaybackException {
        super.G(j10, z10);
        p1();
        this.f51780w4.l();
        this.R4 = com.google.android.exoplayer2.j.f46377b;
        this.L4 = com.google.android.exoplayer2.j.f46377b;
        this.P4 = 0;
        if (z10) {
            T1();
        } else {
            this.M4 = com.google.android.exoplayer2.j.f46377b;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void G0(Exception exc) {
        com.google.android.exoplayer2.util.u.e(f51765e5, "Video codec error", exc);
        this.f51781x4.C(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    @TargetApi(17)
    protected void H() {
        try {
            super.H();
        } finally {
            if (this.F4 != null) {
                P1();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void H0(String str, long j10, long j11) {
        this.f51781x4.k(str, j10, j11);
        this.C4 = r1(str);
        this.D4 = ((com.google.android.exoplayer2.mediacodec.n) com.google.android.exoplayer2.util.a.g(m0())).p();
        if (u0.f51536a < 23 || !this.f51775a5) {
            return;
        }
        this.f51777c5 = new b((com.google.android.exoplayer2.mediacodec.m) com.google.android.exoplayer2.util.a.g(l0()));
    }

    void H1() {
        this.K4 = true;
        if (this.I4) {
            return;
        }
        this.I4 = true;
        this.f51781x4.A(this.E4);
        this.G4 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void I() {
        super.I();
        this.O4 = 0;
        this.N4 = SystemClock.elapsedRealtime();
        this.S4 = SystemClock.elapsedRealtime() * 1000;
        this.T4 = 0L;
        this.U4 = 0;
        this.f51780w4.m();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void I0(String str) {
        this.f51781x4.l(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    protected void J() {
        this.M4 = com.google.android.exoplayer2.j.f46377b;
        G1();
        I1();
        this.f51780w4.n();
        super.J();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @p0
    protected com.google.android.exoplayer2.decoder.i J0(b2 b2Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.decoder.i iVarJ0 = super.J0(b2Var);
        this.f51781x4.p(b2Var.f44366b, iVarJ0);
        return iVarJ0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void K0(a2 a2Var, @p0 MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.m mVarL0 = l0();
        if (mVarL0 != null) {
            mVarL0.c(this.H4);
        }
        if (this.f51775a5) {
            this.V4 = a2Var.f43598r;
            this.W4 = a2Var.f43599s;
        } else {
            com.google.android.exoplayer2.util.a.g(mediaFormat);
            boolean z10 = mediaFormat.containsKey(f51767g5) && mediaFormat.containsKey(f51766f5) && mediaFormat.containsKey(f51768h5) && mediaFormat.containsKey(f51769i5);
            this.V4 = z10 ? (mediaFormat.getInteger(f51767g5) - mediaFormat.getInteger(f51766f5)) + 1 : mediaFormat.getInteger("width");
            this.W4 = z10 ? (mediaFormat.getInteger(f51768h5) - mediaFormat.getInteger(f51769i5)) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = a2Var.f43602v;
        this.Y4 = f10;
        if (u0.f51536a >= 21) {
            int i10 = a2Var.f43601u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.V4;
                this.V4 = this.W4;
                this.W4 = i11;
                this.Y4 = 1.0f / f10;
            }
        } else {
            this.X4 = a2Var.f43601u;
        }
        this.f51780w4.i(a2Var.f43600t);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.i
    protected void L0(long j10) {
        super.L0(j10);
        if (this.f51775a5) {
            return;
        }
        this.Q4--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void M0() {
        super.M0();
        p1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.i
    protected void N0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z10 = this.f51775a5;
        if (!z10) {
            this.Q4++;
        }
        if (u0.f51536a >= 23 || !z10) {
            return;
        }
        N1(decoderInputBuffer.f44490g);
    }

    protected void N1(long j10) throws ExoPlaybackException {
        m1(j10);
        J1();
        this.Y3.f44516e++;
        H1();
        L0(j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.decoder.i P(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, a2 a2Var2) {
        com.google.android.exoplayer2.decoder.i iVarE = nVar.e(a2Var, a2Var2);
        int i10 = iVarE.f44548e;
        int i11 = a2Var2.f43598r;
        a aVar = this.B4;
        if (i11 > aVar.f51784a || a2Var2.f43599s > aVar.f51785b) {
            i10 |= 256;
        }
        if (A1(nVar, a2Var2) > this.B4.f51786c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new com.google.android.exoplayer2.decoder.i(nVar.f46797a, a2Var, a2Var2, i12 != 0 ? 0 : iVarE.f44547d, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean P0(long j10, long j11, @p0 com.google.android.exoplayer2.mediacodec.m mVar, @p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, a2 a2Var) throws ExoPlaybackException {
        com.google.android.exoplayer2.util.a.g(mVar);
        if (this.L4 == com.google.android.exoplayer2.j.f46377b) {
            this.L4 = j10;
        }
        if (j12 != this.R4) {
            this.f51780w4.j(j12);
            this.R4 = j12;
        }
        long jU0 = u0();
        long j13 = j12 - jU0;
        if (z10 && !z11) {
            a2(mVar, i10, j13);
            return true;
        }
        double dV0 = v0();
        boolean z12 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j12 - j10) / dV0);
        if (z12) {
            j14 -= jElapsedRealtime - j11;
        }
        if (this.E4 == this.F4) {
            if (!D1(j14)) {
                return false;
            }
            a2(mVar, i10, j13);
            c2(j14);
            return true;
        }
        if (this.M4 == com.google.android.exoplayer2.j.f46377b && j10 >= jU0 && ((this.K4 ? !this.I4 : !(!z12 && !this.J4)) || (z12 && Y1(j14, jElapsedRealtime - this.S4)))) {
            long jNanoTime = System.nanoTime();
            M1(j13, jNanoTime, a2Var);
            if (u0.f51536a >= 21) {
                R1(mVar, i10, j13, jNanoTime);
            } else {
                Q1(mVar, i10, j13);
            }
            c2(j14);
            return true;
        }
        if (z12 && j10 != this.L4) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.f51780w4.b((j14 * 1000) + jNanoTime2);
            long j15 = (jB - jNanoTime2) / 1000;
            boolean z13 = this.M4 != com.google.android.exoplayer2.j.f46377b;
            if (W1(j15, j11, z11) && F1(j10, z13)) {
                return false;
            }
            if (X1(j15, j11, z11)) {
                if (z13) {
                    a2(mVar, i10, j13);
                } else {
                    u1(mVar, i10, j13);
                }
                c2(j15);
                return true;
            }
            if (u0.f51536a >= 21) {
                if (j15 < 50000) {
                    M1(j13, jB, a2Var);
                    R1(mVar, i10, j13, jB);
                    c2(j15);
                    return true;
                }
            } else if (j15 < 30000) {
                if (j15 > 11000) {
                    try {
                        Thread.sleep((j15 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                M1(j13, jB, a2Var);
                Q1(mVar, i10, j13);
                c2(j15);
                return true;
            }
        }
        return false;
    }

    protected void Q1(com.google.android.exoplayer2.mediacodec.m mVar, int i10, long j10) {
        J1();
        o0.a("releaseOutputBuffer");
        mVar.releaseOutputBuffer(i10, true);
        o0.c();
        this.S4 = SystemClock.elapsedRealtime() * 1000;
        this.Y3.f44516e++;
        this.P4 = 0;
        H1();
    }

    @w0(21)
    protected void R1(com.google.android.exoplayer2.mediacodec.m mVar, int i10, long j10, long j11) {
        J1();
        o0.a("releaseOutputBuffer");
        mVar.d(i10, j11);
        o0.c();
        this.S4 = SystemClock.elapsedRealtime() * 1000;
        this.Y3.f44516e++;
        this.P4 = 0;
        H1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @androidx.annotation.i
    protected void V0() {
        super.V0();
        this.Q4 = 0;
    }

    @w0(23)
    protected void V1(com.google.android.exoplayer2.mediacodec.m mVar, Surface surface) {
        mVar.setOutputSurface(surface);
    }

    protected boolean W1(long j10, long j11, boolean z10) {
        return E1(j10) && !z10;
    }

    protected boolean X1(long j10, long j11, boolean z10) {
        return D1(j10) && !z10;
    }

    protected boolean Y1(long j10, long j11) {
        return D1(j10) && j11 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException Z(Throwable th2, @p0 com.google.android.exoplayer2.mediacodec.n nVar) {
        return new MediaCodecVideoDecoderException(th2, nVar, this.E4);
    }

    protected void a2(com.google.android.exoplayer2.mediacodec.m mVar, int i10, long j10) {
        o0.a("skipVideoBuffer");
        mVar.releaseOutputBuffer(i10, false);
        o0.c();
        this.Y3.f44517f++;
    }

    protected void b2(int i10) {
        com.google.android.exoplayer2.decoder.g gVar = this.Y3;
        gVar.f44518g += i10;
        this.O4 += i10;
        int i11 = this.P4 + i10;
        this.P4 = i11;
        gVar.f44519h = Math.max(i11, gVar.f44519h);
        int i12 = this.f51783z4;
        if (i12 <= 0 || this.O4 < i12) {
            return;
        }
        G1();
    }

    protected void c2(long j10) {
        this.Y3.a(j10);
        this.T4 += j10;
        this.U4++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean f1(com.google.android.exoplayer2.mediacodec.n nVar) {
        return this.E4 != null || Z1(nVar);
    }

    @Override // com.google.android.exoplayer2.m3, com.google.android.exoplayer2.o3
    public String getName() {
        return f51765e5;
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.h3.b
    public void h(int i10, @p0 Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            U1(obj);
            return;
        }
        if (i10 == 7) {
            this.f51778d5 = (j) obj;
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f51776b5 != iIntValue) {
                this.f51776b5 = iIntValue;
                if (this.f51775a5) {
                    T0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.h(i10, obj);
                return;
            } else {
                this.f51780w4.q(((Integer) obj).intValue());
                return;
            }
        }
        this.H4 = ((Integer) obj).intValue();
        com.google.android.exoplayer2.mediacodec.m mVarL0 = l0();
        if (mVarL0 != null) {
            mVarL0.c(this.H4);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int h1(com.google.android.exoplayer2.mediacodec.p pVar, a2 a2Var) throws MediaCodecUtil.DecoderQueryException {
        int i10 = 0;
        if (!com.google.android.exoplayer2.util.y.t(a2Var.f43593m)) {
            return n3.a(0);
        }
        boolean z10 = a2Var.f43596p != null;
        List<com.google.android.exoplayer2.mediacodec.n> listZ1 = z1(pVar, a2Var, z10, false);
        if (z10 && listZ1.isEmpty()) {
            listZ1 = z1(pVar, a2Var, false, false);
        }
        if (listZ1.isEmpty()) {
            return n3.a(1);
        }
        if (!MediaCodecRenderer.i1(a2Var)) {
            return n3.a(2);
        }
        com.google.android.exoplayer2.mediacodec.n nVar = listZ1.get(0);
        boolean zO = nVar.o(a2Var);
        int i11 = nVar.q(a2Var) ? 16 : 8;
        if (zO) {
            List<com.google.android.exoplayer2.mediacodec.n> listZ2 = z1(pVar, a2Var, z10, true);
            if (!listZ2.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.n nVar2 = listZ2.get(0);
                if (nVar2.o(a2Var) && nVar2.q(a2Var)) {
                    i10 = 32;
                }
            }
        }
        return n3.b(zO ? 4 : 3, i11, i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.m3
    public boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.I4 || (((dummySurface = this.F4) != null && this.E4 == dummySurface) || l0() == null || this.f51775a5))) {
            this.M4 = com.google.android.exoplayer2.j.f46377b;
            return true;
        }
        if (this.M4 == com.google.android.exoplayer2.j.f46377b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.M4) {
            return true;
        }
        this.M4 = com.google.android.exoplayer2.j.f46377b;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean n0() {
        return this.f51775a5 && u0.f51536a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float p0(float f10, a2 a2Var, a2[] a2VarArr) {
        float fMax = -1.0f;
        for (a2 a2Var2 : a2VarArr) {
            float f11 = a2Var2.f43600t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.n> r0(com.google.android.exoplayer2.mediacodec.p pVar, a2 a2Var, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return z1(pVar, a2Var, z10, this.f51775a5);
    }

    protected boolean r1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f51773m5) {
                f51774n5 = v1();
                f51773m5 = true;
            }
        }
        return f51774n5;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e, com.google.android.exoplayer2.m3
    public void t(float f10, float f11) throws ExoPlaybackException {
        super.t(f10, f11);
        this.f51780w4.k(f10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    protected com.google.android.exoplayer2.mediacodec.m.a t0(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, @p0 MediaCrypto mediaCrypto, float f10) {
        DummySurface dummySurface = this.F4;
        if (dummySurface != null && dummySurface.f51666b != nVar.f46803g) {
            P1();
        }
        String str = nVar.f46799c;
        a aVarY1 = y1(nVar, a2Var, C());
        this.B4 = aVarY1;
        MediaFormat mediaFormatB1 = B1(a2Var, str, aVarY1, f10, this.A4, this.f51775a5 ? this.f51776b5 : 0);
        if (this.E4 == null) {
            if (!Z1(nVar)) {
                throw new IllegalStateException();
            }
            if (this.F4 == null) {
                this.F4 = DummySurface.c(this.f51779v4, nVar.f46803g);
            }
            this.E4 = this.F4;
        }
        return com.google.android.exoplayer2.mediacodec.m.a.c(nVar, mediaFormatB1, a2Var, this.E4, mediaCrypto);
    }

    protected void u1(com.google.android.exoplayer2.mediacodec.m mVar, int i10, long j10) {
        o0.a("dropVideoBuffer");
        mVar.releaseOutputBuffer(i10, false);
        o0.c();
        b2(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void w0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.D4) {
            ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(decoderInputBuffer.f44491h);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    S1(l0(), bArr);
                }
            }
        }
    }

    protected a y1(com.google.android.exoplayer2.mediacodec.n nVar, a2 a2Var, a2[] a2VarArr) {
        int iW1;
        int iMax = a2Var.f43598r;
        int iMax2 = a2Var.f43599s;
        int iA1 = A1(nVar, a2Var);
        if (a2VarArr.length == 1) {
            if (iA1 != -1 && (iW1 = w1(nVar, a2Var)) != -1) {
                iA1 = Math.min((int) (iA1 * f51771k5), iW1);
            }
            return new a(iMax, iMax2, iA1);
        }
        int length = a2VarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            a2 a2VarE = a2VarArr[i10];
            if (a2Var.f43605y != null && a2VarE.f43605y == null) {
                a2VarE = a2VarE.c().J(a2Var.f43605y).E();
            }
            if (nVar.e(a2Var, a2VarE).f44547d != 0) {
                int i11 = a2VarE.f43598r;
                z10 |= i11 == -1 || a2VarE.f43599s == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, a2VarE.f43599s);
                iA1 = Math.max(iA1, A1(nVar, a2VarE));
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Resolutions unknown. Codec max resolution: ");
            sb2.append(iMax);
            sb2.append("x");
            sb2.append(iMax2);
            com.google.android.exoplayer2.util.u.m(f51765e5, sb2.toString());
            Point pointX1 = x1(nVar, a2Var);
            if (pointX1 != null) {
                iMax = Math.max(iMax, pointX1.x);
                iMax2 = Math.max(iMax2, pointX1.y);
                iA1 = Math.max(iA1, w1(nVar, a2Var.c().j0(iMax).Q(iMax2).E()));
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Codec max resolution adjusted to: ");
                sb3.append(iMax);
                sb3.append("x");
                sb3.append(iMax2);
                com.google.android.exoplayer2.util.u.m(f51765e5, sb3.toString());
            }
        }
        return new a(iMax, iMax2, iA1);
    }
}
