package com.tencent.ugc.videobase.filter;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.PerspectiveTransformMatrixCalculator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUImagePerspectiveCorrectionFilter extends TXCGPUImageFilter {
    public static final String DISTORTION_CORRECTION_FILTER_FRAGMENT_SHADER = "precision highp float;\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform mat3 matrix;\n\nvoid main()\n{\n  float cv_y = 1.0 - textureCoordinate.y;\n  float denominator = matrix[0][2] * textureCoordinate.x + matrix[1][2] * cv_y + matrix[2][2];\n  vec2 dst_coords;\n  dst_coords.x = matrix[0][0] * textureCoordinate.x + matrix[1][0] * cv_y + matrix[2][0];\n  dst_coords.y = matrix[0][1] * textureCoordinate.x + matrix[1][1] * cv_y + matrix[2][1];\n  dst_coords.x = dst_coords.x / denominator;\n  dst_coords.y = 1.0 - (dst_coords.y / denominator);\n  gl_FragColor = texture2D(inputImageTexture, dst_coords);\n}\n";
    private static final String TAG = "TXCGPUImageDistortionCorrectionFilter";
    private float[] mTransformMatrix3x3;
    private int mUniformTransformMatrix;

    public TXCGPUImagePerspectiveCorrectionFilter() {
        super(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, DISTORTION_CORRECTION_FILTER_FRAGMENT_SHADER);
    }

    static /* synthetic */ void lambda$setTransformPoints$0(TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter, List list, List list2) {
        float[] perspectiveTransformMatrix = PerspectiveTransformMatrixCalculator.getPerspectiveTransformMatrix(list, list2);
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                fArr[(i11 * 3) + i10] = perspectiveTransformMatrix[(i10 * 3) + i11];
            }
        }
        tXCGPUImagePerspectiveCorrectionFilter.mTransformMatrix3x3 = fArr;
    }

    private void setTransformPoints(List<PointF> list, List<PointF> list2) {
        runOnDraw(a.a(this, list2, list));
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void beforeDrawArrays(int i10) {
        super.beforeDrawArrays(i10);
        float[] fArr = this.mTransformMatrix3x3;
        if (fArr == null) {
            fArr = GLConstants.f100237a;
        }
        GLES20.glUniformMatrix3fv(this.mUniformTransformMatrix, 1, false, fArr, 0);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mUniformTransformMatrix = GLES20.glGetUniformLocation(getProgramId(), "matrix");
    }

    public void setPerspectiveCorrectionPoints(List<PointF> list, List<PointF> list2) {
        if (list == null || list.size() != 4 || list2 == null || list2.size() != 4) {
            return;
        }
        setTransformPoints(list, list2);
    }
}
