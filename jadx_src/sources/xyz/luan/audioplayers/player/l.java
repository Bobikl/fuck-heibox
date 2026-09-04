package xyz.luan.audioplayers.player;

import android.media.AudioAttributes;
import android.media.SoundPool;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import nl.UrlSource;
import xyz.luan.audioplayers.AudioContextAndroid;
import xyz.luan.audioplayers.AudioplayersPlugin;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lxyz/luan/audioplayers/player/l;", "", "", "maxStreams", "Lxyz/luan/audioplayers/a;", "audioContext", "Lkotlin/b2;", "b", "Lxyz/luan/audioplayers/player/n;", "e", "d", "Lxyz/luan/audioplayers/AudioplayersPlugin;", ak.av, "Lxyz/luan/audioplayers/AudioplayersPlugin;", "ref", "Lxyz/luan/audioplayers/player/n;", "legacySoundPoolWrapper", "Ljava/util/HashMap;", "Landroid/media/AudioAttributes;", "Lkotlin/collections/HashMap;", ak.aF, "Ljava/util/HashMap;", "soundPoolWrappers", "<init>", "(Lxyz/luan/audioplayers/AudioplayersPlugin;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AudioplayersPlugin ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private n legacySoundPoolWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<AudioAttributes, n> soundPoolWrappers;

    public l(@dl.d AudioplayersPlugin ref) {
        f0.p(ref, "ref");
        this.ref = ref;
        this.soundPoolWrappers = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(l this$0, n soundPoolWrapper, SoundPool soundPool, int i10, int i11) {
        f0.p(this$0, "this$0");
        f0.p(soundPoolWrapper, "$soundPoolWrapper");
        this$0.ref.m("Loaded " + i10);
        SoundPoolPlayer soundPoolPlayer = soundPoolWrapper.b().get(Integer.valueOf(i10));
        UrlSource f141357h = soundPoolPlayer != null ? soundPoolPlayer.getF141357h() : null;
        if (f141357h != null) {
            w0.k(soundPoolWrapper.b()).remove(soundPoolPlayer.getSoundId());
            synchronized (soundPoolWrapper.d()) {
                List<SoundPoolPlayer> listE = soundPoolWrapper.d().get(f141357h);
                if (listE == null) {
                    listE = CollectionsKt__CollectionsKt.E();
                }
                for (SoundPoolPlayer soundPoolPlayer2 : listE) {
                    soundPoolPlayer2.getWrappedPlayer().x("Marking " + soundPoolPlayer2 + " as loaded");
                    soundPoolPlayer2.getWrappedPlayer().O(true);
                    if (soundPoolPlayer2.getWrappedPlayer().getPlaying()) {
                        soundPoolPlayer2.getWrappedPlayer().x("Delayed start of " + soundPoolPlayer2);
                        soundPoolPlayer2.start();
                    }
                }
                b2 b2Var = b2.f124493a;
            }
        }
    }

    public final void b(int i10, @dl.d AudioContextAndroid audioContext) {
        f0.p(audioContext, "audioContext");
        AudioAttributes audioAttributesA = audioContext.a();
        if (this.soundPoolWrappers.containsKey(audioAttributesA)) {
            return;
        }
        SoundPool soundPool = new SoundPool.Builder().setAudioAttributes(audioAttributesA).setMaxStreams(i10).build();
        this.ref.m("Create SoundPool with " + audioAttributesA);
        f0.o(soundPool, "soundPool");
        final n nVar = new n(soundPool);
        nVar.getSoundPool().setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: xyz.luan.audioplayers.player.k
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i11, int i12) {
                l.c(this.f141401a, nVar, soundPool2, i11, i12);
            }
        });
        this.soundPoolWrappers.put(audioAttributesA, nVar);
    }

    public final void d() {
        Iterator<Map.Entry<AudioAttributes, n>> it = this.soundPoolWrappers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
        this.soundPoolWrappers.clear();
    }

    @dl.e
    public final n e(@dl.d AudioContextAndroid audioContext) {
        f0.p(audioContext, "audioContext");
        return this.soundPoolWrappers.get(audioContext.a());
    }
}
