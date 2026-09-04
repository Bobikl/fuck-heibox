package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.n0;

/* JADX INFO: compiled from: InterpolateOnScrollPositionChangeHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f55063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f55064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScrollView f55065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f55066d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f55067e = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f55068f = new a();

    /* JADX INFO: compiled from: InterpolateOnScrollPositionChangeHelper.java */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            i.this.e();
        }
    }

    public i(View view, k kVar, ScrollView scrollView) {
        this.f55063a = view;
        this.f55064b = kVar;
        this.f55065c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f55065c = scrollView;
    }

    public void b(k kVar) {
        this.f55064b = kVar;
    }

    public void c(@n0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f55068f);
    }

    public void d(@n0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f55068f);
    }

    public void e() {
        ScrollView scrollView = this.f55065c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f55065c.getLocationInWindow(this.f55066d);
        this.f55065c.getChildAt(0).getLocationInWindow(this.f55067e);
        int top = (this.f55063a.getTop() - this.f55066d[1]) + this.f55067e[1];
        int height = this.f55063a.getHeight();
        int height2 = this.f55065c.getHeight();
        if (top < 0) {
            this.f55064b.p0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f55063a.invalidate();
            return;
        }
        int i10 = top + height;
        if (i10 > height2) {
            this.f55064b.p0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i10 - height2) / height))));
            this.f55063a.invalidate();
        } else if (this.f55064b.z() != 1.0f) {
            this.f55064b.p0(1.0f);
            this.f55063a.invalidate();
        }
    }
}
