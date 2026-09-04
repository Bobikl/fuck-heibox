package b1;

import androidx.constraintlayout.core.motion.utils.w;
import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0016\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a;\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0000\"\u0015\u0010\"\u001a\u00020\r*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010$\u001a\u00020\r*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010!\"\u0015\u0010(\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0015\u0010*\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010'\"\u0015\u0010,\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010'\"\u0015\u0010.\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010'\"\u0015\u00100\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b/\u0010'\"\u0015\u00103\u001a\u00020\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0015\u00105\u001a\u00020\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b4\u00102\"\u0018\u00108\u001a\u00020\u0018*\u00020\u00078Fø\u0001\u0001¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0015\u0010:\u001a\u00020%*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b9\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, d2 = {"", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "radiusX", "radiusY", "Lb1/k;", ak.av, "Lb1/a;", "cornerRadius", "e", "(FFFFJ)Lb1/k;", "Lb1/i;", "rect", "b", "f", "(Lb1/i;J)Lb1/k;", "topLeft", "topRight", "bottomRight", "bottomLeft", ak.aF, "(Lb1/i;JJJJ)Lb1/k;", "Lb1/f;", w.c.R, ak.aB, "(Lb1/k;J)Lb1/k;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, "r", "g", "(Lb1/k;)Lb1/i;", "boundingRect", "k", "safeInnerRect", "", "n", "(Lb1/k;)Z", "isEmpty", "o", "isFinite", "p", "isRect", "m", "isEllipse", "l", "isCircle", "j", "(Lb1/k;)F", "minDimension", "i", "maxDimension", RXScreenCaptureService.KEY_HEIGHT, "(Lb1/k;)J", com.google.android.exoplayer2.text.ttml.d.f49794m0, "q", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 7, 1})
public final class l {
    @dl.d
    public static final k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = b.a(f14, f15);
        return new k(f10, f11, f12, f13, jA, jA, jA, jA, null);
    }

    @dl.d
    public static final k b(@dl.d i rect, float f10, float f11) {
        f0.p(rect, "rect");
        return a(rect.t(), rect.getF30372b(), rect.x(), rect.j(), f10, f11);
    }

    @dl.d
    public static final k c(@dl.d i rect, long j10, long j11, long j12, long j13) {
        f0.p(rect, "rect");
        return new k(rect.t(), rect.getF30372b(), rect.x(), rect.j(), j10, j11, j12, j13, null);
    }

    @dl.d
    public static final k e(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, a.m(j10), a.o(j10));
    }

    @dl.d
    public static final k f(@dl.d i rect, long j10) {
        f0.p(rect, "rect");
        return b(rect, a.m(j10), a.o(j10));
    }

    @dl.d
    public static final i g(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return new i(kVar.q(), kVar.s(), kVar.r(), kVar.m());
    }

    public static final long h(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return g.a(kVar.q() + (kVar.v() / 2.0f), kVar.s() + (kVar.p() / 2.0f));
    }

    public static final float i(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return Math.max(Math.abs(kVar.v()), Math.abs(kVar.p()));
    }

    public static final float j(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return Math.min(Math.abs(kVar.v()), Math.abs(kVar.p()));
    }

    @dl.d
    public static final i k(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return new i(kVar.q() + (Math.max(a.m(kVar.n()), a.m(kVar.t())) * 0.29289323f), kVar.s() + (Math.max(a.o(kVar.t()), a.o(kVar.u())) * 0.29289323f), kVar.r() - (Math.max(a.m(kVar.u()), a.m(kVar.o())) * 0.29289323f), kVar.m() - (Math.max(a.o(kVar.o()), a.o(kVar.n())) * 0.29289323f));
    }

    public static final boolean l(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return ((kVar.v() > kVar.p() ? 1 : (kVar.v() == kVar.p() ? 0 : -1)) == 0) && m(kVar);
    }

    public static final boolean m(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        if (a.m(kVar.t()) == a.m(kVar.u())) {
            if (a.o(kVar.t()) == a.o(kVar.u())) {
                if (a.m(kVar.u()) == a.m(kVar.o())) {
                    if (a.o(kVar.u()) == a.o(kVar.o())) {
                        if (a.m(kVar.o()) == a.m(kVar.n())) {
                            if ((a.o(kVar.o()) == a.o(kVar.n())) && kVar.v() <= ((double) a.m(kVar.t())) * 2.0d && kVar.p() <= ((double) a.o(kVar.t())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean n(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return kVar.q() >= kVar.r() || kVar.s() >= kVar.m();
    }

    public static final boolean o(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        float fQ = kVar.q();
        if ((Float.isInfinite(fQ) || Float.isNaN(fQ)) ? false : true) {
            float fS = kVar.s();
            if ((Float.isInfinite(fS) || Float.isNaN(fS)) ? false : true) {
                float fR = kVar.r();
                if ((Float.isInfinite(fR) || Float.isNaN(fR)) ? false : true) {
                    float fM = kVar.m();
                    if ((Float.isInfinite(fM) || Float.isNaN(fM)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final boolean p(@dl.d k kVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        f0.p(kVar, "<this>");
        if (a.m(kVar.t()) == 0.0f) {
            if (a.m(kVar.u()) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (a.m(kVar.n()) == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (a.m(kVar.o()) == 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        return true;
                    }
                    if (a.o(kVar.o()) == 0.0f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        return true;
                    }
                } else {
                    if (a.o(kVar.n()) == 0.0f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        if (a.m(kVar.o()) == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            return true;
                        }
                        if (a.o(kVar.o()) == 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            return true;
                        }
                    }
                }
            } else {
                if (a.o(kVar.u()) == 0.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    if (a.m(kVar.n()) == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (a.m(kVar.o()) == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            return true;
                        }
                        if (a.o(kVar.o()) == 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            return true;
                        }
                    } else {
                        if (a.o(kVar.n()) == 0.0f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (a.m(kVar.o()) == 0.0f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                return true;
                            }
                            if (a.o(kVar.o()) == 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (a.o(kVar.t()) == 0.0f) {
                if (a.m(kVar.u()) == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (a.m(kVar.n()) == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (a.m(kVar.o()) == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            return true;
                        }
                        if (a.o(kVar.o()) == 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            return true;
                        }
                    } else {
                        if (a.o(kVar.n()) == 0.0f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (a.m(kVar.o()) == 0.0f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                return true;
                            }
                            if (a.o(kVar.o()) == 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                return true;
                            }
                        }
                    }
                } else {
                    if (a.o(kVar.u()) == 0.0f) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        if (a.m(kVar.n()) == 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (a.m(kVar.o()) == 0.0f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                return true;
                            }
                            if (a.o(kVar.o()) == 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                return true;
                            }
                        } else {
                            if (a.o(kVar.n()) == 0.0f) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                if (a.m(kVar.o()) == 0.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    return true;
                                }
                                if (a.o(kVar.o()) == 0.0f) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean q(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        if (a.m(kVar.t()) == a.o(kVar.t())) {
            if (a.m(kVar.t()) == a.m(kVar.u())) {
                if (a.m(kVar.t()) == a.o(kVar.u())) {
                    if (a.m(kVar.t()) == a.m(kVar.o())) {
                        if (a.m(kVar.t()) == a.o(kVar.o())) {
                            if (a.m(kVar.t()) == a.m(kVar.n())) {
                                if (a.m(kVar.t()) == a.o(kVar.n())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @dl.d
    public static final k r(@dl.d k start, @dl.d k stop, float f10) {
        f0.p(start, "start");
        f0.p(stop, "stop");
        return new k(u1.d.a(start.q(), stop.q(), f10), u1.d.a(start.s(), stop.s(), f10), u1.d.a(start.r(), stop.r(), f10), u1.d.a(start.m(), stop.m(), f10), b.c(start.t(), stop.t(), f10), b.c(start.u(), stop.u(), f10), b.c(start.o(), stop.o(), f10), b.c(start.n(), stop.n(), f10), null);
    }

    @dl.d
    public static final k s(@dl.d k translate, long j10) {
        f0.p(translate, "$this$translate");
        return new k(translate.q() + f.p(j10), translate.s() + f.r(j10), translate.r() + f.p(j10), translate.m() + f.r(j10), translate.t(), translate.u(), translate.o(), translate.n(), null);
    }
}
