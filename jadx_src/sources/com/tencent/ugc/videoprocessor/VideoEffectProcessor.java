package com.tencent.ugc.videoprocessor;

import android.content.Context;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.h;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import com.tencent.ugc.videoprocessor.videoeffect.data.Motion;
import com.tencent.ugc.videoprocessor.videoeffect.data.MotionFilterConfig;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUDarkFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUGhostFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUGhostShadowFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUIllusionFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULightingFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULinearShadowFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUMirrorFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUPhontomFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPURockFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSpiritOutFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSplitScreenFilter;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VideoEffectProcessor {
    private static final String TAG = "VideoEffectProcessor";
    private final Context mContext;
    private TXCGPUImageFilter mCurrentEffect;
    private boolean mReverse = false;
    private int mCurrentEffectType = -1;
    private long mTotalDuration = -1;
    private final MotionFilterConfig mMotionFilterConfig = new MotionFilterConfig();

    public VideoEffectProcessor(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private TXCGPUImageFilter createEffect(int i10) {
        switch (i10) {
            case 0:
                return new TXCGPUSpiritOutFilter();
            case 1:
                return new TXCGPUSplitScreenFilter();
            case 2:
                return new TXCGPUDarkFilter();
            case 3:
                return new TXCGPURockFilter();
            case 4:
                return new TXCGPULinearShadowFilter();
            case 5:
                return new TXCGPUGhostShadowFilter();
            case 6:
                return new TXCGPUPhontomFilter();
            case 7:
                return new TXCGPUGhostFilter();
            case 8:
                return new TXCGPULightingFilter(this.mContext);
            case 9:
                return new TXCGPUMirrorFilter();
            case 10:
                return new TXCGPUIllusionFilter();
            default:
                return new TXCGPUImageFilter();
        }
    }

    private void destroyCurrentEffect() {
        TXCGPUImageFilter tXCGPUImageFilter = this.mCurrentEffect;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mCurrentEffect = null;
        }
    }

    private Motion getCurrentMotion(long j10) {
        List<Motion> motionList = this.mMotionFilterConfig.getMotionList();
        Motion motion = null;
        if (CollectionUtils.isEmpty(motionList)) {
            return null;
        }
        for (int size = motionList.size() - 1; size >= 0; size--) {
            Motion motion2 = motionList.get(size);
            if (isInMotionTime(motion2, j10)) {
                motion = motion2;
                break;
            }
        }
        Motion currentMotion = this.mMotionFilterConfig.getCurrentMotion();
        return currentMotion.endTime == -1 ? currentMotion : motion;
    }

    private long getMotionPts(Motion motion, long j10) {
        if (!isInMotionTime(motion, j10)) {
            return -1L;
        }
        long motionStartTime = getMotionStartTime(motion);
        return motionStartTime + Math.abs(j10 - motionStartTime);
    }

    private long getMotionStartTime(Motion motion) {
        long j10 = motion.endTime;
        if (j10 < 0) {
            return motion.startTime;
        }
        return this.mReverse ? Math.max(motion.startTime, j10) : Math.min(motion.startTime, j10);
    }

    private long getVideoPts(long j10) {
        long j11 = this.mTotalDuration;
        return j11 == -1 ? j10 : h.a(j11 - j10, 0L, j11);
    }

    private boolean isInMotionTime(Motion motion, long j10) {
        long j11 = motion.startTime;
        if (j11 < 0) {
            return false;
        }
        long j12 = motion.endTime;
        if (j12 > 0) {
            return j10 >= Math.min(j11, j12) && j10 <= Math.max(motion.startTime, motion.endTime);
        }
        return true;
    }

    public void deleteAllEffect() {
        LiteavLog.i(TAG, "==== deleteAllEffect ====");
        this.mMotionFilterConfig.clear();
    }

    public void deleteLastEffect() {
        LiteavLog.i(TAG, "==== deleteLastEffect ====");
        this.mMotionFilterConfig.deleteLastMotionEffect();
    }

    public void destroy() {
        destroyCurrentEffect();
    }

    public int getCurrentMotionType(long j10) {
        Motion currentMotion = getCurrentMotion(getVideoPts(j10));
        if (currentMotion == null) {
            return -1;
        }
        return currentMotion.type;
    }

    public PixelFrame processFrame(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, GLTexturePool gLTexturePool) {
        boolean z10;
        long videoPts = getVideoPts(pixelFrame.getTimestamp());
        Motion currentMotion = getCurrentMotion(videoPts);
        if (currentMotion == null || !isInMotionTime(currentMotion, videoPts) || pixelFrame.getTimestamp() == 0) {
            destroyCurrentEffect();
            return null;
        }
        if (this.mCurrentEffectType != currentMotion.type) {
            destroyCurrentEffect();
        }
        if (this.mCurrentEffect == null) {
            int i10 = currentMotion.type;
            this.mCurrentEffectType = i10;
            TXCGPUImageFilter tXCGPUImageFilterCreateEffect = createEffect(i10);
            this.mCurrentEffect = tXCGPUImageFilterCreateEffect;
            tXCGPUImageFilterCreateEffect.initialize(gLTexturePool);
            z10 = true;
        } else {
            z10 = false;
        }
        this.mCurrentEffect.onOutputSizeChanged(pixelFrame.getWidth(), pixelFrame.getHeight());
        TXCGPUImageFilter tXCGPUImageFilter = this.mCurrentEffect;
        if (tXCGPUImageFilter instanceof TXCGPUEffectFilterBase) {
            TXCGPUEffectFilterBase tXCGPUEffectFilterBase = (TXCGPUEffectFilterBase) tXCGPUImageFilter;
            if (z10) {
                tXCGPUEffectFilterBase.setNextFrameTimestamp(getMotionStartTime(currentMotion));
            } else {
                tXCGPUEffectFilterBase.setNextFrameTimestamp(getMotionPts(currentMotion, videoPts));
            }
        }
        GLTexture gLTextureObtain = gLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        GLES20.glViewport(0, 0, pixelFrame.getWidth(), pixelFrame.getHeight());
        this.mCurrentEffect.onDraw(pixelFrame.getTextureId(), gLTextureObtain, floatBuffer, floatBuffer2);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }

    public void setReverse(boolean z10, long j10) {
        this.mReverse = z10;
        if (z10) {
            this.mTotalDuration = j10;
        } else {
            this.mTotalDuration = -1L;
        }
    }

    public void startEffect(int i10, long j10) {
        LiteavLog.i(TAG, "startEffect: type" + i10 + "  startTime:" + j10);
        Motion motion = new Motion(i10);
        motion.startTime = j10;
        this.mMotionFilterConfig.addMotion(motion);
    }

    public void stopEffect(int i10, long j10) {
        LiteavLog.i(TAG, "stopEffect type: " + i10 + ", endTime: " + j10);
        Motion currentMotion = this.mMotionFilterConfig.getCurrentMotion();
        if (currentMotion != null) {
            currentMotion.endTime = j10;
        }
    }
}
