package com.tencent.cos.xml.model.tag.pic;

import androidx.exifinterface.media.a;
import com.google.common.net.c;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "ImageInfo")
public class ImageInfo {

    @XmlElement(name = "Ave")
    public String ave;

    @XmlElement(name = "Format")
    public String format;

    @XmlElement(name = "Height")
    public int height;

    @XmlElement(name = a.C)
    public int orientation;

    @XmlElement(name = "Quality")
    public int quality;

    @XmlElement(name = c.f58864t1)
    public int width;
}
