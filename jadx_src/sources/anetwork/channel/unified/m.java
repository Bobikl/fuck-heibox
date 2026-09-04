package anetwork.channel.unified;

import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected l f30345a;

    /* JADX INFO: compiled from: Taobao */
    public class a implements v3.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f30346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Request f30347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v3.a f30348c;

        a(int i10, Request request, v3.a aVar) {
            this.f30346a = i10;
            this.f30347b = request;
            this.f30348c = aVar;
        }

        @Override // v3.b.a
        public Future a(Request request, v3.a aVar) {
            if (m.this.f30345a.f30342d.get()) {
                ALog.i("anet.UnifiedRequestTask", "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            }
            if (this.f30346a < v3.c.d()) {
                return v3.c.c(this.f30346a).a(m.this.new a(this.f30346a + 1, request, aVar));
            }
            m.this.f30345a.f30339a.c(request);
            m.this.f30345a.f30340b = aVar;
            Cache cacheC = t3.b.n() ? anetwork.channel.cache.a.c(m.this.f30345a.f30339a.l(), m.this.f30345a.f30339a.m()) : null;
            l lVar = m.this.f30345a;
            lVar.f30343e = cacheC != null ? new c(lVar, cacheC) : new g(lVar, null, null);
            m.this.f30345a.f30343e.run();
            m.this.d();
            return null;
        }

        @Override // v3.b.a
        public v3.a callback() {
            return this.f30348c;
        }

        @Override // v3.b.a
        public Request request() {
            return this.f30347b;
        }
    }

    public m(anetwork.channel.entity.k kVar, anetwork.channel.entity.g gVar) {
        gVar.e(kVar.f30247i);
        this.f30345a = new l(kVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f30345a.f30344f = ThreadPoolExecutorFactory.submitScheduledTask(new p(this), this.f30345a.f30339a.e(), TimeUnit.MILLISECONDS);
    }

    public Future a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f30345a.f30339a.f30244f.reqServiceTransmissionEnd = jCurrentTimeMillis;
        this.f30345a.f30339a.f30244f.start = jCurrentTimeMillis;
        anetwork.channel.entity.k kVar = this.f30345a.f30339a;
        kVar.f30244f.isReqSync = kVar.h();
        this.f30345a.f30339a.f30244f.isReqMain = Looper.myLooper() == Looper.getMainLooper();
        try {
            anetwork.channel.entity.k kVar2 = this.f30345a.f30339a;
            kVar2.f30244f.netReqStart = Long.valueOf(kVar2.b(w3.a.f140979o)).longValue();
        } catch (Exception unused) {
        }
        String strB = this.f30345a.f30339a.b(w3.a.f140980p);
        if (!TextUtils.isEmpty(strB)) {
            this.f30345a.f30339a.f30244f.traceId = strB;
        }
        String strB2 = this.f30345a.f30339a.b(w3.a.f140981q);
        anetwork.channel.entity.k kVar3 = this.f30345a.f30339a;
        RequestStatistic requestStatistic = kVar3.f30244f;
        requestStatistic.process = strB2;
        requestStatistic.pTraceId = kVar3.b(w3.a.f140982r);
        String str = "[traceId:" + strB + "]" + com.google.android.exoplayer2.text.ttml.d.f49798o0;
        l lVar = this.f30345a;
        ALog.e("anet.UnifiedRequestTask", str, lVar.f30341c, "bizId", lVar.f30339a.a().getBizId(), "processFrom", strB2, "url", this.f30345a.f30339a.l());
        if (!t3.b.v(this.f30345a.f30339a.k())) {
            ThreadPoolExecutorFactory.submitPriorityTask(new o(this), ThreadPoolExecutorFactory.Priority.HIGH);
            return new f(this);
        }
        d dVar = new d(this.f30345a);
        this.f30345a.f30343e = dVar;
        dVar.f30296c = new anet.channel.request.b(ThreadPoolExecutorFactory.submitBackupTask(new n(this)), this.f30345a.f30339a.a().getSeq());
        d();
        return new f(this);
    }

    void c() {
        if (this.f30345a.f30342d.compareAndSet(false, true)) {
            ALog.e("anet.UnifiedRequestTask", "task cancelled", this.f30345a.f30341c, "URL", this.f30345a.f30339a.k().simpleUrlString());
            RequestStatistic requestStatistic = this.f30345a.f30339a.f30244f;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.ret = 2;
                requestStatistic.statusCode = -204;
                requestStatistic.msg = ErrorConstant.getErrMsg(-204);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-204, null, requestStatistic, null));
                if (requestStatistic.recDataSize > 102400) {
                    anet.channel.monitor.b.a().a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
                }
            }
            this.f30345a.b();
            this.f30345a.a();
            this.f30345a.f30340b.b(new DefaultFinishEvent(-204, (String) null, this.f30345a.f30339a.a()));
        }
    }
}
