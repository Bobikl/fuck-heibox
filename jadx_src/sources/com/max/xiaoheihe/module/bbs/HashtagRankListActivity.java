package com.max.xiaoheihe.module.bbs;

import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagRankListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26543, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle(R.string.trending_hashtag);
        getSupportFragmentManager().u().b(R.id.multi_status_view_container, new HashtagRankingListFragment()).m();
    }
}
