package com.max.mediaselector.lib.utils;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.max.hbpermission.PermissionManager;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.service.ForegroundService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: CameraShotUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f75536a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f75537b = "CameraShotUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CameraShotUtil.kt */
    public static final class a implements androidx.activity.result.a<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private Uri f75538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private yh.p<? super Uri, ? super Boolean, b2> f75539b;

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.f34605a8, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            d(bool);
        }

        @dl.e
        public final yh.p<Uri, Boolean, b2> b() {
            return this.f75539b;
        }

        @dl.e
        public final Uri c() {
            return this.f75538a;
        }

        public void d(@dl.e Boolean bool) {
            yh.p<? super Uri, ? super Boolean, b2> pVar;
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.Z7, new Class[]{Boolean.class}, Void.TYPE).isSupported || (pVar = this.f75539b) == null) {
                return;
            }
            pVar.invoke(this.f75538a, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }

        public final void e(@dl.e yh.p<? super Uri, ? super Boolean, b2> pVar) {
            this.f75539b = pVar;
        }

        public final void f(@dl.e Uri uri) {
            this.f75538a = uri;
        }
    }

    private f() {
    }

    @xh.m
    public static final void c(@dl.d final Fragment fragment, @dl.d final androidx.activity.result.g<Uri> takePictureLauncher, @dl.d final a takePictureLauncherCallback) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{fragment, takePictureLauncher, takePictureLauncherCallback}, null, changeQuickRedirect, true, bb.c.m.T7, new Class[]{Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        f0.p(takePictureLauncher, "takePictureLauncher");
        f0.p(takePictureLauncherCallback, "takePictureLauncherCallback");
        final f fVar = f75536a;
        try {
            Result.a aVar = Result.f124476c;
            final FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            f0.o(fragmentActivityRequireActivity, "requireActivity(...)");
            PermissionManager.f71603a.M(fragmentActivityRequireActivity, new com.max.hbpermission.c() { // from class: com.max.mediaselector.lib.utils.d
                @Override // com.max.hbpermission.c
                public final void onResult() {
                    f.d(fragmentActivityRequireActivity, fVar, fragment, takePictureLauncher, takePictureLauncherCallback);
                }
            });
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[CameraShotUtil][openImageCamera] error: " + thE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FragmentActivity activity, f this_runCatching, Fragment fragment, androidx.activity.result.g takePictureLauncher, a takePictureLauncherCallback) {
        if (PatchProxy.proxy(new Object[]{activity, this_runCatching, fragment, takePictureLauncher, takePictureLauncherCallback}, null, changeQuickRedirect, true, bb.c.m.X7, new Class[]{FragmentActivity.class, f.class, Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(this_runCatching, "$this_runCatching");
        f0.p(fragment, "$fragment");
        f0.p(takePictureLauncher, "$takePictureLauncher");
        f0.p(takePictureLauncherCallback, "$takePictureLauncherCallback");
        if (com.max.mediaselector.lib.utils.a.d(activity)) {
            return;
        }
        this_runCatching.g(fragment, takePictureLauncher, takePictureLauncherCallback);
    }

    @xh.m
    public static final void e(@dl.d final Fragment fragment, @dl.d final androidx.activity.result.g<Uri> captureVideoLauncher, @dl.d final a captureVideoLauncherCallback) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{fragment, captureVideoLauncher, captureVideoLauncherCallback}, null, changeQuickRedirect, true, bb.c.m.V7, new Class[]{Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(fragment, "fragment");
        f0.p(captureVideoLauncher, "captureVideoLauncher");
        f0.p(captureVideoLauncherCallback, "captureVideoLauncherCallback");
        final f fVar = f75536a;
        try {
            Result.a aVar = Result.f124476c;
            final FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            f0.o(fragmentActivityRequireActivity, "requireActivity(...)");
            PermissionManager.f71603a.M(fragmentActivityRequireActivity, new com.max.hbpermission.c() { // from class: com.max.mediaselector.lib.utils.e
                @Override // com.max.hbpermission.c
                public final void onResult() {
                    f.f(fragmentActivityRequireActivity, fVar, fragment, captureVideoLauncher, captureVideoLauncherCallback);
                }
            });
            objB = Result.b(b2.f124493a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[CameraShotUtil][openVideoCamera] error: " + thE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(FragmentActivity activity, f this_runCatching, Fragment fragment, androidx.activity.result.g captureVideoLauncher, a captureVideoLauncherCallback) {
        if (PatchProxy.proxy(new Object[]{activity, this_runCatching, fragment, captureVideoLauncher, captureVideoLauncherCallback}, null, changeQuickRedirect, true, bb.c.m.Y7, new Class[]{FragmentActivity.class, f.class, Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "$activity");
        f0.p(this_runCatching, "$this_runCatching");
        f0.p(fragment, "$fragment");
        f0.p(captureVideoLauncher, "$captureVideoLauncher");
        f0.p(captureVideoLauncherCallback, "$captureVideoLauncherCallback");
        if (com.max.mediaselector.lib.utils.a.d(activity)) {
            return;
        }
        this_runCatching.h(fragment, captureVideoLauncher, captureVideoLauncherCallback);
    }

    private final void g(Fragment fragment, androidx.activity.result.g<Uri> gVar, a aVar) {
        FragmentActivity activity;
        Uri uriC;
        if (PatchProxy.proxy(new Object[]{fragment, gVar, aVar}, this, changeQuickRedirect, false, bb.c.m.U7, new Class[]{Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported || (activity = fragment.getActivity()) == null || com.max.mediaselector.lib.utils.a.d(activity) || (uriC = k.c(activity, new PictureSelectionConfig())) == null) {
            return;
        }
        ForegroundService.c(activity);
        aVar.f(uriC);
        gVar.b(uriC);
    }

    private final void h(Fragment fragment, androidx.activity.result.g<Uri> gVar, a aVar) {
        FragmentActivity activity;
        Uri uriD;
        if (PatchProxy.proxy(new Object[]{fragment, gVar, aVar}, this, changeQuickRedirect, false, bb.c.m.W7, new Class[]{Fragment.class, androidx.activity.result.g.class, a.class}, Void.TYPE).isSupported || (activity = fragment.getActivity()) == null || com.max.mediaselector.lib.utils.a.d(activity) || (uriD = k.d(activity, new PictureSelectionConfig())) == null) {
            return;
        }
        ForegroundService.c(activity);
        aVar.f(uriD);
        gVar.b(uriD);
    }
}
