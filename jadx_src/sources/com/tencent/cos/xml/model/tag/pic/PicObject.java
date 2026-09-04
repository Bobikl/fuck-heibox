package com.tencent.cos.xml.model.tag.pic;

import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Object")
public class PicObject {

    @XmlElement(name = "ETag")
    public String etag;

    @XmlElement(name = "Format")
    public String format;

    @XmlElement(name = "Height")
    public int height;

    @XmlElement(name = "Key")
    public String key;

    @XmlElement(name = "Location")
    public String location;

    @XmlElement(name = "Quality")
    public int quality;

    @XmlElement(name = "Size")
    public int size;

    @XmlElement(name = c.f58864t1)
    public int width;

    public PicObject() {
    }

    public PicObject(String str, String str2, String str3, int i10, int i11, int i12, int i13) {
        this.key = str;
        this.location = str2;
        this.format = str3;
        this.width = i10;
        this.height = i11;
        this.size = i12;
        this.quality = i13;
    }
}
