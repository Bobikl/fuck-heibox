package com.tencent.cos.xml.model.object;

import android.net.Uri;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class GetObjectRequest extends ObjectRequest implements TransferRequest {
    private Uri fileContentUri;
    private long fileOffset;
    private CosXmlProgressListener progressListener;
    private Range range;
    private String rspCacheControl;
    private String rspContentDisposition;
    private String rspContentEncoding;
    private String rspContentLanguage;
    private String rspContentType;
    private String rspExpires;
    private String saveFileName;
    private String savePath;
    private String versionId;

    public GetObjectRequest(String str, String str2, Uri uri) {
        super(str, str2);
        this.fileOffset = 0L;
        this.fileContentUri = uri;
    }

    public GetObjectRequest(String str, String str2, String str3) {
        super(str, str2);
        this.fileOffset = 0L;
        this.savePath = str3;
    }

    public GetObjectRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.fileOffset = 0L;
        this.savePath = str3;
        this.saveFileName = str4;
    }

    public String getDownloadPath() {
        String str;
        String str2 = this.savePath;
        if (str2 == null) {
            return null;
        }
        if (str2.endsWith("/")) {
            str = this.savePath;
        } else {
            str = this.savePath + "/";
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.saveFileName != null) {
            return str + this.saveFileName;
        }
        String str3 = this.cosPath;
        if (str3 == null) {
            return str;
        }
        int iLastIndexOf = str3.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            return str + this.cosPath.substring(iLastIndexOf + 1);
        }
        return str + this.cosPath;
    }

    public Uri getFileContentUri() {
        return this.fileContentUri;
    }

    public long getFileOffset() {
        return this.fileOffset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.versionId;
        if (str != null) {
            this.queryParameters.put("versionId", str);
        }
        String str2 = this.rspContentType;
        if (str2 != null) {
            this.queryParameters.put("response-content-type", str2);
        }
        String str3 = this.rspContentLanguage;
        if (str3 != null) {
            this.queryParameters.put("response-content-language", str3);
        }
        String str4 = this.rspExpires;
        if (str4 != null) {
            this.queryParameters.put("response-expires", str4);
        }
        String str5 = this.rspCacheControl;
        if (str5 != null) {
            this.queryParameters.put("response-cache-control", str5);
        }
        String str6 = this.rspContentDisposition;
        if (str6 != null) {
            this.queryParameters.put("response-content-disposition", str6);
        }
        String str7 = this.rspContentEncoding;
        if (str7 != null) {
            this.queryParameters.put("response-content-encoding", str7);
        }
        return super.getQueryString();
    }

    public Range getRange() {
        return this.range;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public String getRspCacheControl() {
        return this.rspCacheControl;
    }

    public String getRspContentDispositon() {
        return this.rspContentDisposition;
    }

    public String getRspContentEncoding() {
        return this.rspContentEncoding;
    }

    public String getRspContentLanguage() {
        return this.rspContentLanguage;
    }

    public String getRspContentType() {
        return this.rspContentType;
    }

    public String getRspExpires() {
        return this.rspExpires;
    }

    public String getSaveFileName() {
        return this.saveFileName;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public void setFileOffset(long j10) {
        if (j10 > 0) {
            this.fileOffset = j10;
        }
    }

    public void setIfMatch(String str) {
        if (str != null) {
            addHeader("If-Match", str);
        }
    }

    public void setIfModifiedSince(String str) {
        if (str != null) {
            addHeader("If-Modified-Since", str);
        }
    }

    public void setIfNONEMatch(String str) {
        if (str != null) {
            addHeader("If-None-Match", str);
        }
    }

    public void setIfUnmodifiedSince(String str) {
        if (str != null) {
            addHeader("If-Unmodified-Since", str);
        }
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setRange(long j10) {
        setRange(j10, -1L);
    }

    public void setRange(long j10, long j11) {
        if (j10 < 0) {
            j10 = 0;
        }
        Range range = new Range(j10, j11);
        addHeader("Range", range.getRange());
        this.range = range;
    }

    public void setRspCacheControl(String str) {
        this.rspCacheControl = str;
    }

    public void setRspContentDispositon(String str) {
        this.rspContentDisposition = str;
    }

    public void setRspContentEncoding(String str) {
        this.rspContentEncoding = str;
    }

    public void setRspContentLanguage(String str) {
        this.rspContentLanguage = str;
    }

    public void setRspContentType(String str) {
        this.rspContentType = str;
    }

    public void setRspExpires(String str) {
        this.rspExpires = str;
    }

    public void setSaveFileName(String str) {
        this.saveFileName = str;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    @Override // com.tencent.cos.xml.model.object.TransferRequest
    public void setTrafficLimit(long j10) {
        addHeader(Headers.COS_TRAFFIC_LIMIT, String.valueOf(j10));
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
