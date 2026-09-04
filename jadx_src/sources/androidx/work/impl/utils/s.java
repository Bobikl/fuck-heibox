package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.WorkManager;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProcessUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "ProcessUtils")
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/a;", "configuration", "", "b", "", ak.av, "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f29376a;

    static {
        String strI = androidx.work.n.i("ProcessUtils");
        kotlin.jvm.internal.f0.o(strI, "tagWithPrefix(\"ProcessUtils\")");
        f29376a = strI;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.f29273a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            kotlin.jvm.internal.f0.m(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th2) {
            androidx.work.n.e().b(f29376a, "Unable to check ActivityThread for processName", th2);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        kotlin.jvm.internal.f0.n(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid));
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(@dl.d Context context, @dl.d androidx.work.a configuration) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        String strA = a(context);
        String strC = configuration.c();
        return !(strC == null || strC.length() == 0) ? kotlin.jvm.internal.f0.g(strA, configuration.c()) : kotlin.jvm.internal.f0.g(strA, context.getApplicationInfo().processName);
    }
}
