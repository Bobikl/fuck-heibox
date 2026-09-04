package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class AppMonitor {
    private static volatile IAppMonitor appMonitor = new a(null);
    private static volatile IAppMonitor apmMonitor = null;

    /* JADX INFO: compiled from: Taobao */
    public static class a implements IAppMonitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IAppMonitor f29604a;

        a(IAppMonitor iAppMonitor) {
            this.f29604a = iAppMonitor;
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitAlarm(AlarmObject alarmObject) {
            IAppMonitor iAppMonitor = this.f29604a;
            if (iAppMonitor != null) {
                iAppMonitor.commitAlarm(alarmObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitCount(CountObject countObject) {
            IAppMonitor iAppMonitor = this.f29604a;
            if (iAppMonitor != null) {
                iAppMonitor.commitCount(countObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitStat(StatObject statObject) {
            if (AppMonitor.apmMonitor != null) {
                AppMonitor.apmMonitor.commitStat(statObject);
            }
            IAppMonitor iAppMonitor = this.f29604a;
            if (iAppMonitor != null) {
                iAppMonitor.commitStat(statObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        @Deprecated
        public void register() {
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        @Deprecated
        public void register(Class<?> cls) {
        }
    }

    public static IAppMonitor getInstance() {
        return appMonitor;
    }

    public static void setApmMonitor(IAppMonitor iAppMonitor) {
        apmMonitor = iAppMonitor;
    }

    public static void setInstance(IAppMonitor iAppMonitor) {
        appMonitor = new a(iAppMonitor);
    }
}
