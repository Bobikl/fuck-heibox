package com.tencent.cos.xml.utils;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class CloseUtil {
    public static void closeQuietly(Closeable closeable) throws CosXmlClientException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), e10);
            }
        }
    }
}
