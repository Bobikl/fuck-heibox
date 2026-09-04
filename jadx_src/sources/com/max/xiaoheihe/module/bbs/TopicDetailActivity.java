package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class TopicDetailActivity extends BaseActivity {
    private static final String L = "h_src";
    private static final String M = "topic";
    private static final String N = "prefer";
    public static final String O = "prefer_video";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Intent M1(Context context, String str, BBSTopicObj bBSTopicObj, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, bBSTopicObj, str2}, null, changeQuickRedirect, true, 26868, new Class[]{Context.class, String.class, BBSTopicObj.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("h_src", str);
        intent.putExtra("topic", bBSTopicObj);
        intent.putExtra(N, str2);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public TitleBar c1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26870, new Class[0], TitleBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (TitleBar) patchProxyResultProxy.result;
        }
        TitleBar titleBar = this.f66616q;
        TopicDetailFragment topicDetailFragment = (TopicDetailFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        return (topicDetailFragment == null || topicDetailFragment.D4() == null) ? titleBar : topicDetailFragment.D4();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26869, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        getWindow().setFormat(-3);
        String stringExtra = getIntent().getStringExtra("h_src");
        BBSTopicObj bBSTopicObj = (BBSTopicObj) getIntent().getSerializableExtra("topic");
        String stringExtra2 = getIntent().getStringExtra(N);
        if (((TopicDetailFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            TopicDetailFragment topicDetailFragmentH4 = TopicDetailFragment.H4(stringExtra, bBSTopicObj, stringExtra2);
            topicDetailFragmentH4.setUserVisibleHint(true);
            topicDetailFragmentH4.setMenuVisibility(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, topicDetailFragmentH4).m();
        }
    }
}
