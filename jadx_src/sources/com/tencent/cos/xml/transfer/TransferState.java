package com.tencent.cos.xml.transfer;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public enum TransferState {
    CONSTRAINED,
    WAITING,
    IN_PROGRESS,
    PAUSED,
    RESUMED_WAITING,
    COMPLETED,
    CANCELED,
    FAILED,
    UNKNOWN;

    private static final Map<String, TransferState> MAP = new HashMap();

    static {
        for (TransferState transferState : values()) {
            MAP.put(transferState.toString(), transferState);
        }
    }

    public static TransferState getState(String str) {
        Map<String, TransferState> map = MAP;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
