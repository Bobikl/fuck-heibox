package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: FrameMetricsAggregator.java */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20383b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20384c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20385d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20386e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20387f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20388g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f20389h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20390i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20391j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f20392k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f20393l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f20394m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f20395n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f20396o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f20397p = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f20398q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20399r = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f20400s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f20401t = 256;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f20402u = 511;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f20403a;

    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    @androidx.annotation.w0(24)
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f20404e = 1000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f20405f = 500000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static HandlerThread f20406g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static Handler f20407h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f20409b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f20410c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window$OnFrameMetricsAvailableListener f20411d = new WindowOnFrameMetricsAvailableListenerC0125a();

        /* JADX INFO: renamed from: androidx.core.app.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FrameMetricsAggregator.java */
        public class WindowOnFrameMetricsAvailableListenerC0125a implements Window$OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0125a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f20408a & 1) != 0) {
                    aVar.f(aVar.f20409b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f20408a & 2) != 0) {
                    aVar2.f(aVar2.f20409b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f20408a & 4) != 0) {
                    aVar3.f(aVar3.f20409b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f20408a & 8) != 0) {
                    aVar4.f(aVar4.f20409b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f20408a & 16) != 0) {
                    aVar5.f(aVar5.f20409b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f20408a & 64) != 0) {
                    aVar6.f(aVar6.f20409b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f20408a & 32) != 0) {
                    aVar7.f(aVar7.f20409b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f20408a & 128) != 0) {
                    aVar8.f(aVar8.f20409b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f20408a & 256) != 0) {
                    aVar9.f(aVar9.f20409b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f20408a = i10;
        }

        @Override // androidx.core.app.w.b
        public void a(Activity activity) {
            if (f20406g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f20406g = handlerThread;
                handlerThread.start();
                f20407h = new Handler(f20406g.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f20409b;
                if (sparseIntArrayArr[i10] == null && (this.f20408a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f20411d, f20407h);
            this.f20410c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.w.b
        public SparseIntArray[] b() {
            return this.f20409b;
        }

        @Override // androidx.core.app.w.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.f20410c) {
                if (weakReference.get() == activity) {
                    this.f20410c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f20411d);
            return this.f20409b;
        }

        @Override // androidx.core.app.w.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f20409b;
            this.f20409b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.w.b
        public SparseIntArray[] e() {
            for (int size = this.f20410c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f20410c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f20411d);
                    this.f20410c.remove(size);
                }
            }
            return this.f20409b;
        }

        void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    public static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    /* JADX INFO: compiled from: FrameMetricsAggregator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public w() {
        this(1);
    }

    public w(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20403a = new a(i10);
        } else {
            this.f20403a = new b();
        }
    }

    public void a(@androidx.annotation.n0 Activity activity) {
        this.f20403a.a(activity);
    }

    @androidx.annotation.p0
    public SparseIntArray[] b() {
        return this.f20403a.b();
    }

    @androidx.annotation.p0
    public SparseIntArray[] c(@androidx.annotation.n0 Activity activity) {
        return this.f20403a.c(activity);
    }

    @androidx.annotation.p0
    public SparseIntArray[] d() {
        return this.f20403a.d();
    }

    @androidx.annotation.p0
    public SparseIntArray[] e() {
        return this.f20403a.e();
    }
}
