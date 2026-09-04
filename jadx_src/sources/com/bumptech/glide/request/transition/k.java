package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes6.dex */
public class k<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41964a;

    /* JADX INFO: compiled from: ViewTransition.java */
    public interface a {
        Animation a(Context context);
    }

    k(a aVar) {
        this.f41964a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r10, f.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f41964a.a(view.getContext()));
        return false;
    }
}
