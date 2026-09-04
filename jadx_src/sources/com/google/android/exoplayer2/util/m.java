package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.analytics.o1;
import com.google.android.exoplayer2.analytics.p1;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.z3;
import com.tencent.connect.share.QzonePublish;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: compiled from: EventLogger.java */
/* JADX INFO: loaded from: classes7.dex */
public class m implements p1 {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f51454l0 = "EventLogger";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f51455m0 = 3;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final NumberFormat f51456n0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.exoplayer2.trackselection.l f51457g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final String f51458h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final z3.d f51459i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final z3.b f51460j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f51461k0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f51456n0 = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public m(@androidx.annotation.p0 com.google.android.exoplayer2.trackselection.l lVar) {
        this(lVar, f51454l0);
    }

    public m(@androidx.annotation.p0 com.google.android.exoplayer2.trackselection.l lVar, String str) {
        this.f51457g0 = lVar;
        this.f51458h0 = str;
        this.f51459i0 = new z3.d();
        this.f51460j0 = new z3.b();
        this.f51461k0 = SystemClock.elapsedRealtime();
    }

    private static String B0(int i10) {
        if (i10 == 0) {
            return "REPEAT";
        }
        if (i10 == 1) {
            return "AUTO";
        }
        if (i10 != 2) {
            return i10 != 3 ? "?" : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String C0(int i10) {
        if (i10 == 1) {
            return "USER_REQUEST";
        }
        if (i10 == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i10 == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i10 != 4) {
            return i10 != 5 ? "?" : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String D0(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String E0(int i10) {
        if (i10 == 0) {
            return "OFF";
        }
        if (i10 != 1) {
            return i10 != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    private static String F0(int i10) {
        if (i10 == 1) {
            return "IDLE";
        }
        if (i10 == 2) {
            return "BUFFERING";
        }
        if (i10 != 3) {
            return i10 != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    private static String G0(long j10) {
        return j10 == com.google.android.exoplayer2.j.f46377b ? "?" : f51456n0.format(j10 / 1000.0f);
    }

    private static String H0(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "?" : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String I0(@androidx.annotation.p0 com.google.android.exoplayer2.trackselection.o oVar, n1 n1Var, int i10) {
        return J0((oVar == null || oVar.h() != n1Var || oVar.g(i10) == -1) ? false : true);
    }

    private static String J0(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    private void K0(p1.b bVar, String str) {
        M0(u0(bVar, str, null, null));
    }

    private void L0(p1.b bVar, String str, String str2) {
        M0(u0(bVar, str, str2, null));
    }

    private void N0(p1.b bVar, String str, String str2, @androidx.annotation.p0 Throwable th2) {
        P0(u0(bVar, str, str2, th2));
    }

    private void O0(p1.b bVar, String str, @androidx.annotation.p0 Throwable th2) {
        P0(u0(bVar, str, null, th2));
    }

    private void Q0(p1.b bVar, String str, Exception exc) {
        N0(bVar, "internalError", str, exc);
    }

    private void R0(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            String strValueOf = String.valueOf(metadata.c(i10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + strValueOf.length());
            sb2.append(str);
            sb2.append(strValueOf);
            M0(sb2.toString());
        }
    }

    private static String n0(int i10, int i11) {
        if (i10 < 2) {
            return "N/A";
        }
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i11 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String o0(int i10) {
        if (i10 == 0) {
            return "AUTO_TRANSITION";
        }
        if (i10 == 1) {
            return "SEEK";
        }
        if (i10 == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i10 == 3) {
            return "SKIP";
        }
        if (i10 != 4) {
            return i10 != 5 ? "?" : "INTERNAL";
        }
        return "REMOVE";
    }

    private String u0(p1.b bVar, String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 Throwable th2) {
        String strZ0 = z0(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(strZ0).length());
        sb2.append(str);
        sb2.append(" [");
        sb2.append(strZ0);
        String string = sb2.toString();
        if (th2 instanceof PlaybackException) {
            String strValueOf = String.valueOf(string);
            String strF = ((PlaybackException) th2).f();
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 12 + String.valueOf(strF).length());
            sb3.append(strValueOf);
            sb3.append(", errorCode=");
            sb3.append(strF);
            string = sb3.toString();
        }
        if (str2 != null) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 2 + str2.length());
            sb4.append(strValueOf2);
            sb4.append(", ");
            sb4.append(str2);
            string = sb4.toString();
        }
        String strG = u.g(th2);
        if (!TextUtils.isEmpty(strG)) {
            String strValueOf3 = String.valueOf(string);
            String strReplace = strG.replace("\n", "\n  ");
            StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 4 + String.valueOf(strReplace).length());
            sb5.append(strValueOf3);
            sb5.append("\n  ");
            sb5.append(strReplace);
            sb5.append('\n');
            string = sb5.toString();
        }
        return String.valueOf(string).concat("]");
    }

    private String z0(p1.b bVar) {
        int i10 = bVar.f43783c;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("window=");
        sb2.append(i10);
        String string = sb2.toString();
        if (bVar.f43784d != null) {
            String strValueOf = String.valueOf(string);
            int iG = bVar.f43782b.g(bVar.f43784d.f47719a);
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
            sb3.append(strValueOf);
            sb3.append(", period=");
            sb3.append(iG);
            string = sb3.toString();
            if (bVar.f43784d.c()) {
                String strValueOf2 = String.valueOf(string);
                int i11 = bVar.f43784d.f47720b;
                StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 21);
                sb4.append(strValueOf2);
                sb4.append(", adGroup=");
                sb4.append(i11);
                String strValueOf3 = String.valueOf(sb4.toString());
                int i12 = bVar.f43784d.f47721c;
                StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 16);
                sb5.append(strValueOf3);
                sb5.append(", ad=");
                sb5.append(i12);
                string = sb5.toString();
            }
        }
        String strG0 = G0(bVar.f43781a - this.f51461k0);
        String strG1 = G0(bVar.f43785e);
        StringBuilder sb6 = new StringBuilder(String.valueOf(strG0).length() + 23 + String.valueOf(strG1).length() + String.valueOf(string).length());
        sb6.append("eventTime=");
        sb6.append(strG0);
        sb6.append(", mediaPos=");
        sb6.append(strG1);
        sb6.append(", ");
        sb6.append(string);
        return sb6.toString();
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void A(p1.b bVar) {
        K0(bVar, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void A0(p1.b bVar, long j10) {
        o1.K(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void B(p1.b bVar, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        N0(bVar, "audioTrackUnderrun", sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void C(p1.b bVar, String str, long j10, long j11) {
        o1.d(this, bVar, str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void D(p1.b bVar, com.google.android.exoplayer2.audio.f fVar) {
        int i10 = fVar.f44120b;
        int i11 = fVar.f44121c;
        int i12 = fVar.f44122d;
        int i13 = fVar.f44123e;
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append(i10);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(i11);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(i12);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(i13);
        L0(bVar, "audioAttributes", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void E(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void F(p1.b bVar, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar) {
        com.google.android.exoplayer2.trackselection.l lVar = this.f51457g0;
        com.google.android.exoplayer2.trackselection.l.a aVarK = lVar != null ? lVar.k() : null;
        if (aVarK == null) {
            L0(bVar, "tracks", okhttp3.t.f132643o);
            return;
        }
        String strValueOf = String.valueOf(z0(bVar));
        M0(strValueOf.length() != 0 ? "tracks [".concat(strValueOf) : new String("tracks ["));
        int iC = aVarK.c();
        int i10 = 0;
        while (true) {
            String str = "    Group:";
            String str2 = " [";
            if (i10 >= iC) {
                break;
            }
            com.google.android.exoplayer2.source.p1 p1VarG = aVarK.g(i10);
            com.google.android.exoplayer2.trackselection.o oVarA = pVar.a(i10);
            int i11 = iC;
            if (p1VarG.f48609b == 0) {
                String strD = aVarK.d(i10);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 5);
                sb2.append("  ");
                sb2.append(strD);
                sb2.append(" []");
                M0(sb2.toString());
            } else {
                String strD2 = aVarK.d(i10);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strD2).length() + 4);
                sb3.append("  ");
                sb3.append(strD2);
                sb3.append(" [");
                M0(sb3.toString());
                int i12 = 0;
                while (i12 < p1VarG.f48609b) {
                    n1 n1VarC = p1VarG.c(i12);
                    com.google.android.exoplayer2.source.p1 p1Var2 = p1VarG;
                    String strN0 = n0(n1VarC.f48599b, aVarK.a(i10, i12, false));
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strN0).length() + 44);
                    sb4.append(str);
                    sb4.append(i12);
                    sb4.append(", adaptive_supported=");
                    sb4.append(strN0);
                    sb4.append(str2);
                    M0(sb4.toString());
                    int i13 = 0;
                    while (i13 < n1VarC.f48599b) {
                        String strI0 = I0(oVarA, n1VarC, i13);
                        String strG0 = u0.g0(aVarK.h(i10, i12, i13));
                        n1 n1Var = n1VarC;
                        String strA = a2.A(n1VarC.c(i13));
                        String str3 = str;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(strI0).length() + 38 + String.valueOf(strA).length() + String.valueOf(strG0).length());
                        sb5.append("      ");
                        sb5.append(strI0);
                        sb5.append(" Track:");
                        sb5.append(i13);
                        sb5.append(", ");
                        sb5.append(strA);
                        sb5.append(", supported=");
                        sb5.append(strG0);
                        M0(sb5.toString());
                        i13++;
                        str = str3;
                        n1VarC = n1Var;
                        str2 = str2;
                    }
                    M0("    ]");
                    i12++;
                    p1VarG = p1Var2;
                }
                if (oVarA != null) {
                    for (int i14 = 0; i14 < oVarA.length(); i14++) {
                        Metadata metadata = oVarA.p(i14).f43591k;
                        if (metadata != null) {
                            M0("    Metadata [");
                            R0(metadata, "      ");
                            M0("    ]");
                            break;
                        }
                    }
                }
                M0("  ]");
            }
            i10++;
            iC = i11;
        }
        String str4 = "    Group:";
        String str5 = " [";
        com.google.android.exoplayer2.source.p1 p1VarJ = aVarK.j();
        if (p1VarJ.f48609b > 0) {
            M0("  Unmapped [");
            int i15 = 0;
            while (i15 < p1VarJ.f48609b) {
                StringBuilder sb6 = new StringBuilder(23);
                String str6 = str4;
                sb6.append(str6);
                sb6.append(i15);
                String str7 = str5;
                sb6.append(str7);
                M0(sb6.toString());
                n1 n1VarC2 = p1VarJ.c(i15);
                int i16 = 0;
                while (i16 < n1VarC2.f48599b) {
                    String strJ0 = J0(false);
                    String strG1 = u0.g0(0);
                    String strA2 = a2.A(n1VarC2.c(i16));
                    String str8 = str6;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(strJ0).length() + 38 + String.valueOf(strA2).length() + String.valueOf(strG1).length());
                    sb7.append("      ");
                    sb7.append(strJ0);
                    sb7.append(" Track:");
                    sb7.append(i16);
                    sb7.append(", ");
                    sb7.append(strA2);
                    sb7.append(", supported=");
                    sb7.append(strG1);
                    M0(sb7.toString());
                    i16++;
                    p1VarJ = p1VarJ;
                    str6 = str8;
                }
                str4 = str6;
                M0("    ]");
                i15++;
                str5 = str7;
            }
            M0("  ]");
        }
        M0("]");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void G(p1.b bVar, boolean z10) {
        L0(bVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void H(p1.b bVar, Exception exc) {
        o1.b(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void I(p1.b bVar, com.google.android.exoplayer2.source.y yVar) {
        L0(bVar, "downstreamFormat", a2.A(yVar.f49284c));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void J(p1.b bVar, com.google.android.exoplayer2.source.y yVar) {
        L0(bVar, "upstreamDiscarded", a2.A(yVar.f49284c));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void K(p1.b bVar, c3.l lVar, c3.l lVar2, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(o0(i10));
        sb2.append(", PositionInfo:old [");
        sb2.append("mediaItem=");
        sb2.append(lVar.f44467d);
        sb2.append(", period=");
        sb2.append(lVar.f44470g);
        sb2.append(", pos=");
        sb2.append(lVar.f44471h);
        if (lVar.f44473j != -1) {
            sb2.append(", contentPos=");
            sb2.append(lVar.f44472i);
            sb2.append(", adGroup=");
            sb2.append(lVar.f44473j);
            sb2.append(", ad=");
            sb2.append(lVar.f44474k);
        }
        sb2.append("], PositionInfo:new [");
        sb2.append("mediaItem=");
        sb2.append(lVar2.f44467d);
        sb2.append(", period=");
        sb2.append(lVar2.f44470g);
        sb2.append(", pos=");
        sb2.append(lVar2.f44471h);
        if (lVar2.f44473j != -1) {
            sb2.append(", contentPos=");
            sb2.append(lVar2.f44472i);
            sb2.append(", adGroup=");
            sb2.append(lVar2.f44473j);
            sb2.append(", ad=");
            sb2.append(lVar2.f44474k);
        }
        sb2.append("]");
        L0(bVar, "positionDiscontinuity", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void L(p1.b bVar, c3.c cVar) {
        o1.n(this, bVar, cVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void M(p1.b bVar, Object obj, long j10) {
        L0(bVar, "renderedFirstFrame", String.valueOf(obj));
    }

    protected void M0(String str) {
        u.b(this.f51458h0, str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void N(p1.b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar) {
        o1.p(this, bVar, i10, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void O(p1.b bVar, String str) {
        L0(bVar, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void P(p1.b bVar, int i10) {
        StringBuilder sb2 = new StringBuilder(17);
        sb2.append("state=");
        sb2.append(i10);
        L0(bVar, "drmSessionAcquired", sb2.toString());
    }

    protected void P0(String str) {
        u.d(this.f51458h0, str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void Q(p1.b bVar, Exception exc) {
        Q0(bVar, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void R(p1.b bVar, boolean z10) {
        o1.J(this, bVar, z10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void S(p1.b bVar, m2 m2Var) {
        o1.M(this, bVar, m2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void T(p1.b bVar, String str, long j10) {
        L0(bVar, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void U(c3 c3Var, p1.c cVar) {
        o1.C(this, c3Var, cVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void V(p1.b bVar, int i10) {
        L0(bVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void W(p1.b bVar, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        L0(bVar, "surfaceSize", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void X(p1.b bVar, boolean z10, int i10) {
        String strC0 = C0(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strC0).length() + 7);
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(strC0);
        L0(bVar, "playWhenReady", sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void Y(p1.b bVar, a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar) {
        L0(bVar, "videoInputFormat", a2.A(a2Var));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void Z(p1.b bVar, int i10) {
        int iN = bVar.f43782b.n();
        int iW = bVar.f43782b.w();
        String strZ0 = z0(bVar);
        String strH0 = H0(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZ0).length() + 69 + String.valueOf(strH0).length());
        sb2.append("timeline [");
        sb2.append(strZ0);
        sb2.append(", periodCount=");
        sb2.append(iN);
        sb2.append(", windowCount=");
        sb2.append(iW);
        sb2.append(", reason=");
        sb2.append(strH0);
        M0(sb2.toString());
        for (int i11 = 0; i11 < Math.min(iN, 3); i11++) {
            bVar.f43782b.k(i11, this.f51460j0);
            String strG0 = G0(this.f51460j0.n());
            StringBuilder sb3 = new StringBuilder(String.valueOf(strG0).length() + 11);
            sb3.append("  period [");
            sb3.append(strG0);
            sb3.append("]");
            M0(sb3.toString());
        }
        if (iN > 3) {
            M0("  ...");
        }
        for (int i12 = 0; i12 < Math.min(iW, 3); i12++) {
            bVar.f43782b.u(i12, this.f51459i0);
            String strG1 = G0(this.f51459i0.h());
            z3.d dVar = this.f51459i0;
            boolean z10 = dVar.f52119i;
            boolean z11 = dVar.f52120j;
            StringBuilder sb4 = new StringBuilder(String.valueOf(strG1).length() + 42);
            sb4.append("  window [");
            sb4.append(strG1);
            sb4.append(", seekable=");
            sb4.append(z10);
            sb4.append(", dynamic=");
            sb4.append(z11);
            sb4.append("]");
            M0(sb4.toString());
        }
        if (iW > 3) {
            M0("  ...");
        }
        M0("]");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void a(p1.b bVar, long j10, int i10) {
        o1.r0(this, bVar, j10, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void a0(p1.b bVar) {
        o1.d0(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void b(p1.b bVar) {
        K0(bVar, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void b0(p1.b bVar) {
        o1.x(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void c(p1.b bVar, int i10) {
        L0(bVar, "playbackSuppressionReason", D0(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void c0(p1.b bVar) {
        K0(bVar, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void d(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        K0(bVar, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void d0(p1.b bVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void e(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar, IOException iOException, boolean z10) {
        Q0(bVar, "loadError", iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void e0(p1.b bVar, int i10, int i11, int i12, float f10) {
        o1.u0(this, bVar, i10, i11, i12, f10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void f(p1.b bVar, int i10, com.google.android.exoplayer2.decoder.g gVar) {
        o1.q(this, bVar, i10, gVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void f0(p1.b bVar, int i10, String str, long j10) {
        o1.r(this, bVar, i10, str, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void g(p1.b bVar, e4 e4Var) {
        o1.j0(this, bVar, e4Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void g0(p1.b bVar, int i10) {
        o1.W(this, bVar, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void h(p1.b bVar, Metadata metadata) {
        String strValueOf = String.valueOf(z0(bVar));
        M0(strValueOf.length() != 0 ? "metadata [".concat(strValueOf) : new String("metadata ["));
        R0(metadata, "  ");
        M0("]");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void h0(p1.b bVar, b3 b3Var) {
        L0(bVar, "playbackParameters", b3Var.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void i(p1.b bVar, boolean z10, int i10) {
        o1.U(this, bVar, z10, i10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void i0(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        K0(bVar, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void j(p1.b bVar, int i10) {
        L0(bVar, "state", F0(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void j0(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        K0(bVar, "videoEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void k(p1.b bVar, a2 a2Var) {
        o1.s0(this, bVar, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void k0(p1.b bVar, int i10) {
        L0(bVar, "repeatMode", E0(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void l(p1.b bVar, long j10) {
        o1.j(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void l0(p1.b bVar) {
        o1.T(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void m(p1.b bVar, boolean z10) {
        L0(bVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void m0(p1.b bVar, com.google.android.exoplayer2.video.a0 a0Var) {
        int i10 = a0Var.f51712b;
        int i11 = a0Var.f51713c;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        L0(bVar, QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void n(p1.b bVar, int i10, long j10) {
        L0(bVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void o(p1.b bVar, Exception exc) {
        o1.l(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void p(p1.b bVar, boolean z10) {
        L0(bVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void p0(p1.b bVar, a2 a2Var) {
        o1.h(this, bVar, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void q(p1.b bVar, String str, long j10, long j11) {
        o1.n0(this, bVar, str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void q0(p1.b bVar) {
        K0(bVar, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void r(p1.b bVar, long j10) {
        o1.b0(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void r0(p1.b bVar, float f10) {
        L0(bVar, com.max.xiaoheihe.module.voice.component.a.f94101q, Float.toString(f10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void s(p1.b bVar, Exception exc) {
        o1.l0(this, bVar, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void s0(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void t(p1.b bVar, @androidx.annotation.p0 i2 i2Var, int i10) {
        String strZ0 = z0(bVar);
        String strB0 = B0(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZ0).length() + 21 + String.valueOf(strB0).length());
        sb2.append("mediaItem [");
        sb2.append(strZ0);
        sb2.append(", reason=");
        sb2.append(strB0);
        sb2.append("]");
        M0(sb2.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void t0(p1.b bVar, String str) {
        L0(bVar, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void u(p1.b bVar, long j10) {
        o1.a0(this, bVar, j10);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void v(p1.b bVar, com.google.android.exoplayer2.decoder.g gVar) {
        K0(bVar, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void v0(p1.b bVar, String str, long j10) {
        L0(bVar, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void w(p1.b bVar, int i10, a2 a2Var) {
        o1.s(this, bVar, i10, a2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void w0(p1.b bVar, a2 a2Var, @androidx.annotation.p0 com.google.android.exoplayer2.decoder.i iVar) {
        L0(bVar, "audioInputFormat", a2.A(a2Var));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void x(p1.b bVar) {
        o1.c0(this, bVar);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public /* synthetic */ void x0(p1.b bVar, m2 m2Var) {
        o1.V(this, bVar, m2Var);
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void y(p1.b bVar, com.google.android.exoplayer2.source.u uVar, com.google.android.exoplayer2.source.y yVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void y0(p1.b bVar, boolean z10) {
        L0(bVar, com.max.xiaoheihe.utils.r.f95726c, Boolean.toString(z10));
    }

    @Override // com.google.android.exoplayer2.analytics.p1
    public void z(p1.b bVar, PlaybackException playbackException) {
        O0(bVar, "playerFailed", playbackException);
    }
}
