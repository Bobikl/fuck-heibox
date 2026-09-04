package af;

import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlaybackAware.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface k {

    /* JADX INFO: compiled from: PlaybackAware.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@dl.d k kVar, boolean z10) {
            ze.a playAction;
            if (PatchProxy.proxy(new Object[]{kVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.cq, new Class[]{k.class, Boolean.TYPE}, Void.TYPE).isSupported || (playAction = kVar.getPlayAction()) == null) {
                return;
            }
            playAction.a(z10);
        }

        public static void b(@dl.d k kVar, @dl.d PlaybackState state) {
            if (PatchProxy.proxy(new Object[]{kVar, state}, null, changeQuickRedirect, true, bb.c.m.dq, new Class[]{k.class, PlaybackState.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(state, "state");
        }

        public static void c(@dl.d k kVar, boolean z10) {
        }
    }

    void c(boolean z10);

    @dl.e
    ze.a getPlayAction();

    void i(boolean z10);

    void j(@dl.d PlaybackState playbackState);

    void setPlayAction(@dl.e ze.a aVar);
}
