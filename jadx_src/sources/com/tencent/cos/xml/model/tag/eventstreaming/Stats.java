package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public class Stats {
    private Long bytesProcessed;
    private Long bytesReturned;
    private Long bytesScanned;

    public Stats(Long l10, Long l11, Long l12) {
        this.bytesScanned = l10;
        this.bytesProcessed = l11;
        this.bytesReturned = l12;
    }

    public Long getBytesProcessed() {
        return this.bytesProcessed;
    }

    public Long getBytesReturned() {
        return this.bytesReturned;
    }

    public Long getBytesScanned() {
        return this.bytesScanned;
    }

    public void setBytesProcessed(Long l10) {
        this.bytesProcessed = l10;
    }

    public void setBytesReturned(Long l10) {
        this.bytesReturned = l10;
    }

    public void setBytesScanned(Long l10) {
        this.bytesScanned = l10;
    }

    public Stats withBytesProcessed(Long l10) {
        setBytesProcessed(l10);
        return this;
    }

    public Stats withBytesReturned(Long l10) {
        setBytesReturned(l10);
        return this;
    }

    public Stats withBytesScanned(Long l10) {
        setBytesScanned(l10);
        return this;
    }
}
