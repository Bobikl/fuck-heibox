package com.tencent.ugc.common;

import android.media.MediaExtractor;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.f;
import org.apache.tools.ant.taskdefs.email.b;

/* JADX INFO: loaded from: classes4.dex */
public class MediaExtractorBuilder {
    private static final String CONTENT_URL_SCHEME = "content://";
    private static final String TAG = "MediaExtractorBuilder";
    private String mFilePath = "";
    private String mMimeType = "";

    public static boolean isContentUri(String str) {
        return str != null && str.startsWith(CONTENT_URL_SCHEME);
    }

    private void selectMimeType(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString(b.I).startsWith(this.mMimeType)) {
                mediaExtractor.selectTrack(i10);
                return;
            }
        }
    }

    public MediaExtractor build() {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            if (isContentUri(this.mFilePath)) {
                mediaExtractor.setDataSource(ContextUtils.getApplicationContext().getContentResolver().openFileDescriptor(Uri.parse(this.mFilePath), "r").getFileDescriptor());
            } else {
                if (!f.a(this.mFilePath)) {
                    mediaExtractor.release();
                    return null;
                }
                mediaExtractor.setDataSource(this.mFilePath);
            }
            if (TextUtils.isEmpty(this.mMimeType)) {
                return mediaExtractor;
            }
            selectMimeType(mediaExtractor);
            return mediaExtractor;
        } catch (Exception e10) {
            LiteavLog.e(TAG, "setDataSource: ".concat(String.valueOf(e10)));
            mediaExtractor.release();
            return null;
        }
    }

    public MediaExtractorBuilder setMimeType(String str) {
        this.mMimeType = str;
        return this;
    }

    public MediaExtractorBuilder setPath(String str) {
        this.mFilePath = str;
        return this;
    }
}
