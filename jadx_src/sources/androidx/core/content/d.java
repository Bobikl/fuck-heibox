package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.RestrictTo;
import androidx.core.app.l2;
import com.bytedance.bpea.entry.common.DataType;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20437a = "ContextCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20438b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f20439c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static TypedValue f20440d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20441e = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20442f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20443g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f20444h = 4;

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @androidx.annotation.u
        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(19)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @androidx.annotation.u
        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @androidx.annotation.u
        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(21)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @androidx.annotation.u
        static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        @androidx.annotation.u
        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(23)
    public static class C0126d {
        private C0126d() {
        }

        @androidx.annotation.u
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        @androidx.annotation.u
        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @androidx.annotation.u
        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(24)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @androidx.annotation.u
        static File b(Context context) {
            return context.getDataDir();
        }

        @androidx.annotation.u
        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(26)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static Intent a(Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, d.r(context), handler);
        }

        @androidx.annotation.u
        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(28)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(30)
    public static class h {
        private h() {
        }

        @androidx.annotation.u
        static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @androidx.annotation.w0(33)
    public static class i {
        private i() {
        }

        @androidx.annotation.u
        static Intent a(Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f20445a;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f20445a = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, ad.c.f1239s);
            map.put(ActivityManager.class, RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            map.put(AlarmManager.class, androidx.core.app.o0.K0);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, DataType.CLIPBOARD);
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, ChannelsDetailActivity.f79595e4);
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, ak.f104420ac);
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, g0.a.f118921e);
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }

        private j() {
        }
    }

    /* JADX INFO: compiled from: ContextCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface k {
    }

    protected d() {
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public static int a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        androidx.core.util.j.e(str, "permission must be non-null");
        if (androidx.core.os.a.k() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return l2.p(context).a() ? 0 : -1;
    }

    @androidx.annotation.p0
    public static Context b(@androidx.annotation.n0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    private static File c(File file) {
        synchronized (f20439c) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(f20437a, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    @androidx.annotation.p0
    public static String d(@androidx.annotation.n0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    @androidx.annotation.n0
    public static File e(@androidx.annotation.n0 Context context) {
        return c.a(context);
    }

    @androidx.annotation.l
    public static int f(@androidx.annotation.n0 Context context, @androidx.annotation.n int i10) {
        return C0126d.a(context, i10);
    }

    @androidx.annotation.p0
    public static ColorStateList g(@androidx.annotation.n0 Context context, @androidx.annotation.n int i10) {
        return androidx.core.content.res.i.f(context.getResources(), i10, context.getTheme());
    }

    @androidx.annotation.p0
    public static File h(@androidx.annotation.n0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @androidx.annotation.p0
    public static Drawable i(@androidx.annotation.n0 Context context, @androidx.annotation.v int i10) {
        return c.b(context, i10);
    }

    @androidx.annotation.n0
    public static File[] j(@androidx.annotation.n0 Context context) {
        return b.a(context);
    }

    @androidx.annotation.n0
    public static File[] k(@androidx.annotation.n0 Context context, @androidx.annotation.p0 String str) {
        return b.b(context, str);
    }

    @androidx.annotation.n0
    public static Executor l(@androidx.annotation.n0 Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : androidx.core.os.i.a(new Handler(context.getMainLooper()));
    }

    @androidx.annotation.p0
    public static File m(@androidx.annotation.n0 Context context) {
        return c.c(context);
    }

    @androidx.annotation.n0
    public static File[] n(@androidx.annotation.n0 Context context) {
        return b.c(context);
    }

    @androidx.annotation.p0
    public static <T> T o(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Class<T> cls) {
        return (T) C0126d.b(context, cls);
    }

    @androidx.annotation.p0
    public static String p(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Class<?> cls) {
        return C0126d.c(context, cls);
    }

    public static boolean q(@androidx.annotation.n0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(context);
        }
        return false;
    }

    static String r(Context context) {
        String str = context.getPackageName() + f20441e;
        if (t0.d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @androidx.annotation.p0
    public static Intent s(@androidx.annotation.n0 Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, @androidx.annotation.n0 IntentFilter intentFilter, int i10) {
        return t(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @androidx.annotation.p0
    public static Intent t(@androidx.annotation.n0 Context context, @androidx.annotation.p0 BroadcastReceiver broadcastReceiver, @androidx.annotation.n0 IntentFilter intentFilter, @androidx.annotation.p0 String str, @androidx.annotation.p0 Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (androidx.core.os.a.k()) {
            return i.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        return ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, r(context), handler);
    }

    public static boolean u(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Intent[] intentArr) {
        return v(context, intentArr, null);
    }

    public static boolean v(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Intent[] intentArr, @androidx.annotation.p0 Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void w(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Intent intent, @androidx.annotation.p0 Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void x(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
