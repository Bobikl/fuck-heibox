package com.max.hbstory.delegate;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import com.google.gson.JsonObject;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbutils.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import fi.l;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryReportDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryReportDelegate implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f72851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f72852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f72853c;

    public StoryReportDelegate(@dl.d com.max.hbstory.d storyContext) {
        f0.p(storyContext, "storyContext");
        this.f72851a = storyContext;
        r();
        p();
        n();
        l();
        this.f72852b = System.currentTimeMillis();
    }

    public static final /* synthetic */ void g(StoryReportDelegate storyReportDelegate) {
        if (PatchProxy.proxy(new Object[]{storyReportDelegate}, null, changeQuickRedirect, true, bb.c.k.Ef, new Class[]{StoryReportDelegate.class}, Void.TYPE).isSupported) {
            return;
        }
        storyReportDelegate.v();
    }

    public static final /* synthetic */ void h(StoryReportDelegate storyReportDelegate, int i10) {
        if (PatchProxy.proxy(new Object[]{storyReportDelegate, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Bf, new Class[]{StoryReportDelegate.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        storyReportDelegate.w(i10);
    }

    public static final /* synthetic */ void i(StoryReportDelegate storyReportDelegate, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{storyReportDelegate, jsonObject}, null, changeQuickRedirect, true, bb.c.k.Cf, new Class[]{StoryReportDelegate.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        storyReportDelegate.x(jsonObject);
    }

    public static final /* synthetic */ void j(StoryReportDelegate storyReportDelegate, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{storyReportDelegate, jsonObject}, null, changeQuickRedirect, true, bb.c.k.Df, new Class[]{StoryReportDelegate.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        storyReportDelegate.y(jsonObject);
    }

    private final void l() {
        Fragment fragmentB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33736nf, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72851a.b()) == null) {
            return;
        }
        fragmentB.getLifecycle().a(new v() { // from class: com.max.hbstory.delegate.StoryReportDelegate$addLifecycleObserve$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: StoryReportDelegate.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f72855a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f72855a = iArr;
                }
            }

            @Override // androidx.lifecycle.v
            public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                com.max.hbstory.g gVarD;
                LiveData<Integer> liveDataN;
                Integer numF;
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.k.Ff, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                Log.d("onStateChanged", String.valueOf(event));
                if (a.f72855a[event.ordinal()] != 1 || (gVarD = this.f72854b.f72851a.d()) == null || (liveDataN = gVarD.n()) == null || (numF = liveDataN.f()) == null) {
                    return;
                }
                StoryReportDelegate storyReportDelegate = this.f72854b;
                Log.d("onStateChanged", "reportCurrent");
                storyReportDelegate.f72853c = null;
                StoryReportDelegate.h(storyReportDelegate, numF.intValue());
            }
        });
    }

    private final boolean m(int i10) {
        LiveData<List<StoryItemsObj>> liveDataF;
        List<StoryItemsObj> listF;
        l lVarF;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33915vf, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbstory.g gVarD = this.f72851a.d();
        return (gVarD == null || (liveDataF = gVarD.F()) == null || (listF = liveDataF.f()) == null || (lVarF = CollectionsKt__CollectionsKt.F(listF)) == null || !lVarF.s(i10)) ? false : true;
    }

    private final void n() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33871tf, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72851a.b()) == null || (gVarD = this.f72851a.d()) == null) {
            return;
        }
        LiveData<com.max.hbstory.g.a> liveDataM = gVarD.m();
        final yh.l<com.max.hbstory.g.a, b2> lVar = new yh.l<com.max.hbstory.g.a, b2>() { // from class: com.max.hbstory.delegate.StoryReportDelegate$observeContinuousClickEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(com.max.hbstory.g.a aVar) {
                if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.Gf, new Class[]{com.max.hbstory.g.a.class}, Void.TYPE).isSupported) {
                    return;
                }
                StoryReportDelegate.g(this.f72856b);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbstory.g.a aVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.Hf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(aVar);
                return b2.f124493a;
            }
        };
        liveDataM.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.f
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryReportDelegate.o(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.Af, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void p() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33849sf, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72851a.b()) == null || (gVarD = this.f72851a.d()) == null) {
            return;
        }
        LiveData<com.max.hbstory.g.a> liveDataR = gVarD.r();
        final yh.l<com.max.hbstory.g.a, b2> lVar = new yh.l<com.max.hbstory.g.a, b2>() { // from class: com.max.hbstory.delegate.StoryReportDelegate$observeDoubleClickEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(com.max.hbstory.g.a aVar) {
                if (!PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.If, new Class[]{com.max.hbstory.g.a.class}, Void.TYPE).isSupported && aVar.f() == 2) {
                    StoryReportDelegate.g(this.f72857b);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(com.max.hbstory.g.a aVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.k.Jf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(aVar);
                return b2.f124493a;
            }
        };
        liveDataR.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.b
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryReportDelegate.q(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f34003zf, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void r() {
        Fragment fragmentB;
        com.max.hbstory.g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33759of, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72851a.b()) == null || (gVarD = this.f72851a.d()) == null) {
            return;
        }
        LiveData<Integer> liveDataN = gVarD.n();
        final yh.l<Integer, b2> lVar = new yh.l<Integer, b2>() { // from class: com.max.hbstory.delegate.StoryReportDelegate$observePageChanges$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Integer num) {
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.Kf, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                StoryReportDelegate storyReportDelegate = this.f72858b;
                f0.m(num);
                StoryReportDelegate.h(storyReportDelegate, num.intValue());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.Lf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num);
                return b2.f124493a;
            }
        };
        liveDataN.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.c
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryReportDelegate.s(lVar, obj);
            }
        });
        LiveData<JsonObject> liveDataT = gVarD.t();
        final yh.l<JsonObject, b2> lVar2 = new yh.l<JsonObject, b2>() { // from class: com.max.hbstory.delegate.StoryReportDelegate$observePageChanges$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(JsonObject jsonObject) {
                if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.Mf, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.d("onStateChanged", "lastVideoReportData  " + jsonObject);
                StoryReportDelegate storyReportDelegate = this.f72859b;
                f0.m(jsonObject);
                StoryReportDelegate.i(storyReportDelegate, jsonObject);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(JsonObject jsonObject) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.Nf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(jsonObject);
                return b2.f124493a;
            }
        };
        liveDataT.l(new j0() { // from class: com.max.hbstory.delegate.d
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryReportDelegate.t(lVar2, obj);
            }
        });
        LiveData<JsonObject> liveDataU = gVarD.u();
        final yh.l<JsonObject, b2> lVar3 = new yh.l<JsonObject, b2>() { // from class: com.max.hbstory.delegate.StoryReportDelegate$observePageChanges$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(JsonObject jsonObject) {
                if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.Of, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                    return;
                }
                StoryReportDelegate storyReportDelegate = this.f72860b;
                f0.m(jsonObject);
                StoryReportDelegate.j(storyReportDelegate, jsonObject);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(JsonObject jsonObject) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.Pf, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(jsonObject);
                return b2.f124493a;
            }
        };
        liveDataU.l(new j0() { // from class: com.max.hbstory.delegate.e
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryReportDelegate.u(lVar3, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33937wf, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33959xf, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(yh.l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33981yf, new Class[]{yh.l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void v() {
        Integer numF;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33893uf, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        com.max.hbstory.g gVarD = this.f72851a.d();
        if (gVarD != null && (numF = gVarD.n().f()) != null) {
            com.max.hbstory.d dVar = this.f72851a;
            f0.m(numF);
            StoryItemsObj storyItemsObjM = StoryUtilsKt.m(dVar, numF.intValue());
            if (storyItemsObjM != null) {
                StoryCardIdInfoObj card_id_info = storyItemsObjM.getCard_id_info();
                jsonObject.addProperty("id", card_id_info != null ? card_id_info.getItem_id() : null);
                jsonObject.addProperty(UCropPlusActivity.ARG_INDEX, numF);
                jsonObject.addProperty("h_src", storyItemsObjM.getH_src());
                jsonObject.addProperty("from", "double_click");
            }
        }
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("4", lb.d.f131289y0, null, jsonObject);
    }

    private final void w(int i10) {
        StoryItemsObj storyItemsObjM;
        StoryCardIdInfoObj card_id_info;
        String item_id;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33782pf, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || !m(i10) || (storyItemsObjM = StoryUtilsKt.m(this.f72851a, i10)) == null) {
            return;
        }
        if ((i10 <= 0 && !storyItemsObjM.getNeed_story_mode_report()) || (card_id_info = storyItemsObjM.getCard_id_info()) == null || (item_id = card_id_info.getItem_id()) == null || f0.g(this.f72853c, item_id)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        StoryCardIdInfoObj card_id_info2 = storyItemsObjM.getCard_id_info();
        jsonObject.addProperty("id", card_id_info2 != null ? card_id_info2.getItem_id() : null);
        jsonObject.addProperty(UCropPlusActivity.ARG_INDEX, Integer.valueOf(i10));
        jsonObject.addProperty("h_src", storyItemsObjM.getH_src());
        b2 b2Var = b2.f124493a;
        com.max.hbcommon.analytics.d.d("3", lb.d.Z, null, jsonObject);
        this.f72853c = item_id;
    }

    private final void x(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.f33805qf, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f72852b;
        this.f72852b = jCurrentTimeMillis;
        com.max.hbcommon.analytics.d.e("2", lb.d.S, String.valueOf(w.a(j10)), String.valueOf(j10), jsonObject, null, true);
    }

    private final void y(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, bb.c.k.f33827rf, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.f131296z0, null, jsonObject);
    }
}
