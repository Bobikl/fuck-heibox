package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PreviewDocumentInHtmlLinkResult extends CosXmlResult {
    private String previewUrl;

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(HttpResponse httpResponse) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(httpResponse);
        try {
            String strString = httpResponse.string();
            if (TextUtils.isEmpty(strString)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strString);
            if (jSONObject.has("PreviewUrl")) {
                this.previewUrl = jSONObject.getString("PreviewUrl");
            }
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
        }
    }
}
