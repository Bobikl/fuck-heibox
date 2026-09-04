package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public final class UsingToStringOrdering extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final UsingToStringOrdering f58039d = new UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    private UsingToStringOrdering() {
    }

    private Object H() {
        return f58039d;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
