package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes4.dex */
public class Range {
    private long end;
    private long start;

    public Range(long j10) {
        this(j10, -1L);
    }

    public Range(long j10, long j11) {
        this.start = j10;
        this.end = j11;
    }

    public long getEnd() {
        return this.end;
    }

    public String getRange() {
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(this.start);
        long j10 = this.end;
        objArr[1] = j10 == -1 ? "" : String.valueOf(j10);
        return String.format("bytes=%s-%s", objArr);
    }

    public long getStart() {
        return this.start;
    }
}
