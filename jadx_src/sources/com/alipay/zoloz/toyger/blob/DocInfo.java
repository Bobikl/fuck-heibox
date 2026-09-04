package com.alipay.zoloz.toyger.blob;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DocInfo {
    public String docType;
    public Rect faceRect;
    public List<DocFieldInfo> fields;
    public int pageNo;
    public List<Point> region;

    public DocInfo() {
    }

    public DocInfo(String str, int i10, List<Point> list, List<DocFieldInfo> list2, Rect rect) {
        this.docType = str;
        this.pageNo = i10;
        this.region = list;
        this.fields = list2;
        this.faceRect = rect;
    }
}
