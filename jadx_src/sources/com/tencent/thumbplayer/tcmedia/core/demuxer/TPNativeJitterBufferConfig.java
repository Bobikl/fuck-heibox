package com.tencent.thumbplayer.tcmedia.core.demuxer;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeJitterBufferConfig {
    private long mAdjustIntervalThresholdMs;
    private long mFrozenThresholdMs;
    private long mMaxIncreaseDurationMs;
    private long mMinDecreaseDurationMs;
    private long mPerDecreaseDurationMs;
    private long mPerIncreaseDurationMs;

    public static final class Builder {
        public static final long DEFAULT_ADJUST_INTERVAL_THRESHOLD_MS = 60000;
        public static final long DEFAULT_FROZEN_THRESHOLD_MS = 800;
        public static final long DEFAULT_MAX_DECREASE_DURATION_MS = 8000;
        public static final long DEFAULT_MIN_DECREASE_DURATION_MS = 2000;
        public static final long DEFAULT_PER_DECREASE_DURATION_MS = 500;
        public static final long DEFAULT_PER_INCREASE_DURATION_MS = 1000;
        private long mMinDecreaseDurationMs = 2000;
        private long mMaxIncreaseDurationMs = 8000;
        private long mPerIncreaseDurationMs = 1000;
        private long mPerDecreaseDurationMs = 500;
        private long mAdjustIntervalThresholdMs = 60000;
        private long mFrozenThresholdMs = 800;

        public final TPNativeJitterBufferConfig build() {
            return new TPNativeJitterBufferConfig(this.mMinDecreaseDurationMs, this.mMaxIncreaseDurationMs, this.mPerIncreaseDurationMs, this.mPerDecreaseDurationMs, this.mAdjustIntervalThresholdMs, this.mFrozenThresholdMs);
        }

        public final Builder setAdjustIntervalThresholdMs(long j10) {
            this.mAdjustIntervalThresholdMs = j10;
            return this;
        }

        public final Builder setFrozenThresholdMs(long j10) {
            this.mFrozenThresholdMs = j10;
            return this;
        }

        public final Builder setMaxIncreaseDurationMs(long j10) {
            this.mMaxIncreaseDurationMs = j10;
            return this;
        }

        public final Builder setMinDecreaseDurationMs(long j10) {
            this.mMinDecreaseDurationMs = j10;
            return this;
        }

        public final Builder setPerDecreaseDurationMs(long j10) {
            this.mPerDecreaseDurationMs = j10;
            return this;
        }

        public final Builder setPerIncreaseDurationMs(long j10) {
            this.mPerIncreaseDurationMs = j10;
            return this;
        }
    }

    protected TPNativeJitterBufferConfig(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.mMinDecreaseDurationMs = j10;
        this.mMaxIncreaseDurationMs = j11;
        this.mPerIncreaseDurationMs = j12;
        this.mPerDecreaseDurationMs = j13;
        this.mAdjustIntervalThresholdMs = j14;
        this.mFrozenThresholdMs = j15;
    }
}
