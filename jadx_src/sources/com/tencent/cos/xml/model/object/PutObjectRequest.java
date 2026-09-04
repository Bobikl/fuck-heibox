package com.tencent.cos.xml.model.object;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.n0;
import com.tencent.cos.xml.CosXmlSimpleService;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.tencent.cos.xml.common.COSStorageClass;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.crypto.ObjectMetadata;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.cos.xml.model.tag.pic.PicOperations;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import com.tencent.qcloud.core.util.ContextHolder;
import com.tencent.qcloud.core.util.QCloudUtils;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PutObjectRequest extends UploadRequest implements TransferRequest {
    private byte[] data;
    private long fileLength;
    private InputStream inputStream;
    private ObjectMetadata metadata;
    private CosXmlProgressListener progressListener;
    private String srcPath;
    private String strData;
    private Uri uri;
    private URL url;
    private UrlUploadPolicy urlUploadPolicy;

    protected PutObjectRequest(String str, String str2) {
        super(str, str2);
        setNeedMD5(true);
    }

    public PutObjectRequest(String str, String str2, Uri uri) {
        this(str, str2);
        this.uri = uri;
    }

    public PutObjectRequest(String str, String str2, InputStream inputStream) {
        this(str, str2);
        this.inputStream = inputStream;
    }

    public PutObjectRequest(String str, String str2, String str3) {
        this(str, str2);
        this.srcPath = str3;
    }

    public PutObjectRequest(String str, String str2, StringBuilder sb2) {
        this(str, str2);
        this.strData = sb2.toString();
    }

    public PutObjectRequest(String str, String str2, URL url) {
        this(str, str2);
        this.url = url;
        setNeedMD5(false);
    }

    public PutObjectRequest(String str, String str2, byte[] bArr) {
        this(str, str2);
        this.data = bArr;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        Context appContext;
        super.checkParameters();
        String str = this.srcPath;
        if (str == null && this.data == null && this.inputStream == null && this.strData == null && this.uri == null && this.url == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "Data Source must not be null");
        }
        if (str != null && !new File(this.srcPath).exists()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "upload file does not exist");
        }
        if (this.uri != null && (appContext = ContextHolder.getAppContext()) != null && !QCloudUtils.doesUriFileExist(this.uri, appContext.getContentResolver())) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "upload file does not exist");
        }
        ObjectMetadata objectMetadata = this.metadata;
        if (objectMetadata != null) {
            Map<String, Object> rawMetadata = objectMetadata.getRawMetadata();
            Map<String, String> userMetadata = this.metadata.getUserMetadata();
            for (Map.Entry<String, Object> entry : rawMetadata.entrySet()) {
                addHeader(entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry<String, String> entry2 : userMetadata.entrySet()) {
                addHeader(entry2.getKey(), entry2.getValue());
            }
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public long getFileLength() {
        if (this.srcPath != null) {
            this.fileLength = new File(this.srcPath).length();
        } else {
            byte[] bArr = this.data;
            if (bArr != null) {
                this.fileLength = bArr.length;
            } else {
                String str = this.strData;
                if (str != null) {
                    this.fileLength = str.getBytes().length;
                }
            }
        }
        return this.fileLength;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "PUT";
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        if (this.srcPath != null) {
            return RequestBodySerializer.file(getContentType(), new File(this.srcPath));
        }
        if (this.data != null) {
            return RequestBodySerializer.bytes(getContentType(), this.data);
        }
        if (this.inputStream != null) {
            return RequestBodySerializer.stream(getContentType(), new File(CosXmlSimpleService.appCachePath, String.valueOf(System.currentTimeMillis())), this.inputStream);
        }
        if (this.strData != null) {
            return RequestBodySerializer.bytes(getContentType(), this.strData.getBytes());
        }
        if (this.url != null) {
            return RequestBodySerializer.url(getContentType(), this.url);
        }
        if (this.uri == null || ContextHolder.getAppContext() == null) {
            return null;
        }
        return RequestBodySerializer.uri(getContentType(), this.uri, ContextHolder.getAppContext());
    }

    public String getSrcPath() {
        return this.srcPath;
    }

    public String getStrData() {
        return this.strData;
    }

    public Uri getUri() {
        return this.uri;
    }

    public URL getUrl() {
        return this.url;
    }

    public UrlUploadPolicy getUrlUploadPolicy() {
        return this.urlUploadPolicy;
    }

    public boolean isPriorityLow() {
        return this.priority == 1;
    }

    public void setCacheControl(String str) {
        if (str == null) {
            return;
        }
        addHeader("Cache-Control", str);
    }

    public void setContentDisposition(String str) {
        if (str == null) {
            return;
        }
        addHeader("Content-Disposition", str);
    }

    public void setContentEncodeing(String str) {
        if (str == null) {
            return;
        }
        addHeader("Content-Encoding", str);
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExpires(String str) {
        if (str == null) {
            return;
        }
        addHeader("Expires", str);
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    public void setPicOperations(@n0 PicOperations picOperations) {
        addHeader("Pic-Operations", picOperations.toJsonStr());
    }

    public void setPriorityLow() {
        this.priority = 1;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setSrcPath(String str) {
        this.srcPath = str;
    }

    public void setStrData(String str) {
        this.strData = str;
    }

    public void setStroageClass(COSStorageClass cOSStorageClass) {
        addHeader("x-cos-storage-class", cOSStorageClass.getStorageClass());
    }

    @Override // com.tencent.cos.xml.model.object.TransferRequest
    public void setTrafficLimit(long j10) {
        addHeader(Headers.COS_TRAFFIC_LIMIT, String.valueOf(j10));
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setUrlUploadPolicy(UrlUploadPolicy urlUploadPolicy) {
        this.urlUploadPolicy = urlUploadPolicy;
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader("x-cos-acl", cosacl.getAcl());
        }
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader("x-cos-acl", str);
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(COSRequestHeaderKey.X_COS_GRANT_READ, aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(COSRequestHeaderKey.X_COS_GRANT_WRITE, aCLAccount.getAccount());
        }
    }

    public void setXCOSMeta(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        addHeader(str, str2);
    }

    public void setXCOSReadWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(COSRequestHeaderKey.X_COS_GRANT_FULL_CONTROL, aCLAccount.getAccount());
        }
    }
}
