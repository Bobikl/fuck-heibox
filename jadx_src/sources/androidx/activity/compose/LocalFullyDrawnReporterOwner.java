package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.activity.n;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.h;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
@o(parameters = 0)
public final class LocalFullyDrawnReporterOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LocalFullyDrawnReporterOwner f1434a = new LocalFullyDrawnReporterOwner();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final j1<n> f1435b = CompositionLocalKt.d(null, new yh.a<n>() { // from class: androidx.activity.compose.LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1436c = 0;

    private LocalFullyDrawnReporterOwner() {
    }

    @h(name = "getCurrent")
    @dl.e
    @androidx.compose.runtime.h
    public final n a(@dl.e p pVar, int i10) {
        pVar.T(540186968);
        n nVarA = (n) pVar.K(f1435b);
        pVar.T(1606493384);
        if (nVarA == null) {
            nVarA = ViewTreeFullyDrawnReporterOwner.a((View) pVar.K(AndroidCompositionLocals_androidKt.k()));
        }
        pVar.c0();
        if (nVarA == null) {
            Object baseContext = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof n) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                f0.o(baseContext, "innerContext.baseContext");
            }
            nVarA = (n) baseContext;
        }
        pVar.c0();
        return nVarA;
    }

    @dl.d
    public final k1<n> b(@dl.d n fullyDrawnReporterOwner) {
        f0.p(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        return f1435b.f(fullyDrawnReporterOwner);
    }
}
