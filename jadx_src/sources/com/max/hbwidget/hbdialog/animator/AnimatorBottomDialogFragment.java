package com.max.hbwidget.hbdialog.animator;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: AnimatorBottomDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public class AnimatorBottomDialogFragment extends fe.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f74368b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f74369c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final z f74370d = b0.c(new yh.a<BottomDialogAnimator>() { // from class: com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment$animator$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: AnimatorBottomDialogFragment.kt */
        public static final class a implements BottomDialogAnimator.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AnimatorBottomDialogFragment f74373a;

            a(AnimatorBottomDialogFragment animatorBottomDialogFragment) {
                this.f74373a = animatorBottomDialogFragment;
            }

            @Override // com.max.hbwidget.hbdialog.animator.BottomDialogAnimator.a
            public void a(float f10) {
                Window window;
                View decorView;
                int measuredHeight = 0;
                if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.l.f34314n6, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                AnimatorBottomDialogFragment animatorBottomDialogFragment = this.f74373a;
                Dialog dialog = animatorBottomDialogFragment.getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    measuredHeight = decorView.getMeasuredHeight();
                }
                animatorBottomDialogFragment.U3(f10, measuredHeight);
            }

            @Override // com.max.hbwidget.hbdialog.animator.BottomDialogAnimator.a
            public void b(float f10) {
                Window window;
                View decorView;
                int measuredHeight = 0;
                if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.l.f34337o6, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                AnimatorBottomDialogFragment animatorBottomDialogFragment = this.f74373a;
                Dialog dialog = animatorBottomDialogFragment.getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    measuredHeight = decorView.getMeasuredHeight();
                }
                animatorBottomDialogFragment.T3(f10, measuredHeight);
            }
        }

        {
            super(0);
        }

        @d
        public final BottomDialogAnimator a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34268l6, new Class[0], BottomDialogAnimator.class);
            if (patchProxyResultProxy.isSupported) {
                return (BottomDialogAnimator) patchProxyResultProxy.result;
            }
            View viewRequireView = this.f74372b.requireView();
            f0.o(viewRequireView, "requireView(...)");
            BottomDialogAnimator bottomDialogAnimator = new BottomDialogAnimator(viewRequireView);
            bottomDialogAnimator.m(new a(this.f74372b));
            return bottomDialogAnimator;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.hbwidget.hbdialog.animator.BottomDialogAnimator, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ BottomDialogAnimator invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34291m6, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    public static final /* synthetic */ void L3(AnimatorBottomDialogFragment animatorBottomDialogFragment) {
        if (PatchProxy.proxy(new Object[]{animatorBottomDialogFragment}, null, changeQuickRedirect, true, c.l.f34200i6, new Class[]{AnimatorBottomDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
    }

    public static final /* synthetic */ void M3(AnimatorBottomDialogFragment animatorBottomDialogFragment, y yVar) {
        if (PatchProxy.proxy(new Object[]{animatorBottomDialogFragment, yVar}, null, changeQuickRedirect, true, c.l.f34177h6, new Class[]{AnimatorBottomDialogFragment.class, y.class}, Void.TYPE).isSupported) {
            return;
        }
        animatorBottomDialogFragment.R3(yVar);
    }

    private final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34154g6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f74369c) {
            super.dismiss();
        } else {
            if (O3().k()) {
                return;
            }
            O3().h(new yh.a<b2>() { // from class: com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment$animateAndDismiss$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34245k6, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    boolean z10 = false;
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34222j6, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    Dialog dialog = this.f74371b.getDialog();
                    if (dialog != null && dialog.isShowing()) {
                        z10 = true;
                    }
                    if (z10) {
                        AnimatorBottomDialogFragment.L3(this.f74371b);
                    }
                }
            });
        }
    }

    private final BottomDialogAnimator O3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34016a6, new Class[0], BottomDialogAnimator.class);
        return patchProxyResultProxy.isSupported ? (BottomDialogAnimator) patchProxyResultProxy.result : (BottomDialogAnimator) this.f74370d.getValue();
    }

    private final void R3(y yVar) {
        if (PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, c.l.f34085d6, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        O3().onStop(yVar);
    }

    private final void S3() {
        FragmentActivity activity;
        Lifecycle lifecycle;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34062c6, new Class[0], Void.TYPE).isSupported || (activity = getActivity()) == null || (lifecycle = activity.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new v() { // from class: com.max.hbwidget.hbdialog.animator.AnimatorBottomDialogFragment$observeLifecycleEvents$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.lifecycle.v
            public void d(@d y source, @d Lifecycle.Event event) {
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, c.l.f34360p6, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AnimatorBottomDialogFragment.M3(this.f74374b, source);
                }
            }
        });
    }

    public final boolean P3() {
        return this.f74368b;
    }

    public final boolean Q3() {
        return this.f74369c;
    }

    public void T3(float f10, int i10) {
    }

    public void U3(float f10, int i10) {
    }

    public final void V3(boolean z10) {
        this.f74368b = z10;
    }

    public final void W3(boolean z10) {
        this.f74369c = z10;
    }

    @Override // androidx.fragment.app.j
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34108e6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N3();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, c.l.f34131f6, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        N3();
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@d View view, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, c.l.f34039b6, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f74368b) {
            O3().f();
        }
        S3();
    }
}
