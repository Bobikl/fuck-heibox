package com.bytedance.realx.video;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
