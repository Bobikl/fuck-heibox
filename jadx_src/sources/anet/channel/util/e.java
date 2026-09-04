package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f30009a;

    e(d dVar) {
        this.f30009a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f fVarK;
        try {
            if (this.f30009a.f30007a.equals(c.b(NetworkStatusHelper.getStatus()))) {
                ALog.e("awcn.Inet64Util", "startIpStackDetect double check", null, new Object[0]);
                int iJ = c.j();
                d dVar = this.f30009a;
                if (dVar.f30008b.ipStackType != iJ) {
                    c.f30006e.put(dVar.f30007a, Integer.valueOf(iJ));
                    NetTypeStat netTypeStat = this.f30009a.f30008b;
                    netTypeStat.lastIpStackType = netTypeStat.ipStackType;
                    netTypeStat.ipStackType = iJ;
                }
                if ((iJ == 2 || iJ == 3) && (fVarK = c.k()) != null) {
                    c.f30005d.put(this.f30009a.f30007a, fVarK);
                    this.f30009a.f30008b.nat64Prefix = fVarK.toString();
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    AppMonitor.getInstance().commitStat(this.f30009a.f30008b);
                }
            }
        } catch (Exception unused) {
        }
    }
}
