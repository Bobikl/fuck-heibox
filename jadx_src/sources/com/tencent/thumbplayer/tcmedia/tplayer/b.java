package com.tencent.thumbplayer.tcmedia.tplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayer;
import com.tencent.thumbplayer.tcmedia.api.ITPPlayerListener;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.tplayer.a.g;
import com.tencent.thumbplayer.tcmedia.utils.j;
import com.tencent.thumbplayer.tcmedia.utils.n;
import com.tencent.thumbplayer.tcmedia.utils.o;
import com.tencent.thumbplayer.tcmedia.utils.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class b implements ITPPlayer {
    private static final SparseIntArray E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f103016a = "api call:";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static AtomicInteger f103017v = new AtomicInteger(1000);
    private long A;
    private int B;
    private int C;
    private TPDLProxyMsg.TPPDTInfo[] D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.adapter.a f103018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f103019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.c.a f103020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b f103021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.c f103022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.c.a.a f103023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.plugins.b f103024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HandlerThread f103025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Looper f103026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f103027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.tplayer.a f103028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f103029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f103030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f103031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f103032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<String> f103033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f103034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f103035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f103036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.a f103037u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AtomicInteger f103038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f103039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f103040y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Map<Long, Long> f103041z;

    public class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f103043b;

        a(b bVar) {
            this.f103043b = bVar;
        }

        a(b bVar, Looper looper) {
            super(looper);
            this.f103043b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar = b.this.f103019c;
            if (cVar == null) {
            }
            int i10 = message.what;
            if (i10 == 257) {
                b.this.f103037u.c("onPrepared");
                b.this.c(1004);
                cVar.onPrepared(this.f103043b);
                return;
            }
            if (i10 == 1256) {
                b.this.a(message);
                return;
            }
            switch (i10) {
                case bb.c.b.f30507a2 /* 260 */:
                    cVar.onCompletion(this.f103043b);
                    break;
                case bb.c.b.f30530b2 /* 261 */:
                    b.this.b(message.arg1);
                    e.a aVar = (e.a) message.obj;
                    if (aVar != null && !b.this.f103020d.c()) {
                        cVar.onInfo(this.f103043b, message.arg1, aVar.f103066a, aVar.f103067b, aVar.f103068c);
                    } else if (aVar != null) {
                        cVar.onInfo(this.f103043b, message.arg1, aVar.f103066a, aVar.f103067b, aVar.f103068c);
                    }
                    break;
                case bb.c.b.f30553c2 /* 262 */:
                    e.a aVar2 = (e.a) message.obj;
                    if (aVar2 != null) {
                        cVar.onError(this.f103043b, message.arg1, message.arg2, aVar2.f103066a, aVar2.f103067b);
                    }
                    break;
                case 263:
                    cVar.onSeekComplete(this.f103043b);
                    break;
                case bb.c.b.f30600e2 /* 264 */:
                    e.a aVar3 = (e.a) message.obj;
                    if (aVar3 != null) {
                        cVar.onVideoSizeChanged(this.f103043b, aVar3.f103066a, aVar3.f103067b);
                        b.this.f103020d.a(aVar3.f103066a, aVar3.f103067b);
                    }
                    break;
                case bb.c.b.f30623f2 /* 265 */:
                    cVar.onSubtitleData(this.f103043b, (TPSubtitleData) message.obj);
                    break;
                case bb.c.b.f30646g2 /* 266 */:
                    cVar.onVideoFrameOut(this.f103043b, (TPVideoFrameBuffer) message.obj);
                    break;
                case bb.c.b.f30669h2 /* 267 */:
                    cVar.onAudioFrameOut(this.f103043b, (TPAudioFrameBuffer) message.obj);
                    break;
                case bb.c.b.f30692i2 /* 268 */:
                    cVar.onError(this.f103043b, message.arg1, message.arg2, 0L, 0L);
                    break;
                case bb.c.b.f30715j2 /* 269 */:
                    cVar.onInfo(this.f103043b, 1002, message.arg1, message.arg2, message.obj);
                    break;
                case 270:
                    cVar.onInfo(this.f103043b, 1003, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30761l2 /* 271 */:
                    cVar.onInfo(this.f103043b, 1001, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30784m2 /* 272 */:
                    cVar.onInfo(this.f103043b, 1004, message.arg1, message.arg2, message.obj);
                    break;
                case 273:
                    cVar.onInfo(this.f103043b, 1005, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30830o2 /* 274 */:
                    cVar.onInfo(this.f103043b, 1006, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30853p2 /* 275 */:
                    cVar.onInfo(this.f103043b, 1007, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30876q2 /* 276 */:
                    cVar.onInfo(this.f103043b, 1008, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f30898r2 /* 277 */:
                    cVar.onStateChange(message.arg1, message.arg2);
                    break;
                case bb.c.b.f30920s2 /* 278 */:
                    if (b.this.f103018b != null) {
                        try {
                            b.this.f103018b.a(new TPOptionalParam().buildLong(8000, message.arg1));
                            b.this.f103037u.c("MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION bitrate:" + message.arg1);
                        } catch (IllegalStateException e10) {
                            b.this.f103037u.a(e10);
                        }
                    }
                    if (b.this.f103031o) {
                        cVar.onInfo(this.f103043b, 1010, message.arg1, message.arg2, message.obj);
                    }
                    break;
                case bb.c.b.f30942t2 /* 279 */:
                    cVar.onSubtitleFrameOut(this.f103043b, (TPSubtitleFrameBuffer) message.obj);
                    break;
                case bb.c.b.f30964u2 /* 280 */:
                    cVar.onStopAsyncComplete(this.f103043b);
                    break;
                case bb.c.b.f30986v2 /* 281 */:
                    cVar.onInfo(this.f103043b, 1015, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f31008w2 /* 282 */:
                    b.this.c();
                    break;
                case bb.c.b.f31030x2 /* 283 */:
                    cVar.onInfo(this.f103043b, 1016, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f31052y2 /* 284 */:
                    cVar.onInfo(this.f103043b, 1017, message.arg1, message.arg2, message.obj);
                    break;
                case bb.c.b.f31074z2 /* 285 */:
                    cVar.onInfo(this.f103043b, 1018, message.arg1, message.arg2, message.obj);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.b$b, reason: collision with other inner class name */
    public class C1026b implements com.tencent.thumbplayer.tcmedia.adapter.a.c.a, com.tencent.thumbplayer.tcmedia.adapter.a.c.b, com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c, com.tencent.thumbplayer.tcmedia.adapter.a.c.d, com.tencent.thumbplayer.tcmedia.adapter.a.c.e, com.tencent.thumbplayer.tcmedia.adapter.a.c.f, com.tencent.thumbplayer.tcmedia.adapter.a.c.h, com.tencent.thumbplayer.tcmedia.adapter.a.c.i, com.tencent.thumbplayer.tcmedia.adapter.a.c.j, com.tencent.thumbplayer.tcmedia.adapter.a.c.k, com.tencent.thumbplayer.tcmedia.adapter.a.c.l, com.tencent.thumbplayer.tcmedia.adapter.a.c.m, com.tencent.thumbplayer.tcmedia.adapter.a.c.n, com.tencent.thumbplayer.tcmedia.adapter.a.c.o, com.tencent.thumbplayer.tcmedia.adapter.a.c.p, ITPPlayListener {
        C1026b() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.o
        public TPPostProcessFrameBuffer a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                return cVar.onVideoProcessFrameOut(b.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public TPRemoteSdpInfo a(String str, int i10) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                return cVar.onSdpExchange(b.this, str, i10);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.i
        public void a() {
            int i10;
            b.this.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 1);
            b.this.f103020d.a(0);
            com.tencent.thumbplayer.tcmedia.adapter.b bVarE = b.this.f103018b.e();
            b.this.updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_BITRATE_KBPS, Long.valueOf(((bVarE.g() + bVarE.f()) / 8) >> 10));
            b bVar = b.this;
            bVar.D = bVar.f103020d.k();
            String str = bVarE.a() + androidx.webkit.b.f28327e + bVarE.b();
            TPTrackInfo[] tPTrackInfoArrS = b.this.f103018b.s();
            if (tPTrackInfoArrS != null) {
                i10 = 0;
                for (TPTrackInfo tPTrackInfo : tPTrackInfoArrS) {
                    if (tPTrackInfo.trackType == 2) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            b.this.a(103, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("playertype", Integer.valueOf(b.this.f103018b.d())).a("definition", str).a("rate", Long.valueOf(bVarE.f() / 8000)).a("duration", Long.valueOf(bVarE.k())).a("fmt", bVarE.c()).a("etime", Long.valueOf(System.currentTimeMillis())).a("multitrack", Boolean.valueOf(i10 > 1)).a());
            b.this.a(257, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.f
        public void a(int i10, int i11, long j10, long j11) {
            String strG = b.this.f103020d.g();
            b.this.f103037u.c("onError playerErrorCodeStr=".concat(String.valueOf(strG)));
            if (!TextUtils.isEmpty(strG)) {
                try {
                    i11 = Integer.parseInt(strG);
                    i10 = 4000;
                } catch (Exception e10) {
                    b.this.f103037u.a(e10);
                }
            }
            b.this.a(i10, i11);
            b.this.f103037u.c("onError errorTypeReal=" + i10 + ", errorCodeReal=" + i11);
            e.a aVar = new e.a();
            aVar.f103066a = j10;
            aVar.f103067b = j11;
            b.this.a(bb.c.b.f30553c2, i10, i11, (Object) aVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.h
        public void a(int i10, long j10, long j11, Object obj) {
            b.this.a(i10, j10, j11, obj);
            if (i10 == 1011) {
                b.this.a(obj);
                return;
            }
            if (i10 == 1012) {
                b.this.b(obj);
                return;
            }
            if (i10 == 4) {
                obj = Long.valueOf(b.this.b(((Long) obj).longValue(), "async call select track"));
            }
            e.a aVar = new e.a();
            aVar.f103066a = j10;
            aVar.f103067b = j11;
            aVar.f103068c = obj;
            b.this.a(bb.c.b.f30530b2, i10, 0, (Object) aVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.p
        public void a(long j10, long j11) {
            e.a aVar = new e.a();
            aVar.f103066a = j10;
            aVar.f103067b = j11;
            b.this.a(bb.c.b.f30600e2, 0, 0, (Object) aVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.a
        public void a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                cVar.onAudioFrameOut(b.this, tPAudioFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.e
        public void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                cVar.onDetailInfo(b.this, tPPlayerDetailInfo);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.l
        public void a(TPSubtitleData tPSubtitleData) {
            b.this.a(bb.c.b.f30623f2, 0, 0, (Object) tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.m
        public void a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            b.this.a(bb.c.b.f30942t2, 0, 0, (Object) tPSubtitleFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.n
        public void a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                cVar.onVideoFrameOut(b.this, tPVideoFrameBuffer);
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.b
        public TPPostProcessFrameBuffer b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            c cVar = b.this.f103019c;
            if (cVar != null) {
                return cVar.onAudioProcessFrameOut(b.this, tPPostProcessFrameBuffer);
            }
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c
        public void b() {
            b.this.a(111, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("reason", 0).a());
            b.this.a(bb.c.b.f30507a2, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.k
        public void b(int i10, int i11) {
            b.this.a(bb.c.b.f30898r2, i10, i11, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.j
        public void c() {
            b.this.f();
            b.this.a(110, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("petime", Long.valueOf(b.this.getCurrentPositionMs())).a());
            b.this.a(263, 0, 0, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.a.c.d
        public void d() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            ITPPlayerProxyListener iTPPlayerProxyListenerJ = b.this.f103020d.j();
            if (iTPPlayerProxyListenerJ != null) {
                return iTPPlayerProxyListenerJ.getAdvRemainTimeMs();
            }
            return -1L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i10, String str) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.c(i10, str);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            com.tencent.thumbplayer.tcmedia.adapter.a aVar = b.this.f103018b;
            if (aVar != null) {
                return aVar.a();
            }
            return 0;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return b.this.f103018b.u();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return b.this.getCurrentPositionMs();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i10, String str) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.b(i10, str);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i10, String str) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.a(i10, str);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return -1L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j10) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            com.tencent.thumbplayer.tcmedia.adapter.a aVar = b.this.f103018b;
            if (aVar != null) {
                return aVar.p() - b.this.f103018b.o();
            }
            return 0L;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            b.this.f103037u.c("onDownloadCdnUrlExpired");
            b.this.a(bb.c.b.f30853p2, 0, 0, (Object) map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            b.this.f103037u.c("onDownloadCdnUrlInfoUpdate, url:" + str + ", cdnIp:" + str2 + ", uip:" + str3 + ", errorCodeStr:" + str4);
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            b.this.a(201, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("url", str).a("cdnip", str2).a("cdnuip", str3).a());
            b.this.a(270, 0, 0, (Object) tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            b.this.f103037u.c("onDownloadCdnUrlUpdate, url:".concat(String.valueOf(str)));
            b.this.a(bb.c.b.f30715j2, 0, 0, (Object) str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i10, int i11, String str) {
            b.this.f103037u.c("onDownloadError, moduleID:" + i10 + ", errorCode:" + i11 + ", extInfo:" + str);
            b.this.a(i10, i11);
            b.this.a(bb.c.b.f30692i2, i10, i11, (Object) str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            b.this.f103037u.c("onDownloadFinish");
            b.this.a(bb.c.b.f30761l2, 0, 0, (Object) 0);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
            long j12 = i10;
            b.this.f103034r = j12;
            b.this.f103035s = j10;
            b.this.f103036t = j11;
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = j12;
            tPDownLoadProgressInfo.downloadSpeedKBps = i11;
            tPDownLoadProgressInfo.currentDownloadSize = j10;
            tPDownLoadProgressInfo.totalFileSize = j11;
            tPDownLoadProgressInfo.extraInfo = str;
            b.this.a(200, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("speed", Integer.valueOf(i11)).a("spanId", str).a());
            b.this.a(bb.c.b.f30830o2, 0, 0, (Object) tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            b.this.f103037u.c("onDownloadProtocolUpdate, protocol:" + str + ", protocolVer:" + str2);
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            b.this.a(202, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("proto", str).a("protover", str2).a());
            b.this.a(273, 0, 0, (Object) tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i10) {
            if (i10 != b.this.f103032p) {
                b.this.f103037u.c("onDownloadStatusUpdate, status:".concat(String.valueOf(i10)));
                b.this.f103032p = i10;
            }
            b.this.a(bb.c.b.f30784m2, i10, 0, (Object) null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
            b bVar;
            int i11;
            com.tencent.thumbplayer.tcmedia.e.a aVar;
            String strConcat;
            b bVar2;
            int i12;
            if (i10 != 1) {
                if (i10 != 2) {
                    switch (i10) {
                        case 8:
                            b.this.f103037u.c("AB test info from download proxy received, key: " + obj + ", value: " + obj2);
                            HashMap map = new HashMap();
                            map.put((String) obj, Integer.valueOf((String) obj2));
                            b.this.a(bb.c.b.f30986v2, 0, 0, (Object) map);
                            break;
                        case 9:
                            b.this.f103037u.c("onDownload Refresh M3U8");
                            bVar2 = b.this;
                            i12 = bb.c.b.f31008w2;
                            bVar2.a(i12, 0, 0, (Object) null);
                            break;
                        case 10:
                            b.this.f103037u.c("onDownload multi network card not open, current low speed");
                            bVar2 = b.this;
                            i12 = bb.c.b.f31030x2;
                            bVar2.a(i12, 0, 0, (Object) null);
                            break;
                        case 11:
                            obj = (String) obj;
                            b.this.f103037u.c("onDownload multi network use status change".concat(String.valueOf(obj)));
                            bVar = b.this;
                            i11 = bb.c.b.f31052y2;
                            break;
                        case 12:
                            b.this.f103037u.c("onDownload proxy hit cache");
                            bVar2 = b.this;
                            i12 = bb.c.b.f31074z2;
                            bVar2.a(i12, 0, 0, (Object) null);
                            break;
                    }
                } else {
                    if (obj3 instanceof Integer) {
                        Integer num = (Integer) obj3;
                        b.this.f103037u.c("onDownload suggest bitrate(bps):".concat(String.valueOf(num)));
                        b.this.a(bb.c.b.f30920s2, num.intValue(), 0, (Object) null);
                        aVar = b.this.f103037u;
                        strConcat = "MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION bitrate".concat(String.valueOf(num));
                    } else {
                        aVar = b.this.f103037u;
                        strConcat = "MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION, err ext3.";
                    }
                    aVar.c(strConcat);
                }
                return null;
            }
            b.this.f103037u.c("onDownloadNoMoreData");
            bVar = b.this;
            i11 = bb.c.b.f30876q2;
            bVar.a(i11, 0, 0, obj);
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i10, String str, long j10, long j11) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.b(i10, str, j10, j11);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i10, String str, long j10, long j11) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.a(i10, str, j10, j11);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i10, String str, int i11) {
            if (b.this.f103023g != null) {
                return b.this.f103023g.a(i10, str, i11);
            }
            b.this.f103037u.e("mAssetResourceLoader not set");
            return -1;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(106, 1005);
        sparseIntArray.put(105, 1006);
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, Looper looper) {
        this(context, looper, null);
    }

    public b(Context context, Looper looper, Looper looper2) {
        this(context, looper, looper2, null);
    }

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
    public b(Context context, Looper looper, Looper looper2, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        com.tencent.thumbplayer.tcmedia.e.b bVar2;
        com.tencent.thumbplayer.tcmedia.tplayer.plugins.a aVar;
        this.f103029m = null;
        this.f103030n = true;
        this.f103031o = false;
        this.f103032p = -1;
        this.f103038w = new AtomicInteger(1000);
        this.f103039x = false;
        this.f103040y = null;
        this.f103041z = new HashMap();
        this.A = 0L;
        if (bVar != null) {
            bVar2 = new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPPlayer");
        } else {
            com.tencent.thumbplayer.tcmedia.e.b bVar3 = new com.tencent.thumbplayer.tcmedia.e.b("ThumbPlayer", String.valueOf(f103017v.incrementAndGet()), String.valueOf(this.f103038w.incrementAndGet()), "TPPlayer");
            this.f103039x = true;
            bVar2 = bVar3;
        }
        com.tencent.thumbplayer.tcmedia.e.a aVar2 = new com.tencent.thumbplayer.tcmedia.e.a(bVar2);
        this.f103037u = aVar2;
        aVar2.c("create TPPlayer");
        this.f103028l = new com.tencent.thumbplayer.tcmedia.tplayer.a(context.getApplicationContext());
        this.f103024h = new com.tencent.thumbplayer.tcmedia.tplayer.plugins.c();
        if (TPPlayerConfig.isDataReportEnable() && TPPlayerConfig.isPlayerReportEnable()) {
            com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b bVar4 = new com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b(this.f103028l.a());
            this.f103021e = bVar4;
            aVar = bVar4;
        } else {
            com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.c cVar = new com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.c();
            this.f103022f = cVar;
            aVar = cVar;
        }
        this.f103024h.a(aVar);
        a(100, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a());
        C1026b c1026b = new C1026b();
        this.f103019c = new c(this.f103037u.b());
        com.tencent.thumbplayer.tcmedia.adapter.a aVarA = com.tencent.thumbplayer.tcmedia.adapter.e.a(bVar2, this.f103028l);
        this.f103018b = aVarA;
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.i) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.h) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.p) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.f) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.j) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.p) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.l) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.m) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.a) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.n) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.o) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.b) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.k) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.e) c1026b);
        aVarA.a((com.tencent.thumbplayer.tcmedia.adapter.a.c.d) c1026b);
        if (looper == null || looper == Looper.getMainLooper()) {
            HandlerThread handlerThreadA = o.a().a("TP-workthread");
            this.f103025i = handlerThreadA;
            looper = handlerThreadA.getLooper();
        }
        this.f103026j = looper;
        this.f103027k = looper2 == null ? Looper.myLooper() == null ? new a(this, this.f103026j) : new a(this) : new a(this, looper2);
        a(101, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
        com.tencent.thumbplayer.tcmedia.c.a aVarA2 = com.tencent.thumbplayer.tcmedia.c.c.a(this.f103026j, this.f103028l);
        this.f103020d = aVarA2;
        aVarA2.a(c1026b);
        this.f103024h.a(new com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.a());
        this.f103033q = new ArrayList<>();
        if (TPPlayerConfig.getNewReportEnable()) {
            g gVar = new g(this.f103028l.a());
            this.f103040y = gVar;
            gVar.a(new com.tencent.thumbplayer.tcmedia.common.a(aVarA));
            this.f103040y.a();
            this.f103028l.b().a(this.f103040y);
        }
    }

    private int a(String str) {
        if (this.f103020d.a()) {
            return 5;
        }
        return r.a(str);
    }

    private long a(long j10, String str) {
        this.f103041z.put(Long.valueOf(this.A), Long.valueOf(j10));
        this.f103037u.c(str + ", convert opaque(" + j10 + ") => uniqueId(" + this.A + ")");
        long j11 = this.A;
        this.A = 1 + j11;
        return j11;
    }

    private TPVideoInfo a(TPVideoInfo tPVideoInfo, int i10, int i11) {
        this.f103037u.c("updateStartAndSkipEndTimeMsForDownloadParam, startTimeMs:" + i10 + ", skipEndTimeMs:" + i11);
        if (tPVideoInfo == null) {
            return new TPVideoInfo.Builder().downloadParam(b(i10, i11)).build();
        }
        ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
        if (downloadPraramList == null || downloadPraramList.isEmpty()) {
            tPVideoInfo.getBuilder().downloadParam(b(i10, i11)).build();
            return tPVideoInfo;
        }
        for (TPDownloadParamData tPDownloadParamData : downloadPraramList) {
            tPDownloadParamData.setStarTimeMS(i10);
            tPDownloadParamData.setEndTimeMS(i11);
        }
        return tPVideoInfo;
    }

    private void a(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i10) {
        a aVar = this.f103027k;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = bb.c.b.f30710il;
            messageObtainMessage.obj = new TPPlayerDetailInfo(i10);
            this.f103027k.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        a(108, i10, i11, "", new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("reason", 3).a("code", i10 + "." + i11).a());
        this.f103020d.a(3);
        this.f103020d.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, int i12, Object obj) {
        a aVar = this.f103027k;
        if (aVar != null) {
            Message messageObtainMessage = aVar.obtainMessage();
            messageObtainMessage.what = i10;
            messageObtainMessage.arg1 = i11;
            messageObtainMessage.arg2 = i12;
            messageObtainMessage.obj = obj;
            this.f103027k.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, int i12, String str, Object obj) {
        try {
            com.tencent.thumbplayer.tcmedia.tplayer.plugins.b bVar = this.f103024h;
            if (bVar != null) {
                bVar.a(i10, i11, i12, str, obj);
            }
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, long j10, long j11, Object obj) {
        if (i10 == 200) {
            this.f103020d.a(4);
            a(114, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a("format", 0).a("ptime", Long.valueOf(getCurrentPositionMs())).a("url", this.f103029m).a());
            return;
        }
        if (i10 == 201) {
            f();
            a(115, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
            return;
        }
        if (i10 == 3) {
            long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : -1L;
            this.f103037u.c("switch definition finish defId:".concat(String.valueOf(jLongValue)));
            if (jLongValue > 0) {
                this.f103020d.a(jLongValue);
            }
            a(121, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("switch", String.valueOf(jLongValue)).a());
            return;
        }
        if (i10 == 106) {
            a(105, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a());
            return;
        }
        if (i10 == 501) {
            a(117, 0, 0, (String) null, obj);
            return;
        }
        if (i10 == 107) {
            a(119, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a());
            return;
        }
        if (i10 == 4) {
            a(123, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("opaque", obj).a("etime", Long.valueOf(System.currentTimeMillis())).a("code", String.valueOf(j11)).a());
            return;
        }
        if (i10 == 101) {
            a(124, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a());
            return;
        }
        if (i10 == 505 && (obj instanceof TPPlayerMsg.TPMediaDrmInfo)) {
            TPPlayerMsg.TPMediaDrmInfo tPMediaDrmInfo = (TPPlayerMsg.TPMediaDrmInfo) obj;
            this.f103037u.c("TPMediaDrmInfo secureDecoder:" + tPMediaDrmInfo.supportSecureDecoder + " secureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName:" + tPMediaDrmInfo.componentName + " drmType:" + tPMediaDrmInfo.drmType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        Object obj = message.obj;
        if (obj instanceof TPPlayerDetailInfo) {
            a((TPPlayerDetailInfo) obj);
        }
    }

    private void a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 205) {
            this.f103030n = tPOptionalParam.getParamBoolean().value;
            this.f103037u.c("setPlayerOptionalParam, use p2p proxy, OPTION_ID_BEFORE_BOOLEAN_USE_PROXY=" + this.f103030n);
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.f103031o = tPOptionalParam.getParamBoolean().value;
        } else if (tPOptionalParam.getKey() == 100) {
            this.B = (int) tPOptionalParam.getParamLong().value;
        } else if (tPOptionalParam.getKey() == 500) {
            this.C = (int) tPOptionalParam.getParamLong().value;
        }
    }

    private void a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.onDetailInfo(this, tPPlayerDetailInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!e()) {
                this.f103037u.e("handleSelectAudioTrack, proxy is not enable");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            this.f103037u.c("handleSelectAudioTrack, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            if (TextUtils.isEmpty(tPAudioTrackInfo.audioTrackUrl)) {
                try {
                    this.f103020d.b();
                    return;
                } catch (Exception e10) {
                    this.f103037u.a(e10);
                    return;
                }
            }
            TPDownloadParamData tPDownloadParamData = null;
            for (TPOptionalParam tPOptionalParam : tPAudioTrackInfo.paramData) {
                if (tPOptionalParam.getKey() == 0) {
                    tPDownloadParamData = (TPDownloadParamData) tPOptionalParam.getParamObject().objectValue;
                    break;
                }
            }
            this.f103020d.a(tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData != null ? tPDownloadParamData.getAudioTrackKeyId() : "");
        }
    }

    private void a(String str, int i10, boolean z10) {
        com.tencent.thumbplayer.tcmedia.d.b.u uVar = new com.tencent.thumbplayer.tcmedia.d.b.u();
        uVar.a(str);
        uVar.b(i10);
        uVar.a(z10);
        this.f103028l.b().a(uVar);
    }

    private byte[] a(String str, String str2, String str3) {
        com.tencent.thumbplayer.tcmedia.c.a aVar = this.f103020d;
        if (aVar != null) {
            return aVar.a(str, str2, str3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b(long j10, String str) {
        if (!this.f103041z.containsKey(Long.valueOf(j10))) {
            this.f103037u.e(str + ", invalid uniqueId");
            return -1L;
        }
        long jLongValue = this.f103041z.get(Long.valueOf(j10)).longValue();
        this.f103037u.c(str + ", convert uniqueId(" + j10 + ") => opaque(" + jLongValue + ")");
        return jLongValue;
    }

    private TPDownloadParamData b(int i10, int i11) {
        TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(0);
        tPDownloadParamData.setStarTimeMS(i10);
        tPDownloadParamData.setEndTimeMS(i11);
        return tPDownloadParamData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        int i11 = E.get(i10, -1);
        if (i11 == -1) {
            return;
        }
        c(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        if (obj instanceof TPPlayerMsg.TPAudioTrackInfo) {
            if (!e()) {
                this.f103037u.c("handleAudioTrackProxy, proxy not enable and use orinal url");
                return;
            }
            TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = (TPPlayerMsg.TPAudioTrackInfo) obj;
            TPDownloadParamData tPDownloadParamData = null;
            for (TPOptionalParam tPOptionalParam : tPAudioTrackInfo.paramData) {
                if (tPOptionalParam.getKey() == 0) {
                    tPDownloadParamData = (TPDownloadParamData) tPOptionalParam.getParamObject().objectValue;
                    break;
                }
            }
            String strA = this.f103020d.a(2, tPAudioTrackInfo.audioTrackUrl, tPDownloadParamData);
            this.f103033q.add(strA);
            tPAudioTrackInfo.proxyUrl = strA;
        }
    }

    private void b(String str) {
        com.tencent.thumbplayer.tcmedia.d.b.p pVar = new com.tencent.thumbplayer.tcmedia.d.b.p();
        pVar.a(str);
        this.f103028l.b().a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            com.tencent.thumbplayer.tcmedia.adapter.a aVar = this.f103018b;
            if (aVar != null) {
                aVar.f();
            }
        } catch (Exception e10) {
            this.f103037u.e("reopenPlayer has exception:" + e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@TPPlayerDetailInfo.TPPlayerDetailInfoType int i10) {
        a(new TPPlayerDetailInfo(i10));
    }

    private void d() {
        this.f103018b.k();
        a(107, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("reason", 1).a());
        this.f103020d.a(5);
        this.f103020d.h();
        this.f103034r = -1L;
        this.f103035s = -1L;
        this.f103036t = -1L;
    }

    private boolean e() {
        return this.f103020d.f() && TPPlayerConfig.isUseP2P() && this.f103030n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f103020d.a(this.f103018b.c() ? 0 : 5);
    }

    private void g() {
        e.a aVar = new e.a();
        aVar.f103066a = e() ? 1L : 0L;
        a(bb.c.b.f30530b2, 1009, 0, (Object) aVar);
    }

    private boolean h() {
        int iB = this.f103018b.b();
        return iB == 4 || iB == 5 || iB == 6 || iB == 7;
    }

    public Looper a() {
        return this.f103026j;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void addAudioTrackSource(String str, String str2) {
        this.f103037u.c(f103016a + "addAudioTrackSource, url:" + str + ", name:" + str2);
        addAudioTrackSource(str, str2, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void addAudioTrackSource(String str, String str2, TPDownloadParamData tPDownloadParamData) {
        this.f103037u.c(f103016a + "addAudioTrackSource, url:" + str + ", name:" + str2 + ", downloadParamData:" + tPDownloadParamData);
        if (TextUtils.isEmpty(str2) || !com.tencent.thumbplayer.tcmedia.utils.b.b(str)) {
            this.f103037u.e("handleAddAudioSource, illegal argument.");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            TPOptionalParam tPOptionalParam = new TPOptionalParam();
            if (tPDownloadParamData != null) {
                tPOptionalParam.buildObject(0, tPDownloadParamData);
            }
            arrayList.add(tPOptionalParam);
            Map<String, String> map = null;
            if (tPDownloadParamData != null && tPDownloadParamData.getUrlCdnidHttpHeaderList() != null && !tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) {
                map = tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0);
            }
            this.f103018b.a(str, map, str2, arrayList);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(c = true)
    public void addSubtitleSource(String str, String str2, String str3) {
        this.f103037u.c(f103016a + "addSubtitleSource, url:" + str + ", mimeType:" + str2 + ", name:" + str3);
        addSubtitleSource(str, str2, str3, null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(c = true)
    public void addSubtitleSource(String str, String str2, String str3, TPDownloadParamData tPDownloadParamData) {
        String strA;
        this.f103037u.c(f103016a + "addSubtitleSource, url:" + str + ", name:" + str3 + ", downloadParamData:" + tPDownloadParamData);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (e() && com.tencent.thumbplayer.tcmedia.utils.b.b(str)) {
                strA = this.f103020d.a(3, str, tPDownloadParamData);
                this.f103033q.add(strA);
            } else {
                strA = str;
            }
            Map<String, String> map = null;
            if (tPDownloadParamData != null && tPDownloadParamData.getUrlCdnidHttpHeaderList() != null && !tPDownloadParamData.getUrlCdnidHttpHeaderList().isEmpty()) {
                map = tPDownloadParamData.getUrlCdnidHttpHeaderList().get(0);
            }
            this.f103018b.a(strA, map, str2, str3);
            a(118, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(jCurrentTimeMillis)).a("etime", Long.valueOf(System.currentTimeMillis())).a("url", str).a("name", str3).a());
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    public String b() {
        return this.f103037u.b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(a = true)
    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        this.f103037u.c(f103016a + "captureVideo, params:" + tPCaptureParams + ", captureCallBack:" + tPCaptureCallBack);
        try {
            this.f103018b.a(tPCaptureParams, tPCaptureCallBack);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void deselectTrack(int i10, long j10) {
        this.f103037u.c(f103016a + "deselectTrack, trackIndex:" + i10 + ", opaque:" + j10);
        try {
            this.f103018b.b(i10, j10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void enableTPAssetResourceLoader(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, Looper looper) {
        if (iTPAssetResourceLoaderListener == null) {
            this.f103020d.a(false);
            return;
        }
        this.f103020d.a(true);
        com.tencent.thumbplayer.tcmedia.c.a.a aVar = this.f103023g;
        if (aVar != null) {
            aVar.c();
            this.f103023g = null;
        }
        com.tencent.thumbplayer.tcmedia.c.a.b bVar = new com.tencent.thumbplayer.tcmedia.c.a.b(this.f103028l.a(), looper);
        this.f103023g = bVar;
        bVar.a(iTPAssetResourceLoaderListener);
        this.f103023g.a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getBufferPercent() {
        if (this.f103018b.n() == 0) {
            return 0;
        }
        return (int) (((this.f103018b.p() - this.f103018b.o()) * 100.0f) / this.f103018b.n());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getCurrentPositionMs() {
        return this.f103018b.o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getCurrentState() {
        return this.f103018b.b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getDurationMs() {
        return this.f103018b.n();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPExtendReportController getExtendReportController() {
        return this.f103040y;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPdtTimeMs(long j10) {
        TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr = this.D;
        if (tPPDTInfoArr != null && tPPDTInfoArr.length != 0) {
            if (j10 >= getDurationMs()) {
                TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr2 = this.D;
                return tPPDTInfoArr2[tPPDTInfoArr2.length - 1].pdtTimeEndMS;
            }
            if (j10 <= 0) {
                return this.D[0].pdtTimeStartMS;
            }
            for (TPDLProxyMsg.TPPDTInfo tPPDTInfo : this.D) {
                float f10 = tPPDTInfo.durationStart;
                if (j10 >= ((long) (f10 * 1000.0f)) && j10 <= ((long) (tPPDTInfo.durationEnd * 1000.0f))) {
                    return Math.min(tPPDTInfo.pdtTimeStartMS + (j10 - ((long) (f10 * 1000.0f))), tPPDTInfo.pdtTimeEndMS);
                }
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPlayableDurationMs() {
        if (!e()) {
            return this.f103018b.p();
        }
        long j10 = this.f103035s;
        if (j10 > 0) {
            long j11 = this.f103036t;
            if (j11 > 0) {
                return (long) (((j10 * 1.0d) / j11) * this.f103018b.n());
            }
        }
        return this.f103034r;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPPlayerProxy getPlayerProxy() {
        return this.f103020d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getPlayerType() {
        return this.f103018b.d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPositionMs(long j10) {
        TPDLProxyMsg.TPPDTInfo[] tPPDTInfoArr = this.D;
        if (tPPDTInfoArr != null && tPPDTInfoArr.length != 0) {
            if (j10 >= tPPDTInfoArr[tPPDTInfoArr.length - 1].pdtTimeEndMS) {
                return getDurationMs();
            }
            if (j10 <= tPPDTInfoArr[0].pdtTimeStartMS) {
                return 0L;
            }
            for (TPDLProxyMsg.TPPDTInfo tPPDTInfo : tPPDTInfoArr) {
                long j11 = tPPDTInfo.pdtTimeStartMS;
                if (j10 >= j11 && j10 <= tPPDTInfo.pdtTimeEndMS) {
                    return Math.min(((long) (tPPDTInfo.durationStart * 1000.0f)) + (j10 - j11), getDurationMs());
                }
            }
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public TPProgramInfo[] getProgramInfo() {
        return this.f103018b.t();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public long getPropertyLong(int i10) {
        return this.f103018b.b(i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public String getPropertyString(int i10) {
        return this.f103018b.c(i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public ITPBusinessReportManager getReportManager() {
        com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b bVar = this.f103021e;
        return bVar == null ? this.f103022f : bVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public TPTrackInfo[] getTrackInfo() {
        return this.f103018b.s();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getVideoHeight() {
        return this.f103018b.r();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public int getVideoWidth() {
        return this.f103018b.q();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void pause() {
        this.f103037u.c(f103016a + "pause");
        this.f103018b.j();
        try {
            a(106, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a());
            this.f103020d.a(5);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void pauseDownload() {
        this.f103037u.c(f103016a + "pauseDownload");
        try {
            this.f103018b.a(new TPOptionalParam().buildLong(502, 0L));
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
        this.f103020d.h();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void prepareAsync() {
        String str = UUID.randomUUID().toString() + System.nanoTime() + lg.a.f131412e + TPPlayerConfig.getPlatform();
        a(1003);
        this.f103037u.c(f103016a + "prepareAsync");
        com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b bVar = this.f103021e;
        boolean zC = bVar != null ? bVar.c() : true;
        g gVar = this.f103040y;
        if (gVar != null) {
            gVar.a(zC);
        }
        try {
            this.f103020d.i();
            this.f103018b.h();
        } catch (RuntimeException e10) {
            this.f103037u.a(e10);
        }
        b(str);
        try {
            a(102, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a("url", this.f103029m).a("p2p", Boolean.valueOf(e())).a("flowid", str).a());
            g();
        } catch (Exception e11) {
            this.f103037u.a(e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(a = true)
    public void release() {
        this.f103037u.c(f103016a + "release");
        this.f103018b.m();
        a(112, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("reason", 1).a());
        this.f103019c.a();
        this.f103020d.e();
        this.f103033q.clear();
        com.tencent.thumbplayer.tcmedia.c.a.a aVar = this.f103023g;
        if (aVar != null) {
            aVar.c();
            this.f103023g = null;
        }
        this.f103034r = -1L;
        this.f103035s = -1L;
        this.f103036t = -1L;
        o.a().a(this.f103025i, this.f103027k);
        this.f103025i = null;
        this.f103027k = null;
        this.f103024h.c();
        g gVar = this.f103040y;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(a = true)
    public void reset() {
        this.f103037u.c(f103016a + "reset");
        if (this.f103039x) {
            this.f103037u.a(String.valueOf(this.f103038w.incrementAndGet()));
            this.f103018b.a(this.f103037u.a());
            this.f103019c.a(this.f103037u.a().a());
        }
        this.f103018b.l();
        a(113, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("etime", Long.valueOf(System.currentTimeMillis())).a("reason", 1).a());
        this.f103020d.d();
        this.f103032p = -1;
        this.f103033q.clear();
        com.tencent.thumbplayer.tcmedia.c.a.a aVar = this.f103023g;
        if (aVar != null) {
            aVar.b();
        }
        a aVar2 = this.f103027k;
        if (aVar2 != null) {
            aVar2.removeCallbacksAndMessages(null);
        }
        this.f103034r = -1L;
        this.f103035s = -1L;
        this.f103036t = -1L;
        this.f103030n = true;
        this.f103031o = false;
        this.B = 0;
        this.C = 0;
        this.f103041z.clear();
        this.A = 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void resumeDownload() {
        this.f103037u.c(f103016a + "resumeDownload");
        this.f103020d.i();
        try {
            this.f103018b.a(new TPOptionalParam().buildLong(502, 1L));
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void seekTo(int i10) {
        this.f103037u.c(f103016a + "seekTo, positionMs:" + i10);
        this.f103018b.a(i10);
        this.f103020d.a(1);
        a(109, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a("format", 0).a("pstime", Long.valueOf(getCurrentPositionMs())).a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void seekTo(int i10, int i11) {
        this.f103037u.c(f103016a + "seekTo, positionMs:" + i10 + ", mode:" + i11);
        if (i11 > 0) {
            this.f103018b.a(i10, i11);
        } else {
            this.f103018b.a(i10);
        }
        this.f103020d.a(1);
        a(109, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a("format", 0).a("pstime", Long.valueOf(getCurrentPositionMs())).a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void selectProgram(int i10, long j10) {
        this.f103037u.c(f103016a + "selectProgram, programIndex:" + i10 + ", opaque:" + j10);
        try {
            this.f103018b.c(i10, j10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void selectTrack(int i10, long j10) {
        this.f103037u.c(f103016a + "selectTrack, trackIndex:" + i10 + ", opaque:" + j10);
        try {
            long jA = a(j10, "selectTrack");
            TPTrackInfo[] tPTrackInfoArrS = this.f103018b.s();
            if (tPTrackInfoArrS != null && tPTrackInfoArrS.length > i10) {
                a(122, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("opaque", Long.valueOf(jA)).a("tracktype", Integer.valueOf(tPTrackInfoArrS[i10].getTrackType())).a("name", tPTrackInfoArrS[i10].getName()).a("stime", Long.valueOf(System.currentTimeMillis())).a());
            }
            this.f103018b.a(i10, jA);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true)
    public void setAudioGainRatio(float f10) {
        this.f103037u.c(f103016a + "setAudioGainRatio, gainRatio:" + f10);
        try {
            this.f103018b.a(f10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true)
    public void setAudioNormalizeVolumeParams(String str) {
        this.f103037u.c(f103016a + "setAudioNormalizeVolumeParams, audioNormalizeVolumeParams:" + str);
        try {
            this.f103018b.a(str);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (this.f103018b.b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f103018b.b());
        }
        a("", 4, false);
        this.f103037u.c(f103016a + "setDataSource, AssetFileDescriptor");
        try {
            this.f103018b.a(assetFileDescriptor);
        } catch (IOException | SecurityException e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (this.f103018b.b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f103018b.b());
        }
        a("", 4, false);
        this.f103037u.c(f103016a + "setDataSource, ParcelFileDescriptor");
        try {
            this.f103018b.a(parcelFileDescriptor);
        } catch (IOException | SecurityException e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        if (iTPMediaAsset == null) {
            throw new IllegalArgumentException("error : setDataSource , param is null");
        }
        if (iTPMediaAsset instanceof ITPMediaDRMAsset) {
            ITPMediaDRMAsset iTPMediaDRMAsset = (ITPMediaDRMAsset) iTPMediaAsset;
            if (iTPMediaDRMAsset.getDrmAllProperties() == null || iTPMediaDRMAsset.getDrmAllProperties().isEmpty()) {
                throw new IllegalArgumentException("error : setDataSource , drm property is null");
            }
            if (iTPMediaDRMAsset.getDrmType() == 0 && e()) {
                byte[] bArrA = a(TPPlayerConfig.getProxyDataDir(), iTPMediaDRMAsset.getDrmPlayUrl(), iTPMediaDRMAsset.getDrmProperty(ITPMediaDRMAsset.TP_PLAYER_DRM_PROPERTY_LICENSE_URL, ""));
                if (bArrA != null && bArrA.length > 0) {
                    try {
                        iTPMediaDRMAsset.setOfflineKeySetId(Base64.encodeToString(bArrA, 2));
                    } catch (Exception e10) {
                        this.f103037u.c("setOfflineKeySetId exception" + e10.getMessage());
                    }
                }
            }
            if (TextUtils.isEmpty(iTPMediaDRMAsset.getUrl())) {
                throw new IllegalArgumentException("error : setDataSource , drm asset url is null");
            }
        }
        if (this.f103018b.b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f103018b.b());
        }
        a(iTPMediaAsset.getUrl(), a(iTPMediaAsset.getUrl()), e());
        a(1000);
        this.f103037u.c(f103016a + "setDataSource, ITPMediaAsset");
        this.f103029m = iTPMediaAsset.getUrl();
        if (e()) {
            iTPMediaAsset = this.f103020d.a(iTPMediaAsset);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
        }
        this.f103037u.c("handleSetDataSource mediaAsset=" + iTPMediaAsset.getUrl());
        try {
            this.f103018b.a(iTPMediaAsset);
        } catch (IOException | SecurityException e11) {
            this.f103037u.a(e11);
        }
        a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setDataSource(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        }
        if (this.f103018b.b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f103018b.b());
        }
        a(str, a(str), e());
        a(1000);
        this.f103037u.c(f103016a + "setDataSource, url:" + str);
        this.f103029m = str;
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        this.f103037u.c("handleSetDataSource originalUrl=".concat(String.valueOf(str)));
        if (e()) {
            eVar = this.f103020d.a(str, (Map<String, String>) null);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
            this.f103037u.c("handleSetDataSource selfPlayerUrl=" + eVar.b());
            this.f103037u.c("handleSetDataSource systemPlayerUrl=" + eVar.a());
        }
        this.f103018b.a(eVar);
        a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setDataSource(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("error : setDataSource , param is invalid");
        }
        if (this.f103018b.b() != 1) {
            throw new IllegalStateException("error : setDataSource , state invalid. current state:" + this.f103018b.b());
        }
        a(str, a(str), e());
        a(1000);
        this.f103037u.c(f103016a + "setDataSource, url:" + str + ", httpHeader:" + map);
        this.f103029m = str;
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        this.f103037u.c("handleSetDataSource originalUrl=".concat(String.valueOf(str)));
        if (e()) {
            eVar = this.f103020d.a(str, map);
            updateTaskInfo(TPDownloadProxyEnum.TASKINFO_GET_METADATA_PLAY_OFFSET, 0);
            this.f103037u.c("handleSetDataSource selfPlayerUrl=" + eVar.b());
            this.f103037u.c("handleSetDataSource systemPlayerUrl=" + eVar.a());
        }
        this.f103018b.a(eVar, map);
        a(1001);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void setLoopback(boolean z10) {
        this.f103037u.c(f103016a + "setLoopback, isLoopback:" + z10);
        try {
            this.f103018b.b(z10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void setLoopback(boolean z10, long j10, long j11) {
        this.f103037u.c(f103016a + "setLoopback, isLoopback:" + z10 + ", loopStartPositionMs:" + j10 + ", loopEndPositionMs:" + j11);
        try {
            this.f103018b.a(z10, j10, j11);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnAudioFrameOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnAudioFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnAudioProcessFrameOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnAudioProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnCompletionListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnDemuxerListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnDetailInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnErrorListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnInfoListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnStateChangeListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnPreparedListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnSeekCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnStopAsyncCompleteListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnSubtitleDataListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnSubtitleFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnVideoFrameOutListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoProcessFrameOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnVideoProcessFrameOutputListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        c cVar = this.f103019c;
        if (cVar != null) {
            cVar.a(iOnVideoSizeChangedListener);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true)
    public void setOutputMute(boolean z10) {
        this.f103037u.c(f103016a + "setOutputMute, isOutputMute:" + z10);
        try {
            this.f103018b.a(z10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true)
    public void setPlaySpeedRatio(float f10) {
        this.f103037u.c(f103016a + "setPlaySpeedRatio, speedRatio:" + f10);
        try {
            this.f103020d.a(f10);
            this.f103018b.b(f10);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
        a(116, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("scene", Float.valueOf(f10)).a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(c = true)
    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getParamType() == 7 && !j.a(tPOptionalParam.getKey(), tPOptionalParam.getParamObject().objectValue)) {
            this.f103037u.d("set object param failed, optional id:" + tPOptionalParam.getKey());
            return;
        }
        a(tPOptionalParam);
        this.f103020d.a(tPOptionalParam);
        try {
            this.f103018b.a(tPOptionalParam);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        this.f103018b.a(iTPRichMediaSynchronizer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setSurface(Surface surface) {
        this.f103037u.c(f103016a + "setSurface, surface:" + surface);
        try {
            this.f103018b.a(surface);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.f103037u.c(f103016a + "setSurfaceHolder, SurfaceHolder:" + surfaceHolder);
        try {
            this.f103018b.a(surfaceHolder);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(c = true)
    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo != null) {
            try {
                a(tPVideoInfo, this.B, this.C);
                this.f103020d.a(tPVideoInfo);
                this.f103018b.a(tPVideoInfo);
            } catch (Exception e10) {
                this.f103037u.a(e10);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void start() {
        this.f103037u.c(f103016a + com.google.android.exoplayer2.text.ttml.d.f49798o0);
        this.f103018b.i();
        try {
            a(104, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("stime", Long.valueOf(System.currentTimeMillis())).a());
            this.f103020d.a(0);
        } catch (Exception e10) {
            this.f103037u.a(e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(a = true)
    public void stop() {
        this.f103037u.c(f103016a + "stop");
        d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void stopAsync() {
        this.f103037u.c(f103016a + "stopAsync");
        d();
        a(bb.c.b.f30964u2, 0, 0, (Object) null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j10, TPVideoInfo tPVideoInfo) {
        this.f103037u.c(f103016a + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j10 + ", videoInfo:" + tPVideoInfo);
        switchDefinition(iTPMediaAsset, j10, tPVideoInfo, 0);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j10, TPVideoInfo tPVideoInfo, int i10) {
        if (!h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f103037u.c(f103016a + "switchDefinition, mediaAsset:" + iTPMediaAsset + ", defID:" + j10 + ", videoInfo:" + tPVideoInfo + ", mode:" + i10);
        TPVideoInfo tPVideoInfoA = a(tPVideoInfo, (int) getCurrentPositionMs(), this.C);
        if (e()) {
            iTPMediaAsset = this.f103020d.a(iTPMediaAsset, j10, tPVideoInfoA);
        }
        if (iTPMediaAsset != null) {
            this.f103037u.c("handleSwitchDef, proxyMediaAsset:" + iTPMediaAsset + ", defID:" + j10);
            this.f103018b.b(tPVideoInfoA);
            this.f103018b.a(iTPMediaAsset, 0, j10);
            a(120, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("switch", String.valueOf(j10)).a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(String str, long j10, TPVideoInfo tPVideoInfo) {
        this.f103037u.c(f103016a + "switchDefinition, defUrl:" + str + ", defID:" + j10);
        switchDefinition(str, j10, tPVideoInfo, 0);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(String str, long j10, TPVideoInfo tPVideoInfo, int i10) {
        if (!h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f103037u.c(f103016a + "switchDefinition, defUrl:" + str + ", defID:" + j10 + ", mode:" + i10);
        TPVideoInfo tPVideoInfoA = a(tPVideoInfo, (int) getCurrentPositionMs(), this.C);
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        if (e()) {
            eVar = this.f103020d.a(j10, str, tPVideoInfoA, null);
            this.f103037u.c("switchDefinition selfPlayerUrl=" + eVar.b());
            this.f103037u.c("switchDefinition systemPlayerUrl=" + eVar.a());
        }
        this.f103037u.c("switchDefinition, proxyUrl:" + str + ", defID:" + j10);
        this.f103018b.b(tPVideoInfoA);
        this.f103018b.a(eVar, i10, j10);
        a(120, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("switch", String.valueOf(j10)).a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(String str, long j10, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        this.f103037u.c(f103016a + "switchDefinition, defUrl:" + str + ", defID:" + j10 + ", videoInfo:" + tPVideoInfo + ", httpHeader:" + map);
        switchDefinition(str, j10, tPVideoInfo, map, 0);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b(b = true, c = true)
    public void switchDefinition(String str, long j10, TPVideoInfo tPVideoInfo, Map<String, String> map, int i10) {
        if (!h()) {
            throw new IllegalStateException("error : switchDefinition , state invalid");
        }
        this.f103037u.c(f103016a + "switchDefinition, defUrl:" + str + ", defID:" + j10 + ", httpHeader:" + map + ", mode:" + i10);
        TPVideoInfo tPVideoInfoA = a(tPVideoInfo, (int) getCurrentPositionMs(), this.C);
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        if (e()) {
            eVar = this.f103020d.a(j10, str, tPVideoInfoA, map);
            this.f103037u.c("switchDefinition selfPlayerUrl=" + eVar.b());
            this.f103037u.c("switchDefinition systemPlayerUrl=" + eVar.a());
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar2 = eVar;
        this.f103037u.c("switchDefinition, proxyUrl:" + str + ", defID:" + j10 + ", httpHeader:" + map);
        this.f103018b.b(tPVideoInfoA);
        this.f103018b.a(eVar2, map, i10, j10);
        a(120, 0, 0, (String) null, new com.tencent.thumbplayer.tcmedia.utils.g().a("switch", String.valueOf(j10)).a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    public void updateLoggerContext(com.tencent.thumbplayer.tcmedia.e.b bVar) {
        if (bVar != null) {
            this.f103039x = false;
            this.f103037u.a(new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPPlayer"));
            this.f103018b.a(this.f103037u.a());
            this.f103019c.a(this.f103037u.a().a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.ITPPlayer
    @n.b
    public void updateTaskInfo(String str, Object obj) {
        com.tencent.thumbplayer.tcmedia.c.a aVar = this.f103020d;
        if (aVar != null) {
            aVar.a(str, obj);
        }
    }
}
