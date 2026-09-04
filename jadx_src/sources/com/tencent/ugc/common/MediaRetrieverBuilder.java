package com.tencent.ugc.common;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class MediaRetrieverBuilder {
    private final String TAG = "MediaRetrieverBuilder";
    private String mFilePath = "";

    public MediaMetadataRetriever build() throws IOException {
        Context applicationContext = ContextUtils.getApplicationContext();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (MediaExtractorBuilder.isContentUri(this.mFilePath)) {
                mediaMetadataRetriever.setDataSource(applicationContext, Uri.parse(this.mFilePath));
                return mediaMetadataRetriever;
            }
            if (f.a(this.mFilePath)) {
                mediaMetadataRetriever.setDataSource(this.mFilePath);
                return mediaMetadataRetriever;
            }
            mediaMetadataRetriever.release();
            return null;
        } catch (Exception e10) {
            LiteavLog.e("MediaRetrieverBuilder", String.valueOf(e10));
            mediaMetadataRetriever.release();
            return null;
        }
    }

    public MediaRetrieverBuilder setPath(String str) {
        this.mFilePath = str;
        return this;
    }
}
