package org.android.agoo.huawei;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.push.HmsMessaging;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.concurrent.TimeUnit;
import org.android.agoo.control.NotifManager;

/* JADX INFO: loaded from: classes5.dex */
public class HuaWeiRegister {
    public static final String TAG = "HuaWeiRegister";
    public static final String VERSION = "2.0.0";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f132848a;

        public a(Context context) {
            this.f132848a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            ALog.i(HuaWeiRegister.TAG, "register begin", new Object[0]);
            try {
                String token = HuaWeiRegister.getToken(this.f132848a);
                if (TextUtils.isEmpty(token)) {
                    return;
                }
                ALog.i(HuaWeiRegister.TAG, "onToken", "token", token);
                NotifManager notifManager = new NotifManager();
                notifManager.init(this.f132848a);
                notifManager.reportThirdPushToken(token, HuaweiRcvService.HUAWEI_TOKEN);
            } catch (Throwable th2) {
                ALog.e(HuaWeiRegister.TAG, "getToken failed.", th2, new Object[0]);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f132849a;

        public b(Context context) {
            this.f132849a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = this.f132849a.getPackageManager().getApplicationInfo(this.f132849a.getPackageName(), 128).metaData.getString(Constants.HUAWEI_HMS_CLIENT_APPID);
                String strReplace = "";
                if (string != null && string.length() > 0) {
                    strReplace = string.replace("appid=", "");
                }
                ALog.i(HuaWeiRegister.TAG, MiPushClient.COMMAND_UNREGISTER, "appId", strReplace);
                HmsInstanceId.getInstance(this.f132849a).deleteToken(strReplace, HmsMessaging.DEFAULT_TOKEN_SCOPE);
            } catch (Throwable th2) {
                ALog.e(HuaWeiRegister.TAG, MiPushClient.COMMAND_UNREGISTER, th2, new Object[0]);
            }
        }
    }

    public static boolean checkDevice(Context context) {
        if ("huawei".equalsIgnoreCase(Build.BRAND) || "huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            return true;
        }
        try {
            if (!TextUtils.isEmpty(get(r4.a.f138781a)) || !TextUtils.isEmpty(get(r4.a.f138782b))) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.hwid", 0) != null;
        } catch (Throwable unused2) {
            return false;
        }
    }

    @SuppressLint({"PrivateApi"})
    public static String get(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getToken(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(Constants.HUAWEI_HMS_CLIENT_APPID);
            String strReplace = "";
            if (string != null && string.length() > 0) {
                strReplace = string.replace("appid=", "");
            }
            ALog.i(TAG, "getToken", "appId", strReplace);
            return TextUtils.isEmpty(strReplace) ? HmsInstanceId.getInstance(context).getToken() : HmsInstanceId.getInstance(context).getToken(strReplace, HmsMessaging.DEFAULT_TOKEN_SCOPE);
        } catch (Throwable th2) {
            ALog.e(TAG, "getToken failed.", th2, new Object[0]);
            return null;
        }
    }

    public static void register(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (!UtilityImpl.isMainProcess(applicationContext)) {
                ALog.i(TAG, "not in main process, skipped.", new Object[0]);
            } else {
                if (!checkDevice(applicationContext)) {
                    ALog.i(TAG, "device check, skipped.", new Object[0]);
                    return;
                }
                ALog.i(TAG, "ver:", "2.0.0");
                BaseNotifyClickActivity.addNotifyListener(new HuaweiMsgParseImpl());
                ThreadPoolExecutorFactory.schedule(new a(applicationContext), 5L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "register", th2, new Object[0]);
        }
    }

    public static void unregister(Context context) {
        try {
            ALog.i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
            ThreadPoolExecutorFactory.execute(new b(context.getApplicationContext()));
        } catch (Throwable th2) {
            ALog.e(TAG, "unregister failed:", th2, new Object[0]);
        }
    }
}
