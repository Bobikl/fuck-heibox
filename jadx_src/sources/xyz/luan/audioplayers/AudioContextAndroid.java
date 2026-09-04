package xyz.luan.audioplayers;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;

/* JADX INFO: renamed from: xyz.luan.audioplayers.a, reason: from toString */
/* JADX INFO: compiled from: AudioContextAndroid.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(B\t\b\u0017¢\u0006\u0004\b'\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u000e\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b&\u0010#¨\u0006*"}, d2 = {"Lxyz/luan/audioplayers/a;", "", "", "n", "Landroid/media/MediaPlayer;", "player", "Lkotlin/b2;", "q", "Landroid/media/AudioAttributes;", ak.av, "hashCode", "other", "", "equals", "b", ak.aF, "d", "e", "f", "g", "isSpeakerphoneOn", "stayAwake", "contentType", "usageType", "audioFocus", "audioMode", RXScreenCaptureService.KEY_HEIGHT, "", "toString", "Z", "p", "()Z", "m", "I", "l", "()I", "o", "j", "k", "<init>", "(ZZIIII)V", "()V", "audioplayers_android_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AudioContextAndroid {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpeakerphoneOn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean stayAwake;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int contentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int usageType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int audioFocus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int audioMode;

    @SuppressLint({"InlinedApi"})
    public AudioContextAndroid() {
        this(false, false, 2, 1, 1, 0);
    }

    public AudioContextAndroid(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.isSpeakerphoneOn = z10;
        this.stayAwake = z11;
        this.contentType = i10;
        this.usageType = i11;
        this.audioFocus = i12;
        this.audioMode = i13;
    }

    public static /* synthetic */ AudioContextAndroid i(AudioContextAndroid audioContextAndroid, boolean z10, boolean z11, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z10 = audioContextAndroid.isSpeakerphoneOn;
        }
        if ((i14 & 2) != 0) {
            z11 = audioContextAndroid.stayAwake;
        }
        boolean z12 = z11;
        if ((i14 & 4) != 0) {
            i10 = audioContextAndroid.contentType;
        }
        int i15 = i10;
        if ((i14 & 8) != 0) {
            i11 = audioContextAndroid.usageType;
        }
        int i16 = i11;
        if ((i14 & 16) != 0) {
            i12 = audioContextAndroid.audioFocus;
        }
        int i17 = i12;
        if ((i14 & 32) != 0) {
            i13 = audioContextAndroid.audioMode;
        }
        return audioContextAndroid.h(z10, z12, i15, i16, i17, i13);
    }

    @k(message = "This is used for Android older than LOLLIPOP", replaceWith = @s0(expression = "buildAttributes", imports = {}))
    private final int n() {
        int i10 = this.usageType;
        if (i10 != 2) {
            return i10 != 6 ? 3 : 2;
        }
        return 0;
    }

    @dl.d
    @w0(21)
    public final AudioAttributes a() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(this.usageType).setContentType(this.contentType).build();
        f0.o(audioAttributesBuild, "Builder()\n            .s…ype)\n            .build()");
        return audioAttributesBuild;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSpeakerphoneOn() {
        return this.isSpeakerphoneOn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getStayAwake() {
        return this.stayAwake;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getUsageType() {
        return this.usageType;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof AudioContextAndroid) {
            AudioContextAndroid audioContextAndroid = (AudioContextAndroid) other;
            if (this.isSpeakerphoneOn == audioContextAndroid.isSpeakerphoneOn && this.stayAwake == audioContextAndroid.stayAwake && this.contentType == audioContextAndroid.contentType && this.usageType == audioContextAndroid.usageType && this.audioFocus == audioContextAndroid.audioFocus && this.audioMode == audioContextAndroid.audioMode) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getAudioFocus() {
        return this.audioFocus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getAudioMode() {
        return this.audioMode;
    }

    @dl.d
    public final AudioContextAndroid h(boolean isSpeakerphoneOn, boolean stayAwake, int contentType, int usageType, int audioFocus, int audioMode) {
        return new AudioContextAndroid(isSpeakerphoneOn, stayAwake, contentType, usageType, audioFocus, audioMode);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSpeakerphoneOn), Boolean.valueOf(this.stayAwake), Integer.valueOf(this.contentType), Integer.valueOf(this.usageType), Integer.valueOf(this.audioFocus), Integer.valueOf(this.audioMode));
    }

    public final int j() {
        return this.audioFocus;
    }

    public final int k() {
        return this.audioMode;
    }

    public final int l() {
        return this.contentType;
    }

    public final boolean m() {
        return this.stayAwake;
    }

    public final int o() {
        return this.usageType;
    }

    public final boolean p() {
        return this.isSpeakerphoneOn;
    }

    public final void q(@dl.d MediaPlayer player) {
        f0.p(player, "player");
        player.setAudioAttributes(a());
    }

    @dl.d
    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.isSpeakerphoneOn + ", stayAwake=" + this.stayAwake + ", contentType=" + this.contentType + ", usageType=" + this.usageType + ", audioFocus=" + this.audioFocus + ", audioMode=" + this.audioMode + ')';
    }
}
