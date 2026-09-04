package com.max.xiaoheihe.utils;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.tab.TabKeyObj;
import com.max.xiaoheihe.bean.account.tab.TabListObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TabManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c0 f95336a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static TabListObj f95337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static TabListObj f95338c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static TabListObj f95339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f95340e;

    static {
        m();
        f95340e = 8;
    }

    private c0() {
    }

    @dl.e
    public static final TabListObj a() {
        return f95337b;
    }

    @xh.m
    public static /* synthetic */ void b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (r10.equals("/game/recommend") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        if (r10.equals("/game/recommend_v2") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010e, code lost:
    
        return com.max.xiaoheihe.module.game.GameRecommendV2Fragment.f84630p.a();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    @xh.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment c(@dl.e java.lang.String r10, @dl.e java.lang.String[] r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.utils.c0.c(java.lang.String, java.lang.String[]):androidx.fragment.app.Fragment");
    }

    @dl.e
    @xh.m
    public static final KeyDescObj d(@dl.e String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 48887, new Class[]{String[].class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (!kotlin.jvm.internal.f0.g("/game/rank", MainActivity.p3(strArr, 0))) {
            return null;
        }
        String strP3 = MainActivity.p3(strArr, 1);
        String strP4 = MainActivity.p3(strArr, 2);
        if (strP3 == null) {
            return null;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setFilter_head(strP3);
        keyDescObj.setList_type(strP4);
        keyDescObj.setSort(MainActivity.p3(strArr, 2));
        return keyDescObj;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0202  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x0219  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    @xh.m
    public static final String[] e(@dl.e String str) {
        String strH;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        String strH6;
        String strH7;
        String strH8;
        String strH9;
        String strH10;
        String strH11;
        String strH12;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48888, new Class[]{String.class}, String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1924678771:
                if (!str.equals("/game/recommend_v2")) {
                    return null;
                }
                strH5 = h(i("/game/recommend_v2")[0].intValue());
                if (strH5 != null) {
                    return new String[]{strH5, "/game/recommend_v2"};
                }
                strH6 = h(i("/game/recommend")[0].intValue());
                if (strH6 != null) {
                    return new String[]{strH6, "/game/recommend"};
                }
                return null;
            case -1888392978:
                if (str.equals("/game/comment_recommend") && (strH = h(i("/game/comment_recommend")[0].intValue())) != null) {
                    return new String[]{strH, "/game/comment_recommend"};
                }
                return null;
            case -1863637442:
                if (!str.equals(lb.d.M)) {
                    return null;
                }
                strH4 = h(i("/bbs/recommend")[0].intValue());
                if (strH4 != null) {
                    return new String[]{strH4, "/bbs/recommend"};
                }
                return null;
            case -1523267502:
                if (str.equals("/bbs/list_v2") && (strH2 = h(i("/bbs/list_v2")[0].intValue())) != null) {
                    return new String[]{strH2, "/bbs/list_v2"};
                }
                return null;
            case -1357909487:
                if (!str.equals("/bbs/recommend")) {
                    return null;
                }
                strH4 = h(i("/bbs/recommend")[0].intValue());
                if (strH4 != null) {
                    return new String[]{strH4, "/bbs/recommend"};
                }
                return null;
            case -981335685:
                if (!str.equals("/home/recommend")) {
                    return null;
                }
                strH3 = h(i("/home/recommend")[0].intValue());
                if (strH3 != null) {
                    return new String[]{strH3, "/home/recommend"};
                }
                return null;
            case -663102258:
                if (!str.equals("/game/recommend")) {
                    return null;
                }
                strH5 = h(i("/game/recommend_v2")[0].intValue());
                if (strH5 != null) {
                    return new String[]{strH5, "/game/recommend_v2"};
                }
                strH6 = h(i("/game/recommend")[0].intValue());
                if (strH6 != null) {
                    return new String[]{strH6, "/game/recommend"};
                }
                return null;
            case -448547662:
                if (!str.equals(lb.d.f131246s)) {
                    return null;
                }
                strH3 = h(i("/home/recommend")[0].intValue());
                if (strH3 != null) {
                    return new String[]{strH3, "/home/recommend"};
                }
                return null;
            case 48647:
                if (!str.equals(lb.d.f131262u1)) {
                    return null;
                }
                return MainActivity.f76179y4;
            case 1497508:
                if (!str.equals(lb.d.J)) {
                    return null;
                }
                strH4 = h(i("/bbs/recommend")[0].intValue());
                if (strH4 != null) {
                    return new String[]{strH4, "/bbs/recommend"};
                }
                return null;
            case 46570657:
                if (!str.equals(lb.d.f131235q2)) {
                    return null;
                }
                strH5 = h(i("/game/recommend_v2")[0].intValue());
                if (strH5 != null) {
                    return new String[]{strH5, "/game/recommend_v2"};
                }
                strH6 = h(i("/game/recommend")[0].intValue());
                if (strH6 != null) {
                    return new String[]{strH6, "/game/recommend"};
                }
                return null;
            case 46749379:
                if (str.equals(lb.d.V1)) {
                    return new String[]{"game"};
                }
                return null;
            case 65834537:
                if (str.equals("/bbs/list") && (strH7 = h(i("/bbs/list")[0].intValue())) != null) {
                    return new String[]{strH7, "/bbs/list"};
                }
                return null;
            case 310557914:
                if (str.equals("/game/rank") && (strH8 = h(i("/game/rank")[0].intValue())) != null) {
                    return new String[]{strH8, "/game/rank"};
                }
                return null;
            case 1022831778:
                if (str.equals("/bbs/web_writebox") && (strH9 = h(i("/bbs/web_writebox")[0].intValue())) != null) {
                    return new String[]{strH9, "/bbs/web_writebox"};
                }
                return null;
            case 1199386290:
                if (!str.equals(lb.d.f131269v1)) {
                    return null;
                }
                return MainActivity.f76179y4;
            case 1427611661:
                if (str.equals("/home/rank") && (strH10 = h(i("/home/rank")[0].intValue())) != null) {
                    return new String[]{strH10, "/home/rank"};
                }
                return null;
            case 1709990305:
                if (str.equals("/home/moment") && (strH11 = h(i("/home/moment")[0].intValue())) != null) {
                    return new String[]{strH11, "/home/moment"};
                }
                return null;
            case 1734220391:
                if (str.equals("/bbs/waterfall") && (strH12 = h(i("/bbs/waterfall")[0].intValue())) != null) {
                    return new String[]{strH12, "/bbs/waterfall"};
                }
                return null;
            case 1829379848:
                if (str.equals(lb.d.K1)) {
                    return MainActivity.f76180z4;
                }
                return null;
            default:
                return null;
        }
    }

    @dl.e
    public static final TabListObj f() {
        return f95338c;
    }

    @xh.m
    public static /* synthetic */ void g() {
    }

    @dl.e
    @xh.m
    public static final String h(int i10) {
        if (i10 == 0) {
            return MainActivity.S3;
        }
        if (i10 == 1) {
            return "topic";
        }
        if (i10 == 2) {
            return "game";
        }
        if (i10 != 3) {
            return null;
        }
        return "me";
    }

    @dl.d
    @xh.m
    public static final Integer[] i(@dl.e String str) {
        int legalEntryIndex;
        int legalEntryIndex2;
        int i10;
        TabListObj tabListObj;
        TabListObj tabListObj2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48885, new Class[]{String.class}, Integer[].class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer[]) patchProxyResultProxy.result;
        }
        int i11 = -1;
        if (str != null) {
            TabListObj tabListObj3 = f95337b;
            if (tabListObj3 != null) {
                kotlin.jvm.internal.f0.m(tabListObj3);
                legalEntryIndex2 = tabListObj3.getLegalEntryIndex(str);
                i10 = legalEntryIndex2 >= 0 ? 0 : -1;
            } else {
                legalEntryIndex2 = -1;
                i10 = -1;
            }
            if (i10 == -1 && (tabListObj2 = f95338c) != null) {
                kotlin.jvm.internal.f0.m(tabListObj2);
                legalEntryIndex2 = tabListObj2.getLegalEntryIndex(str);
                if (legalEntryIndex2 >= 0) {
                    i10 = 1;
                }
            }
            if (i10 != -1 || (tabListObj = f95339d) == null) {
                legalEntryIndex = legalEntryIndex2;
            } else {
                kotlin.jvm.internal.f0.m(tabListObj);
                legalEntryIndex = tabListObj.getLegalEntryIndex(str);
                if (legalEntryIndex >= 0) {
                    i11 = 2;
                }
            }
            i11 = i10;
        } else {
            legalEntryIndex = -1;
        }
        return new Integer[]{Integer.valueOf(i11), Integer.valueOf(legalEntryIndex)};
    }

    @dl.e
    public static final TabListObj j() {
        return f95339d;
    }

    @xh.m
    public static /* synthetic */ void k() {
    }

    @dl.d
    @xh.m
    public static final WebviewFragment l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48886, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(lb.a.f131054u4).u(true).x("1").x("1").a();
        webviewFragmentA.Q7(true);
        return webviewFragmentA;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    @xh.m
    public static final void m() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f95337b = (TabListObj) com.max.hbutils.utils.k.a(com.max.hbcache.c.o(com.max.hbcache.c.f66119e0, null), TabListObj.class);
        f95338c = (TabListObj) com.max.hbutils.utils.k.a(com.max.hbcache.c.o(com.max.hbcache.c.f66121f0, null), TabListObj.class);
        f95339d = (TabListObj) com.max.hbutils.utils.k.a(com.max.hbcache.c.o(com.max.hbcache.c.f66123g0, null), TabListObj.class);
        TabListObj tabListObj = f95337b;
        if (tabListObj != null) {
            List[] listArr = new List[1];
            listArr[0] = tabListObj != null ? tabListObj.getEntry() : null;
            if (com.max.hbcommon.utils.c.w(listArr)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new TabKeyObj(d.n0(R.string.bbs_timeline), "/home/moment"));
                arrayList.add(new TabKeyObj(d.n0(R.string.recommend), "/bbs/recommend"));
                f95337b = new TabListObj(d.n0(R.string.home_page), "/bbs/recommend", arrayList);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new TabKeyObj(d.n0(R.string.bbs_timeline), "/home/moment"));
            arrayList2.add(new TabKeyObj(d.n0(R.string.recommend), "/bbs/recommend"));
            f95337b = new TabListObj(d.n0(R.string.home_page), "/bbs/recommend", arrayList2);
        }
        TabListObj tabListObj2 = f95338c;
        if (tabListObj2 != null) {
            List[] listArr2 = new List[1];
            listArr2[0] = tabListObj2 != null ? tabListObj2.getEntry() : null;
            if (com.max.hbcommon.utils.c.w(listArr2)) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new TabKeyObj(d.n0(R.string.hot_point), "/home/recommend"));
                f95338c = new TabListObj(d.n0(R.string.hot_point), "/home/recommend", arrayList3);
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new TabKeyObj(d.n0(R.string.hot_point), "/home/recommend"));
            f95338c = new TabListObj(d.n0(R.string.hot_point), "/home/recommend", arrayList4);
        }
        TabListObj tabListObj3 = f95339d;
        if (tabListObj3 != null) {
            List[] listArr3 = new List[1];
            listArr3[0] = tabListObj3 != null ? tabListObj3.getEntry() : null;
            if (!com.max.hbcommon.utils.c.w(listArr3)) {
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new TabKeyObj(d.n0(R.string.recommend), "/game/recommend_v2"));
        arrayList5.add(new TabKeyObj(d.n0(R.string.bbs_rank), "/game/rank"));
        f95339d = new TabListObj(d.n0(R.string.game_store), "/game/recommend_v2", arrayList5);
    }

    @xh.m
    public static final boolean o(@dl.e String str, @dl.e TabListObj tabListObj) {
        ArrayList<TabKeyObj> entry;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, tabListObj}, null, changeQuickRedirect, true, 48890, new Class[]{String.class, TabListObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (tabListObj != null && (entry = tabListObj.getEntry()) != null) {
            Iterator<TabKeyObj> it = entry.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.f0.g(it.next().getKey(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void p(@dl.e TabListObj tabListObj) {
        f95337b = tabListObj;
    }

    public static final void q(@dl.e TabListObj tabListObj) {
        f95338c = tabListObj;
    }

    public static final void r(@dl.e TabListObj tabListObj) {
        f95339d = tabListObj;
    }

    public final boolean n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48889, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66119e0, null);
        String strO2 = com.max.hbcache.c.o(com.max.hbcache.c.f66121f0, null);
        return strO != null && kotlin.jvm.internal.f0.g(strO, com.max.hbutils.utils.k.p(f95337b)) && strO2 != null && kotlin.jvm.internal.f0.g(strO2, com.max.hbutils.utils.k.p(f95338c));
    }
}
