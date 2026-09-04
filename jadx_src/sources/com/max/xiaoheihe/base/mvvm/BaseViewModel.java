package com.max.xiaoheihe.base.mvvm;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: BaseViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public abstract class BaseViewModel extends w0 implements com.max.xiaoheihe.base.mvvm.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final a f76914h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f76915i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f76916j = "HeyBox_Lifecycle";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final i0<BaseDisplayState> f76917b = new i0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final i0<Boolean> f76918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final i0<Integer> f76919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final i0<Boolean> f76920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private Intent f76921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final z f76922g;

    /* JADX INFO: compiled from: BaseViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public BaseViewModel() {
        Boolean bool = Boolean.FALSE;
        this.f76918c = new i0<>(bool);
        this.f76919d = new i0<>(0);
        this.f76920e = new i0<>(bool);
        this.f76922g = b0.c(new yh.a<ArrayList<ValueAnimator>>() { // from class: com.max.xiaoheihe.base.mvvm.BaseViewModel$mValueAnimatorList$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final ArrayList<ValueAnimator> a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.oJ, new Class[0], ArrayList.class);
                return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : new ArrayList<>();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.ArrayList<android.animation.ValueAnimator>] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.pJ, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    private final ArrayList<ValueAnimator> h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.eJ, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : (ArrayList) this.f76922g.getValue();
    }

    public final void c(@e ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, c.m.mJ, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported || valueAnimator == null) {
            return;
        }
        h().add(valueAnimator);
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.nJ, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (ValueAnimator valueAnimator : h()) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        h().clear();
    }

    @d
    public final i0<Integer> f() {
        return this.f76919d;
    }

    @e
    public Intent g() {
        return this.f76921f;
    }

    @d
    public final i0<Boolean> i() {
        return this.f76920e;
    }

    @Override // androidx.lifecycle.j
    public void j(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.hJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onResume");
    }

    @d
    public final i0<BaseDisplayState> k() {
        return this.f76917b;
    }

    @Override // androidx.lifecycle.j
    public void l(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.iJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onPause");
    }

    @d
    public final i0<Boolean> m() {
        return this.f76918c;
    }

    public final void n(@d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, c.m.lJ, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (activity instanceof y) {
            ((y) activity).getLifecycle().a(this);
        }
    }

    public void o(@e Intent intent) {
        this.f76921f = intent;
    }

    @Override // androidx.lifecycle.j
    public void onDestroy(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.kJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onDestroy");
        this.f76918c.r(Boolean.FALSE);
        e();
    }

    @Override // androidx.lifecycle.j
    public void onStart(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.gJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onStart");
    }

    @Override // androidx.lifecycle.j
    public void onStop(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.jJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onStop");
    }

    @Override // androidx.lifecycle.j
    public void q(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.fJ, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        Log.d(f76916j, "onCreate");
        this.f76918c.r(Boolean.TRUE);
    }
}
