package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: CancelableFontCallback.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f54840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0428a f54841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54842c;

    /* JADX INFO: renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CancelableFontCallback.java */
    public interface InterfaceC0428a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0428a interfaceC0428a, Typeface typeface) {
        this.f54840a = typeface;
        this.f54841b = interfaceC0428a;
    }

    private void d(Typeface typeface) {
        if (this.f54842c) {
            return;
        }
        this.f54841b.a(typeface);
    }

    @Override // com.google.android.material.resources.f
    public void a(int i10) {
        d(this.f54840a);
    }

    @Override // com.google.android.material.resources.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f54842c = true;
    }
}
