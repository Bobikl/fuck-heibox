package com.ss.bytertc.base.media.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: compiled from: CameraSession.java */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m {
    public static VideoFrame.TextureBuffer a(TextureBufferImpl textureBufferImpl, boolean z10, int i10) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z10) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    public static int b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return CameraSession.UIDeviceOrientation.LandscapeRight.value();
        }
        if (rotation != 2) {
            return rotation != 3 ? CameraSession.UIDeviceOrientation.Portrait.value() : CameraSession.UIDeviceOrientation.LandscapeLeft.value();
        }
        return CameraSession.UIDeviceOrientation.PortraitUpsideDown.value();
    }
}
