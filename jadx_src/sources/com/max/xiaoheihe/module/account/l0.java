package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.PushStateGroupObj;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: SetPushStateActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nSetPushStateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/PushSettingGroupAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n766#2:266\n857#2,2:267\n1864#2,3:269\n*S KotlinDebug\n*F\n+ 1 SetPushStateActivity.kt\ncom/max/xiaoheihe/module/account/PushSettingGroupAdapter\n*L\n240#1:266\n240#1:267,2\n242#1:269,3\n*E\n"})
public final class l0 extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<List<PushStateGroupObj>> f78976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f78977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.p<Integer, Integer, b2> f78978d;

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f78979c = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final LinearLayout f78980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d CardView cardItemView, @dl.d LinearLayout sivContainer) {
            super(cardItemView);
            kotlin.jvm.internal.f0.p(cardItemView, "cardItemView");
            kotlin.jvm.internal.f0.p(sivContainer, "sivContainer");
            this.f78980b = sivContainer;
        }

        @dl.d
        public final LinearLayout a() {
            return this.f78980b;
        }
    }

    /* JADX INFO: compiled from: SetPushStateActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f78982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f78983d;

        b(int i10, int i11) {
            this.f78982c = i10;
            this.f78983d = i11;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23844, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0.this.f78978d.invoke(Integer.valueOf(this.f78982c), Integer.valueOf(this.f78983d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@dl.d List<? extends List<PushStateGroupObj>> dataList, @dl.d Context context, @dl.d yh.p<? super Integer, ? super Integer, b2> onItemClick) {
        kotlin.jvm.internal.f0.p(dataList, "dataList");
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(onItemClick, "onItemClick");
        this.f78976b = dataList;
        this.f78977c = context;
        this.f78978d = onItemClick;
    }

    private final SettingItemView n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23840, new Class[]{String.class}, SettingItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (SettingItemView) patchProxyResultProxy.result;
        }
        SettingItemView settingItemView = new SettingItemView(this.f78977c);
        settingItemView.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(settingItemView.getContext(), 46.0f)));
        settingItemView.setTitle(str);
        return settingItemView;
    }

    static /* synthetic */ SettingItemView o(l0 l0Var, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l0Var, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 23841, new Class[]{l0.class, String.class, Integer.TYPE, Object.class}, SettingItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (SettingItemView) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = "";
        }
        return l0Var.n(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23838, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f78976b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 23843, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 23842, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : q(viewGroup, i10);
    }

    public void p(@dl.d a holder, int i10) {
        List<PushStateGroupObj> list;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 23839, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(holder, "holder");
        if (i10 < this.f78976b.size() && (list = this.f78976b.get(i10)) != null) {
            LinearLayout linearLayoutA = holder.a();
            List listN2 = CollectionsKt___CollectionsKt.n2(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN2) {
                String group_name = ((PushStateGroupObj) obj).getGroup_name();
                if (!(group_name == null || group_name.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            for (Object obj2 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                String group_name2 = ((PushStateGroupObj) obj2).getGroup_name();
                if (group_name2 != null) {
                    SettingItemView settingItemViewN = n(group_name2);
                    settingItemViewN.setOnClickListener(new b(i10, i11));
                    linearLayoutA.addView(settingItemViewN);
                }
                i11 = i12;
            }
        }
    }

    @dl.d
    public a q(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 23837, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(parent, "parent");
        CardView cardView = new CardView(this.f78977c);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(cardView.getContext(), 8.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ViewUtils.f(cardView.getContext(), 12.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ViewUtils.f(cardView.getContext(), 12.0f);
        cardView.setLayoutParams(layoutParams);
        cardView.setRadius(ViewUtils.f(cardView.getContext(), 8.0f));
        cardView.setCardElevation(0.0f);
        cardView.setMaxCardElevation(0.0f);
        cardView.setCardBackgroundColor(cardView.getContext().getColor(R.color.white));
        LinearLayout linearLayout = new LinearLayout(this.f78977c);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        cardView.addView(linearLayout);
        return new a(cardView, linearLayout);
    }
}
