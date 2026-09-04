package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f52719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f52721c;

    private e0(b0 b0Var, boolean z10, v vVar, int i10, byte[] bArr) {
        this.f52721c = b0Var;
        this.f52720b = z10;
        this.f52719a = vVar;
    }

    public static e0 c(v vVar) {
        return new e0(new b0(vVar), false, u.f52732b, Integer.MAX_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new a0(this.f52721c, this, charSequence);
    }

    public final e0 b() {
        return new e0(this.f52721c, true, this.f52719a, Integer.MAX_VALUE, null);
    }

    public final Iterable d(CharSequence charSequence) {
        return new c0(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add((String) itH.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
