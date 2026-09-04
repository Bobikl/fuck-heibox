package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public enum JSONType {
    DOCUMENT("DOCUMENT"),
    LINES("LINES");

    private final String jsonType;

    JSONType(String str) {
        this.jsonType = str;
    }

    public static JSONType fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        for (JSONType jSONType : values()) {
            if (jSONType.toString().equals(str)) {
                return jSONType;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.jsonType;
    }
}
