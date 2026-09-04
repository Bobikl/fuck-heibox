package com.tencent.cos.xml.model.bucket;

import android.text.TextUtils;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.InventoryConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import d4.d;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PutBucketInventoryRequest extends BucketRequest {
    private static Pattern pattern = Pattern.compile("[a-zA-Z0-9-_.]+");
    private InventoryConfiguration inventoryConfiguration;

    public PutBucketInventoryRequest(String str) {
        super(str);
        InventoryConfiguration inventoryConfiguration = new InventoryConfiguration();
        this.inventoryConfiguration = inventoryConfiguration;
        inventoryConfiguration.isEnabled = true;
        inventoryConfiguration.f99465id = d.f108133a;
        inventoryConfiguration.schedule = new InventoryConfiguration.Schedule();
        this.inventoryConfiguration.destination = new InventoryConfiguration.Destination();
        this.inventoryConfiguration.destination.cosBucketDestination = new InventoryConfiguration.COSBucketDestination();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        String str = this.inventoryConfiguration.f99465id;
        if (str == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "inventoryId == null");
        }
        if (!pattern.matcher(str).find()) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "inventoryId must be in [a-zA-Z0-9-_.]");
        }
        InventoryConfiguration inventoryConfiguration = this.inventoryConfiguration;
        if (inventoryConfiguration.includedObjectVersions == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "includedObjectVersions == null");
        }
        if (inventoryConfiguration.schedule.frequency == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "schedule.frequency == null");
        }
        InventoryConfiguration.COSBucketDestination cOSBucketDestination = inventoryConfiguration.destination.cosBucketDestination;
        if (cOSBucketDestination.bucket == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "cosBucketDestination.bucket == null");
        }
        if (cOSBucketDestination.format == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "cosBucketDestination.format == null");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "PUT";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("inventory", null);
        this.queryParameters.put("id", this.inventoryConfiguration.f99465id);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", XmlBuilder.buildInventoryConfiguration(this.inventoryConfiguration));
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e11);
        }
    }

    public void isEnable(boolean z10) {
        this.inventoryConfiguration.isEnabled = z10;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setDestination(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.format = str;
        }
        if (str2 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.accountId = str2;
        }
        if (str3 != null && str4 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.bucket = "qcs::cos:" + str4 + "::" + str3;
        }
        if (str5 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.prefix = str5;
        }
        this.inventoryConfiguration.destination.cosBucketDestination.encryption = new InventoryConfiguration.Encryption();
        this.inventoryConfiguration.destination.cosBucketDestination.encryption.sSECOS = "";
    }

    public void setFilter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.inventoryConfiguration.filter = new InventoryConfiguration.Filter();
        this.inventoryConfiguration.filter.prefix = str;
    }

    public void setIncludedObjectVersions(InventoryConfiguration.IncludedObjectVersions includedObjectVersions) {
        if (includedObjectVersions != null) {
            this.inventoryConfiguration.includedObjectVersions = includedObjectVersions.getDesc();
        }
    }

    public void setInventoryId(String str) {
        this.inventoryConfiguration.f99465id = str;
    }

    public void setOptionalFields(InventoryConfiguration.Field field) {
        if (field != null) {
            InventoryConfiguration inventoryConfiguration = this.inventoryConfiguration;
            if (inventoryConfiguration.optionalFields == null) {
                inventoryConfiguration.optionalFields = new InventoryConfiguration.OptionalFields();
                this.inventoryConfiguration.optionalFields.fields = new HashSet(6);
            }
            this.inventoryConfiguration.optionalFields.fields.add(field.getValue());
        }
    }

    public void setScheduleFrequency(String str) {
        if (str != null) {
            this.inventoryConfiguration.schedule.frequency = str;
        }
    }
}
