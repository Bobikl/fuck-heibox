package com.tencent.cos.xml.listener;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;

/* JADX INFO: loaded from: classes4.dex */
public interface CosXmlResultSimpleListener {
    void onFail(CosXmlClientException cosXmlClientException, CosXmlServiceException cosXmlServiceException);

    void onSuccess();
}
