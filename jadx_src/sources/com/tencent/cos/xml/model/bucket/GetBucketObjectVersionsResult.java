package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.BeaconService;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.ListVersionResult;
import com.tencent.cos.xml.transfer.XmlParser;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class GetBucketObjectVersionsResult extends CosXmlResult {
    private static final String TAG = "GetBucketObjectVersionsResult";
    public ListVersionResult listVersionResult;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        this.listVersionResult = new ListVersionResult();
        try {
            XmlParser.parseGetBucketObjectVersionsResult(httpResponse.byteStream(), this.listVersionResult);
        } catch (IOException e10) {
            BeaconService.getInstance().reportError(TAG, e10);
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            BeaconService.getInstance().reportError(TAG, e11);
            e11.printStackTrace();
        }
    }
}
