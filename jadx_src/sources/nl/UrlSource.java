package nl;

import android.media.MediaPlayer;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import org.apache.tools.ant.taskdefs.v7;
import xyz.luan.audioplayers.player.SoundPoolPlayer;

/* JADX INFO: renamed from: nl.c, reason: from toString */
/* JADX INFO: compiled from: UrlSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÆ\u0001J\t\u0010\u0016\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lnl/c;", "Lnl/b;", "Ljava/io/File;", "k", "Ljava/net/URL;", "url", "", "g", "Landroid/media/MediaPlayer;", "mediaPlayer", "Lkotlin/b2;", ak.av, "Lxyz/luan/audioplayers/player/SoundPoolPlayer;", "soundPoolPlayer", "b", "", RXScreenCaptureService.KEY_HEIGHT, ak.aF, "", "d", "isLocal", "e", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "Z", "j", "()Z", "<init>", "(Ljava/lang/String;Z)V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class UrlSource implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @d
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final boolean isLocal;

    public UrlSource(@d String url, boolean z10) {
        f0.p(url, "url");
        this.url = url;
        this.isLocal = z10;
    }

    public static /* synthetic */ UrlSource f(UrlSource urlSource, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = urlSource.url;
        }
        if ((i10 & 2) != 0) {
            z10 = urlSource.isLocal;
        }
        return urlSource.e(str, z10);
    }

    private final byte[] g(URL url) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpenStream = url.openStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                Integer numValueOf = Integer.valueOf(inputStreamOpenStream.read(bArr));
                if (!(numValueOf.intValue() > 0)) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    b2 b2Var = b2.f124493a;
                    kotlin.io.b.a(inputStreamOpenStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    f0.o(byteArray, "outputStream.toByteArray()");
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, numValueOf.intValue());
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(inputStreamOpenStream, th2);
                throw th3;
            }
        }
    }

    private final File k() throws IOException {
        URL url = URI.create(this.url).toURL();
        f0.o(url, "create(url).toURL()");
        byte[] bArrG = g(url);
        File tempFile = File.createTempFile(RemoteMessageConst.Notification.SOUND, "");
        FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
        try {
            fileOutputStream.write(bArrG);
            tempFile.deleteOnExit();
            b2 b2Var = b2.f124493a;
            kotlin.io.b.a(fileOutputStream, null);
            f0.o(tempFile, "tempFile");
            return tempFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    @Override // nl.b
    public void a(@d MediaPlayer mediaPlayer) throws IOException {
        f0.p(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.url);
    }

    @Override // nl.b
    public void b(@d SoundPoolPlayer soundPoolPlayer) {
        f0.p(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.q(this);
    }

    @d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    @d
    public final UrlSource e(@d String url, boolean isLocal) {
        f0.p(url, "url");
        return new UrlSource(url, isLocal);
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlSource)) {
            return false;
        }
        UrlSource urlSource = (UrlSource) other;
        return f0.g(this.url, urlSource.url) && this.isLocal == urlSource.isLocal;
    }

    @d
    public final String h() {
        if (this.isLocal) {
            return StringsKt__StringsKt.d4(this.url, v7.f135919a);
        }
        String absolutePath = k().getAbsolutePath();
        f0.o(absolutePath, "loadTempFileFromNetwork().absolutePath");
        return absolutePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        boolean z10 = this.isLocal;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @d
    public final String i() {
        return this.url;
    }

    public final boolean j() {
        return this.isLocal;
    }

    @d
    public String toString() {
        return "UrlSource(url=" + this.url + ", isLocal=" + this.isLocal + ')';
    }
}
