package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "QRcodeInfo")
public class QRCodeInfo {

    @XmlElement(name = "CodeUrl")
    public String codeUrl;

    @XmlElement(name = "CodeLocation")
    public QRCodeLocation location;

    public QRCodeInfo() {
    }

    public QRCodeInfo(String str, QRCodeLocation qRCodeLocation) {
        this.codeUrl = str;
        this.location = qRCodeLocation;
    }
}
