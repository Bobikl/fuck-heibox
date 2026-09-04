package com.bytedance.realx;

import com.bytedance.realx.base.CalledByNative;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RTCCapabilities {
    private List<String> supportedVideoCodecs;

    @CalledByNative
    public RTCCapabilities(long j10) {
        this.supportedVideoCodecs = Arrays.asList(nativeGetSupportedVideoCodecs(j10));
    }

    public RTCCapabilities(List<String> list) {
        this.supportedVideoCodecs = list;
    }

    private static native String[] nativeGetSupportedVideoCodecs(long j10);

    public List<String> getSupportedVideoCodecs() {
        return this.supportedVideoCodecs;
    }
}
