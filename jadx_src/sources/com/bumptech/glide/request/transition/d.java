package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: compiled from: DrawableCrossFadeTransition.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements f<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41954b;

    public d(int i10, boolean z10) {
        this.f41953a = i10;
        this.f41954b = z10;
    }

    @Override // com.bumptech.glide.request.transition.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable drawableA = aVar.a();
        if (drawableA == null) {
            drawableA = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableA, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f41954b);
        transitionDrawable.startTransition(this.f41953a);
        aVar.b(transitionDrawable);
        return true;
    }
}
