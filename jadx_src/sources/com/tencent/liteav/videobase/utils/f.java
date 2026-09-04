package com.tencent.liteav.videobase.utils;

import com.tencent.liteav.videobase.frame.PixelFrame;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<PixelFrame> f100435a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100436b = 1;

    public final PixelFrame a() {
        PixelFrame pixelFramePollFirst;
        synchronized (this) {
            pixelFramePollFirst = this.f100435a.pollFirst();
        }
        return pixelFramePollFirst;
    }
}
