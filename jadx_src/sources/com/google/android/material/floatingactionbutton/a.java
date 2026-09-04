package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.p0;

/* JADX INFO: compiled from: AnimatorTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Animator f54263a;

    a() {
    }

    public void a() {
        Animator animator = this.f54263a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f54263a = null;
    }

    public void c(Animator animator) {
        a();
        this.f54263a = animator;
    }
}
