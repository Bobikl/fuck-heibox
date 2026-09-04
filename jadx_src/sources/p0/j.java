package p0;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CheckCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln0/a$b;", "Landroidx/compose/ui/graphics/vector/c;", ak.av, "(Ln0/a$b;)Landroidx/compose/ui/graphics/vector/c;", "CheckCircle", "material-icons-core_release"}, k = 2, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private static androidx.compose.ui.graphics.vector.c f138103a;

    @dl.d
    public static final androidx.compose.ui.graphics.vector.c a(@dl.d n0.a.b bVar) {
        kotlin.jvm.internal.f0.p(bVar, "<this>");
        androidx.compose.ui.graphics.vector.c cVar = f138103a;
        if (cVar != null) {
            kotlin.jvm.internal.f0.m(cVar);
            return cVar;
        }
        androidx.compose.ui.graphics.vector.c.a aVar = new androidx.compose.ui.graphics.vector.c.a("Outlined.CheckCircle", s1.h.g(24.0f), s1.h.g(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.u) null);
        int iC = androidx.compose.ui.graphics.vector.p.c();
        SolidColor solidColor = new SolidColor(androidx.compose.ui.graphics.l0.INSTANCE.a(), null);
        int iA = j2.INSTANCE.a();
        int iA2 = k2.INSTANCE.a();
        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e();
        eVar.l(12.0f, 2.0f);
        eVar.e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVar.q(4.48f, 10.0f, 10.0f, 10.0f);
        eVar.q(10.0f, -4.48f, 10.0f, -10.0f);
        eVar.p(17.52f, 2.0f, 12.0f, 2.0f);
        eVar.d();
        eVar.l(12.0f, 20.0f);
        eVar.f(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        eVar.q(3.59f, -8.0f, 8.0f, -8.0f);
        eVar.q(8.0f, 3.59f, 8.0f, 8.0f);
        eVar.q(-3.59f, 8.0f, -8.0f, 8.0f);
        eVar.d();
        eVar.l(16.59f, 7.58f);
        eVar.j(10.0f, 14.17f);
        eVar.k(-2.59f, -2.58f);
        eVar.j(6.0f, 13.0f);
        eVar.k(4.0f, 4.0f);
        eVar.k(8.0f, -8.0f);
        eVar.d();
        androidx.compose.ui.graphics.vector.c cVarF = aVar.c(eVar.g(), (14336 & 2) != 0 ? androidx.compose.ui.graphics.vector.p.c() : iC, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? androidx.compose.ui.graphics.vector.p.d() : iA, (14336 & 512) != 0 ? androidx.compose.ui.graphics.vector.p.e() : iA2, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f).f();
        f138103a = cVarF;
        kotlin.jvm.internal.f0.m(cVarF);
        return cVarF;
    }
}
