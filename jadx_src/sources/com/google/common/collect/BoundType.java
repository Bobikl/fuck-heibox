package com.google.common.collect;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z10) {
        this.inclusive = z10;
    }

    static BoundType forBoolean(boolean z10) {
        return z10 ? CLOSED : OPEN;
    }
}
