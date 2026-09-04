package anetwork.channel.unified;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f30352b;

    p(m mVar) {
        this.f30352b = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f30352b.f30345a.f30342d.compareAndSet(false, true)) {
            RequestStatistic requestStatistic = this.f30352b.f30345a.f30339a.f30244f;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.statusCode = -202;
                requestStatistic.msg = ErrorConstant.getErrMsg(-202);
                requestStatistic.rspEnd = System.currentTimeMillis();
                ALog.e("anet.UnifiedRequestTask", "task time out", this.f30352b.f30345a.f30341c, "rs", requestStatistic);
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-202, null, requestStatistic, null));
            }
            this.f30352b.f30345a.b();
            this.f30352b.f30345a.f30340b.b(new DefaultFinishEvent(-202, (String) null, this.f30352b.f30345a.f30339a.a()));
        }
    }
}
