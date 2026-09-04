package com.tencent.rtmp;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public interface ITXVodPlayListener {

    public static abstract class ITXVodSubtitleDataListener {
        public void onSubtitleData(TXVodDef.TXVodSubtitleData tXVodSubtitleData) {
        }
    }

    void onNetStatus(TXVodPlayer tXVodPlayer, Bundle bundle);

    void onPlayEvent(TXVodPlayer tXVodPlayer, int i10, Bundle bundle);
}
