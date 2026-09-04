package com.max.video.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import android.view.ViewGroup;
import com.max.heybox.hblog.g;
import com.max.video.player.info.PlaybackState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXBitrateItem;
import com.tencent.rtmp.TXLiveBase;
import com.tencent.rtmp.TXLiveBaseListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXPlayerGlobalSetting;
import com.tencent.rtmp.TXVodConstants;
import com.tencent.rtmp.TXVodPlayConfig;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import yh.l;

/* JADX INFO: compiled from: TxPlayer.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nTxPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TxPlayer.kt\ncom/max/video/impl/TxPlayer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n1549#2:533\n1620#2,3:534\n*S KotlinDebug\n*F\n+ 1 TxPlayer.kt\ncom/max/video/impl/TxPlayer\n*L\n319#1:533\n319#1:534,3\n*E\n"})
public final class f implements com.max.video.player.a, ve.f, ve.e, ve.d, ve.b, ve.c, ITXVodPlayListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;

    @dl.d
    private TXVodPlayer H;

    @dl.e
    private String I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j<PlaybackState> f76051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final u<PlaybackState> f76052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j<PlaybackState> f76053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final u<PlaybackState> f76054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final j<Integer> f76055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final u<Integer> f76056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final j<Float> f76057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final u<Float> f76058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final j<Integer> f76059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final u<Integer> f76060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final j<Integer> f76061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final u<Integer> f76062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final j<Integer> f76063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final u<Integer> f76064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final j<Boolean> f76065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f76066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final j<Boolean> f76067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final u<Boolean> f76068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final j<Integer> f76069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final u<Integer> f76070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final j<String> f76071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final u<String> f76072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f76073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f76074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private TXVodPlayConfig f76075y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f76076z;

    /* JADX INFO: compiled from: TxPlayer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76077a;

        static {
            int[] iArr = new int[PlaybackState.valuesCustom().length];
            try {
                iArr[PlaybackState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackState.PREPARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackState.PREPARED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackState.STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlaybackState.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f76077a = iArr;
        }
    }

    /* JADX INFO: compiled from: TxPlayer.kt */
    public static final class b extends TXLiveBaseListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ve.a f76078a;

        b(ve.a aVar) {
            this.f76078a = aVar;
        }

        @Override // com.tencent.rtmp.TXLiveBaseListener
        public void onCustomHttpDNS(@dl.d String hostName, @dl.d List<String> ipList) {
            if (PatchProxy.proxy(new Object[]{hostName, ipList}, this, changeQuickRedirect, false, bb.c.m.Ho, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(hostName, "hostName");
            f0.p(ipList, "ipList");
            ipList.addAll(this.f76078a.a(hostName));
        }
    }

    public f(@dl.d Context context) {
        f0.p(context, "context");
        PlaybackState playbackState = PlaybackState.IDLE;
        j<PlaybackState> jVarA = v.a(playbackState);
        this.f76051a = jVarA;
        this.f76052b = jVarA;
        j<PlaybackState> jVarA2 = v.a(playbackState);
        this.f76053c = jVarA2;
        this.f76054d = jVarA2;
        j<Integer> jVarA3 = v.a(100);
        this.f76055e = jVarA3;
        this.f76056f = jVarA3;
        j<Float> jVarA4 = v.a(Float.valueOf(1.0f));
        this.f76057g = jVarA4;
        this.f76058h = jVarA4;
        j<Integer> jVarA5 = v.a(0);
        this.f76059i = jVarA5;
        this.f76060j = jVarA5;
        j<Integer> jVarA6 = v.a(0);
        this.f76061k = jVarA6;
        this.f76062l = jVarA6;
        j<Integer> jVarA7 = v.a(0);
        this.f76063m = jVarA7;
        this.f76064n = jVarA7;
        Boolean bool = Boolean.FALSE;
        j<Boolean> jVarA8 = v.a(bool);
        this.f76065o = jVarA8;
        this.f76066p = jVarA8;
        j<Boolean> jVarA9 = v.a(bool);
        this.f76067q = jVarA9;
        this.f76068r = jVarA9;
        j<Integer> jVarA10 = v.a(-1);
        this.f76069s = jVarA10;
        this.f76070t = jVarA10;
        j<String> jVarA11 = v.a(null);
        this.f76071u = jVarA11;
        this.f76072v = jVarA11;
        this.f76073w = -1;
        this.f76075y = new TXVodPlayConfig();
        TXVodPlayer tXVodPlayer = new TXVodPlayer(context);
        this.H = tXVodPlayer;
        tXVodPlayer.enableHardwareDecode(true);
        this.H.setAutoPlay(false);
        this.H.setVodListener(this);
        this.H.setRenderMode(1);
        this.H.setRequestAudioFocus(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l receiver, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{receiver, bitmap}, null, changeQuickRedirect, true, bb.c.m.Go, new Class[]{l.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(receiver, "$receiver");
        receiver.invoke(bitmap);
    }

    @Override // com.max.video.player.a
    public void A(@dl.d ViewGroup display) {
        if (PatchProxy.proxy(new Object[]{display}, this, changeQuickRedirect, false, bb.c.m.Sn, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(display, "display");
        if (!(display instanceof TXCloudVideoView)) {
            throw new IllegalArgumentException("目標view必須為TXCloudVideoView及其子類");
        }
        this.H.setPlayerView((TXCloudVideoView) display);
    }

    @Override // com.max.video.player.a
    public void B(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.co, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
        }
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("調用 seek(" + i10 + ')');
        }
        switch (a.f76077a[this.f76051a.getValue().ordinal()]) {
            case 1:
                this.H.setStartTime(i10);
                break;
            case 2:
            case 5:
            case 6:
                this.H.seek(i10);
                break;
            case 3:
            case 4:
                this.f76076z = i10;
                break;
        }
    }

    @Override // com.max.video.player.a
    public void C(@dl.e String str) {
        this.I = str;
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Float> D() {
        return this.f76058h;
    }

    @Override // com.max.video.player.a
    public long E() {
        return this.D;
    }

    @Override // com.max.video.player.a
    public void F(boolean z10) {
        this.f76074x = z10;
    }

    @Override // com.max.video.player.a
    public void G(long j10) {
        this.D = j10;
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Integer> H() {
        return this.f76056f;
    }

    @Override // com.max.video.player.a
    public int I() {
        return this.f76073w;
    }

    @Override // com.max.video.player.a
    public void J(long j10) {
        this.B = j10;
    }

    @Override // com.max.video.player.a
    public int K() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ho, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) this.H.getBufferDuration();
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Integer> L() {
        return this.f76060j;
    }

    @Override // com.max.video.player.a
    public void M(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.Tn, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V(str, null);
    }

    @Override // com.max.video.player.a
    public void N(@dl.d Surface surface) {
        if (PatchProxy.proxy(new Object[]{surface}, this, changeQuickRedirect, false, bb.c.m.Rn, new Class[]{Surface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(surface, "surface");
        this.H.setSurface(surface);
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Integer> O() {
        return this.f76070t;
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Integer> P() {
        return this.f76064n;
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<PlaybackState> Q() {
        return this.f76052b;
    }

    @Override // com.max.video.player.a
    public void R(long j10) {
        this.C = j10;
    }

    @Override // com.max.video.player.a
    public long S() {
        return this.C;
    }

    @Override // com.max.video.player.a
    public int T() {
        return this.G;
    }

    @Override // com.max.video.player.a
    public void U(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Wn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("調用 prepare(" + i10 + ')');
        }
        if (this.f76051a.getValue() == PlaybackState.IDLE) {
            if (S() == 0) {
                R(System.currentTimeMillis());
            }
            this.H.setStartTime(i10);
            this.H.startVodPlay(s());
            j<PlaybackState> jVar = this.f76051a;
            PlaybackState playbackState = PlaybackState.PREPARING;
            jVar.setValue(playbackState);
            this.f76053c.setValue(playbackState);
            return;
        }
        g gVarH2 = aVar.H();
        if (gVarH2 != null) {
            gVarH2.s0("當前播放狀態為" + this.f76051a.getValue() + "，無法準備");
        }
    }

    @Override // com.max.video.player.a
    public void V(@dl.e String str, @dl.e Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, bb.c.m.Un, new Class[]{String.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        C(str);
        this.f76075y.setHeaders(map);
        this.H.setConfig(this.f76075y);
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Boolean> W() {
        return this.f76066p;
    }

    @Override // com.max.video.player.a
    public void X(long j10) {
        this.F = j10;
    }

    @Override // com.max.video.player.a
    public long Y() {
        return this.E;
    }

    @Override // com.max.video.player.a
    public boolean Z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ko, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.H.isLoop();
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<PlaybackState> a() {
        return this.f76054d;
    }

    @Override // com.max.video.player.a
    public void a0(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.yo, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.H.setRenderMode(!z10 ? 1 : 0);
    }

    @Override // ve.e
    public int b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.so, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.H.getBitrateIndex();
    }

    @Override // com.max.video.player.a
    public void b0(int i10) {
        this.G = i10;
    }

    @Override // ve.b
    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ao, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H.enableHardwareDecode(false);
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Integer> c0() {
        return this.f76062l;
    }

    @Override // ve.d
    public void d(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.wo, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TXPlayerGlobalSetting.setMaxCacheSize(i10);
    }

    @Override // com.max.video.player.a
    public void d0(int i10) {
        this.f76073w = i10;
    }

    @Override // ve.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.zo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H.enableHardwareDecode(true);
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<String> e0() {
        return this.f76072v;
    }

    @Override // ve.e
    @dl.d
    public List<we.a> f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ro, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList<TXBitrateItem> supportedBitrates = this.H.getSupportedBitrates();
        f0.o(supportedBitrates, "getSupportedBitrates(...)");
        ArrayList arrayList = new ArrayList(t.Y(supportedBitrates, 10));
        for (TXBitrateItem tXBitrateItem : supportedBitrates) {
            f0.m(tXBitrateItem);
            arrayList.add(new d(tXBitrateItem));
        }
        return arrayList;
    }

    @Override // com.max.video.player.a
    public void f0(long j10) {
        this.E = j10;
    }

    @Override // ve.d
    public void g(@dl.d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.m.vo, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        TXPlayerGlobalSetting.setCacheFolderPath(path);
    }

    @Override // com.max.video.player.a
    public void g0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Fo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.video.player.a.C0618a.a(this);
    }

    @Override // com.max.video.player.a
    public int getCurrentPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.fo, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) this.H.getCurrentPlaybackTime();
    }

    @Override // com.max.video.player.a
    public int getDuration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.go, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) this.H.getDuration();
    }

    @Override // com.max.video.player.a
    public int getHeight() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.po, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.H.getHeight();
    }

    @Override // com.max.video.player.a
    public int getWidth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oo, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.H.getWidth();
    }

    @Override // ve.f
    public void h(@dl.d final l<? super Bitmap, b2> receiver) {
        if (PatchProxy.proxy(new Object[]{receiver}, this, changeQuickRedirect, false, bb.c.m.qo, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(receiver, "receiver");
        this.H.snapshot(new TXLivePlayer.ITXSnapshotListener() { // from class: com.max.video.impl.e
            @Override // com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener
            public final void onSnapshot(Bitmap bitmap) {
                f.n(receiver, bitmap);
            }
        });
    }

    @Override // com.max.video.player.a
    public long h0() {
        return this.F;
    }

    @Override // ve.e
    public void i(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.to, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.H.setBitrateIndex(i10);
    }

    @Override // com.max.video.player.a
    public boolean isPlayable() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.eo, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f76051a.getValue() == PlaybackState.PREPARING || this.f76051a.getValue() == PlaybackState.PREPARED || this.f76051a.getValue() == PlaybackState.STARTED || this.f76051a.getValue() == PlaybackState.PAUSED || (this.f76051a.getValue() == PlaybackState.IDLE && s() != null);
    }

    @Override // com.max.video.player.a
    public boolean isPlaying() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f11do, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.H.isPlaying();
    }

    @Override // ve.c
    public void j(@dl.d ve.a handler) {
        if (PatchProxy.proxy(new Object[]{handler}, this, changeQuickRedirect, false, bb.c.m.Bo, new Class[]{ve.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(handler, "handler");
        TXLiveBase.enableCustomHttpDNS(true);
        TXLiveBase.setListener(new b(handler));
    }

    @Override // ve.c
    public void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Co, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TXLiveBase.enableCustomHttpDNS(false);
    }

    @Override // ve.e
    public void l(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.uo, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76075y.setSmoothSwitchBitrate(z10);
        this.H.setConfig(this.f76075y);
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onNetStatus(@dl.d TXVodPlayer ins, @dl.d Bundle status) {
        if (PatchProxy.proxy(new Object[]{ins, status}, this, changeQuickRedirect, false, bb.c.m.Eo, new Class[]{TXVodPlayer.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ins, "ins");
        f0.p(status, "status");
        CharSequence charSequence = status.getCharSequence("CPU_USAGE");
        int i10 = status.getInt("VIDEO_HEIGHT");
        int i11 = status.getInt("VIDEO_WIDTH");
        int i12 = status.getInt("NET_SPEED");
        int i13 = status.getInt("VIDEO_FPS");
        String string = status.getString("SERVER_IP");
        int i14 = status.getInt("VIDEO_BITRATE");
        int i15 = status.getInt("AUDIO_BITRATE");
        int i16 = status.getInt("NET_JITTER");
        this.f76069s.setValue(Integer.valueOf(i12));
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.C("狀態監聽:\n\tCPU使用率:" + ((Object) charSequence) + "\n\t視頻高度: " + i10 + "\n\t視頻寬度: " + i11 + "\n\t網絡佔用(kbps): " + i12 + "\n\tFPS: " + i13 + "\n\tIP: " + string + "\n\t視頻比特率(bps): " + i14 + "\n\t音頻比特率(bps): " + i15 + "\n\t緩存長度: " + i16);
        }
    }

    @Override // com.tencent.rtmp.ITXVodPlayListener
    public void onPlayEvent(@dl.d TXVodPlayer ins, int i10, @dl.d Bundle param) {
        if (PatchProxy.proxy(new Object[]{ins, new Integer(i10), param}, this, changeQuickRedirect, false, bb.c.m.Do, new Class[]{TXVodPlayer.class, Integer.TYPE, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ins, "ins");
        f0.p(param, "param");
        if (i10 == -6004) {
            g gVarH = g.f74531b.H();
            if (gVarH != null) {
                gVarH.L("播放器播放器播放出错");
            }
            this.f76071u.setValue("原生內核出错");
        } else if (i10 == -2305) {
            g gVarH2 = g.f74531b.H();
            if (gVarH2 != null) {
                gVarH2.L("HLS 解密 key 获取失败");
            }
            this.f76071u.setValue("HLS 解密失败");
        } else if (i10 == -2301) {
            g gVarH3 = g.f74531b.H();
            if (gVarH3 != null) {
                gVarH3.L("视频数据错误导致重试亦不能恢复正常播放。如：网络异常或下载数据错误，导致解封装超时或失败。");
            }
            this.f76071u.setValue("视频数据错误");
        } else if (i10 == 2019) {
            g gVarH4 = g.f74531b.H();
            if (gVarH4 != null) {
                gVarH4.a0("播放跳轉完成");
            }
        } else if (i10 == 2106) {
            g gVarH5 = g.f74531b.H();
            if (gVarH5 != null) {
                gVarH5.s0("硬件加速失敗");
            }
        } else if (i10 == 6001) {
            g gVarH6 = g.f74531b.H();
            if (gVarH6 != null) {
                gVarH6.a0("播放循環一次完成");
            }
        } else if (i10 == 2013) {
            if (E() == 0) {
                G(System.currentTimeMillis());
            }
            g gVarH7 = g.f74531b.H();
            if (gVarH7 != null) {
                gVarH7.a0("播放準備完成");
            }
            this.f76051a.setValue(PlaybackState.PREPARED);
            if (y()) {
                F(false);
                this.H.resume();
                int i11 = this.f76076z;
                if (i11 != 0) {
                    this.H.seek(i11);
                    this.f76076z = 0;
                }
            }
        } else if (i10 != 2014) {
            switch (i10) {
                case TXVodConstants.VOD_PLAY_ERR_PROCESS_VIDEO_FAIL /* -6010 */:
                    g gVarH8 = g.f74531b.H();
                    if (gVarH8 != null) {
                        gVarH8.L("播放器後处理出错");
                    }
                    this.f76071u.setValue("後處理出错");
                    break;
                case TXVodConstants.VOD_PLAY_ERR_RENDER_FAIL /* -6009 */:
                    g gVarH9 = g.f74531b.H();
                    if (gVarH9 != null) {
                        gVarH9.L("播放器渲染出错");
                    }
                    this.f76071u.setValue("渲染出错");
                    break;
                case TXVodConstants.VOD_PLAY_ERR_DECODE_SUBTITLE_FAIL /* -6008 */:
                    g gVarH10 = g.f74531b.H();
                    if (gVarH10 != null) {
                        gVarH10.L("播放器解码字幕出错,字幕格式不支持");
                    }
                    this.f76071u.setValue("字幕格式不支持");
                    break;
                case TXVodConstants.VOD_PLAY_ERR_DECODE_AUDIO_FAIL /* -6007 */:
                    g gVarH11 = g.f74531b.H();
                    if (gVarH11 != null) {
                        gVarH11.L("播放器解码音频出错,音頻格式不支持");
                    }
                    this.f76071u.setValue("音頻格式不支持");
                    break;
                case TXVodConstants.VOD_PLAY_ERR_DECODE_VIDEO_FAIL /* -6006 */:
                    g gVarH12 = g.f74531b.H();
                    if (gVarH12 != null) {
                        gVarH12.L("播放器解码视频出错,視頻格式不支持");
                    }
                    this.f76071u.setValue("視頻格式不支持");
                    break;
                default:
                    switch (i10) {
                        case 2002:
                            g gVarH13 = g.f74531b.H();
                            if (gVarH13 != null) {
                                gVarH13.a0("播放命中緩存");
                            }
                            break;
                        case 2003:
                            J(System.currentTimeMillis());
                            g gVarH14 = g.f74531b.H();
                            if (gVarH14 != null) {
                                gVarH14.a0("收到第一個可渲染數據包");
                            }
                            break;
                        case 2004:
                            if (h0() == 0) {
                                X(System.currentTimeMillis());
                            }
                            g gVarH15 = g.f74531b.H();
                            if (gVarH15 != null) {
                                gVarH15.a0("播放开始");
                            }
                            this.f76051a.setValue(PlaybackState.STARTED);
                            break;
                        case 2005:
                            int i12 = param.getInt("EVT_PLAYABLE_DURATION_MS");
                            int i13 = param.getInt("EVT_PLAY_PROGRESS_MS");
                            int i14 = param.getInt("EVT_PLAY_DURATION_MS");
                            this.f76063m.setValue(Integer.valueOf(i12 / 1000));
                            int i15 = i13 / 1000;
                            this.f76059i.setValue(Integer.valueOf(i15));
                            this.f76061k.setValue(Integer.valueOf(i14 / 1000));
                            if (I() > 0 && i15 > I()) {
                                this.H.stopPlay(false);
                                this.f76051a.setValue(PlaybackState.COMPLETE);
                                g gVarH16 = g.f74531b.H();
                                if (gVarH16 != null) {
                                    gVarH16.a0("到达播放限制时间");
                                }
                            }
                            break;
                        case 2006:
                            g gVarH17 = g.f74531b.H();
                            if (gVarH17 != null) {
                                gVarH17.a0("播放結束");
                            }
                            this.f76051a.setValue(PlaybackState.COMPLETE);
                            break;
                        case 2007:
                            if (this.A == 2005) {
                                b0(T() + 1);
                            }
                            g gVarH18 = g.f74531b.H();
                            if (gVarH18 != null) {
                                gVarH18.a0("播放加載中");
                            }
                            this.f76067q.setValue(Boolean.TRUE);
                            break;
                        default:
                            switch (i10) {
                                case 2009:
                                    g gVarH19 = g.f74531b.H();
                                    if (gVarH19 != null) {
                                        gVarH19.a0("播放分辨率改變");
                                    }
                                    break;
                                case 2010:
                                    g gVarH20 = g.f74531b.H();
                                    if (gVarH20 != null) {
                                        gVarH20.a0("獲取播放信息成功");
                                    }
                                    break;
                                case 2011:
                                    g gVarH21 = g.f74531b.H();
                                    if (gVarH21 != null) {
                                        gVarH21.a0("播放旋轉角度變化");
                                    }
                                    break;
                                default:
                                    switch (i10) {
                                        case 2101:
                                            g gVarH22 = g.f74531b.H();
                                            if (gVarH22 != null) {
                                                gVarH22.s0("視頻幀解碼失敗");
                                            }
                                            break;
                                        case 2102:
                                            g gVarH23 = g.f74531b.H();
                                            if (gVarH23 != null) {
                                                gVarH23.s0("音頻幀解碼失敗");
                                            }
                                            break;
                                        case 2103:
                                            g gVarH24 = g.f74531b.H();
                                            if (gVarH24 != null) {
                                                gVarH24.s0("播放重連");
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            g gVarH25 = g.f74531b.H();
            if (gVarH25 != null) {
                gVarH25.a0("播放加載完成");
            }
            this.f76067q.setValue(Boolean.FALSE);
        }
        this.A = i10;
    }

    @Override // com.max.video.player.a
    public void pause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ao, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("調用 pause()");
        }
        if (this.f76051a.getValue() == PlaybackState.STARTED) {
            this.H.pause();
            j<PlaybackState> jVar = this.f76051a;
            PlaybackState playbackState = PlaybackState.PAUSED;
            jVar.setValue(playbackState);
            this.f76053c.setValue(playbackState);
            return;
        }
        g gVarH2 = aVar.H();
        if (gVarH2 != null) {
            gVarH2.s0("當前播放狀態為" + this.f76051a.getValue() + "，無法暫停");
        }
    }

    @Override // com.max.video.player.a
    public void play() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Yn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("調用 play()");
        }
        int i10 = a.f76077a[this.f76051a.getValue().ordinal()];
        if (i10 == 1) {
            this.H.startVodPlay(s());
            F(true);
            this.f76051a.setValue(PlaybackState.PREPARING);
            this.f76053c.setValue(PlaybackState.STARTED);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                F(true);
                this.f76053c.setValue(PlaybackState.STARTED);
                return;
            }
            return;
        }
        this.H.resume();
        j<PlaybackState> jVar = this.f76051a;
        PlaybackState playbackState = PlaybackState.STARTED;
        jVar.setValue(playbackState);
        this.f76053c.setValue(playbackState);
    }

    @Override // com.max.video.player.a
    public void prepare() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Vn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("調用 prepare()");
        }
        if (this.f76051a.getValue() == PlaybackState.IDLE) {
            if (S() == 0) {
                R(System.currentTimeMillis());
            }
            this.H.startVodPlay(s());
            j<PlaybackState> jVar = this.f76051a;
            PlaybackState playbackState = PlaybackState.PREPARING;
            jVar.setValue(playbackState);
            this.f76053c.setValue(playbackState);
            return;
        }
        g gVarH2 = aVar.H();
        if (gVarH2 != null) {
            gVarH2.s0("當前播放狀態為" + this.f76051a.getValue() + "，無法準備");
        }
    }

    @Override // com.max.video.player.a
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.xo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g0();
        if (Q().getValue() != PlaybackState.END) {
            this.H.stopPlay(true);
        }
    }

    @Override // com.max.video.player.a
    @dl.e
    public String s() {
        return this.I;
    }

    @Override // com.max.video.player.a
    public void setPlaybackSpeed(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34803io, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76057g.setValue(Float.valueOf(f10));
        this.H.setRate(f10);
    }

    @Override // com.max.video.player.a
    public void setVolume(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.no, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76055e.setValue(Integer.valueOf(i10));
        this.H.setAudioPlayoutVolume(i10);
    }

    @Override // com.max.video.player.a
    public void start() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Xn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("調用 start()");
        }
        if (Y() == 0) {
            f0(System.currentTimeMillis());
        }
        if (Q().getValue() == PlaybackState.PREPARED) {
            this.H.resume();
            this.f76053c.setValue(PlaybackState.STARTED);
            return;
        }
        if (Q().getValue() == PlaybackState.PREPARING) {
            F(true);
            return;
        }
        if (Q().getValue() == PlaybackState.PAUSED) {
            this.H.resume();
            j<PlaybackState> jVar = this.f76051a;
            PlaybackState playbackState = PlaybackState.STARTED;
            jVar.setValue(playbackState);
            this.f76053c.setValue(playbackState);
            return;
        }
        g gVarH2 = aVar.H();
        if (gVarH2 != null) {
            gVarH2.s0("當前播放狀態為" + this.f76051a.getValue() + "，無法開始");
        }
    }

    @Override // com.max.video.player.a
    public void stop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.bo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        g gVarH = aVar.H();
        if (gVarH != null) {
            gVarH.a0("調用 stop()");
        }
        if (this.f76051a.getValue() == PlaybackState.IDLE) {
            g gVarH2 = aVar.H();
            if (gVarH2 != null) {
                gVarH2.a0("當前狀態為IDLE，取消stop()");
                return;
            }
            return;
        }
        this.H.stopPlay(true);
        j<PlaybackState> jVar = this.f76051a;
        PlaybackState playbackState = PlaybackState.END;
        jVar.setValue(playbackState);
        this.f76053c.setValue(playbackState);
    }

    @Override // com.max.video.player.a
    public void t(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.jo, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.H.setLoop(z10);
    }

    @Override // com.max.video.player.a
    public long u() {
        return this.B;
    }

    @Override // com.max.video.player.a
    public void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H.setMute(false);
        this.f76065o.setValue(Boolean.FALSE);
    }

    @Override // com.max.video.player.a
    @dl.d
    public u<Boolean> w() {
        return this.f76068r;
    }

    @Override // com.max.video.player.a
    public void x() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lo, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H.setMute(true);
        this.f76065o.setValue(Boolean.TRUE);
    }

    @Override // com.max.video.player.a
    public boolean y() {
        return this.f76074x;
    }

    @Override // com.max.video.player.a
    public void z(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.Zn, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        g gVarH = g.f74531b.H();
        if (gVarH != null) {
            gVarH.a0("調用 play(" + i10 + ')');
        }
        int i11 = a.f76077a[this.f76051a.getValue().ordinal()];
        if (i11 == 1) {
            this.H.setStartTime(i10);
            this.H.startVodPlay(s());
            F(true);
            this.f76051a.setValue(PlaybackState.PREPARING);
            this.f76053c.setValue(PlaybackState.STARTED);
            return;
        }
        if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                F(true);
                this.f76076z = i10;
                this.f76053c.setValue(PlaybackState.STARTED);
                return;
            }
            return;
        }
        this.H.resume();
        this.H.seek(i10);
        j<PlaybackState> jVar = this.f76051a;
        PlaybackState playbackState = PlaybackState.STARTED;
        jVar.setValue(playbackState);
        this.f76053c.setValue(playbackState);
    }
}
