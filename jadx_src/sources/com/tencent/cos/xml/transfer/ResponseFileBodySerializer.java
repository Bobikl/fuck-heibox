package com.tencent.cos.xml.transfer;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResponse;
import com.tencent.qcloud.core.http.ResponseFileConverter;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseFileBodySerializer<T2> extends ResponseFileConverter<T2> {
    private GetObjectResult getObjectResult;

    public ResponseFileBodySerializer(GetObjectResult getObjectResult, Uri uri, ContentResolver contentResolver, long j10) {
        super(uri, contentResolver, j10);
        this.getObjectResult = getObjectResult;
    }

    public ResponseFileBodySerializer(GetObjectResult getObjectResult, String str, long j10) {
        super(str, j10);
        this.getObjectResult = getObjectResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseCOSXMLError(com.tencent.qcloud.core.http.HttpResponse r4) throws com.tencent.cos.xml.exception.CosXmlServiceException, com.tencent.cos.xml.exception.CosXmlClientException {
        /*
            r3 = this;
            int r0 = r4.code()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto Ld
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto Ld
            return
        Ld:
            java.lang.String r1 = r4.message()
            com.tencent.cos.xml.exception.CosXmlServiceException r2 = new com.tencent.cos.xml.exception.CosXmlServiceException
            r2.<init>(r1)
            r2.setStatusCode(r0)
            java.lang.String r0 = "x-cos-request-id"
            java.lang.String r0 = r4.header(r0)
            r2.setRequestId(r0)
            java.io.InputStream r4 = r4.byteStream()
            if (r4 == 0) goto L54
            com.tencent.cos.xml.model.tag.CosError r0 = new com.tencent.cos.xml.model.tag.CosError
            r0.<init>()
            com.tencent.cos.xml.transfer.XmlSlimParser.parseError(r4, r0)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            java.lang.String r4 = r0.code     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            r2.setErrorCode(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            java.lang.String r4 = r0.message     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            r2.setErrorMessage(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            java.lang.String r4 = r0.requestId     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            r2.setRequestId(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            java.lang.String r4 = r0.resource     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            r2.setServiceName(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L53
            goto L54
        L46:
            r4 = move-exception
            com.tencent.cos.xml.exception.CosXmlClientException r0 = new com.tencent.cos.xml.exception.CosXmlClientException
            com.tencent.cos.xml.common.ClientErrorCode r1 = com.tencent.cos.xml.common.ClientErrorCode.POOR_NETWORK
            int r1 = r1.getCode()
            r0.<init>(r1, r4)
            throw r0
        L53:
            throw r2
        L54:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cos.xml.transfer.ResponseFileBodySerializer.parseCOSXMLError(com.tencent.qcloud.core.http.HttpResponse):void");
    }

    @Override // com.tencent.qcloud.core.http.ResponseFileConverter, com.tencent.qcloud.core.http.ResponseBodyConverter
    public T2 convert(HttpResponse httpResponse) throws QCloudServiceException, QCloudClientException {
        parseCOSXMLError(httpResponse);
        this.getObjectResult.parseResponseBody(httpResponse);
        super.convert(httpResponse);
        return (T2) this.getObjectResult;
    }
}
