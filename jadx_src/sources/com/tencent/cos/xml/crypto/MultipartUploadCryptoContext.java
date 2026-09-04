package com.tencent.cos.xml.crypto;

import androidx.annotation.b0;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MultipartUploadCryptoContext {
    private final String bucketName;
    private final ContentCryptoMaterial cekMaterial;
    private boolean hasFinalPartBeenSeen;
    private final String key;
    private Map<String, String> materialsDescription;

    @b0("this")
    private int partNumber;
    private volatile boolean partUploadInProgress;

    protected MultipartUploadCryptoContext(String str, String str2, ContentCryptoMaterial contentCryptoMaterial) {
        this.bucketName = str;
        this.key = str2;
        this.cekMaterial = contentCryptoMaterial;
    }

    void beginPartUpload(int i10) throws CosXmlClientException {
        if (i10 < 1) {
            throw new IllegalArgumentException("part number must be at least 1");
        }
        if (this.partUploadInProgress) {
            throw CosXmlClientException.internalException("Parts are required to be uploaded in series");
        }
        synchronized (this) {
            if (this.partUploadInProgress) {
                throw CosXmlClientException.internalException("Parts are required to be uploaded in series");
            }
            if (i10 - this.partNumber > 1) {
                throw CosXmlClientException.internalException("Parts are required to be uploaded in series (partNumber=" + this.partNumber + ", nextPartNumber=" + i10 + ")");
            }
            this.partNumber = i10;
            this.partUploadInProgress = true;
        }
    }

    void endPartUpload() {
        this.partUploadInProgress = false;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public CipherLite getCipherLite() {
        return this.cekMaterial.getCipherLite();
    }

    ContentCryptoMaterial getContentCryptoMaterial() {
        return this.cekMaterial;
    }

    public final String getKey() {
        return this.key;
    }

    public final Map<String, String> getMaterialsDescription() {
        return this.materialsDescription;
    }

    public final boolean hasFinalPartBeenSeen() {
        return this.hasFinalPartBeenSeen;
    }

    public final void setHasFinalPartBeenSeen(boolean z10) {
        this.hasFinalPartBeenSeen = z10;
    }

    public final void setMaterialsDescription(Map<String, String> map) {
        this.materialsDescription = map == null ? null : Collections.unmodifiableMap(new HashMap(map));
    }
}
