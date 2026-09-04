package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.monitor.b;
import anet.channel.monitor.f;
import anet.channel.util.ALog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30256a = "anet.Monitor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static AtomicBoolean f30257b = new AtomicBoolean(false);

    public static void a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        b(iNetworkQualityChangeListener, null);
    }

    public static void b(INetworkQualityChangeListener iNetworkQualityChangeListener, f fVar) {
        anet.channel.monitor.a.a().a(iNetworkQualityChangeListener, fVar);
    }

    public static NetworkSpeed c() {
        NetworkSpeed networkSpeed = NetworkSpeed.Fast;
        try {
            return NetworkSpeed.valueOfCode(b.a().b());
        } catch (Throwable th2) {
            ALog.e(f30256a, "getNetworkSpeed failed", null, th2, new Object[0]);
            return networkSpeed;
        }
    }

    public static double d() {
        return b.a().c();
    }

    @Deprecated
    public static anetwork.channel.monitor.speed.NetworkSpeed e() {
        return anetwork.channel.monitor.speed.NetworkSpeed.valueOfCode(c().getCode());
    }

    public static synchronized void f() {
        if (f30257b.compareAndSet(false, true)) {
            b.a().d();
        }
    }

    @Deprecated
    public static synchronized void g(Context context) {
        f();
    }

    public static void h(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        anet.channel.monitor.a.a().a(iNetworkQualityChangeListener);
    }

    public static void i() {
        try {
            b.a().d();
        } catch (Throwable th2) {
            ALog.e(f30256a, "start failed", null, th2, new Object[0]);
        }
    }

    public static void j() {
        try {
            b.a().e();
        } catch (Throwable th2) {
            ALog.e(f30256a, "stop failed", null, th2, new Object[0]);
        }
    }
}
