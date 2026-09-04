package com.huawei.hms.core.aidl;

/* JADX INFO: loaded from: classes7.dex */
public final class CodecLookup {
    private CodecLookup() {
    }

    public static MessageCodec find(int i10) {
        return i10 == 2 ? new MessageCodecV2() : new MessageCodec();
    }
}
