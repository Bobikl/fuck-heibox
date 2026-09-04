package com.xiaomi.push;

import com.max.xiaoheihe.bean.BizMessageObj;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class gw extends gq {
    public gw() {
        a(BizMessageObj.TYPE_PING, (String) null);
        a("0");
        a(0);
    }

    @Override // com.xiaomi.push.gq
    /* JADX INFO: renamed from: a */
    ByteBuffer mo416a(ByteBuffer byteBuffer) {
        return m419a().length == 0 ? byteBuffer : super.mo416a(byteBuffer);
    }

    @Override // com.xiaomi.push.gq
    public int c() {
        if (m419a().length == 0) {
            return 0;
        }
        return super.c();
    }
}
