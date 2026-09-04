package com.tencent.cos.xml.model.tag.eventstreaming;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes4.dex */
public final class CheckSums {
    private CheckSums() {
    }

    static void update(Checksum checksum, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr, 0, iRemaining);
            checksum.update(bArr, 0, iRemaining);
            return;
        }
        int iPosition = byteBuffer.position();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iLimit = byteBuffer.limit();
        checksum.update(byteBuffer.array(), iPosition + iArrayOffset, iLimit - iPosition);
        byteBuffer.position(iLimit);
    }
}
