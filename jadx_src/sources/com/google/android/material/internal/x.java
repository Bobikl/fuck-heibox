package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: StateListAnimator.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f54578a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private b f54579b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    ValueAnimator f54580c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f54581d = new a();

    /* JADX INFO: compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x xVar = x.this;
            if (xVar.f54580c == animator) {
                xVar.f54580c = null;
            }
        }
    }

    /* JADX INFO: compiled from: StateListAnimator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f54583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f54584b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f54583a = iArr;
            this.f54584b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f54580c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54580c = null;
        }
    }

    private void e(@n0 b bVar) {
        ValueAnimator valueAnimator = bVar.f54584b;
        this.f54580c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f54581d);
        this.f54578a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f54580c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f54580c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f54578a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f54578a.get(i10);
            if (StateSet.stateSetMatches(bVar.f54583a, iArr)) {
                break;
            } else {
                i10++;
            }
        }
        b bVar2 = this.f54579b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f54579b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
