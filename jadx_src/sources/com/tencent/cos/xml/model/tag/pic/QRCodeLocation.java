package com.tencent.cos.xml.model.tag.pic;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "CodeLocation")
public class QRCodeLocation {

    @XmlElement(name = "CodeLocation")
    public List<QRCodePoint> points;

    public QRCodeLocation() {
    }

    public QRCodeLocation(List<QRCodePoint> list) {
        this.points = list;
    }
}
