package com.max.video.impl;

import af.m;
import af.n;
import af.o;
import af.p;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.max.hbvideo.R;
import com.max.video.AbsVideoView;
import com.max.video.ui.BottomPanel;
import com.max.video.ui.CenterPanel;
import com.max.video.ui.TopPanel;
import com.max.video.ui.UIState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;

/* JADX INFO: compiled from: PlainVideoUI.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nPlainVideoUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlainVideoUI.kt\ncom/max/video/impl/PlainVideoUI\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,893:1\n254#2,2:894\n1#3:896\n1855#4,2:897\n*S KotlinDebug\n*F\n+ 1 PlainVideoUI.kt\ncom/max/video/impl/PlainVideoUI\n*L\n87#1:894,2\n286#1:897,2\n*E\n"})
public class PlainVideoUI extends FrameLayout implements ze.d, af.b, p, af.d, af.c, af.l {

    @dl.d
    public static final a K = new a(null);
    public static final long L = 3000;
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 3;
    public static final int P = 4;
    public static final int Q = 5;
    public static final int R = 6;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private AnimationDrawable A;

    @dl.d
    private final Handler B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;

    @dl.d
    private final ArrayList<o> H;

    @dl.d
    private final com.max.video.device.c I;

    @dl.e
    private com.max.video.device.c.a J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final xd.i f75934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f75935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f75936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f75938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private UIState f75940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private TopPanel f75941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private CenterPanel f75942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private BottomPanel f75943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private com.max.video.ui.widget.e f75944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f75945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f75946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f75947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private PopupWindow f75948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Integer> f75949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final u<Integer> f75950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Boolean> f75951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f75952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Boolean> f75953u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f75954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<Boolean> f75955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f75956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f75957y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f75958z;

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class b implements SeekBar.OnSeekBarChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f75959a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.c f75961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75962d;

        b(ze.c cVar, AbsVideoView absVideoView) {
            this.f75961c = cVar;
            this.f75962d = absVideoView;
        }

        public final int a() {
            return this.f75959a;
        }

        public final void b(int i10) {
            this.f75959a = i10;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@dl.e SeekBar seekBar, int i10, boolean z10) {
            if (!PatchProxy.proxy(new Object[]{seekBar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.fm, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
                this.f75959a = i10;
                Iterator it = PlainVideoUI.this.H.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).f(i10, seekBar != null ? seekBar.getMax() : 0);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@dl.e SeekBar seekBar) {
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, bb.c.m.gm, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75937e = true;
            ((n) this.f75961c).setDraggingSeek(true);
            PlainVideoUI.this.n(false, 3, 0L);
            this.f75959a = -1;
            Iterator it = PlainVideoUI.this.H.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@dl.e SeekBar seekBar) {
            com.max.video.player.a player;
            if (PatchProxy.proxy(new Object[]{seekBar}, this, changeQuickRedirect, false, bb.c.m.hm, new Class[]{SeekBar.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75937e = false;
            ((n) this.f75961c).setDraggingSeek(false);
            PlainVideoUI.this.d(true, 3);
            if (this.f75959a != -1 && (player = this.f75962d.getPlayer()) != null) {
                player.B(this.f75959a);
            }
            Iterator it = PlainVideoUI.this.H.iterator();
            while (it.hasNext()) {
                ((o) it.next()).e();
            }
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class c implements ze.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f76022a;

        c(AbsVideoView absVideoView) {
            this.f76022a = absVideoView;
        }

        @Override // ze.a
        public void a(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Gm, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                com.max.video.player.a player = this.f76022a.getPlayer();
                if (player != null) {
                    player.play();
                    return;
                }
                return;
            }
            com.max.video.player.a player2 = this.f76022a.getPlayer();
            if (player2 != null) {
                player2.pause();
            }
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class d extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, bb.c.m.ln, new Class[]{Message.class}, Void.TYPE).isSupported) {
            }
            f0.p(msg, "msg");
            int i10 = msg.arg1;
            int i11 = msg.arg2;
            switch (msg.what) {
                case 1:
                    PlainVideoUI.this.R();
                    if (i10 == 0) {
                        PlainVideoUI.K(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 1) {
                        PlainVideoUI.I(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 2) {
                        PlainVideoUI.H(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 3) {
                        PlainVideoUI.K(PlainVideoUI.this, i11 == 1);
                        PlainVideoUI.H(PlainVideoUI.this, i11 == 1);
                        PlainVideoUI.J(PlainVideoUI.this);
                        break;
                    }
                    break;
                case 2:
                    PlainVideoUI.this.Q();
                    if (i10 == 0) {
                        PlainVideoUI.D(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 1) {
                        PlainVideoUI.B(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 2) {
                        PlainVideoUI.A(PlainVideoUI.this, i11 == 1);
                        break;
                    } else if (i10 == 3) {
                        PlainVideoUI.D(PlainVideoUI.this, i11 == 1);
                        PlainVideoUI.A(PlainVideoUI.this, i11 == 1);
                        PlainVideoUI.C(PlainVideoUI.this);
                        break;
                    }
                    break;
                case 3:
                    PlainVideoUI.J(PlainVideoUI.this);
                    break;
                case 4:
                    PlainVideoUI.C(PlainVideoUI.this);
                    break;
                case 5:
                    PlainVideoUI.this.f75934b.f141310n.setVisibility(0);
                    break;
                case 6:
                    PlainVideoUI.this.f75934b.f141310n.setVisibility(8);
                    break;
            }
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class e implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.mn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141298b.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class f implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.nn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141299c.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class g implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.on, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141302f.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class h implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.pn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141306j.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class i implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.qn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141298b.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class j implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.rn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141299c.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class k implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.sn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141302f.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class l implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.e Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.e Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.tn, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PlainVideoUI.this.f75934b.f141306j.setVisibility(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlainVideoUI(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlainVideoUI(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainVideoUI(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        xd.i iVarD = xd.i.d(LayoutInflater.from(getContext()), this, true);
        f0.o(iVarD, "inflate(...)");
        this.f75934b = iVarD;
        this.f75940h = UIState.Default;
        this.f75945m = true;
        this.f75946n = true;
        this.f75947o = true;
        kotlinx.coroutines.flow.j<Integer> jVarA = v.a(0);
        this.f75949q = jVarA;
        this.f75950r = jVarA;
        Boolean bool = Boolean.FALSE;
        kotlinx.coroutines.flow.j<Boolean> jVarA2 = v.a(bool);
        this.f75951s = jVarA2;
        this.f75952t = jVarA2;
        kotlinx.coroutines.flow.j<Boolean> jVarA3 = v.a(bool);
        this.f75953u = jVarA3;
        this.f75954v = jVarA3;
        kotlinx.coroutines.flow.j<Boolean> jVarA4 = v.a(bool);
        this.f75955w = jVarA4;
        this.f75956x = jVarA4;
        this.B = new d(Looper.getMainLooper());
        this.G = true;
        this.H = new ArrayList<>();
        this.I = new com.max.video.device.c();
    }

    public static final /* synthetic */ void A(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 12319, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.M(z10);
    }

    public static final /* synthetic */ void B(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.Gl, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.N(z10);
    }

    public static final /* synthetic */ void C(PlainVideoUI plainVideoUI) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI}, null, changeQuickRedirect, true, bb.c.m.Ml, new Class[]{PlainVideoUI.class}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.O();
    }

    public static final /* synthetic */ void D(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 12318, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.P(z10);
    }

    public static final /* synthetic */ void H(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 12316, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.S(z10);
    }

    public static final /* synthetic */ void I(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 12313, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.T(z10);
    }

    public static final /* synthetic */ void J(PlainVideoUI plainVideoUI) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI}, null, changeQuickRedirect, true, 12317, new Class[]{PlainVideoUI.class}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.U();
    }

    public static final /* synthetic */ void K(PlainVideoUI plainVideoUI, boolean z10) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.Hl, new Class[]{PlainVideoUI.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        plainVideoUI.V(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(PlainVideoUI this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 12312, new Class[]{PlainVideoUI.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f75936d) {
            this$0.unlock();
            this$0.f75934b.f141302f.setImageResource(R.drawable.video_unlock_line_24x24);
            this$0.n(false, 3, 3000L);
        } else {
            this$0.lock();
            this$0.f75934b.f141302f.setImageResource(R.drawable.video_lock_line_24x24);
            this$0.d(false, 3);
        }
    }

    private final void M(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12311, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141298b.getVisibility() != 0 || this.C) {
            return;
        }
        this.f75955w.setValue(Boolean.FALSE);
        if (!z10) {
            this.f75934b.f141298b.setVisibility(8);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_out);
        this.f75934b.f141298b.clearAnimation();
        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
        animationLoadAnimation.setAnimationListener(new e());
        this.f75934b.f141298b.startAnimation(animationLoadAnimation);
    }

    private final void N(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12310, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141299c.getVisibility() != 0 || this.D) {
            return;
        }
        this.f75953u.setValue(Boolean.FALSE);
        if (!z10) {
            this.f75934b.f141299c.setVisibility(8);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_out);
        this.f75934b.f141299c.clearAnimation();
        animationLoadAnimation.setAnimationListener(new f());
        this.f75934b.f141299c.startAnimation(animationLoadAnimation);
    }

    private final void O() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34688dl, new Class[0], Void.TYPE).isSupported || this.f75934b.f141302f.getVisibility() == 8) {
            return;
        }
        if (this.f75936d) {
            this.f75934b.f141302f.setImageResource(R.drawable.video_lock_line_24x24);
        } else {
            this.f75934b.f141302f.setImageResource(R.drawable.video_unlock_line_24x24);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_quick_fade_out);
        animationLoadAnimation.setAnimationListener(new g());
        this.f75934b.f141302f.startAnimation(animationLoadAnimation);
    }

    private final void P(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12309, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141306j.getVisibility() != 0 || this.C) {
            return;
        }
        this.f75951s.setValue(Boolean.FALSE);
        if (!z10) {
            this.f75934b.f141306j.setVisibility(8);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_out);
        this.f75934b.f141306j.clearAnimation();
        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
        animationLoadAnimation.setAnimationListener(new h());
        this.f75934b.f141306j.startAnimation(animationLoadAnimation);
    }

    private final void S(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12308, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141298b.getVisibility() == 0 || this.f75936d || !getEnableBottom() || getUiState() != UIState.Default) {
            return;
        }
        this.f75955w.setValue(Boolean.TRUE);
        if (!z10 || this.E) {
            this.f75934b.f141298b.setVisibility(0);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_in);
        this.f75934b.f141298b.clearAnimation();
        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
        animationLoadAnimation.setAnimationListener(new i());
        this.f75934b.f141298b.startAnimation(animationLoadAnimation);
    }

    private final void T(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12307, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141299c.getVisibility() == 0 || this.f75936d || !getEnableCenter() || getUiState() != UIState.Default) {
            return;
        }
        this.f75953u.setValue(Boolean.TRUE);
        if (!z10 || this.D) {
            this.f75934b.f141299c.setVisibility(0);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_in);
        this.f75934b.f141299c.clearAnimation();
        animationLoadAnimation.setAnimationListener(new j());
        this.f75934b.f141299c.startAnimation(animationLoadAnimation);
    }

    private final void U() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34664cl, new Class[0], Void.TYPE).isSupported || !this.f75935c || this.f75934b.f141302f.getVisibility() == 0) {
            return;
        }
        if (this.f75936d) {
            this.f75934b.f141302f.setImageResource(R.drawable.video_lock_line_24x24);
        } else {
            this.f75934b.f141302f.setImageResource(R.drawable.video_unlock_line_24x24);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_quick_fade_in);
        animationLoadAnimation.setAnimationListener(new k());
        this.f75934b.f141302f.startAnimation(animationLoadAnimation);
    }

    private final void V(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12306, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f75934b.f141306j.getVisibility() == 0 || this.f75936d || !getEnableTop() || getUiState() != UIState.Default) {
            return;
        }
        this.f75951s.setValue(Boolean.TRUE);
        if (!z10 || this.C) {
            this.f75934b.f141306j.setVisibility(0);
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.video_view_fade_in);
        this.f75934b.f141306j.clearAnimation();
        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
        animationLoadAnimation.setAnimationListener(new l());
        this.f75934b.f141306j.startAnimation(animationLoadAnimation);
    }

    public void Q() {
    }

    public void R() {
    }

    @Override // af.c
    public void a() {
        com.max.video.ui.widget.e completedPanel;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34941ol, new Class[0], Void.TYPE).isSupported || (completedPanel = getCompletedPanel()) == null) {
            return;
        }
        setUiState(UIState.Default);
        this.f75934b.f141308l.setVisibility(0);
        this.f75934b.f141308l.removeAllViews();
        this.f75934b.f141308l.addView(completedPanel.c(), new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        f0.o(context, "getContext(...)");
        completedPanel.b(context, this);
        d(false, 3);
        this.f75934b.f141311o.setVisibility(8);
    }

    @Override // ze.d
    public void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75934b.f141301e.setVisibility(0);
        this.f75934b.f141308l.setVisibility(8);
    }

    @Override // af.l
    public void c(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.vl, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        setPopupMenuWindow(new PopupWindow(view, -2, -1));
        PopupWindow popupMenuWindow = getPopupMenuWindow();
        if (popupMenuWindow != null) {
            popupMenuWindow.setOutsideTouchable(true);
        }
        PopupWindow popupMenuWindow2 = getPopupMenuWindow();
        if (popupMenuWindow2 != null) {
            popupMenuWindow2.setBackgroundDrawable(new ColorDrawable(0));
        }
        PopupWindow popupMenuWindow3 = getPopupMenuWindow();
        if (popupMenuWindow3 != null) {
            popupMenuWindow3.setAnimationStyle(R.style.VideoRightMenuWindowAnimation);
        }
        PopupWindow popupMenuWindow4 = getPopupMenuWindow();
        if (popupMenuWindow4 != null) {
            popupMenuWindow4.setFocusable(false);
        }
        PopupWindow popupMenuWindow5 = getPopupMenuWindow();
        if (popupMenuWindow5 != null) {
            popupMenuWindow5.setClippingEnabled(false);
        }
        PopupWindow popupMenuWindow6 = getPopupMenuWindow();
        if (popupMenuWindow6 != null) {
            popupMenuWindow6.showAtLocation(this.f75934b.b(), 21, 0, 0);
        }
        PopupWindow popupMenuWindow7 = getPopupMenuWindow();
        if (popupMenuWindow7 != null) {
            popupMenuWindow7.setFocusable(true);
        }
        Activity activityA = ye.a.f141789a.a(getContext());
        if (activityA != null) {
            ye.b.f141790a.m(activityA);
        }
        d(false, 3);
    }

    @Override // ze.d
    public void d(boolean z10, int i10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f34895ml, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B.removeMessages(2);
        this.B.removeMessages(1);
        Handler handler = this.B;
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i10;
        messageObtain.arg2 = z10 ? 1 : 0;
        handler.sendMessage(messageObtain);
    }

    @Override // ze.d
    @dl.d
    public ze.d e() {
        this.f75935c = false;
        return this;
    }

    @Override // af.c
    public void f(@dl.e com.max.video.ui.widget.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.m.f34918nl, new Class[]{com.max.video.ui.widget.e.class}, Void.TYPE).isSupported) {
            return;
        }
        af.c.a.a(this, eVar);
    }

    @Override // ze.d
    @dl.d
    public ze.d g() {
        this.f75935c = true;
        return this;
    }

    public final boolean getAlwaysShowBottomPanel() {
        return this.E;
    }

    public final boolean getAlwaysShowCenterPanel() {
        return this.D;
    }

    public final boolean getAlwaysShowTopPanel() {
        return this.C;
    }

    @Override // ze.d
    @dl.d
    public u<Boolean> getBottomPanelState() {
        return this.f75956x;
    }

    @Override // ze.d
    @dl.d
    public u<Boolean> getCenterPanelState() {
        return this.f75954v;
    }

    @Override // af.c
    @dl.e
    public com.max.video.ui.widget.e getCompletedPanel() {
        return this.f75944l;
    }

    @Override // ze.d
    @dl.d
    public ImageView getCoverView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12292, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView ivCover = this.f75934b.f141301e;
        f0.o(ivCover, "ivCover");
        return ivCover;
    }

    public final boolean getDoNotShowPanelFirstTime() {
        return this.F;
    }

    @Override // ze.d
    public boolean getEnableBottom() {
        return this.f75947o;
    }

    @Override // ze.d
    public boolean getEnableCenter() {
        return this.f75946n;
    }

    @Override // ze.d
    public boolean getEnableTop() {
        return this.f75945m;
    }

    @Override // af.d
    public int getHorizontalMargin() {
        return this.f75939g;
    }

    @Override // af.l
    @dl.d
    public u<Integer> getMenuPopState() {
        return this.f75950r;
    }

    @dl.e
    public final com.max.video.device.c.a getOrientationChangeListener() {
        return this.J;
    }

    @dl.d
    public final com.max.video.device.c getOrientationEventManager() {
        return this.I;
    }

    @Override // ze.d
    @dl.e
    public BottomPanel getPanelBottom() {
        return this.f75943k;
    }

    @Override // ze.d
    @dl.e
    public CenterPanel getPanelCenter() {
        return this.f75942j;
    }

    @Override // ze.d
    @dl.e
    public TopPanel getPanelTop() {
        return this.f75941i;
    }

    @Override // af.l
    @dl.e
    public PopupWindow getPopupMenuWindow() {
        return this.f75948p;
    }

    public final boolean getSimpleView() {
        return this.f75938f;
    }

    @Override // ze.d
    @dl.d
    public u<Boolean> getTopPanelState() {
        return this.f75952t;
    }

    @Override // ze.d
    @dl.d
    public UIState getUiState() {
        return this.f75940h;
    }

    @Override // af.l
    public void h(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 12304, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        setPopupMenuWindow(new PopupWindow(view, -1, -2));
        PopupWindow popupMenuWindow = getPopupMenuWindow();
        if (popupMenuWindow != null) {
            popupMenuWindow.setOutsideTouchable(true);
        }
        PopupWindow popupMenuWindow2 = getPopupMenuWindow();
        if (popupMenuWindow2 != null) {
            popupMenuWindow2.setBackgroundDrawable(new ColorDrawable(0));
        }
        PopupWindow popupMenuWindow3 = getPopupMenuWindow();
        if (popupMenuWindow3 != null) {
            popupMenuWindow3.setAnimationStyle(R.style.VideoBottomMenuWindowAnimation);
        }
        PopupWindow popupMenuWindow4 = getPopupMenuWindow();
        if (popupMenuWindow4 != null) {
            popupMenuWindow4.setFocusable(false);
        }
        PopupWindow popupMenuWindow5 = getPopupMenuWindow();
        if (popupMenuWindow5 != null) {
            popupMenuWindow5.setSoftInputMode(3);
        }
        PopupWindow popupMenuWindow6 = getPopupMenuWindow();
        if (popupMenuWindow6 != null) {
            popupMenuWindow6.setClippingEnabled(false);
        }
        PopupWindow popupMenuWindow7 = getPopupMenuWindow();
        if (popupMenuWindow7 != null) {
            popupMenuWindow7.showAtLocation(this.f75934b.b(), 81, 0, 0);
        }
        Activity activityA = ye.a.f141789a.a(getContext());
        if (activityA != null) {
            ye.b.f141790a.m(activityA);
        }
        d(false, 3);
    }

    @Override // ze.d
    public void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12298, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75934b.f141301e.setVisibility(8);
        this.f75934b.f141311o.setVisibility(0);
        this.f75934b.f141309m.setVisibility(8);
    }

    @Override // ze.d
    public void j(@dl.e String str) {
    }

    @Override // ze.d
    @dl.d
    public ze.d k(@dl.e CenterPanel centerPanel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{centerPanel}, this, changeQuickRedirect, false, 12287, new Class[]{CenterPanel.class}, ze.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze.d) patchProxyResultProxy.result;
        }
        setPanelCenter(centerPanel);
        this.f75934b.f141299c.removeAllViews();
        if (centerPanel != null) {
            this.f75934b.f141299c.addView(centerPanel, new FrameLayout.LayoutParams(-1, -1));
        }
        return this;
    }

    @Override // ze.d
    public void l() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12300, new Class[0], Void.TYPE).isSupported || this.f75957y) {
            return;
        }
        if (getTopPanelState().getValue().booleanValue() || getBottomPanelState().getValue().booleanValue()) {
            d(true, 3);
        } else {
            n(true, 3, 3000L);
        }
    }

    @Override // ze.d
    public void lock() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12289, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75936d = true;
        this.I.t(true);
    }

    @Override // ze.d
    @dl.d
    public ze.d m(@dl.e TopPanel topPanel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topPanel}, this, changeQuickRedirect, false, bb.c.m.f34711el, new Class[]{TopPanel.class}, ze.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze.d) patchProxyResultProxy.result;
        }
        setPanelTop(topPanel);
        this.f75934b.f141306j.removeAllViews();
        if (topPanel != null) {
            this.f75934b.f141306j.addView(topPanel, new FrameLayout.LayoutParams(-1, -2));
        }
        return this;
    }

    @Override // ze.d
    public void n(boolean z10, int i10, long j10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Long(j10)}, this, changeQuickRedirect, false, bb.c.m.f34872ll, new Class[]{Boolean.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B.removeMessages(2);
        Handler handler = this.B;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.arg1 = i10;
        messageObtain.arg2 = z10 ? 1 : 0;
        handler.sendMessage(messageObtain);
        if (j10 > 0) {
            Handler handler2 = this.B;
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 2;
            messageObtain2.arg1 = i10;
            messageObtain2.arg2 = z10 ? 1 : 0;
            handler2.sendMessageDelayed(messageObtain2, j10);
        }
    }

    @Override // af.p
    public void o(int i10) {
        String str;
        AnimationDrawable animationDrawable;
        int iA;
        AnimationDrawable animationDrawable2;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.ul, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = (i10 / 4) - 1;
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 < 10) {
            str = "video_volume_0000" + i11;
        } else {
            str = "video_volume_000" + i11;
        }
        this.B.removeMessages(6);
        this.B.sendEmptyMessage(5);
        int identifier = getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName());
        this.f75934b.f141312p.setVisibility(0);
        this.f75934b.f141300d.setVisibility(8);
        this.f75934b.f141304h.setImageResource(identifier);
        boolean z10 = this.f75958z;
        if (z10 && i10 != 0) {
            AnimationDrawable animationDrawable3 = this.A;
            if ((animationDrawable3 != null && animationDrawable3.isRunning()) && (animationDrawable2 = this.A) != null) {
                animationDrawable2.stop();
            }
            Drawable drawableG = androidx.core.content.res.i.g(getContext().getResources(), R.drawable.video_unmute_anim, null);
            f0.n(drawableG, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable4 = (AnimationDrawable) drawableG;
            this.A = animationDrawable4;
            this.f75934b.f141303g.setImageDrawable(animationDrawable4);
            AnimationDrawable animationDrawable5 = this.A;
            if (animationDrawable5 != null) {
                animationDrawable5.start();
            }
        } else if (z10 || i10 != 0) {
            AnimationDrawable animationDrawable6 = this.A;
            if (!(animationDrawable6 != null && animationDrawable6.isRunning())) {
                if (this.f75958z) {
                    this.f75934b.f141303g.setImageResource(R.drawable.video_mute_00001);
                } else {
                    this.f75934b.f141303g.setImageResource(R.drawable.video_mute_00009);
                }
            }
        } else {
            AnimationDrawable animationDrawable7 = this.A;
            if ((animationDrawable7 != null && animationDrawable7.isRunning()) && (animationDrawable = this.A) != null) {
                animationDrawable.stop();
            }
            Drawable drawableG2 = androidx.core.content.res.i.g(getContext().getResources(), R.drawable.video_mute_anim, null);
            f0.n(drawableG2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable8 = (AnimationDrawable) drawableG2;
            this.A = animationDrawable8;
            this.f75934b.f141303g.setImageDrawable(animationDrawable8);
            AnimationDrawable animationDrawable9 = this.A;
            if (animationDrawable9 != null) {
                animationDrawable9.start();
            }
        }
        if (this.f75934b.f141303g.getLayoutParams() == null) {
            ye.b bVar = ye.b.f141790a;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            int iA2 = bVar.a(context, 20.0f);
            Context context2 = getContext();
            f0.o(context2, "getContext(...)");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, bVar.a(context2, 20.0f));
            layoutParams.addRule(15);
            this.f75934b.f141303g.setLayoutParams(layoutParams);
        }
        if (i10 > 60) {
            ye.b bVar2 = ye.b.f141790a;
            Context context3 = getContext();
            f0.o(context3, "getContext(...)");
            iA = bVar2.a(context3, fi.u.t(0.0f, 2 - ((i10 - 60) / 20)));
        } else {
            ye.b bVar3 = ye.b.f141790a;
            Context context4 = getContext();
            f0.o(context4, "getContext(...)");
            iA = bVar3.a(context4, 2.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f75934b.f141303g.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).leftMargin = iA;
        this.f75934b.f141303g.requestLayout();
        this.f75934b.f141305i.setProgress(i10);
        this.f75958z = i10 == 0;
        this.B.sendEmptyMessageDelayed(6, 1500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34618al, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        this.I.p();
    }

    @Override // af.c
    public void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34964pl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getUiState() != UIState.Error) {
            setUiState(UIState.Default);
        }
        this.f75934b.f141308l.setVisibility(8);
    }

    @Override // ze.d
    @dl.d
    public ze.d q(@dl.e BottomPanel bottomPanel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bottomPanel}, this, changeQuickRedirect, false, 12288, new Class[]{BottomPanel.class}, ze.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze.d) patchProxyResultProxy.result;
        }
        setPanelBottom(bottomPanel);
        this.f75934b.f141298b.removeAllViews();
        if (bottomPanel != null) {
            this.f75934b.f141298b.addView(bottomPanel, new FrameLayout.LayoutParams(-1, -2));
        }
        return this;
    }

    @Override // af.l
    public void r() {
        PopupWindow popupMenuWindow;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12305, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PopupWindow popupMenuWindow2 = getPopupMenuWindow();
        if (popupMenuWindow2 != null && popupMenuWindow2.isShowing()) {
            z10 = true;
        }
        if (!z10 || (popupMenuWindow = getPopupMenuWindow()) == null) {
            return;
        }
        popupMenuWindow.dismiss();
    }

    @Override // ze.d
    public void reset() {
        this.G = true;
    }

    @Override // ze.d
    public void s(@dl.e String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 12299, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75934b.f141301e.setVisibility(8);
        this.f75934b.f141311o.setVisibility(8);
        this.f75934b.f141309m.setVisibility(0);
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            str = "播放发生错误";
        }
        this.f75934b.f141307k.setText(str);
    }

    public final void setAlwaysShowBottomPanel(boolean z10) {
        this.E = z10;
    }

    public final void setAlwaysShowCenterPanel(boolean z10) {
        this.D = z10;
    }

    public final void setAlwaysShowTopPanel(boolean z10) {
        this.C = z10;
    }

    @Override // af.c
    public void setCompletedPanel(@dl.e com.max.video.ui.widget.e eVar) {
        this.f75944l = eVar;
    }

    public final void setDoNotShowPanelFirstTime(boolean z10) {
        this.F = z10;
    }

    @Override // ze.d
    public void setEnableBottom(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Yk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75947o = z10;
        if (z10 || this.f75934b.f141298b.getVisibility() != 0) {
            return;
        }
        M(false);
    }

    @Override // ze.d
    public void setEnableCenter(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Xk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75946n = z10;
        if (z10 || this.f75934b.f141299c.getVisibility() != 0) {
            return;
        }
        N(false);
    }

    @Override // ze.d
    public void setEnableTop(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Wk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75945m = z10;
        if (z10 || this.f75934b.f141306j.getVisibility() != 0) {
            return;
        }
        P(false);
    }

    @Override // af.d
    public void setHorizontalMargin(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Uk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75939g = i10;
        ViewGroup.LayoutParams layoutParams = this.f75934b.f141306j.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).leftMargin = i10;
        ViewGroup.LayoutParams layoutParams2 = this.f75934b.f141306j.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).rightMargin = i10;
        ViewGroup.LayoutParams layoutParams3 = this.f75934b.f141298b.getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).leftMargin = i10;
        ViewGroup.LayoutParams layoutParams4 = this.f75934b.f141298b.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams4).rightMargin = i10;
        ViewGroup.LayoutParams layoutParams5 = this.f75934b.f141302f.getLayoutParams();
        f0.n(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ye.b bVar = ye.b.f141790a;
        Context context = getContext();
        f0.o(context, "getContext(...)");
        ((RelativeLayout.LayoutParams) layoutParams5).rightMargin = i10 + bVar.a(context, 12.0f);
    }

    public final void setOrientationChangeListener(@dl.e com.max.video.device.c.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.m.Zk, new Class[]{com.max.video.device.c.a.class}, Void.TYPE).isSupported) {
            return;
        }
        this.J = aVar;
        if (aVar != null) {
            com.max.video.device.c cVar = this.I;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            cVar.r(context, this.J);
        }
    }

    @Override // ze.d
    public void setPanelBottom(@dl.e BottomPanel bottomPanel) {
        this.f75943k = bottomPanel;
    }

    @Override // ze.d
    public void setPanelCenter(@dl.e CenterPanel centerPanel) {
        this.f75942j = centerPanel;
    }

    @Override // ze.d
    public void setPanelTop(@dl.e TopPanel topPanel) {
        this.f75941i = topPanel;
    }

    @Override // af.l
    public void setPopupMenuWindow(@dl.e PopupWindow popupWindow) {
        this.f75948p = popupWindow;
    }

    public final void setSimpleView(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Tk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75938f = z10;
        RelativeLayout vgUi = this.f75934b.f141311o;
        f0.o(vgUi, "vgUi");
        vgUi.setVisibility((!z10 ? 1 : 0) == 0 ? 8 : 0);
    }

    @Override // ze.d
    public void setUiState(@dl.d UIState uIState) {
        if (PatchProxy.proxy(new Object[]{uIState}, this, changeQuickRedirect, false, bb.c.m.Vk, new Class[]{UIState.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(uIState, "<set-?>");
        this.f75940h = uIState;
    }

    @Override // af.b
    public void t(int i10) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.tl, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B.removeMessages(6);
        this.B.removeMessages(5);
        this.B.sendEmptyMessage(5);
        int i11 = i10 - 10;
        int i12 = (i11 / 6) - 1;
        if (i12 == -1) {
            i12 = 0;
        }
        if (i12 < 10) {
            str = "video_sun_0000" + i12;
        } else {
            str = "video_sun_000" + i12;
        }
        int identifier = getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName());
        this.f75934b.f141312p.setVisibility(8);
        this.f75934b.f141300d.setVisibility(0);
        this.f75934b.f141300d.setImageResource(identifier);
        this.f75934b.f141305i.setProgress((int) ((((double) i11) / ((double) 90)) * ((double) 100)));
        this.B.sendEmptyMessageDelayed(6, 1500L);
    }

    @Override // ze.d
    @dl.d
    public ze.d u(@dl.d LifecycleCoroutineScope lifecycleCoroutineScope, @dl.d AbsVideoView videoView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lifecycleCoroutineScope, videoView}, this, changeQuickRedirect, false, bb.c.m.f34641bl, new Class[]{LifecycleCoroutineScope.class, AbsVideoView.class}, ze.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze.d) patchProxyResultProxy.result;
        }
        f0.p(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        f0.p(videoView, "videoView");
        this.f75934b.f141302f.setOnClickListener(new View.OnClickListener() { // from class: com.max.video.impl.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlainVideoUI.L(this.f76047b, view);
            }
        });
        ArrayList<ze.c> arrayList = new ArrayList();
        TopPanel panelTop = getPanelTop();
        if (panelTop != null) {
            arrayList.add(panelTop);
        }
        CenterPanel panelCenter = getPanelCenter();
        if (panelCenter != null) {
            arrayList.add(panelCenter);
        }
        BottomPanel panelBottom = getPanelBottom();
        if (panelBottom != null) {
            arrayList.add(panelBottom);
        }
        lifecycleCoroutineScope.f(new PlainVideoUI$bind$5(videoView, this, null));
        this.H.clear();
        com.max.video.ui.widget.e completedPanel = getCompletedPanel();
        if (completedPanel != null) {
            lifecycleCoroutineScope.f(new PlainVideoUI$bind$6$1(videoView, completedPanel, this, null));
        }
        for (ze.c cVar : arrayList) {
            if (cVar instanceof af.e) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$1(videoView, this, cVar, null));
            }
            if (cVar instanceof af.f) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$2(videoView, cVar, null));
            }
            if (cVar instanceof af.k) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$3(videoView, cVar, null));
                ((af.k) cVar).setPlayAction(new c(videoView));
            }
            if (cVar instanceof m) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$5(videoView, cVar, null));
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$6(videoView, cVar, null));
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$7(videoView, cVar, null));
            }
            if (cVar instanceof o) {
                this.H.add(cVar);
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$8(videoView, this, cVar, null));
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$9(videoView, cVar, this, null));
            }
            if (cVar instanceof n) {
                ((n) cVar).setOnSeekBarChangeListener(new b(cVar, videoView));
            }
            if (cVar instanceof af.i) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$11(videoView, this, cVar, null));
            }
            if (cVar instanceof af.j) {
                lifecycleCoroutineScope.f(new PlainVideoUI$bind$7$12(videoView, cVar, null));
            }
        }
        d(false, 3);
        return this;
    }

    @Override // ze.d
    public void unlock() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75936d = false;
        this.I.t(false);
    }

    @Override // ze.d
    public boolean v() {
        return this.f75936d;
    }
}
