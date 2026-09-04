package com.tencent.liteav.videobase.utils;

import android.content.Intent;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.utils.MemoryAllocator;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.b.a f100432a = new com.tencent.liteav.base.b.a(1000);

    private static synchronized void a(String str) {
        if (f100432a.a()) {
            LiteavLog.e("MemoryAllocator", "allocate buffer failed with oom error, msg:".concat(String.valueOf(str)));
            c.a().a(new Intent(MemoryAllocator.OUT_OF_MEMORY_ACTION));
        }
    }

    public static byte[] a(int i10) {
        try {
            return new byte[i10];
        } catch (OutOfMemoryError e10) {
            a(e10.getMessage());
            return null;
        }
    }

    public static ByteBuffer b(int i10) {
        try {
            return ByteBuffer.allocateDirect(i10);
        } catch (OutOfMemoryError e10) {
            a(e10.getMessage());
            return null;
        }
    }
}
