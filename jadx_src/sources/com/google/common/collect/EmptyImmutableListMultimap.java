package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(serializable = true)
@u
public class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final EmptyImmutableListMultimap f57197j = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.v(), 0);
    }

    private Object e0() {
        return f57197j;
    }
}
