package com.tencent.cos.xml.model.tag.eventstreaming;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class CSVOutput implements Serializable, Cloneable {
    private String fieldDelimiter;
    private String quoteCharacter;
    private String quoteEscapeCharacter;
    private String quoteFields;
    private String recordDelimiter;

    public CSVOutput(String str, String str2, String str3, String str4, String str5) {
        this.quoteFields = str;
        this.recordDelimiter = str2;
        this.fieldDelimiter = str3;
        this.quoteCharacter = str4;
        this.quoteEscapeCharacter = str5;
    }

    private String charToString(Character ch2) {
        if (ch2 == null) {
            return null;
        }
        return ch2.toString();
    }

    private Character stringToChar(String str) {
        if (str == null) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    private void validateNotEmpty(String str, String str2) {
        if ("".equals(str)) {
            throw new IllegalArgumentException(str2 + " must not be empty-string.");
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CSVOutput)) {
            return false;
        }
        CSVOutput cSVOutput = (CSVOutput) obj;
        if ((cSVOutput.getQuoteEscapeCharacterAsString() == null) ^ (getQuoteEscapeCharacterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getQuoteEscapeCharacterAsString() != null && !cSVOutput.getQuoteEscapeCharacterAsString().equals(getQuoteEscapeCharacterAsString())) {
            return false;
        }
        if ((cSVOutput.getQuoteFields() == null) ^ (getQuoteFields() == null)) {
            return false;
        }
        if (cSVOutput.getQuoteFields() != null && !cSVOutput.getQuoteFields().equals(getQuoteFields())) {
            return false;
        }
        if ((cSVOutput.getRecordDelimiterAsString() == null) ^ (getRecordDelimiterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getRecordDelimiterAsString() != null && !cSVOutput.getRecordDelimiterAsString().equals(getRecordDelimiterAsString())) {
            return false;
        }
        if ((cSVOutput.getFieldDelimiterAsString() == null) ^ (getFieldDelimiterAsString() == null)) {
            return false;
        }
        if (cSVOutput.getFieldDelimiterAsString() != null && !cSVOutput.getFieldDelimiterAsString().equals(getFieldDelimiterAsString())) {
            return false;
        }
        if ((cSVOutput.getQuoteCharacterAsString() == null) ^ (getQuoteCharacterAsString() == null)) {
            return false;
        }
        return cSVOutput.getQuoteCharacterAsString() == null || cSVOutput.getQuoteCharacterAsString().equals(getQuoteCharacterAsString());
    }

    public Character getFieldDelimiter() {
        return stringToChar(this.fieldDelimiter);
    }

    public String getFieldDelimiterAsString() {
        return this.fieldDelimiter;
    }

    public Character getQuoteCharacter() {
        return stringToChar(this.quoteCharacter);
    }

    public String getQuoteCharacterAsString() {
        return this.quoteCharacter;
    }

    public Character getQuoteEscapeCharacter() {
        return stringToChar(this.quoteEscapeCharacter);
    }

    public String getQuoteEscapeCharacterAsString() {
        return this.quoteEscapeCharacter;
    }

    public String getQuoteFields() {
        return this.quoteFields;
    }

    public Character getRecordDelimiter() {
        return stringToChar(this.recordDelimiter);
    }

    public String getRecordDelimiterAsString() {
        return this.recordDelimiter;
    }

    public int hashCode() {
        return (((((((((getQuoteFields() == null ? 0 : getQuoteFields().hashCode()) + 31) * 31) + (getQuoteEscapeCharacterAsString() == null ? 0 : getQuoteEscapeCharacterAsString().hashCode())) * 31) + (getRecordDelimiterAsString() == null ? 0 : getRecordDelimiterAsString().hashCode())) * 31) + (getFieldDelimiterAsString() == null ? 0 : getFieldDelimiterAsString().hashCode())) * 31) + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0);
    }

    public void setFieldDelimiter(Character ch2) {
        setFieldDelimiter(charToString(ch2));
    }

    public void setFieldDelimiter(String str) {
        validateNotEmpty(str, "fieldDelimiter");
        this.fieldDelimiter = str;
    }

    public void setQuoteCharacter(Character ch2) {
        setQuoteCharacter(charToString(ch2));
    }

    public void setQuoteCharacter(String str) {
        validateNotEmpty(str, "quoteCharacter");
        this.quoteCharacter = str;
    }

    public void setQuoteEscapeCharacter(Character ch2) {
        setQuoteEscapeCharacter(charToString(ch2));
    }

    public void setQuoteEscapeCharacter(String str) {
        validateNotEmpty(str, "quoteEscapeCharacter");
        this.quoteEscapeCharacter = str;
    }

    public void setQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields == null ? null : quoteFields.toString());
    }

    public void setQuoteFields(String str) {
        this.quoteFields = str;
    }

    public void setRecordDelimiter(Character ch2) {
        setRecordDelimiter(charToString(ch2));
    }

    public void setRecordDelimiter(String str) {
        validateNotEmpty(str, "recordDelimiter");
        this.recordDelimiter = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getQuoteFields() != null) {
            sb2.append("QuoteFields: ");
            sb2.append(getQuoteFields());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getQuoteEscapeCharacter() != null) {
            sb2.append("QuoteEscapeCharacter: ");
            sb2.append(getQuoteEscapeCharacterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getRecordDelimiter() != null) {
            sb2.append("RecordDelimiter: ");
            sb2.append(getRecordDelimiterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getFieldDelimiter() != null) {
            sb2.append("FieldDelimiter: ");
            sb2.append(getFieldDelimiterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getQuoteCharacter() != null) {
            sb2.append("QuoteCharacter: ");
            sb2.append(getQuoteCharacterAsString());
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }

    public CSVOutput withFieldDelimiter(Character ch2) {
        setFieldDelimiter(ch2);
        return this;
    }

    public CSVOutput withFieldDelimiter(String str) {
        setFieldDelimiter(str);
        return this;
    }

    public CSVOutput withQuoteCharacter(Character ch2) {
        setQuoteCharacter(ch2);
        return this;
    }

    public CSVOutput withQuoteCharacter(String str) {
        setQuoteCharacter(str);
        return this;
    }

    public CSVOutput withQuoteEscapeCharacter(Character ch2) {
        setQuoteEscapeCharacter(ch2);
        return this;
    }

    public CSVOutput withQuoteEscapeCharacter(String str) {
        setQuoteEscapeCharacter(str);
        return this;
    }

    public CSVOutput withQuoteFields(QuoteFields quoteFields) {
        setQuoteFields(quoteFields);
        return this;
    }

    public CSVOutput withQuoteFields(String str) {
        setQuoteFields(str);
        return this;
    }

    public CSVOutput withRecordDelimiter(Character ch2) {
        setRecordDelimiter(ch2);
        return this;
    }

    public CSVOutput withRecordDelimiter(String str) {
        setRecordDelimiter(str);
        return this;
    }
}
