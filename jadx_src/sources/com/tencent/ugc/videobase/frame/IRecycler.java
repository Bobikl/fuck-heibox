package com.tencent.ugc.videobase.frame;

import com.tencent.ugc.videobase.frame.RefCounted;

/* JADX INFO: loaded from: classes4.dex */
public interface IRecycler<T extends RefCounted> {
    void recycle(T t10);
}
