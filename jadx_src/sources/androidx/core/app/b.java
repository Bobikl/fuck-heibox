package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ActivityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.core.content.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static k f19907i;

    /* JADX INFO: compiled from: ActivityCompat.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f19908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f19909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19910d;

        a(String[] strArr, Activity activity, int i10) {
            this.f19908b = strArr;
            this.f19909c = activity;
            this.f19910d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f19908b.length];
            PackageManager packageManager = this.f19909c.getPackageManager();
            String packageName = this.f19909c.getPackageName();
            int length = this.f19908b.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f19908b[i10], packageName);
            }
            ((j) this.f19909c).onRequestPermissionsResult(this.f19910d, this.f19908b, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(16)
    public static class C0118b {
        private C0118b() {
        }

        @androidx.annotation.u
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        @androidx.annotation.u
        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        @androidx.annotation.u
        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(21)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        @androidx.annotation.u
        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        @androidx.annotation.u
        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @androidx.annotation.u
        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @androidx.annotation.u
        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(22)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(23)
    public static class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @androidx.annotation.u
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @androidx.annotation.u
        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        @androidx.annotation.u
        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(28)
    public static class f {
        private f() {
        }

        @androidx.annotation.u
        static <T> T a(Activity activity, int i10) {
            return (T) activity.requireViewById(i10);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(30)
    public static class g {
        private g() {
        }

        @androidx.annotation.u
        static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @androidx.annotation.u
        static void b(@androidx.annotation.n0 Activity activity, @androidx.annotation.p0 androidx.core.content.m0 m0Var, @androidx.annotation.p0 Bundle bundle) {
            activity.setLocusContext(m0Var == null ? null : m0Var.c(), bundle);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(31)
    public static class h {
        private h() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.n0 Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @androidx.annotation.u
        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(32)
    public static class i {
        private i() {
        }

        @androidx.annotation.u
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface j {
        void onRequestPermissionsResult(int i10, @androidx.annotation.n0 String[] strArr, @androidx.annotation.n0 int[] iArr);
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface k {
        boolean a(@androidx.annotation.n0 Activity activity, @androidx.annotation.f0(from = 0) int i10, int i11, @androidx.annotation.p0 Intent intent);

        boolean b(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 String[] strArr, @androidx.annotation.f0(from = 0) int i10);
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface l {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @androidx.annotation.w0(21)
    public static class m extends SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p3 f19911a;

        m(p3 p3Var) {
            this.f19911a = p3Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f19911a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f19911a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f19911a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f19911a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f19911a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f19911a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @androidx.annotation.w0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f19911a.h(list, list2, new p3.a() { // from class: androidx.core.app.g
                @Override // androidx.core.app.p3.a
                public final void onSharedElementsReady() {
                    b.e.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected b() {
    }

    public static void A(@androidx.annotation.n0 Activity activity) {
        c.a(activity);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public static k B() {
        return f19907i;
    }

    @androidx.annotation.p0
    public static Uri C(@androidx.annotation.n0 Activity activity) {
        return d.a(activity);
    }

    @Deprecated
    public static boolean D(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean E(@androidx.annotation.n0 Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return h.a(activity);
        }
        if (i10 == 30) {
            return (g.a(activity) == null || g.a(activity).getDisplayId() == 0) ? false : true;
        }
        if (i10 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.l.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void G(@androidx.annotation.n0 Activity activity) {
        c.b(activity);
    }

    public static void H(@androidx.annotation.n0 final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.F(activity);
                }
            });
        }
    }

    @androidx.annotation.p0
    public static androidx.core.view.i I(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 DragEvent dragEvent) {
        return androidx.core.view.i.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public static void J(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 String[] strArr, @androidx.annotation.f0(from = 0) int i10) {
        k kVar = f19907i;
        if (kVar == null || !kVar.b(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.a.k() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (activity instanceof l) {
                ((l) activity).validateRequestPermissionsRequestCode(i10);
            }
            e.b(activity, strArr, i10);
        }
    }

    @androidx.annotation.n0
    public static <T extends View> T K(@androidx.annotation.n0 Activity activity, @androidx.annotation.d0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) f.a(activity, i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void L(@androidx.annotation.n0 Activity activity, @androidx.annotation.p0 p3 p3Var) {
        c.c(activity, p3Var != null ? new m(p3Var) : null);
    }

    public static void M(@androidx.annotation.n0 Activity activity, @androidx.annotation.p0 p3 p3Var) {
        c.d(activity, p3Var != null ? new m(p3Var) : null);
    }

    public static void N(@androidx.annotation.n0 Activity activity, @androidx.annotation.p0 androidx.core.content.m0 m0Var, @androidx.annotation.p0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            g.b(activity, m0Var, bundle);
        }
    }

    public static void O(@androidx.annotation.p0 k kVar) {
        f19907i = kVar;
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    public static boolean P(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 String str) {
        if (!androidx.core.os.a.k() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return i.a(activity, str);
        }
        return i10 == 31 ? h.b(activity, str) : e.c(activity, str);
    }

    public static void Q(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        C0118b.b(activity, intent, i10, bundle);
    }

    public static void R(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        C0118b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void S(@androidx.annotation.n0 Activity activity) {
        c.e(activity);
    }

    public static void z(@androidx.annotation.n0 Activity activity) {
        C0118b.a(activity);
    }
}
