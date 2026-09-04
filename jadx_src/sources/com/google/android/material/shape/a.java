package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.n0;
import java.util.Arrays;

/* JADX INFO: compiled from: AbsoluteCornerSize.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f55056a;

    public a(float f10) {
        this.f55056a = f10;
    }

    @Override // com.google.android.material.shape.e
    public float a(@n0 RectF rectF) {
        return this.f55056a;
    }

    public float b() {
        return this.f55056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f55056a == ((a) obj).f55056a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f55056a)});
    }
}
