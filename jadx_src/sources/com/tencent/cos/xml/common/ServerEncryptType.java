package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes4.dex */
public enum ServerEncryptType {
    NONE("NONE"),
    SSE_C("SSE-C"),
    SSE_COS("SSE-COS"),
    SSE_KMS("SSE-KMS");

    private String type;

    ServerEncryptType(String str) {
        this.type = str;
    }

    public static ServerEncryptType fromString(String str) {
        for (ServerEncryptType serverEncryptType : values()) {
            if (serverEncryptType.type.equalsIgnoreCase(str)) {
                return serverEncryptType;
            }
        }
        return null;
    }

    public String getType() {
        return this.type;
    }
}
