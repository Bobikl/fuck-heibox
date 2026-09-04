package com.bytedance.realx;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class RXAppStateMonitorAndroid implements Application.ActivityLifecycleCallbacks {
    private Context mContext;
    private boolean mIsBackground;
    private long nativeMonitor;
    private final String TAG = "ASMonitorAndroid";
    private final Set<Integer> mStartedActivitySet = new HashSet();
    private final Set<Integer> mPausedActivitySet = new HashSet();

    @CalledByNative
    public RXAppStateMonitorAndroid(long j10) {
        this.mIsBackground = false;
        this.nativeMonitor = 0L;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (applicationContext == null) {
            RXLogging.e("ASMonitorAndroid", "context is null.");
            return;
        }
        Context applicationContext2 = applicationContext.getApplicationContext();
        this.mContext = applicationContext2;
        this.nativeMonitor = j10;
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(this);
        } else {
            RXLogging.e("ASMonitorAndroid", "context not a Application obj.");
        }
        this.mIsBackground = checkBackground(this.mContext);
    }

    private boolean checkBackground(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null) {
                RXLogging.e("ASMonitorAndroid", "activityManager is null.");
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                RXLogging.e("ASMonitorAndroid", "processInfoList is null.");
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            RXLogging.e("ASMonitorAndroid", "Get App background state failed. " + e10);
            return false;
        }
    }

    @CalledByNative
    private synchronized boolean getState() {
        return this.mIsBackground;
    }

    private native void nativeOnStateChange(long j10, boolean z10);

    private synchronized void onStateChange(boolean z10) {
        if (z10 == this.mIsBackground) {
            return;
        }
        this.mIsBackground = z10;
        long j10 = this.nativeMonitor;
        if (j10 != 0) {
            nativeOnStateChange(j10, z10);
        }
    }

    @CalledByNative
    private synchronized void reset() {
        this.nativeMonitor = 0L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@n0 Activity activity, @p0 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@n0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@n0 Activity activity) {
        this.mPausedActivitySet.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@n0 Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@n0 Activity activity, @n0 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@n0 Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@n0 Activity activity) {
        int iHashCode = activity.hashCode();
        boolean z10 = this.mIsBackground;
        if (this.mStartedActivitySet.contains(Integer.valueOf(iHashCode))) {
            this.mStartedActivitySet.remove(Integer.valueOf(iHashCode));
            if (this.mStartedActivitySet.size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.mStartedActivitySet.size() != 0) {
            z10 = false;
        } else if (this.mPausedActivitySet.contains(Integer.valueOf(iHashCode))) {
            z10 = true;
        } else {
            RXLogging.w("ASMonitorAndroid", "started set not contain activity" + activity);
        }
        onStateChange(z10);
        this.mPausedActivitySet.remove(Integer.valueOf(iHashCode));
    }
}
