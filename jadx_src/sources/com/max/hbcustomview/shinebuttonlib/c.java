package com.max.hbcustomview.shinebuttonlib;

import android.animation.Animator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShineViewAnimatorListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements Animator.AnimatorListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final WeakReference<ShineButton> f69462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final WeakReference<ShineView> f69463c;

    public c(@d ShineButton shineButton, @d ShineView shineView) {
        f0.p(shineButton, "shineButton");
        f0.p(shineView, "shineView");
        this.f69462b = new WeakReference<>(shineButton);
        this.f69463c = new WeakReference<>(shineView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@d Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Gq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@d Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Fq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animator, "animator");
        ShineButton shineButton = this.f69462b.get();
        ShineView shineView = this.f69463c.get();
        if (shineView == null || shineButton == null) {
            return;
        }
        shineButton.B(shineView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@d Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Hq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@d Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Eq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animator, "animator");
    }
}
