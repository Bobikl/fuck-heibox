package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.model.tag.pic.ImageInfo;
import com.tencent.cos.xml.model.tag.pic.PicObject;
import com.tencent.cos.xml.model.tag.pic.PicOriginalInfo;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "CompleteMultipartUploadResult")
public class CompleteMultipartUploadResult {

    @XmlElement(name = "ETag")
    public String eTag;

    @XmlElement(name = "ImageInfo")
    public ImageInfo imageInfo;

    @XmlElement(name = "Key")
    public String key;

    @XmlElement(name = "Location")
    public String location;

    @XmlElement(name = "ProcessResults")
    public List<PicObject> processResults;

    public PicOriginalInfo getOriginInfo() {
        PicOriginalInfo picOriginalInfo = new PicOriginalInfo();
        picOriginalInfo.location = this.location;
        picOriginalInfo.key = this.key;
        picOriginalInfo.etag = this.eTag;
        picOriginalInfo.imageInfo = this.imageInfo;
        return picOriginalInfo;
    }

    public PicUploadResult getPicUploadResult() {
        PicUploadResult picUploadResult = new PicUploadResult();
        picUploadResult.processResults = this.processResults;
        picUploadResult.originalInfo = getOriginInfo();
        return picUploadResult;
    }
}
