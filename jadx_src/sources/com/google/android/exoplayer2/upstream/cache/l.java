package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ContentMetadata.java */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l {
    public static long a(m mVar) {
        return mVar.a(m.f51061c, -1L);
    }

    @p0
    public static Uri b(m mVar) {
        String strB = mVar.b(m.f51060b, null);
        if (strB == null) {
            return null;
        }
        return Uri.parse(strB);
    }
}
