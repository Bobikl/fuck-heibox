package dev.heybox.hook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;

/** 仅运行在模块设置进程中，用官方 Modern Xposed Service 同步配置。 */
public final class HookApplication extends Application
        implements XposedServiceHelper.OnServiceListener {
    private static final String TAG = "HeyBoxHook.Settings";
    private static volatile PreferenceBridge preferences;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences local = super.getSharedPreferences(
                Config.PREFS_NAME, Context.MODE_PRIVATE);
        preferences = new PreferenceBridge(local);
        XposedServiceHelper.registerListener(this);
    }

    static PreferenceBridge getPreferences(Context context) {
        PreferenceBridge current = preferences;
        if (current != null) {
            return current;
        }
        // 只作为异常初始化顺序的兜底；正常 Activity 创建前 Application 必定已启动。
        synchronized (HookApplication.class) {
            current = preferences;
            if (current == null) {
                current = new PreferenceBridge(context.getApplicationContext()
                        .getSharedPreferences(Config.PREFS_NAME, Context.MODE_PRIVATE));
                preferences = current;
            }
            return current;
        }
    }

    @Override
    public void onServiceBind(XposedService service) {
        try {
            PreferenceBridge current = getPreferences(this);
            current.bindRemote(service.getRemotePreferences(Config.PREFS_NAME));
            Log.i(TAG, "REMOTE_PREFERENCES_READY migrated="
                    + current.getAll().size());
        } catch (Throwable throwable) {
            Log.e(TAG, "REMOTE_PREFERENCES_BIND_ERROR", throwable);
        }
    }

    @Override
    public void onServiceDied(XposedService service) {
        PreferenceBridge current = preferences;
        if (current != null) {
            current.unbindRemote();
        }
        Log.w(TAG, "REMOTE_PREFERENCES_DISCONNECTED");
    }
}
