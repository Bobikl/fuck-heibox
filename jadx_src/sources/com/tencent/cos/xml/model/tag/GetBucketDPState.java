package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Response")
public class GetBucketDPState {

    @XmlElement
    public BucketDocumentPreviewState DocBucketList;

    @XmlElement
    public String RequestId;
}
