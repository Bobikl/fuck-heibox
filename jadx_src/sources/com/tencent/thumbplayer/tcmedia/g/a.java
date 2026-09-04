package com.tencent.thumbplayer.tcmedia.g;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.g.b.c;
import com.tencent.thumbplayer.tcmedia.g.b.d;
import com.tencent.thumbplayer.tcmedia.g.b.e;
import com.tencent.thumbplayer.tcmedia.g.b.f;
import com.tencent.thumbplayer.tcmedia.g.b.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f102646a = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f102647e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f102648f = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f102651d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.g.f.b f102649b = com.tencent.thumbplayer.tcmedia.g.f.b.f102772e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102650c = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<b, c> f102652g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.g.e.a f102653h = new com.tencent.thumbplayer.tcmedia.g.e.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.g.d.a f102654i = new com.tencent.thumbplayer.tcmedia.g.d.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.tencent.thumbplayer.tcmedia.g.d.a f102655j = new com.tencent.thumbplayer.tcmedia.g.d.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f102656k = true;

    public static a a() {
        return f102646a;
    }

    private c a(MediaFormat mediaFormat, b bVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "createDirectCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + bVar.a() + " nameOrType:" + bVar.l());
        }
        return bVar.a() == b.EnumC1023b.CreateByName ? new d(MediaCodec.createByCodecName(bVar.l())) : new d(MediaCodec.createDecoderByType(bVar.l()));
    }

    private c a(MediaFormat mediaFormat, b bVar, Surface surface) {
        boolean zB = bVar.b();
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "getCodec isVideo:" + zB + " codecFinalReuseEnable:" + bVar.f102657a);
        }
        if (!bVar.f102657a) {
            bVar.f102658b = false;
            if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "getCodec return DirectCodecWrapper for mediaFormat:" + mediaFormat + " codecFinalReuseEnable:false surface:" + surface);
            }
            return a(mediaFormat, bVar);
        }
        e eVarA = e.a(mediaFormat);
        c cVarA = a(zB, eVarA);
        e.a(eVarA.f102678a);
        if (cVarA != null) {
            com.tencent.thumbplayer.tcmedia.g.f.a.b bVarB = cVarA.b(eVarA);
            if (bVarB == com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || bVarB == com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                    com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "getCodec reuse, isVideo:" + zB + " reuseType:" + bVarB);
                }
                cVarA.b();
                cVarA.c();
                bVar.f102658b = true;
                return cVarA;
            }
            if (bVarB == com.tencent.thumbplayer.tcmedia.g.f.a.b.KEEP_CODEC_RESULT_NO && com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
                com.tencent.thumbplayer.tcmedia.g.h.b.d("TCodecManager", "getCodec not reuse, isVideo:" + zB + " reuseType:" + bVarB);
            }
        }
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "getCodec not reuse, for can't find reUseAble CodecWrapper. isVideo:".concat(String.valueOf(zB)));
        }
        bVar.f102658b = false;
        c cVarB = b(mediaFormat, bVar);
        cVarB.b();
        this.f102652g.put(bVar, cVarB);
        return cVarB;
    }

    private c a(boolean z10, e eVar) {
        return (z10 ? this.f102654i : this.f102655j).a(eVar);
    }

    private c b(MediaFormat mediaFormat, b bVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "createNewReuseCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + bVar.a() + " nameOrType:" + bVar.l());
        }
        String string = mediaFormat.getString(org.apache.tools.ant.taskdefs.email.b.I);
        e eVarA = e.a(mediaFormat);
        com.tencent.thumbplayer.tcmedia.g.f.a.a(eVarA, mediaFormat);
        return f.a(bVar.a() == b.EnumC1023b.CreateByName ? MediaCodec.createByCodecName(bVar.l()) : MediaCodec.createDecoderByType(string), string, eVarA);
    }

    public static void b() {
    }

    private void c(c cVar) {
        if (e()) {
            if (cVar instanceof g) {
                this.f102654i.a((f) cVar);
            } else if (cVar instanceof com.tencent.thumbplayer.tcmedia.g.b.a) {
                this.f102655j.a((f) cVar);
            }
        }
    }

    public static boolean c() {
        return f102648f;
    }

    public final c a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10, b bVar) {
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "configureStart videoPoolInfo:" + this.f102654i.a() + ", audioPoolInfo:" + this.f102655j.a());
        }
        this.f102651d = true;
        this.f102656k = true;
        c cVarA = a(mediaFormat, bVar, surface);
        c(cVarA);
        cVarA.a(bVar.c());
        cVarA.a(mediaFormat, surface, mediaCrypto, i10);
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "configureEnd   videoPoolInfo:" + this.f102654i.a() + ", audioPoolInfo:" + this.f102655j.a());
        }
        return cVarA;
    }

    public final void a(c cVar) {
        if (e()) {
            if (cVar instanceof g) {
                this.f102654i.b((f) cVar);
            } else if (cVar instanceof com.tencent.thumbplayer.tcmedia.g.b.a) {
                this.f102655j.b((f) cVar);
            }
        }
    }

    public final void a(com.tencent.thumbplayer.tcmedia.g.h.a aVar) {
        com.tencent.thumbplayer.tcmedia.g.h.b.a(aVar);
    }

    public final void a(boolean z10) {
        com.tencent.thumbplayer.tcmedia.g.h.b.a(z10);
    }

    public final boolean a(b bVar, Surface surface) {
        boolean zE = e();
        boolean zD = bVar.d();
        boolean zB = bVar.b();
        boolean z10 = zE && zD;
        boolean z11 = !com.tencent.thumbplayer.tcmedia.g.h.c.a();
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("TCodecManager", "reuseEnable getCodec isVideo:" + zB + " reuseEnable:" + z10 + " globalReuseEnable:" + zE + " mediaCodecReuseEnable:" + zD + " canUseSetOutputSurfaceAPI:" + z11 + " ,surface:" + surface);
        }
        return z10 && zB && z11 && surface != null;
    }

    public final void b(c cVar) {
        if (e()) {
            if (cVar instanceof g) {
                this.f102654i.c((f) cVar);
            } else if (cVar instanceof com.tencent.thumbplayer.tcmedia.g.b.a) {
                this.f102655j.c((f) cVar);
            }
        }
    }

    public final com.tencent.thumbplayer.tcmedia.g.f.b d() {
        return this.f102649b;
    }

    public final boolean e() {
        return this.f102650c;
    }

    public final boolean f() {
        return this.f102656k;
    }
}
