package com.tencent.mmkv;

/* JADX INFO: loaded from: classes4.dex */
public interface MMKVHandler {
    void mmkvLog(MMKVLogLevel mMKVLogLevel, String str, int i10, String str2, String str3);

    MMKVRecoverStrategic onMMKVCRCCheckFail(String str);

    MMKVRecoverStrategic onMMKVFileLengthError(String str);

    boolean wantLogRedirecting();
}
