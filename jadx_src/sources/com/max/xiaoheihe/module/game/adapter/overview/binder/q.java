package com.max.xiaoheihe.module.game.adapter.overview.binder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewLogoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewLogoVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q extends cb.c<BaseGameOverviewObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85895b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.xiaoheihe.module.game.adapter.overview.d f85896a;

    /* JADX INFO: compiled from: GameOverviewLogoVHB.kt */
    public static final class a implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f85897a;

        a(ImageView imageView) {
            this.f85897a = imageView;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 35796, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            ImageView imageView = this.f85897a;
            if (drawable.getMinimumHeight() <= 0 || drawable.getMinimumWidth() <= 0) {
                return;
            }
            imageView.getLayoutParams().width = (ViewUtils.f(BaseApplication.a(), 18.0f) * drawable.getMinimumWidth()) / drawable.getMinimumHeight();
            imageView.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 35795, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85897a.setImageDrawable(null);
        }
    }

    public q(@dl.d com.max.xiaoheihe.module.game.adapter.overview.d param) {
        f0.p(param, "param");
        this.f85896a = param;
    }

    @Override // cb.c
    public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.s.e eVar, BaseGameOverviewObj baseGameOverviewObj) {
        if (PatchProxy.proxy(new Object[]{eVar, baseGameOverviewObj}, this, changeQuickRedirect, false, 35794, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f(eVar, baseGameOverviewObj);
    }

    public void f(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BaseGameOverviewObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 35793, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BaseGameOverviewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof GameOverviewLogoObj) {
            View viewI = viewHolder.i(R.id.iv_logo);
            f0.o(viewI, "viewHolder.getView(R.id.iv_logo)");
            com.max.hbimage.b.Y(this.f85896a.b(), ((GameOverviewLogoObj) data).getLogo_url(), new a((ImageView) viewI));
        }
    }

    @dl.d
    public final com.max.xiaoheihe.module.game.adapter.overview.d g() {
        return this.f85896a;
    }
}
