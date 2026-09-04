package com.tencent.ugc.decoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DecodeAbilityProvider f103472a;

    private a(DecodeAbilityProvider decodeAbilityProvider) {
        this.f103472a = decodeAbilityProvider;
    }

    public static Runnable a(DecodeAbilityProvider decodeAbilityProvider) {
        return new a(decodeAbilityProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103472a.updateDecoderAbility();
    }
}
