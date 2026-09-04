package com.tencent.cos.xml.model.bucket;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.WebsiteConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class PutBucketWebsiteRequest extends BucketRequest {
    private WebsiteConfiguration websiteConfiguration;

    public PutBucketWebsiteRequest(String str) {
        super(str);
        this.websiteConfiguration = new WebsiteConfiguration();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "PUT";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put("website", null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return RequestBodySerializer.string("application/xml", XmlBuilder.buildWebsiteConfiguration(this.websiteConfiguration));
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e11);
        }
    }

    public void setErrorDocument(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.errorDocument == null) {
                websiteConfiguration.errorDocument = new WebsiteConfiguration.ErrorDocument();
            }
            this.websiteConfiguration.errorDocument.key = str;
        }
    }

    public void setIndexDocument(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.indexDocument == null) {
                websiteConfiguration.indexDocument = new WebsiteConfiguration.IndexDocument();
            }
            this.websiteConfiguration.indexDocument.suffix = str;
        }
    }

    public void setRedirectAllRequestTo(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.redirectAllRequestTo == null) {
                websiteConfiguration.redirectAllRequestTo = new WebsiteConfiguration.RedirectAllRequestTo();
            }
            this.websiteConfiguration.redirectAllRequestTo.protocol = str;
        }
    }

    public void setRoutingRules(List<WebsiteConfiguration.RoutingRule> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
        if (websiteConfiguration.routingRules == null) {
            websiteConfiguration.routingRules = new ArrayList();
        }
        Iterator<WebsiteConfiguration.RoutingRule> it = list.iterator();
        while (it.hasNext()) {
            this.websiteConfiguration.routingRules.add(it.next());
        }
    }
}
