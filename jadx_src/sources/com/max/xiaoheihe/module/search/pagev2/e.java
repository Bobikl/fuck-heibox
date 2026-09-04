package com.max.xiaoheihe.module.search.pagev2;

import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTypeStateManager.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: SearchTypeStateManager.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91738a;

        static {
            int[] iArr = new int[SearchType.valuesCustom().length];
            try {
                iArr[SearchType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91738a = iArr;
        }
    }

    @dl.d
    public static final Map<String, String> a(@dl.d SearchType type, @dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, str, str2}, null, changeQuickRedirect, true, 43285, new Class[]{SearchType.class, String.class, String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = a.f91738a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("sort_filter", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("time_range", str2);
        } else if (i10 == 3) {
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put(ChannelsDetailActivity.V3, str2);
        }
        return linkedHashMap;
    }
}
