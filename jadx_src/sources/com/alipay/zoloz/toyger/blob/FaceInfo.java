package com.alipay.zoloz.toyger.blob;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FaceInfo {
    public float confidence;
    public String feaVersion;
    public String feature;
    public List<Point> points;
    public float quality;
    public Rect rect;

    public FaceInfo() {
    }

    public FaceInfo(Rect rect, List<Point> list, float f10, float f11, String str, String str2) {
        this.rect = rect;
        this.points = list;
        this.confidence = f10;
        this.quality = f11;
        this.feature = str;
        this.feaVersion = str2;
    }
}
