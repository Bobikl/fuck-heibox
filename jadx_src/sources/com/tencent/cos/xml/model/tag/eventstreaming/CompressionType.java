package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public enum CompressionType {
    NONE("NONE"),
    GZIP("GZIP"),
    BZIP2("BZIP2");

    private final String compressionType;

    CompressionType(String str) {
        this.compressionType = str;
    }

    public static CompressionType fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        for (CompressionType compressionType : values()) {
            if (compressionType.toString().equals(str)) {
                return compressionType;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.compressionType;
    }
}
