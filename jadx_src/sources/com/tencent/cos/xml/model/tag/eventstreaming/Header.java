package com.tencent.cos.xml.model.tag.eventstreaming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Header {
    private final String name;
    private final HeaderValue value;

    Header(String str, HeaderValue headerValue) {
        this.name = str;
        this.value = headerValue;
    }

    Header(String str, String str2) {
        this(str, HeaderValue.fromString(str2));
    }

    static Header decode(ByteBuffer byteBuffer) {
        String shortString;
        try {
            shortString = Utils.readShortString(byteBuffer);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            shortString = null;
        }
        return new Header(shortString, HeaderValue.decode(byteBuffer));
    }

    static void encode(Map.Entry<String, HeaderValue> entry, DataOutputStream dataOutputStream) throws IOException {
        new Header(entry.getKey(), entry.getValue()).encode(dataOutputStream);
    }

    void encode(DataOutputStream dataOutputStream) throws IOException {
        Utils.writeShortString(dataOutputStream, this.name);
        this.value.encode(dataOutputStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        if (this.name.equals(header.name)) {
            return this.value.equals(header.value);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public HeaderValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Header{name='" + this.name + "', value=" + this.value + '}';
    }
}
