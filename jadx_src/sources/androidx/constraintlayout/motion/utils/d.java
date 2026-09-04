package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: compiled from: ViewState.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18595e;

    public void a(View view) {
        this.f18592b = view.getLeft();
        this.f18593c = view.getTop();
        this.f18594d = view.getRight();
        this.f18595e = view.getBottom();
        this.f18591a = view.getRotation();
    }

    public int b() {
        return this.f18595e - this.f18593c;
    }

    public int c() {
        return this.f18594d - this.f18592b;
    }
}
