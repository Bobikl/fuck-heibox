package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Cancelable {
    public static final b NULL = new b(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<?> f29809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29810b;

    public b(Future<?> future, String str) {
        this.f29809a = future;
        this.f29810b = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f29809a != null) {
            ALog.i("awcn.FutureCancelable", "cancel request", this.f29810b, new Object[0]);
            this.f29809a.cancel(true);
        }
    }
}
