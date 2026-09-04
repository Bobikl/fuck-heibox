package com.tencent.thumbplayer.tcmedia.g.b;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.igexin.sdk.PushConsts;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Surface, f> f102690i = new ConcurrentHashMap();
    private int A;
    private com.tencent.thumbplayer.tcmedia.g.e.a.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f102691a = b.Started;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f102694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f102695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Surface f102696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.tencent.thumbplayer.tcmedia.g.b.b f102697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final String f102698h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f102699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.g.f.a.EnumC1024a f102700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashSet<Integer> f102701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<Long> f102702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<SurfaceTexture> f102703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f102704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MediaCodec f102705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f102706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f102707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MediaCodecInfo.CodecCapabilities f102708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f102709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.g.a.a f102710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f102711v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.g.f.a.b f102712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f102713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f102714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f102715z;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.f$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102717a;

        static {
            int[] iArr = new int[com.tencent.thumbplayer.tcmedia.g.f.a.b.values().length];
            f102717a = iArr;
            try {
                iArr[com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102717a[com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102717a[com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102717a[com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITH_FLUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        Uninitialized,
        Configured,
        Error,
        Flushed,
        Running,
        EndOfStream,
        Released
    }

    public enum b {
        Started,
        DequeueIn,
        QueueIn,
        DequeueOut,
        ReleaseOut
    }

    public f(MediaCodec mediaCodec, e eVar) {
        String str = "ReuseCodecWrapper[" + hashCode() + "]";
        this.f102699j = str;
        this.f102701l = new HashSet<>();
        this.f102702m = new ArrayList<>();
        this.f102703n = new LinkedHashSet();
        this.f102704o = new int[2];
        this.f102707r = a.Uninitialized;
        this.f102712w = com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO;
        boolean z10 = false;
        this.f102714y = false;
        this.f102715z = false;
        this.A = 0;
        this.f102705p = mediaCodec;
        this.f102695e = eVar;
        this.f102697g = new com.tencent.thumbplayer.tcmedia.g.b.b(eVar.f102684g, eVar.f102685h, eVar.f102686i);
        String strA = com.tencent.thumbplayer.tcmedia.g.h.c.a(mediaCodec);
        this.f102698h = strA;
        this.f102700k = com.tencent.thumbplayer.tcmedia.g.f.a.a(strA);
        boolean z11 = Build.VERSION.SDK_INT != 29 || eVar.f102681d == 0;
        com.tencent.thumbplayer.tcmedia.g.h.b.b(str, "canCallGetCodecInfo:".concat(String.valueOf(z11)));
        if (z11) {
            this.f102708s = mediaCodec.getCodecInfo().getCapabilitiesForType(eVar.f102687j);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f102708s;
        this.f102693c = codecCapabilities != null && com.tencent.thumbplayer.tcmedia.g.h.c.a(codecCapabilities);
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f102708s;
        if (codecCapabilities2 != null && com.tencent.thumbplayer.tcmedia.g.h.c.b(codecCapabilities2)) {
            z10 = true;
        }
        this.f102694d = z10;
    }

    public static c a(MediaCodec mediaCodec, String str, e eVar) {
        return com.tencent.thumbplayer.tcmedia.g.h.c.a(str) ? new g(mediaCodec, eVar) : new com.tencent.thumbplayer.tcmedia.g.b.a(mediaCodec, eVar);
    }

    private void a(int i10) {
        if (i10 < 40000) {
            com.tencent.thumbplayer.tcmedia.g.h.b.e(this.f102699j, this + "    releaseCodecWhenError, errorCode:" + i10);
            g();
        }
    }

    private void a(int i10, int i11) {
        if (this.f102715z || !b(i10, i11)) {
            return;
        }
        this.f102715z = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(", trackDecodeApi state:");
        sb2.append(this.f102707r);
        sb2.append("  surfaceState:");
        Surface surface = this.f102696f;
        sb2.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
        String string = sb2.toString();
        if (i10 == 0) {
            a(40002, string, (Throwable) null);
        } else if (i10 == 1) {
            a(60002, string, (Throwable) null);
        }
    }

    private void a(int i10, String str, Throwable th2) {
        a(i10, str, th2, false, this.f102696f);
    }

    private void a(int i10, String str, Throwable th2, boolean z10, Surface surface) {
        int iD;
        this.f102714y = true;
        String str2 = str + " handleCoreAPIException exception:" + (th2 == null ? "" : th2.getLocalizedMessage());
        if (z10 && (iD = d(surface)) != 0) {
            i10 = iD;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_ERROR_CODE, i10);
            jSONObject.put("exceptionMsg", str2);
            com.tencent.thumbplayer.tcmedia.g.a.a aVar = this.f102710u;
            if (aVar != null) {
                aVar.onReuseCodecAPIException(jSONObject.toString(), th2);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, "hasReused:" + this.f102711v + "    errorCode:" + i10 + ", " + str2, th2);
        a(i10);
    }

    private void a(Surface surface, boolean z10, boolean z11) {
        if (this.f102696f == surface) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, this + ", innerSetOutputSurface error surface:" + surface + " is same, stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        String str = null;
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            str = this + " configure, call innerSetOutputSurface surface:" + surface + "  decodeState:" + this.f102691a + " callByInner:" + z10;
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, str);
        }
        String str2 = str;
        try {
            b(surface);
            this.f102705p.setOutputSurface(surface);
            if (z11) {
                return;
            }
            p();
        } catch (Throwable th2) {
            int i10 = 0;
            if (th2 instanceof IllegalStateException) {
                i10 = 30000;
            } else if (th2 instanceof IllegalArgumentException) {
                i10 = PushConsts.ALIAS_ERROR_FREQUENCY;
            }
            a(i10, str2, th2, true, surface);
            throw th2;
        }
    }

    private final void b(int i10, int i11, int i12, long j10, int i13) {
        int i14 = AnonymousClass2.f102717a[this.f102712w.ordinal()];
        if (i14 == 1) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "queueInputBufferForAdaptation error for KEEP_CODEC_RESULT_NO");
        } else if (i14 == 2) {
            c(i10, i11, i12, j10, i13);
        } else {
            if (i14 != 3) {
                return;
            }
            this.f102705p.queueInputBuffer(i10, i11, i12, j10, i13);
        }
    }

    private void b(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        String str = null;
        try {
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                str = this + ", realConfigure mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i10 + " state:" + this.f102707r + " mHasConfigureCalled：" + this.f102713x;
                com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, str);
            }
            this.f102705p.configure(mediaFormat, surface, mediaCrypto, i10);
            b(surface);
            this.f102707r = a.Configured;
        } catch (Throwable th2) {
            String str2 = str;
            int i11 = 0;
            if (th2 instanceof IllegalStateException) {
                i11 = 10000;
            } else if (th2 instanceof MediaCodec.CryptoException) {
                i11 = 10001;
            }
            a(i11, str2, th2, true, surface);
            throw th2;
        }
    }

    private void b(Surface surface) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.c(this.f102699j, this + ", oldSurface:" + this.f102696f + " CodecWrapperSetSurface surface:" + surface);
        }
        this.f102696f = surface;
    }

    private boolean b(int i10, int i11) {
        if (i11 != -1) {
            this.f102704o[i10] = 0;
            return false;
        }
        int[] iArr = this.f102704o;
        int i12 = iArr[i10] + 1;
        iArr[i10] = i12;
        return i12 > 100;
    }

    private final void c(int i10, int i11, int i12, long j10, int i13) {
        this.f102705p.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    private void c(Surface surface) {
        a(surface, true, false);
    }

    private int d(Surface surface) {
        if (surface == null) {
            return 10003;
        }
        return !surface.isValid() ? 10004 : 0;
    }

    private boolean n() {
        return Thread.currentThread().getId() != this.f102709t;
    }

    private void o() {
        if (this.B != null) {
            return;
        }
        com.tencent.thumbplayer.tcmedia.g.e.a.a aVar = new com.tencent.thumbplayer.tcmedia.g.e.a.a(1, 1);
        this.B = aVar;
        a(aVar.d(), true, true);
    }

    private void p() {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, this + "unBindingBackupSurface");
        }
        com.tencent.thumbplayer.tcmedia.g.e.a.a aVar = this.B;
        if (aVar != null) {
            aVar.b();
        }
        this.B = null;
    }

    private void q() {
        this.f102715z = false;
        this.A = 0;
    }

    private void r() {
        int[] iArr = this.f102704o;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public int a(long j10) {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore call method dequeueInputBuffer for isNotMyThread");
            return -1;
        }
        String str = null;
        int i10 = 0;
        try {
            int iDequeueInputBuffer = this.f102705p.dequeueInputBuffer(j10);
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                str = this + ", dequeueInputBuffer state:" + this.f102707r + " decodeState:" + this.f102691a + " , result=" + iDequeueInputBuffer;
                com.tencent.thumbplayer.tcmedia.g.h.b.a(this.f102699j, str);
            }
            this.f102691a = b.DequeueIn;
            this.f102707r = a.Running;
            a(0, iDequeueInputBuffer);
            return iDequeueInputBuffer;
        } catch (Throwable th2) {
            if (th2 instanceof IllegalStateException) {
                i10 = 40000;
            } else if (th2 instanceof IllegalArgumentException) {
                i10 = 40001;
            }
            a(i10, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public int a(MediaCodec.BufferInfo bufferInfo, long j10) {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore call method dequeueOutputBuffer for isNotMyThread");
            return -1;
        }
        String str = null;
        try {
            int iDequeueOutputBuffer = this.f102705p.dequeueOutputBuffer(bufferInfo, j10);
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                str = this + ", dequeueOutputBuffer outIndex:" + iDequeueOutputBuffer;
                if (this instanceof g) {
                    com.tencent.thumbplayer.tcmedia.g.h.b.a(this.f102699j, str);
                }
            }
            this.f102701l.add(Integer.valueOf(iDequeueOutputBuffer));
            this.f102691a = b.DequeueOut;
            a(1, iDequeueOutputBuffer);
            return iDequeueOutputBuffer;
        } catch (Throwable th2) {
            int i10 = 0;
            if (th2 instanceof MediaCodec.CodecException) {
                i10 = PushConsts.MIN_OPEN_FEEDBACK_ACTION;
            } else if (th2 instanceof IllegalStateException) {
                i10 = 60000;
            }
            a(i10, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public MediaCodec a() {
        return this.f102705p;
    }

    public abstract com.tencent.thumbplayer.tcmedia.g.f.a.b a(e eVar);

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void a(int i10, int i11, int i12, long j10, int i13) {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore call method queueInputBuffer for isNotMyThread");
            return;
        }
        String str = null;
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            str = this + ", queueInputBuffer index:" + i10 + " offset:" + i11 + " size:" + i12 + " presentationTimeUs:" + j10 + " flags:" + i13 + " state:" + this.f102707r + " decodeState:" + this.f102691a;
            com.tencent.thumbplayer.tcmedia.g.h.b.a(this.f102699j, str);
        }
        try {
            if (this.f102711v) {
                b(i10, i11, i12, j10, i13);
            } else {
                this.f102705p.queueInputBuffer(i10, i11, i12, j10, i13);
            }
            this.f102691a = b.QueueIn;
        } catch (Throwable th2) {
            int i14 = 0;
            if (th2 instanceof MediaCodec.CodecException) {
                i14 = 50001;
            } else if (th2 instanceof IllegalStateException) {
                i14 = 50000;
            } else if (th2 instanceof MediaCodec.CryptoException) {
                i14 = 50002;
            }
            a(i14, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void a(int i10, boolean z10) {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        String str = null;
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            str = this + ", releaseOutputBuffer render:" + z10;
            com.tencent.thumbplayer.tcmedia.g.h.b.a(this.f102699j, str);
        }
        try {
            this.f102701l.remove(Integer.valueOf(i10));
            this.f102705p.releaseOutputBuffer(i10, z10);
        } catch (Throwable th2) {
            if (this.f102707r != a.Flushed) {
                com.tencent.thumbplayer.tcmedia.g.h.b.a(this.f102699j, this + ", releaseOutputBuffer failed, ignore e:", th2);
            }
            int i11 = 0;
            if (th2 instanceof MediaCodec.CodecException) {
                i11 = 70002;
            } else if (th2 instanceof IllegalStateException) {
                i11 = 70001;
            }
            a(i11, str, th2);
        }
        this.f102691a = b.ReleaseOut;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore call method configure for isNotMyThread");
            return;
        }
        this.f102713x = true;
        this.f102706q = false;
        if (this.f102707r == a.Uninitialized) {
            b(mediaFormat, surface, mediaCrypto, i10);
        } else if (surface != null) {
            r();
            c(surface);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void a(Surface surface) {
        a(surface, false, false);
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void a(com.tencent.thumbplayer.tcmedia.g.a.a aVar) {
        this.f102710u = aVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public com.tencent.thumbplayer.tcmedia.g.f.a.b b(e eVar) {
        com.tencent.thumbplayer.tcmedia.g.f.a.b bVarA = a(eVar);
        this.f102712w = bVarA;
        return bVarA;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void b() {
        long id2 = Thread.currentThread().getId();
        if (this.f102702m.contains(Long.valueOf(id2))) {
            return;
        }
        this.f102709t = id2;
        this.f102702m.add(Long.valueOf(id2));
        if (this.f102702m.size() > 100) {
            this.f102702m.remove(0);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void c() {
        q();
        if (com.tencent.thumbplayer.tcmedia.g.a.c()) {
            if (this.f102707r == a.Running) {
                try {
                    e();
                } catch (IllegalStateException e10) {
                    com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, "flush failed in prepareToReUse", e10);
                }
            }
        } else if (this.f102707r != a.Flushed) {
            e();
        }
        this.f102711v = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void d() {
        a aVar = this.f102707r;
        a aVar2 = a.Configured;
        if (aVar != aVar2) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, "start ignore:" + this.f102707r);
            return;
        }
        String str = null;
        try {
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                str = this + ", start state:" + this.f102707r;
                com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, str);
            }
            if (this.f102707r == aVar2) {
                this.f102705p.start();
                this.f102707r = a.Running;
            }
        } catch (Throwable th2) {
            int i10 = 0;
            if (th2 instanceof MediaCodec.CodecException) {
                i10 = PushConsts.SETTAG_ERROR_COUNT;
            } else if (th2 instanceof IllegalStateException) {
                i10 = 20000;
            }
            a(i10, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void e() {
        if (n()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "call method flush for isNotMyThread...");
        }
        String str = null;
        try {
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                str = this + ", flush state:" + this.f102707r;
                com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, str);
            }
            this.f102705p.flush();
            this.f102707r = a.Flushed;
        } catch (Throwable th2) {
            int i10 = 0;
            if (th2 instanceof MediaCodec.CodecException) {
                i10 = PushConsts.MIN_FEEDBACK_ACTION;
            } else if (th2 instanceof IllegalStateException) {
                i10 = 90000;
            }
            a(i10, str, th2);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void f() {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, this + ", stop");
        }
        if (j()) {
            return;
        }
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, this + ", codec real stop");
        }
        try {
            this.f102705p.stop();
            this.f102707r = a.Uninitialized;
        } catch (IllegalStateException e10) {
            this.f102707r = a.Uninitialized;
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, "stop failed", e10);
            throw e10;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.g.b.c
    public void g() {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, this + " call release mHoldBufferOutIndex:" + this.f102701l + " mReleaseCalled:" + this.f102706q + " stack:" + Log.getStackTraceString(new Throwable()));
        }
        this.f102706q = true;
        this.f102713x = false;
        if (j()) {
            try {
                e();
            } catch (IllegalStateException e10) {
                com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, "flush failed for not in the Executing state.", e10);
            }
            o();
            com.tencent.thumbplayer.tcmedia.g.a.a().b(this);
            return;
        }
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "Don't not keep the codec, release it ..., mErrorHappened:" + this.f102714y);
        }
        com.tencent.thumbplayer.tcmedia.g.a.a().a(this);
        i();
        this.f102707r = a.Released;
    }

    public final com.tencent.thumbplayer.tcmedia.g.a.a h() {
        return this.f102710u;
    }

    public final void i() {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b(this.f102699j, this + ", recycle isRecycled:" + this.f102692b + "  mSurfaceMap.size:" + f102690i.size() + "...... stack:" + Log.getStackTraceString(new Throwable()));
        }
        if (this.f102692b) {
            com.tencent.thumbplayer.tcmedia.g.h.b.d(this.f102699j, "ignore recycle for has isRecycled is true.");
            return;
        }
        this.f102713x = false;
        this.f102692b = true;
        com.tencent.thumbplayer.tcmedia.g.h.d.a(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        f.this.f102705p.stop();
                        f.this.f102705p.release();
                    } catch (Throwable th2) {
                        f.this.f102705p.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    com.tencent.thumbplayer.tcmedia.g.h.b.a(f.this.f102699j, "recycle codec ignore error,", th3);
                }
                if (f.this.f102710u != null) {
                    f.this.f102710u.onRealRelease();
                }
            }
        });
        this.f102707r = a.Uninitialized;
    }

    public boolean j() {
        if (com.tencent.thumbplayer.tcmedia.g.a.c()) {
            return !this.f102714y && com.tencent.thumbplayer.tcmedia.g.a.a().e() && com.tencent.thumbplayer.tcmedia.g.a.a().f();
        }
        return !this.f102714y && com.tencent.thumbplayer.tcmedia.g.a.a().e();
    }

    public void k() {
        this.A++;
    }

    public boolean l() {
        return this.A >= 3;
    }

    public String m() {
        return this.f102698h;
    }

    public String toString() {
        return super.toString() + " mReleaseCalled:" + this.f102706q + " isRecycled:" + this.f102692b;
    }
}
