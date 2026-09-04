package com.max.xiaoheihe.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: BoxAutoPlayViewComponent.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@n9.a({com.max.component.g.class})
public final class BoxAutoPlayViewComponent implements com.max.component.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95808a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 49379, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        BoxAutoPlayView boxAutoPlayView = new BoxAutoPlayView(context);
        boxAutoPlayView.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(context, 120.0f), ViewUtils.f(context, 56.0f)));
        boxAutoPlayView.setVisibility(0);
        boxAutoPlayView.setmResId(R.drawable.game_prefect_achieve_290x56);
        boxAutoPlayView.setRadiusZone(5);
        boxAutoPlayView.c(ViewUtils.f(context, 56.0f), ViewUtils.f(context, 120.0f));
        boxAutoPlayView.setRadius(ViewUtils.f(context, 4.0f));
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new BoxAutoPlayViewComponent$create$2$1(boxAutoPlayView, null), 3, null);
        return boxAutoPlayView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/d3d7f0263070a1ff088564f77ee883b3.gif";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "BoxAutoPlayView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65477d;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "BoxAutoPlayView";
    }
}
