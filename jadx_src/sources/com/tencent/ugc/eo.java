package com.tencent.ugc;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eo implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final eo f103579a = new eo();

    private eo() {
    }

    public static Comparator a() {
        return f103579a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return UGCMediaListSource.lambda$cutSingleVideoFileToClips$1((TXVideoEditConstants.TXRepeat) obj, (TXVideoEditConstants.TXRepeat) obj2);
    }
}
