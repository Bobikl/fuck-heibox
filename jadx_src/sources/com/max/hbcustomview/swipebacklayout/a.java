package com.max.hbcustomview.swipebacklayout;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: BaseBottomDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final int f69573g = 300;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int f69574h = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SwipeBackLayout f69575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f69576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f69577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f69578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69579f;

    /* JADX INFO: renamed from: com.max.hbcustomview.swipebacklayout.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseBottomDialog.java */
    public class C0562a implements SwipeBackLayout.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0562a() {
        }

        @Override // com.max.hbcustomview.swipebacklayout.SwipeBackLayout.e
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Ks, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.a(a.this);
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialog.java */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f69581b;

        b(int i10) {
            this.f69581b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Ls, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a aVar = a.this;
            SwipeBackLayout swipeBackLayout = aVar.f69575b;
            int i10 = aVar.f69576c;
            int i11 = this.f69581b;
            swipeBackLayout.setMaskAlpha((i10 * (i11 + iIntValue)) / i11);
            SwipeBackLayout swipeBackLayout2 = a.this.f69575b;
            swipeBackLayout2.invalidate(0, 0, swipeBackLayout2.getMeasuredWidth(), a.this.f69575b.getMeasuredHeight());
            a.this.f69575b.scrollTo(0, iIntValue);
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialog.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Ms, new Class[]{View.class}, Void.TYPE).isSupported && a.this.f69579f) {
                a.this.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialog.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f69584b;

        d(int i10) {
            this.f69584b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Ns, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a aVar = a.this;
            SwipeBackLayout swipeBackLayout = aVar.f69575b;
            int i10 = aVar.f69576c;
            int i11 = this.f69584b;
            swipeBackLayout.setMaskAlpha((i10 * (i11 + iIntValue)) / i11);
            a.this.f69575b.invalidate();
            a.this.f69575b.scrollTo(0, iIntValue);
            if (iIntValue < (-this.f69584b) + 30) {
                try {
                    if (a.this.isShowing()) {
                        a.c(a.this);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public a(@n0 Context context) {
        super(context);
        this.f69576c = 128;
        this.f69577d = true;
        this.f69579f = true;
    }

    public a(@n0 Context context, int i10) {
        super(context, i10);
        this.f69576c = 128;
        this.f69577d = true;
        this.f69579f = true;
    }

    public a(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.f69576c = 128;
        this.f69577d = true;
        this.f69579f = true;
    }

    static /* synthetic */ void a(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.f.Is, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    static /* synthetic */ void c(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.f.Js, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public void d(boolean z10) {
        this.f69579f = z10;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Hs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f69575b == null || !this.f69577d) {
            super.dismiss();
            return;
        }
        int iC = ic.a.f119343a.c(getContext());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -iC);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new d(iC));
        valueAnimatorOfInt.start();
    }

    public SwipeBackLayout e() {
        return this.f69575b;
    }

    public void f(boolean z10) {
        SwipeBackLayout swipeBackLayout;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Gs, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (swipeBackLayout = this.f69575b) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(z10);
    }

    public void g(View view) {
        this.f69578e = view;
        SwipeBackLayout swipeBackLayout = this.f69575b;
        if (swipeBackLayout != null) {
            swipeBackLayout.f69555k = view;
        }
    }

    public void h(@f0(from = 0, to = 255) int i10) {
        this.f69576c = i10;
    }

    public void i(boolean z10) {
        this.f69577d = z10;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.f.Es, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        window.setDimAmount(0.0f);
        window.setNavigationBarColor(getContext().getResources().getColor(R.color.background_layer_2_color));
        window.setWindowAnimations(R.style.BaseBottomDialogAnimation);
    }

    @Override // android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Fs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.show();
        if (this.f69575b == null) {
            Window window = getWindow();
            SwipeBackLayout swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(getContext()).inflate(R.layout.hbcustomview_layout_swipebackbase, (ViewGroup) null);
            this.f69575b = swipeBackLayout;
            swipeBackLayout.setOnSwipeFinishListener(new C0562a());
            this.f69575b.o(window);
        }
        this.f69575b.w();
        this.f69575b.setMaskAlpha(0);
        if (this.f69577d) {
            int iC = ic.a.f119343a.c(getContext());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-iC, 0);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new b(iC));
            valueAnimatorOfInt.start();
        }
        View view = this.f69575b.f69554j;
        if (view != null) {
            view.setOnClickListener(new c());
        }
        View view2 = this.f69578e;
        if (view2 != null) {
            this.f69575b.f69555k = view2;
        }
    }
}
