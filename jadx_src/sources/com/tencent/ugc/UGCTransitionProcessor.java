package com.tencent.ugc;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCTransitionProcessor {
    private final String TAG = "UGCTransitionProcessor";
    private final UGCCombineFrameFilter mCombineFrameFilter;
    private final int mOutputPixelHeight;
    private final int mOutputPixelWidth;

    public static class TXCCombineFrame {
        public PixelFrame drawInputFrame;
        public TXVideoEditConstants.TXAbsoluteRect drawRect;
        public TransformParams transformParams;
    }

    public static class TransformParams {
        public float scale = 1.0f;
        public int rotate = 0;
        public float alpha = 1.0f;
        public boolean isBackgroundTransparent = false;
    }

    public UGCTransitionProcessor(int i10, int i11, GLTexturePool gLTexturePool) {
        LiteavLog.i("UGCTransitionProcessor", "UGCTransitionProcessor pixelWidth = " + i10 + " pixelHeight = " + i11);
        this.mOutputPixelWidth = i10;
        this.mOutputPixelHeight = i11;
        this.mCombineFrameFilter = new UGCCombineFrameFilter(gLTexturePool);
    }

    private void Retain(List<PixelFrame> list) {
        for (PixelFrame pixelFrame : list) {
            if (pixelFrame != null) {
                pixelFrame.retain();
            }
        }
    }

    private GLTexture combineFramesWithTransitionType(List<TXCCombineFrame> list, long j10, int i10) {
        switch (i10) {
            case 1:
                return processTwoPicLeftRightCombine(list, j10);
            case 2:
                return processTwoPicUpDownCombine(list, j10);
            case 3:
                return processTwoPicRotation(list, j10);
            case 4:
            case 5:
                return processTwoPicZoom(list, j10, i10);
            case 6:
                return processTwoPicFaceInOut(list, j10);
            default:
                return null;
        }
    }

    private static float getAlpha(int i10, long j10) {
        long stayDurationMs = UGCTransitionRules.getStayDurationMs(i10);
        long motionDurationMs = UGCTransitionRules.getMotionDurationMs(i10);
        long j11 = stayDurationMs + motionDurationMs;
        long j12 = j10 - ((j10 / j11) * j11);
        if (i10 != 4 && i10 != 5) {
            if (i10 == 6 && j12 > stayDurationMs && j12 <= j11) {
                return 1.0f - ((j12 - stayDurationMs) / motionDurationMs);
            }
            return 1.0f;
        }
        float f10 = stayDurationMs;
        float f11 = motionDurationMs;
        float f12 = f10 + (0.8f * f11);
        float f13 = j12;
        if (f13 <= f12 || j12 > j11) {
            return 1.0f;
        }
        return 1.0f - ((f13 - f12) / (f11 * 0.2f));
    }

    private static float getCropOffset(int i10, long j10) {
        long stayDurationMs = UGCTransitionRules.getStayDurationMs(i10);
        long motionDurationMs = UGCTransitionRules.getMotionDurationMs(i10);
        long j11 = stayDurationMs + motionDurationMs;
        long j12 = j10 - ((j10 / j11) * j11);
        if (j12 < 0 || j12 > stayDurationMs) {
            return (j12 - stayDurationMs) / motionDurationMs;
        }
        return 0.0f;
    }

    private TXVideoEditConstants.TXAbsoluteRect getFirstDrawRect(int i10, int i11) {
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = new TXVideoEditConstants.TXAbsoluteRect();
        int i12 = this.mOutputPixelWidth;
        tXAbsoluteRect.width = i12;
        int i13 = this.mOutputPixelHeight;
        tXAbsoluteRect.height = i13;
        float f10 = i10;
        float f11 = i11;
        if (f10 / f11 >= i12 / i13) {
            float f12 = (i12 * i11) / f10;
            tXAbsoluteRect.f103210x = 0;
            tXAbsoluteRect.f103211y = ((int) (i13 - f12)) / 2;
            tXAbsoluteRect.height = (int) f12;
        } else {
            float f13 = (i13 * i10) / f11;
            tXAbsoluteRect.f103210x = ((int) (i12 - f13)) / 2;
            tXAbsoluteRect.f103211y = 0;
            tXAbsoluteRect.width = (int) f13;
        }
        return tXAbsoluteRect;
    }

    private static int getRotation(int i10, long j10) {
        if (i10 != 3) {
            return 0;
        }
        long stayDurationMs = UGCTransitionRules.getStayDurationMs(i10);
        long motionDurationMs = UGCTransitionRules.getMotionDurationMs(i10);
        long j11 = stayDurationMs + motionDurationMs;
        long j12 = j10 - ((j10 / j11) * j11);
        if (j12 <= stayDurationMs || j12 > j11) {
            return 0;
        }
        return (int) (((j12 - stayDurationMs) / motionDurationMs) * 360.0f);
    }

    private static float getScale(int i10, long j10) {
        long stayDurationMs = UGCTransitionRules.getStayDurationMs(i10);
        long motionDurationMs = UGCTransitionRules.getMotionDurationMs(i10);
        long j11 = stayDurationMs + motionDurationMs;
        long j12 = j10 - ((j10 / j11) * j11);
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 == 5) {
                    if (j12 >= 0 && j12 <= stayDurationMs) {
                        return 1.1f;
                    }
                    if (j12 > stayDurationMs && j12 <= j11) {
                        return 1.1f - (((j12 - stayDurationMs) * 0.1f) / motionDurationMs);
                    }
                }
            } else if (j12 > stayDurationMs && j12 < j11) {
                return (((j12 - stayDurationMs) * 0.1f) / motionDurationMs) + 1.0f;
            }
        } else if (j12 > stayDurationMs && j12 <= j11) {
            return 1.0f - ((j12 - stayDurationMs) / motionDurationMs);
        }
        return 1.0f;
    }

    private TXVideoEditConstants.TXAbsoluteRect getSecondDrawRect(int i10, int i11, int i12) {
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = new TXVideoEditConstants.TXAbsoluteRect();
        int i13 = this.mOutputPixelWidth;
        tXAbsoluteRect.width = i13;
        int i14 = this.mOutputPixelHeight;
        tXAbsoluteRect.height = i14;
        float f10 = i10;
        float f11 = i11;
        if (f10 / f11 >= i13 / i14) {
            float f12 = (i11 * i13) / f10;
            if (i12 == 1) {
                tXAbsoluteRect.f103210x = i13;
            } else {
                tXAbsoluteRect.f103210x = 0;
            }
            if (i12 == 2) {
                tXAbsoluteRect.f103211y = i14 + (((int) (i14 - f12)) / 2);
            } else {
                tXAbsoluteRect.f103211y = ((int) (i14 - f12)) / 2;
            }
            tXAbsoluteRect.height = (int) f12;
        } else {
            float f13 = (i10 * i14) / f11;
            if (i12 == 1) {
                tXAbsoluteRect.f103210x = i13 + (((int) (i13 - f13)) / 2);
            } else {
                tXAbsoluteRect.f103210x = ((int) (i13 - f13)) / 2;
            }
            if (i12 == 2) {
                tXAbsoluteRect.f103211y = i14;
            } else {
                tXAbsoluteRect.f103211y = 0;
            }
            tXAbsoluteRect.width = (int) f13;
        }
        return tXAbsoluteRect;
    }

    private GLTexture processTwoPicFaceInOut(List<TXCCombineFrame> list, long j10) {
        float alpha = getAlpha(6, j10);
        TXCCombineFrame tXCCombineFrame = list.get(0);
        TransformParams transformParams = new TransformParams();
        tXCCombineFrame.transformParams = transformParams;
        transformParams.alpha = alpha;
        if (list.size() > 1) {
            TXCCombineFrame tXCCombineFrame2 = list.get(1);
            TransformParams transformParams2 = new TransformParams();
            tXCCombineFrame2.transformParams = transformParams2;
            transformParams2.alpha = 1.0f - alpha;
        }
        this.mCombineFrameFilter.setCanvasSize(this.mOutputPixelWidth, this.mOutputPixelHeight);
        this.mCombineFrameFilter.setCropRect(null);
        return this.mCombineFrameFilter.combineFrame(list);
    }

    private GLTexture processTwoPicLeftRightCombine(List<TXCCombineFrame> list, long j10) {
        int cropOffset = (int) (getCropOffset(1, j10) * this.mOutputPixelWidth);
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = new TXVideoEditConstants.TXAbsoluteRect();
        tXAbsoluteRect.f103210x = cropOffset;
        int i10 = this.mOutputPixelWidth;
        tXAbsoluteRect.width = i10;
        int i11 = this.mOutputPixelHeight;
        tXAbsoluteRect.height = i11;
        this.mCombineFrameFilter.setCanvasSize(i10 * 2, i11);
        this.mCombineFrameFilter.setCropRect(tXAbsoluteRect);
        return this.mCombineFrameFilter.combineFrame(list);
    }

    private GLTexture processTwoPicRotation(List<TXCCombineFrame> list, long j10) {
        TXCCombineFrame tXCCombineFrame;
        int rotation = getRotation(3, j10);
        float scale = getScale(3, j10);
        TXCCombineFrame tXCCombineFrame2 = list.get(0);
        TransformParams transformParams = new TransformParams();
        tXCCombineFrame2.transformParams = transformParams;
        transformParams.rotate = rotation;
        transformParams.scale = scale;
        transformParams.isBackgroundTransparent = true;
        if (list.size() > 1) {
            tXCCombineFrame = list.get(1);
            tXCCombineFrame.transformParams = new TransformParams();
        } else {
            tXCCombineFrame = null;
        }
        if (rotation != 0) {
            tXCCombineFrame2.transformParams.isBackgroundTransparent = true;
            if (tXCCombineFrame != null) {
                tXCCombineFrame.transformParams.isBackgroundTransparent = true;
            }
        } else {
            tXCCombineFrame2.transformParams.alpha = 1.0f;
            if (tXCCombineFrame != null) {
                tXCCombineFrame.transformParams.alpha = 0.0f;
            }
        }
        this.mCombineFrameFilter.setCanvasSize(this.mOutputPixelWidth, this.mOutputPixelHeight);
        this.mCombineFrameFilter.setCropRect(null);
        return this.mCombineFrameFilter.combineFrame(list);
    }

    private GLTexture processTwoPicUpDownCombine(List<TXCCombineFrame> list, long j10) {
        int cropOffset = (int) (getCropOffset(2, j10) * this.mOutputPixelHeight);
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = new TXVideoEditConstants.TXAbsoluteRect();
        tXAbsoluteRect.f103211y = cropOffset;
        int i10 = this.mOutputPixelWidth;
        tXAbsoluteRect.width = i10;
        int i11 = this.mOutputPixelHeight;
        tXAbsoluteRect.height = i11;
        this.mCombineFrameFilter.setCanvasSize(i10, i11 * 2);
        this.mCombineFrameFilter.setCropRect(tXAbsoluteRect);
        return this.mCombineFrameFilter.combineFrame(list);
    }

    private GLTexture processTwoPicZoom(List<TXCCombineFrame> list, long j10, int i10) {
        float scale = getScale(i10, j10);
        float alpha = getAlpha(i10, j10);
        TXCCombineFrame tXCCombineFrame = list.get(0);
        TransformParams transformParams = new TransformParams();
        tXCCombineFrame.transformParams = transformParams;
        transformParams.scale = scale;
        transformParams.alpha = alpha;
        if (list.size() > 1) {
            TXCCombineFrame tXCCombineFrame2 = list.get(1);
            TransformParams transformParams2 = new TransformParams();
            tXCCombineFrame2.transformParams = transformParams2;
            if (i10 == 5) {
                transformParams2.scale = 1.1f;
            }
            transformParams2.alpha = 1.0f - alpha;
        }
        this.mCombineFrameFilter.setCanvasSize(this.mOutputPixelWidth, this.mOutputPixelHeight);
        this.mCombineFrameFilter.setCropRect(null);
        return this.mCombineFrameFilter.combineFrame(list);
    }

    private void releaseFrameList(List<TXCCombineFrame> list) {
        Iterator<TXCCombineFrame> it = list.iterator();
        while (it.hasNext()) {
            PixelFrame pixelFrame = it.next().drawInputFrame;
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
    }

    public PixelFrame processFrame(List<PixelFrame> list, int i10) {
        if (list == null || list.size() == 0) {
            LiteavLog.e("UGCTransitionProcessor", "frameList is empty");
            return null;
        }
        Retain(list);
        ArrayList arrayList = new ArrayList();
        TXCCombineFrame tXCCombineFrame = new TXCCombineFrame();
        PixelFrame pixelFrame = list.get(0);
        tXCCombineFrame.drawInputFrame = pixelFrame;
        tXCCombineFrame.drawRect = getFirstDrawRect(pixelFrame.getWidth(), tXCCombineFrame.drawInputFrame.getHeight());
        arrayList.add(tXCCombineFrame);
        if (list.size() > 1) {
            TXCCombineFrame tXCCombineFrame2 = new TXCCombineFrame();
            PixelFrame pixelFrame2 = list.get(1);
            tXCCombineFrame2.drawInputFrame = pixelFrame2;
            tXCCombineFrame2.drawRect = getSecondDrawRect(pixelFrame2.getWidth(), tXCCombineFrame2.drawInputFrame.getHeight(), i10);
            arrayList.add(tXCCombineFrame2);
        }
        long timestamp = list.get(0).getTimestamp();
        GLTexture gLTextureCombineFramesWithTransitionType = combineFramesWithTransitionType(arrayList, timestamp, i10);
        releaseFrameList(arrayList);
        if (gLTextureCombineFramesWithTransitionType == null) {
            return null;
        }
        PixelFrame pixelFrameWrap = gLTextureCombineFramesWithTransitionType.wrap(list.get(0).getGLContext());
        pixelFrameWrap.setTimestamp(timestamp);
        gLTextureCombineFramesWithTransitionType.release();
        return pixelFrameWrap;
    }

    public void release() {
        this.mCombineFrameFilter.release();
    }
}
