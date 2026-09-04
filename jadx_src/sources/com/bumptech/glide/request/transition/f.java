package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.p0;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes6.dex */
public interface f<R> {

    /* JADX INFO: compiled from: Transition.java */
    public interface a {
        @p0
        Drawable a();

        void b(Drawable drawable);

        View getView();
    }

    boolean a(R r10, a aVar);
}
