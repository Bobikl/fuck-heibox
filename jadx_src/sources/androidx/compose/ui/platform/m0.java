package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0016\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0016\u0010 \u001a\u00020\u001fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\u00020\"ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/m0;", "", "Landroidx/compose/ui/text/style/a;", "b", "()F", "Landroidx/compose/ui/text/style/m;", "n", "Landroidx/compose/ui/text/style/i;", "m", "Landroidx/compose/ui/graphics/e2;", "j", "", ak.aF, "", "i", "Lkotlin/r1;", "p", "()J", "", "e", "", "l", ak.av, "Landroidx/compose/ui/text/d0;", "k", "Landroidx/compose/ui/graphics/l0;", "d", "Ls1/u;", "o", "Landroidx/compose/ui/text/font/k0;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/text/font/g0;", "f", "()I", "Landroidx/compose/ui/text/font/h0;", "g", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", androidx.constraintlayout.core.motion.utils.w.b.f17895e, "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Parcel parcel;

    public m0(@dl.d String string) {
        kotlin.jvm.internal.f0.p(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.f0.o(parcelObtain, "obtain()");
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.parcel.dataAvail();
    }

    private final float b() {
        return androidx.compose.ui.text.style.a.e(e());
    }

    private final byte c() {
        return this.parcel.readByte();
    }

    private final float e() {
        return this.parcel.readFloat();
    }

    private final int i() {
        return this.parcel.readInt();
    }

    private final Shadow j() {
        return new Shadow(d(), b1.g.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.parcel.readString();
    }

    private final androidx.compose.ui.text.style.i m() {
        int i10 = i();
        androidx.compose.ui.text.style.i.Companion companion = androidx.compose.ui.text.style.i.INSTANCE;
        boolean z10 = (companion.b().getMask() & i10) != 0;
        boolean z11 = (i10 & companion.f().getMask()) != 0;
        if (z10 && z11) {
            return companion.a(CollectionsKt__CollectionsKt.L(companion.b(), companion.f()));
        }
        if (z10) {
            return companion.b();
        }
        return z11 ? companion.f() : companion.d();
    }

    private final TextGeometricTransform n() {
        return new TextGeometricTransform(e(), e());
    }

    private final long p() {
        return kotlin.r1.h(this.parcel.readLong());
    }

    public final long d() {
        return androidx.compose.ui.graphics.l0.t(p());
    }

    public final int f() {
        byte bC = c();
        if (bC != 0 && bC == 1) {
            return androidx.compose.ui.text.font.g0.INSTANCE.a();
        }
        return androidx.compose.ui.text.font.g0.INSTANCE.b();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return androidx.compose.ui.text.font.h0.INSTANCE.b();
        }
        if (bC == 1) {
            return androidx.compose.ui.text.font.h0.INSTANCE.a();
        }
        if (bC == 3) {
            return androidx.compose.ui.text.font.h0.INSTANCE.c();
        }
        return bC == 2 ? androidx.compose.ui.text.font.h0.INSTANCE.d() : androidx.compose.ui.text.font.h0.INSTANCE.b();
    }

    @dl.d
    public final FontWeight h() {
        return new FontWeight(i());
    }

    @dl.d
    public final SpanStyle k() {
        d1 d1Var;
        d1 d1Var2 = d1Var;
        d1 d1Var3 = new d1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                d1Var = d1Var2;
                if (bC == 2) {
                    if (a() < 5) {
                        return d1Var.C();
                    }
                    d1Var.t(o());
                    d1Var2 = d1Var;
                } else if (bC == 3) {
                    if (a() < 4) {
                        return d1Var.C();
                    }
                    d1Var.w(h());
                    d1Var2 = d1Var;
                } else if (bC == 4) {
                    if (a() < 1) {
                        return d1Var.C();
                    }
                    d1Var.u(androidx.compose.ui.text.font.g0.c(f()));
                    d1Var2 = d1Var;
                } else if (bC != 5) {
                    if (bC == 6) {
                        d1Var.s(l());
                    } else if (bC == 7) {
                        if (a() < 5) {
                            return d1Var.C();
                        }
                        d1Var.x(o());
                    } else if (bC == 8) {
                        if (a() < 4) {
                            return d1Var.C();
                        }
                        d1Var.p(androidx.compose.ui.text.style.a.d(b()));
                    } else if (bC == 9) {
                        if (a() < 8) {
                            return d1Var.C();
                        }
                        d1Var.B(n());
                    } else if (bC == 10) {
                        if (a() < 8) {
                            return d1Var.C();
                        }
                        d1Var.o(d());
                    } else if (bC == 11) {
                        if (a() < 4) {
                            return d1Var.C();
                        }
                        d1Var.A(m());
                    } else if (bC == 12) {
                        if (a() < 20) {
                            return d1Var.C();
                        }
                        d1Var.z(j());
                    }
                    d1Var2 = d1Var;
                } else {
                    if (a() < 1) {
                        return d1Var.C();
                    }
                    d1Var.v(androidx.compose.ui.text.font.h0.e(g()));
                    d1Var2 = d1Var;
                }
            } else {
                if (a() < 8) {
                    break;
                }
                d1Var2.q(d());
            }
        }
        d1Var = d1Var2;
        return d1Var.C();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = s1.w.f139257b.b();
        } else {
            jA = bC == 2 ? s1.w.f139257b.a() : s1.w.f139257b.c();
        }
        return s1.w.g(jA, s1.w.f139257b.c()) ? s1.u.f139249b.b() : s1.v.a(e(), jA);
    }
}
