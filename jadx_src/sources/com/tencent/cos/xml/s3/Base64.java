package com.tencent.cos.xml.s3;

import com.tencent.qcloud.core.logger.QCloudLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public enum Base64 {
    ;

    private static final Base64Codec codec = new Base64Codec();
    private static final boolean isJaxbAvailable;

    static {
        boolean z10;
        try {
            Class.forName("javax.xml.bind.DatatypeConverter");
            z10 = true;
        } catch (Exception unused) {
            z10 = false;
        }
        isJaxbAvailable = z10;
        if (z10) {
            new HashMap().put("org.apache.ws.jaxme.impl.JAXBContextImpl", "Apache JaxMe");
        } else {
            QCloudLogger.w("S3", "JAXB is unavailable. Will fallback to SDK implementation which may be less performant.If you are using Java 9+, you will need to include javax.xml.bind:jaxb-api as a dependency.", new Object[0]);
        }
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length()];
        return codec.decode(bArr, CodecUtils.sanitize(str, bArr));
    }

    public static byte[] decode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.decode(bArr, bArr.length);
    }

    public static byte[] encode(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : codec.encode(bArr);
    }

    public static String encodeAsString(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? "" : CodecUtils.toStringDirect(codec.encode(bArr));
    }
}
