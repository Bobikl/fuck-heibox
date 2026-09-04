package com.ss.android.ttvecamera;

import android.annotation.TargetApi;
import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TEPlane.java */
/* JADX INFO: loaded from: classes8.dex */
@TargetApi(19)
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Image.Plane[] f97836a;

    public r() {
    }

    public r(Image.Plane[] planeArr) {
        this.f97836a = planeArr;
    }

    public ByteBuffer a(int i10) {
        Image.Plane[] planeArr = this.f97836a;
        if (planeArr == null || planeArr.length <= i10) {
            return null;
        }
        return planeArr[i10].getBuffer();
    }

    public Image.Plane[] b() {
        return this.f97836a;
    }
}
