package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@JNINamespace("liteav::video")
public abstract class CaptureSourceInterface {
    private static final String TAG = "CaptureSourceInterface";

    public static class CaptureParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f100688d;

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureParams)) {
                return false;
            }
            CaptureParams captureParams = (CaptureParams) obj;
            return this.f100686b == captureParams.f100686b && this.f100687c == captureParams.f100687c && this.f100688d == captureParams.f100688d;
        }

        public String toString() {
            return String.format(Locale.ENGLISH, "size: %dx%d, fps: %d", Integer.valueOf(this.f100687c), Integer.valueOf(this.f100688d), Integer.valueOf(this.f100686b));
        }
    }

    public interface CaptureSourceListener {
    }

    public abstract void pause();

    public abstract void resume();

    public void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig) {
    }

    public abstract void start(Object obj, CaptureParams captureParams, CaptureSourceListener captureSourceListener);

    public abstract void stop();

    public abstract void updateParams(CaptureParams captureParams);
}
