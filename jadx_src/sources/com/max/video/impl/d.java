package com.max.video.impl;

import com.tencent.rtmp.TXBitrateItem;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TxBitrateInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends we.a {
    public d() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@dl.d TXBitrateItem src) {
        this();
        f0.p(src, "src");
        h(src.index);
        i(src.width);
        g(src.height);
        f(src.bitrate);
    }
}
