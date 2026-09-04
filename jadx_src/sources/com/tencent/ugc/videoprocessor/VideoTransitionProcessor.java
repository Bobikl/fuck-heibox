package com.tencent.ugc.videoprocessor;

import android.content.Context;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.h;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videoprocessor.transitions.BounceFilter;
import com.tencent.ugc.videoprocessor.transitions.BurnFilter;
import com.tencent.ugc.videoprocessor.transitions.CircleCropFilter;
import com.tencent.ugc.videoprocessor.transitions.CircleFilter;
import com.tencent.ugc.videoprocessor.transitions.CrossWarpFilter;
import com.tencent.ugc.videoprocessor.transitions.CrossZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.CubeFilter;
import com.tencent.ugc.videoprocessor.transitions.DirectionalFilter;
import com.tencent.ugc.videoprocessor.transitions.DirectionalWarpFilter;
import com.tencent.ugc.videoprocessor.transitions.DoorWayFilter;
import com.tencent.ugc.videoprocessor.transitions.DreamyZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.FadeColorFilter;
import com.tencent.ugc.videoprocessor.transitions.FadeGrayScaleFilter;
import com.tencent.ugc.videoprocessor.transitions.FlyEyeFilter;
import com.tencent.ugc.videoprocessor.transitions.GlitchDisplaceFilter;
import com.tencent.ugc.videoprocessor.transitions.GlitchMemoriesFilter;
import com.tencent.ugc.videoprocessor.transitions.GridFlipFilter;
import com.tencent.ugc.videoprocessor.transitions.HexagonalizeFilter;
import com.tencent.ugc.videoprocessor.transitions.InvertedPageCurlFilter;
import com.tencent.ugc.videoprocessor.transitions.KaleidoScopeFilter;
import com.tencent.ugc.videoprocessor.transitions.LinearBlurFilter;
import com.tencent.ugc.videoprocessor.transitions.MosaicFilter;
import com.tencent.ugc.videoprocessor.transitions.PixelizeFilter;
import com.tencent.ugc.videoprocessor.transitions.SimpleZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.SqueezeFilter;
import com.tencent.ugc.videoprocessor.transitions.StereoViewerFilter;
import com.tencent.ugc.videoprocessor.transitions.SwapFilter;
import com.tencent.ugc.videoprocessor.transitions.SwirlFilter;
import com.tencent.ugc.videoprocessor.transitions.TXCGPUTransitionFilterBase;
import com.tencent.ugc.videoprocessor.transitions.WaterDropFilter;
import com.tencent.ugc.videoprocessor.transitions.data.TransitionConfig;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VideoTransitionProcessor {
    private static final String TAG = "TransitionProcessor";
    private final Context mContext;
    private GLTexturePool mGLTexturePool;
    private TXCGPUTransitionFilterBase mTransitionFilter;
    private long mFirstFrameTime = -1;
    private boolean mIsReverse = false;
    private long mVideoDuration = -1;
    private final TransitionConfig mTransitionConfig = new TransitionConfig();

    public VideoTransitionProcessor(Context context) {
        this.mContext = context;
    }

    private void createTransitionFilter(int i10) {
        DirectionalFilter directionalFilter;
        TXCGPUTransitionFilterBase fadeColorFilter;
        switch (i10) {
            case 1:
                directionalFilter = new DirectionalFilter(i10, new float[]{1.0f, 0.0f});
                fadeColorFilter = directionalFilter;
                break;
            case 2:
                directionalFilter = new DirectionalFilter(i10, new float[]{-1.0f, 0.0f});
                fadeColorFilter = directionalFilter;
                break;
            case 3:
                directionalFilter = new DirectionalFilter(i10, new float[]{0.0f, -1.0f});
                fadeColorFilter = directionalFilter;
                break;
            case 4:
                directionalFilter = new DirectionalFilter(i10, new float[]{0.0f, 1.0f});
                fadeColorFilter = directionalFilter;
                break;
            case 5:
                fadeColorFilter = new FadeColorFilter(i10);
                break;
            case 6:
            case 20:
            case 21:
            case 26:
            default:
                fadeColorFilter = null;
                break;
            case 7:
                fadeColorFilter = new SimpleZoomFilter(i10);
                break;
            case 8:
                fadeColorFilter = new LinearBlurFilter(i10);
                break;
            case 9:
                fadeColorFilter = new WaterDropFilter(i10);
                break;
            case 10:
                fadeColorFilter = new InvertedPageCurlFilter(i10);
                break;
            case 11:
                fadeColorFilter = new GlitchMemoriesFilter(i10);
                break;
            case 12:
                fadeColorFilter = new StereoViewerFilter(i10);
                break;
            case 13:
                fadeColorFilter = new DirectionalWarpFilter(i10);
                break;
            case 14:
                fadeColorFilter = new BounceFilter(i10);
                break;
            case 15:
                fadeColorFilter = new CircleCropFilter(i10);
                break;
            case 16:
                fadeColorFilter = new SwirlFilter(i10);
                break;
            case 17:
                fadeColorFilter = new CrossZoomFilter(i10);
                break;
            case 18:
                fadeColorFilter = new GridFlipFilter(i10);
                break;
            case 19:
                fadeColorFilter = new MosaicFilter(i10);
                break;
            case 22:
                fadeColorFilter = new KaleidoScopeFilter(i10);
                break;
            case 23:
                fadeColorFilter = new HexagonalizeFilter(i10);
                break;
            case 24:
                fadeColorFilter = new GlitchDisplaceFilter(i10);
                break;
            case 25:
                fadeColorFilter = new DreamyZoomFilter(i10);
                break;
            case 27:
                fadeColorFilter = new BurnFilter(i10);
                break;
            case 28:
                fadeColorFilter = new CircleFilter(i10);
                break;
            case 29:
                fadeColorFilter = new CrossWarpFilter(i10);
                break;
            case 30:
                fadeColorFilter = new CubeFilter(i10);
                break;
            case 31:
                fadeColorFilter = new DoorWayFilter(i10);
                break;
            case 32:
                fadeColorFilter = new FadeGrayScaleFilter(i10);
                break;
            case 33:
                fadeColorFilter = new FlyEyeFilter(i10);
                break;
            case 34:
                fadeColorFilter = new PixelizeFilter(i10);
                break;
            case 35:
                fadeColorFilter = new SqueezeFilter(i10);
                break;
            case 36:
                fadeColorFilter = new SwapFilter(i10);
                break;
        }
        if (fadeColorFilter != null) {
            fadeColorFilter.initialize(this.mGLTexturePool);
        }
        this.mTransitionFilter = fadeColorFilter;
    }

    private TransitionConfig.TransitionBean getCurrentTransition(long j10) {
        List<TransitionConfig.TransitionBean> transitionList = this.mTransitionConfig.getTransitionList();
        if (CollectionUtils.isEmpty(transitionList)) {
            return null;
        }
        for (int size = transitionList.size() - 1; size >= 0; size--) {
            TransitionConfig.TransitionBean transitionBean = transitionList.get(size);
            if (isInTransitionRange(j10, transitionBean)) {
                return transitionBean;
            }
        }
        return null;
    }

    private float getTransitionProgress(TransitionConfig.TransitionBean transitionBean, long j10) {
        if (this.mFirstFrameTime == -1) {
            this.mFirstFrameTime = j10;
        }
        long jAbs = Math.abs(j10 - this.mFirstFrameTime);
        long jAbs2 = Math.abs(transitionBean.endTimeMs - transitionBean.startTimeMs);
        if (jAbs2 <= 0) {
            return -1.0f;
        }
        return h.a((jAbs * 1.0f) / jAbs2, 0.0f);
    }

    private boolean isInTransitionRange(long j10, TransitionConfig.TransitionBean transitionBean) {
        long j11 = transitionBean.startTimeMs;
        if (j10 < j11 || j10 > transitionBean.endTimeMs) {
            return j10 >= transitionBean.endTimeMs && j10 <= j11;
        }
        return true;
    }

    public PixelFrame applyTransitionFilter(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        long timestamp = pixelFrame.getTimestamp();
        if (this.mIsReverse) {
            long j10 = this.mVideoDuration;
            timestamp = h.a(j10 - timestamp, 0L, j10);
        }
        TransitionConfig.TransitionBean currentTransition = getCurrentTransition(timestamp);
        if (currentTransition == null) {
            this.mFirstFrameTime = -1L;
            return null;
        }
        float transitionProgress = getTransitionProgress(currentTransition, timestamp);
        if (transitionProgress < 0.0f) {
            return null;
        }
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase != null && tXCGPUTransitionFilterBase.mType != currentTransition.type) {
            tXCGPUTransitionFilterBase.uninitialize();
            this.mTransitionFilter = null;
        }
        if (this.mTransitionFilter == null) {
            createTransitionFilter(currentTransition.type);
        }
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase2 = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase2 == null) {
            return null;
        }
        tXCGPUTransitionFilterBase2.onOutputSizeChanged(pixelFrame.getWidth(), pixelFrame.getHeight());
        this.mTransitionFilter.setProgressForTransition(transitionProgress);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mTransitionFilter.onDraw(pixelFrame.getTextureId(), gLTextureObtain, floatBuffer, floatBuffer2);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    public void deleteLastTransitionEffect() {
        this.mTransitionConfig.deleteLastTransitionEffect();
    }

    public void destroy() {
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase != null) {
            tXCGPUTransitionFilterBase.uninitialize();
            this.mTransitionFilter = null;
        }
    }

    public void initialize(GLTexturePool gLTexturePool) {
        this.mGLTexturePool = gLTexturePool;
    }

    public void setReverse(boolean z10, long j10) {
        this.mIsReverse = z10;
        this.mVideoDuration = j10;
    }

    public boolean setTransitionEffect(int i10, long j10, long j11, long j12) {
        boolean z10;
        if (j11 <= j10) {
            long j13 = j12 + j11;
            if (j13 <= j10) {
                List<TransitionConfig.TransitionBean> transitionList = this.mTransitionConfig.getTransitionList();
                if (transitionList.size() != 0) {
                    Iterator<TransitionConfig.TransitionBean> it = transitionList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                            break;
                        }
                        TransitionConfig.TransitionBean next = it.next();
                        if (j11 >= next.startTimeMs && j11 <= next.endTimeMs) {
                            LiteavLog.w(TAG, "setTransitionEffect,start time invalid");
                        } else if (isInTransitionRange(j13, next)) {
                            LiteavLog.w(TAG, "setTransitionEffect,end time invalid");
                        }
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                TransitionConfig.TransitionBean transitionBean = new TransitionConfig.TransitionBean(i10);
                transitionBean.startTimeMs = j11;
                transitionBean.endTimeMs = j13;
                this.mTransitionConfig.addTransition(transitionBean);
                LiteavLog.d(TAG, "setTransitionEffect,success:".concat(String.valueOf(transitionBean)));
                return true;
            }
        }
        LiteavLog.w(TAG, "setTransitionEffect,not suitable for videoTotalDurationMs");
        return false;
    }
}
