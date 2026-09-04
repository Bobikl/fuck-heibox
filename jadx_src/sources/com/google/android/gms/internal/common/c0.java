package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CharSequence f52711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e0 f52712c;

    c0(e0 e0Var, CharSequence charSequence) {
        this.f52712c = e0Var;
        this.f52711b = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f52712c.h(this.f52711b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(x.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(x.a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
