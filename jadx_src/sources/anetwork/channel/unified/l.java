package anetwork.channel.unified;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final anetwork.channel.entity.k f30339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3.a f30340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile AtomicBoolean f30342d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile a f30343e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Future f30344f = null;

    public l(anetwork.channel.entity.k kVar, v3.a aVar) {
        this.f30339a = kVar;
        this.f30341c = kVar.f30247i;
        this.f30340b = aVar;
    }

    public void a() {
        Future future = this.f30344f;
        if (future != null) {
            future.cancel(true);
            this.f30344f = null;
        }
    }

    public void b() {
        if (this.f30343e != null) {
            this.f30343e.cancel();
            this.f30343e = null;
        }
    }
}
