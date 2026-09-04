package com.tencent.liteav.txcvodplayer;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.c;
import com.tencent.liteav.txcplayer.d;
import com.tencent.liteav.txcplayer.e;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcplayer.f;
import com.tencent.liteav.txcplayer.model.TXSubtitleRenderModel;
import com.tencent.liteav.txcvodplayer.renderer.SurfaceRenderView;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TXCVodVideoView extends FrameLayout {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static volatile boolean f99950ab = true;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static volatile boolean f99951ac = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile boolean f99952i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile boolean f99953j = false;
    private int A;
    private boolean B;
    private Context C;
    private Map<String, Object> D;
    private com.tencent.liteav.txcvodplayer.renderer.a E;
    private int F;
    private int G;
    private String H;
    private float I;
    private long J;
    private long K;
    private volatile boolean L;
    private int M;
    private int N;
    private float O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private ITXVCubePlayer.b V;
    private TXSubtitleRenderModel W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99954a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private ITXVCubePlayer.i f99955aa;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private ITXVCubePlayer.d f99956ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private ITXVCubePlayer.f f99957ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private int f99958af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private ITXVCubePlayer.e f99959ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private ITXVCubePlayer.h f99960ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private ITXVCubePlayer.i f99961ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private ITXVCubePlayer.b f99962aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private int f99963ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private d f99964al;
    private boolean am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITXVCubePlayer f99966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f99967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f99968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f99969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f99970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<b> f99971h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f99972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f99973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f99974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ITXVCubePlayer.j f99975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ITXVCubePlayer.g f99976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a f99977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Handler f99978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.tencent.liteav.txcvodplayer.renderer.a.b f99979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f99980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f99982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f99983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f99985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f99986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f99987z;

    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<TXCVodVideoView> f100001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f100002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f100003c;

        public a(TXCVodVideoView tXCVodVideoView, Looper looper) {
            super(looper);
            this.f100002b = 500;
            this.f100003c = "TXCVodeVideoView_Eventhandler";
            this.f100001a = new WeakReference<>(tXCVodVideoView);
        }

        private void a(TXCVodVideoView tXCVodVideoView, boolean z10) {
            if (tXCVodVideoView == null || tXCVodVideoView.f99964al == null) {
                return;
            }
            long currentPosition = tXCVodVideoView.getCurrentPosition();
            Bundle bundle = new Bundle();
            long bufferDuration = tXCVodVideoView.getBufferDuration();
            long duration = tXCVodVideoView.getDuration();
            if (z10) {
                currentPosition = duration;
            }
            bundle.putInt("EVT_PLAY_PROGRESS", (int) (currentPosition / 1000));
            bundle.putInt("EVT_PLAY_DURATION", (int) (duration / 1000));
            bundle.putInt(TXVodConstants.EVT_PLAYABLE_DURATION, (int) (bufferDuration / 1000));
            bundle.putInt("EVT_PLAY_PROGRESS_MS", (int) currentPosition);
            bundle.putInt("EVT_PLAY_DURATION_MS", (int) duration);
            bundle.putInt("EVT_PLAYABLE_DURATION_MS", (int) bufferDuration);
            if (TXCVodVideoView.f99952i && tXCVodVideoView.f99966c != null) {
                bundle.putLong(TXVodConstants.EVT_PLAY_PDT_TIME_MS, tXCVodVideoView.f99966c.getPdtTimeMs(currentPosition));
            }
            if (tXCVodVideoView.f99966c != null) {
                bundle.putFloat("EVT_PLAYABLE_RATE", tXCVodVideoView.f99966c.getRate());
            }
            if (tXCVodVideoView.f99966c != null) {
                if (tXCVodVideoView.f99967d.f99912l <= 0) {
                    tXCVodVideoView.f99967d.f99912l = 500;
                }
                removeMessages(103);
                if (!z10) {
                    sendEmptyMessageDelayed(103, tXCVodVideoView.f99967d.f99912l);
                }
            }
            tXCVodVideoView.f99964al.a(2005, bundle);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            TXCVodVideoView tXCVodVideoView = this.f100001a.get();
            if (tXCVodVideoView == null || tXCVodVideoView.f99964al == null) {
                return;
            }
            switch (message.what) {
                case 100:
                    if (tXCVodVideoView.f99966c != null) {
                        try {
                            float propertyLong = tXCVodVideoView.f99966c.getPropertyLong(206);
                            long currentPosition = tXCVodVideoView.f99966c.getCurrentPosition();
                            float propertyLong2 = currentPosition > 0 ? (tXCVodVideoView.f99966c.getPropertyLong(208) * 1000) / currentPosition : 0.0f;
                            long propertyLong3 = tXCVodVideoView.f99966c.getPropertyLong(302);
                            long propertyLong4 = tXCVodVideoView.f99966c.getPropertyLong(301);
                            long propertyLong5 = tXCVodVideoView.f99966c.getPropertyLong(303);
                            Bundle bundle = new Bundle();
                            long propertyLong6 = tXCVodVideoView.f99966c.getPropertyLong(202);
                            try {
                                long propertyLong7 = tXCVodVideoView.f99966c.getPropertyLong(101);
                                bundle.putLong("VIDEO_BITRATE", propertyLong6);
                                bundle.putLong("AUDIO_BITRATE", propertyLong7);
                                bundle.putFloat("fps", propertyLong);
                                bundle.putFloat("dps", propertyLong2);
                                bundle.putLong("cachedBytes", propertyLong3);
                                bundle.putLong("bitRate", propertyLong4);
                                bundle.putLong("tcpSpeed", propertyLong5);
                                tXCVodVideoView.f99964al.a(bundle);
                                removeMessages(100);
                                sendEmptyMessageDelayed(100, 500L);
                            } catch (Exception e10) {
                                e = e10;
                                LiteavLog.e("TXCVodeVideoView_Eventhandler", "MSG_UPDATE_NET_STATUS exception : " + e.getMessage());
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                        break;
                    }
                    break;
                case 101:
                    int i10 = message.arg1;
                    if (i10 == 2003) {
                        TXCVodVideoView.z(tXCVodVideoView);
                    } else if (i10 == 2006) {
                        a(tXCVodVideoView, true);
                    } else if (i10 == 2013) {
                        LiteavLog.i("TXCVodeVideoView_Eventhandler", "TXCVodVideoView handleMessage:MSG_PLAY_EVENT:EVT_VOD_PLAY_PREPARED");
                    } else if (i10 == 2019 && tXCVodVideoView.f99965b == 3 && tXCVodVideoView.f99954a != 3) {
                        tXCVodVideoView.f99954a = 3;
                        sendEmptyMessage(100);
                        sendEmptyMessage(103);
                    }
                    tXCVodVideoView.f99964al.a(i10, message.getData());
                    RenderProcessService.getInstance().sendPlayerEventToPlugin(tXCVodVideoView.f99966c, i10, message.getData());
                    break;
                case 102:
                    tXCVodVideoView.d(true);
                    tXCVodVideoView.a(2103, 0, "VOD network reconnected");
                    break;
                case 103:
                    a(tXCVodVideoView, false);
                    break;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f100005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f100006c;

        public b(String str, String str2, String str3) {
            this.f100004a = str;
            this.f100005b = str2;
            this.f100006c = str3;
        }
    }

    public TXCVodVideoView(Context context) {
        super(context);
        this.f99954a = 0;
        this.f99965b = 0;
        this.f99979r = null;
        this.f99966c = null;
        this.B = false;
        this.I = 1.0f;
        this.f99968e = true;
        this.f99969f = 2;
        this.L = false;
        this.M = -1;
        this.N = 100;
        this.O = -100.0f;
        this.P = false;
        this.Q = -1000;
        this.R = -1;
        this.S = -1000;
        this.T = -1;
        this.f99970g = null;
        this.f99972k = false;
        this.f99974m = 0;
        this.f99975n = new ITXVCubePlayer.j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.j
            public final void a(ITXVCubePlayer iTXVCubePlayer, int i10, int i11, String str) {
                boolean z10 = (TXCVodVideoView.this.f99981t != i11 && Math.abs(TXCVodVideoView.this.f99981t - i11) > 16) || (TXCVodVideoView.this.f99980s != i10 && Math.abs(TXCVodVideoView.this.f99980s - i10) > 16);
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.F = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.G = iTXVCubePlayer.getVideoSarDen();
                long j10 = 2147483647L;
                ArrayList<com.tencent.liteav.txcplayer.model.a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    for (com.tencent.liteav.txcplayer.model.a aVar : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f99980s * TXCVodVideoView.this.f99981t) - (aVar.f99929b * aVar.f99930c));
                        if (jAbs < j10) {
                            TXCVodVideoView.this.J = ((long) aVar.f99929b) * ((long) aVar.f99930c);
                            j10 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f99966c.getPropertyLong(205);
                LiteavLog.i("TXCVodVideoView", "OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f99980s + ":height:" + TXCVodVideoView.this.f99981t + ":SarNum:" + TXCVodVideoView.this.F + ":SarDen:" + TXCVodVideoView.this.G + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0) {
                    if (TXCVodVideoView.this.E != null) {
                        TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                        TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z10) {
                    if (TXCVodVideoView.this.B || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f99978q != null) {
                        TXCVodVideoView.this.f99978q.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                if (TXCVodVideoView.this.B || str == null) {
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t);
                } else {
                    String str3 = i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f99978q != null) {
                    TXCVodVideoView.this.f99978q.sendMessage(message2);
                }
            }
        };
        this.f99976o = new ITXVCubePlayer.g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.g
            public final void a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    LiteavLog.i("TXCVodVideoView", "setSurfaceBufferSize succeed");
                }
                if (c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.d();
                    LiteavLog.i("TXCVodVideoView", "has advanced license!");
                }
                if (!TXCVodVideoView.f99952i) {
                    TXCVodVideoView.this.f99966c.checkSubtitle();
                }
                if (TXCVodVideoView.this.f99954a == 1) {
                    TXCVodVideoView.this.a(2013, 0, "VOD ready");
                    if (!TXCVodVideoView.this.f99967d.f99916p) {
                        TXCVodVideoView.this.f99965b = 4;
                    } else if (TXCVodVideoView.this.f99965b != 4) {
                        TXCVodVideoView.this.f99965b = 3;
                    }
                    TXCVodVideoView.this.f99954a = 2;
                }
                TXCVodVideoView.l(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f99954a == -1) {
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99965b = 3;
                }
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0 && TXCVodVideoView.this.E != null) {
                    TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                    TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                }
                if (TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }
        };
        this.f99956ad = new ITXVCubePlayer.d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.d
            public final void a() {
                TXCVodVideoView.this.f99954a = 5;
                TXCVodVideoView.this.f99965b = 5;
                TXCVodVideoView.this.a(2006, 0, "Playback completed");
            }
        };
        this.f99957ae = new ITXVCubePlayer.f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.f
            public final boolean a(int i10, int i11, int i12, Object obj) {
                if (i10 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.H) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.H = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return true;
                    }
                }
                if (i10 == 2007) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_PLAY_LOADING");
                    TXCVodVideoView.this.a(i10, 0, "Buffer started");
                    return true;
                }
                if (i10 == 2011) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i11)));
                    TXCVodVideoView.this.f99985x = i11;
                    if (TXCVodVideoView.this.f99967d.B && TXCVodVideoView.this.f99985x > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f99984w = tXCVodVideoView.f99985x;
                        if (TXCVodVideoView.this.E != null) {
                            TXCVodVideoView.this.E.setVideoRotation(TXCVodVideoView.this.f99984w);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f99985x;
                    int unused = TXCVodVideoView.this.f99985x;
                    tXCVodVideoView2.a(2011, 0, str);
                    return true;
                }
                if (i10 == 2014) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VOD_PLAY_LOADING_END: eof ".concat(String.valueOf(i11)));
                    TXCVodVideoView.this.a(i10, 0, "Buffer ended");
                    if (i11 != 0) {
                        String str2 = TXCVodVideoView.this.f99967d.f99917q;
                        if (TextUtils.isEmpty(str2) && str2.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f99965b != 3) {
                        return true;
                    }
                    TXCVodVideoView.this.a(2004, 0, "Playback started");
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(100);
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(103);
                    return true;
                }
                if (i10 == 2020) {
                    long jLongValue = -1;
                    if (obj != null && (obj instanceof Long)) {
                        jLongValue = ((Long) obj).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_INDEX, (int) jLongValue);
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_ERROR_CODE, i12);
                    bundle.putString("description", "Select Track Complete");
                    LiteavLog.i("TXCVodVideoView", "VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, trackIndex=" + jLongValue + " ,errorCode=" + i12);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2020, bundle);
                    return true;
                }
                if (i10 == 2026) {
                    LiteavLog.i("TXCVodVideoView", "EVT_AUDIO_JITTER_STATE_FIRST_PLAY");
                    TXCVodVideoView.this.a(i10, 0, "Audio first play");
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str = null;
                String str3 = null;
                tPVideoSeiInfo = null;
                if (i10 == 2030) {
                    if (!TXCVodVideoView.f99952i) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        LiteavLog.e("TXCVodVideoView", "VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle2.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2030, bundle2);
                    return true;
                }
                if (i10 == 2002) {
                    TXCVodVideoView.this.a(i10, 0, "hit cache");
                    return true;
                }
                if (i10 == 2003) {
                    LiteavLog.i("TXCVodVideoView", "EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f99972k) {
                        Bundle bundle3 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f99973l) || !TXCVodVideoView.this.f99973l.equals(TXCVodVideoView.this.f99967d.f99917q)) {
                            bundle3.putString("support_hevc", "1");
                        } else {
                            bundle3.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.a(i10, 0, "VOD displayed the first frame", bundle3);
                    } else {
                        TXCVodVideoView.this.a(i10, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.setRate(tXCVodVideoView3.I);
                    TXCVodVideoView.p(TXCVodVideoView.this);
                    return true;
                }
                switch (i10) {
                    case 2016:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.H = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.H + ",port:" + i11 + ",error:" + i12;
                        LiteavLog.i("TXCVodVideoView", str4);
                        if (i12 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i10, 0, str4);
                        return true;
                    case 2017:
                        TXCVodVideoView.this.a(i10, 0, "Video data received");
                        return true;
                    case 2018:
                        if (obj != null && (obj instanceof String)) {
                            str3 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str3 + ",error:" + i11;
                        LiteavLog.i("TXCVodVideoView", str5);
                        if (i11 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i10, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f99959ag = new ITXVCubePlayer.e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.e
            public final boolean a(int i10, int i11) {
                LiteavLog.e("TXCVodVideoView", "[onError] vodErrorEvent: " + i10 + " ,errorCode: " + i11);
                TXCVodVideoView.this.f99954a = -1;
                TXCVodVideoView.this.f99965b = -1;
                if (i10 == -6101) {
                    if (TXCVodVideoView.this.D != null) {
                        Object obj = TXCVodVideoView.this.D.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.D.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.D.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.g()) {
                                TXCVodVideoView.this.a(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.a(TXVodConstants.VOD_PLAY_ERR_DRM, i11, "DRM play failed cause by " + i11 + ".");
                    return true;
                }
                if (i10 != -6004) {
                    switch (i10) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.w(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i10) {
                                case -2305:
                                    TXCVodVideoView.x(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.v(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.a(-2303, i11, "The file does not exist");
                                    TXCVodVideoView.this.a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.K;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.z(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.K = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.A(TXCVodVideoView.this) >= TXCVodVideoView.this.f99967d.f99901a) {
                                        TXCVodVideoView.this.a(-2301, i11, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.a();
                                    } else if (TXCVodVideoView.this.f99978q != null) {
                                        TXCVodVideoView.this.f99978q.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f99967d.f99902b * 1000.0f));
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i10, i11, TXCVodVideoView.a(i10));
                TXCVodVideoView.this.a();
                return true;
            }
        };
        this.f99960ah = new ITXVCubePlayer.h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.h
            public final void a() {
                LiteavLog.v("TXCVodVideoView", "seek complete");
                TXCVodVideoView.B(TXCVodVideoView.this);
                TXCVodVideoView.this.a(2019, 0, "seek complete");
            }
        };
        this.f99961ai = new ITXVCubePlayer.i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.i
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f99952i && TXCVodVideoView.this.f99955aa != null) {
                    TXCVodVideoView.this.f99955aa.a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f99962aj = new ITXVCubePlayer.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.b
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.V == null) {
                    return;
                }
                TXCVodVideoView.this.V.a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f99977p = new com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceCreated");
                TXCVodVideoView.this.B = true;
                TXCVodVideoView.this.f99979r = bVar;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.b(TXCVodVideoView.this.f99966c, bVar);
                } else {
                    TXCVodVideoView.this.g();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar, int i10, int i11) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceChanged");
                TXCVodVideoView.this.f99982u = i10;
                TXCVodVideoView.this.f99983v = i11;
                boolean z10 = true;
                boolean z11 = TXCVodVideoView.this.f99965b == 3;
                if (TXCVodVideoView.this.E.a() && (TXCVodVideoView.this.f99980s != i10 || TXCVodVideoView.this.f99981t != i11)) {
                    z10 = false;
                }
                if (TXCVodVideoView.this.f99966c != null && z11 && z10 && TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final boolean a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f99966c, motionEvent);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void b(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceDestroyed");
                TXCVodVideoView.this.B = false;
                TXCVodVideoView.this.f99979r = null;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.this.f99966c.setSurface(null);
                }
                ITXVCubePlayer iTXVCubePlayer = TXCVodVideoView.this.f99966c;
                if (iTXVCubePlayer != null) {
                    iTXVCubePlayer.setDisplay(null);
                }
            }
        };
        this.f99963ak = 0;
        this.am = false;
        a(context);
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f99954a = 0;
        this.f99965b = 0;
        this.f99979r = null;
        this.f99966c = null;
        this.B = false;
        this.I = 1.0f;
        this.f99968e = true;
        this.f99969f = 2;
        this.L = false;
        this.M = -1;
        this.N = 100;
        this.O = -100.0f;
        this.P = false;
        this.Q = -1000;
        this.R = -1;
        this.S = -1000;
        this.T = -1;
        this.f99970g = null;
        this.f99972k = false;
        this.f99974m = 0;
        this.f99975n = new ITXVCubePlayer.j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.j
            public final void a(ITXVCubePlayer iTXVCubePlayer, int i10, int i11, String str) {
                boolean z10 = (TXCVodVideoView.this.f99981t != i11 && Math.abs(TXCVodVideoView.this.f99981t - i11) > 16) || (TXCVodVideoView.this.f99980s != i10 && Math.abs(TXCVodVideoView.this.f99980s - i10) > 16);
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.F = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.G = iTXVCubePlayer.getVideoSarDen();
                long j10 = 2147483647L;
                ArrayList<com.tencent.liteav.txcplayer.model.a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    for (com.tencent.liteav.txcplayer.model.a aVar : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f99980s * TXCVodVideoView.this.f99981t) - (aVar.f99929b * aVar.f99930c));
                        if (jAbs < j10) {
                            TXCVodVideoView.this.J = ((long) aVar.f99929b) * ((long) aVar.f99930c);
                            j10 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f99966c.getPropertyLong(205);
                LiteavLog.i("TXCVodVideoView", "OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f99980s + ":height:" + TXCVodVideoView.this.f99981t + ":SarNum:" + TXCVodVideoView.this.F + ":SarDen:" + TXCVodVideoView.this.G + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0) {
                    if (TXCVodVideoView.this.E != null) {
                        TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                        TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z10) {
                    if (TXCVodVideoView.this.B || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f99978q != null) {
                        TXCVodVideoView.this.f99978q.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                if (TXCVodVideoView.this.B || str == null) {
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t);
                } else {
                    String str3 = i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f99978q != null) {
                    TXCVodVideoView.this.f99978q.sendMessage(message2);
                }
            }
        };
        this.f99976o = new ITXVCubePlayer.g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.g
            public final void a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    LiteavLog.i("TXCVodVideoView", "setSurfaceBufferSize succeed");
                }
                if (c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.d();
                    LiteavLog.i("TXCVodVideoView", "has advanced license!");
                }
                if (!TXCVodVideoView.f99952i) {
                    TXCVodVideoView.this.f99966c.checkSubtitle();
                }
                if (TXCVodVideoView.this.f99954a == 1) {
                    TXCVodVideoView.this.a(2013, 0, "VOD ready");
                    if (!TXCVodVideoView.this.f99967d.f99916p) {
                        TXCVodVideoView.this.f99965b = 4;
                    } else if (TXCVodVideoView.this.f99965b != 4) {
                        TXCVodVideoView.this.f99965b = 3;
                    }
                    TXCVodVideoView.this.f99954a = 2;
                }
                TXCVodVideoView.l(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f99954a == -1) {
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99965b = 3;
                }
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0 && TXCVodVideoView.this.E != null) {
                    TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                    TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                }
                if (TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }
        };
        this.f99956ad = new ITXVCubePlayer.d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.d
            public final void a() {
                TXCVodVideoView.this.f99954a = 5;
                TXCVodVideoView.this.f99965b = 5;
                TXCVodVideoView.this.a(2006, 0, "Playback completed");
            }
        };
        this.f99957ae = new ITXVCubePlayer.f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.f
            public final boolean a(int i10, int i11, int i12, Object obj) {
                if (i10 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.H) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.H = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return true;
                    }
                }
                if (i10 == 2007) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_PLAY_LOADING");
                    TXCVodVideoView.this.a(i10, 0, "Buffer started");
                    return true;
                }
                if (i10 == 2011) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i11)));
                    TXCVodVideoView.this.f99985x = i11;
                    if (TXCVodVideoView.this.f99967d.B && TXCVodVideoView.this.f99985x > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f99984w = tXCVodVideoView.f99985x;
                        if (TXCVodVideoView.this.E != null) {
                            TXCVodVideoView.this.E.setVideoRotation(TXCVodVideoView.this.f99984w);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f99985x;
                    int unused = TXCVodVideoView.this.f99985x;
                    tXCVodVideoView2.a(2011, 0, str);
                    return true;
                }
                if (i10 == 2014) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VOD_PLAY_LOADING_END: eof ".concat(String.valueOf(i11)));
                    TXCVodVideoView.this.a(i10, 0, "Buffer ended");
                    if (i11 != 0) {
                        String str2 = TXCVodVideoView.this.f99967d.f99917q;
                        if (TextUtils.isEmpty(str2) && str2.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f99965b != 3) {
                        return true;
                    }
                    TXCVodVideoView.this.a(2004, 0, "Playback started");
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(100);
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(103);
                    return true;
                }
                if (i10 == 2020) {
                    long jLongValue = -1;
                    if (obj != null && (obj instanceof Long)) {
                        jLongValue = ((Long) obj).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_INDEX, (int) jLongValue);
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_ERROR_CODE, i12);
                    bundle.putString("description", "Select Track Complete");
                    LiteavLog.i("TXCVodVideoView", "VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, trackIndex=" + jLongValue + " ,errorCode=" + i12);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2020, bundle);
                    return true;
                }
                if (i10 == 2026) {
                    LiteavLog.i("TXCVodVideoView", "EVT_AUDIO_JITTER_STATE_FIRST_PLAY");
                    TXCVodVideoView.this.a(i10, 0, "Audio first play");
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str3 = null;
                String str3 = null;
                tPVideoSeiInfo = null;
                if (i10 == 2030) {
                    if (!TXCVodVideoView.f99952i) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        LiteavLog.e("TXCVodVideoView", "VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle2.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2030, bundle2);
                    return true;
                }
                if (i10 == 2002) {
                    TXCVodVideoView.this.a(i10, 0, "hit cache");
                    return true;
                }
                if (i10 == 2003) {
                    LiteavLog.i("TXCVodVideoView", "EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f99972k) {
                        Bundle bundle3 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f99973l) || !TXCVodVideoView.this.f99973l.equals(TXCVodVideoView.this.f99967d.f99917q)) {
                            bundle3.putString("support_hevc", "1");
                        } else {
                            bundle3.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.a(i10, 0, "VOD displayed the first frame", bundle3);
                    } else {
                        TXCVodVideoView.this.a(i10, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.setRate(tXCVodVideoView3.I);
                    TXCVodVideoView.p(TXCVodVideoView.this);
                    return true;
                }
                switch (i10) {
                    case 2016:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.H = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.H + ",port:" + i11 + ",error:" + i12;
                        LiteavLog.i("TXCVodVideoView", str4);
                        if (i12 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i10, 0, str4);
                        return true;
                    case 2017:
                        TXCVodVideoView.this.a(i10, 0, "Video data received");
                        return true;
                    case 2018:
                        if (obj != null && (obj instanceof String)) {
                            str3 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str3 + ",error:" + i11;
                        LiteavLog.i("TXCVodVideoView", str5);
                        if (i11 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i10, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f99959ag = new ITXVCubePlayer.e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.e
            public final boolean a(int i10, int i11) {
                LiteavLog.e("TXCVodVideoView", "[onError] vodErrorEvent: " + i10 + " ,errorCode: " + i11);
                TXCVodVideoView.this.f99954a = -1;
                TXCVodVideoView.this.f99965b = -1;
                if (i10 == -6101) {
                    if (TXCVodVideoView.this.D != null) {
                        Object obj = TXCVodVideoView.this.D.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.D.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.D.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.g()) {
                                TXCVodVideoView.this.a(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.a(TXVodConstants.VOD_PLAY_ERR_DRM, i11, "DRM play failed cause by " + i11 + ".");
                    return true;
                }
                if (i10 != -6004) {
                    switch (i10) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.w(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i10) {
                                case -2305:
                                    TXCVodVideoView.x(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.v(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.a(-2303, i11, "The file does not exist");
                                    TXCVodVideoView.this.a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.K;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.z(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.K = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.A(TXCVodVideoView.this) >= TXCVodVideoView.this.f99967d.f99901a) {
                                        TXCVodVideoView.this.a(-2301, i11, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.a();
                                    } else if (TXCVodVideoView.this.f99978q != null) {
                                        TXCVodVideoView.this.f99978q.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f99967d.f99902b * 1000.0f));
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i10, i11, TXCVodVideoView.a(i10));
                TXCVodVideoView.this.a();
                return true;
            }
        };
        this.f99960ah = new ITXVCubePlayer.h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.h
            public final void a() {
                LiteavLog.v("TXCVodVideoView", "seek complete");
                TXCVodVideoView.B(TXCVodVideoView.this);
                TXCVodVideoView.this.a(2019, 0, "seek complete");
            }
        };
        this.f99961ai = new ITXVCubePlayer.i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.i
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f99952i && TXCVodVideoView.this.f99955aa != null) {
                    TXCVodVideoView.this.f99955aa.a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f99962aj = new ITXVCubePlayer.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.b
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.V == null) {
                    return;
                }
                TXCVodVideoView.this.V.a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f99977p = new com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceCreated");
                TXCVodVideoView.this.B = true;
                TXCVodVideoView.this.f99979r = bVar;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.b(TXCVodVideoView.this.f99966c, bVar);
                } else {
                    TXCVodVideoView.this.g();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar, int i10, int i11) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceChanged");
                TXCVodVideoView.this.f99982u = i10;
                TXCVodVideoView.this.f99983v = i11;
                boolean z10 = true;
                boolean z11 = TXCVodVideoView.this.f99965b == 3;
                if (TXCVodVideoView.this.E.a() && (TXCVodVideoView.this.f99980s != i10 || TXCVodVideoView.this.f99981t != i11)) {
                    z10 = false;
                }
                if (TXCVodVideoView.this.f99966c != null && z11 && z10 && TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final boolean a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f99966c, motionEvent);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void b(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceDestroyed");
                TXCVodVideoView.this.B = false;
                TXCVodVideoView.this.f99979r = null;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.this.f99966c.setSurface(null);
                }
                ITXVCubePlayer iTXVCubePlayer = TXCVodVideoView.this.f99966c;
                if (iTXVCubePlayer != null) {
                    iTXVCubePlayer.setDisplay(null);
                }
            }
        };
        this.f99963ak = 0;
        this.am = false;
        a(context);
    }

    public TXCVodVideoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f99954a = 0;
        this.f99965b = 0;
        this.f99979r = null;
        this.f99966c = null;
        this.B = false;
        this.I = 1.0f;
        this.f99968e = true;
        this.f99969f = 2;
        this.L = false;
        this.M = -1;
        this.N = 100;
        this.O = -100.0f;
        this.P = false;
        this.Q = -1000;
        this.R = -1;
        this.S = -1000;
        this.T = -1;
        this.f99970g = null;
        this.f99972k = false;
        this.f99974m = 0;
        this.f99975n = new ITXVCubePlayer.j() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.6
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.j
            public final void a(ITXVCubePlayer iTXVCubePlayer, int i11, int i12, String str) {
                boolean z10 = (TXCVodVideoView.this.f99981t != i12 && Math.abs(TXCVodVideoView.this.f99981t - i12) > 16) || (TXCVodVideoView.this.f99980s != i11 && Math.abs(TXCVodVideoView.this.f99980s - i11) > 16);
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                TXCVodVideoView.this.F = iTXVCubePlayer.getVideoSarNum();
                TXCVodVideoView.this.G = iTXVCubePlayer.getVideoSarDen();
                long j10 = 2147483647L;
                ArrayList<com.tencent.liteav.txcplayer.model.a> supportedBitrates = TXCVodVideoView.this.getSupportedBitrates();
                if (supportedBitrates != null) {
                    for (com.tencent.liteav.txcplayer.model.a aVar : supportedBitrates) {
                        long jAbs = Math.abs((TXCVodVideoView.this.f99980s * TXCVodVideoView.this.f99981t) - (aVar.f99929b * aVar.f99930c));
                        if (jAbs < j10) {
                            TXCVodVideoView.this.J = ((long) aVar.f99929b) * ((long) aVar.f99930c);
                            j10 = jAbs;
                        }
                    }
                }
                long propertyLong = TXCVodVideoView.this.f99966c.getPropertyLong(205);
                LiteavLog.i("TXCVodVideoView", "OnVideoSizeChangedListener width:" + TXCVodVideoView.this.f99980s + ":height:" + TXCVodVideoView.this.f99981t + ":SarNum:" + TXCVodVideoView.this.F + ":SarDen:" + TXCVodVideoView.this.G + ":videoRotationDegree:" + propertyLong);
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0) {
                    if (TXCVodVideoView.this.E != null) {
                        TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                        TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                    }
                    TXCVodVideoView.this.requestLayout();
                }
                if (!z10) {
                    if (TXCVodVideoView.this.B || str == null) {
                        return;
                    }
                    Message message = new Message();
                    message.what = 101;
                    message.arg1 = 2009;
                    Bundle bundle = new Bundle();
                    String str2 = i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + i12 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str2 + ")");
                    bundle.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                    bundle.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                    bundle.putString("EVT_PARAM3", str2);
                    bundle.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                    message.setData(bundle);
                    if (TXCVodVideoView.this.f99978q != null) {
                        TXCVodVideoView.this.f99978q.sendMessage(message);
                        return;
                    }
                    return;
                }
                Message message2 = new Message();
                message2.what = 101;
                message2.arg1 = 2009;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("EVT_PARAM1", TXCVodVideoView.this.f99980s);
                bundle2.putInt("EVT_PARAM2", TXCVodVideoView.this.f99981t);
                if (TXCVodVideoView.this.B || str == null) {
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t);
                } else {
                    String str3 = i11 + Constants.ACCEPT_TIME_SEPARATOR_SP + i12 + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
                    bundle2.putString("description", "Resolution change:" + TXCVodVideoView.this.f99980s + androidx.webkit.b.f28327e + TXCVodVideoView.this.f99981t + " Crop(width,height,crop_left,crop_top,crop_right,crop_bottom):(" + str3 + ")");
                    bundle2.putString("EVT_PARAM3", str3);
                }
                bundle2.putLong(TXVodConstants.EVT_KEY_VIDEO_ROTATION, propertyLong);
                message2.setData(bundle2);
                if (TXCVodVideoView.this.f99978q != null) {
                    TXCVodVideoView.this.f99978q.sendMessage(message2);
                }
            }
        };
        this.f99976o = new ITXVCubePlayer.g() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.7
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.g
            public final void a(ITXVCubePlayer iTXVCubePlayer) {
                if (RenderProcessService.getInstance().setSurfaceBufferSize(iTXVCubePlayer)) {
                    LiteavLog.i("TXCVodVideoView", "setSurfaceBufferSize succeed");
                }
                if (c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
                    TXCVodVideoView.d();
                    LiteavLog.i("TXCVodVideoView", "has advanced license!");
                }
                if (!TXCVodVideoView.f99952i) {
                    TXCVodVideoView.this.f99966c.checkSubtitle();
                }
                if (TXCVodVideoView.this.f99954a == 1) {
                    TXCVodVideoView.this.a(2013, 0, "VOD ready");
                    if (!TXCVodVideoView.this.f99967d.f99916p) {
                        TXCVodVideoView.this.f99965b = 4;
                    } else if (TXCVodVideoView.this.f99965b != 4) {
                        TXCVodVideoView.this.f99965b = 3;
                    }
                    TXCVodVideoView.this.f99954a = 2;
                }
                TXCVodVideoView.l(TXCVodVideoView.this);
                if (TXCVodVideoView.this.f99954a == -1) {
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99965b = 3;
                }
                TXCVodVideoView.this.f99980s = iTXVCubePlayer.getVideoWidth();
                TXCVodVideoView.this.f99981t = iTXVCubePlayer.getVideoHeight();
                if (TXCVodVideoView.this.f99980s != 0 && TXCVodVideoView.this.f99981t != 0 && TXCVodVideoView.this.E != null) {
                    TXCVodVideoView.this.E.a(TXCVodVideoView.this.f99980s, TXCVodVideoView.this.f99981t);
                    TXCVodVideoView.this.E.b(TXCVodVideoView.this.F, TXCVodVideoView.this.G);
                }
                if (TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }
        };
        this.f99956ad = new ITXVCubePlayer.d() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.8
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.d
            public final void a() {
                TXCVodVideoView.this.f99954a = 5;
                TXCVodVideoView.this.f99965b = 5;
                TXCVodVideoView.this.a(2006, 0, "Playback completed");
            }
        };
        this.f99957ae = new ITXVCubePlayer.f() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.9
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.f
            public final boolean a(int i11, int i12, int i13, Object obj) {
                if (i11 == 1006) {
                    if (!TextUtils.isEmpty(TXCVodVideoView.this.H) || obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                        return true;
                    }
                    try {
                        TXCVodVideoView.this.H = new JSONObject(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo).optString("cdnip");
                        return true;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return true;
                    }
                }
                if (i11 == 2007) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_PLAY_LOADING");
                    TXCVodVideoView.this.a(i11, 0, "Buffer started");
                    return true;
                }
                if (i11 == 2011) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VIDEO_CHANGE_ROTATION: ".concat(String.valueOf(i12)));
                    TXCVodVideoView.this.f99985x = i12;
                    if (TXCVodVideoView.this.f99967d.B && TXCVodVideoView.this.f99985x > 0) {
                        TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                        tXCVodVideoView.f99984w = tXCVodVideoView.f99985x;
                        if (TXCVodVideoView.this.E != null) {
                            TXCVodVideoView.this.E.setVideoRotation(TXCVodVideoView.this.f99984w);
                        }
                    }
                    TXCVodVideoView tXCVodVideoView2 = TXCVodVideoView.this;
                    String str = "Video angle " + TXCVodVideoView.this.f99985x;
                    int unused = TXCVodVideoView.this.f99985x;
                    tXCVodVideoView2.a(2011, 0, str);
                    return true;
                }
                if (i11 == 2014) {
                    LiteavLog.i("TXCVodVideoView", "EVT_VOD_PLAY_LOADING_END: eof ".concat(String.valueOf(i12)));
                    TXCVodVideoView.this.a(i11, 0, "Buffer ended");
                    if (i12 != 0) {
                        String str2 = TXCVodVideoView.this.f99967d.f99917q;
                        if (TextUtils.isEmpty(str2) && str2.endsWith("m3u8")) {
                            return true;
                        }
                    }
                    if (TXCVodVideoView.this.f99965b != 3) {
                        return true;
                    }
                    TXCVodVideoView.this.a(2004, 0, "Playback started");
                    TXCVodVideoView.this.f99954a = 3;
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(100);
                    TXCVodVideoView.this.f99978q.sendEmptyMessage(103);
                    return true;
                }
                if (i11 == 2020) {
                    long jLongValue = -1;
                    if (obj != null && (obj instanceof Long)) {
                        jLongValue = ((Long) obj).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_INDEX, (int) jLongValue);
                    bundle.putInt(TXVodConstants.EVT_KEY_SELECT_TRACK_ERROR_CODE, i13);
                    bundle.putString("description", "Select Track Complete");
                    LiteavLog.i("TXCVodVideoView", "VOD_PLAY_EVT_SELECT_TRACK_COMPLETE, trackIndex=" + jLongValue + " ,errorCode=" + i13);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2020, bundle);
                    return true;
                }
                if (i11 == 2026) {
                    LiteavLog.i("TXCVodVideoView", "EVT_AUDIO_JITTER_STATE_FIRST_PLAY");
                    TXCVodVideoView.this.a(i11, 0, "Audio first play");
                    return true;
                }
                TPPlayerMsg.TPVideoSeiInfo tPVideoSeiInfo = null;
                str3 = null;
                String str3 = null;
                tPVideoSeiInfo = null;
                if (i11 == 2030) {
                    if (!TXCVodVideoView.f99952i) {
                        return false;
                    }
                    if (obj != null && (obj instanceof TPPlayerMsg.TPVideoSeiInfo)) {
                        tPVideoSeiInfo = (TPPlayerMsg.TPVideoSeiInfo) obj;
                    }
                    if (tPVideoSeiInfo == null) {
                        LiteavLog.e("TXCVodVideoView", "VOD_PLAY_EVT_VIDEO_SEI, seiInfo is null");
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_TYPE, tPVideoSeiInfo.videoSeiType);
                    bundle2.putInt(TXVodConstants.EVT_KEY_SEI_SIZE, tPVideoSeiInfo.seiDataSize);
                    bundle2.putByteArray(TXVodConstants.EVT_KEY_SEI_DATA, tPVideoSeiInfo.seiData);
                    TXCVodVideoView.a(TXCVodVideoView.this, 2030, bundle2);
                    return true;
                }
                if (i11 == 2002) {
                    TXCVodVideoView.this.a(i11, 0, "hit cache");
                    return true;
                }
                if (i11 == 2003) {
                    LiteavLog.i("TXCVodVideoView", "EVT_RENDER_FIRST_I_FRAME");
                    if (TXCVodVideoView.this.f99972k) {
                        Bundle bundle3 = new Bundle();
                        if (TextUtils.isEmpty(TXCVodVideoView.this.f99973l) || !TXCVodVideoView.this.f99973l.equals(TXCVodVideoView.this.f99967d.f99917q)) {
                            bundle3.putString("support_hevc", "1");
                        } else {
                            bundle3.putString("support_hevc", "0");
                        }
                        TXCVodVideoView.this.a(i11, 0, "VOD displayed the first frame", bundle3);
                    } else {
                        TXCVodVideoView.this.a(i11, 0, "VOD displayed the first frame");
                    }
                    TXCVodVideoView tXCVodVideoView3 = TXCVodVideoView.this;
                    tXCVodVideoView3.setRate(tXCVodVideoView3.I);
                    TXCVodVideoView.p(TXCVodVideoView.this);
                    return true;
                }
                switch (i11) {
                    case 2016:
                        if (obj != null && (obj instanceof String)) {
                            TXCVodVideoView.this.H = (String) obj;
                        }
                        String str4 = "TCP Connect ServerIp:" + TXCVodVideoView.this.H + ",port:" + i12 + ",error:" + i13;
                        LiteavLog.i("TXCVodVideoView", str4);
                        if (i13 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i11, 0, str4);
                        return true;
                    case 2017:
                        TXCVodVideoView.this.a(i11, 0, "Video data received");
                        return true;
                    case 2018:
                        if (obj != null && (obj instanceof String)) {
                            str3 = (String) obj;
                        }
                        String str5 = "dns resolved url:" + str3 + ",error:" + i12;
                        LiteavLog.i("TXCVodVideoView", str5);
                        if (i12 != 0) {
                            return true;
                        }
                        TXCVodVideoView.this.a(i11, 0, str5);
                        return true;
                    default:
                        return true;
                }
            }
        };
        this.f99959ag = new ITXVCubePlayer.e() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.10
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.e
            public final boolean a(int i11, int i12) {
                LiteavLog.e("TXCVodVideoView", "[onError] vodErrorEvent: " + i11 + " ,errorCode: " + i12);
                TXCVodVideoView.this.f99954a = -1;
                TXCVodVideoView.this.f99965b = -1;
                if (i11 == -6101) {
                    if (TXCVodVideoView.this.D != null) {
                        Object obj = TXCVodVideoView.this.D.get("TXC_DRM_SIMPLE_AES_URL");
                        if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                            TXCVodVideoView.this.D.put("TXC_DRM_KEY_URL", null);
                            TXCVodVideoView.this.D.put("TXC_DRM_PROVISION_URL", null);
                            if (!TXCVodVideoView.this.g()) {
                                TXCVodVideoView.this.a(false);
                            }
                            return true;
                        }
                    }
                    TXCVodVideoView.this.a(TXVodConstants.VOD_PLAY_ERR_DRM, i12, "DRM play failed cause by " + i12 + ".");
                    return true;
                }
                if (i11 != -6004) {
                    switch (i11) {
                        case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                        case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                            break;
                        case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                            TXCVodVideoView.w(TXCVodVideoView.this);
                            break;
                        default:
                            switch (i11) {
                                case -2305:
                                    TXCVodVideoView.x(TXCVodVideoView.this);
                                    break;
                                case -2304:
                                    TXCVodVideoView.v(TXCVodVideoView.this);
                                    break;
                                case -2303:
                                    TXCVodVideoView.this.a(-2303, i12, "The file does not exist");
                                    TXCVodVideoView.this.a();
                                    break;
                                default:
                                    long currentPosition = TXCVodVideoView.this.getCurrentPosition() - TXCVodVideoView.this.K;
                                    if (currentPosition < 0 || currentPosition > 500) {
                                        TXCVodVideoView.z(TXCVodVideoView.this);
                                    }
                                    TXCVodVideoView tXCVodVideoView = TXCVodVideoView.this;
                                    tXCVodVideoView.K = tXCVodVideoView.getCurrentPosition();
                                    if (TXCVodVideoView.A(TXCVodVideoView.this) >= TXCVodVideoView.this.f99967d.f99901a) {
                                        TXCVodVideoView.this.a(-2301, i12, "Disconnected from the network. Playback error");
                                        TXCVodVideoView.this.a();
                                    } else if (TXCVodVideoView.this.f99978q != null) {
                                        TXCVodVideoView.this.f99978q.sendEmptyMessageDelayed(102, (long) (TXCVodVideoView.this.f99967d.f99902b * 1000.0f));
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }
                TXCVodVideoView.this.a(i11, i12, TXCVodVideoView.a(i11));
                TXCVodVideoView.this.a();
                return true;
            }
        };
        this.f99960ah = new ITXVCubePlayer.h() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.11
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.h
            public final void a() {
                LiteavLog.v("TXCVodVideoView", "seek complete");
                TXCVodVideoView.B(TXCVodVideoView.this);
                TXCVodVideoView.this.a(2019, 0, "seek complete");
            }
        };
        this.f99961ai = new ITXVCubePlayer.i() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.12
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.i
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleData tPSubtitleData) {
                if (TXCVodVideoView.f99952i && TXCVodVideoView.this.f99955aa != null) {
                    TXCVodVideoView.this.f99955aa.a(iTXVCubePlayer, tPSubtitleData);
                }
            }
        };
        this.f99962aj = new ITXVCubePlayer.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.2
            @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.b
            public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
                if (tPSubtitleFrameBuffer == null || TXCVodVideoView.this.V == null) {
                    return;
                }
                TXCVodVideoView.this.V.a(iTXVCubePlayer, tPSubtitleFrameBuffer);
            }
        };
        this.f99977p = new com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.3
            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceCreated: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceCreated");
                TXCVodVideoView.this.B = true;
                TXCVodVideoView.this.f99979r = bVar;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.b(TXCVodVideoView.this.f99966c, bVar);
                } else {
                    TXCVodVideoView.this.g();
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void a(com.tencent.liteav.txcvodplayer.renderer.a.b bVar, int i11, int i12) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceChanged: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceChanged");
                TXCVodVideoView.this.f99982u = i11;
                TXCVodVideoView.this.f99983v = i12;
                boolean z10 = true;
                boolean z11 = TXCVodVideoView.this.f99965b == 3;
                if (TXCVodVideoView.this.E.a() && (TXCVodVideoView.this.f99980s != i11 || TXCVodVideoView.this.f99981t != i12)) {
                    z10 = false;
                }
                if (TXCVodVideoView.this.f99966c != null && z11 && z10 && TXCVodVideoView.this.f99965b == 3) {
                    TXCVodVideoView.this.b(false);
                }
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final boolean a(MotionEvent motionEvent) {
                return RenderProcessService.getInstance().onTouchEvent(TXCVodVideoView.this.f99966c, motionEvent);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.InterfaceC0964a
            public final void b(com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
                if (bVar.a() != TXCVodVideoView.this.E) {
                    LiteavLog.e("TXCVodVideoView", "onSurfaceDestroyed: unmatched render callback\n");
                    return;
                }
                LiteavLog.i("TXCVodVideoView", "onSurfaceDestroyed");
                TXCVodVideoView.this.B = false;
                TXCVodVideoView.this.f99979r = null;
                if (TXCVodVideoView.this.f99966c != null) {
                    TXCVodVideoView.this.f99966c.setSurface(null);
                }
                ITXVCubePlayer iTXVCubePlayer = TXCVodVideoView.this.f99966c;
                if (iTXVCubePlayer != null) {
                    iTXVCubePlayer.setDisplay(null);
                }
            }
        };
        this.f99963ak = 0;
        this.am = false;
        a(context);
    }

    static /* synthetic */ int A(TXCVodVideoView tXCVodVideoView) {
        int i10 = tXCVodVideoView.f99958af;
        tXCVodVideoView.f99958af = i10 + 1;
        return i10;
    }

    static /* synthetic */ boolean B(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.L = false;
        return false;
    }

    static /* synthetic */ String a(int i10) {
        if (i10 == -6101) {
            return "PLAY_ERR_DRM";
        }
        switch (i10) {
            case TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL /* -6011 */:
                return "DOWNLOAD_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                return "PROCESS_VIDEO_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                return "RENDER_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                return "DECODE_SUBTITLE_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                return "DECODE_AUDIO_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                return "DECODE_VIDEO_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT /* -6005 */:
                return "DEMUXER_TIMEOUT";
            case TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL /* -6004 */:
                return "SYSTEM_PLAY_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL /* -6003 */:
                return "DEMUXER_FAIL";
            case TXVodConstants.VOD_PLAY_ERR_GENERAL /* -6002 */:
                return "ERR_GENERAL";
            default:
                return "ERR_UNKNOW";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        a(i10, i11, str, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str, Bundle bundle) {
        if ((i10 == -2304 || i10 == 2106) && this.am) {
            return;
        }
        Message message = new Message();
        message.what = 101;
        Bundle bundle2 = new Bundle();
        message.arg1 = i10;
        String str2 = "(" + i10 + Constants.ACCEPT_TIME_SEPARATOR_SP + i11 + ")-" + str;
        bundle2.putString("description", str2);
        bundle2.putInt(TXVodConstants.EVT_ERROR_CODE, i11);
        if (bundle != null) {
            bundle2.putBundle("extra", bundle);
        }
        message.setData(bundle2);
        Handler handler = this.f99978q;
        if (handler != null) {
            handler.sendMessage(message);
            LiteavLog.i("TXCVodVideoView", "sendSimpleEvent " + str2 + " ,vod=" + hashCode());
        }
        this.am = i10 == -2304 || i10 == 2106;
    }

    private void a(Context context) {
        this.C = context.getApplicationContext();
        this.f99967d = new e();
        setRender(0);
        this.f99980s = 0;
        this.f99981t = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f99954a = 0;
        this.f99965b = 0;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f99978q = new a(this, mainLooper);
        } else {
            this.f99978q = null;
        }
    }

    private static void a(ITXVCubePlayer iTXVCubePlayer) {
        if (iTXVCubePlayer != null) {
            RenderProcessService.getInstance().stopRenderProcess(iTXVCubePlayer);
        }
    }

    static /* synthetic */ void a(TXCVodVideoView tXCVodVideoView, int i10, Bundle bundle) {
        d dVar = tXCVodVideoView.f99964al;
        if (dVar != null) {
            dVar.a(i10, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ITXVCubePlayer iTXVCubePlayer, com.tencent.liteav.txcvodplayer.renderer.a.b bVar) {
        if (iTXVCubePlayer == null) {
            return;
        }
        if (bVar == null) {
            iTXVCubePlayer.setDisplay(null);
            return;
        }
        LiteavLog.i("TXCVodVideoView", "bindSurfaceHolder");
        Surface surfaceC = bVar.c();
        if (surfaceC == null) {
            surfaceC = bVar.b();
        }
        if (RenderProcessService.getInstance().connectPlayer(iTXVCubePlayer, surfaceC)) {
            return;
        }
        bVar.a(iTXVCubePlayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    public void d(boolean z10) {
        int i10;
        ITXVCubePlayer iTXVCubePlayer;
        int i11;
        LiteavLog.i("TXCVodVideoView", "replay, isFromErrorState = " + z10 + " vod=" + hashCode());
        if (z10) {
            long j10 = this.f99986y;
            if (j10 > 0) {
                this.f99987z = j10;
                if (this.L && (i11 = this.M) >= 0) {
                    this.f99987z = i11;
                }
            } else if (this.f99987z == 0 || (iTXVCubePlayer = this.f99966c) == null) {
                if (this.L && (i10 = this.M) >= 0) {
                    this.f99987z = i10;
                }
            } else if (this.A > 0) {
                long currentPosition = (int) iTXVCubePlayer.getCurrentPosition();
                this.f99987z = currentPosition;
                int i12 = this.M;
                if (currentPosition < i12) {
                    this.f99987z = i12;
                }
            }
        } else if (this.f99987z == 0) {
            if (this.L) {
                this.f99987z = i10;
            }
        } else if (this.L) {
            this.f99987z = i10;
        }
        if (g()) {
            return;
        }
        a(false);
    }

    static /* synthetic */ boolean d() {
        f99952i = true;
        return true;
    }

    static /* synthetic */ boolean f() {
        f99950ab = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        LiteavLog.i("TXCVodVideoView", "openVideo vod=" + hashCode());
        if (TextUtils.isEmpty(this.f99967d.f99917q)) {
            return false;
        }
        a(false);
        if (this.f99968e) {
            ((AudioManager) this.C.getSystemService("audio")).requestAudioFocus(null, 3, 2);
        }
        try {
            ITXVCubePlayer iTXVCubePlayerA = f.a(this.C);
            this.f99966c = iTXVCubePlayerA;
            Object obj = this.f99970g;
            if (obj != null && iTXVCubePlayerA != null) {
                iTXVCubePlayerA.attachTRTC(obj);
            }
            e eVar = this.f99967d;
            String str = eVar.f99917q;
            eVar.f99915o = this.f99987z;
            int i10 = this.S;
            if (i10 >= 0) {
                eVar.f99919s = i10;
            }
            int i11 = this.R;
            if (i11 >= 0) {
                eVar.f99918r = i11;
            }
            long j10 = this.J;
            if (j10 > 0) {
                eVar.f99920t = j10;
            }
            int i12 = this.Q;
            if (i12 == -1) {
                eVar.f99926z = true;
                this.f99966c.enableAdaptiveBitrate();
            } else {
                eVar.f99926z = false;
                this.f99966c.setBitrateIndex(i12);
            }
            this.f99966c.setPrivateConfig(this.D);
            this.f99966c.setConfig(this.f99967d);
            int i13 = this.T;
            if (i13 > 0) {
                this.f99966c.setAutoMaxBitrate(i13);
            }
            if (this.f99967d.f99908h != null) {
                this.f99966c.setDataSource(this.C, Uri.parse(str), this.f99967d.f99908h);
            } else {
                this.f99966c.setDataSource(str);
            }
            List<b> list = this.f99971h;
            if (list != null && !list.isEmpty()) {
                for (b bVar : this.f99971h) {
                    this.f99966c.addSubtitleSource(bVar.f100004a, bVar.f100005b, bVar.f100006c);
                }
            }
            TXSubtitleRenderModel tXSubtitleRenderModel = this.W;
            if (tXSubtitleRenderModel != null) {
                this.f99966c.setSubtitleStyle(tXSubtitleRenderModel);
            }
            this.f99966c.setOnPreparedListener(this.f99976o);
            this.f99966c.setOnVideoSizeChangedListener(this.f99975n);
            this.f99966c.setOnCompletionListener(this.f99956ad);
            this.f99966c.setOnErrorListener(this.f99959ag);
            this.f99966c.setOnInfoListener(this.f99957ae);
            this.f99966c.setOnSeekCompleteListener(this.f99960ah);
            this.f99966c.setOnSubtitleDataListener(this.f99961ai);
            this.f99966c.setOnGetTXCVodVideoViewTargetState(new ITXVCubePlayer.a() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.5
                @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.a
                public final int a() {
                    return TXCVodVideoView.this.f99965b;
                }
            });
            this.f99966c.setOnSubtitleFrameDataListener(this.f99962aj);
            b(this.f99966c, this.f99979r);
            this.f99966c.setAudioStreamType(3);
            this.f99966c.setScreenOnWhilePlaying(true);
            this.f99966c.prepareAsync();
            this.f99966c.setAudioVolume(this.N);
            float f10 = this.O;
            if (f10 != -100.0f) {
                this.f99966c.setAudioNormalization(f10);
            }
            setMute(this.P);
            this.f99954a = 1;
        } catch (FileNotFoundException unused) {
            this.f99954a = -1;
            this.f99965b = -1;
            this.f99959ag.a(-2303, -2303);
        } catch (Exception e10) {
            LiteavLog.w("TXCVodVideoView", Log.getStackTraceString(e10));
            this.f99954a = -1;
            this.f99965b = -1;
            this.f99959ag.a(TXVodConstants.VOD_PLAY_ERR_UNKNOW, 0);
        }
        return true;
    }

    private void h() {
        a(2031, 0, "Vod HEVC downgrade playback");
    }

    private void i() {
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setOnPreparedListener(null);
            this.f99966c.setOnVideoSizeChangedListener(null);
            this.f99966c.setOnCompletionListener(null);
            this.f99966c.setOnErrorListener(null);
            this.f99966c.setOnInfoListener(null);
            this.f99966c.setOnBufferingUpdateListener(null);
            this.f99966c.setOnSeekCompleteListener(null);
            this.f99966c.setOnSubtitleDataListener(null);
            this.f99966c.setOnGetTXCVodVideoViewTargetState(null);
            this.f99966c.setOnSubtitleFrameDataListener(null);
        }
    }

    static /* synthetic */ long l(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f99987z = 0L;
        return 0L;
    }

    static /* synthetic */ boolean p(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.U = true;
        return true;
    }

    static /* synthetic */ void v(TXCVodVideoView tXCVodVideoView) {
        LiteavLog.i("TXCVodVideoView", "onHevcVideoDecoderError");
        f99951ac = true;
        if (!f99952i) {
            f99952i = c.a(LicenseChecker.a.PLAYER_PREMIUM);
            LiteavLog.i("TXCVodVideoView", "has advanced license!");
        }
        if (!f99952i || TextUtils.isEmpty(tXCVodVideoView.f99973l) || tXCVodVideoView.f99967d.f99917q.equals(tXCVodVideoView.f99973l)) {
            tXCVodVideoView.a(-2304, 0, "Vod H265 decoding failed");
            return;
        }
        e eVar = tXCVodVideoView.f99967d;
        eVar.f99917q = tXCVodVideoView.f99973l;
        eVar.D = tXCVodVideoView.f99974m;
        long j10 = eVar.f99915o;
        if (j10 > 0) {
            tXCVodVideoView.f99987z = j10;
        }
        tXCVodVideoView.h();
        if (tXCVodVideoView.g()) {
            return;
        }
        tXCVodVideoView.a(false);
    }

    static /* synthetic */ void w(TXCVodVideoView tXCVodVideoView) {
        LiteavLog.d("TXCVodVideoView", "onError onVideoDecoderError");
        if (tXCVodVideoView.f99954a != 4 && f99952i && !TextUtils.isEmpty(tXCVodVideoView.f99973l) && !tXCVodVideoView.f99967d.f99917q.equals(tXCVodVideoView.f99973l)) {
            e eVar = tXCVodVideoView.f99967d;
            eVar.f99917q = tXCVodVideoView.f99973l;
            eVar.D = tXCVodVideoView.f99974m;
            long j10 = eVar.f99915o;
            if (j10 > 0) {
                tXCVodVideoView.f99987z = j10;
            }
            tXCVodVideoView.h();
            if (tXCVodVideoView.g()) {
                return;
            }
            tXCVodVideoView.a(false);
            return;
        }
        if (tXCVodVideoView.U || !tXCVodVideoView.f99967d.f99904d) {
            tXCVodVideoView.a(TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL, 0, "VOD decoding failed");
            return;
        }
        if (Math.min(tXCVodVideoView.f99981t, tXCVodVideoView.f99980s) < 1080) {
            e eVar2 = tXCVodVideoView.f99967d;
            if (eVar2.f99904d) {
                eVar2.f99904d = false;
                tXCVodVideoView.d(false);
            }
        }
    }

    static /* synthetic */ void x(TXCVodVideoView tXCVodVideoView) {
        LiteavLog.e("TXCVodVideoView", "onHLSKeyError");
        tXCVodVideoView.a(-2305, 0, "HLS decypt key get failed");
        ITXVCubePlayer iTXVCubePlayer = tXCVodVideoView.f99966c;
        if (iTXVCubePlayer != null) {
            try {
                iTXVCubePlayer.stop();
            } catch (Exception e10) {
                LiteavLog.e("TXCVodVideoView", "onHLSKeyError stop Exception: " + e10.getMessage());
            }
            tXCVodVideoView.f99966c.release();
            tXCVodVideoView.f99966c = null;
        }
        tXCVodVideoView.f99954a = -1;
        tXCVodVideoView.f99965b = -1;
    }

    static /* synthetic */ int z(TXCVodVideoView tXCVodVideoView) {
        tXCVodVideoView.f99958af = 0;
        return 0;
    }

    public final void a() {
        Handler handler = this.f99978q;
        if (handler != null) {
            handler.removeMessages(102);
            this.f99978q.removeMessages(100);
            this.f99978q.removeMessages(103);
        }
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            try {
                iTXVCubePlayer.stop();
                this.f99967d.f99917q = null;
                a(true);
            } catch (Exception e10) {
                LiteavLog.e("TXCVodVideoView", "stop exception: " + e10.getMessage());
            }
        }
        LiteavLog.i("TXCVodVideoView", "stop vod=" + hashCode());
    }

    public final void a(int i10, boolean z10) {
        LiteavLog.i("TXCVodVideoView", "seek to " + i10 + ", isAccurateSeek=" + z10 + ", vod=" + hashCode());
        int iMin = Math.min(i10, getDuration());
        if (iMin >= 0 && b()) {
            try {
                this.M = iMin;
                this.f99966c.seekTo(iMin, z10);
                this.L = true;
                if (this.f99954a == 5) {
                    this.f99965b = 3;
                }
            } catch (Exception e10) {
                LiteavLog.e("TXCVodVideoView", "seekTo Exception : " + e10.getMessage());
            }
        }
    }

    final void a(boolean z10) {
        if (this.f99966c != null) {
            LiteavLog.i("TXCVodVideoView", "release player " + this.f99966c);
            a(this.f99966c);
            this.f99966c.release();
            i();
            this.f99966c = null;
            this.f99954a = 0;
            this.L = false;
            this.M = -1;
            if (z10) {
                this.f99965b = 0;
                this.f99980s = 0;
                this.f99981t = 0;
                this.I = 1.0f;
                this.U = false;
                this.Q = -1000;
                this.R = -1;
                this.S = -1000;
                List<b> list = this.f99971h;
                if (list != null) {
                    list.clear();
                }
                this.f99986y = 0L;
            }
            if (this.f99968e && LiteavSystemInfo.getSystemOSVersionInt() >= 8) {
                ((AudioManager) this.C.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.L = false;
            this.M = -1;
        }
    }

    public final void b(boolean z10) {
        LiteavLog.i("TXCVodVideoView", "start vod=" + hashCode());
        if (b()) {
            try {
                if (this.f99954a != 3 && !this.L) {
                    this.f99954a = 3;
                    if (!z10) {
                        a(2004, 0, "Playback started");
                    }
                    Handler handler = this.f99978q;
                    if (handler != null) {
                        handler.sendEmptyMessage(100);
                        this.f99978q.sendEmptyMessage(103);
                    }
                }
                this.f99966c.start();
            } catch (Exception e10) {
                LiteavLog.e("TXCVodVideoView", "start exception: " + e10.getMessage());
            }
        }
        this.f99965b = 3;
    }

    public final boolean b() {
        int i10;
        return (this.f99966c == null || (i10 = this.f99954a) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    public final void c() {
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.publishAudioToNetwork();
        }
    }

    public final boolean c(boolean z10) {
        if (this.f99954a != 0) {
            return false;
        }
        this.f99968e = z10;
        return true;
    }

    public int getBitrateIndex() {
        int i10 = this.Q;
        if (i10 == -1) {
            return i10;
        }
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            this.Q = iTXVCubePlayer.getBitrateIndex();
        }
        return this.Q;
    }

    public long getBufferDuration() {
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer == null) {
            return 0L;
        }
        long playableDurationMs = iTXVCubePlayer.getPlayableDurationMs();
        long currentPosition = getCurrentPosition();
        if (this.f99954a == 3) {
            this.f99986y = currentPosition;
        }
        if (playableDurationMs < currentPosition) {
            playableDurationMs = currentPosition;
        }
        return Math.abs(((long) getDuration()) - playableDurationMs) < 1000 ? getDuration() : playableDurationMs;
    }

    public long getCurrentPosition() {
        int i10;
        if (this.L && (i10 = this.M) >= 0) {
            return i10;
        }
        long currentPosition = this.f99987z;
        if (currentPosition <= 0) {
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            currentPosition = iTXVCubePlayer != null ? iTXVCubePlayer.getCurrentPosition() : 0L;
        }
        if (this.f99967d.f99909i) {
            return currentPosition;
        }
        int i11 = this.M;
        return currentPosition < ((long) i11) ? i11 : currentPosition;
    }

    public int getDuration() {
        int duration;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null && (duration = (int) iTXVCubePlayer.getDuration()) > 0) {
            this.A = duration;
        }
        return this.A;
    }

    public com.tencent.liteav.txcplayer.model.b getMediaInfo() {
        try {
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            if (iTXVCubePlayer == null) {
                return null;
            }
            return iTXVCubePlayer.getMediaInfo();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public int getMetaRotationDegree() {
        return this.f99985x;
    }

    public int getPlayerType() {
        return 2;
    }

    public String getServerIp() {
        return this.H;
    }

    public ArrayList<com.tencent.liteav.txcplayer.model.a> getSupportedBitrates() {
        try {
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            return iTXVCubePlayer != null ? iTXVCubePlayer.getSupportedBitrates() : new ArrayList<>();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return new ArrayList<>();
        }
    }

    public TPTrackInfo[] getTrackInfo() {
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            return iTXVCubePlayer.getTrackInfo();
        }
        return null;
    }

    String getUrlPathExtention() {
        String str = this.f99967d.f99917q;
        return !TextUtils.isEmpty(str) ? str.substring(str.lastIndexOf(".") + 1, str.length()) : "";
    }

    public int getVideoHeight() {
        return this.f99981t;
    }

    public int getVideoRotationDegree() {
        return this.f99984w;
    }

    public int getVideoWidth() {
        return this.f99980s;
    }

    public void setAudioNormalization(float f10) {
        if (c.a(LicenseChecker.a.PLAYER_PREMIUM)) {
            float f11 = this.O;
            if (f11 == f10) {
                return;
            }
            boolean z10 = f11 == 1.0f;
            this.O = f10;
            LiteavLog.i("TXCVodVideoView", "setAudioNormalization ".concat(String.valueOf(f10)));
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.setAudioNormalization(f10);
                if (z10 || this.f99987z != 0) {
                    return;
                }
                long currentPosition = this.f99966c.getCurrentPosition();
                if (currentPosition > 0) {
                    ITXVCubePlayer iTXVCubePlayer2 = this.f99966c;
                    e eVar = this.f99967d;
                    iTXVCubePlayer2.seekTo(currentPosition, eVar != null ? eVar.f99909i : false);
                }
            }
        }
    }

    public void setAudioPlayoutVolume(int i10) {
        if (i10 > 0) {
            this.N = i10;
        }
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setAudioVolume(i10);
        }
    }

    public void setAutoMaxBitrate(int i10) {
        this.T = i10;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer == null || i10 <= 0) {
            return;
        }
        iTXVCubePlayer.setAutoMaxBitrate(i10);
    }

    public void setAutoPlay(boolean z10) {
        this.f99967d.f99916p = z10;
    }

    public void setBitrateIndex(int i10) {
        LiteavLog.i("TXCVodVideoView", "setBitrateIndex " + i10 + " vod=" + hashCode());
        if (getBitrateIndex() == i10 || i10 == -1000) {
            return;
        }
        this.Q = i10;
        if (this.f99954a == 5) {
            return;
        }
        try {
            ArrayList<com.tencent.liteav.txcplayer.model.a> supportedBitrates = getSupportedBitrates();
            if (supportedBitrates != null && supportedBitrates.size() > 0 && i10 != -1) {
                for (com.tencent.liteav.txcplayer.model.a aVar : supportedBitrates) {
                    if (aVar != null && aVar.f99928a == i10) {
                        this.R = aVar.f99931d;
                        this.S = i10;
                        break;
                    }
                }
            }
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            if (iTXVCubePlayer != null) {
                if (!this.f99967d.f99910j || i10 == -1 || iTXVCubePlayer.getBitrateIndex() == -1) {
                    d(false);
                } else {
                    this.f99966c.setBitrateIndex(i10);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setConfig(e eVar) {
        e eVar2 = this.f99967d;
        String str = eVar2 != null ? eVar2.f99917q : null;
        if (eVar != null) {
            this.f99967d = eVar;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f99967d.f99917q = str;
        }
    }

    public void setListener(d dVar) {
        this.f99964al = dVar;
    }

    public void setMute(boolean z10) {
        this.P = z10;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer == null) {
            return;
        }
        if (z10) {
            iTXVCubePlayer.setAudioVolume(0);
        } else {
            iTXVCubePlayer.setAudioVolume(this.N);
        }
    }

    public void setPlayerType(int i10) {
    }

    public void setPrivateConfig(Map<String, Object> map) {
        this.D = map;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setPrivateConfig(map);
        }
    }

    public void setRate(float f10) {
        LiteavLog.i("TXCVodVideoView", "setRate ".concat(String.valueOf(f10)));
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setRate(f10);
        }
        this.I = f10;
    }

    public void setRender(int i10) {
        if (i10 == 0) {
            setRenderView(null);
            return;
        }
        if (i10 == 1) {
            setRenderView(new SurfaceRenderView(this.C));
            return;
        }
        if (i10 != 2) {
            LiteavLog.e("TXCVodVideoView", String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
            return;
        }
        TextureRenderView textureRenderView = new TextureRenderView(this.C);
        if (this.f99966c != null) {
            textureRenderView.getSurfaceHolder().a(this.f99966c);
            textureRenderView.a(this.f99966c.getVideoWidth(), this.f99966c.getVideoHeight());
            textureRenderView.b(this.f99966c.getVideoSarNum(), this.f99966c.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f99963ak);
        }
        setRenderView(textureRenderView);
    }

    public void setRenderMode(int i10) {
        this.f99963ak = i10;
        com.tencent.liteav.txcvodplayer.renderer.a aVar = this.E;
        if (aVar != null) {
            aVar.setAspectRatio(i10);
        }
        com.tencent.liteav.txcvodplayer.renderer.a aVar2 = this.E;
        if (aVar2 != null) {
            aVar2.setVideoRotation(this.f99984w);
        }
    }

    public void setRenderSurface(final Surface surface) {
        com.tencent.liteav.txcvodplayer.renderer.a.b bVar = new com.tencent.liteav.txcvodplayer.renderer.a.b() { // from class: com.tencent.liteav.txcvodplayer.TXCVodVideoView.1
            @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
            public final com.tencent.liteav.txcvodplayer.renderer.a a() {
                return TXCVodVideoView.this.E;
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
            public final void a(ITXVCubePlayer iTXVCubePlayer) {
                iTXVCubePlayer.setSurface(surface);
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
            public final Surface b() {
                return null;
            }

            @Override // com.tencent.liteav.txcvodplayer.renderer.a.b
            public final Surface c() {
                return surface;
            }
        };
        this.f99979r = bVar;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            b(iTXVCubePlayer, bVar);
        }
    }

    public void setRenderView(com.tencent.liteav.txcvodplayer.renderer.a aVar) {
        int i10;
        int i11;
        LiteavLog.i("TXCVodVideoView", "setRenderView ".concat(String.valueOf(aVar)));
        if (this.E != null) {
            ITXVCubePlayer iTXVCubePlayer = this.f99966c;
            if (iTXVCubePlayer != null) {
                iTXVCubePlayer.setDisplay(null);
            }
            View view = this.E.getView();
            this.E.b(this.f99977p);
            this.E = null;
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        if (aVar == null) {
            return;
        }
        this.E = aVar;
        aVar.setAspectRatio(this.f99963ak);
        int i12 = this.f99980s;
        if (i12 > 0 && (i11 = this.f99981t) > 0) {
            aVar.a(i12, i11);
        }
        int i13 = this.F;
        if (i13 > 0 && (i10 = this.G) > 0) {
            aVar.b(i13, i10);
        }
        View view2 = this.E.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        if (view2.getParent() == null) {
            addView(view2);
        }
        this.E.a(this.f99977p);
        this.E.setVideoRotation(this.f99984w);
    }

    public void setStartTime(float f10) {
        this.f99987z = (long) (f10 * 1000.0f);
    }

    public void setSubtitleStyle(TXSubtitleRenderModel tXSubtitleRenderModel) {
        this.W = tXSubtitleRenderModel;
        ITXVCubePlayer iTXVCubePlayer = this.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.setSubtitleStyle(tXSubtitleRenderModel);
        }
    }

    public void setTXCOnSubtitleDataListener(ITXVCubePlayer.i iVar) {
        this.f99955aa = iVar;
    }

    public void setTXCOnSubtitleFrameDataListener(ITXVCubePlayer.b bVar) {
        this.V = bVar;
    }

    public void setTextureRenderView(TextureRenderView textureRenderView) {
        LiteavLog.i("TXCVodVideoView", "setTextureRenderView ".concat(String.valueOf(textureRenderView)));
        if (this.f99966c != null) {
            textureRenderView.getSurfaceHolder().a(this.f99966c);
            textureRenderView.a(this.f99966c.getVideoWidth(), this.f99966c.getVideoHeight());
            textureRenderView.b(this.f99966c.getVideoSarNum(), this.f99966c.getVideoSarDen());
            textureRenderView.setAspectRatio(this.f99963ak);
        }
        setRenderView(textureRenderView);
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoRotationDegree(int i10) {
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            if (i10 != 360) {
                LiteavLog.e("TXCVodVideoView", "not support degree ".concat(String.valueOf(i10)));
                return;
            }
            i10 = 0;
        }
        this.f99984w = i10;
        com.tencent.liteav.txcvodplayer.renderer.a aVar = this.E;
        if (aVar != null) {
            aVar.setVideoRotation(i10);
        }
        com.tencent.liteav.txcvodplayer.renderer.a aVar2 = this.E;
        if (aVar2 != null) {
            aVar2.setAspectRatio(this.f99963ak);
        }
    }

    public void setVideoURI(Uri uri) {
        if (uri != null) {
            this.f99967d.f99917q = uri.toString();
            if (f99952i && this.f99972k && !TextUtils.isEmpty(this.f99973l) && !f99950ab && f99951ac) {
                e eVar = this.f99967d;
                eVar.D = this.f99974m;
                eVar.f99917q = this.f99973l;
                h();
            }
        }
        this.A = 0;
        this.M = -1;
        this.f99958af = 0;
        this.H = null;
        LiteavLog.i("TXCVodVideoView", "setVideoURI ".concat(String.valueOf(uri)));
        g();
        requestLayout();
        invalidate();
    }
}
