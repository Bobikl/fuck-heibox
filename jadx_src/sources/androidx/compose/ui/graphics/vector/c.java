package androidx.compose.ui.graphics.vector;

import androidx.compose.foundation.b0;
import androidx.compose.runtime.m0;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.x;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.s0;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002\b\u000eBT\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR \u0010#\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R \u0010'\u001a\u00020$8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b\u001b\u0010&R\u0017\u0010*\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b\b\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/vector/c;", "", "other", "", "equals", "", "hashCode", "", ak.av, "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "Ls1/h;", "b", "F", ak.aF, "()F", "defaultWidth", "defaultHeight", "", "i", "viewportWidth", "e", RXScreenCaptureService.KEY_HEIGHT, "viewportHeight", "Landroidx/compose/ui/graphics/vector/o;", "f", "Landroidx/compose/ui/graphics/vector/o;", "()Landroidx/compose/ui/graphics/vector/o;", "root", "Landroidx/compose/ui/graphics/l0;", "g", "J", "()J", "tintColor", "Landroidx/compose/ui/graphics/x;", "I", "()I", "tintBlendMode", "Z", "()Z", "autoMirror", "<init>", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/o;JIZLkotlin/jvm/internal/u;)V", "j", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float defaultWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float defaultHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float viewportWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float viewportHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o root;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long tintColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int tintBlendMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean autoMirror;

    /* JADX INFO: compiled from: ImageVector.kt */
    @Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BR\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\t\u0012\u0006\u00103\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u000204\u0012\b\b\u0002\u00109\u001a\u000207\u0012\b\b\u0002\u0010<\u001a\u00020:ø\u0001\u0001¢\u0006\u0004\bH\u0010IBJ\b\u0017\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00102\u001a\u00020\t\u0012\u0006\u00103\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u000204\u0012\b\b\u0002\u00109\u001a\u000207ø\u0001\u0001¢\u0006\u0004\bH\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002Jf\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0006\u0010\u0015\u001a\u00020\u0000J§\u0001\u0010'\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0006\u0010*\u001a\u00020)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001d\u0010/\u001a\u00020,8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00100\u001a\u00020,8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010.R\u0014\u00102\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u001d\u00106\u001a\u0002048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u00105R\u001d\u00109\u001a\u0002078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R#\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010G\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010F\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/vector/c$a;", "", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/graphics/vector/c$a$a;", "Landroidx/compose/ui/graphics/vector/o;", "e", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/f;", "clipPathData", ak.av, "g", "pathData", "Landroidx/compose/ui/graphics/n1;", "pathFillType", "Landroidx/compose/ui/graphics/a0;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/j2;", "strokeLineCap", "Landroidx/compose/ui/graphics/k2;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", ak.aF, "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/a0;FFIIFFFF)Landroidx/compose/ui/graphics/vector/c$a;", "Landroidx/compose/ui/graphics/vector/c;", "f", "Ljava/lang/String;", "Ls1/h;", "b", "F", "defaultWidth", "defaultHeight", "d", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/l0;", "J", "tintColor", "Landroidx/compose/ui/graphics/x;", "I", "tintBlendMode", "", "Z", "autoMirror", "Landroidx/compose/ui/graphics/vector/i;", "i", "Ljava/util/ArrayList;", "nodes", "j", "Landroidx/compose/ui/graphics/vector/c$a$a;", "root", "k", "isConsumed", "()Landroidx/compose/ui/graphics/vector/c$a$a;", "currentGroup", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/u;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/u;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f14165l = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float defaultWidth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float defaultHeight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float viewportWidth;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float viewportHeight;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long tintColor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int tintBlendMode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean autoMirror;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ArrayList<Object> nodes;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private C0084a root;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean isConsumed;

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageVector.kt */
        @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b/\u00100R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\"\u0010#\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R(\u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b\u000b\u0010'\"\u0004\b(\u0010)R(\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b\u0003\u0010'\"\u0004\b-\u0010)¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/vector/c$a$a;", "", "", ak.av, "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "name", "", "b", "F", "f", "()F", "p", "(F)V", "rotate", "d", "n", "pivotX", "e", "o", "pivotY", "g", "q", "scaleX", RXScreenCaptureService.KEY_HEIGHT, "r", "scaleY", "i", ak.aB, "translationX", "j", "t", "translationY", "", "Landroidx/compose/ui/graphics/vector/f;", "Ljava/util/List;", "()Ljava/util/List;", "l", "(Ljava/util/List;)V", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/q;", "k", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
        public static final class C0084a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private String name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private float rotate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private float pivotX;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private float pivotY;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private float scaleX;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private float scaleY;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private float translationX;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private float translationY;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private List<? extends f> clipPathData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @dl.d
            private List<q> children;

            public C0084a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public C0084a(@dl.d String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @dl.d List<? extends f> clipPathData, @dl.d List<q> children) {
                f0.p(name, "name");
                f0.p(clipPathData, "clipPathData");
                f0.p(children, "children");
                this.name = name;
                this.rotate = f10;
                this.pivotX = f11;
                this.pivotY = f12;
                this.scaleX = f13;
                this.scaleY = f14;
                this.translationX = f15;
                this.translationY = f16;
                this.clipPathData = clipPathData;
                this.children = children;
            }

            public /* synthetic */ C0084a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, u uVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? p.h() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }

            @dl.d
            public final List<q> a() {
                return this.children;
            }

            @dl.d
            public final List<f> b() {
                return this.clipPathData;
            }

            @dl.d
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getPivotX() {
                return this.pivotX;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getPivotY() {
                return this.pivotY;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getRotate() {
                return this.rotate;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getScaleX() {
                return this.scaleX;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final float getScaleY() {
                return this.scaleY;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final float getTranslationX() {
                return this.translationX;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final float getTranslationY() {
                return this.translationY;
            }

            public final void k(@dl.d List<q> list) {
                f0.p(list, "<set-?>");
                this.children = list;
            }

            public final void l(@dl.d List<? extends f> list) {
                f0.p(list, "<set-?>");
                this.clipPathData = list;
            }

            public final void m(@dl.d String str) {
                f0.p(str, "<set-?>");
                this.name = str;
            }

            public final void n(float f10) {
                this.pivotX = f10;
            }

            public final void o(float f10) {
                this.pivotY = f10;
            }

            public final void p(float f10) {
                this.rotate = f10;
            }

            public final void q(float f10) {
                this.scaleX = f10;
            }

            public final void r(float f10) {
                this.scaleY = f10;
            }

            public final void s(float f10) {
                this.translationX = f10;
            }

            public final void t(float f10) {
                this.translationY = f10;
            }
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10) {
            this(str, f10, f11, f12, f13, j10, i10, false, (u) null);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, int i11, u uVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? l0.INSTANCE.u() : j10, (i11 & 64) != 0 ? x.INSTANCE.z() : i10, (u) null);
        }

        @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @s0(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, u uVar) {
            this(str, f10, f11, f12, f13, j10, i10);
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.name = str;
            this.defaultWidth = f10;
            this.defaultHeight = f11;
            this.viewportWidth = f12;
            this.viewportHeight = f13;
            this.tintColor = j10;
            this.tintBlendMode = i10;
            this.autoMirror = z10;
            ArrayList<Object> arrayListC = i.c(null, 1, null);
            this.nodes = arrayListC;
            C0084a c0084a = new C0084a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = c0084a;
            i.j(arrayListC, c0084a);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, u uVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? l0.INSTANCE.u() : j10, (i11 & 64) != 0 ? x.INSTANCE.z() : i10, (i11 & 128) != 0 ? false : z10, (u) null);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, u uVar) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        private final o e(C0084a c0084a) {
            return new o(c0084a.getName(), c0084a.getRotate(), c0084a.getPivotX(), c0084a.getPivotY(), c0084a.getScaleX(), c0084a.getScaleY(), c0084a.getTranslationX(), c0084a.getTranslationY(), c0084a.b(), c0084a.a());
        }

        private final void h() {
            if (!(!this.isConsumed)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final C0084a i() {
            return (C0084a) i.h(this.nodes);
        }

        @dl.d
        public final a a(@dl.d String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, @dl.d List<? extends f> clipPathData) {
            f0.p(name, "name");
            f0.p(clipPathData, "clipPathData");
            h();
            i.j(this.nodes, new C0084a(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, clipPathData, null, 512, null));
            return this;
        }

        @dl.d
        public final a c(@dl.d List<? extends f> pathData, int pathFillType, @dl.d String name, @dl.e a0 fill, float fillAlpha, @dl.e a0 stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            f0.p(pathData, "pathData");
            f0.p(name, "name");
            h();
            i().a().add(new r(name, pathData, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        @dl.d
        public final c f() {
            h();
            while (i.f(this.nodes) > 1) {
                g();
            }
            c cVar = new c(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, e(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, null);
            this.isConsumed = true;
            return cVar;
        }

        @dl.d
        public final a g() {
            h();
            i().a().add(e((C0084a) i.i(this.nodes)));
            return this;
        }
    }

    private c(String str, float f10, float f11, float f12, float f13, o oVar, long j10, int i10, boolean z10) {
        this.name = str;
        this.defaultWidth = f10;
        this.defaultHeight = f11;
        this.viewportWidth = f12;
        this.viewportHeight = f13;
        this.root = oVar;
        this.tintColor = j10;
        this.tintBlendMode = i10;
        this.autoMirror = z10;
    }

    public /* synthetic */ c(String str, float f10, float f11, float f12, float f13, o oVar, long j10, int i10, boolean z10, u uVar) {
        this(str, f10, f11, f12, f13, oVar, j10, i10, z10);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getDefaultWidth() {
        return this.defaultWidth;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getRoot() {
        return this.root;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        if (!f0.g(this.name, cVar.name) || !s1.h.l(this.defaultWidth, cVar.defaultWidth) || !s1.h.l(this.defaultHeight, cVar.defaultHeight)) {
            return false;
        }
        if (this.viewportWidth == cVar.viewportWidth) {
            return ((this.viewportHeight > cVar.viewportHeight ? 1 : (this.viewportHeight == cVar.viewportHeight ? 0 : -1)) == 0) && f0.g(this.root, cVar.root) && l0.y(this.tintColor, cVar.tintColor) && x.G(this.tintBlendMode, cVar.tintBlendMode) && this.autoMirror == cVar.autoMirror;
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTintBlendMode() {
        return this.tintBlendMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + s1.h.n(this.defaultWidth)) * 31) + s1.h.n(this.defaultHeight)) * 31) + Float.floatToIntBits(this.viewportWidth)) * 31) + Float.floatToIntBits(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + l0.K(this.tintColor)) * 31) + x.H(this.tintBlendMode)) * 31) + b0.a(this.autoMirror);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }
}
