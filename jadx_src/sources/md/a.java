package md;

import bb.c;
import com.max.hbsearch.bean.HotSearchObj;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.config.HotHashtagType;
import com.max.hbsearch.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HashTag.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: md.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HashTag.kt */
    public final /* synthetic */ class C1202a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131849a;

        static {
            int[] iArr = new int[HotHashtagType.valuesCustom().length];
            try {
                iArr[HotHashtagType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f131849a = iArr;
        }
    }

    @e
    public static final HotSearchObj a(@d HotHashtagType type) {
        SearchHotwordsObj searchHotwordsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, c.k.f33500d9, new Class[]{HotHashtagType.class}, HotSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchObj) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        if (C1202a.f131849a[type.ordinal()] != 1 || (searchHotwordsObj = o.f72358b) == null) {
            return null;
        }
        return searchHotwordsObj.getHot_discussion();
    }

    @e
    public static final List<SearchHotwordObj> b(@d HotHashtagType type) {
        SearchHotwordsObj searchHotwordsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, c.k.f33476c9, new Class[]{HotHashtagType.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        if (C1202a.f131849a[type.ordinal()] != 1 || (searchHotwordsObj = o.f72358b) == null) {
            return null;
        }
        return searchHotwordsObj.getHashtag_list();
    }
}
