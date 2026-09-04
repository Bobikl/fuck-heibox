package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes4.dex */
public enum COSStorageClass {
    STANDARD("STANDARD"),
    STANDARD_IA("STANDARD_IA"),
    ARCHIVE("ARCHIVE"),
    DEEP_ARCHIVE("DEEP_ARCHIVE"),
    INTELLIGENT_TIERING("INTELLIGENT_TIERING"),
    MAZ_STANDARD("MAZ_STANDARD"),
    MAZ_STANDARD_IA("MAZ_STANDARD_IA"),
    MAZ_INTELLIGENT_TIERING("MAZ_INTELLIGENT_TIERING");

    private String cosStorageClass;

    COSStorageClass(String str) {
        this.cosStorageClass = str;
    }

    public static COSStorageClass fromString(String str) {
        for (COSStorageClass cOSStorageClass : values()) {
            if (cOSStorageClass.cosStorageClass.equalsIgnoreCase(str)) {
                return cOSStorageClass;
            }
        }
        return null;
    }

    public String getStorageClass() {
        return this.cosStorageClass;
    }
}
