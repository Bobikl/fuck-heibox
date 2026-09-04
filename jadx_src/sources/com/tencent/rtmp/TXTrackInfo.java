package com.tencent.rtmp;

/* JADX INFO: loaded from: classes4.dex */
public class TXTrackInfo {
    public static final int TX_VOD_MEDIA_TRACK_TYPE_AUDIO = 2;
    public static final int TX_VOD_MEDIA_TRACK_TYPE_SUBTITLE = 3;
    public static final int TX_VOD_MEDIA_TRACK_TYPE_UNKNOW = 0;
    public static final int TX_VOD_MEDIA_TRACK_TYPE_VIDEO = 1;
    public String name;
    public int trackIndex;
    public int trackType = 0;
    public boolean isSelected = false;
    public boolean isExclusive = true;
    public boolean isInternal = true;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof TXTrackInfo)) {
            TXTrackInfo tXTrackInfo = (TXTrackInfo) obj;
            if (this.name.equals(tXTrackInfo.name) && this.trackType == tXTrackInfo.trackType) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getTrackIndex() {
        return this.trackIndex;
    }

    public int getTrackType() {
        return this.trackType;
    }
}
