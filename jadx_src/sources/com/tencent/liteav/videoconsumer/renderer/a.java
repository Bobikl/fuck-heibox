package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.liteav.base.util.Size;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f100550a = "PostProcessor_" + hashCode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Size f100551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.tencent.liteav.videobase.frame.e f100552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.tencent.liteav.videobase.b.b f100553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    FloatBuffer f100554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    FloatBuffer f100555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.tencent.liteav.videobase.frame.i f100556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Matrix f100557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<PointF> f100558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<PointF> f100559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f100560k;

    public a(com.tencent.liteav.videobase.frame.e eVar, int i10, int i11) {
        Size size = new Size();
        this.f100551b = size;
        this.f100560k = false;
        this.f100552c = eVar;
        size.set(i10, i11);
    }

    private static PointF a(PointF pointF, Matrix matrix) {
        if (matrix == null) {
            return pointF;
        }
        Matrix matrix2 = new Matrix();
        if (!matrix.invert(matrix2)) {
            return pointF;
        }
        float[] fArr = new float[2];
        matrix2.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }

    private List<PointF> a(List<PointF> list) {
        ArrayList arrayList = new ArrayList();
        for (PointF pointF : list) {
            float f10 = pointF.x;
            Size size = this.f100551b;
            PointF pointFA = a(new PointF(f10 * size.width, pointF.y * size.height), this.f100557h);
            float f11 = pointFA.x;
            Size size2 = this.f100551b;
            PointF pointF2 = new PointF(f11 / size2.width, pointFA.y / size2.height);
            pointF2.y = 1.0f - pointF2.y;
            arrayList.add(pointF2);
        }
        return arrayList;
    }

    final void a(List<PointF> list, List<PointF> list2) {
        if (list == null || list.size() != 4 || list2 == null || list2.size() != 4 || !this.f100551b.isValid() || this.f100553d == null) {
            return;
        }
        List<PointF> listA = a(list);
        List<PointF> listA2 = a(list2);
        com.tencent.liteav.videobase.b.b bVar = this.f100553d;
        if (listA.size() == 4 && listA2.size() == 4) {
            bVar.a(com.tencent.liteav.videobase.b.c.a(bVar, listA2, listA));
        }
    }
}
