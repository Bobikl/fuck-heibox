package com.tencent.thumbplayer.tcmedia.adapter.a.a;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback;
import com.tencent.thumbplayer.tcmedia.core.subtitle.TPNativeSubtitleRenderParams;
import com.tencent.thumbplayer.tcmedia.core.subtitle.TPSubtitleParser;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements com.tencent.thumbplayer.tcmedia.adapter.a.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TPNativeSubtitleRenderParams f102159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a f102160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a.a.d f102161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a.a.c f102162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a.a.b f102163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TPSubtitleParser f102164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f102165h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f102158a = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Future<?> f102166i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f102167j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f102168k = a.IDLE;

    public enum a {
        IDLE,
        INITED,
        PREPARED,
        STOPED,
        ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        if (this.f102168k != a.INITED) {
            TPLogUtil.e("TPSysPlayerExternalSubtitle", "prepare, illegalState, state:" + this.f102168k);
            return;
        }
        TPMediaTrackInfo[] trackInfo = this.f102164g.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            TPLogUtil.w("TPSysPlayerExternalSubtitle", "prepare, err, trackInfos is empty.");
            this.f102168k = a.ERROR;
            return;
        }
        if (trackInfo[0].trackType != 3) {
            this.f102168k = a.ERROR;
            TPLogUtil.w("TPSysPlayerExternalSubtitle", "prepare, err, track type not match.");
            return;
        }
        this.f102164g.selectTrackAsync(0, j10);
        this.f102168k = a.PREPARED;
        if (this.f102158a == 0) {
            synchronized (this.f102167j) {
                Future<?> future = this.f102166i;
                if (future != null) {
                    future.cancel(true);
                    this.f102166i = null;
                }
                this.f102166i = o.a().e().scheduleAtFixedRate(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.b(0);
                    }
                }, 0L, 200L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        com.tencent.thumbplayer.tcmedia.adapter.a.a.a.d dVar = this.f102161d;
        com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a interfaceC1010a = this.f102160c;
        if (dVar == null || interfaceC1010a == null) {
            TPLogUtil.w("TPSysPlayerExternalSubtitle", "subPollFunc, posLis:" + dVar + ", subLis:" + interfaceC1010a);
            return;
        }
        long jA = dVar.a();
        if (jA < 0) {
            TPLogUtil.w("TPSysPlayerExternalSubtitle", "subPollFunc, cur position:".concat(String.valueOf(jA)));
            return;
        }
        String subtitleText = this.f102164g.getSubtitleText(jA, i10);
        if (TextUtils.equals(this.f102165h, subtitleText)) {
            return;
        }
        this.f102165h = subtitleText;
        interfaceC1010a.a(new com.tencent.thumbplayer.tcmedia.adapter.a.a.a.e(subtitleText));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a() {
        if (this.f102168k != a.INITED) {
            TPLogUtil.e("TPSysPlayerExternalSubtitle", "prepare, illegalState, state:" + this.f102168k);
            return;
        }
        TPLogUtil.i("TPSysPlayerExternalSubtitle", "prepare.");
        this.f102164g.init();
        this.f102164g.loadAsync();
        TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams = this.f102159b;
        if (tPNativeSubtitleRenderParams != null) {
            this.f102164g.setRenderParams(tPNativeSubtitleRenderParams);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(int i10) {
        this.f102158a = i10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.a.a.InterfaceC1010a interfaceC1010a) {
        this.f102160c = interfaceC1010a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.a.a.b bVar) {
        this.f102163f = bVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.a.a.c cVar) {
        this.f102162e = cVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.a.a.d dVar) {
        this.f102161d = dVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(TPSubtitleRenderModel tPSubtitleRenderModel) {
        TPNativeSubtitleRenderParams tPNativeSubtitleRenderParamsA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPSubtitleRenderModel);
        this.f102159b = tPNativeSubtitleRenderParamsA;
        TPSubtitleParser tPSubtitleParser = this.f102164g;
        if (tPSubtitleParser != null) {
            tPSubtitleParser.setRenderParams(tPNativeSubtitleRenderParamsA);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void a(String str, Map<String, String> map, final long j10) {
        if (this.f102168k != a.IDLE) {
            TPLogUtil.e("TPSysPlayerExternalSubtitle", "setDataSource, illegalState, state:" + this.f102168k);
        } else {
            if (TextUtils.isEmpty(str)) {
                TPLogUtil.e("TPSysPlayerExternalSubtitle", "setDataSource, illegal argument, url:".concat(String.valueOf(str)));
                return;
            }
            TPLogUtil.i("TPSysPlayerExternalSubtitle", "setDataSource, url: ".concat(String.valueOf(str)));
            if (this.f102164g != null) {
                TPLogUtil.w("TPSysPlayerExternalSubtitle", "setDataSource, mTpSubParser != null.");
                try {
                    this.f102164g.stop();
                    this.f102164g.unInit();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f102164g = null;
            }
            this.f102164g = new TPSubtitleParser(str, map, new ITPSubtitleParserCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.a.c.1
                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public long onGetCurrentPlayPositionMs() {
                    if (c.this.f102161d != null) {
                        return c.this.f102161d.a();
                    }
                    return 0L;
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onLoadResult(int i10) {
                    TPLogUtil.i("TPSysPlayerExternalSubtitle", "onLoadResult, index:".concat(String.valueOf(i10)));
                    c.this.a(j10);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSelectResult(int i10, long j11) {
                    TPLogUtil.i("TPSysPlayerExternalSubtitle", "onSelectResult, errCode:" + i10 + ", selectOpaque:" + j11 + ", opaque =" + j10);
                    if (i10 == 0 && c.this.f102162e != null) {
                        c.this.f102162e.a(j10);
                    } else {
                        if (i10 == 0 || c.this.f102162e == null) {
                            return;
                        }
                        c.this.f102162e.a(i10, j10);
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleError(int i10, int i11) {
                    TPLogUtil.i("TPSysPlayerExternalSubtitle", "onSubtitleError, index:" + i10 + ", errorCode:" + i11);
                    c.this.f102163f.a(i10, i11);
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame) {
                    TPLogUtil.i("TPSysPlayerExternalSubtitle", "onSubtitleFrame");
                    if (c.this.f102160c != null) {
                        c.this.f102160c.a(tPSubtitleFrame);
                    }
                }

                @Override // com.tencent.thumbplayer.tcmedia.core.subtitle.ITPSubtitleParserCallback
                public void onSubtitleNote(String str2) {
                    TPLogUtil.i("TPSysPlayerExternalSubtitle", "onSubtitleNote");
                    if (c.this.f102160c != null) {
                        c.this.f102160c.a(str2);
                    }
                }
            }, this.f102158a);
            this.f102168k = a.INITED;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void b() {
        if (this.f102168k == a.PREPARED) {
            TPLogUtil.i("TPSysPlayerExternalSubtitle", "startAsync");
            this.f102164g.startAsync();
        } else {
            TPLogUtil.e("TPSysPlayerExternalSubtitle", "startAsync, illegalState, state:" + this.f102168k);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void c() {
        if (this.f102168k == a.PREPARED) {
            TPLogUtil.i("TPSysPlayerExternalSubtitle", "pauseAsync");
            this.f102164g.pauseAsync();
        } else {
            TPLogUtil.e("TPSysPlayerExternalSubtitle", "pauseAsync, illegalState, state:" + this.f102168k);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void d() {
        TPLogUtil.i("TPSysPlayerExternalSubtitle", "stop.");
        a aVar = this.f102168k;
        if (aVar == a.INITED || aVar == a.PREPARED || aVar == a.ERROR) {
            TPSubtitleParser tPSubtitleParser = this.f102164g;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.f102164g.unInit();
                } catch (Exception e10) {
                    TPLogUtil.e("TPSysPlayerExternalSubtitle", e10);
                }
            }
            this.f102164g = null;
        }
        if (this.f102158a == 0) {
            synchronized (this.f102167j) {
                Future<?> future = this.f102166i;
                if (future != null) {
                    future.cancel(true);
                    this.f102166i = null;
                }
            }
        }
        this.f102168k = a.STOPED;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void e() {
        TPLogUtil.i("TPSysPlayerExternalSubtitle", "reset.");
        if (this.f102168k != a.IDLE) {
            TPSubtitleParser tPSubtitleParser = this.f102164g;
            if (tPSubtitleParser != null) {
                try {
                    tPSubtitleParser.stop();
                    this.f102164g.unInit();
                } catch (Exception e10) {
                    TPLogUtil.e("TPSysPlayerExternalSubtitle", e10);
                }
            }
            this.f102164g = null;
        }
        synchronized (this.f102167j) {
            Future<?> future = this.f102166i;
            if (future != null) {
                future.cancel(true);
                this.f102166i = null;
            }
        }
        this.f102168k = a.IDLE;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a.a
    public void f() {
        TPLogUtil.i("TPSysPlayerExternalSubtitle", "release.");
        this.f102161d = null;
        this.f102160c = null;
    }
}
