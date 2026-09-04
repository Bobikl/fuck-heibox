package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.u;
import androidx.annotation.w0;
import dl.d;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(19)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f19848a = new a();

    private a() {
    }

    @u
    @m
    public static final void a(@d Animator animator, @d Animator.AnimatorPauseListener listener) {
        f0.p(animator, "animator");
        f0.p(listener, "listener");
        animator.addPauseListener(listener);
    }
}
