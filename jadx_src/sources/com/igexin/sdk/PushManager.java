package com.igexin.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.g;
import com.igexin.push.core.x;
import com.igexin.sdk.message.BindAliasCmdMessage;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.SetTagCmdMessage;
import com.igexin.sdk.message.UnBindAliasCmdMessage;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class PushManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f64072a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f64073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f64074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f64076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Class f64077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f64078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f64079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f64080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f64081j;

    private PushManager() {
        this.f64081j = "[PushManager]";
    }

    /* synthetic */ PushManager(d dVar) {
        this();
    }

    private int a(int i10, String str) {
        if (TextUtils.isEmpty(str) || !str.contains(lg.a.f131412e)) {
            return i10;
        }
        if (i10 != 60001 && i10 != 60002) {
            return i10;
        }
        if (str.startsWith(AssistPushConsts.HW_PREFIX)) {
            return i10 + 18;
        }
        if (str.startsWith(AssistPushConsts.XM_PREFIX)) {
            return i10 + 48;
        }
        if (str.startsWith(AssistPushConsts.OPPO_PREFIX)) {
            return i10 + 28;
        }
        if (str.startsWith(AssistPushConsts.VIVO_PREFIX)) {
            return i10 + 38;
        }
        if (str.startsWith(AssistPushConsts.MZ_PREFIX)) {
            return i10 + 58;
        }
        if (str.startsWith(AssistPushConsts.ST_PREFIX)) {
            return i10 + 78;
        }
        return str.startsWith(AssistPushConsts.FCM_PREFIX) ? i10 + 98 : i10;
    }

    private Class a(Context context) {
        Class cls = this.f64077f;
        return cls != null ? cls : x.a().b(context);
    }

    private String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder("");
            int length = bArrDigest.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = bArrDigest[i10];
                if (i11 < 0) {
                    i11 += 256;
                }
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(Context context, GTCmdMessage gTCmdMessage) {
        try {
            Class clsC = x.a().c(context);
            if (clsC != null) {
                Intent intent = new Intent(context, (Class<?>) clsC);
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10010);
                bundle.putSerializable(PushConsts.KEY_CMD_MSG, gTCmdMessage);
                intent.putExtras(bundle);
                context.startService(intent);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushManager|" + th2.toString(), new Object[0]);
        }
    }

    private void a(Context context, String str, String str2) {
        a(context, new BindAliasCmdMessage(str, str2, 10010));
    }

    private boolean a(Context context, Intent intent) {
        return x.a().a(context, intent);
    }

    private void b(Context context) {
        if (this.f64080i == null) {
            f64072a.execute(new d(this, context));
        }
    }

    private void b(Context context, String str, String str2) {
        a(context, new UnBindAliasCmdMessage(str, str2, 10011));
    }

    private void c(Context context) {
        if (this.f64080i != null) {
            f64072a.execute(new e(this, context));
        }
    }

    private void c(Context context, String str, String str2) {
        a(context, new SetTagCmdMessage(str, str2, 10009));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Application d(Context context) {
        if (context == null || !e(context)) {
            return null;
        }
        return context instanceof Application ? (Application) context : (Application) context.getApplicationContext();
    }

    private boolean e(Context context) {
        return true;
    }

    private static void f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
    }

    public static PushManager getInstance() {
        return f.f64096a;
    }

    private <T extends Activity> void registerPushActivity(Context context, Class<T> cls) {
        String name;
        try {
            if (cls != null) {
                try {
                    Class.forName(cls.getName());
                    if (!com.igexin.push.util.a.a(context, cls)) {
                        return;
                    } else {
                        name = cls.getName();
                    }
                } catch (Exception e10) {
                    com.igexin.a.a.c.a.c.a().a("[PushManager]can't load activity = " + e10.toString());
                    com.igexin.a.a.c.b.a("PushManager|registerPushActiviy|" + e10.toString(), new Object[0]);
                    return;
                }
            } else {
                Log.d("PushManager", "call -> registerPushActiviy, parameter [activity] is null");
                name = "";
            }
            this.f64079h = name;
            if (this.f64077f != null) {
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) this.f64077f);
                intent.putExtra("ua", this.f64079h);
                a(context, intent);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushManager|registerPushActiviy|" + th2.toString(), new Object[0]);
        }
    }

    public boolean bindAlias(Context context, String str) {
        return bindAlias(context, str, "bindAlias_" + System.currentTimeMillis());
    }

    public boolean bindAlias(Context context, String str, String str2) {
        com.igexin.a.a.c.a.c.a().a("[PushManager]call bindAlias");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f64075d < 1000) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > bindAlias failed, it be called too frequently");
            a(context, str2, "30001");
            return false;
        }
        this.f64075d = jCurrentTimeMillis;
        Bundle bundle = new Bundle();
        bundle.putString("action", "bindAlias");
        bundle.putString("alias", str);
        bundle.putString("sn", str2);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public void checkManifest(Context context) throws GetuiPushException {
        com.igexin.push.util.a.b(context);
    }

    public String getClientid(Context context) {
        if (this.f64076e == null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                String strA = com.igexin.push.util.b.a(applicationInfo);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (TextUtils.isEmpty(strA)) {
                        strA = applicationInfo.metaData.getString(AssistPushConsts.GETUI_APPID);
                    }
                    if (TextUtils.isEmpty(strA)) {
                        strA = com.igexin.push.core.b.a.a(context);
                    }
                    String strTrim = strA.trim();
                    if (!TextUtils.isEmpty(strTrim)) {
                        String strA2 = a(strTrim + context.getPackageName());
                        if (strA2 != null) {
                            this.f64076e = strA2.getBytes();
                        }
                    }
                }
            } catch (Exception e10) {
                com.igexin.a.a.c.b.a("PushManager|" + e10.toString(), new Object[0]);
            }
        }
        if (this.f64076e == null) {
            return null;
        }
        byte[] bArrA = com.igexin.push.util.d.a(context.getFilesDir().getPath() + "/init.pid");
        if (bArrA == null || this.f64076e.length != bArrA.length) {
            return null;
        }
        int length = bArrA.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (this.f64076e[i10] ^ bArrA[i10]);
        }
        return new String(bArr);
    }

    public String getVersion(Context context) {
        return "4.4.3.15";
    }

    public void initialize(Context context) {
        com.igexin.a.a.c.a.c cVarA;
        String str;
        com.igexin.a.a.c.a.c cVarA2;
        String str2;
        try {
            f(context);
            if (TextUtils.isEmpty(this.f64078g)) {
                Class cls = (Class) com.igexin.push.util.b.a(context, GTIntentService.class).second;
                if (cls != null) {
                    this.f64078g = cls.getName();
                    cVarA2 = com.igexin.a.a.c.a.c.a();
                    str2 = "[PushManager] initialize intentService = " + this.f64078g;
                } else {
                    cVarA2 = com.igexin.a.a.c.a.c.a();
                    str2 = "[PushManager] initialize intentService = NULL!";
                }
                cVarA2.a(str2);
            }
            if (this.f64077f == null) {
                Class cls2 = (Class) com.igexin.push.util.b.a(context, PushService.class).second;
                this.f64077f = cls2;
                if (cls2 == null) {
                    cVarA = com.igexin.a.a.c.a.c.a();
                    str = "[PushManager] initialize uService = NULL!";
                } else {
                    cVarA = com.igexin.a.a.c.a.c.a();
                    str = "[PushManager] initialize uService = " + this.f64077f.getName();
                }
                cVarA.a(str);
            }
            initialize(context, this.f64077f);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("PushManager|initialize|" + e10.toString(), new Object[0]);
            com.igexin.a.a.c.a.c.a().a("[PushManager] initialize sdk error = " + e10.toString());
        }
    }

    @Deprecated
    public <T extends Service> void initialize(Context context, Class<T> cls) {
        try {
            com.igexin.a.a.c.a.c.a().a("[PushManager]Start initializing sdk");
            String packageName = context.getApplicationContext().getPackageName();
            if (!com.igexin.push.util.a.a("PushManager", context, cls)) {
                com.igexin.a.a.c.b.a("PushManager|init checkServiceSetCorrectly false", new Object[0]);
                com.igexin.a.a.c.a.c.a().a("[PushManager]initialize failed,please check your push service!!");
                return;
            }
            if (cls == null || CoreConsts.f63466p.equals(cls.getName())) {
                cls = PushService.class;
            }
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) cls);
            intent.putExtra("action", PushConsts.ACTION_SERVICE_INITIALIZE);
            intent.putExtra("op_app", packageName);
            intent.putExtra("us", cls.getName());
            String str = this.f64078g;
            if (str != null) {
                intent.putExtra("uis", str);
            }
            String str2 = this.f64079h;
            if (str2 != null) {
                intent.putExtra("ua", str2);
            }
            if (a(context, intent)) {
                this.f64077f = cls;
                com.igexin.a.a.c.a.c.a().a("[PushManager]start pushService = " + cls.getName());
            }
            b(context);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushManager|initialize|" + th2.toString(), new Object[0]);
            com.igexin.a.a.c.a.c.a().a("[PushManager]initialize sdk error = " + th2.toString());
        }
    }

    public boolean isPushTurnedOn(Context context) {
        return new com.igexin.sdk.a.d(context).c();
    }

    public boolean queryPushOnLine(Context context) {
        try {
            f(context);
            Bundle bundle = new Bundle();
            bundle.putString("action", "queryPushOnLine");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return a(context, intent);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.c("PushManager", th2.toString());
            com.igexin.a.a.c.a.c.a().a("[PushManager] queryPushOnLine  error = " + th2.toString());
            return false;
        }
    }

    @Deprecated
    public <T extends GTIntentService> void registerPushIntentService(Context context, Class<T> cls) {
        String name;
        com.igexin.a.a.c.a.c.a().a("[PushManager]call registerPushIntentService");
        try {
            if (cls != null) {
                try {
                    Class.forName(cls.getName());
                    if (!com.igexin.push.util.a.a(new Intent(context, (Class<?>) cls), context)) {
                        com.igexin.a.a.c.a.c.a().a("[PushManager]call - > registerPushIntentService, parameter [userIntentService] is set, but didn't find class \"" + cls.getName() + "\", please check your AndroidManifest");
                        return;
                    }
                    name = cls.getName();
                } catch (Exception e10) {
                    com.igexin.a.a.c.a.c.a().a("[PushManager]error, can't load IntentService = " + e10.toString());
                    com.igexin.a.a.c.b.a("PushManager|registerPushIntentService|" + e10.toString(), new Object[0]);
                    return;
                }
            } else {
                Log.d("PushManager", "call -> registerPushIntentService, parameter [userIntentService] is null, use default Receiver");
                name = "";
            }
            this.f64078g = name;
            if (this.f64077f != null) {
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) this.f64077f);
                intent.putExtra("uis", this.f64078g);
                a(context, intent);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushManager|registerPushIntentService|" + th2.toString(), new Object[0]);
            com.igexin.a.a.c.a.c.a().a("[PushManager]registerPushIntentService failed = " + th2.toString());
        }
    }

    public boolean sendApplinkFeedback(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > sendApplinkFeedback failed, parameter is illegal");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "sendApplinkFeedback");
        bundle.putString("url", str);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public boolean sendFeedbackMessage(Context context, String str, String str2, int i10) {
        boolean z10 = (i10 >= 60001 && i10 <= 60999) || (i10 >= 90001 && i10 <= 90999);
        if (str == null || str2 == null || !z10) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > sendFeedbackMessage failed, parameter is illegal");
            return false;
        }
        int iA = a(i10, str2);
        Bundle bundle = new Bundle();
        bundle.putString("action", "sendFeedbackMessage");
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("actionid", String.valueOf(iA));
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public boolean sendMessage(Context context, String str, byte[] bArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str == null || bArr == null || bArr.length > 4096 || jCurrentTimeMillis - this.f64074c < 1000) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > sendMessage failed, parameter is illegal or it be called too frequently");
            return false;
        }
        this.f64074c = jCurrentTimeMillis;
        Bundle bundle = new Bundle();
        bundle.putString("action", "sendMessage");
        bundle.putString("taskid", str);
        bundle.putByteArray("extraData", bArr);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public boolean setBadgeNum(Context context, int i10) {
        try {
            f(context);
            com.igexin.a.a.c.a.c.a().a("[PushManager] call - > setBadgeNum");
            Bundle bundle = new Bundle();
            bundle.putString("action", "setBadgeNum");
            bundle.putInt("badgeNum", i10);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return a(context, intent);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.c("PushManager", th2.getMessage());
            com.igexin.a.a.c.a.c.a().a("[PushManager] setBadgeNum  error = " + th2.toString());
            return false;
        }
    }

    public void setDebugLogger(Context context, IUserLoggerInterface iUserLoggerInterface) {
        if (context == null || iUserLoggerInterface == null) {
            throw new IllegalArgumentException("context or loggerInterface can not be null");
        }
        if (!com.igexin.push.util.a.c(context)) {
            iUserLoggerInterface.log("only run in debug mode");
            return;
        }
        try {
            if (e(context)) {
                com.igexin.a.a.c.a.c.a().a(context, iUserLoggerInterface);
            } else {
                iUserLoggerInterface.log("setDebugLogger, must be called in main process!");
            }
        } catch (Throwable unused) {
        }
    }

    public boolean setDeviceToken(Context context, String str) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (TextUtils.isEmpty(str)) {
                com.igexin.a.a.c.a.c.a().a("[PushManager] setDeviceToken error = token is empty");
                return false;
            }
            if (str.equalsIgnoreCase("InvalidAppKey")) {
                com.igexin.a.a.c.a.c.a().a("[PushManager] setDeviceToken error = token is InvalidAppKey");
                return false;
            }
            f(applicationContext);
            Bundle bundle = new Bundle();
            bundle.putString("action", "setDeviceToken");
            bundle.putString("token", str);
            Intent intent = new Intent(applicationContext.getApplicationContext(), (Class<?>) a(applicationContext));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return a(applicationContext, intent);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.c("PushManager", th2.toString());
            com.igexin.a.a.c.a.c.a().a("[PushManager] setDeviceToken  error = " + th2.toString());
            return false;
        }
    }

    public boolean setHeartbeatInterval(Context context, int i10) {
        if (i10 < 0) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call -> setHeartbeatInterval failed, parameter [interval] < 0, illegal");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "setHeartbeatInterval");
        bundle.putInt(ak.aT, i10);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    @Deprecated
    public boolean setHwBadgeNum(Context context, int i10) {
        com.igexin.a.a.c.a.c.a().a("[PushManager]call - > setHwBadgeNum");
        try {
            Bundle bundle = new Bundle();
            bundle.putString("action", "setHwBadgeNum");
            bundle.putInt("badgeNum", i10);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return a(context, intent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean setNotificationIcon(Context context, String str, String str2) {
        try {
            f(context);
            Bundle bundle = new Bundle();
            bundle.putString("action", "setNotificationIcon");
            bundle.putString("smallIcon", str);
            bundle.putString("largeIcon", str2);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
            intent.putExtra("bundle", bundle);
            return a(context, intent);
        } catch (Throwable th2) {
            com.igexin.a.a.c.a.c.a().a("[PushManager] setNotificationIcon  error = " + th2.toString());
            return false;
        }
    }

    public boolean setSilentTime(Context context, int i10, int i11) {
        if (i10 < 0 || i10 >= 24 || i11 < 0 || i11 > 23) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > setSilentTime failed, parameter [beginHour] or [duration] value exceeding");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "setSilentTime");
        bundle.putInt("beginHour", i10);
        bundle.putInt("duration", i11);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public boolean setSocketTimeout(Context context, int i10) {
        if (i10 < 0) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > setSocketTimeout failed, parameter [timeout] < 0, illegal");
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "setSocketTimeout");
        bundle.putInt(l5.a.f130839h0, i10);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }

    public int setTag(Context context, Tag[] tagArr, String str) {
        if (tagArr == null) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call -> setTag failed, parameter [tags] is null");
            com.igexin.a.a.c.b.a("PushManager|tags is null", new Object[0]);
            c(context, str, "20006");
            return 20006;
        }
        if (str == null) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call -> setTag failed, parameter [sn] is null");
            com.igexin.a.a.c.b.a("PushManager|sn is null", new Object[0]);
            c(context, str, "20007");
            return 20007;
        }
        if (tagArr.length > 200) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call -> setTag failed, parameter [tags] len > 200 is exceeds");
            com.igexin.a.a.c.b.a("PushManager|tags len > 200 is exceeds", new Object[0]);
            c(context, str, PushConsts.SEND_MESSAGE_ERROR_GENERAL);
            return PushConsts.SETTAG_ERROR_COUNT;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f64073b < 1000) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > setTag failed, it be called too frequently");
            c(context, str, PushConsts.SEND_MESSAGE_ERROR_TIME_OUT);
            return PushConsts.SETTAG_ERROR_FREQUENCY;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Tag tag : tagArr) {
            if (tag != null && tag.getName() != null) {
                if (tag.getName().contains(" ") || tag.getName().contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    com.igexin.a.a.c.a.c.a().a("[PushManager]call -> setTag failed, the tag [" + tag.getName() + "] is not illegal");
                    c(context, str, "20011");
                    return 20011;
                }
                sb2.append(tag.getName());
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        if (sb2.length() <= 0) {
            c(context, str, "20006");
            return 20006;
        }
        sb2.deleteCharAt(sb2.length() - 1);
        com.igexin.a.a.c.a.c.a().a("[PushManager]call setTag");
        Bundle bundle = new Bundle();
        bundle.putString("action", "setTag");
        bundle.putString("tags", sb2.toString());
        bundle.putString("sn", str);
        this.f64073b = jCurrentTimeMillis;
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        a(context, intent);
        return 0;
    }

    public void turnOffPush(Context context) {
        com.igexin.a.a.c.a.c.a().a("[PushManager]call turnOffPush");
        Bundle bundle = new Bundle();
        bundle.putString("action", "turnOffPush");
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        a(context, intent);
        c(context);
    }

    public void turnOnPush(Context context) {
        com.igexin.a.a.c.a.c.a().a("[PushManager]call turnOnPush");
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE);
        intent.putExtra("op_app", context.getApplicationContext().getPackageName());
        intent.putExtra("isSlave", true);
        a(context, intent);
        b(context);
    }

    public boolean unBindAlias(Context context, String str, boolean z10) {
        return unBindAlias(context, str, z10, "unBindAlias_" + System.currentTimeMillis());
    }

    public boolean unBindAlias(Context context, String str, boolean z10, String str2) {
        com.igexin.a.a.c.a.c.a().a("[PushManager]call unBindAlias");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f64075d < 1000) {
            com.igexin.a.a.c.a.c.a().a("[PushManager]call - > unBindAlias failed, it be called too frequently");
            b(context, str2, "30001");
            return false;
        }
        this.f64075d = jCurrentTimeMillis;
        Bundle bundle = new Bundle();
        bundle.putString("action", "unbindAlias");
        bundle.putString("alias", str);
        bundle.putBoolean("isSeft", z10);
        bundle.putString("sn", str2);
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) a(context));
        intent.putExtra("action", PushConsts.ACTION_BROADCAST_PUSHMANAGER);
        intent.putExtra("bundle", bundle);
        return a(context, intent);
    }
}
