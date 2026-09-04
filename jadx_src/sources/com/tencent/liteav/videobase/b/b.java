package com.tencent.liteav.videobase.b;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.e;
import com.tencent.liteav.videobase.utils.PerspectiveTransformMatrixCalculator;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImagePerspectiveCorrectionFilter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.tencent.liteav.videobase.a.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f100229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f100230i;

    public b() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, TXCGPUImagePerspectiveCorrectionFilter.DISTORTION_CORRECTION_FILTER_FRAGMENT_SHADER);
    }

    static /* synthetic */ void a(b bVar, List list, List list2) {
        float[] perspectiveTransformMatrix = PerspectiveTransformMatrixCalculator.getPerspectiveTransformMatrix(list, list2);
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                fArr[(i11 * 3) + i10] = perspectiveTransformMatrix[(i10 * 3) + i11];
            }
        }
        bVar.f100230i = fArr;
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i10) {
        super.a(i10);
        float[] fArr = this.f100230i;
        if (fArr == null) {
            fArr = GLConstants.f100237a;
        }
        GLES20.glUniformMatrix3fv(this.f100229h, 1, false, fArr, 0);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void b(e eVar) {
        super.b(eVar);
        this.f100229h = GLES20.glGetUniformLocation(this.f100222f, "matrix");
    }
}
