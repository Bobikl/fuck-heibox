package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class g implements RequestCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f29842a;

    g(f fVar) {
        this.f29842a = fVar;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        this.f29842a.f29839b.onDataReceive(byteArray, z10);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (i10 <= 0 && i10 != -204) {
            this.f29842a.f29841d.handleCallbacks(2, new anet.channel.entity.b(2, 0, "Http connect fail"));
        }
        this.f29842a.f29839b.onFinish(i10, str, requestStatistic);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        ALog.i("awcn.HttpSession", "", this.f29842a.f29838a.getSeq(), "httpStatusCode", Integer.valueOf(i10));
        ALog.i("awcn.HttpSession", "", this.f29842a.f29838a.getSeq(), "response headers", map);
        this.f29842a.f29839b.onResponseCode(i10, map);
        this.f29842a.f29840c.serverRT = HttpHelper.parseServerRT(map);
        f fVar = this.f29842a;
        fVar.f29841d.handleResponseCode(fVar.f29838a, i10);
        f fVar2 = this.f29842a;
        fVar2.f29841d.handleResponseHeaders(fVar2.f29838a, map);
    }
}
