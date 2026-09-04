package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.Arrays;

/* JADX INFO: compiled from: AdjustedCornerSize.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f55057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f55058b;

    public b(float f10, @n0 e eVar) {
        while (eVar instanceof b) {
            eVar = ((b) eVar).f55057a;
            f10 += ((b) eVar).f55058b;
        }
        this.f55057a = eVar;
        this.f55058b = f10;
    }

    @Override // com.google.android.material.shape.e
    public float a(@n0 RectF rectF) {
        return Math.max(0.0f, this.f55057a.a(rectF) + this.f55058b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f55057a.equals(bVar.f55057a) && this.f55058b == bVar.f55058b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55057a, Float.valueOf(this.f55058b)});
    }
}
