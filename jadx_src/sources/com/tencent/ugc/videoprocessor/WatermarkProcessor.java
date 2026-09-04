package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.h;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.UGCLicenseChecker;
import com.tencent.ugc.UGCWatermarkFilter;
import com.tencent.ugc.beauty.gpufilters.WatermarkItem;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.DelayQueue;
import com.tencent.ugc.videoprocessor.util.BitmapUtils;
import com.tencent.ugc.videoprocessor.watermark.AnimatedPasterFilterChain;
import com.tencent.ugc.videoprocessor.watermark.PasterFilterChain;
import com.tencent.ugc.videoprocessor.watermark.SubtitleFilterChain;
import com.tencent.ugc.videoprocessor.watermark.TailWaterMarkChain;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPaster;
import com.tencent.ugc.videoprocessor.watermark.data.TailWaterMark;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WatermarkProcessor {
    private static final String TAG = "WatermarkProcessor";
    private GLTexturePool mGLTexturePool;
    private ArrayList<WatermarkItem> mLastWaterMarkList = new ArrayList<>();
    private int mRenderMode = 1;
    private DelayQueue mDelayQueue = new DelayQueue();
    private boolean mHasSetWaterMark = false;
    private boolean mIsReverse = false;
    private long mVideoDuration = 0;
    private Size mRenderTargetSize = null;
    private UGCWatermarkFilter mWatermarkFilter = new UGCWatermarkFilter();
    private SubtitleFilterChain mSubtitleFilterChain = new SubtitleFilterChain();
    private PasterFilterChain mPasterFilterChain = new PasterFilterChain();
    private AnimatedPasterFilterChain mAnimatedPasterFilterChain = new AnimatedPasterFilterChain();
    private TailWaterMarkChain mTailWaterMarkChain = new TailWaterMarkChain();

    private void collectWaterMarkFromAnimatedPaster(ArrayList<WatermarkItem> arrayList, PixelFrame pixelFrame) throws Throwable {
        Bitmap bitmapDecodeFile;
        List<AnimatedPaster> animatedPasterList = this.mAnimatedPasterFilterChain.getAnimatedPasterList();
        if (animatedPasterList == null || animatedPasterList.size() == 0) {
            this.mAnimatedPasterFilterChain.normalized(pixelFrame.getWidth(), pixelFrame.getHeight(), this.mRenderMode);
            animatedPasterList = this.mAnimatedPasterFilterChain.getAnimatedPasterList();
        }
        for (AnimatedPaster animatedPaster : animatedPasterList) {
            long timeInEffect = getTimeInEffect(pixelFrame);
            if (timeInEffect >= animatedPaster.mStartTime && timeInEffect <= animatedPaster.mEndTime && (bitmapDecodeFile = BitmapFactory.decodeFile(animatedPaster.mPasterPath)) != null) {
                float f10 = animatedPaster.mRotation;
                if (f10 == 0.0f) {
                    arrayList.add(newWaterMarkTag(bitmapDecodeFile, animatedPaster.mFrame));
                } else {
                    arrayList.add(newWaterMarkTag(BitmapUtils.rotateImage(f10, bitmapDecodeFile), animatedPaster.mFrame));
                }
            }
        }
    }

    private void collectWaterMarkFromStaticPaster(ArrayList<WatermarkItem> arrayList, PixelFrame pixelFrame) {
        List<TXVideoEditConstants.TXPaster> pasterList = this.mPasterFilterChain.getPasterList();
        if (pasterList == null || pasterList.size() == 0) {
            this.mPasterFilterChain.normalized(pixelFrame.getWidth(), pixelFrame.getHeight(), this.mRenderMode);
            pasterList = this.mPasterFilterChain.getPasterList();
        }
        for (TXVideoEditConstants.TXPaster tXPaster : pasterList) {
            long timeInEffect = getTimeInEffect(pixelFrame);
            if (timeInEffect >= tXPaster.startTime && timeInEffect <= tXPaster.endTime) {
                arrayList.add(newWaterMarkTag(tXPaster.pasterImage, tXPaster.frame));
            }
        }
    }

    private void collectWaterMarkFromSubtitle(ArrayList<WatermarkItem> arrayList, PixelFrame pixelFrame) {
        List<TXVideoEditConstants.TXSubtitle> subtitleList = this.mSubtitleFilterChain.getSubtitleList();
        if (subtitleList == null || subtitleList.size() == 0) {
            this.mSubtitleFilterChain.normalized(pixelFrame.getWidth(), pixelFrame.getHeight(), this.mRenderMode);
            subtitleList = this.mSubtitleFilterChain.getSubtitleList();
        }
        for (TXVideoEditConstants.TXSubtitle tXSubtitle : subtitleList) {
            long timeInEffect = getTimeInEffect(pixelFrame);
            if (timeInEffect >= tXSubtitle.startTime && timeInEffect <= tXSubtitle.endTime) {
                arrayList.add(newWaterMarkTag(tXSubtitle.titleImage, tXSubtitle.frame));
            }
        }
    }

    private void collectWaterMarkFromTail(ArrayList<WatermarkItem> arrayList, PixelFrame pixelFrame) {
        TailWaterMark tailWaterMark = this.mTailWaterMarkChain.getTailWaterMark(pixelFrame);
        if (tailWaterMark == null) {
            return;
        }
        arrayList.add(newWaterMarkTag(tailWaterMark.getWaterMark(), tailWaterMark.getmWaterMarkRect()));
        this.mWatermarkFilter.setAlpha(this.mTailWaterMarkChain.getAlpha());
    }

    private boolean compareWaterMarkList(List<WatermarkItem> list, List<WatermarkItem> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            WatermarkItem watermarkItem = list.get(i10);
            WatermarkItem watermarkItem2 = list2.get(i10);
            if (!watermarkItem.bitmap.equals(watermarkItem2.bitmap) || Math.abs(watermarkItem.xOffset - watermarkItem2.xOffset) > 1.0E-5d || Math.abs(watermarkItem.yOffset - watermarkItem2.yOffset) > 1.0E-5d || Math.abs(watermarkItem.fWidth - watermarkItem2.fWidth) > 1.0E-5d) {
                return false;
            }
        }
        return true;
    }

    private long getTimeInEffect(PixelFrame pixelFrame) {
        long timestamp = pixelFrame.getTimestamp();
        if (!this.mIsReverse) {
            return timestamp;
        }
        long j10 = this.mVideoDuration;
        return h.a(j10 - timestamp, 0L, j10);
    }

    static /* synthetic */ void lambda$setWaterMark$0(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        watermarkProcessor.mHasSetWaterMark = true;
        watermarkProcessor.mWatermarkFilter.enableWatermark(true);
        watermarkProcessor.mWatermarkFilter.setWatermark(bitmap, tXRect.f103212x, tXRect.f103213y, tXRect.width);
    }

    private WatermarkItem newWaterMarkTag(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        WatermarkItem watermarkItem = new WatermarkItem();
        watermarkItem.bitmap = bitmap;
        watermarkItem.xOffset = tXRect.f103212x;
        watermarkItem.yOffset = tXRect.f103213y;
        watermarkItem.fWidth = tXRect.width;
        return watermarkItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimatedPasterListInternal(List<TXVideoEditConstants.TXAnimatedPaster> list, Size size) {
        LiteavLog.i(TAG, "setAnimatedPasterListInternal animatedPasterList: ".concat(String.valueOf(list)));
        if (!UGCLicenseChecker.isStandardFunctionSupport()) {
            LiteavLog.e(TAG, "setAnimatedPasterList is not supported in UGC_Smart license");
            return;
        }
        if (size == null) {
            Size size2 = this.mRenderTargetSize;
            size = size2 == null ? null : new Size(size2);
        }
        if (size == null) {
            return;
        }
        if (list == null) {
            this.mAnimatedPasterFilterChain.setAnimatedPasterList(null, size);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster = list.get(i10);
            TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster2 = new TXVideoEditConstants.TXAnimatedPaster();
            TXVideoEditConstants.TXRect tXRect = new TXVideoEditConstants.TXRect();
            TXVideoEditConstants.TXRect tXRect2 = tXAnimatedPaster.frame;
            tXRect.width = tXRect2.width;
            tXRect.f103212x = tXRect2.f103212x;
            tXRect.f103213y = tXRect2.f103213y;
            tXAnimatedPaster2.frame = tXRect;
            tXAnimatedPaster2.animatedPasterPathFolder = tXAnimatedPaster.animatedPasterPathFolder;
            tXAnimatedPaster2.startTime = tXAnimatedPaster.startTime;
            tXAnimatedPaster2.endTime = tXAnimatedPaster.endTime;
            tXAnimatedPaster2.rotation = tXAnimatedPaster.rotation;
            arrayList.add(tXAnimatedPaster2);
        }
        this.mAnimatedPasterFilterChain.setAnimatedPasterList(arrayList, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasterListInternal(List<TXVideoEditConstants.TXPaster> list, Size size) {
        if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport()) {
            LiteavLog.e(TAG, "setPasterList is not supported in UGC_Smart license");
            return;
        }
        if (size == null) {
            Size size2 = this.mRenderTargetSize;
            size = size2 == null ? null : new Size(size2);
        }
        if (size == null) {
            return;
        }
        LiteavLog.i(TAG, "==== setPasterList ==== pasterList: ".concat(String.valueOf(list)));
        if (list == null) {
            this.mPasterFilterChain.setPasterList(null, size);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TXVideoEditConstants.TXPaster tXPaster = list.get(i10);
            TXVideoEditConstants.TXPaster tXPaster2 = new TXVideoEditConstants.TXPaster();
            TXVideoEditConstants.TXRect tXRect = new TXVideoEditConstants.TXRect();
            TXVideoEditConstants.TXRect tXRect2 = tXPaster.frame;
            tXRect.width = tXRect2.width;
            tXRect.f103212x = tXRect2.f103212x;
            tXRect.f103213y = tXRect2.f103213y;
            tXPaster2.frame = tXRect;
            tXPaster2.pasterImage = tXPaster.pasterImage;
            tXPaster2.startTime = tXPaster.startTime;
            tXPaster2.endTime = tXPaster.endTime;
            arrayList.add(tXPaster2);
        }
        this.mPasterFilterChain.setPasterList(arrayList, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleListInternal(List<TXVideoEditConstants.TXSubtitle> list, Size size) {
        if (size == null) {
            Size size2 = this.mRenderTargetSize;
            size = size2 == null ? null : new Size(size2);
        }
        if (size == null) {
            return;
        }
        LiteavLog.i(TAG, "setSubtitleListInternal subtitleList: ".concat(String.valueOf(list)));
        if (list == null) {
            this.mSubtitleFilterChain.setSubtitleList(null, size);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            TXVideoEditConstants.TXSubtitle tXSubtitle = list.get(i10);
            TXVideoEditConstants.TXSubtitle tXSubtitle2 = new TXVideoEditConstants.TXSubtitle();
            TXVideoEditConstants.TXRect tXRect = new TXVideoEditConstants.TXRect();
            TXVideoEditConstants.TXRect tXRect2 = tXSubtitle.frame;
            tXRect.width = tXRect2.width;
            tXRect.f103212x = tXRect2.f103212x;
            tXRect.f103213y = tXRect2.f103213y;
            tXSubtitle2.frame = tXRect;
            tXSubtitle2.titleImage = tXSubtitle.titleImage;
            tXSubtitle2.startTime = tXSubtitle.startTime;
            tXSubtitle2.endTime = tXSubtitle.endTime;
            arrayList.add(tXSubtitle2);
        }
        this.mSubtitleFilterChain.setSubtitleList(arrayList, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTailWaterMarkInternal(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j10, int i10) {
        LiteavLog.i(TAG, "setTailWaterMarkInternal: " + bitmap + ", rect: " + tXRect + ", startTime: " + j10 + ", duration: " + i10);
        TXVideoEditConstants.TXRect tXRect2 = new TXVideoEditConstants.TXRect();
        tXRect2.width = tXRect.width;
        tXRect2.f103212x = tXRect.f103212x;
        tXRect2.f103213y = tXRect.f103213y;
        this.mTailWaterMarkChain.setTailWaterMark(new TailWaterMark(bitmap, tXRect2, j10, i10 * 1000));
    }

    private boolean updateWaterMarkList(PixelFrame pixelFrame) throws Throwable {
        ArrayList<WatermarkItem> arrayList = new ArrayList<>();
        collectWaterMarkFromSubtitle(arrayList, pixelFrame);
        collectWaterMarkFromStaticPaster(arrayList, pixelFrame);
        collectWaterMarkFromAnimatedPaster(arrayList, pixelFrame);
        collectWaterMarkFromTail(arrayList, pixelFrame);
        if (compareWaterMarkList(this.mLastWaterMarkList, arrayList)) {
            ArrayList<WatermarkItem> arrayList2 = this.mLastWaterMarkList;
            return (arrayList2 != null && arrayList2.size() > 0) || this.mHasSetWaterMark;
        }
        this.mWatermarkFilter.setWaterMarkList(arrayList);
        this.mLastWaterMarkList.clear();
        this.mLastWaterMarkList = arrayList;
        return true;
    }

    public float getBlurLevel() {
        return this.mTailWaterMarkChain.getBlurLevel();
    }

    public void initialize(GLTexturePool gLTexturePool, int i10, int i11) {
        this.mGLTexturePool = gLTexturePool;
        this.mWatermarkFilter.initialize(gLTexturePool);
        this.mWatermarkFilter.enableWatermark(true);
        this.mWatermarkFilter.onOutputSizeChanged(i10, i11);
        if (i10 <= 1 || i11 <= 1) {
            return;
        }
        this.mRenderTargetSize = new Size(i10, i11);
    }

    public PixelFrame process(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        this.mDelayQueue.rerun();
        if (!updateWaterMarkList(pixelFrame)) {
            return null;
        }
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mWatermarkFilter.onDraw(pixelFrame.getTextureId(), gLTextureObtain, floatBuffer, floatBuffer2);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list) {
        Size size = this.mRenderTargetSize;
        this.mDelayQueue.add(d.a(this, list, size == null ? null : new Size(size)));
    }

    public void setPasterList(List<TXVideoEditConstants.TXPaster> list) {
        Size size = this.mRenderTargetSize;
        this.mDelayQueue.add(e.a(this, list, size == null ? null : new Size(size)));
    }

    public void setRenderMode(int i10) {
        this.mRenderMode = i10;
    }

    public void setRenderTargetSize(int i10, int i11) {
        LiteavLog.i(TAG, "setRenderResolution: width:" + i10 + "  height:" + i11);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.mRenderTargetSize = new Size(i10, i11);
    }

    public void setReverse(boolean z10, long j10) {
        this.mIsReverse = z10;
        this.mVideoDuration = j10;
    }

    public void setSubtitleList(List<TXVideoEditConstants.TXSubtitle> list) {
        Size size = this.mRenderTargetSize;
        this.mDelayQueue.add(c.a(this, list, size == null ? null : new Size(size)));
    }

    public void setTailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j10, int i10) {
        this.mDelayQueue.add(b.a(this, bitmap, tXRect, j10, i10));
    }

    public void setWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.mDelayQueue.add(a.a(this, bitmap, tXRect));
    }

    public void uninitialize() {
        this.mWatermarkFilter.uninitialize();
        TailWaterMarkChain tailWaterMarkChain = this.mTailWaterMarkChain;
        if (tailWaterMarkChain != null) {
            tailWaterMarkChain.clear();
            this.mTailWaterMarkChain = null;
        }
        AnimatedPasterFilterChain animatedPasterFilterChain = this.mAnimatedPasterFilterChain;
        if (animatedPasterFilterChain != null) {
            animatedPasterFilterChain.clear();
            this.mAnimatedPasterFilterChain = null;
        }
        SubtitleFilterChain subtitleFilterChain = this.mSubtitleFilterChain;
        if (subtitleFilterChain != null) {
            subtitleFilterChain.clear();
            this.mSubtitleFilterChain = null;
        }
        PasterFilterChain pasterFilterChain = this.mPasterFilterChain;
        if (pasterFilterChain != null) {
            pasterFilterChain.clear();
            this.mPasterFilterChain = null;
        }
    }
}
