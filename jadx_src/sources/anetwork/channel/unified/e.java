package anetwork.channel.unified;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e implements RequestCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f30301a;

    e(d dVar) {
        this.f30301a = dVar;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        if (this.f30301a.f30297d.f30342d.get()) {
            return;
        }
        d.c(this.f30301a);
        if (this.f30301a.f30297d.f30340b != null) {
            this.f30301a.f30297d.f30340b.a(this.f30301a.f30299f, this.f30301a.f30298e, byteArray);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (this.f30301a.f30297d.f30342d.getAndSet(true)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.DegradeTask", "[onFinish]", this.f30301a.f30297d.f30341c, "code", Integer.valueOf(i10), "msg", str);
        }
        this.f30301a.f30297d.a();
        requestStatistic.isDone.set(true);
        if (this.f30301a.f30297d.f30340b != null) {
            this.f30301a.f30297d.f30340b.b(new DefaultFinishEvent(i10, str, this.f30301a.f30300g));
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        if (this.f30301a.f30297d.f30342d.get()) {
            return;
        }
        this.f30301a.f30297d.a();
        anetwork.channel.cookie.a.l(this.f30301a.f30297d.f30339a.l(), map);
        this.f30301a.f30298e = HttpHelper.parseContentLength(map);
        if (this.f30301a.f30297d.f30340b != null) {
            this.f30301a.f30297d.f30340b.onResponseCode(i10, map);
        }
    }
}
