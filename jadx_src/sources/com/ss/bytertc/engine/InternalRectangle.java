package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f97932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f97933y;

    public InternalRectangle(int i10, int i11, int i12, int i13) {
        this.f97932x = i10;
        this.f97933y = i11;
        this.width = i12;
        this.height = i13;
    }

    @CalledByNative
    public static InternalRectangle create(int i10, int i11, int i12, int i13) {
        return new InternalRectangle(i10, i11, i12, i13);
    }
}
