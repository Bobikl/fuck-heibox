package com.max.xiaoheihe.module.game.pick;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import com.max.hbcommon.base.d;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e7;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: AddGameRecommendFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c extends d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e7 f87993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f87991c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87992d = 8;

    /* JADX INFO: compiled from: AddGameRecommendFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final c a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38130, new Class[0], c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c();
        }
    }

    /* JADX INFO: compiled from: AddGameRecommendFragment.kt */
    public static final class b implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj data, int i10) {
            if (PatchProxy.proxy(new Object[]{data, new Integer(i10)}, this, changeQuickRedirect, false, 38131, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(data, "data");
            if (i10 == 0) {
                c.L3(c.this, 0, true);
                c.L3(c.this, 1, false);
            } else {
                c.L3(c.this, 1, true);
                c.L3(c.this, 0, false);
            }
        }
    }

    public static final /* synthetic */ void L3(c cVar, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cVar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38129, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        cVar.R3(i10, z10);
    }

    private final Fragment M3(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38127, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentS0 = getChildFragmentManager().s0(i10 + "");
        if (fragmentS0 != null) {
            return fragmentS0;
        }
        if (i10 != 0) {
            return i10 != 1 ? fragmentS0 : com.max.xiaoheihe.module.game.pick.b.f87975h.b(null);
        }
        return com.max.xiaoheihe.module.game.pick.a.f87968e.a();
    }

    private final void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38124, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setTitle("拥有游戏");
        keyDescObj.setKey("own");
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setTitle("热门游戏");
        keyDescObj2.setKey("hot");
        arrayList.add(keyDescObj);
        arrayList.add(keyDescObj2);
        N3().f110056c.setData(arrayList);
        N3().f110056c.setMOnTabCheckedListener(new b());
        N3().f110056c.d();
    }

    @dl.d
    @m
    public static final c P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38128, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : f87991c.a();
    }

    private final void R3(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38125, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Fragment fragmentM3 = M3(i10);
        f0.m(fragmentM3);
        fragmentM3.setUserVisibleHint(true);
        p0 p0VarU = getChildFragmentManager().u();
        f0.o(p0VarU, "childFragmentManager\n   …      .beginTransaction()");
        if (z10) {
            if (!fragmentM3.isAdded()) {
                p0VarU.c(R.id.fl_container, fragmentM3, i10 + "");
            }
            p0VarU.P(fragmentM3);
        } else if (!fragmentM3.isAdded()) {
            return;
        } else {
            p0VarU.u(fragmentM3);
        }
        p0VarU.n();
        getChildFragmentManager().n0();
    }

    static /* synthetic */ void S3(c cVar, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {cVar, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 38126, new Class[]{c.class, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        cVar.R3(i10, z10);
    }

    @dl.d
    public final e7 N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38121, new Class[0], e7.class);
        if (patchProxyResultProxy.isSupported) {
            return (e7) patchProxyResultProxy.result;
        }
        e7 e7Var = this.f87993b;
        if (e7Var != null) {
            return e7Var;
        }
        f0.S("binding");
        return null;
    }

    public final void Q3(@dl.d e7 e7Var) {
        if (PatchProxy.proxy(new Object[]{e7Var}, this, changeQuickRedirect, false, 38122, new Class[]{e7.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e7Var, "<set-?>");
        this.f87993b = e7Var;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38123, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        e7 e7VarC = e7.c(getLayoutInflater());
        f0.o(e7VarC, "inflate(layoutInflater)");
        Q3(e7VarC);
        setContentView(N3());
        O3();
        R3(0, true);
    }
}
