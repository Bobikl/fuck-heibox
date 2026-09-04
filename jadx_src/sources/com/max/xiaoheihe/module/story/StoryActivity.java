package com.max.xiaoheihe.module.story;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.hbstory.StoryPlayerFragment;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldScreenShotKt;
import com.max.xiaoheihe.bean.SourceInfoObj;
import com.max.xiaoheihe.bean.SourceType;
import com.max.xiaoheihe.module.account.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: StoryActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class StoryActivity extends AppCompatActivity implements com.max.hbstory.b, p0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final od.a f91928b = com.max.xiaoheihe.module.story.a.a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f91926c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91927d = 8;

    /* JADX INFO: compiled from: StoryActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public final Intent a(@dl.d Context context, @e StoryItemsObj storyItemsObj, @e BBSLinkRecObj bBSLinkRecObj, @e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, storyItemsObj, bBSLinkRecObj, str}, this, changeQuickRedirect, false, 43479, new Class[]{Context.class, StoryItemsObj.class, BBSLinkRecObj.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) StoryActivity.class);
            intent.putExtra("video_info", storyItemsObj);
            intent.putExtra("rec", bBSLinkRecObj);
            intent.putExtra("h_src", str);
            return intent;
        }
    }

    private final void N0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43474, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StoryPlayerFragment storyPlayerFragment = new StoryPlayerFragment();
        storyPlayerFragment.setArguments(O0());
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.y(R.id.story_fragment_container, storyPlayerFragment);
        p0VarU.n();
    }

    private final Bundle O0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43475, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        return bundle;
    }

    @dl.d
    @m
    public static final Intent P0(@dl.d Context context, @e StoryItemsObj storyItemsObj, @e BBSLinkRecObj bBSLinkRecObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, storyItemsObj, bBSLinkRecObj, str}, null, changeQuickRedirect, true, 43478, new Class[]{Context.class, StoryItemsObj.class, BBSLinkRecObj.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f91926c.a(context, storyItemsObj, bBSLinkRecObj, str);
    }

    @Override // com.max.xiaoheihe.module.account.p0
    public void P1(@e String str) {
        StoryItemsObj storyItemsObjX3;
        StoryCardIdInfoObj card_id_info;
        String item_id;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43477, new Class[]{String.class}, Void.TYPE).isSupported || isFinishing()) {
            return;
        }
        Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.story_fragment_container);
        StoryPlayerFragment storyPlayerFragment = fragmentR0 instanceof StoryPlayerFragment ? (StoryPlayerFragment) fragmentR0 : null;
        if (storyPlayerFragment == null || (storyItemsObjX3 = storyPlayerFragment.X3()) == null || (card_id_info = storyItemsObjX3.getCard_id_info()) == null || (item_id = card_id_info.getItem_id()) == null || str == null) {
            return;
        }
        AccelWorldScreenShotKt.d(str, new SourceInfoObj(SourceType.link.getKey(), item_id));
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43476, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.activity_quick_none, R.anim.activity_quick_right_out);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 43473, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(R.anim.activity_quick_right_in, R.anim.activity_quick_none);
        setContentView(R.layout.activity_story_core);
        if (bundle == null) {
            N0();
        }
    }

    @Override // com.max.hbstory.b
    @dl.d
    public od.a x() {
        return this.f91928b;
    }
}
