package com.tencent.cos.xml.model.ci;

import android.net.Uri;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.object.PutObjectRequest;
import com.tencent.cos.xml.model.tag.pic.PicOperations;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImageUploadRequest extends PutObjectRequest implements PicOperationProvider {
    public boolean isPicInfo;

    protected ImageUploadRequest(String str, String str2) {
        super(str, str2);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, Uri uri) {
        super(str, str2, uri);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, InputStream inputStream) {
        super(str, str2, inputStream);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, String str3) {
        super(str, str2, str3);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, StringBuilder sb2) {
        super(str, str2, sb2);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, URL url) {
        super(str, str2, url);
        this.isPicInfo = false;
    }

    public ImageUploadRequest(String str, String str2, byte[] bArr) {
        super(str, str2, bArr);
        this.isPicInfo = false;
    }

    private void buildPicOperations() {
        PicOperations picOperations = getPicOperations();
        if (picOperations != null) {
            setPicOperations(picOperations);
        }
    }

    @Override // com.tencent.cos.xml.model.object.PutObjectRequest, com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        buildPicOperations();
    }
}
