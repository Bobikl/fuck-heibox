package com.tencent.ugc.preprocessor;

import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoPreprocessorListener {
    void didProcessFrame(int i10, PixelFrame pixelFrame);
}
