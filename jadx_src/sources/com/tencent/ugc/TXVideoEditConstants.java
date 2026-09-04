package com.tencent.ugc;

import android.graphics.Bitmap;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class TXVideoEditConstants {
    public static final int ERR_OUTPUT_EMPTY = -100004;
    public static final int ERR_OUTPUT_SAMEAS_INPUT = -100005;
    public static final int ERR_SOURCE_DAMAGED = -100002;
    public static final int ERR_SOURCE_NO_FOUND = -100001;
    public static final int ERR_SOURCE_NO_TRACK = -100003;
    public static final int ERR_UNFOUND_FILEINFO = -1003;
    public static final int ERR_UNSUPPORT_AUDIO_FORMAT = -1004;
    public static final int ERR_UNSUPPORT_LARGE_RESOLUTION = -1002;
    public static final int ERR_UNSUPPORT_VIDEO_FORMAT = -1001;
    public static final int GENERATE_RESULT_FAILED = -1;
    public static final int GENERATE_RESULT_LICENCE_VERIFICATION_FAILED = -5;
    public static final int GENERATE_RESULT_OK = 0;
    public static final int JOIN_RESULT_FAILED = -1;
    public static final int JOIN_RESULT_LICENCE_VERIFICATION_FAILED = -5;
    public static final int JOIN_RESULT_OK = 0;
    public static final int PICTURE_TRANSITION_FAILED = -1;
    public static final int PICTURE_TRANSITION_OK = 0;
    public static final int PREVIEW_ERROR_VIDEO_DECODE_FAIL = -1;
    public static final int PREVIEW_RENDER_MODE_FILL_EDGE = 2;
    public static final int PREVIEW_RENDER_MODE_FILL_SCREEN = 1;
    public static final int SPEED_LEVEL_FAST = 3;
    public static final int SPEED_LEVEL_FASTEST = 4;
    public static final int SPEED_LEVEL_NORMAL = 2;
    public static final int SPEED_LEVEL_SLOW = 1;
    public static final int SPEED_LEVEL_SLOWEST = 0;
    public static final int TXEffectType_DARK_DRAEM = 2;
    public static final int TXEffectType_GHOST = 7;
    public static final int TXEffectType_GHOST_SHADDOW = 5;
    public static final int TXEffectType_ILLUSION = 10;
    public static final int TXEffectType_LIGHTNING = 8;
    public static final int TXEffectType_MIRROR = 9;
    public static final int TXEffectType_PHANTOM_SHADDOW = 6;
    public static final int TXEffectType_ROCK_LIGHT = 3;
    public static final int TXEffectType_SOUL_OUT = 0;
    public static final int TXEffectType_SPLIT_SCREEN = 1;
    public static final int TXEffectType_WIN_SHADDOW = 4;
    public static final int TX_TRANSITION_TYPE_ENLARGE = 4;
    public static final int TX_TRANSITION_TYPE_FADEIN_FADEOUT = 6;
    public static final int TX_TRANSITION_TYPE_LEFT_RIGHT_SLIPPING = 1;
    public static final int TX_TRANSITION_TYPE_NARROW = 5;
    public static final int TX_TRANSITION_TYPE_ROTATIONAL_SCALING = 3;
    public static final int TX_TRANSITION_TYPE_UP_DOWN_SLIPPING = 2;
    public static final int UGC_PROFILE_BASELINE = 1;
    public static final int UGC_PROFILE_HIGH = 3;
    public static final int UGC_PROFILE_MAIN = 2;
    public static final int VIDEO_COMPRESSED_1080P = 4;
    public static final int VIDEO_COMPRESSED_360P = 0;
    public static final int VIDEO_COMPRESSED_480P = 1;
    public static final int VIDEO_COMPRESSED_540P = 2;
    public static final int VIDEO_COMPRESSED_720P = 3;

    public static final class TXAbsoluteRect {
        public int height;
        public int width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f103210x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f103211y;
    }

    public static final class TXAnimatedPaster {
        public String animatedPasterPathFolder;
        public long endTime;
        public TXRect frame;
        public float rotation;
        public long startTime;
    }

    public static final class TXGenerateResult {
        public String descMsg;
        public int retCode;
    }

    public static final class TXJoinerResult {
        public String descMsg;
        public int retCode;
    }

    public static final class TXPaster {
        public long endTime;
        public TXRect frame;
        public Bitmap pasterImage;
        public long startTime;
    }

    public static final class TXPreviewError {
        public int errorCode;
        public String errorMsg;
    }

    public static final class TXPreviewParam {
        public int renderMode;
        public FrameLayout videoView;
    }

    public static final class TXRect {
        public float width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f103212x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f103213y;
    }

    public static final class TXRepeat {
        public long endTime;
        public int repeatTimes;
        public long startTime;
    }

    public static final class TXSpeed {
        public long endTime;
        public int speedLevel;
        public long startTime;
    }

    public static final class TXSubtitle {
        public long endTime;
        public TXRect frame;
        public long startTime;
        public Bitmap titleImage;
    }

    public static final class TXThumbnail {
        public int count;
        public int height;
        public int width;
    }

    public static final class TXVideoInfo {
        public int audioSampleRate;
        public int bitrate;
        public Bitmap coverImage;
        public long duration;
        public long fileSize;
        public float fps;
        public int height;
        public int width;
    }

    public static final class ThumbnailTime {
        public int height;
        public long timestamp;
        public int width;
    }

    public enum VideoFrameRateLevel {
        VIDEO_FPS_ORIGIN(0),
        VIDEO_FPS_AUTO(-1),
        VIDEO_FPS_15(15),
        VIDEO_FPS_25(25),
        VIDEO_FPS_30(30),
        VIDEO_FPS_60(60);

        private final int mValue;

        VideoFrameRateLevel(int i10) {
            this.mValue = i10;
        }

        public final int asInt() {
            return this.mValue;
        }
    }
}
