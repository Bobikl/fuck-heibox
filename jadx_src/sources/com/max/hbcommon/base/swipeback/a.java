package com.max.hbcommon.base.swipeback;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.p0;
import com.max.hbcustomview.R;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BaseBottomDialogFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f66925h = 250;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f66926i = 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SwipeBackLayout f66927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f66928f = 128;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66929g = 0;

    /* JADX INFO: renamed from: com.max.hbcommon.base.swipeback.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseBottomDialogFragment.java */
    public class DialogInterfaceOnKeyListenerC0537a implements DialogInterface.OnKeyListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        DialogInterfaceOnKeyListenerC0537a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, bb.c.d.f31200e3, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (keyEvent.getKeyCode() != 4 || !a.this.isCancelable()) {
                return false;
            }
            a.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialogFragment.java */
    public class b implements SwipeBackLayout.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcustomview.swipebacklayout.SwipeBackLayout.e
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31223f3, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.N3(a.this);
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialogFragment.java */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.f31246g3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a aVar = a.this;
            aVar.T3(Float.valueOf(-(iIntValue / aVar.f66929g)));
            if (a.this.R3()) {
                a aVar2 = a.this;
                aVar2.f66927e.setMaskAlpha((aVar2.f66928f * (aVar2.f66929g + iIntValue)) / a.this.f66929g);
            } else {
                a.this.f66927e.setMaskAlpha(0);
            }
            a.this.f66927e.invalidate();
            a.this.f66927e.scrollTo(0, iIntValue);
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.d.f31269h3, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: BaseBottomDialogFragment.java */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66934b;

        e(int i10) {
            this.f66934b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.d.f31292i3, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a.this.S3(Float.valueOf(-(iIntValue / this.f66934b)));
            if (a.this.R3()) {
                a aVar = a.this;
                SwipeBackLayout swipeBackLayout = aVar.f66927e;
                int i10 = aVar.f66928f;
                int i11 = this.f66934b;
                swipeBackLayout.setMaskAlpha((i10 * (i11 + iIntValue)) / i11);
            } else {
                a.this.f66927e.setMaskAlpha(0);
            }
            a.this.f66927e.invalidate();
            a.this.f66927e.scrollTo(0, iIntValue);
            if (iIntValue >= (-this.f66934b) + 30 || !a.this.isActive()) {
                return;
            }
            a.P3(a.this);
        }
    }

    static /* synthetic */ void N3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.d.f31130b3, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    static /* synthetic */ void P3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.d.f31153c3, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    static /* synthetic */ void Q3(a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, null, changeQuickRedirect, true, bb.c.d.f31177d3, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public boolean R3() {
        return true;
    }

    public void S3(Float f10) {
    }

    public void T3(Float f10) {
    }

    public void U3(boolean z10) {
        SwipeBackLayout swipeBackLayout;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31107a3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (swipeBackLayout = this.f66927e) == null) {
            return;
        }
        swipeBackLayout.setEnableGesture(z10);
    }

    @Override // androidx.fragment.app.j
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Z2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f66927e == null) {
            Q3(this);
            return;
        }
        int iJ = this.f66929g;
        if (iJ <= 0) {
            iJ = ViewUtils.J(BaseApplication.a());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -iJ);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new e(iJ));
        valueAnimatorOfInt.start();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.d.Y2, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f66929g = ViewUtils.J(BaseApplication.a());
        getDialog().setOnKeyListener(new DialogInterfaceOnKeyListenerC0537a());
        Window window = getDialog().getWindow();
        window.setDimAmount(0.0f);
        window.setNavigationBarColor(getContext().getResources().getColor(R.color.background_layer_2_color));
        window.setWindowAnimations(R.style.BaseBottomDialogAnimation);
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(getViewContext()).inflate(R.layout.hbcustomview_layout_swipebackbase, (ViewGroup) null);
        this.f66927e = swipeBackLayout;
        swipeBackLayout.o(window);
        this.f66927e.setOnSwipeFinishListener(new b());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f66929g, 0);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new c());
        valueAnimatorOfInt.start();
        View view2 = this.f66927e.f69554j;
        if (view2 != null) {
            view2.setOnClickListener(new d());
        }
    }
}
