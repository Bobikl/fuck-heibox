package io.reactivex.disposables;

import org.reactivestreams.e;

/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionDisposable extends ReferenceDisposable<e> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(e eVar) {
        super(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@jh.e e eVar) {
        eVar.cancel();
    }
}
