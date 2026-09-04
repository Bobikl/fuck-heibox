package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: compiled from: ViewOverlayApi18.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.w0(18)
public class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f27881a;

    j0(@androidx.annotation.n0 View view) {
        this.f27881a = view.getOverlay();
    }

    @Override // androidx.transition.k0
    public void a(@androidx.annotation.n0 Drawable drawable) {
        this.f27881a.remove(drawable);
    }

    @Override // androidx.transition.k0
    public void b(@androidx.annotation.n0 Drawable drawable) {
        this.f27881a.add(drawable);
    }
}
