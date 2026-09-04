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
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ViewTarget.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class r<T extends View, Z> extends com.bumptech.glide.request.target.b<Z> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f41928h = "ViewTarget";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f41929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f41930j = R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final T f41931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f41932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private View.OnAttachStateChangeListener f41933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41935g;

    /* JADX INFO: compiled from: ViewTarget.java */
    public class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.g();
        }
    }

    /* JADX INFO: compiled from: ViewTarget.java */
    @j1
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f41937e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @j1
        @p0
        static Integer f41938f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f41939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<o> f41940b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private a f41942d;

        /* JADX INFO: compiled from: ViewTarget.java */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final WeakReference<b> f41943b;

            a(@n0 b bVar) {
                this.f41943b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(r.f41928h, 2)) {
                    Log.v(r.f41928h, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f41943b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        b(@n0 View view) {
            this.f41939a = view;
        }

        private static int c(@n0 Context context) {
            if (f41938f == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f41938f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f41938f.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f41941c && this.f41939a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f41939a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(r.f41928h, 4)) {
                Log.i(r.f41928h, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f41939a.getContext());
        }

        private int f() {
            int paddingTop = this.f41939a.getPaddingTop() + this.f41939a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f41939a.getLayoutParams();
            return e(this.f41939a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f41939a.getPaddingLeft() + this.f41939a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f41939a.getLayoutParams();
            return e(this.f41939a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f41940b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        void a() {
            if (this.f41940b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f41939a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f41942d);
            }
            this.f41942d = null;
            this.f41940b.clear();
        }

        void d(@n0 o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f41940b.contains(oVar)) {
                this.f41940b.add(oVar);
            }
            if (this.f41942d == null) {
                ViewTreeObserver viewTreeObserver = this.f41939a.getViewTreeObserver();
                a aVar = new a(this);
                this.f41942d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        void k(@n0 o oVar) {
            this.f41940b.remove(oVar);
        }
    }

    public r(@n0 T t10) {
        this.f41931c = (T) com.bumptech.glide.util.m.e(t10);
        this.f41932d = new b(t10);
    }

    @Deprecated
    public r(@n0 T t10, boolean z10) {
        this(t10);
        if (z10) {
            k();
        }
    }

    @p0
    private Object d() {
        return this.f41931c.getTag(f41930j);
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f41933e;
        if (onAttachStateChangeListener == null || this.f41935g) {
            return;
        }
        this.f41931c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f41935g = true;
    }

    private void f() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f41933e;
        if (onAttachStateChangeListener == null || !this.f41935g) {
            return;
        }
        this.f41931c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f41935g = false;
    }

    private void i(@p0 Object obj) {
        f41929i = true;
        this.f41931c.setTag(f41930j, obj);
    }

    @Deprecated
    public static void j(int i10) {
        if (f41929i) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f41930j = i10;
    }

    @n0
    public final r<T, Z> c() {
        if (this.f41933e != null) {
            return this;
        }
        this.f41933e = new a();
        e();
        return this;
    }

    void g() {
        com.bumptech.glide.request.e request = getRequest();
        if (request != null) {
            this.f41934f = true;
            request.clear();
            this.f41934f = false;
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @p0
    public com.bumptech.glide.request.e getRequest() {
        Object objD = d();
        if (objD == null) {
            return null;
        }
        if (objD instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objD;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void getSize(@n0 o oVar) {
        this.f41932d.d(oVar);
    }

    @n0
    public T getView() {
        return this.f41931c;
    }

    void h() {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.e()) {
            return;
        }
        request.h();
    }

    @n0
    public final r<T, Z> k() {
        this.f41932d.f41941c = true;
        return this;
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void onLoadCleared(@p0 Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f41932d.b();
        if (this.f41934f) {
            return;
        }
        f();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void onLoadStarted(@p0 Drawable drawable) {
        super.onLoadStarted(drawable);
        e();
    }

    @Override // com.bumptech.glide.request.target.p
    @androidx.annotation.i
    public void removeCallback(@n0 o oVar) {
        this.f41932d.k(oVar);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void setRequest(@p0 com.bumptech.glide.request.e eVar) {
        i(eVar);
    }

    public String toString() {
        return "Target for: " + this.f41931c;
    }
}
