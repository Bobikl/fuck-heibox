package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.d0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CustomViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f41892g = "CustomViewTarget";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d0
    private static final int f41893h = R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f41894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final T f41895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private View.OnAttachStateChangeListener f41896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41898f;

    /* JADX INFO: compiled from: CustomViewTarget.java */
    public class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.i();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.h();
        }
    }

    /* JADX INFO: compiled from: CustomViewTarget.java */
    @j1
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f41900e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @j1
        @p0
        static Integer f41901f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f41902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<o> f41903b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private a f41905d;

        /* JADX INFO: compiled from: CustomViewTarget.java */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final WeakReference<b> f41906b;

            a(@n0 b bVar) {
                this.f41906b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(f.f41892g, 2)) {
                    Log.v(f.f41892g, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f41906b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@n0 View view) {
            this.f41902a = view;
        }

        private static int c(@n0 Context context) {
            if (f41901f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f41901f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f41901f.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f41904c && this.f41902a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f41902a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(f.f41892g, 4)) {
                Log.i(f.f41892g, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f41902a.getContext());
        }

        private int f() {
            int paddingTop = this.f41902a.getPaddingTop() + this.f41902a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f41902a.getLayoutParams();
            return e(this.f41902a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f41902a.getPaddingLeft() + this.f41902a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f41902a.getLayoutParams();
            return e(this.f41902a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f41903b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        void a() {
            if (this.f41903b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f41902a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f41905d);
            }
            this.f41905d = null;
            this.f41903b.clear();
        }

        void d(@n0 o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f41903b.contains(oVar)) {
                this.f41903b.add(oVar);
            }
            if (this.f41905d == null) {
                ViewTreeObserver viewTreeObserver = this.f41902a.getViewTreeObserver();
                a aVar = new a(this);
                this.f41905d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@n0 o oVar) {
            this.f41903b.remove(oVar);
        }
    }

    public f(@n0 T t10) {
        this.f41895c = (T) com.bumptech.glide.util.m.e(t10);
        this.f41894b = new b(t10);
    }

    @p0
    private Object b() {
        return this.f41895c.getTag(f41893h);
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f41896d;
        if (onAttachStateChangeListener == null || this.f41898f) {
            return;
        }
        this.f41895c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f41898f = true;
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f41896d;
        if (onAttachStateChangeListener == null || !this.f41898f) {
            return;
        }
        this.f41895c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f41898f = false;
    }

    private void j(@p0 Object obj) {
        this.f41895c.setTag(f41893h, obj);
    }

    @n0
    public final f<T, Z> a() {
        if (this.f41896d != null) {
            return this;
        }
        this.f41896d = new a();
        d();
        return this;
    }

    @n0
    public final T c() {
        return this.f41895c;
    }

    protected abstract void f(@p0 Drawable drawable);

    protected void g(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @p0
    public final com.bumptech.glide.request.e getRequest() {
        Object objB = b();
        if (objB == null) {
            return null;
        }
        if (objB instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objB;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.bumptech.glide.request.target.p
    public final void getSize(@n0 o oVar) {
        this.f41894b.d(oVar);
    }

    final void h() {
        com.bumptech.glide.request.e request = getRequest();
        if (request != null) {
            this.f41897e = true;
            request.clear();
            this.f41897e = false;
        }
    }

    final void i() {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.e()) {
            return;
        }
        request.h();
    }

    @Deprecated
    public final f<T, Z> k(@d0 int i10) {
        return this;
    }

    @n0
    public final f<T, Z> l() {
        this.f41894b.f41904c = true;
        return this;
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void onLoadCleared(@p0 Drawable drawable) {
        this.f41894b.b();
        f(drawable);
        if (this.f41897e) {
            return;
        }
        e();
    }

    @Override // com.bumptech.glide.request.target.p
    public final void onLoadStarted(@p0 Drawable drawable) {
        d();
        g(drawable);
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void removeCallback(@n0 o oVar) {
        this.f41894b.k(oVar);
    }

    @Override // com.bumptech.glide.request.target.p
    public final void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        j(eVar);
    }

    public String toString() {
        return "Target for: " + this.f41895c;
    }
}
