package com.max.xiaoheihe.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContentAutoPlayTextViewComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@n9.a({com.max.component.g.class})
public final class c implements com.max.component.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95911a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49420, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        ContentAutoPlayTextView contentAutoPlayTextView = new ContentAutoPlayTextView(context);
        contentAutoPlayTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        contentAutoPlayTextView.setText("SSS");
        contentAutoPlayTextView.setNeedAutoPlay(true);
        contentAutoPlayTextView.setTextSize(1, 28.0f);
        contentAutoPlayTextView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        contentAutoPlayTextView.setDrawableResId(R.drawable.game_heybox_stat_sss_290x36);
        return contentAutoPlayTextView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/665afa904097e302011c46fc550828c9.gif";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "ContentAutoPlayTextView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65477d;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "背景动画文字";
    }
}
