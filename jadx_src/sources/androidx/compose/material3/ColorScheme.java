package androidx.compose.material3;

import androidx.compose.runtime.j2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.o, reason: from toString */
/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\bC\b\u0007\u0018\u00002\u00020\u0001Bò\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010dJµ\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\"H\u0016R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R4\u0010\u0004\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R4\u0010\u0005\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R4\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R4\u0010\u0007\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R4\u0010\b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R4\u0010\t\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010%\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)R4\u0010\n\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'\"\u0004\b=\u0010)R4\u0010\u000b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'\"\u0004\b@\u0010)R4\u0010\f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'\"\u0004\bC\u0010)R4\u0010\r\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010%\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R4\u0010\u000e\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\bG\u0010'\"\u0004\bH\u0010)R4\u0010\u000f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R4\u0010\u0010\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b-\u0010'\"\u0004\bK\u0010)R4\u0010\u0011\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b>\u0010'\"\u0004\bL\u0010)R4\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bM\u0010%\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R4\u0010\u0013\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bP\u0010%\u001a\u0004\bM\u0010'\"\u0004\bQ\u0010)R4\u0010\u0014\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bE\u0010%\u001a\u0004\bR\u0010'\"\u0004\bS\u0010)R4\u0010\u0015\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bI\u0010%\u001a\u0004\bP\u0010'\"\u0004\bT\u0010)R4\u0010\u0016\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bU\u0010%\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R4\u0010\u0017\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bX\u0010%\u001a\u0004\b;\u0010'\"\u0004\bY\u0010)R4\u0010\u0018\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b6\u0010'\"\u0004\bZ\u0010)R4\u0010\u0019\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b0\u0010'\"\u0004\b[\u0010)R4\u0010\u001a\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010%\u001a\u0004\bA\u0010'\"\u0004\b]\u0010)R4\u0010\u001b\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u0010%\u001a\u0004\b3\u0010'\"\u0004\b^\u0010)R4\u0010\u001c\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010%\u001a\u0004\bD\u0010'\"\u0004\b_\u0010)R4\u0010\u001d\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bN\u0010%\u001a\u0004\bU\u0010'\"\u0004\b`\u0010)R4\u0010\u001e\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bV\u0010%\u001a\u0004\bX\u0010'\"\u0004\ba\u0010)R4\u0010\u001f\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bR\u0010%\u001a\u0004\b\\\u0010'\"\u0004\bb\u0010)\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006e"}, d2 = {"Landroidx/compose/material3/o;", "", "Landroidx/compose/ui/graphics/l0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", UiKitSpanObj.TYPE_BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", ak.av, "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/o;", "", "toString", "<set-?>", "Landroidx/compose/runtime/a1;", "v", "()J", "Y", "(J)V", "b", "l", "O", ak.aF, RXScreenCaptureService.KEY_WIDTH, "Z", "d", "m", "P", "e", "g", "J", "f", "y", "b0", "n", "Q", RXScreenCaptureService.KEY_HEIGHT, ak.aD, "c0", "i", "o", "R", "j", "D", "g0", "k", "r", "U", androidx.exifinterface.media.a.S4, "h0", ak.aB, androidx.exifinterface.media.a.X4, "F", "L", "p", androidx.exifinterface.media.a.W4, "d0", "q", androidx.exifinterface.media.a.R4, "C", "f0", androidx.exifinterface.media.a.f23244d5, "t", "B", "e0", ak.aG, "K", "I", "G", "x", "M", "H", "N", androidx.exifinterface.media.a.T4, "X", "a0", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/u;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class ColorScheme {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 outline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 outlineVariant;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 scrim;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onPrimary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 primaryContainer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onPrimaryContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 inversePrimary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 secondary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onSecondary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 secondaryContainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onSecondaryContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 tertiary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onTertiary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 tertiaryContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onTertiaryContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 background;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onBackground;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 surface;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onSurface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 surfaceVariant;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onSurfaceVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 surfaceTint;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 inverseSurface;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 inverseOnSurface;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 error;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onError;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 errorContainer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 onErrorContainer;

    private ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        this.primary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j10), androidx.compose.runtime.e2.w());
        this.onPrimary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j11), androidx.compose.runtime.e2.w());
        this.primaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j12), androidx.compose.runtime.e2.w());
        this.onPrimaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j13), androidx.compose.runtime.e2.w());
        this.inversePrimary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j14), androidx.compose.runtime.e2.w());
        this.secondary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j15), androidx.compose.runtime.e2.w());
        this.onSecondary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j16), androidx.compose.runtime.e2.w());
        this.secondaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j17), androidx.compose.runtime.e2.w());
        this.onSecondaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j18), androidx.compose.runtime.e2.w());
        this.tertiary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j19), androidx.compose.runtime.e2.w());
        this.onTertiary = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j20), androidx.compose.runtime.e2.w());
        this.tertiaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j21), androidx.compose.runtime.e2.w());
        this.onTertiaryContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j22), androidx.compose.runtime.e2.w());
        this.background = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j23), androidx.compose.runtime.e2.w());
        this.onBackground = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j24), androidx.compose.runtime.e2.w());
        this.surface = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j25), androidx.compose.runtime.e2.w());
        this.onSurface = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j26), androidx.compose.runtime.e2.w());
        this.surfaceVariant = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j27), androidx.compose.runtime.e2.w());
        this.onSurfaceVariant = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j28), androidx.compose.runtime.e2.w());
        this.surfaceTint = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j29), androidx.compose.runtime.e2.w());
        this.inverseSurface = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j30), androidx.compose.runtime.e2.w());
        this.inverseOnSurface = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j31), androidx.compose.runtime.e2.w());
        this.error = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j32), androidx.compose.runtime.e2.w());
        this.onError = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j33), androidx.compose.runtime.e2.w());
        this.errorContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j34), androidx.compose.runtime.e2.w());
        this.onErrorContainer = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j35), androidx.compose.runtime.e2.w());
        this.outline = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j36), androidx.compose.runtime.e2.w());
        this.outlineVariant = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j37), androidx.compose.runtime.e2.w());
        this.scrim = androidx.compose.runtime.e2.j(androidx.compose.ui.graphics.l0.n(j38), androidx.compose.runtime.e2.w());
    }

    public /* synthetic */ ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long A() {
        return ((androidx.compose.ui.graphics.l0) this.surface.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B() {
        return ((androidx.compose.ui.graphics.l0) this.surfaceTint.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long C() {
        return ((androidx.compose.ui.graphics.l0) this.surfaceVariant.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long D() {
        return ((androidx.compose.ui.graphics.l0) this.tertiary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long E() {
        return ((androidx.compose.ui.graphics.l0) this.tertiaryContainer.getValue()).M();
    }

    public final void F(long j10) {
        this.background.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void G(long j10) {
        this.error.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void H(long j10) {
        this.errorContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void I(long j10) {
        this.inverseOnSurface.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void J(long j10) {
        this.inversePrimary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void K(long j10) {
        this.inverseSurface.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void L(long j10) {
        this.onBackground.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void M(long j10) {
        this.onError.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void N(long j10) {
        this.onErrorContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void O(long j10) {
        this.onPrimary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void P(long j10) {
        this.onPrimaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void Q(long j10) {
        this.onSecondary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void R(long j10) {
        this.onSecondaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void S(long j10) {
        this.onSurface.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void T(long j10) {
        this.onSurfaceVariant.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void U(long j10) {
        this.onTertiary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void V(long j10) {
        this.onTertiaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void W(long j10) {
        this.outline.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void X(long j10) {
        this.outlineVariant.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void Y(long j10) {
        this.primary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void Z(long j10) {
        this.primaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    @dl.d
    public final ColorScheme a(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, null);
    }

    public final void a0(long j10) {
        this.scrim.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    public final void b0(long j10) {
        this.secondary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((androidx.compose.ui.graphics.l0) this.background.getValue()).M();
    }

    public final void c0(long j10) {
        this.secondaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((androidx.compose.ui.graphics.l0) this.error.getValue()).M();
    }

    public final void d0(long j10) {
        this.surface.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((androidx.compose.ui.graphics.l0) this.errorContainer.getValue()).M();
    }

    public final void e0(long j10) {
        this.surfaceTint.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((androidx.compose.ui.graphics.l0) this.inverseOnSurface.getValue()).M();
    }

    public final void f0(long j10) {
        this.surfaceVariant.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((androidx.compose.ui.graphics.l0) this.inversePrimary.getValue()).M();
    }

    public final void g0(long j10) {
        this.tertiary.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((androidx.compose.ui.graphics.l0) this.inverseSurface.getValue()).M();
    }

    public final void h0(long j10) {
        this.tertiaryContainer.setValue(androidx.compose.ui.graphics.l0.n(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        return ((androidx.compose.ui.graphics.l0) this.onBackground.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j() {
        return ((androidx.compose.ui.graphics.l0) this.onError.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k() {
        return ((androidx.compose.ui.graphics.l0) this.onErrorContainer.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        return ((androidx.compose.ui.graphics.l0) this.onPrimary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((androidx.compose.ui.graphics.l0) this.onPrimaryContainer.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n() {
        return ((androidx.compose.ui.graphics.l0) this.onSecondary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o() {
        return ((androidx.compose.ui.graphics.l0) this.onSecondaryContainer.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p() {
        return ((androidx.compose.ui.graphics.l0) this.onSurface.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((androidx.compose.ui.graphics.l0) this.onSurfaceVariant.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((androidx.compose.ui.graphics.l0) this.onTertiary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long s() {
        return ((androidx.compose.ui.graphics.l0) this.onTertiaryContainer.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long t() {
        return ((androidx.compose.ui.graphics.l0) this.outline.getValue()).M();
    }

    @dl.d
    public String toString() {
        return "ColorScheme(primary=" + ((Object) androidx.compose.ui.graphics.l0.L(v())) + "onPrimary=" + ((Object) androidx.compose.ui.graphics.l0.L(l())) + "primaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(w())) + "onPrimaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(m())) + "inversePrimary=" + ((Object) androidx.compose.ui.graphics.l0.L(g())) + "secondary=" + ((Object) androidx.compose.ui.graphics.l0.L(y())) + "onSecondary=" + ((Object) androidx.compose.ui.graphics.l0.L(n())) + "secondaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(z())) + "onSecondaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(o())) + "tertiary=" + ((Object) androidx.compose.ui.graphics.l0.L(D())) + "onTertiary=" + ((Object) androidx.compose.ui.graphics.l0.L(r())) + "tertiaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(E())) + "onTertiaryContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(s())) + "background=" + ((Object) androidx.compose.ui.graphics.l0.L(c())) + "onBackground=" + ((Object) androidx.compose.ui.graphics.l0.L(i())) + "surface=" + ((Object) androidx.compose.ui.graphics.l0.L(A())) + "onSurface=" + ((Object) androidx.compose.ui.graphics.l0.L(p())) + "surfaceVariant=" + ((Object) androidx.compose.ui.graphics.l0.L(C())) + "onSurfaceVariant=" + ((Object) androidx.compose.ui.graphics.l0.L(q())) + "surfaceTint=" + ((Object) androidx.compose.ui.graphics.l0.L(B())) + "inverseSurface=" + ((Object) androidx.compose.ui.graphics.l0.L(h())) + "inverseOnSurface=" + ((Object) androidx.compose.ui.graphics.l0.L(f())) + "error=" + ((Object) androidx.compose.ui.graphics.l0.L(d())) + "onError=" + ((Object) androidx.compose.ui.graphics.l0.L(j())) + "errorContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(e())) + "onErrorContainer=" + ((Object) androidx.compose.ui.graphics.l0.L(k())) + "outline=" + ((Object) androidx.compose.ui.graphics.l0.L(t())) + "outlineVariant=" + ((Object) androidx.compose.ui.graphics.l0.L(u())) + "scrim=" + ((Object) androidx.compose.ui.graphics.l0.L(x())) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long u() {
        return ((androidx.compose.ui.graphics.l0) this.outlineVariant.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long v() {
        return ((androidx.compose.ui.graphics.l0) this.primary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long w() {
        return ((androidx.compose.ui.graphics.l0) this.primaryContainer.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long x() {
        return ((androidx.compose.ui.graphics.l0) this.scrim.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long y() {
        return ((androidx.compose.ui.graphics.l0) this.secondary.getValue()).M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long z() {
        return ((androidx.compose.ui.graphics.l0) this.secondaryContainer.getValue()).M();
    }
}
