package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.util.StringUtils;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class d implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f30297d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Request f30300g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f30295b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile Cancelable f30296c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30298e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30299f = 0;

    public d(l lVar) {
        this.f30297d = lVar;
        this.f30300g = lVar.f30339a.a();
    }

    static /* synthetic */ int c(d dVar) {
        int i10 = dVar.f30299f;
        dVar.f30299f = i10 + 1;
        return i10;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.f30295b = true;
        if (this.f30296c != null) {
            this.f30296c.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f30295b) {
            return;
        }
        if (this.f30297d.f30339a.n()) {
            String strJ = anetwork.channel.cookie.a.j(this.f30297d.f30339a.l());
            if (!TextUtils.isEmpty(strJ)) {
                Request.Builder builderNewBuilder = this.f30300g.newBuilder();
                String str = this.f30300g.getHeaders().get("Cookie");
                if (!TextUtils.isEmpty(str)) {
                    strJ = StringUtils.concatString(str, "; ", strJ);
                }
                builderNewBuilder.addHeader("Cookie", strJ);
                this.f30300g = builderNewBuilder.build();
            }
        }
        this.f30300g.f29773a.degraded = 2;
        this.f30300g.f29773a.sendBeforeTime = System.currentTimeMillis() - this.f30300g.f29773a.reqStart;
        anet.channel.session.b.a(this.f30300g, new e(this));
    }
}
