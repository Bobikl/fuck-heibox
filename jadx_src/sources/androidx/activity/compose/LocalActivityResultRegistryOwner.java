package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.i;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.h;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
@o(parameters = 0)
public final class LocalActivityResultRegistryOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LocalActivityResultRegistryOwner f1430a = new LocalActivityResultRegistryOwner();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final j1<i> f1431b = CompositionLocalKt.d(null, new yh.a<i>() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$LocalComposition$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1432c = 0;

    private LocalActivityResultRegistryOwner() {
    }

    @h(name = "getCurrent")
    @dl.e
    @androidx.compose.runtime.h
    public final i a(@dl.e p pVar, int i10) {
        pVar.T(1418020823);
        i iVar = (i) pVar.K(f1431b);
        if (iVar == null) {
            Object baseContext = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof i) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                f0.o(baseContext, "innerContext.baseContext");
            }
            iVar = (i) baseContext;
        }
        pVar.c0();
        return iVar;
    }

    @dl.d
    public final k1<i> b(@dl.d i registryOwner) {
        f0.p(registryOwner, "registryOwner");
        return f1431b.f(registryOwner);
    }
}
