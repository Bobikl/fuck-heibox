package com.tencent.custom.customcapture.utils;

import android.media.MediaFormat;
import com.tencent.custom.customcapture.exceptions.SetupException;
import com.tencent.custom.customcapture.extractor.Extractor;
import com.tencent.custom.customcapture.extractor.RangeExtractorAdvancer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaUtils {
    public static final String KEY_ROTATION = "rotation-degrees";

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static boolean hasEosFlag(int i10) {
        return (i10 & 4) != 0;
    }

    public static MediaFormat retriveMediaFormat(String str, boolean z10) throws SetupException {
        Extractor extractor = new Extractor(z10, str, new RangeExtractorAdvancer());
        try {
            extractor.setup();
            return extractor.getMediaFormat();
        } finally {
            extractor.release();
        }
    }
}
