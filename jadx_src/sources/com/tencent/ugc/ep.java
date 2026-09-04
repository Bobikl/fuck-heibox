package com.tencent.ugc;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ep implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ep f103580a = new ep();

    private ep() {
    }

    public static Comparator a() {
        return f103580a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return UGCMediaListSource.lambda$updateSpeedInfoToClips$2((TXVideoEditConstants.TXSpeed) obj, (TXVideoEditConstants.TXSpeed) obj2);
    }
}
