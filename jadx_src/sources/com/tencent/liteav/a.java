package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.base.util.l;
import com.tencent.liteav.base.util.s;
import com.tencent.liteav.base.util.u;
import com.tencent.liteav.sdk.common.LicenseChecker;
import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import com.tencent.liteav.txcplayer.common.VodPlayerControl;
import com.tencent.liteav.txcplayer.ext.service.RenderProcessService;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.liteav.txcvodplayer.renderer.c;
import com.tencent.liteav.txcvodplayer.renderer.d;
import com.tencent.liteav.txcvodplayer.renderer.e;
import com.tencent.liteav.txcvodplayer.renderer.h;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXPlayInfoParams;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.TXTrackInfo;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.rtmp.TXVodDef;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.rtmp.ui.TXSubtitleView;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d.a {
    public d A;
    public Object B;
    public TXSubtitleView C;
    private Context E;
    private HashMap<String, String> F;
    private long I;
    private int J;
    private int K;
    private boolean L;
    private b M;
    private boolean N;
    private boolean O;
    private c P;
    private PixelFrame R;
    private HandlerC0957a S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ITXLivePlayListener f99478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITXVodPlayListener f99479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TXVodPlayer f99480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TXCVodVideoView f99481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TXVodPlayConfig f99482f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f99484h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Surface f99488l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f99490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<String, Object> f99491o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TXPlayInfoParams f99494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.tencent.liteav.txcvodplayer.b.c.b f99495s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.tencent.liteav.txcvodplayer.b.d f99499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f99500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f99501y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected float f99502z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TXCloudVideoView f99477a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.tencent.liteav.txcvodplayer.a.a f99483g = null;
    private boolean G = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f99485i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f99486j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f99487k = true;
    private float H = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f99489m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f99492p = -1000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f99493q = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f99496t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f99497u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f99498v = -1;
    public int D = -1;
    private AtomicBoolean Q = new AtomicBoolean(false);
    private com.tencent.liteav.txcplayer.d T = new com.tencent.liteav.txcplayer.d() { // from class: com.tencent.liteav.a.3
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:126:0x0378  */
        /* JADX WARN: Code duplicated, block: B:128:0x038e  */
        /* JADX WARN: Code duplicated, block: B:132:0x0396  */
        /* JADX WARN: Switch 'out' block B:116:0x0336 for B:26:0x0048 already processed. Defaulting to fallback option. */
        @Override // com.tencent.liteav.txcplayer.d
        public final void a(int i10, Bundle bundle) {
            com.tencent.liteav.txcvodplayer.a.a aVar;
            int iCurrentTimeMillis;
            int i11;
            String str;
            Bundle bundle2 = new Bundle(bundle);
            if (i10 == -6101) {
                a.this.f99483g.a(TXVodConstants.VOD_PLAY_ERR_DRM, bundle.getString("description", ""));
            } else if (i10 == -2301) {
                a.this.f99483g.a(-2301, bundle.getString("description", ""));
            } else if (i10 == 2011) {
                bundle2.putInt("EVT_PARAM1", a.this.f99481e.getMetaRotationDegree());
            } else if (i10 != 2026 && i10 != 2103) {
                if (i10 != 2106) {
                    if (i10 != 2013) {
                        int i12 = 0;
                        if (i10 == 2014) {
                            aVar = a.this.f99483g;
                            if (!aVar.f100022p && aVar.f100018l != -1 && !aVar.f100014h && !aVar.f100024r) {
                                LiteavLog.i("TXCVodPlayCollection", "setLoadEnd mFirstFrame=" + aVar.f100018l + " , mIsLoading = " + aVar.f100023q + ",mBeginLoadTS = " + aVar.f100011e);
                                if (aVar.f100023q) {
                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - aVar.f100011e);
                                    aVar.f100020n += iCurrentTimeMillis;
                                    aVar.f100019m++;
                                    if (aVar.f100021o < iCurrentTimeMillis) {
                                        aVar.f100021o = iCurrentTimeMillis;
                                    }
                                    aVar.f100023q = false;
                                }
                            }
                            if (aVar.f100022p) {
                                aVar.f100022p = false;
                            }
                            a.this.f99483g.e();
                        } else if (i10 != 2030 && i10 != 2031) {
                            switch (i10) {
                                case TXVodConstants.VOD_PLAY_ERR_DOWNLOAD_FAIL /* -6011 */:
                                case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                                case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                                case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_TIMEOUT /* -6005 */:
                                case TXVodConstants.VOD_PLAY_ERR_SYSTEM_PLAY_FAIL /* -6004 */:
                                case TXVodConstants.VOD_PLAY_ERR_DEMUXER_FAIL /* -6003 */:
                                case TXVodConstants.VOD_PLAY_ERR_GENERAL /* -6002 */:
                                case TXVodConstants.VOD_PLAY_ERR_UNKNOW /* -6001 */:
                                    a.this.f99483g.a(i10, bundle.getString("description", ""));
                                    break;
                                default:
                                    switch (i10) {
                                        case -2305:
                                            a.this.f99483g.a(-2305, "HLS decrypt key error");
                                            break;
                                        case -2304:
                                            a.this.f99483g.a(-2304, "h265 decode failed");
                                            a.this.f99483g.a("support_hevc", "0");
                                            if (!a.this.f99484h) {
                                                a.n(a.this);
                                                a aVar2 = a.this;
                                                aVar2.a(aVar2.f99482f);
                                            }
                                            break;
                                        case -2303:
                                            a.this.f99483g.a(-2303, "file not found");
                                            break;
                                        default:
                                            switch (i10) {
                                                case 2002:
                                                case 2008:
                                                    break;
                                                case 2003:
                                                    Bundle bundle3 = bundle2.getBundle("extra");
                                                    if (bundle3 != null) {
                                                        String string = bundle3.getString("support_hevc");
                                                        if (!TextUtils.isEmpty(string)) {
                                                            a.this.f99483g.a("support_hevc", string);
                                                        }
                                                        bundle2.remove("extra");
                                                    }
                                                    com.tencent.liteav.txcvodplayer.a.a aVar3 = a.this.f99483g;
                                                    int videoWidth = a.this.f99481e.getVideoWidth();
                                                    int videoHeight = a.this.f99481e.getVideoHeight();
                                                    aVar3.C = videoWidth;
                                                    aVar3.D = videoHeight;
                                                    LiteavLog.i("TXCVodPlayer", "util onPlayEvent VOD_PLAY_EVT_RCV_FIRST_I_FRAME");
                                                    a.this.f99483g.e();
                                                    if (!a.this.f99484h) {
                                                        a.r(a.this);
                                                        a.this.f99483g.d();
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putInt(TXVodConstants.EVT_ID, 2008);
                                                        bundle4.putLong("EVT_TIME", TimeUtil.a());
                                                        bundle4.putLong("EVT_UTC_TIME", TimeUtil.b());
                                                        com.tencent.liteav.txcplayer.model.b mediaInfo = a.this.f99481e.getMediaInfo();
                                                        if (mediaInfo == null || (str = mediaInfo.f99934c) == null || !str.toLowerCase().contains("hevc")) {
                                                            bundle4.putCharSequence("description", a.this.f99487k ? "Enables hardware decoding" : "Enables software decoding");
                                                            i11 = 0;
                                                        } else {
                                                            bundle4.putCharSequence("description", a.this.f99487k ? "Enables hardware decoding H265" : "Enables software decoding h265");
                                                            i11 = 1;
                                                        }
                                                        bundle4.putInt("EVT_PARAM1", a.this.f99487k ? 1 : 2);
                                                        bundle4.putInt(TXVodConstants.EVT_CODEC_TYPE, i11);
                                                        a.this.f99483g.f100029w = a.this.f99487k ? i11 == 0 ? 1 : 3 : i11 != 0 ? 2 : 0;
                                                        a(2008, bundle4);
                                                        i12 = 1;
                                                    }
                                                    if (i12 != 0) {
                                                        bundle2.putInt("EVT_PARAM1", a.this.f99483g.f100018l);
                                                        break;
                                                    }
                                                    break;
                                                case 2004:
                                                    LiteavLog.i("TXCVodPlayer", "util onPlayEvent VOD_PLAY_EVT_PLAY_BEGIN");
                                                    if (a.this.L) {
                                                        a.this.f99483g.d();
                                                    }
                                                    a.this.L = false;
                                                    a.this.f99483g.f100024r = false;
                                                    break;
                                                case 2005:
                                                    com.tencent.liteav.txcvodplayer.a.a aVar4 = a.this.f99483g;
                                                    int i13 = bundle.getInt("EVT_PLAY_DURATION", 0);
                                                    int i14 = bundle.getInt("EVT_PLAY_PROGRESS", 0);
                                                    aVar4.f100015i = i13;
                                                    int i15 = i14 / 60;
                                                    if (i15 != aVar4.f100016j) {
                                                        aVar4.f100016j = i15;
                                                        if (!aVar4.f100012f) {
                                                            aVar4.b();
                                                        }
                                                    }
                                                    break;
                                                case 2006:
                                                    a.this.f99483g.c();
                                                    if (a.this.f99501y) {
                                                        Bundle bundle5 = new Bundle();
                                                        bundle5.putString("EVT_MSG", "loop once playback complete");
                                                        a.this.a(6001, bundle5);
                                                        a.this.L = true;
                                                        a.this.f99483g.f100024r = true;
                                                        a.this.f99481e.b(true);
                                                        a.this.f99483g.a(true);
                                                        LiteavLog.d("TXCVodPlayer", "loop play");
                                                    }
                                                    break;
                                                case 2007:
                                                    com.tencent.liteav.txcvodplayer.a.a aVar5 = a.this.f99483g;
                                                    if (!aVar5.f100022p && aVar5.f100018l != -1 && !aVar5.f100014h && !aVar5.f100024r) {
                                                        aVar5.f100011e = System.currentTimeMillis();
                                                        aVar5.f100023q = true;
                                                        LiteavLog.i("TXCVodPlayCollection", "setLoadBegin mBeginLoadTS= " + aVar5.f100011e);
                                                    }
                                                    break;
                                                case 2009:
                                                    if (a.this.A != null) {
                                                        d dVar = a.this.A;
                                                        dVar.a(h.a(dVar, a.this.f99481e.getVideoWidth(), a.this.f99481e.getVideoHeight()), "setVideoSize");
                                                    }
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 2016:
                                                            LiteavLog.i("TXCVodPlayer", "util play tcp connect success");
                                                            com.tencent.liteav.txcvodplayer.a.a aVar6 = a.this.f99483g;
                                                            if (aVar6.f100030x == 0) {
                                                                aVar6.f100030x = (int) (System.currentTimeMillis() - aVar6.f100008b);
                                                                LiteavLog.i("TXCVodPlayCollection", "mTcpConnectTS = " + aVar6.f100030x + ", mOriginBeginPlayTS = " + aVar6.f100008b + ", " + System.currentTimeMillis());
                                                            }
                                                            break;
                                                        case 2017:
                                                            LiteavLog.i("TXCVodPlayer", "util play first video packet");
                                                            if (!a.this.G) {
                                                                com.tencent.liteav.txcvodplayer.a.a aVar7 = a.this.f99483g;
                                                                if (aVar7.f100032z == 0) {
                                                                    aVar7.f100032z = (int) (System.currentTimeMillis() - aVar7.f100009c);
                                                                }
                                                                a.q(a.this);
                                                            }
                                                            aVar = a.this.f99483g;
                                                            if (!aVar.f100022p) {
                                                                LiteavLog.i("TXCVodPlayCollection", "setLoadEnd mFirstFrame=" + aVar.f100018l + " , mIsLoading = " + aVar.f100023q + ",mBeginLoadTS = " + aVar.f100011e);
                                                                if (aVar.f100023q) {
                                                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - aVar.f100011e);
                                                                    aVar.f100020n += iCurrentTimeMillis;
                                                                    aVar.f100019m++;
                                                                    if (aVar.f100021o < iCurrentTimeMillis) {
                                                                        aVar.f100021o = iCurrentTimeMillis;
                                                                    }
                                                                    aVar.f100023q = false;
                                                                }
                                                            }
                                                            if (aVar.f100022p) {
                                                                aVar.f100022p = false;
                                                            }
                                                            a.this.f99483g.e();
                                                            break;
                                                        case 2018:
                                                            LiteavLog.i("TXCVodPlayer", "util play dns resolved");
                                                            com.tencent.liteav.txcvodplayer.a.a aVar8 = a.this.f99483g;
                                                            if (aVar8.f100031y == 0) {
                                                                aVar8.f100031y = (int) (System.currentTimeMillis() - aVar8.f100008b);
                                                            }
                                                            break;
                                                        case 2019:
                                                        case 2020:
                                                            break;
                                                        default:
                                                            LiteavLog.d("TXCVodPlayer", "miss match event ".concat(String.valueOf(i10)));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            return;
                        }
                    } else {
                        LiteavLog.i("TXCVodPlayer", "util onPlayEvent VOD_PLAY_EVT_VOD_PLAY_PREPARED");
                    }
                } else if (!a.this.f99484h) {
                    a.n(a.this);
                    a aVar9 = a.this;
                    aVar9.a(aVar9.f99482f);
                }
            }
            bundle2.putString("EVT_MSG", bundle.getString("description", ""));
            a.this.a(i10, bundle2);
        }

        @Override // com.tencent.liteav.txcplayer.d
        public final void a(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putCharSequence("CPU_USAGE", u.a()[0] + "%");
            bundle2.putInt("VIDEO_FPS", (int) bundle.getFloat("fps"));
            bundle2.putInt("VIDEO_DPS", (int) bundle.getFloat("dps"));
            bundle2.putInt("NET_SPEED", ((int) bundle.getLong("tcpSpeed")) / 1000);
            bundle2.putInt("VIDEO_CACHE", ((int) bundle.getLong("cachedBytes")) / 1000);
            bundle2.putInt("VIDEO_WIDTH", a.this.f99481e.getVideoWidth());
            bundle2.putInt("VIDEO_HEIGHT", a.this.f99481e.getVideoHeight());
            bundle2.putString("SERVER_IP", a.this.f99481e.getServerIp());
            bundle2.putInt("VIDEO_BITRATE", (int) bundle.getLong("VIDEO_BITRATE"));
            bundle2.putInt("AUDIO_BITRATE", (int) bundle.getLong("AUDIO_BITRATE"));
            com.tencent.liteav.txcvodplayer.a.a aVar = a.this.f99483g;
            String serverIp = a.this.f99481e.getServerIp();
            aVar.A = serverIp;
            if (serverIp == null) {
                aVar.A = "";
            }
            a.this.a(15001, bundle2);
        }
    };
    private ITXVCubePlayer.b U = new ITXVCubePlayer.b() { // from class: com.tencent.liteav.a.4
        @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer.b
        public final void a(ITXVCubePlayer iTXVCubePlayer, TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            Bitmap bitmap;
            if (a.this.P == null) {
                a.this.P = new c();
            }
            c cVar = a.this.P;
            if (tPSubtitleFrameBuffer == null) {
                LiteavLog.i("SubtitleRender", "[renderToBitmap] subtitleFrameBuffer is null");
                bitmap = null;
            } else {
                LiteavLog.i("SubtitleRender", "[renderToBitmap] subtitleFrameBuffer, trackId: " + tPSubtitleFrameBuffer.trackID + " ,width: " + tPSubtitleFrameBuffer.getSrcWidth() + ", height: " + tPSubtitleFrameBuffer.getSrcHeight());
                Bitmap bitmap2 = cVar.f100182a;
                if (bitmap2 == null || bitmap2.getWidth() != tPSubtitleFrameBuffer.getSrcWidth() || cVar.f100182a.getHeight() != tPSubtitleFrameBuffer.getSrcHeight()) {
                    cVar.f100182a = Bitmap.createBitmap(tPSubtitleFrameBuffer.getSrcWidth(), tPSubtitleFrameBuffer.getSrcHeight(), Bitmap.Config.ARGB_8888);
                }
                cVar.f100182a.copyPixelsFromBuffer(ByteBuffer.wrap(tPSubtitleFrameBuffer.getData()[0]));
                bitmap = cVar.f100182a;
            }
            if (a.this.C != null) {
                a.this.C.show(bitmap);
            }
        }
    };

    /* JADX INFO: renamed from: com.tencent.liteav.a$a, reason: collision with other inner class name */
    public final class HandlerC0957a extends Handler {
        HandlerC0957a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (a.this.Q.get()) {
                a.this.b(a.this.R);
                a.this.S.sendMessageDelayed(new Message(), 30L);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class f99514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Class f99515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f99516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Field f99517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Field f99518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Field f99519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Field f99520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Field f99521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Field f99522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Field f99523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Field f99524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Field f99525l;

        public b(Object obj) {
            try {
                this.f99514a = obj.getClass();
                this.f99515b = TRTCCloudDef.TRTCTexture.class;
                this.f99516c = TRTCCloudDef.TRTCVideoFrame.class;
                this.f99517d = TRTCCloudDef.TRTCTexture.class.getDeclaredField("textureId");
                this.f99518e = this.f99515b.getDeclaredField("eglContext10");
                this.f99520g = this.f99516c.getDeclaredField("texture");
                this.f99521h = this.f99516c.getDeclaredField("width");
                this.f99522i = this.f99516c.getDeclaredField("height");
                this.f99523j = this.f99516c.getDeclaredField("pixelFormat");
                this.f99524k = this.f99516c.getDeclaredField("bufferType");
                this.f99525l = this.f99516c.getDeclaredField("timestamp");
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                    this.f99519f = this.f99515b.getDeclaredField("eglContext14");
                }
            } catch (Exception e10) {
                LiteavLog.e("TXCVodPlayer", "init TRTCCloudClassInvokeWrapper error ", e10);
            }
        }

        public final void a(Object obj, PixelFrame pixelFrame) {
            try {
                Object objNewInstance = this.f99515b.newInstance();
                this.f99517d.set(objNewInstance, Integer.valueOf(pixelFrame.getTextureId()));
                if (pixelFrame.getGLContext() instanceof EGLContext) {
                    this.f99518e.set(objNewInstance, pixelFrame.getGLContext());
                } else {
                    this.f99519f.set(objNewInstance, pixelFrame.getGLContext());
                }
                Object objNewInstance2 = this.f99516c.newInstance();
                this.f99520g.set(objNewInstance2, objNewInstance);
                this.f99521h.set(objNewInstance2, Integer.valueOf(pixelFrame.getWidth()));
                this.f99522i.set(objNewInstance2, Integer.valueOf(pixelFrame.getHeight()));
                this.f99523j.set(objNewInstance2, 2);
                this.f99524k.set(objNewInstance2, 3);
                this.f99525l.set(objNewInstance2, 0);
                this.f99514a.getDeclaredMethod("sendCustomVideoData", Integer.TYPE, objNewInstance2.getClass()).invoke(obj, 2, objNewInstance2);
            } catch (Exception e10) {
                LiteavLog.e("TXCVodPlayer", "sendCustomVideoData method error ", e10);
            }
        }
    }

    static {
        s.a();
    }

    public a(Context context) {
        this.E = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.E = applicationContext;
            ContextUtils.initApplicationContext(applicationContext);
            ContextUtils.setDataDirectorySuffix("liteav");
        }
        this.f99491o = new HashMap();
        this.f99478b = null;
        this.f99479c = null;
        RenderProcessService.getInstance().checkInit(context.getApplicationContext());
        TXCVodVideoView tXCVodVideoView = new TXCVodVideoView(context);
        this.f99481e = tXCVodVideoView;
        tXCVodVideoView.setListener(this.T);
        this.f99481e.setTXCOnSubtitleFrameDataListener(this.U);
        this.F = new HashMap<>();
    }

    public static TXVodDef.TXVodSubtitleData a(TPSubtitleData tPSubtitleData) {
        TXVodDef.TXVodSubtitleData tXVodSubtitleData = new TXVodDef.TXVodSubtitleData();
        tXVodSubtitleData.subtitleData = tPSubtitleData.subtitleData;
        tXVodSubtitleData.durationMs = tPSubtitleData.durationMs;
        tXVodSubtitleData.startPositionMs = tPSubtitleData.startPositionMs;
        tXVodSubtitleData.trackIndex = tPSubtitleData.trackIndex;
        return tXVodSubtitleData;
    }

    public static List<TXTrackInfo> a(List<TXTrackInfo> list, int i10) {
        ArrayList arrayList = new ArrayList();
        for (TXTrackInfo tXTrackInfo : list) {
            if (tXTrackInfo.getTrackType() == i10) {
                arrayList.add(tXTrackInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Bundle bundle) {
        TXVodPlayer tXVodPlayer;
        TXVodPlayer tXVodPlayer2;
        if (i10 == 15001) {
            ITXLivePlayListener iTXLivePlayListener = this.f99478b;
            if (iTXLivePlayListener != null) {
                iTXLivePlayListener.onNetStatus(bundle);
            }
            ITXVodPlayListener iTXVodPlayListener = this.f99479c;
            if (iTXVodPlayListener == null || (tXVodPlayer2 = this.f99480d) == null) {
                return;
            }
            iTXVodPlayListener.onNetStatus(tXVodPlayer2, bundle);
            return;
        }
        ITXLivePlayListener iTXLivePlayListener2 = this.f99478b;
        if (iTXLivePlayListener2 != null) {
            iTXLivePlayListener2.onPlayEvent(i10, bundle);
        }
        ITXVodPlayListener iTXVodPlayListener2 = this.f99479c;
        if (iTXVodPlayListener2 == null || (tXVodPlayer = this.f99480d) == null) {
            return;
        }
        iTXVodPlayListener2.onPlayEvent(tXVodPlayer, i10, bundle);
    }

    public static void a(TXCloudVideoView tXCloudVideoView, int i10) {
        if (tXCloudVideoView == null) {
            return;
        }
        tXCloudVideoView.setVisibility(i10);
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView);
        if (textureViewSetByUser == null) {
            return;
        }
        textureViewSetByUser.setVisibility(i10);
    }

    private static void a(List<TXTrackInfo> list, TPTrackInfo[] tPTrackInfoArr) {
        for (int i10 = 0; i10 < tPTrackInfoArr.length; i10++) {
            TPTrackInfo tPTrackInfo = tPTrackInfoArr[i10];
            TXTrackInfo tXTrackInfo = new TXTrackInfo();
            tXTrackInfo.trackIndex = i10;
            tXTrackInfo.trackType = tPTrackInfo.trackType;
            tXTrackInfo.name = tPTrackInfo.name;
            tXTrackInfo.isSelected = tPTrackInfo.isSelected;
            tXTrackInfo.isExclusive = tPTrackInfo.isExclusive;
            tXTrackInfo.isInternal = tPTrackInfo.isInternal;
            list.add(tXTrackInfo);
        }
    }

    private void a(Map<String, Object> map) {
        com.tencent.liteav.txcvodplayer.a.a aVar;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (TXVodConstants.VOD_KEY_CUSTOM_DATA.equals(key) && (value instanceof HashMap)) {
                Map map2 = (Map) value;
                for (Object obj : map2.keySet()) {
                    Object obj2 = map2.get(obj);
                    if ((obj instanceof String) && (obj2 instanceof String)) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = (String) obj2;
                            if (!TextUtils.isEmpty(str2) && (aVar = this.f99483g) != null) {
                                aVar.a(str, str2);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String b(String str) {
        return TXCHLSEncoder.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PixelFrame pixelFrame) {
        Object obj;
        Object obj2;
        try {
            if (this.N) {
                if (this.M == null && (obj2 = this.B) != null) {
                    this.M = new b(obj2);
                }
                b bVar = this.M;
                if (bVar == null || (obj = this.B) == null || pixelFrame == null) {
                    return;
                }
                bVar.a(obj, pixelFrame);
            }
        } catch (Exception e10) {
            LiteavLog.e("TXCVodPlayer", "sendCustomVideoData method error ", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x024c  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x024c, please report this as an issue */
    private String c(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        String string;
        String str6;
        String str7;
        String str8;
        String str9;
        String[] strArrSplit;
        String[] strArr;
        String str10;
        String str11;
        String str12 = str;
        String strTrim = str.trim();
        boolean zContains = str12.contains("&oversign=");
        String str13 = ContainerUtils.KEY_VALUE_DELIMITER;
        String str14 = "";
        if (zContains) {
            if (str12.contains("&oversign=")) {
                int iIndexOf = str12.indexOf("&oversign=");
                int iLastIndexOf = str12.lastIndexOf("&oversign=");
                String strSubstring = str12.substring(iIndexOf + 1, iLastIndexOf);
                if (TextUtils.isEmpty(strSubstring) || (strArrSplit = strSubstring.split("&")) == null || strArrSplit.length <= 0) {
                    str2 = ContainerUtils.KEY_VALUE_DELIMITER;
                    str3 = "";
                } else {
                    String str15 = "";
                    String str16 = str15;
                    String str17 = str16;
                    String str18 = str17;
                    String str19 = str18;
                    int iIntValue = 0;
                    int i10 = 0;
                    int iIntValue2 = 0;
                    long jLongValue = 0;
                    while (i10 < strArrSplit.length) {
                        int iIndexOf2 = strArrSplit[i10].indexOf(str13);
                        if (iIndexOf2 >= 0) {
                            str11 = str14;
                            str10 = str13;
                            String strSubstring2 = strArrSplit[i10].substring(0, iIndexOf2);
                            String str20 = strArrSplit[i10];
                            strArr = strArrSplit;
                            String strSubstring3 = str20.substring(iIndexOf2 + 1, str20.length());
                            if (!TextUtils.isEmpty(strSubstring2) && !TextUtils.isEmpty(strSubstring3)) {
                                if (strSubstring2.equals("oversign")) {
                                    iIntValue2 = Integer.valueOf(strSubstring3).intValue();
                                } else if (strSubstring2.equals("o1")) {
                                    str18 = strSubstring3;
                                } else if (strSubstring2.equals("o2")) {
                                    str15 = strSubstring3;
                                } else if (strSubstring2.equals("o3")) {
                                    iIntValue = Integer.valueOf(strSubstring3).intValue();
                                } else if (strSubstring2.equals("o4")) {
                                    str16 = strSubstring3;
                                } else if (strSubstring2.equals("o5")) {
                                    str17 = strSubstring3;
                                } else if (strSubstring2.equals("o6")) {
                                    jLongValue = Long.valueOf(strSubstring3).longValue();
                                } else if (strSubstring2.equals("o7")) {
                                    str19 = strSubstring3;
                                }
                            }
                        } else {
                            strArr = strArrSplit;
                            str10 = str13;
                            str11 = str14;
                        }
                        i10++;
                        str14 = str11;
                        str13 = str10;
                        strArrSplit = strArr;
                    }
                    str2 = str13;
                    str3 = str14;
                    if (!TextUtils.isEmpty(str16) && !TextUtils.isEmpty(str17)) {
                        String strA = TXCHLSEncoder.a(iIntValue2, str18, str15, iIntValue);
                        com.tencent.liteav.txcvodplayer.b.c.b bVar = new com.tencent.liteav.txcvodplayer.b.c.b();
                        bVar.f100079a = TXCHLSEncoder.b(strA, str16);
                        bVar.f100080b = TXCHLSEncoder.b(strA, str17);
                        this.f99495s = bVar;
                    }
                    long j10 = jLongValue;
                    if (j10 > 0) {
                        this.I = j10;
                    }
                    if (!TextUtils.isEmpty(str19)) {
                        this.f99491o.put("TXC_DRM_KEY_URL", str19);
                        this.f99491o.put("TXC_DRM_PROVISION_URL", new TXPlayerDrmBuilder().getDeviceCertificateUrl());
                        this.f99491o.put("TXC_DRM_ENABLE", Boolean.TRUE);
                    }
                }
                if (iIndexOf > 0 && iIndexOf < iLastIndexOf) {
                    str12 = str12.substring(0, iIndexOf) + str12.substring(iLastIndexOf + 10);
                }
            } else {
                str2 = ContainerUtils.KEY_VALUE_DELIMITER;
                str3 = "";
            }
            strTrim = str12;
        } else {
            str2 = ContainerUtils.KEY_VALUE_DELIMITER;
            str3 = "";
        }
        if (strTrim.startsWith("http")) {
            strTrim = com.tencent.liteav.txcplayer.a.a.c(strTrim);
        }
        String strTrim2 = strTrim.trim();
        String str21 = this.f99490n;
        if (str21 != null) {
            strTrim2 = com.tencent.liteav.txcplayer.a.a.a(strTrim2, str21);
        }
        Uri uri = Uri.parse(strTrim2);
        String query = uri.getQuery();
        if (query == null || query.isEmpty()) {
            str4 = strTrim2;
            str5 = str3;
            z10 = false;
        } else {
            String[] strArrSplit2 = query.split("&");
            String str22 = "0";
            if (strArrSplit2.length > 0) {
                int length = strArrSplit2.length;
                str7 = str3;
                str8 = str7;
                str9 = str8;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    String str23 = strArrSplit2[i11];
                    String str24 = str2;
                    String[] strArrSplit3 = str23.split(str24);
                    String str25 = strTrim2;
                    String[] strArr2 = strArrSplit2;
                    if (strArrSplit3.length == 2) {
                        if ("spfileid".equalsIgnoreCase(strArrSplit3[0])) {
                            str3 = strArrSplit3[1];
                        } else if ("spdrmtype".equalsIgnoreCase(strArrSplit3[0])) {
                            str7 = strArrSplit3[1];
                        } else if ("spappid".equalsIgnoreCase(strArrSplit3[0])) {
                            str8 = strArrSplit3[1];
                        } else {
                            if (!str9.isEmpty()) {
                                str9 = str9 + "&";
                            }
                            str9 = str9 + str23;
                        }
                        i12++;
                    } else {
                        LiteavLog.e("TXCVodPlayer", "fieldIds.length != 2");
                    }
                    i11++;
                    str2 = str24;
                    strTrim2 = str25;
                    strArrSplit2 = strArr2;
                }
                str4 = strTrim2;
                if (i12 == 3) {
                    str6 = str3;
                    z10 = true;
                    str22 = "1";
                } else {
                    str6 = str3;
                }
                if (z10) {
                    LiteavLog.i("TXCVodPlayer", "spfileid, " + str6 + ", spdrmtype= " + str7 + ", spappid=" + str8);
                    com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
                    aVar.f100027u = str6;
                    aVar.B = str7;
                    aVar.a(str8);
                    this.f99483g.f100026t = str22;
                }
                str5 = str9;
            } else {
                str4 = strTrim2;
                str6 = str3;
                str7 = str6;
                str8 = str7;
                str9 = str8;
            }
            z10 = false;
            if (z10) {
                LiteavLog.i("TXCVodPlayer", "spfileid, " + str6 + ", spdrmtype= " + str7 + ", spappid=" + str8);
                com.tencent.liteav.txcvodplayer.a.a aVar2 = this.f99483g;
                aVar2.f100027u = str6;
                aVar2.B = str7;
                aVar2.a(str8);
                this.f99483g.f100026t = str22;
            }
            str5 = str9;
        }
        if (z10) {
            string = uri.buildUpon().clearQuery().build().toString();
            if (!str5.isEmpty()) {
                string = Uri.decode(uri.buildUpon().clearQuery().query(str5).build().toString());
            }
        } else {
            string = str4;
        }
        LiteavLog.i("TXCVodPlayer", "parsePlayUrl url: ".concat(String.valueOf(string)));
        return string;
    }

    private void d(boolean z10) {
        try {
            Object obj = this.B;
            if (obj != null) {
                obj.getClass().getDeclaredMethod("enableCustomVideoCapture", Integer.TYPE, Boolean.TYPE).invoke(obj, 2, Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            LiteavLog.e("TXCVodPlayer", "setTRTCCustomVideoCapture error ", e10);
        }
    }

    private void h() {
        if (this.F.isEmpty() || this.f99483g == null) {
            return;
        }
        for (Map.Entry<String, String> entry : this.F.entrySet()) {
            this.f99483g.a(entry.getKey(), entry.getValue());
        }
        this.F.clear();
    }

    static /* synthetic */ boolean n(a aVar) {
        aVar.f99487k = false;
        return false;
    }

    static /* synthetic */ boolean q(a aVar) {
        aVar.G = true;
        return true;
    }

    static /* synthetic */ boolean r(a aVar) {
        aVar.f99484h = true;
        return true;
    }

    static /* synthetic */ boolean v(a aVar) {
        aVar.f99493q = false;
        return false;
    }

    public final int a(String str) {
        boolean z10;
        com.tencent.liteav.txcvodplayer.b.c.b bVar;
        TXVodPlayConfig tXVodPlayConfig;
        if (str == null || TextUtils.isEmpty(str)) {
            LiteavLog.i("TXCVodPlayer", "startPlay playUrl is empty, player=" + hashCode());
            return -1;
        }
        int i10 = this.f99492p;
        a(false);
        this.f99492p = i10;
        this.f99483g = new com.tencent.liteav.txcvodplayer.a.a(this.E);
        String strC = c(str);
        com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
        LiteavLog.i("TXCVodPlayCollection", "setUrl: ".concat(String.valueOf(strC)));
        aVar.f100007a = strC;
        this.f99483g.a(this.f99486j);
        VodPlayerControl.nativeIncrementCheckCount();
        LicenseChecker.d dVar = LicenseChecker.d.OK;
        LicenseChecker.d dVarA = com.tencent.liteav.txcplayer.common.c.a();
        if (dVarA != dVar) {
            String str2 = "(-5," + dVarA.value + ")";
            LiteavLog.e("TXCVodPlayer", "startPlay error, licence check failed" + str2 + "! click the link to apply trial licence: https://cloud.tencent.com/act/event/License .Official licence requires payment.");
            Bundle bundle = new Bundle();
            bundle.putString("EVT_MSG", "VOD_PLAY_ERR_INVALID_LICENCE".concat(String.valueOf(str2)));
            a(-5, bundle);
            new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1).reportDau(bb.c.b.xz, 0, "");
            this.f99483g.a();
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return -5;
        }
        this.f99496t = str;
        this.f99492p = this.f99492p;
        TXCloudVideoView tXCloudVideoView = this.f99477a;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.clearLog();
            this.f99477a.setVisibility(0);
            if (TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(this.f99477a) == null) {
                TextureRenderView textureRenderView = new TextureRenderView(this.f99477a.getContext());
                this.f99477a.addVideoView(textureRenderView);
                this.f99481e.setTextureRenderView(textureRenderView);
            }
            a(this.f99477a, 0);
        } else {
            Surface surface = this.f99488l;
            if (surface != null) {
                this.f99481e.setRenderSurface(surface);
            }
        }
        d dVar2 = this.A;
        if (dVar2 != null) {
            dVar2.a(e.a(dVar2), "Start");
        }
        if (TextUtils.isEmpty(com.tencent.liteav.txcplayer.common.b.a()) && (tXVodPlayConfig = this.f99482f) != null) {
            com.tencent.liteav.txcplayer.common.b.a(tXVodPlayConfig.getCacheFolderPath());
        }
        TXVodPlayConfig tXVodPlayConfig2 = this.f99482f;
        if (tXVodPlayConfig2 != null) {
            a(tXVodPlayConfig2.getExtInfoMap());
        }
        a(this.f99482f);
        this.f99481e.setPrivateConfig(this.f99491o);
        this.f99484h = false;
        this.G = false;
        this.f99481e.setStartTime(this.f99502z);
        this.f99481e.c(this.f99485i);
        c(this.f99492p);
        this.f99481e.setVideoPath(strC);
        this.f99481e.setAutoPlay(this.f99486j);
        this.f99481e.setMute(this.f99497u);
        int i11 = this.f99498v;
        if (i11 >= 0) {
            this.f99481e.setAudioPlayoutVolume(i11);
        }
        this.f99481e.setAutoMaxBitrate(this.D);
        a(this.H);
        b(this.K);
        a(this.J);
        b(this.f99500x);
        this.f99481e.b(false);
        this.f99483g.f100025s = this.f99481e.getPlayerType();
        if (this.N) {
            b();
        }
        if (this.O) {
            d();
        }
        LiteavLog.i("TXCVodPlayer", "startPlay url=" + strC + " sdkVersion=" + CommonUtil.getSDKVersionStr() + " player=" + hashCode());
        if (this.f99494r != null && (bVar = this.f99495s) != null && !TextUtils.isEmpty(bVar.f100079a)) {
            com.tencent.liteav.txcvodplayer.c.a.a().a(this.f99494r.getAppId(), this.f99494r.getFileId(), this.f99495s, strC);
        }
        try {
            Class.forName("com.tencent.qcloud.tuiplayer.core.TUIPlayerCore");
            a("use_tuishort_com", "1");
        } catch (Exception unused) {
        }
        String strA = com.tencent.liteav.txcplayer.a.a.a(this.f99496t);
        if (!TextUtils.isEmpty(strA) && strA.toLowerCase().endsWith("mpd")) {
            a("use_dash", "1");
        }
        h();
        Event4XReporter event4XReporter = new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1);
        event4XReporter.reportDau(bb.c.b.xz, 0, "");
        com.tencent.liteav.txcvodplayer.a.a aVar2 = this.f99483g;
        aVar2.f100028v = this.f99486j ? "autoPlay=1" : "autoPlay=0";
        aVar2.a();
        try {
            Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
            event4XReporter.reportDau(bb.c.b.Wq, 0, "");
        } catch (Exception unused2) {
        }
        return 0;
    }

    public final int a(String str, String str2, String str3, String str4, com.tencent.liteav.txcvodplayer.b.c.b bVar) {
        this.f99491o.put("TXC_DRM_KEY_URL", str2);
        this.f99491o.put("TXC_DRM_PROVISION_URL", str3);
        this.f99491o.put("TXC_DRM_SIMPLE_AES_URL", str4);
        this.f99491o.put("TXC_DRM_ENABLE", Boolean.TRUE);
        this.f99495s = bVar;
        a("use_drm", "1");
        return a(str);
    }

    public final int a(boolean z10) {
        this.f99489m = true;
        this.f99481e.a();
        this.Q.set(false);
        HandlerC0957a handlerC0957a = this.S;
        if (handlerC0957a != null) {
            handlerC0957a.removeCallbacksAndMessages(null);
            this.S.getLooper().quitSafely();
            this.S = null;
        }
        this.I = -1L;
        com.tencent.liteav.txcvodplayer.b.d dVar = this.f99499w;
        if (dVar != null) {
            dVar.a(null);
            this.f99499w = null;
        }
        d dVar2 = this.A;
        if (dVar2 != null) {
            dVar2.a(true);
        }
        TXCloudVideoView tXCloudVideoView = this.f99477a;
        if (tXCloudVideoView != null && TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView) != null && z10) {
            a(this.f99477a, 8);
            this.f99477a.removeVideoView();
        }
        com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
        if (aVar != null) {
            aVar.c();
        }
        this.f99492p = -1000;
        c cVar = this.P;
        if (cVar != null) {
            cVar.a();
            this.P = null;
        }
        TXSubtitleView tXSubtitleView = this.C;
        if (tXSubtitleView != null) {
            tXSubtitleView.show(null);
        }
        return 0;
    }

    public final List<TXTrackInfo> a() {
        TPTrackInfo[] trackInfo = this.f99481e.getTrackInfo();
        if (trackInfo == null || trackInfo.length == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, trackInfo);
        return arrayList;
    }

    public final void a(float f10) {
        this.H = f10;
        this.f99481e.setRate(f10);
        com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
        if (aVar != null) {
            aVar.a(f10);
        }
    }

    public final void a(float f10, boolean z10) {
        com.tencent.liteav.txcvodplayer.a.a aVar;
        this.f99481e.a((int) (f10 * 1000.0f), z10);
        if (!this.f99484h || (aVar = this.f99483g) == null) {
            return;
        }
        aVar.f();
    }

    public final void a(int i10) {
        this.J = i10;
        if (i10 == 1) {
            this.f99481e.setRenderMode(0);
        } else {
            this.f99481e.setRenderMode(1);
        }
        d dVar = this.A;
        if (dVar != null) {
            dVar.a(GLConstants.GLScaleType.a(i10));
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.d.a
    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        this.f99488l = surface;
        this.f99481e.setRenderSurface(surface);
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.d.a
    public final void a(PixelFrame pixelFrame) {
        if (this.N) {
            this.R = pixelFrame;
            b(pixelFrame);
        }
    }

    public final void a(TXVodPlayConfig tXVodPlayConfig) {
        this.f99482f = tXVodPlayConfig;
        if (tXVodPlayConfig == null) {
            this.f99482f = new TXVodPlayConfig();
        }
        com.tencent.liteav.txcplayer.e eVar = new com.tencent.liteav.txcplayer.e();
        float connectRetryCount = this.f99482f.getConnectRetryCount();
        if (connectRetryCount >= 1.0f && connectRetryCount <= 10.0f) {
            eVar.f99901a = (int) connectRetryCount;
        }
        float connectRetryInterval = this.f99482f.getConnectRetryInterval();
        if (connectRetryInterval >= 3.0f && connectRetryInterval <= 30.0f) {
            eVar.f99902b = (int) connectRetryInterval;
        }
        eVar.f99903c = this.f99482f.getTimeout();
        eVar.f99904d = this.f99487k;
        eVar.f99905e = this.f99482f.getCacheFolderPath();
        eVar.f99906f = this.f99482f.getMaxCacheItems();
        eVar.f99907g = this.f99482f.getPlayerType();
        eVar.f99908h = this.f99482f.getHeaders();
        eVar.f99909i = this.f99482f.isEnableAccurateSeek();
        eVar.f99910j = this.f99482f.isSmoothSwitchBitrate();
        eVar.f99911k = this.f99482f.getCacheMp4ExtName();
        eVar.f99912l = this.f99482f.getProgressInterval();
        eVar.f99913m = this.f99482f.getMaxBufferSize();
        eVar.f99914n = this.f99482f.getMaxPreloadSize();
        if (this.f99494r == null && this.f99495s == null) {
            eVar.f99924x = this.f99482f.getOverlayKey();
            eVar.f99925y = this.f99482f.getOverlayIv();
        } else {
            com.tencent.liteav.txcvodplayer.b.c.b bVar = this.f99495s;
            if (bVar != null) {
                eVar.f99924x = bVar.f100079a;
                eVar.f99925y = bVar.f100080b;
            } else {
                eVar.f99924x = null;
                eVar.f99925y = null;
            }
        }
        eVar.A = this.f99482f.getExtInfoMap();
        eVar.C = this.f99482f.isEnableRenderProcess();
        eVar.B = this.f99482f.isAutoRotate();
        long j10 = this.I;
        if (j10 > 0) {
            eVar.f99922v = j10;
        } else {
            eVar.f99922v = this.f99482f.getPreferredResolution();
        }
        eVar.D = this.f99482f.getMediaType();
        eVar.f99916p = this.f99486j;
        eVar.f99921u = this.f99482f.getEncryptedMp4Level();
        LiteavLog.i("TXCVodPlayer", "setConfig [connectRetryCount:" + this.f99482f.getConnectRetryCount() + "(default 3 times)][connectRetryInterval:" + this.f99482f.getConnectRetryInterval() + "(default 3s,min:3s max:30s)][vodTimeout:" + this.f99482f.getTimeout() + "(default 10s)][enableHardwareDecoder:" + this.f99487k + "(default false)][cacheFolderPath for mp4/HLS:" + this.f99482f.getCacheFolderPath() + "][maxCacheItems:" + this.f99482f.getMaxCacheItems() + "][enableAccurateSeek:" + this.f99482f.isEnableAccurateSeek() + "(default true)][autoRotate:" + this.f99482f.isAutoRotate() + "(default true)][HLS smoothSwitchBitrate:" + this.f99482f.isSmoothSwitchBitrate() + "(default false)][progressInterval:" + this.f99482f.getProgressInterval() + "(default 0.5s)][maxBufferSize:" + this.f99482f.getMaxBufferSize() + "][maxPreloadSize:" + this.f99482f.getMaxPreloadSize() + "][overlayKey for HLS Encrypt:" + this.f99482f.getOverlayKey() + "][overlayIv for HLS Encrypt:" + this.f99482f.getOverlayIv() + "][mEnableRenderProcess:" + this.f99482f.isEnableRenderProcess() + "][mPreferredResolution:" + this.f99482f.getPreferredResolution() + "][mMediaType:" + this.f99482f.getMediaType() + "]");
        this.f99481e.setConfig(eVar);
        RenderProcessService.getInstance().setEnableRenderProcess(this.f99482f.isEnableRenderProcess());
    }

    public final void a(String str, String str2) {
        com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
        if (aVar == null) {
            this.F.put(str, str2);
        } else {
            aVar.a(str, str2);
        }
    }

    public final void b() {
        this.N = true;
        d(true);
    }

    public final void b(float f10) {
        this.f99502z = f10;
        this.f99481e.setStartTime(f10);
    }

    public final void b(int i10) {
        this.K = i10;
        this.f99481e.setVideoRotationDegree(i10);
        d dVar = this.A;
        if (dVar != null) {
            dVar.a(l.a(i10));
        }
    }

    public final void b(boolean z10) {
        this.f99500x = z10;
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(this.f99477a);
        if (textureViewSetByUser != null) {
            if (this.f99482f.isAutoRotate() && (this.f99481e.getMetaRotationDegree() == 90 || this.f99481e.getMetaRotationDegree() == 270)) {
                textureViewSetByUser.setScaleY(z10 ? -1.0f : 1.0f);
            } else {
                textureViewSetByUser.setScaleX(z10 ? -1.0f : 1.0f);
            }
        }
        com.tencent.liteav.txcvodplayer.a.a aVar = this.f99483g;
        if (aVar != null) {
            aVar.b(z10);
        }
    }

    public final void c() {
        this.N = false;
        d(false);
    }

    public final void c(int i10) {
        com.tencent.liteav.txcvodplayer.a.a aVar;
        this.f99481e.setBitrateIndex(i10);
        this.f99492p = i10;
        if (i10 == -1 || !this.f99484h || (aVar = this.f99483g) == null) {
            return;
        }
        aVar.c(this.f99482f.isSmoothSwitchBitrate());
    }

    public final void c(boolean z10) {
        if (this.B == null || !this.N) {
            return;
        }
        if (this.S == null) {
            HandlerThread handlerThread = new HandlerThread("refreshLoopHandlerThread");
            handlerThread.start();
            this.S = new HandlerC0957a(handlerThread.getLooper());
        }
        if (!z10) {
            this.Q.set(false);
            LiteavLog.i("TXCVodPlayer", "disable video refresh loop");
        } else {
            this.Q.set(true);
            LiteavLog.i("TXCVodPlayer", "enable video refresh loop");
            this.S.sendMessage(new Message());
        }
    }

    public final void d() {
        this.O = true;
        this.f99481e.c();
    }

    public final void e() {
        this.O = false;
        ITXVCubePlayer iTXVCubePlayer = this.f99481e.f99966c;
        if (iTXVCubePlayer != null) {
            iTXVCubePlayer.unpublishAudioToNetwork();
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.renderer.d.a
    public final void f() {
        this.f99488l = null;
        this.f99481e.setRenderSurface(null);
    }

    public final void g() {
        this.f99491o.put("TXC_DRM_ENABLE", Boolean.FALSE);
    }
}
