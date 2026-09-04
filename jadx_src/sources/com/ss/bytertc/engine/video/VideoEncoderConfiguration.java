package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public int kMinBitrate;
    public OrientationMode orientationMode;

    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        private int value;

        OrientationMode(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate, int i10, int i11, OrientationMode orientationMode) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate;
        this.kBitrate = i10;
        this.kMinBitrate = i11;
        this.orientationMode = orientationMode;
    }

    public String toString() {
        return "VideoEncoderConfiguration{dimensions=" + this.dimensions + ", frameRate=" + this.frameRate + ", bitrate=" + this.kBitrate + ", minBitrate=" + this.kMinBitrate + ", orienttationMode=" + this.orientationMode + '}';
    }
}
