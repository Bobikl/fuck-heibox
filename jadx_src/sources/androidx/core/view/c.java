package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(16)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f21474a = new c();

    private c() {
    }

    @androidx.annotation.u
    @xh.m
    public static final void a(@dl.d View view, @dl.d Runnable action, long j10) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(action, "action");
        view.postOnAnimationDelayed(action, j10);
    }
}
