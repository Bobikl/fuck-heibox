package com.google.common.reflect;

import com.google.common.base.w;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TypeParameter.java */
/* JADX INFO: loaded from: classes7.dex */
@d
public abstract class m<T> extends l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TypeVariable<?> f59148b;

    protected m() {
        Type typeCapture = capture();
        w.u(typeCapture instanceof TypeVariable, "%s should be a type variable.", typeCapture);
        this.f59148b = (TypeVariable) typeCapture;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof m) {
            return this.f59148b.equals(((m) obj).f59148b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59148b.hashCode();
    }

    public String toString() {
        return this.f59148b.toString();
    }
}
