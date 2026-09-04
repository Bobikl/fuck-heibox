package com.tencent.ugc.videoprocessor.videoeffect.filter;

import android.opengl.GLES20;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class TXCGPUSplitScreenFilter extends TXCGPUEffectFilterBase {
    private static final int DURATION_SPLIT_SCREEN = 1000;
    private SplitSceenParam mSplitScreenParam;
    private int mSpliteNumber = 0;
    private final int[] mSupportSplitNumber = {1, 4, 9};
    private a[] mSubWindowPosition = null;

    public static class SplitSceenParam extends TXCGPUEffectFilterBase.VideoEffectParams {
        public int splitScreenNumber;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f103954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103957d;

        private a() {
            this.f103954a = 0;
            this.f103955b = 0;
            this.f103956c = 0;
            this.f103957d = 0;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateParams(SplitSceenParam splitSceenParam) {
        int i10 = splitSceenParam.splitScreenNumber;
        if (i10 != this.mSpliteNumber) {
            int[] iArr = this.mSupportSplitNumber;
            byte b10 = 0;
            if (i10 == iArr[0] || i10 == iArr[1] || i10 == iArr[2]) {
                this.mSpliteNumber = i10;
                this.mSubWindowPosition = new a[i10];
                for (int i11 = 0; i11 < this.mSpliteNumber; i11++) {
                    this.mSubWindowPosition[i11] = new a(b10);
                }
                int i12 = getOutputSize().width;
                int i13 = getOutputSize().height;
                int i14 = splitSceenParam.splitScreenNumber;
                int[] iArr2 = this.mSupportSplitNumber;
                if (i14 == iArr2[0]) {
                    a aVar = this.mSubWindowPosition[0];
                    aVar.f103954a = 0;
                    aVar.f103955b = 0;
                    aVar.f103956c = i12;
                    aVar.f103957d = i13;
                    return;
                }
                if (i14 == iArr2[1]) {
                    while (b10 < this.mSupportSplitNumber[1]) {
                        a aVar2 = this.mSubWindowPosition[b10];
                        aVar2.f103954a = ((b10 % 2) * i12) / 2;
                        aVar2.f103955b = ((b10 / 2) * i13) / 2;
                        aVar2.f103956c = i12 / 2;
                        aVar2.f103957d = i13 / 2;
                        b10++;
                    }
                    return;
                }
                if (i14 == iArr2[2]) {
                    for (int i15 = 0; i15 < this.mSupportSplitNumber[2]; i15++) {
                        a aVar3 = this.mSubWindowPosition[i15];
                        aVar3.f103954a = ((i15 % 3) * i12) / 3;
                        aVar3.f103955b = ((i15 / 3) * i13) / 3;
                        aVar3.f103956c = i12 / 3;
                        aVar3.f103957d = i13 / 3;
                    }
                }
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onDraw(int i10, GLTexture gLTexture, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.mSubWindowPosition == null) {
            super.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
        }
        for (a aVar : this.mSubWindowPosition) {
            if (aVar != null) {
                GLES20.glViewport(aVar.f103954a, aVar.f103955b, aVar.f103956c, aVar.f103957d);
            }
            super.onDraw(i10, gLTexture, floatBuffer, floatBuffer2);
        }
        GLES20.glViewport(0, 0, getOutputSize().width, getOutputSize().height);
    }

    @Override // com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase
    public void setNextFrameTimestamp(long j10) {
        super.setNextFrameTimestamp(j10);
        if (this.mSplitScreenParam == null) {
            this.mSplitScreenParam = new SplitSceenParam();
        }
        long jAbs = Math.abs(j10 - this.mEffectStartTime);
        if (jAbs <= 1000) {
            this.mSplitScreenParam.splitScreenNumber = 4;
        } else if (jAbs <= 2000) {
            this.mSplitScreenParam.splitScreenNumber = 9;
        } else {
            this.mEffectStartTime = -1L;
        }
        updateParams(this.mSplitScreenParam);
    }
}
