package com.tencent.cos.xml.model.tag.eventstreaming;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class CSVInput implements Serializable, Cloneable {
    private Boolean allowQuotedRecordDelimiter;
    private String comments;
    private String fieldDelimiter;
    private String fileHeaderInfo;
    private String quoteCharacter;
    private String quoteEscapeCharacter;
    private String recordDelimiter;

    public CSVInput(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.recordDelimiter = str;
        this.fieldDelimiter = str2;
        this.quoteCharacter = str3;
        this.quoteEscapeCharacter = str4;
        this.allowQuotedRecordDelimiter = bool;
        this.fileHeaderInfo = str5;
        this.comments = str6;
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

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CSVInput m48clone() {
        try {
            return (CSVInput) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CSVInput)) {
            return false;
        }
        CSVInput cSVInput = (CSVInput) obj;
        if ((cSVInput.getFileHeaderInfo() == null) ^ (getFileHeaderInfo() == null)) {
            return false;
        }
        if (cSVInput.getFileHeaderInfo() != null && !cSVInput.getFileHeaderInfo().equals(getFileHeaderInfo())) {
            return false;
        }
        if ((cSVInput.getQuoteEscapeCharacterAsString() == null) ^ (getQuoteEscapeCharacterAsString() == null)) {
            return false;
        }
        if (cSVInput.getQuoteEscapeCharacterAsString() != null && !cSVInput.getQuoteEscapeCharacterAsString().equals(getQuoteEscapeCharacterAsString())) {
            return false;
        }
        if ((cSVInput.getCommentsAsString() == null) ^ (getCommentsAsString() == null)) {
            return false;
        }
        if (cSVInput.getCommentsAsString() != null && !cSVInput.getCommentsAsString().equals(getCommentsAsString())) {
            return false;
        }
        if ((cSVInput.getRecordDelimiterAsString() == null) ^ (getRecordDelimiterAsString() == null)) {
            return false;
        }
        if (cSVInput.getRecordDelimiterAsString() != null && !cSVInput.getRecordDelimiterAsString().equals(getRecordDelimiterAsString())) {
            return false;
        }
        if ((cSVInput.getFieldDelimiterAsString() == null) ^ (getFieldDelimiterAsString() == null)) {
            return false;
        }
        if (cSVInput.getFieldDelimiterAsString() != null && !cSVInput.getFieldDelimiterAsString().equals(getFieldDelimiterAsString())) {
            return false;
        }
        if ((cSVInput.getQuoteCharacterAsString() == null) ^ (getQuoteCharacterAsString() == null)) {
            return false;
        }
        if (cSVInput.getQuoteCharacterAsString() == null || cSVInput.getQuoteCharacterAsString().equals(getQuoteCharacterAsString())) {
            return cSVInput.getAllowQuotedRecordDelimiter() == null || cSVInput.getAllowQuotedRecordDelimiter().equals(getAllowQuotedRecordDelimiter());
        }
        return false;
    }

    public Boolean getAllowQuotedRecordDelimiter() {
        return this.allowQuotedRecordDelimiter;
    }

    public Character getComments() {
        return stringToChar(this.comments);
    }

    public String getCommentsAsString() {
        return this.comments;
    }

    public Character getFieldDelimiter() {
        return stringToChar(this.fieldDelimiter);
    }

    public String getFieldDelimiterAsString() {
        return this.fieldDelimiter;
    }

    public String getFileHeaderInfo() {
        return this.fileHeaderInfo;
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

    public Character getRecordDelimiter() {
        return stringToChar(this.recordDelimiter);
    }

    public String getRecordDelimiterAsString() {
        return this.recordDelimiter;
    }

    public int hashCode() {
        return (((((((((((((getFileHeaderInfo() == null ? 0 : getFileHeaderInfo().hashCode()) + 31) * 31) + (getCommentsAsString() == null ? 0 : getCommentsAsString().hashCode())) * 31) + (getQuoteEscapeCharacterAsString() == null ? 0 : getQuoteEscapeCharacterAsString().hashCode())) * 31) + (getRecordDelimiterAsString() == null ? 0 : getRecordDelimiterAsString().hashCode())) * 31) + (getFieldDelimiterAsString() == null ? 0 : getFieldDelimiterAsString().hashCode())) * 31) + (getQuoteCharacterAsString() != null ? getQuoteCharacterAsString().hashCode() : 0)) * 31) + (getAllowQuotedRecordDelimiter() != null ? getAllowQuotedRecordDelimiter().hashCode() : 0);
    }

    public void setAllowQuotedRecordDelimiter(Boolean bool) {
        this.allowQuotedRecordDelimiter = bool;
    }

    public void setComments(Character ch2) {
        setComments(charToString(ch2));
    }

    public void setComments(String str) {
        validateNotEmpty(str, "comments");
        this.comments = str;
    }

    public void setFieldDelimiter(Character ch2) {
        setFieldDelimiter(charToString(ch2));
    }

    public void setFieldDelimiter(String str) {
        validateNotEmpty(str, "fieldDelimiter");
        this.fieldDelimiter = str;
    }

    public void setFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo == null ? null : fileHeaderInfo.toString());
    }

    public void setFileHeaderInfo(String str) {
        this.fileHeaderInfo = str;
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
        if (getFileHeaderInfo() != null) {
            sb2.append("FileHeaderInfo: ");
            sb2.append(getFileHeaderInfo());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getCommentsAsString() != null) {
            sb2.append("Comments: ");
            sb2.append(getCommentsAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getQuoteEscapeCharacterAsString() != null) {
            sb2.append("QuoteEscapeCharacter: ");
            sb2.append(getQuoteEscapeCharacterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getRecordDelimiterAsString() != null) {
            sb2.append("RecordDelimiter: ");
            sb2.append(getRecordDelimiterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getFieldDelimiterAsString() != null) {
            sb2.append("FieldDelimiter: ");
            sb2.append(getFieldDelimiterAsString());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (getQuoteCharacterAsString() != null) {
            sb2.append("QuoteCharacter: ");
            sb2.append(getQuoteCharacterAsString());
        }
        if (getAllowQuotedRecordDelimiter() != null) {
            sb2.append("AllowQuotedRecordDelimiter: ");
            sb2.append(getAllowQuotedRecordDelimiter());
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }

    public CSVInput withAllowQuotedRecordDelimiter(Boolean bool) {
        setAllowQuotedRecordDelimiter(bool);
        return this;
    }

    public CSVInput withComments(Character ch2) {
        setComments(ch2);
        return this;
    }

    public CSVInput withComments(String str) {
        setComments(str);
        return this;
    }

    public CSVInput withFieldDelimiter(Character ch2) {
        setFieldDelimiter(ch2);
        return this;
    }

    public CSVInput withFieldDelimiter(String str) {
        setFieldDelimiter(str);
        return this;
    }

    public CSVInput withFileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
        setFileHeaderInfo(fileHeaderInfo);
        return this;
    }

    public CSVInput withFileHeaderInfo(String str) {
        setFileHeaderInfo(str);
        return this;
    }

    public CSVInput withQuoteCharacter(Character ch2) {
        setQuoteCharacter(ch2);
        return this;
    }

    public CSVInput withQuoteCharacter(String str) {
        setQuoteCharacter(str);
        return this;
    }

    public CSVInput withQuoteEscapeCharacter(Character ch2) {
        setQuoteEscapeCharacter(ch2);
        return this;
    }

    public CSVInput withQuoteEscapeCharacter(String str) {
        setQuoteEscapeCharacter(str);
        return this;
    }

    public CSVInput withRecordDelimiter(Character ch2) {
        setRecordDelimiter(ch2);
        return this;
    }

    public CSVInput withRecordDelimiter(String str) {
        setRecordDelimiter(str);
        return this;
    }
}
