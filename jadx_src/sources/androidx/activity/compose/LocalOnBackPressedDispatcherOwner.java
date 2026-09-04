package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.activity.s;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.h;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
@o(parameters = 0)
public final class LocalOnBackPressedDispatcherOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LocalOnBackPressedDispatcherOwner f1438a = new LocalOnBackPressedDispatcherOwner();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final j1<s> f1439b = CompositionLocalKt.d(null, new yh.a<s>() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1440c = 0;

    private LocalOnBackPressedDispatcherOwner() {
    }

    @h(name = "getCurrent")
    @dl.e
    @androidx.compose.runtime.h
    public final s a(@dl.e p pVar, int i10) {
        pVar.T(-2068013981);
        s sVarA = (s) pVar.K(f1439b);
        pVar.T(1680121597);
        if (sVarA == null) {
            sVarA = ViewTreeOnBackPressedDispatcherOwner.a((View) pVar.K(AndroidCompositionLocals_androidKt.k()));
        }
        pVar.c0();
        if (sVarA == null) {
            Object baseContext = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof s) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                f0.o(baseContext, "innerContext.baseContext");
            }
            sVarA = (s) baseContext;
        }
        pVar.c0();
        return sVarA;
    }

    @dl.d
    public final k1<s> b(@dl.d s dispatcherOwner) {
        f0.p(dispatcherOwner, "dispatcherOwner");
        return f1439b.f(dispatcherOwner);
    }
}
