package com.max.mediaselector.lib.adapter.holder;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.n0;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;

/* JADX INFO: compiled from: PreviewAudioHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends com.max.mediaselector.lib.adapter.holder.b {
    private static final long A = 1000;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f74868y = 3000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f74869z = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Handler f74870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f74871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f74872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f74873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f74874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SeekBar f74875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f74876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f74877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MediaPlayer f74878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f74879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f74880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f74881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f74882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f74883x;

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class a implements MediaPlayer.OnPreparedListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (PatchProxy.proxy(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, bb.c.l.Yg, new Class[]{MediaPlayer.class}, Void.TYPE).isSupported) {
                return;
            }
            if (mediaPlayer.isPlaying()) {
                f.this.f74875p.setMax(mediaPlayer.getDuration());
                f.o(f.this);
                f.p(f.this);
            } else {
                f.x(f.this);
                f.m(f.this);
                f.n(f.this, true);
            }
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Xg, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            long currentPosition = f.this.f74878s.getCurrentPosition();
            String strC = com.max.mediaselector.lib.utils.g.c(currentPosition);
            if (!TextUtils.equals(strC, f.this.f74874o.getText())) {
                f.this.f74874o.setText(strC);
                if (((long) f.this.f74878s.getDuration()) - currentPosition > 1000) {
                    f.this.f74875p.setProgress((int) currentPosition);
                } else {
                    f fVar = f.this;
                    fVar.f74875p.setProgress(fVar.f74878s.getDuration());
                }
            }
            f.this.f74870k.postDelayed(this, 1000 - (currentPosition % 1000));
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.Zg, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.q(f.this);
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34027ah, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.r(f.this);
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{seekBar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.f34050bh, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                seekBar.setProgress(i10);
                f.s(f.this, i10);
                if (f.this.f74878s.isPlaying()) {
                    f.this.f74878s.seekTo(seekBar.getProgress());
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.max.mediaselector.lib.adapter.holder.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class ViewOnClickListenerC0603f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0603f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.mediaselector.lib.adapter.holder.b.d dVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34073ch, new Class[]{View.class}, Void.TYPE).isSupported || (dVar = f.this.f74838g) == null) {
                return;
            }
            dVar.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f74891c;

        g(LocalMedia localMedia, String str) {
            this.f74890b = localMedia;
            this.f74891c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34096dh, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                if (com.max.mediaselector.lib.utils.i.a()) {
                    return;
                }
                f.this.f74838g.b(this.f74890b.y());
                if (f.this.f74878s.isPlaying()) {
                    f.t(f.this);
                } else if (f.this.f74879t) {
                    f.v(f.this);
                } else {
                    f.w(f.this, this.f74891c);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class h implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalMedia f74893b;

        h(LocalMedia localMedia) {
            this.f74893b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34119eh, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.mediaselector.lib.adapter.holder.b.d dVar = f.this.f74838g;
            if (dVar != null) {
                dVar.a(this.f74893b);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class i implements MediaPlayer.OnCompletionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (PatchProxy.proxy(new Object[]{mediaPlayer}, this, changeQuickRedirect, false, bb.c.l.f34142fh, new Class[]{MediaPlayer.class}, Void.TYPE).isSupported) {
                return;
            }
            f.x(f.this);
            f.m(f.this);
            f.n(f.this, true);
        }
    }

    /* JADX INFO: compiled from: PreviewAudioHolder.java */
    public class j implements MediaPlayer.OnErrorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            Object[] objArr = {mediaPlayer, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34165gh, new Class[]{MediaPlayer.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f.m(f.this);
            f.n(f.this, true);
            return false;
        }
    }

    public f(@n0 View view) {
        super(view);
        this.f74870k = new Handler(Looper.getMainLooper());
        this.f74878s = new MediaPlayer();
        this.f74879t = false;
        this.f74880u = new b();
        this.f74881v = new i();
        this.f74882w = new j();
        this.f74883x = new a();
        this.f74871l = (ImageView) view.findViewById(R.id.iv_play_video);
        this.f74872m = (TextView) view.findViewById(R.id.tv_audio_name);
        this.f74874o = (TextView) view.findViewById(R.id.tv_current_time);
        this.f74873n = (TextView) view.findViewById(R.id.tv_total_duration);
        this.f74875p = (SeekBar) view.findViewById(R.id.music_seek_bar);
        this.f74876q = (ImageView) view.findViewById(R.id.iv_play_back);
        this.f74877r = (ImageView) view.findViewById(R.id.iv_play_fast);
    }

    private void A(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Eg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        M();
        if (z10) {
            this.f74875p.setProgress(0);
            this.f74874o.setText("00:00");
        }
        F(false);
        this.f74871l.setImageResource(R.drawable.ps_ic_audio_play);
        com.max.mediaselector.lib.adapter.holder.b.d dVar = this.f74838g;
        if (dVar != null) {
            dVar.b(null);
        }
    }

    private void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Fg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        L();
        F(true);
        this.f74871l.setImageResource(R.drawable.ps_ic_audio_stop);
    }

    private void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34569yg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74879t = false;
        this.f74878s.stop();
        this.f74878s.reset();
    }

    private void E() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34547xg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74878s.seekTo(this.f74875p.getProgress());
        this.f74878s.start();
        L();
        B();
    }

    private void F(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Gg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74876q.setEnabled(z10);
        this.f74877r.setEnabled(z10);
        if (z10) {
            this.f74876q.setAlpha(1.0f);
            this.f74877r.setAlpha(1.0f);
        } else {
            this.f74876q.setAlpha(0.5f);
            this.f74877r.setAlpha(0.5f);
        }
    }

    private void G(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34591zg, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f74874o.setText(com.max.mediaselector.lib.utils.g.c(i10));
    }

    private void H() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Kg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74878s.setOnCompletionListener(this.f74881v);
        this.f74878s.setOnErrorListener(this.f74882w);
        this.f74878s.setOnPreparedListener(this.f74883x);
    }

    private void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Lg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74878s.setOnCompletionListener(null);
        this.f74878s.setOnErrorListener(null);
        this.f74878s.setOnPreparedListener(null);
    }

    private void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Bg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74875p.getProgress() < 3000) {
            this.f74875p.setProgress(0);
        } else {
            SeekBar seekBar = this.f74875p;
            seekBar.setProgress((int) (((long) seekBar.getProgress()) - 3000));
        }
        G(this.f74875p.getProgress());
        this.f74878s.seekTo(this.f74875p.getProgress());
    }

    private void K(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34503vg, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (com.max.mediaselector.lib.config.f.c(str)) {
                this.f74878s.setDataSource(this.itemView.getContext(), Uri.parse(str));
            } else {
                this.f74878s.setDataSource(str);
            }
            this.f74878s.prepare();
            this.f74878s.seekTo(this.f74875p.getProgress());
            this.f74878s.start();
            this.f74879t = false;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Cg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74870k.post(this.f74880u);
    }

    private void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Dg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74870k.removeCallbacks(this.f74880u);
    }

    static /* synthetic */ void m(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Tg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.D();
    }

    static /* synthetic */ void n(f fVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Ug, new Class[]{f.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fVar.A(z10);
    }

    static /* synthetic */ void o(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Vg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.L();
    }

    static /* synthetic */ void p(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Wg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.B();
    }

    static /* synthetic */ void q(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Mg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.J();
    }

    static /* synthetic */ void r(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Ng, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.y();
    }

    static /* synthetic */ void s(f fVar, int i10) {
        if (PatchProxy.proxy(new Object[]{fVar, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.Og, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        fVar.G(i10);
    }

    static /* synthetic */ void t(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Pg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.z();
    }

    static /* synthetic */ void v(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Qg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.E();
    }

    static /* synthetic */ void w(f fVar, String str) {
        if (PatchProxy.proxy(new Object[]{fVar, str}, null, changeQuickRedirect, true, bb.c.l.Rg, new Class[]{f.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.K(str);
    }

    static /* synthetic */ void x(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, null, changeQuickRedirect, true, bb.c.l.Sg, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        fVar.M();
    }

    private void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ag, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f74875p.getProgress() > 3000) {
            SeekBar seekBar = this.f74875p;
            seekBar.setProgress(seekBar.getMax());
        } else {
            SeekBar seekBar2 = this.f74875p;
            seekBar2.setProgress((int) (((long) seekBar2.getProgress()) + 3000));
        }
        G(this.f74875p.getProgress());
        this.f74878s.seekTo(this.f74875p.getProgress());
    }

    private void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34525wg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74878s.pause();
        this.f74879t = true;
        A(false);
        M();
    }

    public void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Jg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74870k.removeCallbacks(this.f74880u);
        if (this.f74878s != null) {
            I();
            this.f74878s.release();
            this.f74878s = null;
        }
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void a(LocalMedia localMedia, int i10) {
        if (PatchProxy.proxy(new Object[]{localMedia, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34481ug, new Class[]{LocalMedia.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strB = localMedia.b();
        String strH = com.max.mediaselector.lib.utils.g.h(localMedia.v());
        String strH2 = n.h(localMedia.L(), 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(localMedia.y());
        sb2.append("\n");
        sb2.append(strH);
        sb2.append(" - ");
        sb2.append(strH2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        String str = strH + " - " + strH2;
        int iIndexOf = sb2.indexOf(str);
        int length = str.length() + iIndexOf;
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(com.max.mediaselector.lib.utils.h.a(this.itemView.getContext(), 12.0f)), iIndexOf, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-10132123), iIndexOf, length, 17);
        this.f74872m.setText(spannableStringBuilder);
        this.f74873n.setText(com.max.mediaselector.lib.utils.g.c(localMedia.w()));
        this.f74875p.setMax((int) localMedia.w());
        F(false);
        this.f74876q.setOnClickListener(new c());
        this.f74877r.setOnClickListener(new d());
        this.f74875p.setOnSeekBarChangeListener(new e());
        this.itemView.setOnClickListener(new ViewOnClickListenerC0603f());
        this.f74871l.setOnClickListener(new g(localMedia, strB));
        this.itemView.setOnLongClickListener(new h(localMedia));
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Hg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74879t = false;
        H();
        A(true);
    }

    @Override // com.max.mediaselector.lib.adapter.holder.b
    public void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ig, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f74879t = false;
        this.f74870k.removeCallbacks(this.f74880u);
        I();
        D();
        A(true);
    }
}
