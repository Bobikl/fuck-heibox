package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f103011i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f103012j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f103013k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f103014l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f103015m = new m();

    private void a(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> mapB = b(j10, i10, tPGeneralPlayFlowParams).b();
        a("reportVodEndEvent", mapB);
        b("vod_end", mapB);
        c("vod_end", mapB);
    }

    private void a(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.f103013k) {
            k(new com.tencent.thumbplayer.tcmedia.d.b.C1018b());
            this.f103013k = false;
        }
        if (this.f103012j) {
            i(new com.tencent.thumbplayer.tcmedia.d.b.q());
            this.f103012j = false;
        }
        if (this.f103014l) {
            m mVar = this.f103015m;
            if (mVar.f102997j > 0) {
                long j11 = mVar.f102998k;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m mVar2 = this.f103015m;
                mVar.f102998k = j11 + (jElapsedRealtime - mVar2.f102997j);
                mVar2.f102997j = 0L;
            }
            this.f103014l = false;
        }
        TPLogUtil.d("TPVodReporter", "reportPlayerEndEvent playerStopTimeMs:" + j10 + " errorCode:" + i10);
        a(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        a(j10, i10, tPGeneralPlayFlowParams);
    }

    private void a(long j10, long j11, int i10) {
        if (!this.f103015m.f103007t.containsKey(Long.valueOf(j10))) {
            TPLogUtil.e("TPVodReporter", "reportSelectTrackEndEvent mSelectTrackInfoList is not contain key:".concat(String.valueOf(j10)));
            return;
        }
        m.a aVar = this.f103015m.f103007t.get(Long.valueOf(j10));
        long j12 = j11 - aVar.f103009b;
        TPLogUtil.d("TPVodReporter", "reportSelectTrackEndEvent trackUniqueIndex:" + j10 + " costTimeMs:" + j12 + " trackId:" + aVar.f103008a);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.f fVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.f();
        fVar.o(i10);
        fVar.c(j12);
        fVar.p(aVar.f103010c.getTrackType());
        fVar.q(aVar.f103010c.isInternal ? 1 : 0);
        this.f102946f.b(this.f103015m.f102800a);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar2 = this.f103015m.f102800a;
        int i11 = this.f102947g;
        this.f102947g = i11 + 1;
        aVar2.a(i11);
        fVar.a(this.f103015m.f102800a);
        Map<String, String> mapB = fVar.b();
        a("onSelectTrackEnd", mapB);
        b("vod_select_track", mapB);
        c("vod_select_track", mapB);
        this.f103015m.f103007t.remove(Long.valueOf(j10));
    }

    private void a(TPDrmInfo tPDrmInfo) {
        Map<String, String> mapB = b(tPDrmInfo).b();
        a("reportPlayerDrmInfoEvent", mapB);
        b("vod_drm_authentication", mapB);
        c("vod_drm_authentication", mapB);
    }

    private void a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> mapB = b(tPGeneralPlayFlowParams, tPDynamicStatisticParams).b();
        a("reportVodEndFlowEvent", mapB);
        b("vod_flow", mapB);
        c("vod_flow", mapB);
    }

    private void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.c cVar, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        cVar.t(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        cVar.u(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        cVar.v(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        cVar.w(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        cVar.s(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    private void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.e eVar, TPDynamicStatisticParams tPDynamicStatisticParams) {
        eVar.u(tPDynamicStatisticParams.mMaxVideoStreamBitrate);
        eVar.v(tPDynamicStatisticParams.mAvgVideoStreamBitrate);
        eVar.w(tPDynamicStatisticParams.mMinVideoStreamBitrate);
        eVar.x(tPDynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        eVar.y(tPDynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        eVar.z(tPDynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        eVar.o(tPDynamicStatisticParams.mVideoDecodeFrameCount);
        eVar.p(tPDynamicStatisticParams.mVideoRenderFrameCount);
    }

    private void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.e eVar, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        eVar.f(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        eVar.g(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        eVar.h(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        eVar.i(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        eVar.j(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        eVar.k(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        eVar.l(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        eVar.m(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        eVar.n(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        eVar.o(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        eVar.q(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        eVar.r(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        eVar.s(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        eVar.t(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }

    private com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.b b(TPDrmInfo tPDrmInfo) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.b bVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.b();
        bVar.n(tPDrmInfo.drmAbility);
        bVar.q(tPDrmInfo.drmSupportSecureDecoder);
        bVar.r(tPDrmInfo.drmSupportSecureDecrypt);
        bVar.p(tPDrmInfo.drmSecureLevel);
        bVar.q(tPDrmInfo.drmComponentName);
        bVar.o(tPDrmInfo.drmType);
        bVar.c(tPDrmInfo.drmPrepareStartTimeMs);
        bVar.d(tPDrmInfo.drmPrepareEndTimeMs);
        bVar.e(tPDrmInfo.drmOpenSessionStartTimeMs);
        bVar.f(tPDrmInfo.drmOpenSessionEndTimeMs);
        bVar.g(tPDrmInfo.drmGetProvisionReqStartTimeMs);
        bVar.h(tPDrmInfo.drmGetProvisionReqEndTimeMs);
        bVar.i(tPDrmInfo.drmSendProvisionReqTimeMs);
        bVar.j(tPDrmInfo.drmRecvProvisionRespTimeMs);
        bVar.k(tPDrmInfo.drmProvideProvisionRespStartTimeMs);
        bVar.l(tPDrmInfo.drmProvideProvisionRespEndTimeMs);
        bVar.m(tPDrmInfo.drmGetKeyReqStartTimeMs);
        bVar.n(tPDrmInfo.drmGetKeyReqEndTimeMs);
        bVar.o(tPDrmInfo.drmSendKeyReqTimeMs);
        bVar.p(tPDrmInfo.drmRecvKeyRespTimeMs);
        bVar.q(tPDrmInfo.drmProvideKeyRespStartTimeMs);
        bVar.r(tPDrmInfo.drmProvideKeyRespEndTimeMs);
        this.f102946f.b(this.f103015m.f102800a);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = this.f103015m.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar.a(i10);
        bVar.a(this.f103015m.f102800a);
        return bVar;
    }

    private com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.c b(long j10, int i10, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.c cVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.c();
        m mVar = this.f103015m;
        long j11 = j10 - mVar.f102994g;
        mVar.f102996i = j11;
        cVar.c(j11);
        cVar.o(i10);
        cVar.p(this.f103015m.f103000m);
        cVar.q(this.f103015m.f103001n);
        cVar.d(this.f103015m.f103002o);
        cVar.r(this.f103015m.f103004q);
        cVar.e(this.f103015m.f103005r);
        a(cVar, tPGeneralPlayFlowParams);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = this.f103015m.f102800a;
        int i11 = this.f102947g;
        this.f102947g = i11 + 1;
        aVar.a(i11);
        this.f102946f.b(this.f103015m.f102800a);
        cVar.a(this.f103015m.f102800a);
        return cVar;
    }

    private com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.e b(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.e eVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.e();
        eVar.c(this.f102945e.f102983a);
        eVar.d(this.f102945e.f102984b);
        eVar.e(this.f102945e.f102985c);
        eVar.p(this.f103015m.f102993f);
        a(eVar, tPGeneralPlayFlowParams);
        a(eVar, tPDynamicStatisticParams);
        this.f102946f.b(this.f103015m.f102800a);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar = this.f103015m.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar.a(i10);
        eVar.a(this.f103015m.f102800a);
        return eVar;
    }

    private void c() {
        TPLogUtil.d("TPVodReporter", "onAppForeground");
        a(this.f103015m.f102800a.a());
    }

    private void c(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.o)) {
            TPLogUtil.e("TPVodReporter", "onPrepareDone fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.o oVar = (com.tencent.thumbplayer.tcmedia.d.b.o) aVar;
        long jB = oVar.b() - this.f102945e.f102985c;
        this.f103015m.f102993f = oVar.b();
        a(this.f103015m);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar2 = this.f103015m.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar2.a(i10);
        this.f102946f.b(this.f103015m.f102800a);
        b(this.f103015m);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.d dVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.d();
        dVar.c(jB);
        dVar.a(this.f103015m.f102800a);
        Map<String, String> mapB = dVar.b();
        a("onPrepareDone", mapB);
        b("vod_first_load", mapB);
        c("vod_first_load", mapB);
    }

    private void d() {
        TPLogUtil.d("TPVodReporter", "onAppBackground");
        if (this.f103011i) {
            return;
        }
        a("vod_flow", b(b(), a(false)));
        a("vod_end", b(SystemClock.elapsedRealtime(), 0, b()));
    }

    private void d(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.m)) {
            TPLogUtil.e("TPVodReporter", "onPlayerStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.m mVar = (com.tencent.thumbplayer.tcmedia.d.b.m) aVar;
        this.f103011i = false;
        this.f103014l = false;
        m mVar2 = this.f103015m;
        if (mVar2.f102994g == 0) {
            mVar2.f102994g = mVar.b();
        }
        this.f103015m.f102995h = mVar.b();
        m mVar3 = this.f103015m;
        if (mVar3.f102997j > 0) {
            long j10 = mVar3.f102998k;
            long jB = mVar.b();
            m mVar4 = this.f103015m;
            mVar3.f102998k = j10 + (jB - mVar4.f102997j);
            mVar4.f102997j = 0L;
        }
    }

    private void e(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.j)) {
            TPLogUtil.e("TPVodReporter", "onPlayerPause fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.j jVar = (com.tencent.thumbplayer.tcmedia.d.b.j) aVar;
        if (this.f103014l) {
            TPLogUtil.e("TPVodReporter", "onPlayerPause has been called");
            return;
        }
        this.f103014l = true;
        this.f103015m.f102997j = jVar.b();
        TPLogUtil.d("TPVodReporter", "Vod onPlayerPause timeMs:" + this.f103015m.f102997j);
    }

    private void f(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (this.f103011i) {
            TPLogUtil.e("TPVodReporter", "Player has been called End");
            return;
        }
        this.f103011i = true;
        a(aVar.b(), 0, a(aVar), b(aVar));
        a(this.f103015m.f102800a.a());
    }

    private void g(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (this.f103011i) {
            TPLogUtil.e("TPVodReporter", "Player has been called End");
            return;
        }
        this.f103011i = true;
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.i)) {
            TPLogUtil.e("TPVodReporter", "onPlayerError fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.i iVar = (com.tencent.thumbplayer.tcmedia.d.b.i) aVar;
        a(iVar.b(), iVar.e(), a(iVar), b(iVar));
        a(this.f103015m.f102800a.a());
    }

    private void h(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.r)) {
            TPLogUtil.e("TPVodReporter", "onSeekStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.r rVar = (com.tencent.thumbplayer.tcmedia.d.b.r) aVar;
        if (this.f103013k) {
            k(new com.tencent.thumbplayer.tcmedia.d.b.C1018b());
        }
        if (this.f103012j) {
            i(new com.tencent.thumbplayer.tcmedia.d.b.q());
        }
        this.f103012j = true;
        this.f103015m.f102999l = rVar.b();
        TPLogUtil.d("TPVodReporter", "Vod onSeekStart timeMs:" + this.f103015m.f102999l);
    }

    private void i(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.q)) {
            TPLogUtil.e("TPVodReporter", "onSeekEnd fail:params is not match");
            return;
        }
        this.f103012j = false;
        long jB = ((com.tencent.thumbplayer.tcmedia.d.b.q) aVar).b();
        m mVar = this.f103015m;
        long j10 = jB - mVar.f102999l;
        if (j10 > 1200) {
            mVar.f103001n++;
            mVar.f103002o = (int) (((long) mVar.f103002o) + j10);
        }
        mVar.f103000m++;
        TPLogUtil.d("TPVodReporter", "Vod onSeekEnd seekCostTimeMs:" + j10 + " mSeekTotalCount:" + this.f103015m.f103000m + " mSeekBufferingTotalCount:" + this.f103015m.f103001n + " mSeekBufferingTotalDurationMs:" + this.f103015m.f103002o);
    }

    private void j(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.c)) {
            TPLogUtil.e("TPVodReporter", "onBufferingStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.c cVar = (com.tencent.thumbplayer.tcmedia.d.b.c) aVar;
        this.f103013k = true;
        if (this.f103012j) {
            return;
        }
        this.f103015m.f103003p = cVar.b();
        TPLogUtil.d("TPVodReporter", "Vod onBufferingStart timeMs:" + this.f103015m.f103003p);
    }

    private void k(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.C1018b)) {
            TPLogUtil.e("TPVodReporter", "onBufferingEnd fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.C1018b c1018b = (com.tencent.thumbplayer.tcmedia.d.b.C1018b) aVar;
        this.f103013k = false;
        if (this.f103012j) {
            return;
        }
        long jB = c1018b.b() - this.f103015m.f103003p;
        TPLogUtil.d("TPVodReporter", "Vod onBufferingEnd bufferingCostTimeMs:".concat(String.valueOf(jB)));
        if (jB <= 1200) {
            return;
        }
        m mVar = this.f103015m;
        mVar.f103004q++;
        mVar.f103005r = (int) (((long) mVar.f103005r) + jB);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.a aVar2 = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b.a();
        aVar2.b(this.f103015m.f103006s);
        aVar2.c(jB);
        this.f102946f.b(this.f103015m.f102800a);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar3 = this.f103015m.f102800a;
        int i10 = this.f102947g;
        this.f102947g = i10 + 1;
        aVar3.a(i10);
        aVar2.a(this.f103015m.f102800a);
        Map<String, String> mapB = aVar2.b();
        a("onBufferingEnd", mapB);
        b("vod_second_buffering", mapB);
        c("vod_second_buffering", mapB);
    }

    private void l(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.v)) {
            TPLogUtil.e("TPVodReporter", "onSetPlaySpeed fail:params is not match");
            return;
        }
        this.f103015m.f103006s = ((com.tencent.thumbplayer.tcmedia.d.b.v) aVar).d();
        TPLogUtil.d("TPVodReporter", "Vod onSetPlaySpeed mPlaySpeed:" + this.f103015m.f103006s);
    }

    private void m(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.t)) {
            TPLogUtil.e("TPVodReporter", "onSelectTrackStart fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.t tVar = (com.tencent.thumbplayer.tcmedia.d.b.t) aVar;
        int iD = tVar.d();
        long jE = tVar.e();
        TPLogUtil.d("TPVodReporter", "Vod onSelectTrackStart trackId:" + iD + " trackUniqueIndex:" + jE);
        if (this.f103015m.f103007t.containsKey(Long.valueOf(jE))) {
            return;
        }
        m.a aVar2 = new m.a();
        aVar2.f103008a = iD;
        aVar2.f103010c = tVar.f();
        aVar2.f103009b = tVar.b();
        this.f103015m.f103007t.put(Long.valueOf(tVar.e()), aVar2);
    }

    private void n(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.s)) {
            TPLogUtil.e("TPVodReporter", "onSelectTrackEnd fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.s sVar = (com.tencent.thumbplayer.tcmedia.d.b.s) aVar;
        int iD = sVar.d();
        long jE = sVar.e();
        TPLogUtil.d("TPVodReporter", "Vod onSelectTrackEnd errorCode:" + iD + " trackUniqueIndex:" + jE);
        a(jE, sVar.b(), iD);
    }

    private void o(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.h) {
            a(((com.tencent.thumbplayer.tcmedia.d.b.h) aVar).d());
        } else {
            TPLogUtil.e("TPVodReporter", "onDrmInfo fail:params is not match");
        }
    }

    private void p(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.e)) {
            TPLogUtil.e("TPVodReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iD = ((com.tencent.thumbplayer.tcmedia.d.b.e) aVar).d();
        TPLogUtil.d("TPVodReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iD)));
        this.f103015m.f102801b = iD;
    }

    private void q(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.d)) {
            TPLogUtil.e("TPVodReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.d dVar = (com.tencent.thumbplayer.tcmedia.d.b.d) aVar;
        String strD = dVar.d();
        String strE = dVar.e();
        TPLogUtil.d("TPVodReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strD + " uIp:" + strE);
        m mVar = this.f103015m;
        mVar.f102802c = strD;
        mVar.f102803d = strE;
    }

    private void r(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.f)) {
            TPLogUtil.e("TPVodReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strD = ((com.tencent.thumbplayer.tcmedia.d.b.f) aVar).d();
        TPLogUtil.d("TPVodReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strD)));
        this.f103015m.f102804e = strD;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a() {
        super.a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (i10 == 1001) {
            c();
            return;
        }
        if (i10 == 1002) {
            d();
            return;
        }
        switch (i10) {
            case 2:
                c(aVar);
                break;
            case 3:
                d(aVar);
                break;
            case 4:
                e(aVar);
                break;
            case 5:
                f(aVar);
                break;
            case 6:
                g(aVar);
                break;
            case 7:
                h(aVar);
                break;
            case 8:
                i(aVar);
                break;
            case 9:
                j(aVar);
                break;
            case 10:
                k(aVar);
                break;
            case 11:
                m(aVar);
                break;
            case 12:
                n(aVar);
                break;
            case 13:
                l(aVar);
                break;
            case 14:
                o(aVar);
                break;
            default:
                switch (i10) {
                    case 100:
                        p(aVar);
                        break;
                    case 101:
                        q(aVar);
                        break;
                    case 102:
                        r(aVar);
                        break;
                }
                break;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(Context context, l lVar) {
        super.a(context, lVar);
        this.f102946f.a(this.f103015m.f102800a);
    }
}
