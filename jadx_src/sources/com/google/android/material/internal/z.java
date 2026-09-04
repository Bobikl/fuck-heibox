package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TextDrawableHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54587c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private com.google.android.material.resources.d f54590f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f54585a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.material.resources.f f54586b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54588d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private WeakReference<b> f54589e = new WeakReference<>(null);

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public class a extends com.google.android.material.resources.f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
            z.this.f54588d = true;
            b bVar = (b) z.this.f54589e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.f
        public void b(@n0 Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            z.this.f54588d = true;
            b bVar = (b) z.this.f54589e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        @n0
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public z(@p0 b bVar) {
        h(bVar);
    }

    private float c(@p0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f54585a.measureText(charSequence, 0, charSequence.length());
    }

    @p0
    public com.google.android.material.resources.d d() {
        return this.f54590f;
    }

    @n0
    public TextPaint e() {
        return this.f54585a;
    }

    public float f(String str) {
        if (!this.f54588d) {
            return this.f54587c;
        }
        float fC = c(str);
        this.f54587c = fC;
        this.f54588d = false;
        return fC;
    }

    public boolean g() {
        return this.f54588d;
    }

    public void h(@p0 b bVar) {
        this.f54589e = new WeakReference<>(bVar);
    }

    public void i(@p0 com.google.android.material.resources.d dVar, Context context) {
        if (this.f54590f != dVar) {
            this.f54590f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f54585a, this.f54586b);
                b bVar = this.f54589e.get();
                if (bVar != null) {
                    this.f54585a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f54585a, this.f54586b);
                this.f54588d = true;
            }
            b bVar2 = this.f54589e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z10) {
        this.f54588d = z10;
    }

    public void k(Context context) {
        this.f54590f.n(context, this.f54585a, this.f54586b);
    }
}
