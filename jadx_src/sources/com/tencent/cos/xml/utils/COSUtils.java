package com.tencent.cos.xml.utils;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;

/* JADX INFO: loaded from: classes4.dex */
public class COSUtils {
    public static Exception mergeException(CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException) {
        return cosXmlClientException != null ? cosXmlClientException : cosXmlServiceException;
    }
}
