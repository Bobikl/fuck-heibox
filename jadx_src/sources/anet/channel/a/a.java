package anet.channel.a;

import ad.c;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.fulltrace.RequestInfo;
import com.taobao.analysis.scene.SceneIdentifier;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements IFullTraceAnalysis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29602a;

    public a() {
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.f29602a = true;
        } catch (Exception unused) {
            this.f29602a = false;
            ALog.e("awcn.DefaultFullTraceAnalysis", "not supoort FullTraceAnalysis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        if (!this.f29602a || requestStatistic == null || TextUtils.isEmpty(str)) {
            return;
        }
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.host = requestStatistic.host;
        requestInfo.bizId = requestStatistic.bizId;
        requestInfo.url = requestStatistic.url;
        requestInfo.retryTimes = requestStatistic.retryTimes;
        requestInfo.netType = requestStatistic.netType;
        requestInfo.protocolType = requestStatistic.protocolType;
        requestInfo.ret = requestStatistic.ret;
        requestInfo.isCbMain = false;
        requestInfo.isReqMain = requestStatistic.isReqMain;
        requestInfo.isReqSync = requestStatistic.isReqSync;
        requestInfo.netErrorCode = String.valueOf(requestStatistic.statusCode);
        requestInfo.pTraceId = requestStatistic.pTraceId;
        requestInfo.netReqStart = requestStatistic.netReqStart;
        requestInfo.netReqServiceBindEnd = requestStatistic.reqServiceTransmissionEnd;
        requestInfo.netReqProcessStart = requestStatistic.reqStart;
        requestInfo.netReqSendStart = requestStatistic.sendStart;
        requestInfo.netRspRecvEnd = requestStatistic.rspEnd;
        requestInfo.netRspCbDispatch = requestStatistic.rspCbDispatch;
        requestInfo.netRspCbStart = requestStatistic.rspCbStart;
        requestInfo.netRspCbEnd = requestStatistic.rspCbEnd;
        requestInfo.reqDeflateSize = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
        requestInfo.reqInflateSize = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
        requestInfo.rspDeflateSize = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
        requestInfo.rspInflateSize = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
        requestInfo.serverRT = requestStatistic.serverRT;
        requestInfo.sendDataTime = requestStatistic.sendDataTime;
        requestInfo.firstDataTime = requestStatistic.firstDataTime;
        requestInfo.recvDataTime = requestStatistic.recDataTime;
        FullTraceAnalysis.getInstance().commitRequest(str, c.f1243w, requestInfo);
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        if (this.f29602a) {
            return FullTraceAnalysis.getInstance().createRequest(c.f1243w);
        }
        return null;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public anet.channel.fulltrace.b getSceneInfo() {
        if (!this.f29602a) {
            return null;
        }
        anet.channel.fulltrace.b bVar = new anet.channel.fulltrace.b();
        bVar.f29710b = SceneIdentifier.isUrlLaunch();
        bVar.f29711c = SceneIdentifier.getAppLaunchTime();
        bVar.f29712d = SceneIdentifier.getLastLaunchTime();
        bVar.f29713e = SceneIdentifier.getDeviceLevel();
        bVar.f29709a = SceneIdentifier.getStartType();
        bVar.f29714f = SceneIdentifier.getBucketInfo();
        bVar.f29715g = ABTestCenter.getUTABTestBucketId("networksdk");
        return bVar;
    }
}
