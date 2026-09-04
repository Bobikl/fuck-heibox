package com.tencent.ugc.videoprocessor.watermark;

import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videoprocessor.data.Resolution;

/* JADX INFO: loaded from: classes4.dex */
public class PasterBase {
    protected Size mRenderSize;

    protected TXVideoEditConstants.TXRect calculateRect(int i10, int i11, int i12, TXVideoEditConstants.TXRect tXRect) {
        Size size = this.mRenderSize;
        if (size == null) {
            return null;
        }
        int i13 = size.width;
        int i14 = size.height;
        Resolution resolution = new Resolution();
        float f10 = i10;
        float f11 = (i13 * 1.0f) / f10;
        float f12 = i11;
        float f13 = (i14 * 1.0f) / f12;
        if (i12 != 2 ? f11 < f13 : f11 > f13) {
            f11 = f13;
        }
        resolution.width = (int) (f10 * f11);
        resolution.height = (int) (f12 * f11);
        TXVideoEditConstants.TXRect tXRect2 = new TXVideoEditConstants.TXRect();
        float f14 = tXRect.f103212x;
        int i15 = resolution.width;
        tXRect2.f103212x = (f14 - ((i13 - i15) / 2)) / i15;
        float f15 = tXRect.f103213y;
        int i16 = resolution.height;
        tXRect2.f103213y = (f15 - ((i14 - i16) / 2)) / i16;
        tXRect2.width = tXRect.width / i15;
        return tXRect2;
    }

    protected void clear() {
    }

    protected void normalized(int i10, int i11, int i12) {
    }
}
