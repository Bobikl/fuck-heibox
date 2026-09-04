package com.max.xiaoheihe.module.search.pagev2;

import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchTypeStateManager.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum SearchType {
    GENERAL("general"),
    LINK("link"),
    WIKI("wiki"),
    USER("user"),
    HASHTAG("hashtag"),
    MALL("mall"),
    GAME("game"),
    MINI_PROGRAM(ob.b.f132259k),
    STEAM_USER(SearchHelper.f91576d),
    DOTA2_MATCH(SearchHelper.f91577e),
    UNKNOWN("");


    @dl.d
    public static final a Companion = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final String value;

    /* JADX INFO: compiled from: SearchTypeStateManager.kt */
    @t0({"SMAP\nSearchTypeStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchTypeStateManager.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n1282#2,2:79\n*S KotlinDebug\n*F\n+ 1 SearchTypeStateManager.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchType$Companion\n*L\n54#1:79,2\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        @dl.d
        public final SearchType a(@dl.d String value) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 43282, new Class[]{String.class}, SearchType.class);
            if (patchProxyResultProxy.isSupported) {
                return (SearchType) patchProxyResultProxy.result;
            }
            f0.p(value, "value");
            for (SearchType searchType : SearchType.valuesCustom()) {
                if (f0.g(searchType.getValue(), value)) {
                    if (searchType == null) {
                        return SearchType.UNKNOWN;
                    }
                    return searchType;
                }
            }
            searchType = null;
            if (searchType == null) {
                return SearchType.UNKNOWN;
            }
            return searchType;
        }
    }

    SearchType(String str) {
        this.value = str;
    }

    public static SearchType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 43281, new Class[]{String.class}, SearchType.class);
        return (SearchType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(SearchType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SearchType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 43280, new Class[0], SearchType[].class);
        return (SearchType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    @dl.d
    public final String getValue() {
        return this.value;
    }

    public final boolean isUnknown() {
        return this == UNKNOWN;
    }

    @Override // java.lang.Enum
    @dl.d
    public String toString() {
        return this.value;
    }
}
