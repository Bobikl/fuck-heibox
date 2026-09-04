package anetwork.channel.cookie;

import anet.channel.util.ALog;
import java.net.HttpCookie;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30175b;

    c(String str) {
        this.f30175b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a.f30168e == null) {
            return;
        }
        try {
            for (HttpCookie httpCookie : HttpCookie.parse(this.f30175b)) {
                if (httpCookie.getName().equals(a.f30168e.f30170a)) {
                    a.f30168e.f30171b = httpCookie.toString();
                    a.f30168e.f30173d = httpCookie.getDomain();
                    a.f30168e.f30172c = this.f30175b;
                    a.f30168e.a();
                    return;
                }
            }
        } catch (Exception e10) {
            ALog.e(a.f30164a, "cookieMonitorSave error.", null, e10, new Object[0]);
        }
    }
}
