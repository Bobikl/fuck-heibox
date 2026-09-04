package anet.channel.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.google.android.exoplayer2.offline.DownloadService;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class AppLifecycle {
    private static final String TAG = "awcn.AppLifeCycle";
    private static CopyOnWriteArraySet<AppLifecycleListener> listeners = new CopyOnWriteArraySet<>();
    public static volatile long lastEnterBackgroundTime = 0;
    public static volatile boolean isGoingForeground = false;
    private static Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: anet.channel.util.AppLifecycle.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                AppLifecycle.isGoingForeground = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AppLifecycle.onForeground();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                AppLifecycle.isGoingForeground = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    };
    private static ComponentCallbacks2 mComponentCallbacks2 = new ComponentCallbacks2() { // from class: anet.channel.util.AppLifecycle.3
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            ALog.i(AppLifecycle.TAG, "onTrimMemory", null, "level", Integer.valueOf(i10));
            if (i10 == 20) {
                AppLifecycle.onBackground();
            }
        }
    };

    /* JADX INFO: compiled from: Taobao */
    public interface AppLifecycleListener {
        void background();

        void forground();
    }

    private AppLifecycle() {
    }

    public static void initialize() {
        if (AwcnConfig.isAppLifeCycleListenerEnable()) {
            ((Application) GlobalAppRuntimeInfo.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);
            GlobalAppRuntimeInfo.getContext().registerComponentCallbacks(mComponentCallbacks2);
        }
    }

    private static void notifyListener(final boolean z10) {
        ALog.i(TAG, "notifyListener", null, DownloadService.f47121y, Boolean.valueOf(z10));
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.AppLifecycle.1
            @Override // java.lang.Runnable
            public void run() {
                for (AppLifecycleListener appLifecycleListener : AppLifecycle.listeners) {
                    try {
                        if (z10) {
                            appLifecycleListener.forground();
                        } else {
                            appLifecycleListener.background();
                        }
                    } catch (Exception e10) {
                        ALog.e(AppLifecycle.TAG, "notifyListener exception.", null, e10, new Object[0]);
                    }
                }
            }
        });
    }

    public static void onBackground() {
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            return;
        }
        GlobalAppRuntimeInfo.setBackground(true);
        lastEnterBackgroundTime = System.currentTimeMillis();
        notifyListener(false);
    }

    public static void onForeground() {
        if (GlobalAppRuntimeInfo.isAppBackground()) {
            GlobalAppRuntimeInfo.setBackground(false);
            isGoingForeground = false;
            notifyListener(true);
        }
    }

    public static void registerLifecycleListener(AppLifecycleListener appLifecycleListener) {
        if (appLifecycleListener != null) {
            listeners.add(appLifecycleListener);
        }
    }

    public static void unregisterLifecycleListener(AppLifecycleListener appLifecycleListener) {
        listeners.remove(appLifecycleListener);
    }
}
