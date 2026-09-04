package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class f0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f2795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f2796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f2797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f2800j = new int[2];

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = f0.this.f2795e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.e();
        }
    }

    public f0(View view) {
        this.f2795e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2792b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2793c = tapTimeout;
        this.f2794d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f2797g;
        if (runnable != null) {
            this.f2795e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2796f;
        if (runnable2 != null) {
            this.f2795e.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.f2795e;
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.b() || (dropDownListView = (DropDownListView) pVarB.j()) == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(dropDownListView, motionEventObtainNoHistory);
        boolean zF = dropDownListView.f(motionEventObtainNoHistory, this.f2799i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zF && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f2795e;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2799i = motionEvent.getPointerId(0);
            if (this.f2796f == null) {
                this.f2796f = new a();
            }
            view.postDelayed(this.f2796f, this.f2793c);
            if (this.f2797g == null) {
                this.f2797g = new b();
            }
            view.postDelayed(this.f2797g, this.f2794d);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2799i);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f2792b)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2800j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2800j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected boolean c() {
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || pVarB.b()) {
            return true;
        }
        pVarB.show();
        return true;
    }

    protected boolean d() {
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.b()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f2795e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f2798h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f2798h;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2795e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2798h = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2798h = false;
        this.f2799i = -1;
        Runnable runnable = this.f2796f;
        if (runnable != null) {
            this.f2795e.removeCallbacks(runnable);
        }
    }
}
