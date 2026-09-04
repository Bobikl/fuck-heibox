package xyz.luan.audioplayers.player;

import android.media.SoundPool;
import com.umeng.analytics.pro.ak;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import nl.UrlSource;

/* JADX INFO: compiled from: SoundPoolPlayer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, d2 = {"Lxyz/luan/audioplayers/player/n;", "", "Lkotlin/b2;", ak.av, "Landroid/media/SoundPool;", "Landroid/media/SoundPool;", ak.aF, "()Landroid/media/SoundPool;", "soundPool", "", "", "Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "soundIdToPlayer", "Lnl/c;", "", "d", "urlToPlayers", "<init>", "(Landroid/media/SoundPool;)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SoundPool soundPool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Integer, SoundPoolPlayer> soundIdToPlayer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<UrlSource, List<SoundPoolPlayer>> urlToPlayers;

    public n(@dl.d SoundPool soundPool) {
        f0.p(soundPool, "soundPool");
        this.soundPool = soundPool;
        Map<Integer, SoundPoolPlayer> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        f0.o(mapSynchronizedMap, "synchronizedMap(mutableM…<Int, SoundPoolPlayer>())");
        this.soundIdToPlayer = mapSynchronizedMap;
        Map<UrlSource, List<SoundPoolPlayer>> mapSynchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        f0.o(mapSynchronizedMap2, "synchronizedMap(mutableM…List<SoundPoolPlayer>>())");
        this.urlToPlayers = mapSynchronizedMap2;
    }

    public final void a() {
        this.soundPool.release();
        this.soundIdToPlayer.clear();
        this.urlToPlayers.clear();
    }

    @dl.d
    public final Map<Integer, SoundPoolPlayer> b() {
        return this.soundIdToPlayer;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SoundPool getSoundPool() {
        return this.soundPool;
    }

    @dl.d
    public final Map<UrlSource, List<SoundPoolPlayer>> d() {
        return this.urlToPlayers;
    }
}
