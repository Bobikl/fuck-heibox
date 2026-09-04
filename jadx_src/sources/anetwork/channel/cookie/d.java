package anetwork.channel.cookie;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.CookieMonitorStat;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.HttpCookie;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f30177c;

    d(String str, String str2) {
        this.f30176b = str;
        this.f30177c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (a.f30168e == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(a.f30168e.f30170a) || !HttpCookie.domainMatches(a.f30168e.f30173d, HttpUrl.parse(this.f30176b).host()) || TextUtils.isEmpty(this.f30177c)) {
                return;
            }
            if (this.f30177c.contains(a.f30168e.f30170a + ContainerUtils.KEY_VALUE_DELIMITER)) {
                return;
            }
            CookieMonitorStat cookieMonitorStat = new CookieMonitorStat(this.f30176b);
            cookieMonitorStat.cookieName = a.f30168e.f30170a;
            cookieMonitorStat.cookieText = a.f30168e.f30171b;
            cookieMonitorStat.setCookie = a.f30168e.f30172c;
            cookieMonitorStat.missType = 1;
            AppMonitor.getInstance().commitStat(cookieMonitorStat);
        } catch (Exception e10) {
            ALog.e(a.f30164a, "cookieMonitorReport error.", null, e10, new Object[0]);
        }
    }
}
