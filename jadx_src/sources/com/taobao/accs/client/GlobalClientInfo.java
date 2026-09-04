package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public class GlobalClientInfo {
    public static final String AGOO_SERVICE_ID = "agooSend";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f98171a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static IAgooAppReceiver f98172b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f98173c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f98174d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f98175e = "com.taobao.accs.client.GlobalClientInfo";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile GlobalClientInfo f98176f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, String> f98177l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Map<String, Map<String, String>> f98178m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, ILoginInfo> f98179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, IAppReceiver> f98180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ActivityManager f98181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConnectivityManager f98182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PackageInfo f98183k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, AccsDataListener> f98184n = new ConcurrentHashMap();

    static {
        f98177l.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        f98177l.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        f98177l.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    private GlobalClientInfo(Context context) {
        Context context2 = getContext();
        f98171a = context2;
        if (context2 == null && context != null) {
            f98171a = context.getApplicationContext();
        }
        ThreadPoolExecutorFactory.execute(new c(this));
    }

    private void a(String str, Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (f98178m.get(str) == null) {
            f98178m.put(str, new ConcurrentHashMap());
        }
        f98178m.get(str).putAll(map);
    }

    public static Context getContext() {
        return f98171a;
    }

    @Keep
    public static GlobalClientInfo getInstance(Context context) {
        if (f98176f == null) {
            synchronized (GlobalClientInfo.class) {
                if (f98176f == null) {
                    f98176f = new GlobalClientInfo(context);
                }
            }
        }
        return f98176f;
    }

    public void clearLoginInfoImpl() {
        this.f98179g = null;
    }

    public ActivityManager getActivityManager() {
        if (this.f98181i == null) {
            this.f98181i = (ActivityManager) f98171a.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        }
        return this.f98181i;
    }

    public Map<String, String> getAllService(String str) {
        if (f98178m.get(str) == null || f98178m.get(str).isEmpty()) {
            return null;
        }
        return f98178m.get(str);
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        return this.f98180h;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.f98182j == null) {
            this.f98182j = (ConnectivityManager) f98171a.getSystemService("connectivity");
        }
        return this.f98182j;
    }

    public AccsDataListener getListener(String str) {
        return this.f98184n.get(str);
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f98179g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.f98183k == null) {
                this.f98183k = f98171a.getPackageManager().getPackageInfo(f98171a.getPackageName(), 0);
            }
        } catch (Throwable th2) {
            ALog.e("GlobalClientInfo", "getPackageInfo", th2, new Object[0]);
        }
        return this.f98183k;
    }

    public String getService(String str) {
        return f98177l.get(str);
    }

    public String getService(String str, String str2) {
        if (f98178m.get(str) != null) {
            return f98178m.get(str).get(str2);
        }
        return null;
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f98179g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f98179g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    public void registerAllRemoteService(String str, Map<String, String> map) {
        if (f98178m.get(str) == null) {
            f98178m.put(str, new ConcurrentHashMap());
        }
        f98178m.get(str).putAll(map);
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        registerListener(str, (AccsDataListener) accsAbstractDataListener);
    }

    public void registerListener(String str, AccsDataListener accsDataListener) {
        if (TextUtils.isEmpty(str) || accsDataListener == null) {
            return;
        }
        this.f98184n.put(str, accsDataListener);
    }

    @Keep
    public void registerRemoteListener(String str, AccsDataListener accsDataListener) {
        this.f98184n.put(str, accsDataListener);
    }

    public void registerRemoteService(String str, String str2) {
        f98177l.put(str, str2);
    }

    public void registerService(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        f98177l.put(str, str2);
    }

    public void setAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                f98172b = (IAgooAppReceiver) iAppReceiver;
                return;
            }
            if (this.f98180h == null) {
                this.f98180h = new ConcurrentHashMap<>(2);
            }
            this.f98180h.put(str, iAppReceiver);
            a(str, iAppReceiver.getAllServices());
        }
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f98179g == null) {
            this.f98179g = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f98179g.put(str, iLoginInfo);
        }
    }

    @Keep
    public void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) {
        f98172b = iAgooAppReceiver;
    }

    @Keep
    public void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (this.f98180h == null) {
            this.f98180h = new ConcurrentHashMap<>(2);
        }
        this.f98180h.put(str, iAppReceiver);
        a(str, iAppReceiver.getAllServices());
    }

    public void unRegisterService(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f98177l.remove(str);
    }

    public void unregisterListener(String str) {
        this.f98184n.remove(str);
    }

    public void unregisterRemoteListener(String str) {
        this.f98184n.remove(str);
    }

    public void unregisterRemoteService(String str) {
        f98177l.remove(str);
    }
}
