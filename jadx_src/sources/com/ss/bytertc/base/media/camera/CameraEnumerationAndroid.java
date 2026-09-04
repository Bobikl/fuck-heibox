package com.ss.bytertc.base.media.camera;

import android.graphics.ImageFormat;
import com.meituan.robust.Constants;
import com.ss.bytertc.base.media.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(bb.c.b.f30693i3, 240), new Size(400, 240), new Size(480, bb.c.b.f30693i3), new Size(bb.c.b.f30883q9, 360), new Size(bb.c.b.f30883q9, 480), new Size(768, 480), new Size(bb.c.b.f31019wd, 480), new Size(800, 600), new Size(bb.c.b.f31065yf, 540), new Size(bb.c.b.f31065yf, bb.c.b.f30883q9), new Size(1024, bb.c.b.f30606e8), new Size(1024, 600), new Size(1280, 720), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, bb.c.b.Ko), new Size(2560, bb.c.b.Ko), new Size(bb.c.e.f31800g5, bb.c.d.B1)));
    private static final String TAG = "CameraEnumerationAndroid";

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i10, int i11) {
                this.min = i10;
                this.max = i11;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return Constants.ARRAY_TYPE + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i10, int i11, int i12, int i13) {
            this.width = i10;
            this.height = i11;
            this.framerate = new FramerateRange(i12, i13);
        }

        public CaptureFormat(int i10, int i11, FramerateRange framerateRange) {
            this.width = i10;
            this.height = i11;
            this.framerate = framerateRange;
        }

        public static int frameSize(int i10, int i11, int i12) {
            if (i12 == 17) {
                return ((i10 * i11) * ImageFormat.getBitsPerPixel(i12)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }
    }

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            return diff(t10) - diff(t11);
        }

        abstract int diff(T t10);
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i10) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            private int progressivePenalty(int i11, int i12, int i13, int i14) {
                if (i11 < i12) {
                    return i11 * i13;
                }
                return ((i11 - i12) * i14) + (i13 * i12);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(Math.abs((i10 * 1000) - framerateRange.min), 5000, 1, 3) + progressivePenalty(Math.abs((i10 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i10, final int i11) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.ss.bytertc.base.media.camera.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i10 - size.width) + Math.abs(i11 - size.height);
            }
        });
    }

    public static Size getUpClosestSupportedSize(List<Size> list, int i10, int i11) {
        int iAbs;
        Size size = new Size(0, 0);
        int i12 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i13 = 0; i13 < list.size(); i13++) {
            Size size2 = list.get(i13);
            int i14 = size2.width;
            if (i14 >= i10 && (iAbs = Math.abs(i10 - i14) + Math.abs(i11 - size2.height)) <= i12) {
                z10 = true;
                size = size2;
                i12 = iAbs;
            }
        }
        return !z10 ? getClosestSupportedSize(list, i10, i11) : size;
    }

    static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
