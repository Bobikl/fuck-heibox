package com.bumptech.glide.request.transition;

import android.view.View;

/* JADX INFO: compiled from: ViewPropertyTransition.java */
/* JADX INFO: loaded from: classes6.dex */
public class j<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f41963a;

    /* JADX INFO: compiled from: ViewPropertyTransition.java */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f41963a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r10, f.a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f41963a.a(aVar.getView());
        return false;
    }
}
