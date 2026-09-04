package r0;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: KeyboardArrowDown.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln0/a$d;", "Landroidx/compose/ui/graphics/vector/c;", ak.av, "(Ln0/a$d;)Landroidx/compose/ui/graphics/vector/c;", "KeyboardArrowDown", "material-icons-core_release"}, k = 2, mv = {1, 7, 1})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private static androidx.compose.ui.graphics.vector.c f138754a;

    @dl.d
    public static final androidx.compose.ui.graphics.vector.c a(@dl.d n0.a.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        androidx.compose.ui.graphics.vector.c cVar = f138754a;
        if (cVar != null) {
            kotlin.jvm.internal.f0.m(cVar);
            return cVar;
        }
        androidx.compose.ui.graphics.vector.c.a aVar = new androidx.compose.ui.graphics.vector.c.a("Sharp.KeyboardArrowDown", s1.h.g(24.0f), s1.h.g(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.u) null);
        int iC = androidx.compose.ui.graphics.vector.p.c();
        SolidColor solidColor = new SolidColor(androidx.compose.ui.graphics.l0.INSTANCE.a(), null);
        int iA = j2.INSTANCE.a();
        int iA2 = k2.INSTANCE.a();
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e();
        eVar.l(7.41f, 8.59f);
        eVar.j(12.0f, 13.17f);
        eVar.k(4.59f, -4.58f);
        eVar.j(18.0f, 10.0f);
        eVar.k(-6.0f, 6.0f);
        eVar.k(-6.0f, -6.0f);
        eVar.k(1.41f, -1.41f);
        eVar.d();
        androidx.compose.ui.graphics.vector.c cVarF = aVar.c(eVar.g(), (14336 & 2) != 0 ? androidx.compose.ui.graphics.vector.p.c() : iC, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? androidx.compose.ui.graphics.vector.p.d() : iA, (14336 & 512) != 0 ? androidx.compose.ui.graphics.vector.p.e() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f138754a = cVarF;
        kotlin.jvm.internal.f0.m(cVarF);
        return cVarF;
    }
}
