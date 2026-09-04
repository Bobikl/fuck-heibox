package com.tencent.ugc;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCCombineProcessor {
    private final String TAG = "UGCCombineProcessor";
    private final GLTexturePool mGLTexturePool;
    private final int mOutputPixelHeight;
    private final int mOutputPixelWidth;
    private final List<TXVideoEditConstants.TXAbsoluteRect> mScaleRectList;
    private final List<PixelFrameRenderer> mScaleRendererList;
    private final UGCCombineFrameFilter mUGCCombineProcessor;

    public UGCCombineProcessor(int i10, int i11, GLTexturePool gLTexturePool) {
        LiteavLog.i("UGCCombineProcessor", "UGCCombineProcessor pixelWidth = " + i10 + " pixelHeight = " + i11);
        this.mOutputPixelWidth = i10;
        this.mOutputPixelHeight = i11;
        this.mGLTexturePool = gLTexturePool;
        this.mScaleRendererList = new LinkedList();
        this.mScaleRectList = new LinkedList();
        this.mUGCCombineProcessor = new UGCCombineFrameFilter(gLTexturePool);
    }

    private void Retain(List<PixelFrame> list) {
        for (PixelFrame pixelFrame : list) {
            if (pixelFrame != null) {
                pixelFrame.retain();
            }
        }
    }

    private PixelFrame preScale(PixelFrame pixelFrame, TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect, int i10) {
        if (this.mScaleRendererList.size() < i10 + 1) {
            this.mScaleRendererList.add(new PixelFrameRenderer(tXAbsoluteRect.width, tXAbsoluteRect.height));
            this.mScaleRectList.add(tXAbsoluteRect);
        }
        PixelFrameRenderer pixelFrameRenderer = this.mScaleRendererList.get(i10);
        TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect2 = this.mScaleRectList.get(i10);
        if (tXAbsoluteRect2.width != tXAbsoluteRect.width || tXAbsoluteRect2.height != tXAbsoluteRect.height) {
            pixelFrameRenderer.uninitialize();
            pixelFrameRenderer = new PixelFrameRenderer(tXAbsoluteRect.width, tXAbsoluteRect.height);
            this.mScaleRendererList.remove(i10);
            this.mScaleRendererList.add(i10, pixelFrameRenderer);
        }
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(tXAbsoluteRect.width, tXAbsoluteRect.height);
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        pixelFrameRenderer.renderFrame(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        pixelFrame.release();
        return pixelFrameWrap;
    }

    private void releaseFrameList(List<UGCTransitionProcessor.TXCCombineFrame> list) {
        Iterator<UGCTransitionProcessor.TXCCombineFrame> it = list.iterator();
        while (it.hasNext()) {
            PixelFrame pixelFrame = it.next().drawInputFrame;
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
    }

    public PixelFrame processFrame(List<PixelFrame> list, List<TXVideoEditConstants.TXAbsoluteRect> list2) {
        if (list == null || list.size() == 0) {
            LiteavLog.e("UGCCombineProcessor", "frameList is empty");
            return null;
        }
        Retain(list);
        LinkedList linkedList = new LinkedList();
        long timestamp = 0;
        int i10 = 0;
        while (i10 < list.size()) {
            PixelFrame pixelFrame = list.get(i10);
            if (pixelFrame.getTimestamp() > timestamp) {
                timestamp = pixelFrame.getTimestamp();
            }
            UGCTransitionProcessor.TXCCombineFrame tXCCombineFrame = new UGCTransitionProcessor.TXCCombineFrame();
            TXVideoEditConstants.TXAbsoluteRect tXAbsoluteRect = i10 < list2.size() ? list2.get(i10) : new TXVideoEditConstants.TXAbsoluteRect();
            tXCCombineFrame.drawRect = tXAbsoluteRect;
            tXCCombineFrame.drawInputFrame = preScale(pixelFrame, tXAbsoluteRect, i10);
            linkedList.add(tXCCombineFrame);
            i10++;
        }
        this.mUGCCombineProcessor.setCanvasSize(this.mOutputPixelWidth, this.mOutputPixelHeight);
        this.mUGCCombineProcessor.setCropRect(null);
        GLTexture gLTextureCombineFrame = this.mUGCCombineProcessor.combineFrame(linkedList);
        releaseFrameList(linkedList);
        if (gLTextureCombineFrame == null) {
            return null;
        }
        PixelFrame pixelFrameWrap = gLTextureCombineFrame.wrap(list.get(0).getGLContext());
        gLTextureCombineFrame.release();
        pixelFrameWrap.setTimestamp(timestamp);
        return pixelFrameWrap;
    }

    public void release() {
        this.mUGCCombineProcessor.release();
        for (PixelFrameRenderer pixelFrameRenderer : this.mScaleRendererList) {
            if (pixelFrameRenderer != null) {
                pixelFrameRenderer.uninitialize();
            }
        }
        this.mScaleRendererList.clear();
        this.mScaleRectList.clear();
    }
}
