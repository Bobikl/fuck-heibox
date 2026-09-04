package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public enum FileHeaderInfo {
    USE("USE"),
    IGNORE("IGNORE"),
    NONE("NONE");

    private final String headerInfo;

    FileHeaderInfo(String str) {
        this.headerInfo = str;
    }

    public static FileHeaderInfo fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        for (FileHeaderInfo fileHeaderInfo : values()) {
            if (fileHeaderInfo.toString().equals(str)) {
                return fileHeaderInfo;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.headerInfo;
    }
}
