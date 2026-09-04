package com.tencent.ugc.videobase.utils;

import android.content.Intent;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MemoryAllocator {
    public static final String OUT_OF_MEMORY_ACTION = "com.tencent.liteav.video.action.OUT_OF_MEMORY";
    private static final String TAG = "MemoryAllocator";
    private static final com.tencent.liteav.base.b.a THROTTLER = new com.tencent.liteav.base.b.a(1000);

    public static byte[] allocateByteArray(int i10) {
        try {
            return new byte[i10];
        } catch (OutOfMemoryError e10) {
            notifyOutOfMemory(e10.getMessage());
            return null;
        }
    }

    public static ByteBuffer allocateDirectBuffer(int i10) {
        try {
            return ByteBuffer.allocateDirect(i10);
        } catch (OutOfMemoryError e10) {
            notifyOutOfMemory(e10.getMessage());
            return null;
        }
    }

    private static synchronized void notifyOutOfMemory(String str) {
        if (THROTTLER.a()) {
            LiteavLog.e(TAG, "allocate buffer failed with oom error, msg:".concat(String.valueOf(str)));
            LocalBroadcastManager.getInstance().sendBroadcast(new Intent(OUT_OF_MEMORY_ACTION));
        }
    }
}
