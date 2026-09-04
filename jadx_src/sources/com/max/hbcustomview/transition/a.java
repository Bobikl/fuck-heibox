package com.max.hbcustomview.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.core.view.j1;
import androidx.transition.Transition;
import androidx.transition.Visibility;
import androidx.transition.u;
import androidx.transition.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HalfFade.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends Visibility {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.max.hbcustomview.transition.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HalfFade.java */
    public class C0564a extends u {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f69668b;

        C0564a(View view) {
            this.f69668b = view;
        }

        @Override // androidx.transition.u, androidx.transition.Transition.h
        public void d(@n0 Transition transition) {
            if (PatchProxy.proxy(new Object[]{transition}, this, changeQuickRedirect, false, bb.c.f.tv, new Class[]{Transition.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69668b.setAlpha(1.0f);
            transition.n0(this);
        }
    }

    /* JADX INFO: compiled from: HalfFade.java */
    public static class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f69670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f69671c = false;

        b(View view) {
            this.f69670b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.vv, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69670b.setAlpha(1.0f);
            if (this.f69671c) {
                this.f69670b.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.uv, new Class[]{Animator.class}, Void.TYPE).isSupported && j1.L0(this.f69670b) && this.f69670b.getLayerType() == 0) {
                this.f69671c = true;
                this.f69670b.setLayerType(2, null);
            }
        }
    }

    private Animator R0(View view, float f10, float f11) {
        Object[] objArr = {view, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.qv, new Class[]{View.class, cls, cls}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        if (f10 == f11) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", f10, f11);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new C0564a(view));
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view, zVar, zVar2}, this, changeQuickRedirect, false, bb.c.f.rv, new Class[]{ViewGroup.class, View.class, z.class, z.class}, Animator.class);
        return patchProxyResultProxy.isSupported ? (Animator) patchProxyResultProxy.result : R0(view, 0.0f, 0.5f);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, view, zVar, zVar2}, this, changeQuickRedirect, false, bb.c.f.sv, new Class[]{ViewGroup.class, View.class, z.class, z.class}, Animator.class);
        return patchProxyResultProxy.isSupported ? (Animator) patchProxyResultProxy.result : R0(view, 0.5f, 0.0f);
    }
}
