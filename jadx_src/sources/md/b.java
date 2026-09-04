package md;

import bb.c;
import com.max.hbsearch.bean.HotSearchObj;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbsearch.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Word.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: Word.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131850a;

        static {
            int[] iArr = new int[HotWordTypeV2.valuesCustom().length];
            try {
                iArr[HotWordTypeV2.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotWordTypeV2.MALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HotWordTypeV2.CHANNEL_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HotWordTypeV2.GENERAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131850a = iArr;
        }
    }

    @e
    public static final List<SearchHotwordObj> a(@d HotWordTypeV2 type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, c.k.f33523e9, new Class[]{HotWordTypeV2.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        int i10 = a.f131850a[type.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return o.f72357a.e();
        }
        if (i10 == 3) {
            SearchHotwordsObj searchHotwordsObj = o.f72358b;
            if (searchHotwordsObj != null) {
                return searchHotwordsObj.getList();
            }
            return null;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        SearchHotwordsObj searchHotwordsObj2 = o.f72358b;
        if (searchHotwordsObj2 != null) {
            return searchHotwordsObj2.getList();
        }
        return null;
    }

    @e
    public static final HotSearchObj b(@d HotWordTypeV2 type) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type}, null, changeQuickRedirect, true, c.k.f33546f9, new Class[]{HotWordTypeV2.class}, HotSearchObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotSearchObj) patchProxyResultProxy.result;
        }
        f0.p(type, "type");
        int i10 = a.f131850a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        if (i10 != 3 && i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        SearchHotwordsObj searchHotwordsObj = o.f72358b;
        if (searchHotwordsObj != null) {
            return searchHotwordsObj.getHot_search();
        }
        return null;
    }
}
