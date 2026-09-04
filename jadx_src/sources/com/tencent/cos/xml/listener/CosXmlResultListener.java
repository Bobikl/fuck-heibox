package com.tencent.cos.xml.listener;

import androidx.annotation.p0;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;

/* JADX INFO: loaded from: classes4.dex */
public interface CosXmlResultListener {
    void onFail(CosXmlRequest cosXmlRequest, @p0 CosXmlClientException cosXmlClientException, @p0 CosXmlServiceException cosXmlServiceException);

    void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);
}
