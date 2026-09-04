package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DrawableAlphaProperty.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f52903b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f52904a;

    private f() {
        super(Integer.class, "drawableAlphaCompat");
        this.f52904a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@n0 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@n0 Drawable drawable, @n0 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
