package com.tencent.cos.xml.model.tag.eventstreaming;

import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class InputSerialization {
    private String compressionType;
    private CSVInput csv;
    private JSONInput json;
    private ParquetInput parquet;

    public InputSerialization(CompressionType compressionType, CSVInput cSVInput) {
        this.csv = cSVInput;
        this.compressionType = compressionType.toString();
    }

    public InputSerialization(CompressionType compressionType, JSONInput jSONInput) {
        this.compressionType = compressionType.toString();
        this.json = jSONInput;
    }

    public InputSerialization(String str, CSVInput cSVInput) {
        this.csv = cSVInput;
        this.compressionType = str;
    }

    public InputSerialization(String str, JSONInput jSONInput) {
        this.compressionType = str;
        this.json = jSONInput;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InputSerialization m49clone() {
        try {
            return (InputSerialization) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InputSerialization)) {
            return false;
        }
        InputSerialization inputSerialization = (InputSerialization) obj;
        if ((inputSerialization.getCsv() == null) ^ (getCsv() == null)) {
            return false;
        }
        if (inputSerialization.getCsv() != null && !inputSerialization.getCsv().equals(getCsv())) {
            return false;
        }
        if ((inputSerialization.getJson() == null) ^ (getJson() == null)) {
            return false;
        }
        if (inputSerialization.getJson() != null && !inputSerialization.getJson().equals(getJson())) {
            return false;
        }
        if ((inputSerialization.getCompressionType() == null) ^ (getCompressionType() == null)) {
            return false;
        }
        return inputSerialization.getCompressionType() == null || inputSerialization.getCompressionType().equals(getCompressionType());
    }

    public String getCompressionType() {
        return this.compressionType;
    }

    public CSVInput getCsv() {
        return this.csv;
    }

    public JSONInput getJson() {
        return this.json;
    }

    public ParquetInput getParquet() {
        return this.parquet;
    }

    public int hashCode() {
        return (((((getCsv() == null ? 0 : getCsv().hashCode()) + 31) * 31) + (getJson() == null ? 0 : getJson().hashCode())) * 31) + (getCompressionType() != null ? getCompressionType().hashCode() : 0);
    }

    public void setCompressionType(CompressionType compressionType) {
        setCompressionType(compressionType == null ? null : compressionType.toString());
    }

    public void setCompressionType(String str) {
        this.compressionType = str;
    }

    public void setCsv(CSVInput cSVInput) {
        this.csv = cSVInput;
    }

    public void setJson(JSONInput jSONInput) {
        this.json = jSONInput;
    }

    public void setParquet(ParquetInput parquetInput) {
        this.parquet = parquetInput;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCsv() != null) {
            sb2.append("Csv: ");
            sb2.append(getCsv());
        }
        if (getJson() != null) {
            sb2.append("Json: ");
            sb2.append(getJson());
        }
        if (getCompressionType() != null) {
            sb2.append("CompressionType: ");
            sb2.append(getCompressionType());
        }
        sb2.append(g.f141884d);
        return sb2.toString();
    }

    public InputSerialization withCompressionType(CompressionType compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    public InputSerialization withCompressionType(String str) {
        setCompressionType(str);
        return this;
    }

    public InputSerialization withCsv(CSVInput cSVInput) {
        setCsv(cSVInput);
        return this;
    }

    public InputSerialization withJson(JSONInput jSONInput) {
        setJson(jSONInput);
        return this;
    }

    public InputSerialization withParquet(ParquetInput parquetInput) {
        setParquet(parquetInput);
        return this;
    }
}
