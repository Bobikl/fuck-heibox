package com.ss.bytertc.engine.type;

import anet.channel.util.ErrorConstant;
import com.ss.android.ttvecamera.o;

/* JADX INFO: loaded from: classes4.dex */
public enum SetRoomExtraInfoResult {
    SUCCESS(0),
    NOT_JOIN_ROOM(-1),
    KEY_IS_NULL(-2),
    VALUE_IS_NULL(-3),
    UNKNOW(-99),
    KEY_IS_EMPTY(ErrorConstant.ERROR_CONN_TIME_OUT),
    TOO_OFTEN(-406),
    SILENT_USER(o.f97676g0),
    KEY_TOO_LONG(o.f97678h0),
    VALUE_TOO_LONG(o.f97680i0),
    SERVER_ERROR(o.J0);

    private final int value;

    SetRoomExtraInfoResult() {
        this.value = 0;
    }

    SetRoomExtraInfoResult(int i10) {
        this.value = i10;
    }

    public static SetRoomExtraInfoResult fromId(int i10) {
        for (SetRoomExtraInfoResult setRoomExtraInfoResult : values()) {
            if (setRoomExtraInfoResult.value() == i10) {
                return setRoomExtraInfoResult;
            }
        }
        return UNKNOW;
    }

    public int value() {
        return this.value;
    }
}
