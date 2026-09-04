package com.max.xiaoheihe.module.news.viewholderbinder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecUsersObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: NewsRecUsersVHB.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class d0 extends h0 implements com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91389k = 0;

    /* JADX INFO: compiled from: NewsRecUsersVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42758, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.J(d0.this.m(), com.max.xiaoheihe.module.account.utils.c.i(), "recommend", null, 8, null).A();
        }
    }

    /* JADX INFO: compiled from: NewsRecUsersVHB.kt */
    public static final class b extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedsContentRecUsersObj f91391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f91392c;

        b(FeedsContentRecUsersObj feedsContentRecUsersObj, d0 d0Var) {
            this.f91391b = feedsContentRecUsersObj;
            this.f91392c = d0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 42759, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            List<BBSUserInfoObj> items = this.f91391b.getItems();
            kotlin.jvm.internal.f0.m(items);
            if (childAdapterPosition == items.size() - 1) {
                outRect.set(0, 0, 0, 0);
            } else {
                outRect.set(0, 0, ViewUtils.f(this.f91392c.m(), 20.0f), 0);
            }
        }
    }

    /* JADX INFO: compiled from: NewsRecUsersVHB.kt */
    public static final class c implements com.max.xiaoheihe.module.bbs.adapter.r.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.r.e
        public void a(@dl.d BBSUserInfoObj user) {
            if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 42761, new Class[]{BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(user, "user");
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.r.e
        public boolean b(@dl.d BBSUserInfoObj user) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 42760, new Class[]{BBSUserInfoObj.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            kotlin.jvm.internal.f0.p(user, "user");
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@dl.d g0 param) {
        super(param);
        kotlin.jvm.internal.f0.p(param, "param");
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.InterfaceC0842a
    public void a(@dl.d RecyclerView recyclerView, int i10, int i11) {
        Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42757, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void i(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d FeedsContentBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42755, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
        FeedsContentRecUsersObj feedsContentRecUsersObj = (FeedsContentRecUsersObj) data;
        View viewB = viewHolder.b();
        if (com.max.hbcommon.utils.c.w(feedsContentRecUsersObj.getItems())) {
            viewB.setVisibility(8);
        } else {
            viewB.setVisibility(0);
            RecyclerView recyclerView = (RecyclerView) viewHolder.i(R.id.rv_recommend);
            if (recyclerView.getLayoutManager() == null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(m(), 0, false));
            }
            viewHolder.i(R.id.lsh).setOnClickListener(new a());
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new b(feedsContentRecUsersObj, this));
            }
            recyclerView.setAdapter(new com.max.xiaoheihe.module.bbs.adapter.r(m(), feedsContentRecUsersObj.getItems(), new c()));
        }
        feedsContentRecUsersObj.setShowDivider(true);
    }

    @Override // com.max.xiaoheihe.module.news.viewholderbinder.h0
    public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d BBSLinkObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 42756, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
        kotlin.jvm.internal.f0.p(data, "data");
    }
}
