package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXVideoEditer f103358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f103359b;

    private bg(TXVideoEditer tXVideoEditer, float[] fArr) {
        this.f103358a = tXVideoEditer;
        this.f103359b = fArr;
    }

    public static Runnable a(TXVideoEditer tXVideoEditer, float[] fArr) {
        return new bg(tXVideoEditer, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103358a.mAudioProcessor.setVideoVolumes(this.f103359b);
    }
}
