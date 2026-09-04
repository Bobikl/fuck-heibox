package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: compiled from: ViewGroupOverlayApi18.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(18)
public class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f27841a;

    d0(@androidx.annotation.n0 ViewGroup viewGroup) {
        this.f27841a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.k0
    public void a(@androidx.annotation.n0 Drawable drawable) {
        this.f27841a.remove(drawable);
    }

    @Override // androidx.transition.k0
    public void b(@androidx.annotation.n0 Drawable drawable) {
        this.f27841a.add(drawable);
    }

    @Override // androidx.transition.e0
    public void c(@androidx.annotation.n0 View view) {
        this.f27841a.add(view);
    }

    @Override // androidx.transition.e0
    public void d(@androidx.annotation.n0 View view) {
        this.f27841a.remove(view);
    }
}
