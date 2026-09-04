package anetwork.channel.http;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class NetworkSdkSetting implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30250b = "anet.NetworkSdkSetting";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Context f30253e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ENV f30251c = ENV.ONLINE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f30252d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HashMap<String, Object> f30254f = null;

    public static Context a() {
        return f30253e;
    }

    public static void b(Application application, HashMap<String, Object> map) {
        try {
            GlobalAppRuntimeInfo.setTtid((String) map.get(Constants.KEY_TTID));
            GlobalAppRuntimeInfo.setUtdid((String) map.get("deviceId"));
            String str = (String) map.get(UMModuleRegister.PROCESS);
            if (!TextUtils.isEmpty(str)) {
                GlobalAppRuntimeInfo.setCurrentProcess(str);
            }
            f30254f = new HashMap<>(map);
            c(application.getApplicationContext());
            f30254f = null;
        } catch (Exception e10) {
            ALog.e(f30250b, "Network SDK initial failed!", null, e10, new Object[0]);
        }
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f30252d.compareAndSet(false, true)) {
                ALog.e(f30250b, "NetworkSdkSetting init", null, new Object[0]);
                f30253e = context;
                GlobalAppRuntimeInfo.setInitTime(System.currentTimeMillis());
                GlobalAppRuntimeInfo.setContext(context);
                t3.b.e();
                d();
                anetwork.channel.monitor.a.f();
                if (!AwcnConfig.isTbNextLaunch()) {
                    anetwork.channel.cookie.a.n(context);
                }
                SessionCenter.init(context);
            }
        } catch (Throwable th2) {
            ALog.e(f30250b, "Network SDK initial failed!", null, th2, new Object[0]);
        }
    }

    private static void d() {
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", lg.a.f131415h, new Class[]{Context.class, HashMap.class}, f30253e, f30254f);
            ALog.i(f30250b, "init taobao adapter success", null, new Object[0]);
        } catch (Exception e10) {
            ALog.i(f30250b, "initTaobaoAdapter failed. maybe not taobao app", null, e10);
        }
    }

    public static void e(String str) {
        GlobalAppRuntimeInfo.setTtid(str);
    }
}
