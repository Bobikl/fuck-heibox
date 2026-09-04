package com.tencent.beacon.event.open;

/* JADX INFO: loaded from: classes4.dex */
public final class EventResult {
    public static final int ERROR_CODE_NAME_NULL = 106;
    public static final int ERROR_CODE_NOT_ENABLE = 102;
    public static final int ERROR_CODE_OFFER_FAIL = 103;
    public static final int ERROR_CODE_OTHER = 199;
    public static final int ERROR_CODE_PREVENT = 100;
    public static final int ERROR_CODE_SAMPLE = 101;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_PARAMS_LONG = 105;
    public String errMsg;
    public int errorCode;
    public long eventID;

    public static final class a {
        public static EventResult a(int i10) {
            switch (i10) {
                case 100:
                    return new EventResult(i10, -1L, "not allowed in strategy (false).");
                case 101:
                    return new EventResult(i10, -1L, "sampled by svr rate (false).");
                case 102:
                    return new EventResult(i10, -1L, "event report not enable!");
                case 103:
                    return new EventResult(i10, -1L, "insert event to db error!");
                case 104:
                default:
                    return null;
                case 105:
                    return new EventResult(i10, -1L, "event params length > 45K!");
                case 106:
                    return new EventResult(i10, -1L, "event code isEmpty!");
            }
        }

        public static EventResult a(long j10) {
            return new EventResult(0, j10, null);
        }
    }

    public EventResult(int i10, long j10, String str) {
        this.errorCode = i10;
        this.eventID = j10;
        this.errMsg = str;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }
}
