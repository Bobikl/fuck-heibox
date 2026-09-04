package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.j1;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.b;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.taskdefs.condition.a0;
import org.apache.tools.ant.taskdefs.p7;
import yh.l;

/* JADX INFO: compiled from: SidecarAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\nJ\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eJ!\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", p7.a.f135567e, "", ak.aF, "b", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Landroidx/window/layout/h;", "f", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/v;", "e", ak.av, "d", a0.f133861i, "g", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/h;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "<init>", "(Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SidecarAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28580c = SidecarAdapter.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final SpecificationComputer.VerificationMode verificationMode;

    /* JADX INFO: renamed from: androidx.window.layout.SidecarAdapter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/SidecarAdapter$a;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", ak.aF, "displayFeatures", "Lkotlin/b2;", "e", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "b", "(Landroidx/window/sidecar/SidecarDeviceState;)I", ak.av, "posture", "d", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @j1
        @SuppressLint({"BanUncheckedReflection"})
        public final int a(@d SidecarDeviceState sidecarDeviceState) {
            f0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(@d SidecarDeviceState sidecarDeviceState) {
            f0.p(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @j1
        @d
        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(@d SidecarWindowLayoutInfo info) {
            f0.p(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? CollectionsKt__CollectionsKt.E() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return CollectionsKt__CollectionsKt.E();
            }
        }

        @j1
        @SuppressLint({"BanUncheckedReflection"})
        public final void d(@d SidecarDeviceState sidecarDeviceState, int i10) {
            f0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @j1
        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@d SidecarWindowLayoutInfo info, @d List<SidecarDisplayFeature> displayFeatures) {
            f0.p(info, "info");
            f0.p(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SidecarAdapter(@d SpecificationComputer.VerificationMode verificationMode) {
        f0.p(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i10, u uVar) {
        this((i10 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }

    private final boolean b(SidecarDisplayFeature first, SidecarDisplayFeature second) {
        if (f0.g(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return f0.g(first.getRect(), second.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> first, List<SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b(first.get(i10), second.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean a(@e SidecarDeviceState first, @e SidecarDeviceState second) {
        if (f0.g(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return companion.b(first) == companion.b(second);
    }

    public final boolean d(@e SidecarWindowLayoutInfo first, @e SidecarWindowLayoutInfo second) {
        if (f0.g(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return c(companion.c(first), companion.c(second));
    }

    @d
    public final v e(@e SidecarWindowLayoutInfo extensionInfo, @d SidecarDeviceState state) {
        f0.p(state, "state");
        if (extensionInfo == null) {
            return new v(CollectionsKt__CollectionsKt.E());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = INSTANCE;
        companion.d(sidecarDeviceState, companion.b(state));
        return new v(f(companion.c(extensionInfo), sidecarDeviceState));
    }

    @d
    public final List<h> f(@d List<SidecarDisplayFeature> sidecarDisplayFeatures, @d SidecarDeviceState deviceState) {
        f0.p(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        f0.p(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            h hVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (hVarG != null) {
                arrayList.add(hVarG);
            }
        }
        return arrayList;
    }

    @e
    public final h g(@d SidecarDisplayFeature feature, @d SidecarDeviceState deviceState) {
        n.b bVarA;
        m.c cVar;
        f0.p(feature, "feature");
        f0.p(deviceState, "deviceState");
        SpecificationComputer.Companion companion = SpecificationComputer.INSTANCE;
        String TAG = f28580c;
        f0.o(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.Companion.b(companion, feature, TAG, this.verificationMode, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", new l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d androidx.window.sidecar.SidecarDisplayFeature require) {
                f0.p(require, "$this$require");
                boolean z10 = true;
                if (require.getType() != 1 && require.getType() != 2) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).c("Feature bounds must not be 0", new l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d SidecarDisplayFeature require) {
                f0.p(require, "$this$require");
                return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
            }
        }).c("TYPE_FOLD must have 0 area", new l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d SidecarDisplayFeature require) {
                f0.p(require, "$this$require");
                boolean z10 = true;
                if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).c("Feature be pinned to either left or top", new l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@d SidecarDisplayFeature require) {
                f0.p(require, "$this$require");
                return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
            }
        }).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = n.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = n.b.INSTANCE.b();
        }
        int iB = INSTANCE.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            cVar = m.c.f28645d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            cVar = m.c.f28644c;
        }
        Rect rect = feature.getRect();
        f0.o(rect, "feature.rect");
        return new n(new b(rect), bVarA, cVar);
    }
}
