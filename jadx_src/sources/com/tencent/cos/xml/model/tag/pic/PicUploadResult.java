package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "UploadResult")
public class PicUploadResult {

    @XmlElement(name = "OriginalInfo")
    public PicOriginalInfo originalInfo;

    @XmlElement(name = "ProcessResults")
    public List<PicObject> processResults;
}
