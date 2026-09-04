package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ImageMatrixProperty.java */
/* JADX INFO: loaded from: classes7.dex */
public class g extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f52905a;

    public g() {
        super(Matrix.class, "imageMatrixProperty");
        this.f52905a = new Matrix();
    }

    @Override // android.util.Property
    @n0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@n0 ImageView imageView) {
        this.f52905a.set(imageView.getImageMatrix());
        return this.f52905a;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@n0 ImageView imageView, @n0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
