package com.tencent.thumbplayer.tcmedia.api.richmedia;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPRichMediaSynchronizerListener {
    void onDeselectFeatureSuccess(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10);

    void onRichMediaError(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10);

    void onRichMediaFeatureData(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10, TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRichMediaFeatureFailure(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10, int i11);

    void onRichMediaInfo(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10, long j10, long j11, long j12, Object obj);

    void onRichMediaPrepared(ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    void onSelectFeatureSuccess(ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i10);
}
