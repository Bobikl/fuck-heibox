package com.tencent.thumbplayer.tcmedia.adapter.a.a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.TimedText;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.bytertc.engine.type.ErrorCode;
import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.thumbplayer.tcmedia.adapter.a.b {
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.l A;
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.m B;
    private volatile MediaPlayer C;
    private d D;
    private com.tencent.thumbplayer.tcmedia.a.c E;
    private Object F;
    private a J;
    private volatile EnumC1011e Q;
    private volatile EnumC1011e R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.a f102194a;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a.a f102200af;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f102204b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f102208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FileDescriptor f102209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f102210h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f102214l;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.i f102223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c f102224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.h f102225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.f f102226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.j f102227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.c.p f102228z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102205c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102206d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f102207e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f102211i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f102212j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f102213k = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102215m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f102216n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f102217o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f102218p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f102219q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f102220r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TPAudioAttributes f102221s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f102222t = true;
    private Future<?> G = null;
    private final Object H = new Object();
    private long I = 25000;
    private final Object K = new Object();
    private int L = 3;
    private int M = 30;
    private final Object N = new Object();
    private Future<?> O = null;
    private boolean P = false;
    private boolean S = false;
    private long T = 0;
    private long U = -1;
    private int V = 0;
    private int W = 0;
    private volatile boolean X = false;
    private int Y = 0;
    private int Z = -1;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private int f102195aa = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f102196ab = -1;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private int f102197ac = -1;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private List<b> f102198ad = new ArrayList();

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private List<b> f102199ae = new ArrayList();

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private long f102201ag = 0;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private f f102202ah = null;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private MediaPlayer.OnTimedTextListener f102203ai = new MediaPlayer.OnTimedTextListener() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.8
        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            if (e.this.A != null) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = timedText != null ? timedText.getText() : "";
                tPSubtitleData.trackIndex = e.this.Z;
                tPSubtitleData.startPositionMs = e.this.o();
                e.this.A.a(tPSubtitleData);
            }
        }
    };

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f102238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Future<?> f102239b;

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TPTrackInfo f102240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<TPOptionalParam> f102242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String> f102243d;

        private b() {
            this.f102241b = "";
        }
    }

    public static class c implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f102244a;

        c(Handler handler) {
            this.f102244a = handler;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                this.f102244a.handleMessage(message);
                return true;
            } catch (Exception e10) {
                TPLogUtil.e("TPSystemMediaPlayer", "mediaPlayerExceptionHook, HookCallback, " + Log.getStackTraceString(e10));
                return true;
            }
        }
    }

    public class d implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private d() {
        }

        private int a(int i10) {
            return e.this.f102220r > 0 ? e.this.f102220r : i10;
        }

        private int b(int i10) {
            return e.this.f102219q > 0 ? e.this.f102219q : i10;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (e.this.f102217o) {
                e.this.f102194a.d("onCompletion, unknown err.");
                return;
            }
            e.this.f102194a.c("onCompletion.");
            e.this.R = EnumC1011e.COMPLETE;
            e.this.C();
            com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c = e.this.f102224v;
            if (interfaceC1013c != null) {
                interfaceC1013c.b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007f  */
        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            int i12;
            if (e.this.Q != EnumC1011e.COMPLETE && e.this.Q != EnumC1011e.STOPPED && e.this.Q != EnumC1011e.RELEASE && e.this.Q != EnumC1011e.IDLE) {
                EnumC1011e enumC1011e = e.this.Q;
                EnumC1011e enumC1011e2 = EnumC1011e.ERROR;
                if (enumC1011e != enumC1011e2) {
                    e.this.f102194a.c("onError, what: " + i10 + ", extra: " + i11);
                    e.this.A();
                    e.this.C();
                    e.this.Q = enumC1011e2;
                    if (i11 == -1010 || i11 == -1007) {
                        i12 = 2000;
                    } else if (i11 != -110) {
                        switch (i11) {
                            case ErrorCode.ERROR_CODE_APP_ID_NULL /* -1005 */:
                            case -1004:
                            case -1003:
                                i12 = 2001;
                                break;
                            default:
                                if (i10 != 1 && i10 == 100) {
                                    i12 = 2001;
                                } else {
                                    i12 = 2000;
                                }
                                break;
                        }
                    } else {
                        i12 = 2001;
                    }
                    e.this.e();
                    com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar = e.this.f102226x;
                    if (fVar != null) {
                        fVar.a(i12, e.g(i10), i11, 0L);
                    }
                    return true;
                }
            }
            e.this.f102194a.c("onError, illegal state:" + e.this.Q + ", what:" + i10 + ", extra:" + i11);
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            int i12;
            e.this.f102194a.c("mediaplayer, onInfo. what:" + i10 + ", extra:" + i11);
            if (i10 != 3) {
                if (i10 == 801) {
                    e.this.P = true;
                } else if (i10 == 701) {
                    i12 = 200;
                } else if (i10 == 702) {
                    i12 = 201;
                }
                i12 = -1;
            } else {
                i12 = 106;
            }
            if (i12 != -1) {
                if (200 == i12 || 201 == i12) {
                    if (!e.this.G()) {
                        e eVar = e.this;
                        if (200 == i12) {
                            eVar.X = true;
                            e.this.E();
                        } else {
                            eVar.X = false;
                            e.this.F();
                        }
                        if (e.this.f102225w != null) {
                            e.this.f102225w.a(i12, 0L, 0L, null);
                        }
                    }
                } else if (e.this.f102225w != null) {
                    e.this.f102225w.a(106, 0L, 0L, null);
                }
            }
            if (i12 == 106) {
                int iA = a(mediaPlayer.getVideoWidth());
                int iB = b(mediaPlayer.getVideoHeight());
                if ((iB != e.this.W || iA != e.this.V) && iB > 0 && iA > 0) {
                    e.this.W = iB;
                    e.this.V = iA;
                    if (e.this.f102228z != null) {
                        e.this.f102228z.a(e.this.V, e.this.W);
                    }
                }
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (e.this.Q != EnumC1011e.PREPARING) {
                e.this.f102194a.c("onPrepared() is called in a wrong situation, mState = " + e.this.Q);
                return;
            }
            e.this.R = EnumC1011e.PREPARED;
            long duration = e.this.C.getDuration();
            if (duration <= 0) {
                e.this.P = true;
            }
            e.this.f102194a.c("onPrepared() , mStartPositionMs=" + e.this.f102215m + ", duration:" + duration + ", mIsLive:" + e.this.f102217o);
            e.this.A();
            e.this.w();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (e.this.C == null) {
                return;
            }
            e.this.f102194a.c("onSeekComplete().");
            EnumC1011e enumC1011e = e.this.Q;
            EnumC1011e enumC1011e2 = EnumC1011e.STARTED;
            if (enumC1011e == enumC1011e2 && e.this.R == EnumC1011e.COMPLETE) {
                e.this.Q = enumC1011e2;
                e.this.R = enumC1011e2;
                e.this.C.start();
            }
            if (EnumC1011e.PREPARED == e.this.Q || e.this.f102227y == null) {
                return;
            }
            e.this.f102227y.c();
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            if (i10 == 0 || i11 == 0) {
                e.this.f102194a.e("onVideoSizeChanged() size error, width:" + i10 + " height:" + i11);
                return;
            }
            int iA = a(i10);
            int iB = b(i11);
            try {
                if ((iA != e.this.V || iB != e.this.W) && iB > 0 && iA > 0) {
                    e.this.f102228z.a(iA, iB);
                }
            } catch (Exception e10) {
                e.this.f102194a.d(e10.toString());
            }
            e.this.V = iA;
            e.this.W = iB;
            e.this.f102194a.c("onVideoSizeChanged(), width:" + iA + " height:" + iB);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.e$e, reason: collision with other inner class name */
    public enum EnumC1011e {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR,
        RELEASE
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f102258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f102259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f102260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f102262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f102263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        EnumC1011e f102264h;

        private f() {
        }
    }

    public e(Context context, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102194a = new com.tencent.thumbplayer.tcmedia.e.a(bVar, "TPSystemMediaPlayer");
        this.f102204b = context;
        this.D = new d();
        b bVar2 = new b();
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        bVar2.f102240a = tPTrackInfo;
        tPTrackInfo.isSelected = true;
        tPTrackInfo.name = "audio_1";
        this.f102198ad.add(bVar2);
        b();
        com.tencent.thumbplayer.tcmedia.adapter.a.a.c cVar = new com.tencent.thumbplayer.tcmedia.adapter.a.a.c();
        this.f102200af = cVar;
        cVar.a(new com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.1
            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a
            public void a(com.tencent.thumbplayer.tcmedia.adapter.a.a.a.e eVar) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = eVar.f102157a;
                com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar = e.this.A;
                if (lVar != null) {
                    lVar.a(tPSubtitleData);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a
            public void a(TPSubtitleFrame tPSubtitleFrame) {
                TPSubtitleFrameBuffer tPSubtitleFrameBufferA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPSubtitleFrame);
                com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar = e.this.B;
                if (mVar != null) {
                    mVar.a(tPSubtitleFrameBufferA);
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a
            public void a(String str) {
                e.this.f102194a.c("onSubtitleNote, ".concat(String.valueOf(str)));
                com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = e.this.f102225w;
                if (hVar != null) {
                    hVar.a(506, 0L, 0L, str);
                }
            }
        });
        this.f102200af.a(new com.tencent.thumbplayer.tcmedia.adapter.a.a.a.d() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.2
            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.d
            public long a() {
                if (e.this.Q == EnumC1011e.PAUSED || e.this.Q == EnumC1011e.STARTED) {
                    return e.this.o();
                }
                return -1L;
            }
        });
        this.f102200af.a(new com.tencent.thumbplayer.tcmedia.adapter.a.a.a.c() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.3
            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.c
            public void a(int i10, long j10) {
                if (e.this.f102225w != null) {
                    e.this.f102225w.a(4, 2000L, e.g(i10), Long.valueOf(j10));
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.c
            public void a(long j10) {
                if (e.this.Q == EnumC1011e.STARTED) {
                    e.this.f102200af.b();
                }
                if (e.this.f102225w != null) {
                    e.this.f102225w.a(4, 1000L, 0L, Long.valueOf(j10));
                }
            }
        });
        this.f102200af.a(new com.tencent.thumbplayer.tcmedia.adapter.a.a.a.b() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.4
            @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a.b
            public void a(int i10, int i11) {
                if (e.this.f102225w != null) {
                    e.this.f102225w.a(254, i10, i11, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A() {
        synchronized (this.H) {
            Future<?> future = this.G;
            if (future != null) {
                future.cancel(true);
                this.G = null;
            }
        }
    }

    private void B() {
        synchronized (this.K) {
            if (!G()) {
                this.f102194a.c("startCheckBufferingTimer, forbidden check buffer by position");
                return;
            }
            if (this.J == null) {
                final a aVar = new a();
                this.J = aVar;
                aVar.f102238a = false;
                aVar.f102239b = o.a().e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.6
                    @Override // java.lang.Runnable
                    public void run() {
                        while (!aVar.f102238a) {
                            e.this.D();
                            try {
                                Thread.sleep(400L);
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C() {
        synchronized (this.K) {
            a aVar = this.J;
            if (aVar != null) {
                aVar.f102238a = true;
                Future<?> future = aVar.f102239b;
                if (future != null) {
                    future.cancel(true);
                }
                this.J.f102239b = null;
                this.J = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        long jO = o();
        long j10 = this.U;
        this.U = jO;
        if (this.Q != EnumC1011e.STARTED) {
            if (this.Q == EnumC1011e.PAUSED && this.X) {
                this.f102194a.c("checkBuffingEvent, pause state and send end buffering");
                this.X = false;
                this.Y = 0;
                com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = this.f102225w;
                if (hVar != null) {
                    hVar.a(201, 0L, 0L, null);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f102205c) {
            long j11 = this.f102207e;
            if (j11 > 0 && jO >= j11 && !this.P) {
                this.f102194a.c("checkBuffingEvent, loopback skip end, curPosition:" + jO + ", mLoopStartPositionMs:" + this.f102206d);
                this.C.seekTo((int) this.f102206d);
            }
        } else if (this.f102216n > 0 && jO >= n() - this.f102216n) {
            this.f102194a.c("checkBuffingEvent, skip end, mBaseDuration: " + this.T + ", curPosition:" + jO + ", mSkipEndMilsec:" + this.f102216n);
            this.Q = EnumC1011e.COMPLETE;
            e();
            C();
            com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c = this.f102224v;
            if (interfaceC1013c != null) {
                interfaceC1013c.b();
                return;
            }
            return;
        }
        if (jO != j10) {
            this.f102201ag++;
        }
        if (jO != j10 || jO <= 0) {
            if (this.X) {
                this.f102194a.c("checkBuffingEvent, position change, send end buffering");
                com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar2 = this.f102225w;
                if (hVar2 != null) {
                    hVar2.a(201, jO, this.T, Long.valueOf(this.f102201ag));
                }
            }
            this.X = false;
            this.Y = 0;
            return;
        }
        int i10 = this.Y + 1;
        this.Y = i10;
        if (i10 >= this.L && !this.X) {
            this.X = true;
            this.f102194a.c("checkBuffingEvent, position no change,send start buffering");
            com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar3 = this.f102225w;
            if (hVar3 != null) {
                hVar3.a(200, jO, this.T, Long.valueOf(this.f102201ag));
            }
        }
        if (this.Y >= this.M) {
            this.f102194a.e("checkBuffingEvent post error");
            this.Q = EnumC1011e.ERROR;
            e();
            this.X = false;
            C();
            com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar = this.f102226x;
            if (fVar != null) {
                fVar.a(2001, g(com.ss.android.ttvecamera.o.f97689n), 0L, 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        synchronized (this.N) {
            if (this.O == null) {
                this.O = o.a().e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (e.this.Q == EnumC1011e.PAUSED || !e.this.X) {
                            return;
                        }
                        e.this.f102194a.e("startCheckBufferTimeOutByInfo, buffer last too long");
                        e.this.Q = EnumC1011e.ERROR;
                        e.this.e();
                        e.this.X = false;
                        e.this.F();
                        com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar = e.this.f102226x;
                        if (fVar != null) {
                            fVar.a(2001, e.g(com.ss.android.ttvecamera.o.f97689n), 0L, 0L);
                        }
                    }
                }, this.M * 400, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void F() {
        synchronized (this.N) {
            Future<?> future = this.O;
            if (future != null) {
                future.cancel(true);
                this.O = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        if (this.f102217o) {
            return false;
        }
        return this.f102222t;
    }

    private MediaPlayer a() {
        com.tencent.thumbplayer.tcmedia.adapter.a.a.b bVar = new com.tencent.thumbplayer.tcmedia.adapter.a.a.b();
        bVar.setOnPreparedListener(this.D);
        bVar.setOnCompletionListener(this.D);
        bVar.setOnErrorListener(this.D);
        bVar.setOnInfoListener(this.D);
        bVar.setOnBufferingUpdateListener(this.D);
        bVar.setOnSeekCompleteListener(this.D);
        bVar.setOnVideoSizeChangedListener(this.D);
        bVar.setOnTimedTextListener(this.f102203ai);
        return bVar;
    }

    private void a(MediaPlayer mediaPlayer) {
        try {
            Field declaredField = MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(mediaPlayer);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            if (((Handler.Callback) declaredField2.get(handler)) == null) {
                declaredField2.set(handler, new c(handler));
            }
        } catch (Exception e10) {
            this.f102194a.e("mediaPlayerExceptionHook, " + Log.getStackTraceString(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    private void a(MediaPlayer mediaPlayer, int i10, @TPCommonEnum.TPSeekMode int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            this.f102194a.c("os ver is too low, current sdk int:" + i12 + ", is less than 26, use seekTo(int positionMs) instead");
            mediaPlayer.seekTo(i10);
            return;
        }
        int i13 = 2;
        if (i11 == 1) {
            i13 = 0;
        } else if (i11 == 2) {
            i13 = 1;
        } else if (i11 != 3) {
            i13 = 0;
        }
        try {
            mediaPlayer.seekTo(i10, i13);
        } catch (Exception e10) {
            this.f102194a.a(e10);
            try {
                if (this.R == EnumC1011e.COMPLETE) {
                    this.Q = EnumC1011e.STARTED;
                }
                mediaPlayer.seekTo(i10);
            } catch (Exception e11) {
                this.f102194a.a(e11);
            }
        }
    }

    private synchronized void a(f fVar) {
        int i10;
        String str = fVar.f102263g;
        fVar.f102259c = o();
        fVar.f102264h = this.Q;
        fVar.f102261e = this.f102197ac;
        fVar.f102262f = this.Z;
        this.f102194a.c("playerResetStart, pos:" + fVar.f102259c + ", state:" + fVar.f102264h);
        this.S = true;
        f();
        this.R = EnumC1011e.IDLE;
        if (this.f102209g != null) {
            this.C.setDataSource(this.f102209g);
        } else {
            AssetFileDescriptor assetFileDescriptor = this.f102210h;
            if (assetFileDescriptor != null) {
                b(assetFileDescriptor);
            } else {
                e(fVar.f102260d);
                Map<String, String> map = this.f102214l;
                if (map == null || map.isEmpty()) {
                    this.C.setDataSource(str);
                } else {
                    this.C.setDataSource(this.f102204b, Uri.parse(str), this.f102214l);
                }
            }
        }
        this.R = EnumC1011e.INITIALIZED;
        Object obj = this.F;
        if (obj == null) {
            this.C.setDisplay(null);
        } else if (obj instanceof SurfaceHolder) {
            this.C.setDisplay((SurfaceHolder) this.F);
        } else if (obj instanceof Surface) {
            this.C.setSurface((Surface) this.F);
        }
        f fVar2 = this.f102202ah;
        if (fVar2 != null && (i10 = fVar2.f102257a) != fVar.f102257a) {
            com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = this.f102225w;
            int i11 = i10 == 1 ? 3 : 4;
            if (hVar != null) {
                hVar.a(i11, fVar2.f102258b, 0L, null);
            }
            fVar.f102264h = fVar2.f102264h;
            fVar.f102259c = fVar2.f102259c;
        }
        this.f102202ah = fVar;
        EnumC1011e enumC1011e = fVar.f102264h;
        if (enumC1011e == EnumC1011e.PREPARING || enumC1011e == EnumC1011e.PREPARED || enumC1011e == EnumC1011e.STARTED || enumC1011e == EnumC1011e.PAUSED) {
            h();
        }
    }

    private void a(TPAudioAttributes tPAudioAttributes) {
        if (tPAudioAttributes == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        this.C.setAudioAttributes(this.f102221s.toAndroidMediaAudioAttributes());
        this.f102194a.c("set audio attributes into MediaPlayer, API:" + i10 + ">=21, " + this.f102221s.toString());
    }

    private boolean a(EnumC1011e enumC1011e) {
        return enumC1011e == EnumC1011e.PREPARED || enumC1011e == EnumC1011e.STARTED || enumC1011e == EnumC1011e.PAUSED;
    }

    private void b() {
        this.C = a();
        EnumC1011e enumC1011e = EnumC1011e.IDLE;
        this.Q = enumC1011e;
        this.R = enumC1011e;
    }

    private void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            this.C.setDataSource(assetFileDescriptor);
        } else {
            this.C.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    private boolean b(EnumC1011e enumC1011e) {
        return enumC1011e != EnumC1011e.RELEASE;
    }

    private void c() {
        if (a(this.R)) {
            this.R = EnumC1011e.STOPPED;
            this.f102194a.c("MediaPlayer stop.");
            this.C.stop();
        }
    }

    private void d() {
        if (b(this.R)) {
            this.R = EnumC1011e.RELEASE;
            this.f102194a.c("MediaPlayer release.");
            this.C.release();
        }
    }

    private void d(int i10, long j10) {
        f fVar = new f();
        fVar.f102258b = j10;
        fVar.f102260d = i10;
        fVar.f102257a = 2;
        fVar.f102263g = this.f102208f;
        a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        y();
        c();
        d();
    }

    private void e(int i10) {
        if (i10 <= 0) {
            return;
        }
        b bVar = this.f102198ad.get(i10);
        com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = this.f102225w;
        if (hVar != null) {
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
            tPAudioTrackInfo.audioTrackUrl = bVar.f102241b;
            tPAudioTrackInfo.paramData = bVar.f102242c;
            this.f102194a.c("handleDataSource, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            hVar.a(1011, 0L, 0L, tPAudioTrackInfo);
        }
    }

    private void e(int i10, long j10) {
        this.f102200af.e();
        b bVar = this.f102199ae.get(i10);
        this.f102200af.a(bVar.f102241b, bVar.f102243d, j10);
        this.f102200af.a();
    }

    private int f(int i10) {
        if (2 == i10) {
            return 2;
        }
        if (1 == i10) {
            return 1;
        }
        return 4 == i10 ? 3 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    private void f() {
        MediaPlayer mediaPlayer;
        float f10;
        float f11;
        A();
        C();
        F();
        e();
        this.C = new com.tencent.thumbplayer.tcmedia.adapter.a.a.b();
        this.C.setOnPreparedListener(this.D);
        this.C.setOnCompletionListener(this.D);
        this.C.setOnErrorListener(this.D);
        this.C.setOnInfoListener(this.D);
        this.C.setOnBufferingUpdateListener(this.D);
        this.C.setOnSeekCompleteListener(this.D);
        this.C.setOnVideoSizeChangedListener(this.D);
        this.C.setOnTimedTextListener(this.f102203ai);
        if (!this.f102211i) {
            if (this.f102212j != 1.0f) {
                mediaPlayer = this.C;
                f10 = this.f102212j;
            }
            f11 = this.f102213k;
            if (f11 != 1.0d) {
                b(f11);
            }
            if (this.f102205c) {
                this.C.setLooping(this.f102205c);
            }
        }
        mediaPlayer = this.C;
        f10 = 0.0f;
        mediaPlayer.setVolume(f10, f10);
        f11 = this.f102213k;
        if (f11 != 1.0d) {
            b(f11);
        }
        if (this.f102205c) {
            this.C.setLooping(this.f102205c);
        }
    }

    private void f(int i10, long j10) {
        this.f102194a.c("deselectSubTrack, trackIndex:" + i10 + ", opaque:" + j10);
        this.f102200af.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(int i10) {
        long j10 = i10;
        long j11 = i10 < 0 ? 10000000 - j10 : 10000000 + j10;
        if (j11 >= 2147483647L) {
            j11 = 2147483647L;
        }
        return (int) j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        f fVar = this.f102202ah;
        this.f102194a.c("playerResetEnd, actionInfo:" + fVar + ", mSuspend:" + this.S);
        if (fVar == null || !this.S) {
            if (this.f102215m > 0 && !this.P) {
                this.f102194a.c("onPrepared(), and seekto:" + this.f102215m);
                try {
                    this.C.seekTo(this.f102215m);
                } catch (Exception e10) {
                    this.f102194a.a(e10);
                }
            }
            this.Q = EnumC1011e.PREPARED;
            com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar = this.f102223u;
            if (iVar != null) {
                iVar.a();
            }
            return;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = this.f102225w;
        int i10 = fVar.f102257a == 1 ? 3 : 4;
        if (hVar != null) {
            hVar.a(i10, 1000L, 0L, Long.valueOf(fVar.f102258b));
        }
        if (fVar.f102261e > 0) {
            this.C.selectTrack(fVar.f102261e);
        }
        if (fVar.f102262f > 0) {
            this.C.selectTrack(fVar.f102262f);
        }
        if (fVar.f102259c > 0 && !this.P) {
            this.f102194a.c("playerResetEnd, onPrepared(), and seek to:" + fVar.f102259c);
            try {
                this.C.seekTo((int) fVar.f102259c);
            } catch (Exception e11) {
                this.f102194a.a(e11);
            }
        }
        this.f102194a.c("playerResetEnd, restore state:" + fVar.f102264h);
        EnumC1011e enumC1011e = fVar.f102264h;
        if (enumC1011e == EnumC1011e.IDLE || enumC1011e == EnumC1011e.INITIALIZED || enumC1011e == EnumC1011e.PREPARING) {
            this.Q = EnumC1011e.PREPARED;
            com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar2 = this.f102223u;
            if (iVar2 != null) {
                iVar2.a();
            }
        } else if (enumC1011e == EnumC1011e.PREPARED || enumC1011e == EnumC1011e.PAUSED) {
            this.Q = enumC1011e;
        } else {
            EnumC1011e enumC1011e2 = EnumC1011e.STARTED;
            if (enumC1011e == enumC1011e2) {
                this.f102194a.c("playerResetEnd,  MediaPlayer.start().");
                this.C.start();
                this.Q = fVar.f102264h;
                this.R = enumC1011e2;
                B();
            } else {
                this.f102194a.e("illegal state, state:" + fVar.f102264h);
                this.Q = EnumC1011e.ERROR;
                e();
                com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar2 = this.f102226x;
                if (fVar2 != null) {
                    fVar2.a(2000, g(-10004), 0L, 0L);
                }
            }
        }
        this.S = false;
        this.f102202ah = null;
        return;
        throw th;
    }

    private void x() {
        a(this.f102221s);
    }

    private void y() {
        this.C.setOnPreparedListener(null);
        this.C.setOnCompletionListener(null);
        this.C.setOnErrorListener(null);
        this.C.setOnInfoListener(null);
        this.C.setOnBufferingUpdateListener(null);
        this.C.setOnSeekCompleteListener(null);
        this.C.setOnVideoSizeChangedListener(null);
    }

    private void z() {
        this.f102194a.c("startCheckPrepareTimeoutTimer");
        synchronized (this.H) {
            if (this.G == null) {
                this.G = o.a().e().schedule(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.e.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (e.this.Q == EnumC1011e.PREPARING) {
                            e.this.f102194a.e("startCheckPrepareTimeoutTimer, post error");
                            e.this.Q = EnumC1011e.ERROR;
                            e.this.e();
                            e.this.A();
                            com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar = e.this.f102226x;
                            if (fVar != null) {
                                fVar.a(2001, e.g(com.ss.android.ttvecamera.o.f97689n), 0L, 0L);
                            }
                        }
                    }
                }, this.I, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(float f10) {
        this.f102194a.c("setAudioGainRatio, : ".concat(String.valueOf(f10)));
        this.f102212j = f10;
        try {
            if (this.C != null) {
                MediaPlayer mediaPlayer = this.C;
                float f11 = this.f102212j;
                mediaPlayer.setVolume(f11, f11);
            }
        } catch (IllegalStateException e10) {
            this.f102194a.c("setAudioGainRatio ex : " + e10.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10) {
        this.f102194a.c("seekTo, position: ".concat(String.valueOf(i10)));
        if (this.P) {
            this.f102194a.c("current media is not seekable, ignore");
            return;
        }
        if (!this.S) {
            if (this.R == EnumC1011e.COMPLETE) {
                this.Q = EnumC1011e.STARTED;
            }
            this.C.seekTo(i10);
        } else {
            f fVar = this.f102202ah;
            if (fVar != null) {
                fVar.f102259c = i10;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, @TPCommonEnum.TPSeekMode int i11) {
        this.f102194a.c("seekTo, position: " + i10 + ", mode: " + i11);
        if (this.P) {
            this.f102194a.c("current media is not seekable, ignore");
            return;
        }
        if (!this.S) {
            a(this.C, i10, i11);
            return;
        }
        f fVar = this.f102202ah;
        if (fVar != null) {
            fVar.f102259c = i10;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, long j10) {
        this.f102194a.c("selectTrack, trackID:" + i10 + ", opaque:" + j10);
        int size = this.f102198ad.size();
        int size2 = this.f102199ae.size();
        this.f102198ad.size();
        com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar = this.f102225w;
        if (i10 >= 0 && i10 < size) {
            try {
                d(i10, j10);
                this.f102198ad.get(this.f102195aa).f102240a.isSelected = false;
                this.f102198ad.get(i10).f102240a.isSelected = true;
                this.f102195aa = i10;
                return;
            } catch (Exception e10) {
                this.f102194a.a(e10);
                if (hVar != null) {
                    hVar.a(4, 2000L, g(-10000), Long.valueOf(j10));
                    return;
                }
                return;
            }
        }
        if (i10 >= size && i10 < size + size2) {
            int i11 = i10 - size;
            try {
                e(i11, j10);
            } catch (Exception e11) {
                this.f102194a.a(e11);
                if (hVar != null) {
                    hVar.a(4, 2000L, g(-10000), Long.valueOf(j10));
                }
            }
            int i12 = this.f102196ab;
            if (i12 >= 0 && i12 < size2) {
                this.f102199ae.get(i12).f102240a.isSelected = false;
            }
            this.f102199ae.get(i11).f102240a.isSelected = true;
            this.f102196ab = i10;
            return;
        }
        int i13 = i10 - (size + size2);
        if (this.Q != EnumC1011e.PREPARED && this.Q != EnumC1011e.STARTED && this.Q != EnumC1011e.PAUSED) {
            this.f102194a.e("selectTrack, illegal state:" + this.Q);
            return;
        }
        MediaPlayer.TrackInfo[] trackInfo = null;
        try {
            trackInfo = this.C.getTrackInfo();
        } catch (Exception unused) {
            this.f102194a.e("getTrackInfo, android getTrackInfo crash");
        }
        if (trackInfo == null || trackInfo.length <= i13) {
            if (hVar != null) {
                hVar.a(4, 2000L, g(-10002), Long.valueOf(j10));
                return;
            }
            return;
        }
        MediaPlayer.TrackInfo trackInfo2 = trackInfo[i13];
        if (trackInfo2.getTrackType() == 2) {
            this.f102197ac = i13;
        } else {
            if (trackInfo2.getTrackType() != 4) {
                if (hVar != null) {
                    hVar.a(4, 2000L, g(-10003), Long.valueOf(j10));
                    return;
                }
                return;
            }
            this.Z = i13;
        }
        this.C.selectTrack(i13);
        if (hVar != null) {
            hVar.a(4, 1000L, 0L, Long.valueOf(j10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor == null) {
            this.f102194a.c("setDataSource afd is null ");
            throw new IllegalArgumentException("afd is null");
        }
        this.f102194a.c("setDataSource afd， afd: " + assetFileDescriptor.toString());
        this.f102210h = assetFileDescriptor;
        b(assetFileDescriptor);
        this.E = new com.tencent.thumbplayer.tcmedia.a.c(assetFileDescriptor);
        EnumC1011e enumC1011e = EnumC1011e.INITIALIZED;
        this.Q = enumC1011e;
        this.R = enumC1011e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor == null) {
            this.f102194a.c("setDataSource pfd is null ");
            throw new IllegalArgumentException("pfd is null");
        }
        this.f102194a.c("setDataSource pfd， pfd: " + parcelFileDescriptor.toString());
        this.f102209g = parcelFileDescriptor.getFileDescriptor();
        this.C.setDataSource(parcelFileDescriptor.getFileDescriptor());
        this.E = new com.tencent.thumbplayer.tcmedia.a.c(parcelFileDescriptor.getFileDescriptor());
        EnumC1011e enumC1011e = EnumC1011e.INITIALIZED;
        this.Q = enumC1011e;
        this.R = enumC1011e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(Surface surface) {
        this.f102194a.c("setSurface, surface: ".concat(String.valueOf(surface)));
        this.F = surface;
        this.C.setSurface(surface);
        this.f102194a.c("setSurface over, surface: ".concat(String.valueOf(surface)));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(SurfaceHolder surfaceHolder) {
        this.f102194a.c("setSurfaceHolder, sh: ".concat(String.valueOf(surfaceHolder)));
        this.F = surfaceHolder;
        this.C.setDisplay(surfaceHolder);
        this.f102194a.c("setSurfaceHolder over, sh: ".concat(String.valueOf(surfaceHolder)));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.a aVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.b bVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c) {
        this.f102224v = interfaceC1013c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.d dVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.e eVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar) {
        this.f102226x = fVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.g gVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar) {
        this.f102225w = hVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar) {
        this.f102223u = iVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.j jVar) {
        this.f102227y = jVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar) {
        this.A = lVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar) {
        this.B = mVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.n nVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.o oVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.p pVar) {
        this.f102228z = pVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        if (this.E == null) {
            tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
            return;
        }
        TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        this.E.a(o(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
        int key = tPOptionalParam.getKey();
        if (key == 1) {
            this.f102218p = tPOptionalParam.getParamLong().value;
            return;
        }
        if (key == 2) {
            this.f102220r = (int) tPOptionalParam.getParamLong().value;
            this.f102194a.c("setPlayerOptionalParam, video width:" + this.f102220r);
            return;
        }
        if (key == 3) {
            this.f102219q = (int) tPOptionalParam.getParamLong().value;
            this.f102194a.c("setPlayerOptionalParam, video height:" + this.f102219q);
            return;
        }
        if (key == 4) {
            this.f102217o = tPOptionalParam.getParamBoolean().value;
            this.P = true;
            this.f102194a.c("setPlayerOptionalParam, is live:" + this.f102217o);
            return;
        }
        if (key == 5) {
            this.f102222t = tPOptionalParam.getParamBoolean().value;
            return;
        }
        if (key == 7) {
            this.L = (int) (tPOptionalParam.getParamLong().value / 400);
            this.f102194a.c("setPlayerOptionalParam, on buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 100) {
            this.f102215m = (int) tPOptionalParam.getParamLong().value;
            this.f102194a.c("setPlayerOptionalParam, start position:" + this.f102215m);
            return;
        }
        if (key == 107) {
            this.M = (int) ((tPOptionalParam.getParamLong().value + 400) / 400);
            this.f102194a.c("setPlayerOptionalParam, buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 128) {
            this.I = tPOptionalParam.getParamLong().value;
            this.f102194a.c("setPlayerOptionalParam, prepare timeout:" + this.I + "(ms)");
            return;
        }
        if (key == 414) {
            this.f102221s = (TPAudioAttributes) tPOptionalParam.getParamObject().objectValue;
            this.f102194a.c("setPlayerOptionalParam, " + this.f102221s.toString());
            return;
        }
        if (key == 450) {
            int i10 = (int) tPOptionalParam.getParamLong().value;
            com.tencent.thumbplayer.tcmedia.adapter.a.a.a aVar = this.f102200af;
            if (aVar != null) {
                aVar.a(i10);
            }
            TPLogUtil.i("TPSystemMediaPlayer", "setPlayerOptionalParam, subtitle type:" + tPOptionalParam.getParamLong().value);
            return;
        }
        if (key == 500) {
            this.f102216n = tPOptionalParam.getParamLong().value;
            this.f102194a.c("setPlayerOptionalParam, skip end position:" + this.f102216n);
            return;
        }
        if (key != 507) {
            return;
        }
        TPSubtitleRenderModel tPSubtitleRenderModel = (TPSubtitleRenderModel) tPOptionalParam.getParamObject().objectValue;
        com.tencent.thumbplayer.tcmedia.adapter.a.a.a aVar2 = this.f102200af;
        if (aVar2 != null) {
            aVar2.a(tPSubtitleRenderModel);
        }
        TPLogUtil.i("TPSystemMediaPlayer", "setPlayerOptionalParam, subtitle render model");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
        throw new IllegalArgumentException("setDataSource by asset, android mediaplayer not support");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102194a.a(new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPSystemMediaPlayer"));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str) {
        this.f102194a.c("setAudioNormalizeVolumeParams not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        this.f102194a.c("switchDefinition, defUrl: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            this.f102194a.c("switchDefinition, defUrl is null");
            return;
        }
        this.f102208f = str;
        f fVar = new f();
        fVar.f102258b = j10;
        fVar.f102260d = this.f102195aa;
        fVar.f102257a = 1;
        fVar.f102263g = str;
        try {
            a(fVar);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map) throws IOException {
        this.f102194a.c("setDataSource httpHeader, url: ".concat(String.valueOf(str)));
        this.f102208f = str;
        this.f102214l = map;
        this.C.setDataSource(this.f102204b, Uri.parse(str), this.f102214l);
        this.E = new com.tencent.thumbplayer.tcmedia.a.c(str);
        EnumC1011e enumC1011e = EnumC1011e.INITIALIZED;
        this.Q = enumC1011e;
        this.R = enumC1011e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        this.f102194a.c("switchDefinition, defUrl: ".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            this.f102194a.c("switchDefinition, defUrl is null");
            return;
        }
        this.f102208f = str;
        f fVar = new f();
        fVar.f102258b = j10;
        fVar.f102260d = this.f102195aa;
        fVar.f102257a = 1;
        fVar.f102263g = str;
        try {
            a(fVar);
        } catch (Exception unused) {
            throw new IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            this.f102194a.e("addSubtitleSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str3;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 3;
        b bVar = new b();
        bVar.f102240a = tPTrackInfo;
        bVar.f102241b = str;
        bVar.f102243d = map;
        this.f102194a.c("addSubtitleSource, name:" + tPTrackInfo.name + ", url:" + str3);
        this.f102199ae.add(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f102194a.e("addAudioTrackSource, illegal argument.");
            return;
        }
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = str2;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.trackType = 2;
        b bVar = new b();
        bVar.f102240a = tPTrackInfo;
        bVar.f102241b = str;
        bVar.f102243d = map;
        bVar.f102242c = list;
        this.f102194a.c("addAudioTrackSource, name:" + tPTrackInfo.name + ", url:" + str2);
        this.f102198ad.add(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10) {
        this.f102194a.c("setOutputMute, : ".concat(String.valueOf(z10)));
        this.f102211i = z10;
        try {
            if (z10) {
                this.C.setVolume(0.0f, 0.0f);
                this.f102194a.c("setOutputMute, true");
                return;
            }
            MediaPlayer mediaPlayer = this.C;
            float f10 = this.f102212j;
            mediaPlayer.setVolume(f10, f10);
            this.f102194a.c("setOutputMute, false, mAudioGain: " + this.f102212j);
        } catch (Exception e10) {
            this.f102194a.c("setOutputMute, Exception: " + e10.toString());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10, long j10, long j11) {
        this.f102194a.c("setLoopback, : " + z10 + ", loopStart: " + j10 + ", loopEnd: " + j11);
        if (j10 >= 0) {
            long j12 = this.T;
            if (j10 <= j12 && j11 <= j12) {
                this.f102205c = z10;
                this.f102206d = j10;
                this.f102207e = j11;
                this.C.setLooping(z10);
                return;
            }
        }
        throw new IllegalArgumentException("position error, must more than 0 and less than duration");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long b(int i10) {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(float f10) {
        this.f102194a.c("setPlaySpeedRatio, : ".concat(String.valueOf(f10)));
        this.f102213k = f10;
        this.f102194a.c("setPlaySpeedRatio play speed:".concat(String.valueOf(f10)));
        try {
            PlaybackParams playbackParams = this.C.getPlaybackParams();
            if (playbackParams.getSpeed() != f10) {
                playbackParams.setSpeed(f10);
                this.C.setPlaybackParams(playbackParams);
            }
        } catch (Exception e10) {
            this.f102194a.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(int i10, long j10) {
        this.f102194a.c("deselectTrack, trackID ".concat(String.valueOf(i10)));
        int size = this.f102198ad.size();
        int size2 = this.f102199ae.size();
        if (i10 < size || i10 >= size2 + size) {
            this.C.deselectTrack(i10);
            return;
        }
        int i11 = i10 - size;
        try {
            f(i11, j10);
        } catch (Exception e10) {
            this.f102194a.a(e10);
        }
        this.f102199ae.get(i11).f102240a.isSelected = false;
        this.f102196ab = -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(boolean z10) {
        this.f102194a.c("setLoopback, : ".concat(String.valueOf(z10)));
        this.f102205c = z10;
        this.C.setLooping(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPDynamicStatisticParams c(boolean z10) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public String c(int i10) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void c(int i10, long j10) {
        this.f102194a.e("selectProgram, android mediaplayer not support");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void g() throws IOException {
        if (this.R == EnumC1011e.COMPLETE) {
            this.f102194a.d("call prepare() on mMediaPlayerState==COMPLETE");
            return;
        }
        x();
        this.f102194a.c("prepare ");
        EnumC1011e enumC1011e = EnumC1011e.PREPARING;
        this.Q = enumC1011e;
        this.R = enumC1011e;
        this.C.prepare();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void h() {
        x();
        this.f102194a.c("prepareAsync ");
        EnumC1011e enumC1011e = EnumC1011e.PREPARING;
        this.Q = enumC1011e;
        this.R = enumC1011e;
        this.C.prepareAsync();
        z();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void i() {
        com.tencent.thumbplayer.tcmedia.e.a aVar;
        String str;
        this.f102194a.c("start ");
        if (this.S) {
            f fVar = this.f102202ah;
            if (fVar != null) {
                fVar.f102264h = EnumC1011e.STARTED;
            }
            aVar = this.f102194a;
            str = "system player is busy.";
        } else {
            if (this.Q == EnumC1011e.PREPARED || this.Q == EnumC1011e.PAUSED) {
                com.tencent.thumbplayer.tcmedia.adapter.a.a.a aVar2 = this.f102200af;
                if (aVar2 != null) {
                    aVar2.b();
                }
                this.C.start();
                EnumC1011e enumC1011e = EnumC1011e.STARTED;
                this.Q = enumC1011e;
                this.R = enumC1011e;
                float f10 = this.f102213k;
                if (f10 != 1.0d) {
                    b(f10);
                }
                B();
                return;
            }
            aVar = this.f102194a;
            str = "start(), illegal state, state:" + this.Q;
        }
        aVar.d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public synchronized void j() {
        this.f102194a.c("pause ");
        if (this.S) {
            f fVar = this.f102202ah;
            if (fVar != null) {
                fVar.f102264h = EnumC1011e.PAUSED;
            }
            this.f102194a.d("system player is busy.");
            return;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.a.a aVar = this.f102200af;
        if (aVar != null) {
            aVar.c();
        }
        this.C.pause();
        EnumC1011e enumC1011e = EnumC1011e.PAUSED;
        this.Q = enumC1011e;
        this.R = enumC1011e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public synchronized void k() {
        this.f102194a.c("stop ");
        A();
        C();
        F();
        this.Q = EnumC1011e.STOPPED;
        c();
        this.f102195aa = 0;
        this.f102196ab = -1;
        this.f102202ah = null;
        this.Z = -1;
        this.f102197ac = -1;
        this.f102200af.d();
        this.f102201ag = 0L;
        this.f102194a.c("stop over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public synchronized void l() {
        this.f102194a.c("reset ");
        EnumC1011e enumC1011e = EnumC1011e.IDLE;
        this.Q = enumC1011e;
        this.R = enumC1011e;
        this.f102200af.e();
        this.C.reset();
        this.f102215m = 0;
        this.f102216n = -1L;
        this.f102217o = false;
        this.f102218p = -1L;
        this.f102219q = -1;
        this.f102220r = -1;
        this.f102221s = null;
        A();
        C();
        F();
        this.f102194a.c("reset over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public synchronized void m() {
        this.f102194a.c("release ");
        this.f102200af.f();
        A();
        C();
        F();
        this.Q = EnumC1011e.RELEASE;
        e();
        this.f102223u = null;
        this.f102224v = null;
        this.f102225w = null;
        this.f102226x = null;
        this.f102227y = null;
        this.f102228z = null;
        this.A = null;
        this.F = null;
        this.f102194a.c("release over.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long n() {
        if (this.f102217o) {
            return 0L;
        }
        if (this.S) {
            return this.T;
        }
        if (this.Q != EnumC1011e.PREPARED && this.Q != EnumC1011e.STARTED && this.Q != EnumC1011e.PAUSED) {
            return -1L;
        }
        if (this.T <= 0) {
            this.T = this.C.getDuration();
        }
        long j10 = this.f102218p;
        if (j10 > 0) {
            long j11 = this.T;
            if (j11 <= 0) {
                this.T = j10;
            } else {
                long jAbs = Math.abs(j10 - j11) * 100;
                long j12 = this.f102218p;
                if (jAbs / j12 > 1) {
                    this.T = j12;
                }
            }
        }
        return this.T;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long o() {
        int currentPosition;
        if (this.f102217o) {
            return 0L;
        }
        if (!this.S && this.Q != EnumC1011e.ERROR) {
            if (this.Q != EnumC1011e.IDLE && this.Q != EnumC1011e.INITIALIZED && this.Q != EnumC1011e.PREPARING && this.Q != EnumC1011e.STOPPED && this.Q != EnumC1011e.PREPARED) {
                currentPosition = this.C.getCurrentPosition();
            }
            return currentPosition;
        }
        long j10 = this.U;
        if (j10 != -1) {
            return j10;
        }
        currentPosition = this.f102215m;
        return currentPosition;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long p() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int q() {
        this.f102194a.c("getVideoWidth, width:" + this.V);
        return this.V;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int r() {
        this.f102194a.c("getVideoHeight, height:" + this.W);
        return this.W;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPTrackInfo[] s() {
        MediaPlayer.TrackInfo[] trackInfo;
        if ((this.Q == EnumC1011e.PREPARED || this.Q == EnumC1011e.STARTED || this.Q == EnumC1011e.PAUSED) && TPSystemInfo.SDK_INT > 16) {
            try {
                trackInfo = this.C.getTrackInfo();
            } catch (Exception unused) {
                this.f102194a.e("getTrackInfo, android getTrackInfo crash");
                trackInfo = null;
            }
        } else {
            trackInfo = null;
        }
        int i10 = 0;
        if (trackInfo == null && this.f102198ad.isEmpty() && this.f102199ae.isEmpty()) {
            return new TPTrackInfo[0];
        }
        TPTrackInfo[] tPTrackInfoArr = new TPTrackInfo[this.f102198ad.size() + this.f102199ae.size() + (trackInfo == null ? 0 : trackInfo.length)];
        Iterator<b> it = this.f102198ad.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            tPTrackInfoArr[i11] = it.next().f102240a;
            i11++;
        }
        Iterator<b> it2 = this.f102199ae.iterator();
        while (it2.hasNext()) {
            tPTrackInfoArr[i11] = it2.next().f102240a;
            i11++;
        }
        if (trackInfo != null && trackInfo.length > 0) {
            int length = trackInfo.length;
            while (i10 < length) {
                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i10];
                TPTrackInfo tPTrackInfo = new TPTrackInfo();
                tPTrackInfo.name = trackInfo2.getLanguage();
                tPTrackInfo.trackType = f(trackInfo2.getTrackType());
                this.f102194a.c("getTrackInfo index:" + i11 + ", type:" + tPTrackInfo.trackType + ", isselcted:" + tPTrackInfo.isSelected + ", name:" + tPTrackInfo.name);
                tPTrackInfoArr[i11] = tPTrackInfo;
                i10++;
                i11++;
            }
        }
        return tPTrackInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPProgramInfo[] t() {
        return new TPProgramInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long[] u() {
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPGeneralPlayFlowParams v() {
        return null;
    }
}
