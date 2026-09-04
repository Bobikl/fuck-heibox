package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.Arrays;

/* JADX INFO: compiled from: ClampedCornerSize.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55059a;

    public c(float f10) {
        this.f55059a = f10;
    }

    @n0
    public static c b(@n0 a aVar) {
        return new c(aVar.b());
    }

    private static float c(@n0 RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.google.android.material.shape.e
    public float a(@n0 RectF rectF) {
        return Math.min(this.f55059a, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f55059a == ((c) obj).f55059a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f55059a)});
    }
}
