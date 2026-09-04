package com.max.hbcustomview.simplevideo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.widget.RelativeLayout;
import androidx.annotation.w0;
import bb.c;
import com.max.hbcustomview.simplevideo.SimpleVideoPlayerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SimpleVideoPlayerView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SimpleVideoPlayerView extends RelativeLayout implements TextureView.SurfaceTextureListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private AudioRequestMode f69464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a f69465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private AudioFocusRequest f69467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private AudioManager.OnAudioFocusChangeListener f69468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private AudioManager f69469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private MediaPlayer f69473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private TResizableTextureView f69474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private SurfaceTexture f69475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private Surface f69476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f69477o;

    /* JADX INFO: compiled from: SimpleVideoPlayerView.kt */
    public enum AudioRequestMode {
        NONE,
        GAIN,
        TRANSIENT,
        DUCK,
        EXCLUSIVE;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());
        public static ChangeQuickRedirect changeQuickRedirect;

        @d
        public static kotlin.enums.a<AudioRequestMode> getEntries() {
            return $ENTRIES;
        }

        public static AudioRequestMode valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.f.mr, new Class[]{String.class}, AudioRequestMode.class);
            return (AudioRequestMode) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(AudioRequestMode.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static AudioRequestMode[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.f.lr, new Class[0], AudioRequestMode[].class);
            return (AudioRequestMode[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: SimpleVideoPlayerView.kt */
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: SimpleVideoPlayerView.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69478a;

        static {
            int[] iArr = new int[AudioRequestMode.valuesCustom().length];
            try {
                iArr[AudioRequestMode.GAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioRequestMode.DUCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioRequestMode.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioRequestMode.EXCLUSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f69478a = iArr;
        }
    }

    public SimpleVideoPlayerView(@e Context context) throws IOException {
        super(context);
        this.f69464b = AudioRequestMode.NONE;
        this.f69472j = true;
        this.f69477o = SimpleVideoPlayerView.class.getSimpleName();
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        TResizableTextureView tResizableTextureView = new TResizableTextureView(context2);
        this.f69474l = tResizableTextureView;
        tResizableTextureView.setScreenScale(com.max.hbcustomview.simplevideo.a.C0561a.f69483a);
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (tResizableTextureView2 != null) {
            tResizableTextureView2.setSurfaceTextureListener(this);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f69474l, layoutParams);
        f();
        d();
    }

    public SimpleVideoPlayerView(@e Context context, @e AttributeSet attributeSet) throws IOException {
        super(context, attributeSet);
        this.f69464b = AudioRequestMode.NONE;
        this.f69472j = true;
        this.f69477o = SimpleVideoPlayerView.class.getSimpleName();
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        TResizableTextureView tResizableTextureView = new TResizableTextureView(context2);
        this.f69474l = tResizableTextureView;
        tResizableTextureView.setScreenScale(com.max.hbcustomview.simplevideo.a.C0561a.f69483a);
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (tResizableTextureView2 != null) {
            tResizableTextureView2.setSurfaceTextureListener(this);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f69474l, layoutParams);
        f();
        d();
    }

    public SimpleVideoPlayerView(@e Context context, @e AttributeSet attributeSet, int i10) throws IOException {
        super(context, attributeSet, i10);
        this.f69464b = AudioRequestMode.NONE;
        this.f69472j = true;
        this.f69477o = SimpleVideoPlayerView.class.getSimpleName();
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        TResizableTextureView tResizableTextureView = new TResizableTextureView(context2);
        this.f69474l = tResizableTextureView;
        tResizableTextureView.setScreenScale(com.max.hbcustomview.simplevideo.a.C0561a.f69483a);
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (tResizableTextureView2 != null) {
            tResizableTextureView2.setSurfaceTextureListener(this);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f69474l, layoutParams);
        f();
        d();
    }

    public SimpleVideoPlayerView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) throws IOException {
        super(context, attributeSet, i10, i11);
        this.f69464b = AudioRequestMode.NONE;
        this.f69472j = true;
        this.f69477o = SimpleVideoPlayerView.class.getSimpleName();
        Context context2 = getContext();
        f0.o(context2, "getContext(...)");
        TResizableTextureView tResizableTextureView = new TResizableTextureView(context2);
        this.f69474l = tResizableTextureView;
        tResizableTextureView.setScreenScale(com.max.hbcustomview.simplevideo.a.C0561a.f69483a);
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (tResizableTextureView2 != null) {
            tResizableTextureView2.setSurfaceTextureListener(this);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f69474l, layoutParams);
        f();
        d();
    }

    private final void d() throws IOException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.dr, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.d(this.f69477o, "attach() called");
        SurfaceTexture surfaceTexture = this.f69475m;
        if (surfaceTexture != null) {
            Surface surface = this.f69476n;
            if (surface != null) {
                surface.release();
            }
            Surface surface2 = new Surface(surfaceTexture);
            this.f69476n = surface2;
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface2);
            }
            this.f69471i = true;
            if (this.f69472j) {
                p();
            }
        }
    }

    private final AudioAttributes e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Iq, new Class[0], AudioAttributes.class);
        if (patchProxyResultProxy.isSupported) {
            return (AudioAttributes) patchProxyResultProxy.result;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        f0.o(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SimpleVideoPlayerView this$0, MediaPlayer mediaPlayer, int i10, int i11) {
        Object[] objArr = {this$0, mediaPlayer, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.f.jr, new Class[]{SimpleVideoPlayerView.class, MediaPlayer.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        int videoWidth = mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
        int videoHeight = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 0;
        if (videoHeight == 0 || videoWidth == 0) {
            return;
        }
        SurfaceTexture surfaceTexture = this$0.f69475m;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(videoWidth, videoHeight);
        }
        this$0.requestLayout();
        TResizableTextureView tResizableTextureView = this$0.f69474l;
        if (tResizableTextureView != null) {
            tResizableTextureView.a(videoWidth, videoHeight);
        }
    }

    private final void j() {
        a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Oq, new Class[0], Void.TYPE).isSupported || (aVar = this.f69465c) == null) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f69465c = null;
    }

    private final void k() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Lq, new Class[0], Void.TYPE).isSupported && this.f69469g == null) {
            Object systemService = getContext().getSystemService("audio");
            f0.n(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.f69469g = (AudioManager) systemService;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SimpleVideoPlayerView this$0, MediaPlayer mediaPlayer) {
        if (PatchProxy.proxy(new Object[]{this$0, mediaPlayer}, null, changeQuickRedirect, true, c.f.kr, new Class[]{SimpleVideoPlayerView.class, MediaPlayer.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.f69470h = true;
        this$0.s();
        MediaPlayer mediaPlayer2 = this$0.f69473k;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
        }
        this$0.j();
    }

    private final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Nq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f69468f;
            if (onAudioFocusChangeListener != null) {
                AudioManager audioManager = this.f69469g;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
                this.f69469g = null;
                return;
            }
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f69467e;
        if (audioFocusRequest != null) {
            AudioManager audioManager2 = this.f69469g;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.f69469g = null;
        }
    }

    private final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Mq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            t();
        } else {
            u();
        }
    }

    @w0(26)
    private final void t() {
        AudioFocusRequest.Builder focusGain;
        AudioManager audioManager;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Kq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f69478a[this.f69464b.ordinal()];
        if (i10 == 1) {
            focusGain = new AudioFocusRequest.Builder(1).setFocusGain(1);
        } else if (i10 == 2) {
            focusGain = new AudioFocusRequest.Builder(3).setFocusGain(3);
        } else if (i10 == 3) {
            focusGain = new AudioFocusRequest.Builder(2).setFocusGain(2);
        } else if (i10 != 4) {
            return;
        } else {
            focusGain = new AudioFocusRequest.Builder(4).setFocusGain(4);
        }
        this.f69467e = focusGain.setAudioAttributes(e()).build();
        k();
        AudioFocusRequest audioFocusRequest = this.f69467e;
        if (audioFocusRequest == null || (audioManager = this.f69469g) == null) {
            return;
        }
        audioManager.requestAudioFocus(audioFocusRequest);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private final void u() {
        AudioRequestMode audioRequestMode;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Jq, new Class[0], Void.TYPE).isSupported || (audioRequestMode = this.f69464b) == AudioRequestMode.NONE) {
            return;
        }
        int i10 = b.f69478a[audioRequestMode.ordinal()];
        int i11 = 4;
        if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 3;
        } else if (i10 == 3) {
            i11 = 2;
        } else if (i10 != 4) {
            i11 = 1;
        }
        k();
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: hc.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i12) throws IOException {
                SimpleVideoPlayerView.v(this.f119160b, i12);
            }
        };
        this.f69468f = onAudioFocusChangeListener;
        AudioManager audioManager = this.f69469g;
        if (audioManager != null) {
            audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SimpleVideoPlayerView this$0, int i10) throws IOException {
        if (PatchProxy.proxy(new Object[]{this$0, new Integer(i10)}, null, changeQuickRedirect, true, c.f.ir, new Class[]{SimpleVideoPlayerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (i10 == -2) {
            this$0.o();
        } else if (i10 == -1) {
            this$0.w();
        } else {
            if (i10 != 1) {
                return;
            }
            this$0.p();
        }
    }

    public final void f() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Vq, new Class[0], Void.TYPE).isSupported && this.f69473k == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f69473k = mediaPlayer;
            mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: hc.c
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i10, int i11) {
                    SimpleVideoPlayerView.g(this.f119161a, mediaPlayer2, i10, i11);
                }
            });
        }
    }

    public final String getTAG() {
        return this.f69477o;
    }

    public final void h(boolean z10) {
        this.f69466d = z10;
    }

    public final void i(boolean z10) {
        MediaPlayer mediaPlayer;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.Wq, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (mediaPlayer = this.f69473k) == null) {
            return;
        }
        mediaPlayer.setLooping(z10);
    }

    public final boolean l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.ar, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.f69473k;
        if (mediaPlayer == null || mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public final void m() {
        MediaPlayer mediaPlayer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.br, new Class[0], Void.TYPE).isSupported || (mediaPlayer = this.f69473k) == null) {
            return;
        }
        mediaPlayer.setVolume(0.0f, 0.0f);
    }

    public final void n() {
        MediaPlayer mediaPlayer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.cr, new Class[0], Void.TYPE).isSupported || (mediaPlayer = this.f69473k) == null) {
            return;
        }
        mediaPlayer.setVolume(1.0f, 1.0f);
    }

    public final void o() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Yq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MediaPlayer mediaPlayer = this.f69473k;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            z10 = true;
        }
        if (z10) {
            MediaPlayer mediaPlayer2 = this.f69473k;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
            r();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@d SurfaceTexture surfaceTexture, int i10, int i11) throws IOException {
        TResizableTextureView tResizableTextureView;
        Object[] objArr = {surfaceTexture, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.er, new Class[]{SurfaceTexture.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(surfaceTexture, "surfaceTexture");
        if (this.f69475m == null) {
            this.f69475m = surfaceTexture;
            d();
            return;
        }
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (f0.g(tResizableTextureView2 != null ? tResizableTextureView2.getSurfaceTexture() : null, surfaceTexture) || (tResizableTextureView = this.f69474l) == null) {
            return;
        }
        tResizableTextureView.setSurfaceTexture(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@d SurfaceTexture surfaceTexture) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, c.f.gr, new Class[]{SurfaceTexture.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(surfaceTexture, "surfaceTexture");
        Log.d(this.f69477o, "onSurfaceTextureDestroyed() called with: surfaceTexture = " + surfaceTexture);
        this.f69475m = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@d SurfaceTexture surfaceTexture, int i10, int i11) {
        TResizableTextureView tResizableTextureView;
        Object[] objArr = {surfaceTexture, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.fr, new Class[]{SurfaceTexture.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(surfaceTexture, "surfaceTexture");
        Log.d(this.f69477o, "onSurfaceTextureSizeChanged() called with: surfaceTexture = " + this.f69476n + ", width = " + i10 + ", height = " + i11);
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (f0.g(tResizableTextureView2 != null ? tResizableTextureView2.getSurfaceTexture() : null, surfaceTexture) || (tResizableTextureView = this.f69474l) == null) {
            return;
        }
        tResizableTextureView.setSurfaceTexture(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@d SurfaceTexture surfaceTexture) {
        TResizableTextureView tResizableTextureView;
        if (PatchProxy.proxy(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, c.f.hr, new Class[]{SurfaceTexture.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(surfaceTexture, "surfaceTexture");
        TResizableTextureView tResizableTextureView2 = this.f69474l;
        if (f0.g(tResizableTextureView2 != null ? tResizableTextureView2.getSurfaceTexture() : null, surfaceTexture) || (tResizableTextureView = this.f69474l) == null) {
            return;
        }
        tResizableTextureView.setSurfaceTexture(surfaceTexture);
    }

    public final void p() throws IOException {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Xq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f69470h) {
            s();
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            j();
            return;
        }
        MediaPlayer mediaPlayer2 = this.f69473k;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: hc.a
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    SimpleVideoPlayerView.q(this.f119159a, mediaPlayer3);
                }
            });
        }
        if (this.f69466d) {
            MediaPlayer mediaPlayer3 = this.f69473k;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepareAsync();
                return;
            }
            return;
        }
        MediaPlayer mediaPlayer4 = this.f69473k;
        if (mediaPlayer4 != null) {
            mediaPlayer4.prepare();
        }
    }

    public final void setAudioRequestMode(@d AudioRequestMode mode) {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, c.f.Pq, new Class[]{AudioRequestMode.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mode, "mode");
        this.f69464b = mode;
    }

    public final void setDataSource(@d Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, c.f.Qq, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uri, "uri");
        try {
            f();
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), uri);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
        }
    }

    public final void setDataSource(@d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, c.f.Rq, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        try {
            f();
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), Uri.parse(path));
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void setDataSourceAndPlay(@d Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, c.f.Tq, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uri, "uri");
        try {
            f();
            Log.d("cqtest", "setData");
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), uri);
            }
            if (this.f69471i) {
                p();
            } else {
                this.f69472j = true;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
        }
    }

    public final void setDataSourceAndPlay(@d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, c.f.Uq, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        try {
            f();
            Log.d("cqtest", "setData");
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), Uri.parse(path));
            }
            if (this.f69471i) {
                p();
            } else {
                this.f69472j = true;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void setDataSourceAndPlayWithAction(@d Uri uri, @d a playAction) {
        if (PatchProxy.proxy(new Object[]{uri, playAction}, this, changeQuickRedirect, false, c.f.Sq, new Class[]{Uri.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uri, "uri");
        f0.p(playAction, "playAction");
        try {
            f();
            MediaPlayer mediaPlayer = this.f69473k;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), uri);
            }
            this.f69465c = playAction;
            if (this.f69471i) {
                p();
            } else {
                this.f69472j = true;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
        }
    }

    public final void w() {
        MediaPlayer mediaPlayer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Zq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MediaPlayer mediaPlayer2 = this.f69473k;
        if ((mediaPlayer2 != null && mediaPlayer2.isPlaying()) && (mediaPlayer = this.f69473k) != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer3 = this.f69473k;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
        }
        this.f69473k = null;
        this.f69470h = false;
        r();
    }
}
