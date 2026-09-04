package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ViewGroupOverlayApi14.java */
/* JADX INFO: loaded from: classes6.dex */
public class c0 extends ViewOverlayApi14 implements e0 {
    c0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static c0 g(ViewGroup viewGroup) {
        return (c0) ViewOverlayApi14.e(viewGroup);
    }

    @Override // androidx.transition.e0
    public void c(@androidx.annotation.n0 View view) {
        this.f27796a.b(view);
    }

    @Override // androidx.transition.e0
    public void d(@androidx.annotation.n0 View view) {
        this.f27796a.h(view);
    }
}
