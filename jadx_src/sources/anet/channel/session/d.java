package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.entity.ConnType;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.Utils;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d extends Session {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SSLSocketFactory f29835w;

    public d(Context context, anet.channel.entity.a aVar) {
        super(context, aVar);
        if (this.f29550k == null) {
            String str = this.f29542c;
            this.f29549j = (str == null || !str.startsWith("https")) ? ConnType.HTTP : ConnType.HTTPS;
        } else if (AwcnConfig.isHttpsSniEnable() && this.f29549j.equals(ConnType.HTTPS)) {
            this.f29835w = new anet.channel.util.j(this.f29543d);
        }
    }

    @Override // anet.channel.Session
    public void close() {
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public void close(boolean z10) {
        this.f29559t = false;
        close();
    }

    @Override // anet.channel.Session
    public void connect() {
        try {
            IConnStrategy iConnStrategy = this.f29550k;
            if (iConnStrategy != null && iConnStrategy.getIpSource() == 1) {
                notifyStatus(4, new anet.channel.entity.b(1));
                return;
            }
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f29542c).setSeq(this.f29555p).setConnectTimeout((int) (this.f29557r * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.f29558s * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            SSLSocketFactory sSLSocketFactory = this.f29835w;
            if (sSLSocketFactory != null) {
                redirectEnable.setSslSocketFactory(sSLSocketFactory);
            }
            if (this.f29552m) {
                redirectEnable.addHeader("Host", this.f29544e);
            }
            if (anet.channel.util.c.a() && anet.channel.strategy.utils.c.a(this.f29544e)) {
                try {
                    this.f29545f = anet.channel.util.c.a(this.f29544e);
                } catch (Exception unused) {
                }
            }
            ALog.i("awcn.HttpSession", "HttpSession connect", null, "host", this.f29542c, "ip", this.f29545f, HeyboxMicFragment.f93763y, Integer.valueOf(this.f29546g));
            Request requestBuild = redirectEnable.build();
            requestBuild.setDnsOptimize(this.f29545f, this.f29546g);
            ThreadPoolExecutorFactory.submitPriorityTask(new e(this, requestBuild), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th2) {
            ALog.e("awcn.HttpSession", "HTTP connect fail.", null, th2, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f29553n == 4;
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        anet.channel.request.b bVar = anet.channel.request.b.NULL;
        Request.Builder builderNewBuilder = null;
        RequestStatistic requestStatistic = request != null ? request.f29773a : new RequestStatistic(this.f29543d, null);
        requestStatistic.setConnType(this.f29549j);
        if (requestStatistic.start == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = jCurrentTimeMillis;
            requestStatistic.start = jCurrentTimeMillis;
        }
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return bVar;
        }
        try {
            if (request.getSslSocketFactory() == null && this.f29835w != null) {
                builderNewBuilder = request.newBuilder().setSslSocketFactory(this.f29835w);
            }
            if (this.f29552m) {
                if (builderNewBuilder == null) {
                    builderNewBuilder = request.newBuilder();
                }
                builderNewBuilder.addHeader("Host", this.f29544e);
            }
            if (builderNewBuilder != null) {
                request = builderNewBuilder.build();
            }
            if (this.f29545f == null) {
                String strHost = request.getHttpUrl().host();
                if (anet.channel.util.c.a() && anet.channel.strategy.utils.c.a(strHost)) {
                    try {
                        this.f29545f = anet.channel.util.c.a(strHost);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.f29545f, this.f29546g);
            request.setUrlScheme(this.f29549j.isSSL());
            IConnStrategy iConnStrategy = this.f29550k;
            if (iConnStrategy != null) {
                request.f29773a.setIpInfo(iConnStrategy.getIpSource(), this.f29550k.getIpType());
            } else {
                request.f29773a.setIpInfo(1, 1);
            }
            request.f29773a.unit = this.f29551l;
            return new anet.channel.request.b(ThreadPoolExecutorFactory.submitPriorityTask(new f(this, request, requestCb, requestStatistic), anet.channel.util.h.a(request)), request.getSeq());
        } catch (Throwable th2) {
            requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th2.toString()), requestStatistic);
            return bVar;
        }
    }
}
