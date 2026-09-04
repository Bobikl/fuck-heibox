package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;
import androidx.core.view.v2;

/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f2765l = "TooltipCompatHandler";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f2766m = 2500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f2767n = 15000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f2768o = 3000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static e1 f2769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static e1 f2770q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f2771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f2772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f2774e = new Runnable() { // from class: androidx.appcompat.widget.c1
        @Override // java.lang.Runnable
        public final void run() {
            this.f2751b.e();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f2775f = new Runnable() { // from class: androidx.appcompat.widget.d1
        @Override // java.lang.Runnable
        public final void run() {
            this.f2758b.d();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f1 f2778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2780k;

    private e1(View view, CharSequence charSequence) {
        this.f2771b = view;
        this.f2772c = charSequence;
        this.f2773d = v2.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f2771b.removeCallbacks(this.f2774e);
    }

    private void c() {
        this.f2780k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f2771b.postDelayed(this.f2774e, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(e1 e1Var) {
        e1 e1Var2 = f2769p;
        if (e1Var2 != null) {
            e1Var2.b();
        }
        f2769p = e1Var;
        if (e1Var != null) {
            e1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        e1 e1Var = f2769p;
        if (e1Var != null && e1Var.f2771b == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new e1(view, charSequence);
            return;
        }
        e1 e1Var2 = f2770q;
        if (e1Var2 != null && e1Var2.f2771b == view) {
            e1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f2780k && Math.abs(x10 - this.f2776g) <= this.f2773d && Math.abs(y10 - this.f2777h) <= this.f2773d) {
            return false;
        }
        this.f2776g = x10;
        this.f2777h = y10;
        this.f2780k = false;
        return true;
    }

    void d() {
        if (f2770q == this) {
            f2770q = null;
            f1 f1Var = this.f2778i;
            if (f1Var != null) {
                f1Var.c();
                this.f2778i = null;
                c();
                this.f2771b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f2765l, "sActiveHandler.mPopup == null");
            }
        }
        if (f2769p == this) {
            g(null);
        }
        this.f2771b.removeCallbacks(this.f2775f);
    }

    void i(boolean z10) {
        long j10;
        int longPressTimeout;
        long j11;
        if (j1.O0(this.f2771b)) {
            g(null);
            e1 e1Var = f2770q;
            if (e1Var != null) {
                e1Var.d();
            }
            f2770q = this;
            this.f2779j = z10;
            f1 f1Var = new f1(this.f2771b.getContext());
            this.f2778i = f1Var;
            f1Var.e(this.f2771b, this.f2776g, this.f2777h, this.f2779j, this.f2772c);
            this.f2771b.addOnAttachStateChangeListener(this);
            if (this.f2779j) {
                j11 = f2766m;
            } else {
                if ((j1.C0(this.f2771b) & 1) == 1) {
                    j10 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j10 - ((long) longPressTimeout);
            }
            this.f2771b.removeCallbacks(this.f2775f);
            this.f2771b.postDelayed(this.f2775f, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2778i != null && this.f2779j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2771b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f2771b.isEnabled() && this.f2778i == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2776g = view.getWidth() / 2;
        this.f2777h = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
