package anet.channel.strategy.dispatch;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final String TAG = "awcn.AmdcThreadPoolExecutor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Random f29921b = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f29922a;

    /* JADX INFO: renamed from: anet.channel.strategy.dispatch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Taobao */
    public class RunnableC0243a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f29924b;

        RunnableC0243a() {
        }

        RunnableC0243a(Map<String, Object> map) {
            this.f29924b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> map;
            try {
                Map<String, Object> map2 = this.f29924b;
                if (map2 == null) {
                    synchronized (a.class) {
                        map = a.this.f29922a;
                        a.this.f29922a = null;
                    }
                    map2 = map;
                }
                if (NetworkStatusHelper.isConnected()) {
                    if (GlobalAppRuntimeInfo.getEnv() != map2.get("Env")) {
                        ALog.w(a.TAG, "task's env changed", null, new Object[0]);
                    } else {
                        b.a(d.a(map2));
                    }
                }
            } catch (Exception e10) {
                ALog.e(a.TAG, "exec amdc task failed.", null, e10, new Object[0]);
            }
        }
    }

    a() {
    }

    public void a(Map<String, Object> map) {
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                Map<String, Object> map2 = this.f29922a;
                if (map2 == null) {
                    this.f29922a = map;
                    int iNextInt = f29921b.nextInt(3000) + 2000;
                    ALog.i(TAG, "merge amdc request", null, "delay", Integer.valueOf(iNextInt));
                    anet.channel.strategy.utils.a.a(new RunnableC0243a(), iNextInt);
                } else {
                    Set set = (Set) map2.get("hosts");
                    Set set2 = (Set) map.get("hosts");
                    if (map.get("Env") != this.f29922a.get("Env")) {
                        this.f29922a = map;
                    } else if (set.size() + set2.size() <= 40) {
                        set2.addAll(set);
                        this.f29922a = map;
                    } else {
                        anet.channel.strategy.utils.a.a(new RunnableC0243a(map));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
