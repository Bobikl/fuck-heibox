package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;

/* JADX INFO: compiled from: DrawableResource.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T extends Drawable> implements s<T>, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f41649b;

    public d(T t10) {
        this.f41649b = (T) m.e(t10);
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f41649b.getConstantState();
        return constantState == null ? this.f41649b : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t10 = this.f41649b;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof com.bumptech.glide.load.resource.gif.c) {
            ((com.bumptech.glide.load.resource.gif.c) t10).g().prepareToDraw();
        }
    }
}
