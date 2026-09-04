package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class MusicInfo {
    public int climaxEndTime;
    public int climaxStartTime;
    public int duration;
    public boolean enableScore;
    public LyricStatus lyricStatus;
    public String musicId;
    public String musicName;
    public String posterUrl;
    public String singer;
    public long updateTimestamp;
    public String vendorId;
    public String vendorName;

    @CalledByNative
    public MusicInfo(String str, String str2, String str3, String str4, String str5, long j10, String str6, LyricStatus lyricStatus, int i10, boolean z10, int i11, int i12) {
        this.musicId = str;
        this.musicName = str2;
        this.singer = str3;
        this.vendorId = str4;
        this.vendorName = str5;
        this.updateTimestamp = j10;
        this.posterUrl = str6;
        this.lyricStatus = lyricStatus;
        this.duration = i10;
        this.enableScore = z10;
        this.climaxStartTime = i11;
        this.climaxEndTime = i12;
    }

    public String toString() {
        return "Music{musicId='" + this.musicId + "', musicName='" + this.musicName + "', singer='" + this.singer + "', vendorId='" + this.vendorId + "', vendorName='" + this.vendorName + "', updateTimestamp=" + this.updateTimestamp + ", posterUrl='" + this.posterUrl + "', lyricStatus=" + this.lyricStatus + ", duration=" + this.duration + ", enableScore=" + this.enableScore + ", climaxStartTime=" + this.climaxStartTime + ", climaxEndTime=" + this.climaxEndTime + '}';
    }
}
