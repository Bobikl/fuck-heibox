package com.tencent.thumbplayer.tcmedia.api.composition;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPMediaAsset {
    public static final int INVALID_ID = -1;
    public static final int MEDIA_TYPE_AUDIO = 3;
    public static final int MEDIA_TYPE_AV_MIX = 1;
    public static final int MEDIA_TYPE_MUTABLE = 4;
    public static final int MEDIA_TYPE_VIDEO = 2;

    ITPMediaAssetExtraParam getExtraParam();

    Map<String, String> getHttpHeader();

    int getMediaType();

    String getUrl();

    void setExtraParam(ITPMediaAssetExtraParam iTPMediaAssetExtraParam);

    void setHttpHeader(Map<String, String> map);
}
