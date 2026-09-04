package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RequestStatistic f29646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ExceptionDetector f29647b;

    c(ExceptionDetector exceptionDetector, RequestStatistic requestStatistic) {
        this.f29647b = exceptionDetector;
        this.f29646a = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            RequestStatistic requestStatistic = this.f29646a;
            if (requestStatistic == null) {
                return;
            }
            if (!TextUtils.isEmpty(requestStatistic.ip) && this.f29646a.ret == 0) {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(this.f29646a.host)) {
                    this.f29647b.f29631b = this.f29646a.ip;
                } else if ("msgacs.m.taobao.com".equalsIgnoreCase(this.f29646a.host)) {
                    this.f29647b.f29632c = this.f29646a.ip;
                } else if ("gw.alicdn.com".equalsIgnoreCase(this.f29646a.host)) {
                    this.f29647b.f29633d = this.f29646a.ip;
                }
            }
            if (!TextUtils.isEmpty(this.f29646a.url)) {
                this.f29647b.f29634e.add(Pair.create(this.f29646a.url, Integer.valueOf(this.f29646a.statusCode)));
            }
            if (this.f29647b.c()) {
                this.f29647b.b();
            }
        } catch (Throwable th2) {
            ALog.e("anet.ExceptionDetector", "network detect fail.", null, th2, new Object[0]);
        }
    }
}
