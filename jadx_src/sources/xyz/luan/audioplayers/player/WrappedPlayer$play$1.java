package xyz.luan.audioplayers.player;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: WrappedPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class WrappedPlayer$play$1 extends FunctionReferenceImpl implements yh.a<b2> {
    WrappedPlayer$play$1(Object obj) {
        super(0, obj, WrappedPlayer.class, "actuallyPlay", "actuallyPlay()V", 0);
    }

    public final void i() {
        ((WrappedPlayer) this.receiver).b();
    }

    @Override // yh.a
    public /* bridge */ /* synthetic */ b2 invoke() {
        i();
        return b2.f124493a;
    }
}
