package com.tencent.cos.xml.model.tag;

/* JADX INFO: loaded from: classes4.dex */
public class UrlUploadPolicy {
    private final Type downloadType;
    private final long fileLength;

    public enum Type {
        NOTSUPPORT,
        RANGE,
        ENTIRETY
    }

    public UrlUploadPolicy(Type type, long j10) {
        this.downloadType = type;
        this.fileLength = j10;
    }

    public Type getDownloadType() {
        return this.downloadType;
    }

    public long getFileLength() {
        return this.fileLength;
    }
}
