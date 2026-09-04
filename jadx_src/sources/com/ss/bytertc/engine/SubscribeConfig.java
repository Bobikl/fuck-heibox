package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class SubscribeConfig {
    public int framerate;
    public boolean isScreen;
    public boolean subAudio;
    public int subHeight;
    public boolean subVideo;
    public int subVideoIndex;
    public int subWidth;
    public SVCLayer svcLayer;
    public int videoIndex;

    public enum SVCLayer {
        DEFAULT(0),
        BASE(1),
        MAIN(2),
        HIGH(3);

        private int value;

        SVCLayer(int i10) {
            this.value = i10;
        }

        public static SVCLayer convertFromInt(int i10) {
            return values()[i10];
        }

        public int getValue() {
            return this.value;
        }
    }

    public SubscribeConfig() {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
            this.svcLayer = subscribeConfig.svcLayer;
            this.subWidth = subscribeConfig.subWidth;
            this.subHeight = subscribeConfig.subHeight;
            this.subVideoIndex = subscribeConfig.subVideoIndex;
        }
    }

    public SubscribeConfig(boolean z10, boolean z11, boolean z12, int i10) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        SVCLayer sVCLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z10;
        this.subVideo = z11;
        this.subAudio = z12;
        this.videoIndex = i10;
        this.svcLayer = sVCLayer;
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z10, boolean z11, boolean z12, int i10, int i11) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z10;
        this.subVideo = z11;
        this.subAudio = z12;
        this.videoIndex = i10;
        this.svcLayer = SVCLayer.convertFromInt(i11);
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, int i13, int i14) {
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.framerate = 0;
        this.isScreen = z10;
        this.subVideo = z11;
        this.subAudio = z12;
        this.videoIndex = i10;
        this.svcLayer = SVCLayer.convertFromInt(i11);
        this.subWidth = i12;
        this.subHeight = i13;
        this.subVideoIndex = i14;
    }

    @CalledByNative
    private static SubscribeConfig create(boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, int i13, int i14) {
        return new SubscribeConfig(z10, z11, z12, i10, i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
        return this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex && this.svcLayer == subscribeConfig.svcLayer && this.subWidth == subscribeConfig.subWidth && this.subHeight == subscribeConfig.subHeight;
    }

    public String toString() {
        return "SubscribeConfig{isScreen=" + this.isScreen + ", subVideo=" + this.subVideo + ", subAudio=" + this.subAudio + ", videoIndex=" + this.videoIndex + ", svcLayer=" + this.svcLayer + ", sub_width=" + this.subWidth + ", sub_height=" + this.subHeight + ", sub_video_index=" + this.subVideoIndex + g.f141884d;
    }
}
