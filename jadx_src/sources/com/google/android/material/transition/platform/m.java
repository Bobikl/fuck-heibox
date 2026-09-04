package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class m extends SharedElementCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private static WeakReference<View> f56100f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Rect f56104d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f56101a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56102b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56103c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private d f56105e = new e();

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f56106a;

        a(Window window) {
            this.f56106a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.j(this.f56106a);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f56106a);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f56108a;

        b(Activity activity) {
            this.f56108a = activity;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f56100f != null && (view = (View) m.f56100f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f56100f = null;
            }
            this.f56108a.finish();
            this.f56108a.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f56110a;

        c(Window window) {
            this.f56110a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f56110a);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public interface d {
        @p0
        com.google.android.material.shape.p a(@n0 View view);
    }

    /* JADX INFO: compiled from: MaterialContainerTransformSharedElementCallback.java */
    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.m.d
        @p0
        public com.google.android.material.shape.p a(@n0 View view) {
            if (view instanceof com.google.android.material.shape.t) {
                return ((com.google.android.material.shape.t) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @p0
    private static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        Drawable drawableF = f(window);
        if (drawableF == null) {
            return;
        }
        drawableF.mutate().setColorFilter(androidx.core.graphics.e.a(0, BlendModeCompat.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Window window) {
        Drawable drawableF = f(window);
        if (drawableF == null) {
            return;
        }
        drawableF.mutate().clearColorFilter();
    }

    private void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f56103c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f56102b) {
                p(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.b0(true);
            lVar.addListener(new b(activity));
            if (this.f56102b) {
                p(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    private static void p(Window window, l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @p0
    public d e() {
        return this.f56105e;
    }

    public boolean g() {
        return this.f56103c;
    }

    public boolean h() {
        return this.f56102b;
    }

    public void k(@p0 d dVar) {
        this.f56105e = dVar;
    }

    public void l(boolean z10) {
        this.f56103c = z10;
    }

    public void m(boolean z10) {
        this.f56102b = z10;
    }

    @Override // android.app.SharedElementCallback
    @p0
    public Parcelable onCaptureSharedElementSnapshot(@n0 View view, @n0 Matrix matrix, @n0 RectF rectF) {
        f56100f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @p0
    public View onCreateSnapshotView(@n0 Context context, @p0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.p pVarA;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f56100f) != null && this.f56105e != null && (view = weakReference.get()) != null && (pVarA = this.f56105e.a(view)) != null) {
            viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, pVarA);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@n0 List<String> list, @n0 Map<String, View> map) {
        View view;
        Activity activityA;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activityA = com.google.android.material.internal.c.a(view.getContext())) == null) {
            return;
        }
        Window window = activityA.getWindow();
        if (this.f56101a) {
            n(window);
        } else {
            o(activityA, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@n0 List<String> list, @n0 List<View> list2, @n0 List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i10 = R.id.mtrl_motion_snapshot_view;
            if (view.getTag(i10) instanceof View) {
                list2.get(0).setTag(i10, null);
            }
        }
        if (!this.f56101a && !list2.isEmpty()) {
            this.f56104d = w.j(list2.get(0));
        }
        this.f56101a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@n0 List<String> list, @n0 List<View> list2, @n0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f56101a || list2.isEmpty() || this.f56104d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f56104d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f56104d.height(), 1073741824));
        Rect rect = this.f56104d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
