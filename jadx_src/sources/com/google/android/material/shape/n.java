package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.x;
import java.util.Arrays;

/* JADX INFO: compiled from: RelativeCornerSize.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55123a;

    public n(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f55123a = f10;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static n b(@n0 RectF rectF, @n0 e eVar) {
        return eVar instanceof n ? (n) eVar : new n(eVar.a(rectF) / c(rectF));
    }

    private static float c(@n0 RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // com.google.android.material.shape.e
    public float a(@n0 RectF rectF) {
        return this.f55123a * c(rectF);
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float d() {
        return this.f55123a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f55123a == ((n) obj).f55123a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f55123a)});
    }
}
