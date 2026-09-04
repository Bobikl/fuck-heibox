package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: compiled from: ActivityOptionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f19970a = "android.activity.usage_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19971b = "android.usage_time_packages";

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.w0(16)
    public static class a extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ActivityOptions f19972c;

        a(ActivityOptions activityOptions) {
            this.f19972c = activityOptions;
        }

        @Override // androidx.core.app.i
        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return e.a(this.f19972c);
        }

        @Override // androidx.core.app.i
        public void j(@androidx.annotation.n0 PendingIntent pendingIntent) {
            d.c(this.f19972c, pendingIntent);
        }

        @Override // androidx.core.app.i
        @androidx.annotation.n0
        public i k(@androidx.annotation.p0 Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(e.b(this.f19972c, rect));
        }

        @Override // androidx.core.app.i
        public Bundle l() {
            return this.f19972c.toBundle();
        }

        @Override // androidx.core.app.i
        public void m(@androidx.annotation.n0 i iVar) {
            if (iVar instanceof a) {
                this.f19972c.update(((a) iVar).f19972c);
            }
        }
    }

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.w0(16)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static ActivityOptions a(Context context, int i10, int i11) {
            return ActivityOptions.makeCustomAnimation(context, i10, i11);
        }

        @androidx.annotation.u
        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static ActivityOptions c(View view, Bitmap bitmap, int i10, int i11) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11);
        }
    }

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.w0(21)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @androidx.annotation.u
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @androidx.annotation.u
        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.w0(23)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @androidx.annotation.u
        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13);
        }

        @androidx.annotation.u
        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @androidx.annotation.w0(24)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @androidx.annotation.u
        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    protected i() {
    }

    @androidx.annotation.n0
    public static i b() {
        return new a(d.a());
    }

    @androidx.annotation.n0
    public static i c(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        return new a(d.b(view, i10, i11, i12, i13));
    }

    @androidx.annotation.n0
    public static i d(@androidx.annotation.n0 Context context, int i10, int i11) {
        return new a(b.a(context, i10, i11));
    }

    @androidx.annotation.n0
    public static i e(@androidx.annotation.n0 View view, int i10, int i11, int i12, int i13) {
        return new a(b.b(view, i10, i11, i12, i13));
    }

    @androidx.annotation.n0
    public static i f(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 View view, @androidx.annotation.n0 String str) {
        return new a(c.a(activity, view, str));
    }

    @androidx.annotation.n0
    public static i g(@androidx.annotation.n0 Activity activity, @androidx.annotation.p0 androidx.core.util.k<View, String>... kVarArr) {
        Pair[] pairArr = null;
        if (kVarArr != null) {
            pairArr = new Pair[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                androidx.core.util.k<View, String> kVar = kVarArr[i10];
                pairArr[i10] = Pair.create(kVar.f21263a, kVar.f21264b);
            }
        }
        return new a(c.b(activity, pairArr));
    }

    @androidx.annotation.n0
    public static i h() {
        return new a(c.c());
    }

    @androidx.annotation.n0
    public static i i(@androidx.annotation.n0 View view, @androidx.annotation.n0 Bitmap bitmap, int i10, int i11) {
        return new a(b.c(view, bitmap, i10, i11));
    }

    @androidx.annotation.p0
    public Rect a() {
        return null;
    }

    public void j(@androidx.annotation.n0 PendingIntent pendingIntent) {
    }

    @androidx.annotation.n0
    public i k(@androidx.annotation.p0 Rect rect) {
        return this;
    }

    @androidx.annotation.p0
    public Bundle l() {
        return null;
    }

    public void m(@androidx.annotation.n0 i iVar) {
    }
}
