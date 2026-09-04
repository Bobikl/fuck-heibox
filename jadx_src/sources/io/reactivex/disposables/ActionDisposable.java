package io.reactivex.disposables;

import io.reactivex.internal.util.ExceptionHelper;
import jh.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ActionDisposable extends ReferenceDisposable<kh.a> {
    private static final long serialVersionUID = -8219729196779211169L;

    ActionDisposable(kh.a aVar) {
        super(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@e kh.a aVar) {
        try {
            aVar.run();
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }
}
