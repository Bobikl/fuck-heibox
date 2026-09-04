package com.tencent.cos.xml.model.object;

import android.text.TextUtils;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.Delete;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tools.ant.taskdefs.optional.j2ee.c;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteMultiObjectRequest extends ObjectRequest {
    private Delete delete;

    public DeleteMultiObjectRequest(String str) {
        super(str, null);
        Delete delete = new Delete();
        this.delete = delete;
        delete.deleteObjects = new ArrayList();
    }

    public DeleteMultiObjectRequest(String str, List<String> list) {
        super(str, null);
        Delete delete = new Delete();
        this.delete = delete;
        delete.deleteObjects = new ArrayList();
        setObjectList(list);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        if (this.requestURL != null) {
            return;
        }
        if (this.bucket == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "bucket must not be null");
        }
        if (this.delete.deleteObjects.size() == 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "object（null or empty) is invalid");
        }
    }

    public Delete getDelete() {
        return this.delete;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, "/");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(c.f135155a, null);
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", XmlBuilder.buildDelete(this.delete));
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        STSCredentialScope[] sTSCredentialScopeArr = new STSCredentialScope[this.delete.deleteObjects.size()];
        Iterator<Delete.DeleteObject> it = this.delete.deleteObjects.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sTSCredentialScopeArr[i10] = new STSCredentialScope("name/cos:DeleteObject", cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), it.next().key);
            i10++;
        }
        return sTSCredentialScopeArr;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setObjectList(String str) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Delete.DeleteObject deleteObject = new Delete.DeleteObject();
        deleteObject.key = str;
        this.delete.deleteObjects.add(deleteObject);
    }

    public void setObjectList(String str, String str2) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Delete.DeleteObject deleteObject = new Delete.DeleteObject();
        deleteObject.key = str;
        if (str2 != null) {
            deleteObject.versionId = str2;
        }
        this.delete.deleteObjects.add(deleteObject);
    }

    public void setObjectList(List<String> list) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Delete.DeleteObject deleteObject = new Delete.DeleteObject();
                String str = list.get(i10);
                if (!TextUtils.isEmpty(str)) {
                    if (str.startsWith("/")) {
                        deleteObject.key = str.substring(1);
                    } else {
                        deleteObject.key = str;
                    }
                    this.delete.deleteObjects.add(deleteObject);
                }
            }
        }
    }

    public void setObjectList(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Delete.DeleteObject deleteObject = new Delete.DeleteObject();
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (key.startsWith("/")) {
                        deleteObject.key = key.substring(1);
                    } else {
                        deleteObject.key = key;
                    }
                    if (value != null) {
                        deleteObject.versionId = value;
                    }
                    this.delete.deleteObjects.add(deleteObject);
                }
            }
        }
    }

    public void setQuiet(boolean z10) {
        this.delete.quiet = z10;
    }
}
