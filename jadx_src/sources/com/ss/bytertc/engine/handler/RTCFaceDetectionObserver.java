package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.InternalExpressDetectInfo;
import com.ss.bytertc.engine.InternalRectangle;
import com.ss.bytertc.engine.video.ExpressionDetectInfo;
import com.ss.bytertc.engine.video.ExpressionDetectResult;
import com.ss.bytertc.engine.video.FaceDetectionResult;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.RTCVideoEffect;
import com.ss.bytertc.engine.video.Rectangle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class RTCFaceDetectionObserver {
    private static final String TAG = "RTCFaceDetectionObserver";
    private WeakReference<RTCVideoEffect> mVideoEffect;

    public RTCFaceDetectionObserver(RTCVideoEffect rTCVideoEffect) {
        this.mVideoEffect = new WeakReference<>(rTCVideoEffect);
    }

    @CalledByNative
    void OnExpressionDetectResult(int i10, int i11, InternalExpressDetectInfo[] internalExpressDetectInfoArr) {
        RTCVideoEffect rTCVideoEffect;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        IFaceDetectionObserver faceDetectionObserver = (weakReference == null || (rTCVideoEffect = weakReference.get()) == null) ? null : rTCVideoEffect.getFaceDetectionObserver();
        if (faceDetectionObserver == null) {
            return;
        }
        ExpressionDetectResult expressionDetectResult = new ExpressionDetectResult();
        expressionDetectResult.detectResult = i10;
        if (i10 != 0 || internalExpressDetectInfoArr == null || i11 <= 0) {
            expressionDetectResult.detectInfo = null;
        } else {
            expressionDetectResult.detectInfo = new ExpressionDetectInfo[i11];
            expressionDetectResult.faceCount = i11;
            for (int i12 = 0; i12 < i11; i12++) {
                InternalExpressDetectInfo internalExpressDetectInfo = internalExpressDetectInfoArr[i12];
                expressionDetectResult.detectInfo[i12] = new ExpressionDetectInfo(internalExpressDetectInfo.age, internalExpressDetectInfo.boyProb, internalExpressDetectInfo.attractive, internalExpressDetectInfo.happyScore, internalExpressDetectInfo.sadScore, internalExpressDetectInfo.angryScore, internalExpressDetectInfo.surpriseScore, internalExpressDetectInfo.arousal, internalExpressDetectInfo.valence);
            }
        }
        faceDetectionObserver.onExpressionDetectResult(expressionDetectResult);
    }

    @CalledByNative
    void OnFaceDetectResult(int i10, int i11, int i12, int i13, InternalRectangle[] internalRectangleArr, long j10) {
        RTCVideoEffect rTCVideoEffect;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        IFaceDetectionObserver faceDetectionObserver = (weakReference == null || (rTCVideoEffect = weakReference.get()) == null) ? null : rTCVideoEffect.getFaceDetectionObserver();
        if (faceDetectionObserver == null) {
            return;
        }
        FaceDetectionResult faceDetectionResult = new FaceDetectionResult();
        faceDetectionResult.imageWidth = i11;
        faceDetectionResult.imageHeight = i12;
        faceDetectionResult.frameTimestampUs = j10;
        faceDetectionResult.detectResult = i10;
        if (internalRectangleArr == null || internalRectangleArr.length <= 0) {
            faceDetectionResult.faces = null;
        } else {
            faceDetectionResult.faces = new Rectangle[internalRectangleArr.length];
            for (int i14 = 0; i14 < i13; i14++) {
                Rectangle[] rectangleArr = faceDetectionResult.faces;
                InternalRectangle internalRectangle = internalRectangleArr[i14];
                rectangleArr[i14] = new Rectangle(internalRectangle.f97932x, internalRectangle.f97933y, internalRectangle.width, internalRectangle.height);
            }
        }
        faceDetectionObserver.onFaceDetectResult(faceDetectionResult);
    }
}
