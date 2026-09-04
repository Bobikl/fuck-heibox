package com.ss.bytertc.ktv;

import androidx.annotation.n0;
import com.ss.bytertc.ktv.data.DownloadLyricType;
import com.ss.bytertc.ktv.data.MusicFilterType;
import com.ss.bytertc.ktv.data.MusicHotType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IKTVManager {
    public abstract void cancelDownload(int i10);

    public abstract void clearCache();

    public abstract int downloadLyric(@n0 String str, @n0 DownloadLyricType downloadLyricType);

    public abstract int downloadMidi(@n0 String str);

    public abstract int downloadMusic(@n0 String str);

    public abstract void getHotMusic(@n0 MusicHotType[] musicHotTypeArr, @n0 MusicFilterType[] musicFilterTypeArr);

    public abstract IKTVPlayer getKTVPlayer();

    public abstract void getMusicDetail(@n0 String str);

    public abstract void getMusicList(int i10, int i11, @n0 MusicFilterType[] musicFilterTypeArr);

    public abstract void searchMusic(@n0 String str, int i10, int i11, @n0 MusicFilterType[] musicFilterTypeArr);

    public abstract void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler);

    public abstract void setMaxCacheSize(int i10);
}
