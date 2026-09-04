package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "OriginalInfo")
public class PicOriginalInfo {

    @XmlElement(name = "ETag")
    public String etag;

    @XmlElement(name = "ImageInfo")
    public ImageInfo imageInfo;

    @XmlElement(name = "Key")
    public String key;

    @XmlElement(name = "Location")
    public String location;
}
