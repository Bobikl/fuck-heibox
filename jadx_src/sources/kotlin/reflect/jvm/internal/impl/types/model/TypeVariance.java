package kotlin.reflect.jvm.internal.impl.types.model;

import dl.d;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");


    @d
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    @d
    public String toString() {
        return this.presentation;
    }
}
