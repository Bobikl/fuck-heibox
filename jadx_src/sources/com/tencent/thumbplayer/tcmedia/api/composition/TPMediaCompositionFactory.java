package com.tencent.thumbplayer.tcmedia.api.composition;

import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.b.a;
import com.tencent.thumbplayer.tcmedia.b.b;
import com.tencent.thumbplayer.tcmedia.b.c;
import com.tencent.thumbplayer.tcmedia.b.e;
import com.tencent.thumbplayer.tcmedia.b.g;
import com.tencent.thumbplayer.tcmedia.b.h;
import com.tencent.thumbplayer.tcmedia.b.j;
import com.tencent.thumbplayer.tcmedia.b.k;
import com.tencent.thumbplayer.tcmedia.b.l;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TPMediaCompositionFactory {
    public static ITPMediaTrackClip createEmptyTrackClip(int i10, long j10, long j11) {
        a aVar = new a(i10);
        aVar.setCutTimeRange(j10, j11);
        return aVar;
    }

    public static ITPMediaAssetExtraParam createMediaAssetExtraParam() {
        return new b();
    }

    public static ITPMediaAssetOrderedMap createMediaAssetOrderedMap() {
        return new c();
    }

    public static ITPMediaComposition createMediaComposition() {
        return new e();
    }

    public static ITPMediaDRMAsset createMediaDRMAsset(@TPCommonEnum.TP_DRM_TYPE int i10, String str) {
        return new j(i10, str);
    }

    public static ITPMediaAsset createMediaRTCAsset(String str, String str2) {
        return new k(str, str2);
    }

    public static ITPMediaAsset createMediaRTCAsset(String str, String str2, int i10) {
        return new k(str, str2, i10);
    }

    public static ITPMediaTrack createMediaTrack(int i10) {
        return new g(i10);
    }

    public static ITPMediaTrack createMediaTrack(int i10, List<ITPMediaTrackClip> list) {
        g gVar = new g(i10);
        Iterator<ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            gVar.addTrackClip(it.next());
        }
        return gVar;
    }

    public static ITPMediaTrack createMediaTrack(int i10, ITPMediaTrackClip... iTPMediaTrackClipArr) {
        g gVar = new g(i10);
        for (ITPMediaTrackClip iTPMediaTrackClip : iTPMediaTrackClipArr) {
            gVar.addTrackClip(iTPMediaTrackClip);
        }
        return gVar;
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i10) {
        return new h(str, i10);
    }

    public static ITPMediaTrackClip createMediaTrackClip(String str, int i10, long j10, long j11) {
        return new h(str, i10, j10, j11);
    }

    public static ITPMediaUrlAsset createMediaUrlAsset(String str) {
        return new l(str);
    }
}
