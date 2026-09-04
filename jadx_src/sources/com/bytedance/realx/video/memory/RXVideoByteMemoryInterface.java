package com.bytedance.realx.video.memory;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface RXVideoByteMemoryInterface extends RXVideoMemoryInterface {
    int getNumberOfPlanes();

    ByteBuffer getPlaneData(int i10);

    int getPlaneLineSize(int i10);
}
