package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Response")
public class PutBucketDPState {

    @XmlElement
    public BucketDocumentPreviewState DocBucket;

    @XmlElement
    public String RequestId;
}
