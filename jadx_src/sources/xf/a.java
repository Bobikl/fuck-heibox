package xf;

import com.max.hbsearch.config.SearchTabType;
import com.max.hbsearch.h;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.search.pagev2.SearchType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import yf.c;

/* JADX INFO: compiled from: SearchTabModelFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: xf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchTabModelFactory.kt */
    public final /* synthetic */ class C1279a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141313a;

        static {
            int[] iArr = new int[SearchTabType.valuesCustom().length];
            try {
                iArr[SearchTabType.CHANNEL_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchTabType.MALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f141313a = iArr;
        }
    }

    @d
    public static final h a(@d SearchTabType type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, 43286, new Class[]{SearchTabType.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        return C1279a.f141313a[type.ordinal()] == 1 ? new yf.a() : new c();
    }

    public static final int b(@d SearchTabType type, @d String targetTabName) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, targetTabName}, null, changeQuickRedirect, true, 43287, new Class[]{SearchTabType.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(type, "type");
        f0.p(targetTabName, "targetTabName");
        if (!u.V1(targetTabName)) {
            Integer numValueOf = Integer.valueOf(a(type).a().indexOf(targetTabName));
            if (!(numValueOf.intValue() >= 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        String strN0 = C1279a.f141313a[type.ordinal()] == 2 ? com.max.xiaoheihe.utils.d.n0(R.string.goods) : null;
        if (strN0 != null) {
            return Math.max(0, a(type).a().indexOf(strN0));
        }
        return 0;
    }

    public static /* synthetic */ int c(SearchTabType searchTabType, String str, int i10, Object obj) {
        Object[] objArr = {searchTabType, str, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 43288, new Class[]{SearchTabType.class, String.class, cls, Object.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if ((i10 & 2) != 0) {
            str = "";
        }
        return b(searchTabType, str);
    }

    public static final int d(@d SearchTabType type, @d String typeKey) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, typeKey}, null, changeQuickRedirect, true, 43289, new Class[]{SearchTabType.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(type, "type");
        f0.p(typeKey, "typeKey");
        return Math.max(0, CollectionsKt___CollectionsKt.Y2(a(type).a(), e(typeKey)));
    }

    @e
    public static final String e(@d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 43290, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(str, "<this>");
        if (f0.g(str, SearchType.GENERAL.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.general);
        }
        if (f0.g(str, SearchType.LINK.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.content);
        }
        if (f0.g(str, SearchType.WIKI.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.wiki);
        }
        if (f0.g(str, SearchType.USER.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.user);
        }
        if (f0.g(str, SearchType.HASHTAG.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.hashtag);
        }
        if (f0.g(str, SearchType.MALL.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.goods);
        }
        if (f0.g(str, SearchType.GAME.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.game);
        }
        if (f0.g(str, SearchType.MINI_PROGRAM.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.mini_program);
        }
        if (f0.g(str, SearchType.STEAM_USER.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.steam_id);
        }
        if (f0.g(str, SearchType.DOTA2_MATCH.getValue())) {
            return com.max.xiaoheihe.utils.d.n0(R.string.dota2_match);
        }
        return null;
    }
}
