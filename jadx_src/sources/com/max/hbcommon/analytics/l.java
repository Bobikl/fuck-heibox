package com.max.hbcommon.analytics;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PageEventSrcUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f66572a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static PathSrcNode f66573b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static PathSrcNode f66574c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static String f66575d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private static d.f f66576e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66577f = 5;

    private l() {
    }

    private final Pair<Boolean, d.f> a(Fragment fragment) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, this, changeQuickRedirect, false, bb.c.b.yt, new Class[]{Fragment.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        d.f fVar = null;
        if (fragment.getUserVisibleHint() && fragment.isVisible()) {
            fVar = fragment instanceof d.f ? (d.f) fragment : null;
            List<Fragment> listJ0 = fragment.getChildFragmentManager().J0();
            f0.o(listJ0, "getFragments(...)");
            if (!com.max.hbcommon.utils.c.w(listJ0)) {
                for (Fragment fragment2 : listJ0) {
                    f0.m(fragment2);
                    Pair<Boolean, d.f> pairA = a(fragment2);
                    d.f fVarF = pairA.f();
                    if (pairA.e().booleanValue()) {
                        fVar = fVarF;
                        break;
                    }
                    fVar = fVarF;
                }
            }
        } else {
            z10 = false;
        }
        return new Pair<>(Boolean.valueOf(z10), fVar);
    }

    private final boolean d(ArrayList<PathSrcNode> arrayList, Fragment fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, fragment}, this, changeQuickRedirect, false, bb.c.b.xt, new Class[]{ArrayList.class, Fragment.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!fragment.getUserVisibleHint() || !fragment.isVisible()) {
            return false;
        }
        if (fragment instanceof d.f) {
            d.f fVar = (d.f) fragment;
            PathSrcNode pathSrcNodeF = f(fVar);
            if (pathSrcNodeF != null) {
                arrayList.add(pathSrcNodeF);
            }
            PathSrcNode clickSrc = fVar.getClickSrc();
            if (clickSrc != null) {
                arrayList.add(clickSrc);
            }
        }
        List<Fragment> listJ0 = fragment.getChildFragmentManager().J0();
        f0.o(listJ0, "getFragments(...)");
        if (!listJ0.isEmpty()) {
            for (Fragment fragment2 : listJ0) {
                f0.m(fragment2);
                if (d(arrayList, fragment2)) {
                    break;
                }
            }
        }
        return true;
    }

    private final PathSrcNode f(d.f fVar) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.b.pt, new Class[]{d.f.class}, PathSrcNode.class);
        if (patchProxyResultProxy.isSupported) {
            return (PathSrcNode) patchProxyResultProxy.result;
        }
        String pagePath = fVar.getPagePath();
        String strV3 = fVar.v3();
        if (!(strV3 == null || strV3.length() == 0)) {
            PathSrcNode pathSrcNode = new PathSrcNode();
            pathSrcNode.setPath(fVar.v3());
            String strH = fVar.H();
            if (strH != null && strH.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return pathSrcNode;
            }
            pathSrcNode.setAddition((JsonObject) com.max.hbutils.utils.k.a(strH, JsonObject.class));
            return pathSrcNode;
        }
        if (pagePath == null || pagePath.length() == 0) {
            return null;
        }
        PathSrcNode pathSrcNode2 = new PathSrcNode();
        pathSrcNode2.setPath(pagePath);
        String pageAdditional = fVar.getPageAdditional();
        if (pageAdditional != null && pageAdditional.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            pathSrcNode2.setAddition((JsonObject) com.max.hbutils.utils.k.a(pageAdditional, JsonObject.class));
        }
        return pathSrcNode2;
    }

    private final boolean i(d.f fVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.b.st, new Class[]{d.f.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (fVar.d2()) {
            return true;
        }
        if (fVar.o3()) {
            return false;
        }
        if (fVar instanceof FragmentActivity) {
            List<Fragment> listJ0 = ((FragmentActivity) fVar).getSupportFragmentManager().J0();
            f0.o(listJ0, "getFragments(...)");
            if (!com.max.hbcommon.utils.c.w(listJ0) && h(listJ0)) {
                return false;
            }
        } else {
            if (!(fVar instanceof Fragment)) {
                return false;
            }
            List<Fragment> listJ1 = ((Fragment) fVar).getChildFragmentManager().J0();
            f0.o(listJ1, "getFragments(...)");
            if ((fVar instanceof com.max.hbcommon.base.d) && ((com.max.hbcommon.base.d) fVar).isNotPage()) {
                return false;
            }
            if (!com.max.hbcommon.utils.c.w(listJ1) && h(listJ1)) {
                return false;
            }
        }
        return true;
    }

    @dl.e
    public final d.f b() {
        return f66576e;
    }

    @dl.e
    public final d.f c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.vt, new Class[0], d.f.class);
        if (patchProxyResultProxy.isSupported) {
            return (d.f) patchProxyResultProxy.result;
        }
        ComponentCallbacks2 componentCallbacks2N = ob.a.b().n();
        if (!(componentCallbacks2N instanceof FragmentActivity) || !(componentCallbacks2N instanceof d.f)) {
            return null;
        }
        d.f fVar = (d.f) componentCallbacks2N;
        List<Fragment> listJ0 = ((FragmentActivity) componentCallbacks2N).getSupportFragmentManager().J0();
        f0.o(listJ0, "getFragments(...)");
        if (com.max.hbcommon.utils.c.w(listJ0)) {
            return fVar;
        }
        for (Fragment fragment : listJ0) {
            f0.m(fragment);
            Pair<Boolean, d.f> pairA = a(fragment);
            d.f fVarF = pairA.f();
            if (pairA.e().booleanValue()) {
                return fVarF;
            }
            fVar = fVarF;
        }
        return fVar;
    }

    @dl.e
    public final String e() {
        return f66575d;
    }

    @dl.e
    public final ArrayList<ArrayList<PathSrcNode>> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.wt, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<ArrayList<PathSrcNode>> arrayList = new ArrayList<>();
        ArrayList<PathSrcNode> arrayList2 = new ArrayList<>();
        PathSrcNode pathSrcNode = f66573b;
        if (pathSrcNode != null) {
            arrayList2.add(pathSrcNode);
            PathSrcNode pathSrcNode2 = f66574c;
            if (pathSrcNode2 != null) {
                arrayList2.add(pathSrcNode2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (com.max.hbcommon.utils.c.u(bb.a.f30447b)) {
            return null;
        }
        PathSrcNode pathSrcNode3 = new PathSrcNode();
        pathSrcNode3.setPath(bb.a.f30447b);
        arrayList2.add(pathSrcNode3);
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean h(@dl.d List<? extends Fragment> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.ut, new Class[]{List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(list, "list");
        for (Fragment fragment : list) {
            if ((fragment instanceof com.max.hbcommon.base.d) && !((com.max.hbcommon.base.d) fragment).isNotPage()) {
                return true;
            }
        }
        return false;
    }

    public final void j(@dl.d d.f page) {
        if (PatchProxy.proxy(new Object[]{page}, this, changeQuickRedirect, false, bb.c.b.tt, new Class[]{d.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(page, "page");
        if (i(page)) {
            PathSrcNode pathSrcNodeF = f(page);
            f66573b = pathSrcNodeF;
            if (pathSrcNodeF != null) {
                f66574c = page.getClickSrc() != null ? page.getClickSrc() : null;
            }
            com.max.hbcommon.utils.d.b("zzzzreport", "replaceSrcPage  src=" + com.max.hbutils.utils.k.p(f66573b));
            com.max.hbcommon.utils.d.b("zzzzreport", "replaceSrcPage  click=" + com.max.hbutils.utils.k.p(f66574c));
        }
    }

    public final void k(@dl.d String path, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{path, jsonObject}, this, changeQuickRedirect, false, bb.c.b.Bt, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setType("1");
        pageEventObj.setPath(path);
        pageEventObj.setAddition(jsonObject);
        ArrayList<ArrayList<PathSrcNode>> arrayListG = g();
        if (!com.max.hbcommon.utils.c.w(arrayListG)) {
            pageEventObj.setSrc(arrayListG);
        }
        d.c(pageEventObj, true);
    }

    public final void l(@dl.d String path, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{path, jsonObject}, this, changeQuickRedirect, false, bb.c.b.Ct, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setType("4");
        pageEventObj.setPath(path);
        pageEventObj.setAddition(jsonObject);
        ArrayList<ArrayList<PathSrcNode>> arrayListG = g();
        if (!com.max.hbcommon.utils.c.w(arrayListG)) {
            pageEventObj.setSrc(arrayListG);
        }
        d.c(pageEventObj, true);
    }

    public final void m(@dl.d String path, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{path, str}, this, changeQuickRedirect, false, bb.c.b.zt, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        l(path, str != null ? (JsonObject) com.max.hbutils.utils.k.a(str, JsonObject.class) : null);
    }

    public final void n(@dl.d String path, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{path, jsonObject}, this, changeQuickRedirect, false, bb.c.b.At, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setType("3");
        pageEventObj.setPath(path);
        pageEventObj.setAddition(jsonObject);
        ArrayList<ArrayList<PathSrcNode>> arrayListG = g();
        if (!com.max.hbcommon.utils.c.w(arrayListG)) {
            pageEventObj.setSrc(arrayListG);
        }
        d.c(pageEventObj, true);
    }

    public final void o(@dl.d String type, @dl.d String path, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{type, path, str}, this, changeQuickRedirect, false, bb.c.b.Dt, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        f0.p(path, "path");
        p(type, path, str, null);
    }

    public final void p(@dl.d String type, @dl.d String path, @dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{type, path, str, str2}, this, changeQuickRedirect, false, bb.c.b.Et, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        f0.p(path, "path");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", type);
        jsonObject.addProperty("page", path);
        jsonObject.addProperty("uid", str);
        if (str2 != null) {
            jsonObject.addProperty("link_id", str2);
        }
        b2 b2Var = b2.f124493a;
        l(lb.d.f131163g0, jsonObject);
    }

    public final void q(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.b.Ft, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = str2 != null ? (JsonObject) com.max.hbutils.utils.k.a(str2, JsonObject.class) : new JsonObject();
        jsonObject.addProperty("page", str);
        b2 b2Var = b2.f124493a;
        l(lb.d.f131151e2, jsonObject);
    }

    public final void r(@dl.d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.b.Gt, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        l(path, new JsonObject());
    }

    public final void s(@dl.d String path, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{path, jsonObject}, this, changeQuickRedirect, false, bb.c.b.Ht, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        l(path, jsonObject);
    }

    public final void t(@dl.d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.b.Jt, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        n(path, new JsonObject());
    }

    public final void u(@dl.d String path) {
        if (PatchProxy.proxy(new Object[]{path}, this, changeQuickRedirect, false, bb.c.b.It, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(path, "path");
        k(path, new JsonObject());
    }

    public final void v(@dl.d d.f page) {
        if (PatchProxy.proxy(new Object[]{page}, this, changeQuickRedirect, false, bb.c.b.rt, new Class[]{d.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(page, "page");
        if (i(page)) {
            f66576e = page;
        }
    }

    public final void w(@dl.d d.f page) {
        if (PatchProxy.proxy(new Object[]{page}, this, changeQuickRedirect, false, bb.c.b.qt, new Class[]{d.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(page, "page");
        if (i(page)) {
            f66575d = page.getPagePath();
        }
    }
}
