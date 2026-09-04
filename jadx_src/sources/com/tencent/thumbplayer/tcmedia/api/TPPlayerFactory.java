package com.tencent.thumbplayer.tcmedia.api;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.f.a.a;
import com.tencent.thumbplayer.tcmedia.f.b;
import com.tencent.thumbplayer.tcmedia.tplayer.d;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class TPPlayerFactory {
    private static final String LOG_TAG = "TPPlayerFactory";

    public static ITPRichMediaAsyncRequester createRichMediaASyncRequester(Context context) {
        try {
            return new a(context.getApplicationContext());
        } catch (UnsupportedOperationException e10) {
            TPLogUtil.e(LOG_TAG, "Failed to create rich media async requester:" + e10.getMessage());
            return null;
        }
    }

    public static ITPRichMediaSynchronizer createRichMediaSynchronizer(Context context) {
        try {
            return new b(context.getApplicationContext());
        } catch (UnsupportedOperationException e10) {
            TPLogUtil.e(LOG_TAG, "Failed to create rich media synchronizer:" + e10.getMessage());
            return null;
        }
    }

    public static ITPPlayer createTPPlayer(Context context) {
        return (ITPPlayer) new d(new com.tencent.thumbplayer.tcmedia.tplayer.b(context)).a();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper) {
        return (ITPPlayer) new d(new com.tencent.thumbplayer.tcmedia.tplayer.b(context, looper)).a();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2) {
        return (ITPPlayer) new d(new com.tencent.thumbplayer.tcmedia.tplayer.b(context, looper, looper2)).a();
    }

    public static ITPPlayer createTPPlayer(Context context, Looper looper, Looper looper2, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        return (ITPPlayer) new d(new com.tencent.thumbplayer.tcmedia.tplayer.b(context, looper, looper2, bVar)).a();
    }

    public static ITPPlayer createTPPlayer(Context context, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        return (ITPPlayer) new d(new com.tencent.thumbplayer.tcmedia.tplayer.b(context, null, null, bVar)).a();
    }

    public static TPSurface createTPSurface(SurfaceTexture surfaceTexture) {
        return new TPSurface(surfaceTexture);
    }
}
