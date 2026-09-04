package nl;

import android.media.MediaPlayer;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xyz.luan.audioplayers.f;
import xyz.luan.audioplayers.player.SoundPoolPlayer;

/* JADX INFO: renamed from: nl.a, reason: from toString */
/* JADX INFO: compiled from: BytesSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@w0(23)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lnl/a;", "Lnl/b;", "Landroid/media/MediaPlayer;", "mediaPlayer", "Lkotlin/b2;", ak.av, "Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "soundPoolPlayer", "b", "Lxyz/luan/audioplayers/f;", ak.aF, "dataSource", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "Lxyz/luan/audioplayers/f;", "f", "()Lxyz/luan/audioplayers/f;", "<init>", "(Lxyz/luan/audioplayers/f;)V", "", "bytes", "([B)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BytesSource implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @d
    private final f dataSource;

    public BytesSource(@d f dataSource) {
        f0.p(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BytesSource(@d byte[] bytes) {
        this(new f(bytes));
        f0.p(bytes, "bytes");
    }

    public static /* synthetic */ BytesSource e(BytesSource bytesSource, f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = bytesSource.dataSource;
        }
        return bytesSource.d(fVar);
    }

    @Override // nl.b
    public void a(@d MediaPlayer mediaPlayer) {
        f0.p(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.dataSource);
    }

    @Override // nl.b
    public void b(@d SoundPoolPlayer soundPoolPlayer) {
        f0.p(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    @d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getDataSource() {
        return this.dataSource;
    }

    @d
    public final BytesSource d(@d f dataSource) {
        f0.p(dataSource, "dataSource");
        return new BytesSource(dataSource);
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BytesSource) && f0.g(this.dataSource, ((BytesSource) other).dataSource);
    }

    @d
    public final f f() {
        return this.dataSource;
    }

    public int hashCode() {
        return this.dataSource.hashCode();
    }

    @d
    public String toString() {
        return "BytesSource(dataSource=" + this.dataSource + ')';
    }
}
