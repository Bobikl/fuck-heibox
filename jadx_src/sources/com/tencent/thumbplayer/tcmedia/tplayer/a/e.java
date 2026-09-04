package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f102957i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f102958j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f102959k = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f102960l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Future<?> f102961m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Runnable f102962n = new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.tplayer.a.e.1
        @Override // java.lang.Runnable
        public void run() {
            if (!e.this.f102957i) {
                e.this.g();
                return;
            }
            TPLogUtil.i("TPLiveReporter", "Period Timer Exit because play done.");
            e.this.f102961m.cancel(true);
            e.this.f102961m = null;
        }
    };

    private void a(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> mapB = b(j10, i10, tPGeneralPlayFlowParams).b();
        a("reportLiveEndEvent", mapB);
        b("live_end", mapB);
        c("live_end", mapB);
    }

    private void a(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.f102958j) {
            h(new com.tencent.thumbplayer.tcmedia.d.b.C1018b());
            this.f102958j = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d dVar = this.f102959k;
        dVar.f102956m += jElapsedRealtime - dVar.f102951h;
        d();
        TPLogUtil.i("TPLiveReporter", "reportPlayerEndEvent playerStopTimeMs:" + j10 + " errorCode:" + i10);
        a(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        a(j10, i10, tPGeneralPlayFlowParams);
    }

    private void a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> mapB = b(tPGeneralPlayFlowParams, tPDynamicStatisticParams).b();
        a("reportLiveEndFlowEvent", mapB);
        b("live_flow", mapB);
        c("live_flow", mapB);
    }

    private void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.a aVar, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        aVar.q(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        aVar.r(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        aVar.s(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        aVar.t(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        aVar.p(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.d dVar, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        dVar.f(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        dVar.g(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        dVar.h(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        dVar.i(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        dVar.j(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        dVar.k(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        dVar.l(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        dVar.m(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        dVar.n(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        dVar.o(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        dVar.q(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        dVar.r(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        dVar.s(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        dVar.t(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.a b(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.a aVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.a();
        d dVar = this.f102959k;
        long j11 = dVar.f102952i + (j10 - dVar.f102950g);
        dVar.f102952i = j11;
        aVar.c(j11);
        aVar.o(i10);
        a(aVar, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar2 = this.f102959k.f102800a;
        int i11 = this.f102947g;
        this.f102947g = i11 + 1;
        aVar2.a(i11);
        this.f102946f.b(this.f102959k.f102800a);
        aVar.a(this.f102959k.f102800a);
        return aVar;
    }

    private com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.d b(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.d dVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.d();
        dVar.c(this.f102945e.f102983a);
        dVar.d(this.f102945e.f102984b);
        dVar.e(this.f102945e.f102985c);
        dVar.p(this.f102959k.f102949f);
        a(dVar, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = this.f102959k.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar.a(i10);
        this.f102946f.b(this.f102959k.f102800a);
        dVar.a(this.f102959k.f102800a);
        return dVar;
    }

    private void c() {
        TPLogUtil.i("TPLiveReporter", "startPeriodReportTimer");
        synchronized (this.f102960l) {
            if (this.f102961m == null) {
                this.f102961m = o.a().e().scheduleAtFixedRate(this.f102962n, 0L, 60000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void c(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.o)) {
            TPLogUtil.e("TPLiveReporter", "onPrepareDone fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.o oVar = (com.tencent.thumbplayer.tcmedia.d.b.o) aVar;
        long jB = oVar.b() - this.f102945e.f102985c;
        this.f102959k.f102949f = oVar.b();
        TPLogUtil.i("TPLiveReporter", "Live onPrepareDone timeMs:".concat(String.valueOf(jB)));
        a(this.f102959k);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar2 = this.f102959k.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar2.a(i10);
        this.f102946f.b(this.f102959k.f102800a);
        b(this.f102959k);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.b bVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.b();
        bVar.c(jB);
        bVar.a(this.f102959k.f102800a);
        Map<String, String> mapB = bVar.b();
        a("onPrepareDone", mapB);
        b("live_first_load", mapB);
        c("live_first_load", mapB);
    }

    private void c(b bVar) {
        ITPReportInfoGetter iTPReportInfoGetter = this.f102941a;
        if (iTPReportInfoGetter == null) {
            return;
        }
        Map<String, String> periodExtendReportInfo = iTPReportInfoGetter.getPeriodExtendReportInfo();
        if (periodExtendReportInfo == null) {
            TPLogUtil.e("TPLiveReporter", "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null");
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c.a(periodExtendReportInfo, map, map2);
        bVar.f102800a.c(map);
        bVar.f102800a.d(map2);
    }

    private synchronized void d() {
        TPLogUtil.i("TPLiveReporter", "destroyPeriodReportTimer");
        synchronized (this.f102960l) {
            Future<?> future = this.f102961m;
            if (future != null) {
                future.cancel(true);
                this.f102961m = null;
            }
        }
    }

    private void d(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.m)) {
            TPLogUtil.e("TPLiveReporter", "onPlayerStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.m mVar = (com.tencent.thumbplayer.tcmedia.d.b.m) aVar;
        this.f102957i = false;
        d dVar = this.f102959k;
        if (dVar.f102950g == 0) {
            dVar.f102950g = mVar.b();
        }
        this.f102959k.f102951h = mVar.b();
        TPLogUtil.i("TPLiveReporter", "Live onPlayerStart FirstStartTimeMs:" + this.f102959k.f102950g + " mPlayerStartOccurElapsedTimeMs:" + this.f102959k.f102951h);
        c();
    }

    private void e() {
        TPLogUtil.i("TPLiveReporter", "onAppForeground");
        a(this.f102959k.f102800a.a());
    }

    private void e(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (this.f102957i) {
            TPLogUtil.e("TPLiveReporter", "Player has been called End");
            return;
        }
        this.f102957i = true;
        a(aVar.b(), 0, a(aVar), b(aVar));
        a(this.f102959k.f102800a.a());
    }

    private void f() {
        TPLogUtil.i("TPLiveReporter", "onAppBackground");
        if (this.f102957i) {
            return;
        }
        a("live_flow", b(b(), a(false)));
        a("live_end", b(SystemClock.elapsedRealtime(), 0, b()));
    }

    private void f(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (this.f102957i) {
            TPLogUtil.e("TPLiveReporter", "Player has been called End");
            return;
        }
        this.f102957i = true;
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.i)) {
            TPLogUtil.e("TPLiveReporter", "onPlayerError fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.i iVar = (com.tencent.thumbplayer.tcmedia.d.b.i) aVar;
        a(iVar.b(), iVar.e(), a(iVar), b(iVar));
        a(this.f102959k.f102800a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TPLogUtil.i("TPLiveReporter", "periodReportEvent enter.");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d dVar = this.f102959k;
        dVar.f102956m += jElapsedRealtime - dVar.f102951h;
        dVar.f102951h = SystemClock.elapsedRealtime();
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.c cVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.a.c();
        cVar.o(this.f102959k.f102955l);
        cVar.c(this.f102959k.f102954k);
        cVar.d(this.f102959k.f102956m);
        TPDynamicStatisticParams tPDynamicStatisticParamsA = this.f102942b.a(true);
        cVar.e(tPDynamicStatisticParamsA.mMaxVideoStreamBitrate);
        cVar.f(tPDynamicStatisticParamsA.mAvgVideoStreamBitrate);
        cVar.g(tPDynamicStatisticParamsA.mMinVideoStreamBitrate);
        cVar.h(tPDynamicStatisticParamsA.mMaxVideoDecodeCostTimeMs);
        cVar.i(tPDynamicStatisticParamsA.mAvgVideoDecodeCostTimeMs);
        cVar.j(tPDynamicStatisticParamsA.mMinVideoDecodeCostTimeMs);
        cVar.r(tPDynamicStatisticParamsA.mMaxVideoGopSize);
        cVar.q(tPDynamicStatisticParamsA.mAvgVideoGopSize);
        cVar.p(tPDynamicStatisticParamsA.mMinVideoGopSize);
        cVar.s(tPDynamicStatisticParamsA.mVideoDecodeFrameCount);
        cVar.t(tPDynamicStatisticParamsA.mVideoRenderFrameCount);
        cVar.k(tPDynamicStatisticParamsA.mVideoBufferedDurationMs);
        cVar.l(tPDynamicStatisticParamsA.mAudioBufferedDurationMs);
        c(this.f102959k);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = this.f102959k.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar.a(i10);
        this.f102946f.b(this.f102959k.f102800a);
        cVar.a(this.f102959k.f102800a);
        Map<String, String> mapB = cVar.b();
        a("periodReportEvent", mapB);
        b("live_period_report", mapB);
        c("live_period_report", mapB);
        d dVar2 = this.f102959k;
        dVar2.f102955l = 0;
        dVar2.f102954k = 0L;
        dVar2.f102956m = 0L;
        dVar2.f102800a.c((Map<String, String>) null);
        this.f102959k.f102800a.d((Map<String, String>) null);
    }

    private void g(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.c)) {
            TPLogUtil.e("TPLiveReporter", "onBufferingStart fail:params is not match");
            return;
        }
        this.f102958j = true;
        this.f102959k.f102953j = ((com.tencent.thumbplayer.tcmedia.d.b.c) aVar).b();
        TPLogUtil.i("TPLiveReporter", "Live onBufferingStart timeMs:" + this.f102959k.f102953j);
        d dVar = this.f102959k;
        dVar.f102956m = dVar.f102956m + (dVar.f102953j - dVar.f102951h);
    }

    private void h(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.C1018b)) {
            TPLogUtil.e("TPLiveReporter", "onBufferingEnd fail:params is not match");
            return;
        }
        this.f102958j = false;
        long jB = ((com.tencent.thumbplayer.tcmedia.d.b.C1018b) aVar).b();
        d dVar = this.f102959k;
        long j10 = jB - dVar.f102953j;
        dVar.f102951h = SystemClock.elapsedRealtime();
        TPLogUtil.i("TPLiveReporter", "Live onBufferingEnd bufferingCostTimeMs:".concat(String.valueOf(j10)));
        if (j10 <= 1200) {
            return;
        }
        d dVar2 = this.f102959k;
        dVar2.f102955l++;
        dVar2.f102954k += j10;
        dVar2.f102953j = 0L;
    }

    private void i(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.e)) {
            TPLogUtil.e("TPLiveReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iD = ((com.tencent.thumbplayer.tcmedia.d.b.e) aVar).d();
        TPLogUtil.i("TPLiveReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iD)));
        this.f102959k.f102801b = iD;
    }

    private void j(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.d)) {
            TPLogUtil.e("TPLiveReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.d dVar = (com.tencent.thumbplayer.tcmedia.d.b.d) aVar;
        String strD = dVar.d();
        String strE = dVar.e();
        TPLogUtil.i("TPLiveReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strD + " uIp:" + strE);
        d dVar2 = this.f102959k;
        dVar2.f102802c = strD;
        dVar2.f102803d = strE;
    }

    private void k(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.f)) {
            TPLogUtil.e("TPLiveReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strD = ((com.tencent.thumbplayer.tcmedia.d.b.f) aVar).d();
        TPLogUtil.i("TPLiveReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strD)));
        this.f102959k.f102804e = strD;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a() {
        super.a();
        d();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (i10 == 2) {
            c(aVar);
            return;
        }
        if (i10 == 3) {
            d(aVar);
            return;
        }
        if (i10 == 5) {
            e(aVar);
            return;
        }
        if (i10 == 6) {
            f(aVar);
            return;
        }
        if (i10 == 9) {
            g(aVar);
            return;
        }
        if (i10 == 10) {
            h(aVar);
            return;
        }
        if (i10 == 1001) {
            e();
            return;
        }
        if (i10 == 1002) {
            f();
            return;
        }
        switch (i10) {
            case 100:
                i(aVar);
                break;
            case 101:
                j(aVar);
                break;
            case 102:
                k(aVar);
                break;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(Context context, l lVar) {
        super.a(context, lVar);
        this.f102946f.a(this.f102959k.f102800a);
    }
}
