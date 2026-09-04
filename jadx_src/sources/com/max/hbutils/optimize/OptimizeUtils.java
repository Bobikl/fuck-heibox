package com.max.hbutils.optimize;

import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.activity.ComponentActivity;
import androidx.annotation.w0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OptimizeUtils.kt */
/* JADX INFO: loaded from: classes13.dex */
@w0(24)
public final class OptimizeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final OptimizeUtils f73451a = new OptimizeUtils();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final a f73452b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Runnable f73453c = new Runnable() { // from class: com.max.hbutils.optimize.b
        @Override // java.lang.Runnable
        public final void run() {
            OptimizeUtils.d();
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: OptimizeUtils.kt */
    @w0(24)
    public static final class a implements Window$OnFrameMetricsAvailableListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void onFrameMetricsAvailable(@e Window window, @e FrameMetrics frameMetrics, int i10) {
            if (PatchProxy.proxy(new Object[]{window, frameMetrics, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.qo, new Class[]{Window.class, FrameMetrics.class, Integer.TYPE}, Void.TYPE).isSupported || frameMetrics == null) {
                return;
            }
            OptimizeUtils.f73451a.f(frameMetrics);
        }
    }

    private OptimizeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.oo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.v(c.f73459a, "============== gc事件 ==============");
    }

    public final void e(@dl.d ComponentActivity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.k.mo, new Class[]{ComponentActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
    }

    @w0(24)
    public final void f(@dl.d FrameMetrics frameMetrics) {
        if (PatchProxy.proxy(new Object[]{frameMetrics}, this, changeQuickRedirect, false, bb.c.k.no, new Class[]{FrameMetrics.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(8) / ((long) 1000000);
        if (metric >= 15) {
            Runtime runtime = Runtime.getRuntime();
            String str = c.f73459a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("measure + layout=");
            sb2.append(frameMetrics.getMetric(3) / Math.pow(10.0d, 6.0d));
            sb2.append(",     delay=");
            sb2.append(frameMetrics.getMetric(0) / Math.pow(10.0d, 6.0d));
            sb2.append(",     anim=");
            sb2.append(frameMetrics.getMetric(2) / Math.pow(10.0d, 6.0d));
            sb2.append(",    touch=");
            sb2.append(frameMetrics.getMetric(1) / Math.pow(10.0d, 6.0d));
            sb2.append(",     draw=");
            sb2.append(frameMetrics.getMetric(4) / Math.pow(10.0d, 6.0d));
            sb2.append(",     sync=");
            sb2.append(frameMetrics.getMetric(5) / Math.pow(10.0d, 6.0d));
            sb2.append(",     swap=");
            sb2.append(frameMetrics.getMetric(7) / Math.pow(10.0d, 6.0d));
            sb2.append(",     command=");
            sb2.append(frameMetrics.getMetric(6) / Math.pow(10.0d, 6.0d));
            sb2.append(",     total=");
            sb2.append(metric);
            sb2.append("    maxMemory=");
            long j10 = 1048576;
            sb2.append(runtime.maxMemory() / j10);
            sb2.append("M    totalMemory=");
            sb2.append(runtime.totalMemory() / j10);
            sb2.append("M    freeMemory=");
            sb2.append(runtime.freeMemory() / j10);
            sb2.append("M    cuarrentUsedMemory=");
            sb2.append((runtime.totalMemory() - runtime.freeMemory()) / j10);
            sb2.append('M');
            Log.v(str, sb2.toString());
        }
    }
}
