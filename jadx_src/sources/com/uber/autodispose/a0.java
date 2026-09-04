package com.uber.autodispose;

import io.reactivex.subjects.CompletableSubject;

/* JADX INFO: compiled from: TestScopeProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CompletableSubject f104058b;

    private a0(io.reactivex.a aVar) {
        CompletableSubject completableSubjectJ1 = CompletableSubject.j1();
        this.f104058b = completableSubjectJ1;
        aVar.d(completableSubjectJ1);
    }

    public static a0 e() {
        return f(CompletableSubject.j1());
    }

    public static a0 f(io.reactivex.a aVar) {
        return new a0(aVar);
    }

    @Override // com.uber.autodispose.y
    public io.reactivex.g a() {
        return this.f104058b;
    }

    public void g() {
        this.f104058b.onComplete();
    }
}
