package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class GlobalAppRuntimeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f29527a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f29531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f29532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f29533g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile long f29537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f29538l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ENV f29528b = ENV.ONLINE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f29529c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f29530d = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f29534h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static SharedPreferences f29535i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile CopyOnWriteArrayList<String> f29536j = null;

    public static void addBucketInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.length() > 32 || str2.length() > 32) {
            return;
        }
        synchronized (GlobalAppRuntimeInfo.class) {
            if (f29536j == null) {
                f29536j = new CopyOnWriteArrayList<>();
            }
            f29536j.add(str);
            f29536j.add(str2);
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f29536j;
    }

    public static Context getContext() {
        return f29527a;
    }

    public static String getCurrentProcess() {
        return f29530d;
    }

    public static ENV getEnv() {
        return f29528b;
    }

    @Deprecated
    public static long getInitTime() {
        return f29537k;
    }

    @Deprecated
    public static int getStartType() {
        anet.channel.fulltrace.b sceneInfo = anet.channel.fulltrace.a.a().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.f29709a;
        }
        return -1;
    }

    public static String getTtid() {
        return f29531e;
    }

    public static String getUserId() {
        return f29532f;
    }

    public static String getUtdid() {
        Context context;
        if (f29533g == null && (context = f29527a) != null) {
            f29533g = Utils.getDeviceId(context);
        }
        return f29533g;
    }

    public static boolean isAppBackground() {
        if (f29527a == null) {
            return true;
        }
        return f29534h;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f29529c) || TextUtils.isEmpty(f29530d)) {
            return true;
        }
        return f29529c.equalsIgnoreCase(f29530d);
    }

    public static boolean isTargetProcess(String str) {
        if (TextUtils.isEmpty(f29529c) || TextUtils.isEmpty(str)) {
            return true;
        }
        return f29529c.equalsIgnoreCase(str);
    }

    public static void setBackground(boolean z10) {
        f29534h = z10;
    }

    public static void setContext(Context context) {
        f29527a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f29530d)) {
                f29530d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f29529c)) {
                f29529c = Utils.getMainProcessName(context);
            }
            if (f29535i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f29535i = defaultSharedPreferences;
                f29532f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f29530d, "TargetProcess", f29529c);
        }
    }

    public static void setCurrentProcess(String str) {
        f29530d = str;
    }

    public static void setEnv(ENV env) {
        f29528b = env;
    }

    @Deprecated
    public static void setInitTime(long j10) {
        f29537k = j10;
    }

    public static void setTargetProcess(String str) {
        f29529c = str;
    }

    public static void setTtid(String str) {
        f29531e = str;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iIndexOf = str.indexOf("@");
            String strSubstring = null;
            String strSubstring2 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
            String strSubstring3 = str.substring(iIndexOf + 1);
            int iLastIndexOf = strSubstring3.lastIndexOf(lg.a.f131412e);
            if (iLastIndexOf != -1) {
                String strSubstring4 = strSubstring3.substring(0, iLastIndexOf);
                strSubstring = strSubstring3.substring(iLastIndexOf + 1);
                strSubstring3 = strSubstring4;
            }
            f29538l = strSubstring;
            AmdcRuntimeInfo.setAppInfo(strSubstring3, strSubstring, strSubstring2);
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f29532f;
        if (str2 == null || !str2.equals(str)) {
            f29532f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f29535i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        String str2 = f29533g;
        if (str2 == null || !str2.equals(str)) {
            f29533g = str;
        }
    }
}
