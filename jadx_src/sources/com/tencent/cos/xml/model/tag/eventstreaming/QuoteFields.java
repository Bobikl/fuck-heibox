package com.tencent.cos.xml.model.tag.eventstreaming;

/* JADX INFO: loaded from: classes4.dex */
public enum QuoteFields {
    ALWAYS("ALWAYS"),
    ASNEEDED("ASNEEDED");

    private final String value;

    QuoteFields(String str) {
        this.value = str;
    }

    public static QuoteFields fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        for (QuoteFields quoteFields : values()) {
            if (quoteFields.toString().equals(str)) {
                return quoteFields;
            }
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
