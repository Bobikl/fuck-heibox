package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static Size a(List<Size> list, l lVar, int i10, int i11) {
        double d10;
        Size size = new Size(i10, i11);
        LiteavLog.i("CameraSupervisor", "preview wanted: " + size + " cameraRotation:" + lVar);
        if (list == null) {
            LiteavLog.e("CameraSupervisor", "findBestMatchedPreviewSize getPreviewSizes null");
            return size;
        }
        if (lVar == l.ROTATION_90 || lVar == l.ROTATION_270) {
            size.swap();
        }
        double dAspectRatio = size.aspectRatio();
        Size size2 = new Size(bb.c.b.f30883q9, bb.c.b.f30883q9);
        int i12 = size.width;
        int i13 = size2.width;
        if (i12 > i13 || size.height > size2.height) {
            int i14 = size.height;
            if (i12 > i14) {
                size2.height = (i13 * i14) / i12;
            } else {
                size2.width = (size2.height * i12) / i14;
            }
        } else {
            size2.set(size);
        }
        ArrayList<Size> arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        long j10 = Long.MAX_VALUE;
        for (Size size3 : list) {
            sb2.append(size3);
            sb2.append(", ");
            long jRound = (size3.width < size2.width || size3.height < size2.height) ? Long.MAX_VALUE : Math.round(Math.abs(size3.aspectRatio() - dAspectRatio) * 10.0d);
            if (jRound < j10) {
                arrayList.clear();
                arrayList.add(size3);
                j10 = jRound;
            } else if (jRound == j10) {
                arrayList.add(size3);
            }
        }
        LiteavLog.i("CameraSupervisor", "support preview size list: ".concat(String.valueOf(sb2)));
        Collections.sort(arrayList, c.a());
        Size size4 = (Size) arrayList.get(0);
        int area = size.getArea() * 1000;
        double dAbs = Double.MAX_VALUE;
        for (Size size5 : arrayList) {
            LiteavLog.i("CameraSupervisor", "size in same buck ".concat(String.valueOf(size5)));
            if (dAspectRatio > size5.aspectRatio()) {
                int i15 = size5.width;
                d10 = ((double) ((i15 * i15) * 1000)) / dAspectRatio;
            } else {
                int i16 = size5.height;
                d10 = ((double) (i16 * i16)) * dAspectRatio * 1000.0d;
            }
            double d11 = area;
            if (d10 / d11 >= 0.9d) {
                double d12 = d10 - d11;
                if (Math.abs(d12) < dAbs) {
                    dAbs = Math.abs(d12);
                    size4 = size5;
                }
            }
        }
        LiteavLog.i("CameraSupervisor", "best match preview size ".concat(String.valueOf(size4)));
        return new Size(size4.width, size4.height);
    }

    public static com.tencent.liteav.videoproducer.a.a a(com.tencent.liteav.videoproducer.a.a[] aVarArr, int i10, boolean z10) {
        if (aVarArr != null && aVarArr.length != 0) {
            int i11 = 0;
            for (com.tencent.liteav.videoproducer.a.a aVar : aVarArr) {
                LiteavLog.i("CameraSupervisor", "supported fps range: ".concat(String.valueOf(aVar)));
            }
            if (z10) {
                Arrays.sort(aVarArr, d.a());
                int length = aVarArr.length;
                while (i11 < length) {
                    com.tencent.liteav.videoproducer.a.a aVar2 = aVarArr[i11];
                    if (aVar2.f100678a >= i10) {
                        return aVar2;
                    }
                    i11++;
                }
            } else {
                Arrays.sort(aVarArr, e.a());
                int length2 = aVarArr.length;
                while (i11 < length2) {
                    com.tencent.liteav.videoproducer.a.a aVar3 = aVarArr[i11];
                    if (aVar3.f100678a <= i10 && i10 <= aVar3.f100679b) {
                        return aVar3;
                    }
                    i11++;
                }
            }
        }
        return null;
    }
}
