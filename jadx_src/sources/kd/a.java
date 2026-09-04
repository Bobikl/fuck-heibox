package kd;

import com.max.hbsearch.SearchNewFragment;
import com.max.hbsearch.config.HotHashtagType;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbsearch.config.SearchTabType;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;

/* JADX INFO: compiled from: SearchContainerConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final SearchNewFragment.ContainerConfig f124466a = new SearchNewFragment.ContainerConfig(SearchTabType.GENERAL, HotWordTypeV2.CHANNEL_CONTENT, HotHashtagType.EMPTY, false, true, true);
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final SearchNewFragment.ContainerConfig a() {
        return f124466a;
    }
}
