package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchGameCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class SearchGameCardView extends GameCardContainerView {
    public static final int E = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public SearchInnerGameItemView D;

    public SearchGameCardView(@e Context context) {
        super(context);
    }

    public SearchGameCardView(@e Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGameCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
    }

    @d
    public final SearchInnerGameItemView getGameItemView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37004, new Class[0], SearchInnerGameItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchInnerGameItemView) patchProxyResultProxy.result;
        }
        SearchInnerGameItemView searchInnerGameItemView = this.D;
        if (searchInnerGameItemView != null) {
            return searchInnerGameItemView;
        }
        f0.S("gameItemView");
        return null;
    }

    @Override // com.max.xiaoheihe.module.game.component.GameCardContainerView
    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.j();
        setGameItemView(new SearchInnerGameItemView(getContext()));
        getGameItemView().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getVg_bottom_container().addView(getGameItemView());
    }

    public final void setGameItemView(@d SearchInnerGameItemView searchInnerGameItemView) {
        if (PatchProxy.proxy(new Object[]{searchInnerGameItemView}, this, changeQuickRedirect, false, 37005, new Class[]{SearchInnerGameItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(searchInnerGameItemView, "<set-?>");
        this.D = searchInnerGameItemView;
    }
}
