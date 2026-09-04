package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009e\u0001\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0089\u0001\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/vector/c$a;", "", "name", "Landroidx/compose/ui/graphics/a0;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/j2;", "strokeLineCap", "Landroidx/compose/ui/graphics/k2;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/n1;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/e;", "Lkotlin/b2;", "Lkotlin/t;", "pathBuilder", ak.aF, "(Landroidx/compose/ui/graphics/vector/c$a;Ljava/lang/String;Landroidx/compose/ui/graphics/a0;FLandroidx/compose/ui/graphics/a0;FFIIFILyh/l;)Landroidx/compose/ui/graphics/vector/c$a;", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/f;", "clipPathData", "block", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @dl.d
    public static final c.a a(@dl.d c.a aVar, @dl.d String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @dl.d List<? extends f> clipPathData, @dl.d yh.l<? super c.a, b2> block) {
        f0.p(aVar, "<this>");
        f0.p(name, "name");
        f0.p(clipPathData, "clipPathData");
        f0.p(block, "block");
        aVar.a(name, f10, f11, f12, f13, f14, f15, f16, clipPathData);
        block.invoke(aVar);
        aVar.g();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c.a b(c.a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, yh.l block, int i10, Object obj) {
        String name = (i10 & 1) != 0 ? "" : str;
        float f17 = (i10 & 2) != 0 ? 0.0f : f10;
        float f18 = (i10 & 4) != 0 ? 0.0f : f11;
        float f19 = (i10 & 8) != 0 ? 0.0f : f12;
        float f20 = (i10 & 16) != 0 ? 1.0f : f13;
        float f21 = (i10 & 32) == 0 ? f14 : 1.0f;
        float f22 = (i10 & 64) != 0 ? 0.0f : f15;
        float f23 = (i10 & 128) != 0 ? 0.0f : f16;
        List clipPathData = (i10 & 256) != 0 ? p.h() : list;
        f0.p(aVar, "<this>");
        f0.p(name, "name");
        f0.p(clipPathData, "clipPathData");
        f0.p(block, "block");
        aVar.a(name, f17, f18, f19, f20, f21, f22, f23, clipPathData);
        block.invoke(aVar);
        aVar.g();
        return aVar;
    }

    @dl.d
    public static final c.a c(@dl.d c.a path, @dl.d String name, @dl.e a0 a0Var, float f10, @dl.e a0 a0Var2, float f11, float f12, int i10, int i11, float f13, int i12, @dl.d yh.l<? super e, b2> pathBuilder) {
        f0.p(path, "$this$path");
        f0.p(name, "name");
        f0.p(pathBuilder, "pathBuilder");
        e eVar = new e();
        pathBuilder.invoke(eVar);
        return path.c(eVar.g(), (14336 & 2) != 0 ? p.c() : i12, (14336 & 4) != 0 ? "" : name, (14336 & 8) != 0 ? null : a0Var, (14336 & 16) != 0 ? 1.0f : f10, (14336 & 32) == 0 ? a0Var2 : null, (14336 & 64) != 0 ? 1.0f : f11, (14336 & 128) != 0 ? 0.0f : f12, (14336 & 256) != 0 ? p.d() : i10, (14336 & 512) != 0 ? p.e() : i11, (14336 & 1024) != 0 ? 4.0f : f13, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }

    public static /* synthetic */ c.a d(c.a path, String str, a0 a0Var, float f10, a0 a0Var2, float f11, float f12, int i10, int i11, float f13, int i12, yh.l pathBuilder, int i13, Object obj) {
        String name = (i13 & 1) != 0 ? "" : str;
        a0 a0Var3 = (i13 & 2) != 0 ? null : a0Var;
        float f14 = (i13 & 4) != 0 ? 1.0f : f10;
        a0 a0Var4 = (i13 & 8) != 0 ? null : a0Var2;
        float f15 = (i13 & 16) != 0 ? 1.0f : f11;
        float f16 = (i13 & 32) != 0 ? 0.0f : f12;
        int iD = (i13 & 64) != 0 ? p.d() : i10;
        int iE = (i13 & 128) != 0 ? p.e() : i11;
        float f17 = (i13 & 256) != 0 ? 4.0f : f13;
        int iC = (i13 & 512) != 0 ? p.c() : i12;
        f0.p(path, "$this$path");
        f0.p(name, "name");
        f0.p(pathBuilder, "pathBuilder");
        e eVar = new e();
        pathBuilder.invoke(eVar);
        return path.c(eVar.g(), (14336 & 2) != 0 ? p.c() : iC, (14336 & 4) != 0 ? "" : name, (14336 & 8) != 0 ? null : a0Var3, (14336 & 16) != 0 ? 1.0f : f14, (14336 & 32) == 0 ? a0Var4 : null, (14336 & 64) != 0 ? 1.0f : f15, (14336 & 128) != 0 ? 0.0f : f16, (14336 & 256) != 0 ? p.d() : iD, (14336 & 512) != 0 ? p.e() : iE, (14336 & 1024) != 0 ? 4.0f : f17, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }
}
