package com.tencent.thumbplayer.tcmedia.core.common;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public interface TPCodecCapability {
    public static final int DEFAULT_FRAMERATE = 30;
    public static final int DEFAULT_INVALID_PARAMETER = -1;

    public static class TPACodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundBitRate;
        public int lowerboundChannels;
        public int lowerboundSampleRate;
        public int profile;
        public int upperboundBitRate;
        public int upperboundChannels;
        public int upperboundSampleRate;

        public void set(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.upperboundSampleRate = i10;
            this.upperboundChannels = i11;
            this.upperboundBitRate = i12;
            this.lowerboundSampleRate = i13;
            this.lowerboundChannels = i14;
            this.lowerboundBitRate = i15;
            this.profile = i16;
            this.level = i17;
        }
    }

    public static class TPCodecMaxCapability implements Serializable {
        public int maxBitRate;
        public int maxChannels;
        public int maxFramerateFormaxLumaSamples;
        public int maxLevel;
        public int maxLumaSamples;
        public int maxProfile;
        public int maxSampleRate;

        @Deprecated
        TPCodecMaxCapability(int i10, int i11, int i12) {
            this.maxLumaSamples = i10;
            this.maxProfile = i11;
            this.maxLevel = i12;
            this.maxFramerateFormaxLumaSamples = 30;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        TPCodecMaxCapability(int i10, int i11, int i12, int i13) {
            this.maxLumaSamples = i10;
            this.maxProfile = i11;
            this.maxLevel = i12;
            this.maxFramerateFormaxLumaSamples = i13;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        TPCodecMaxCapability(int i10, int i11, int i12, int i13, int i14) {
            this.maxProfile = i10;
            this.maxLevel = i11;
            this.maxBitRate = i13;
            this.maxSampleRate = i12;
            this.maxChannels = i14;
            this.maxLumaSamples = -1;
            this.maxFramerateFormaxLumaSamples = -1;
        }
    }

    public static class TPHdrSupportVersionRange implements Serializable {
        public int lowerboundAndroidAPILevel;
        public int lowerboundPatchVersion;
        public int lowerboundSystemVersion;
        public int upperboundAndroidAPILevel;
        public int upperboundPatchVersion;
        public int upperboundSystemVersion;

        public TPHdrSupportVersionRange(int i10, int i11) {
            this.upperboundAndroidAPILevel = i10;
            this.lowerboundAndroidAPILevel = i11;
        }

        public TPHdrSupportVersionRange(int i10, int i11, int i12, int i13) {
            this.upperboundSystemVersion = i10;
            this.lowerboundSystemVersion = i11;
            this.upperboundPatchVersion = i12;
            this.lowerboundPatchVersion = i13;
        }
    }

    public static class TPVCodecPropertyRange implements Serializable {
        public int level;
        public int lowerboundHeight;
        public int lowerboundWidth;
        public int profile;
        public int upperboundHeight;
        public int upperboundWidth;

        public void set(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.upperboundWidth = i10;
            this.upperboundHeight = i11;
            this.lowerboundWidth = i12;
            this.lowerboundHeight = i13;
            this.profile = i14;
            this.level = i15;
        }
    }
}
