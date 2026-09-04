package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final EmptyImmutableSetMultimap f57198l = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.v(), 0, null);
    }

    private Object j0() {
        return f57198l;
    }
}
