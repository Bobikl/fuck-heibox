package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f102964i = new b();

    private void c() {
        com.tencent.thumbplayer.tcmedia.tplayer.a.a.a aVar = this.f102942b;
        if (aVar == null) {
            TPLogUtil.e("TPPrepareFailReporter", "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsA = aVar.a();
        this.f102964i.f102800a.a(this.f102945e.f102991i);
        this.f102964i.f102800a.f(this.f102945e.f102989g);
        this.f102964i.f102800a.j(this.f102945e.f102987e);
        this.f102964i.f102800a.l(TPDownloadProxyHelper.getNativeLibVersion());
        b bVar = this.f102964i;
        bVar.f102800a.k(bVar.f102801b);
        b bVar2 = this.f102964i;
        bVar2.f102800a.o(bVar2.f102804e);
        b bVar3 = this.f102964i;
        bVar3.f102800a.m(bVar3.f102803d);
        b bVar4 = this.f102964i;
        bVar4.f102800a.n(bVar4.f102802c);
        this.f102964i.f102800a.l(this.f102945e.f102990h);
        this.f102948h.put("buffermintotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.f102948h.put("buffermaxtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.f102948h.put("preloadtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.f102948h.put("minbufferingdurationms", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMinBufferingDurationMs));
        this.f102948h.put("minbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMinBufferingTimeMs));
        this.f102948h.put("maxbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.f102948h.put("reducelatencyaction", Integer.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mReduceLatencyAction));
        this.f102948h.put("reducelatencyspeed", Float.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.f102948h.put("buffertype", Integer.valueOf(tPGeneralPlayFlowParamsA.mPlayerConfigParams.mBufferType));
        try {
            this.f102964i.f102800a.p(new JSONObject(this.f102948h).toString());
        } catch (NullPointerException e10) {
            TPLogUtil.e("TPPrepareFailReporter", e10);
        }
    }

    private void c(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.i)) {
            TPLogUtil.e("TPPrepareFailReporter", "onPrepareError fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.i iVar = (com.tencent.thumbplayer.tcmedia.d.b.i) aVar;
        int iD = iVar.d();
        int iE = iVar.e();
        TPLogUtil.i("TPPrepareFailReporter", "onPrepareError errorType:" + iD + " errorCode:" + iE);
        com.tencent.thumbplayer.tcmedia.tplayer.a.b.b bVar = new com.tencent.thumbplayer.tcmedia.tplayer.a.b.b();
        bVar.o(iE);
        c();
        b(this.f102964i);
        this.f102946f.b(this.f102964i.f102800a);
        bVar.a(this.f102964i.f102800a);
        Map<String, String> mapB = bVar.b();
        a("onPrepareError", mapB);
        b("prepare_fail", mapB);
        c("prepare_fail", mapB);
    }

    private void d(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.e)) {
            TPLogUtil.e("TPPrepareFailReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iD = ((com.tencent.thumbplayer.tcmedia.d.b.e) aVar).d();
        TPLogUtil.i("TPPrepareFailReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iD)));
        this.f102964i.f102801b = iD;
    }

    private void e(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.d)) {
            TPLogUtil.e("TPPrepareFailReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.tencent.thumbplayer.tcmedia.d.b.d dVar = (com.tencent.thumbplayer.tcmedia.d.b.d) aVar;
        String strD = dVar.d();
        String strE = dVar.e();
        TPLogUtil.i("TPPrepareFailReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strD + " uIp:" + strE);
        b bVar = this.f102964i;
        bVar.f102802c = strD;
        bVar.f102803d = strE;
    }

    private void f(com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (!(aVar instanceof com.tencent.thumbplayer.tcmedia.d.b.f)) {
            TPLogUtil.e("TPPrepareFailReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strD = ((com.tencent.thumbplayer.tcmedia.d.b.f) aVar).d();
        TPLogUtil.i("TPPrepareFailReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strD)));
        this.f102964i.f102804e = strD;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a() {
        super.a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(int i10, com.tencent.thumbplayer.tcmedia.d.b.a aVar) {
        if (i10 == 6) {
            c(aVar);
            return;
        }
        switch (i10) {
            case 100:
                d(aVar);
                break;
            case 101:
                e(aVar);
                break;
            case 102:
                f(aVar);
                break;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.a.c, com.tencent.thumbplayer.tcmedia.tplayer.a.a
    public void a(Context context, l lVar) {
        super.a(context, lVar);
        this.f102946f.a(this.f102964i.f102800a);
    }
}
