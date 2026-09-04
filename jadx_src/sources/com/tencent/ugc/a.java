package com.tencent.ugc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GlobalContextManager f103261a;

    private a(GlobalContextManager globalContextManager) {
        this.f103261a = globalContextManager;
    }

    public static Runnable a(GlobalContextManager globalContextManager) {
        return new a(globalContextManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103261a.initGlobalContext();
    }
}
