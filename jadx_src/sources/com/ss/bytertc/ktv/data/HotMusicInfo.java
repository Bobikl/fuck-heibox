package com.ss.bytertc.ktv.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class HotMusicInfo {
    public String hotName;
    public MusicHotType hotType;
    public MusicInfo[] musicInfos;

    @CalledByNative
    public HotMusicInfo(MusicHotType musicHotType, String str, MusicInfo[] musicInfoArr) {
        this.hotType = musicHotType;
        this.hotName = str;
        this.musicInfos = musicInfoArr;
    }
}
