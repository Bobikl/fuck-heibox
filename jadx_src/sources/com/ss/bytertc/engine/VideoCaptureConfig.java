package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public class VideoCaptureConfig {
    public CapturePreference capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public enum CapturePreference {
        AUTO(0),
        MANUAL(1),
        AUTO_PERFORMANCE(2);

        private int value;

        CapturePreference(int i10) {
            this.value = i10;
        }

        public static CapturePreference convertFromInt(int i10) {
            return values()[i10];
        }

        public int getValue() {
            return this.value;
        }
    }

    public VideoCaptureConfig() {
        this.capturePreference = CapturePreference.AUTO;
    }

    public VideoCaptureConfig(int i10, int i11, int i12) {
        this.capturePreference = CapturePreference.AUTO;
        this.capturePreference = CapturePreference.MANUAL;
        this.width = i10;
        this.height = i11;
        this.frameRate = i12;
    }

    public String toString() {
        return "VideoCaptureConfig{capturePreference=" + this.capturePreference + "width=" + this.width + ", height=" + this.height + ", frameRate=" + this.frameRate + '}';
    }
}
