package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: compiled from: ViewPreloadSizeProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public class p<T> implements com.bumptech.glide.f.b<T>, com.bumptech.glide.request.target.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f42017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f42018b;

    /* JADX INFO: compiled from: ViewPreloadSizeProvider.java */
    public static final class a extends com.bumptech.glide.request.target.f<View, Object> {
        a(@n0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.f
        protected void f(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }
    }

    public p() {
    }

    public p(@n0 View view) {
        a aVar = new a(view);
        this.f42018b = aVar;
        aVar.getSize(this);
    }

    @Override // com.bumptech.glide.f.b
    @p0
    public int[] a(@n0 T t10, int i10, int i11) {
        int[] iArr = this.f42017a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@n0 View view) {
        if (this.f42017a == null && this.f42018b == null) {
            a aVar = new a(view);
            this.f42018b = aVar;
            aVar.getSize(this);
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i10, int i11) {
        this.f42017a = new int[]{i10, i11};
        this.f42018b = null;
    }
}
