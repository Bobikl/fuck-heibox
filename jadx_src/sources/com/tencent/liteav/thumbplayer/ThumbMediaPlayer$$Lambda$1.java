package com.tencent.liteav.thumbplayer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThumbMediaPlayer$$Lambda$1 implements Runnable {
    private final ThumbMediaPlayer arg$1;

    private ThumbMediaPlayer$$Lambda$1(ThumbMediaPlayer thumbMediaPlayer) {
        this.arg$1 = thumbMediaPlayer;
    }

    public static Runnable lambdaFactory$(ThumbMediaPlayer thumbMediaPlayer) {
        return new ThumbMediaPlayer$$Lambda$1(thumbMediaPlayer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThumbMediaPlayer.lambda$checkSubtitle$0(this.arg$1);
    }
}
