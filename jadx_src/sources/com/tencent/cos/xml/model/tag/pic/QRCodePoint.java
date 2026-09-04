package com.tencent.cos.xml.model.tag.pic;

import android.graphics.Point;
import androidx.annotation.p0;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "Point")
public class QRCodePoint {

    @XmlElement(name = "Point")
    public String point;

    public QRCodePoint() {
    }

    public QRCodePoint(String str) {
        this.point = str;
    }

    @p0
    public Point point() {
        String[] strArrSplit = this.point.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (strArrSplit.length == 2) {
            return new Point(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        }
        return null;
    }
}
