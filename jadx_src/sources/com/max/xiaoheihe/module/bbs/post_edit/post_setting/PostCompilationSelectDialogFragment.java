package com.max.xiaoheihe.module.bbs.post_edit.post_setting;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.d6;
import df.gt;
import dl.d;
import java.util.List;
import kotlin.b0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import ng.j;

/* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostCompilationSelectDialogFragment extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f83073o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f83074p = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private ActivityPostSettingViewModel f83075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d6 f83076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f83077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private s<PostCompilationItemObj> f83078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final z f83079n = b0.c(new yh.a<PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a>() { // from class: com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationSelectDialogFragment$compilationDiffItemCallback$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
        public static final class a extends DiffUtil.ItemCallback<PostCompilationItemObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public boolean a(@d PostCompilationItemObj oldItem, @d PostCompilationItemObj newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 30997, new Class[]{PostCompilationItemObj.class, PostCompilationItemObj.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(oldItem, "oldItem");
                f0.p(newItem, "newItem");
                return f0.g(oldItem.getObj_id(), newItem.getObj_id()) && f0.g(oldItem.getImage_url(), newItem.getImage_url()) && oldItem.getCount() == newItem.getCount() && f0.g(oldItem.getTitle(), newItem.getTitle());
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(PostCompilationItemObj postCompilationItemObj, PostCompilationItemObj postCompilationItemObj2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postCompilationItemObj, postCompilationItemObj2}, this, changeQuickRedirect, false, 30999, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(postCompilationItemObj, postCompilationItemObj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(PostCompilationItemObj postCompilationItemObj, PostCompilationItemObj postCompilationItemObj2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postCompilationItemObj, postCompilationItemObj2}, this, changeQuickRedirect, false, 30998, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(postCompilationItemObj, postCompilationItemObj2);
            }

            public boolean b(@d PostCompilationItemObj oldItem, @d PostCompilationItemObj newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 30996, new Class[]{PostCompilationItemObj.class, PostCompilationItemObj.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                f0.p(oldItem, "oldItem");
                f0.p(newItem, "newItem");
                return f0.g(oldItem, newItem);
            }
        }

        @d
        public final a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30994, new Class[0], a.class);
            return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationSelectDialogFragment$compilationDiffItemCallback$2$a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30995, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final PostCompilationSelectDialogFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30993, new Class[0], PostCompilationSelectDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostCompilationSelectDialogFragment) patchProxyResultProxy.result;
            }
            PostCompilationSelectDialogFragment postCompilationSelectDialogFragment = new PostCompilationSelectDialogFragment();
            postCompilationSelectDialogFragment.setArguments(androidx.core.os.e.a());
            return postCompilationSelectDialogFragment;
        }
    }

    /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
    public static final class b extends s<PostCompilationItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f83080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostCompilationSelectDialogFragment f83081c;

        /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostCompilationSelectDialogFragment f83082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ PostCompilationItemObj f83083c;

            a(PostCompilationSelectDialogFragment postCompilationSelectDialogFragment, PostCompilationItemObj postCompilationItemObj) {
                this.f83082b = postCompilationSelectDialogFragment;
                this.f83083c = postCompilationItemObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31002, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                PostCompilationSelectDialogFragment.Z3(this.f83082b, this.f83083c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, PostCompilationSelectDialogFragment postCompilationSelectDialogFragment, Context context, List<PostCompilationItemObj> list) {
            super(context, list, R.layout.item_post_compilation);
            this.f83080b = recyclerView;
            this.f83081c = postCompilationSelectDialogFragment;
        }

        public void m(@dl.e s.e eVar, @dl.e PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postCompilationItemObj}, this, changeQuickRedirect, false, 31000, new Class[]{s.e.class, PostCompilationItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewB = eVar != null ? eVar.b() : null;
            if (viewB == null || postCompilationItemObj == null) {
                return;
            }
            gt gtVarA = gt.a(viewB);
            f0.o(gtVarA, "bind(itemView)");
            String image_url = postCompilationItemObj.getImage_url();
            if (image_url == null || image_url.length() == 0) {
                gtVarA.f111102d.setColorFilter(this.f83080b.getContext().getColor(R.color.divider_primary_1_color));
                gtVarA.f111102d.setImageResource(R.drawable.game_heybox_platform_filled_v_40x40);
            } else {
                gtVarA.f111102d.clearColorFilter();
                com.max.hbimage.b.K(postCompilationItemObj.getImage_url(), gtVarA.f111102d);
            }
            TextView textView = gtVarA.f111105g;
            com.max.hbresource.a aVar = com.max.hbresource.a.f71893a;
            int i10 = com.max.hbresource.a.f71895c;
            textView.setTypeface(aVar.a(i10));
            textView.setText(postCompilationItemObj.getTitle());
            gtVarA.f111104f.setText(this.f83080b.getContext().getString(R.string.total_content_count_desc, Integer.valueOf(postCompilationItemObj.getCount())));
            TextView textView2 = gtVarA.f111103e;
            textView2.setTypeface(aVar.a(i10));
            textView2.setBackground(ViewUtils.i(ViewUtils.f(textView2.getContext(), 3.0f), textView2.getContext().getColor(R.color.black_start), textView2.getContext().getColor(R.color.black_end)));
            gtVarA.b().setOnClickListener(new a(this.f83081c, postCompilationItemObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PostCompilationItemObj postCompilationItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postCompilationItemObj}, this, changeQuickRedirect, false, 31001, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, postCompilationItemObj);
        }
    }

    /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentManager supportFragmentManager;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31006, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostCompilationCreateDialogFragment postCompilationCreateDialogFragmentA = PostCompilationCreateDialogFragment.f83049o.a();
            FragmentActivity activity = PostCompilationSelectDialogFragment.this.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                postCompilationCreateDialogFragmentA.M3(supportFragmentManager, "PostCompilationSettingDialogFragment");
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.Z0, null, new JsonObject());
            PostCompilationSelectDialogFragment.this.f83077l = true;
            PostCompilationSelectDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31007, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PostCompilationSelectDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
    public static final class e implements j0<List<? extends PostCompilationItemObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(List<? extends PostCompilationItemObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31009, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(list);
        }

        public final void b(List<PostCompilationItemObj> newList) {
            if (PatchProxy.proxy(new Object[]{newList}, this, changeQuickRedirect, false, 31008, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            d6 d6Var = PostCompilationSelectDialogFragment.this.f83076k;
            if (d6Var == null) {
                f0.S("binding");
                d6Var = null;
            }
            d6Var.f109631e.w();
            s sVar = PostCompilationSelectDialogFragment.this.f83078m;
            if (sVar != null) {
                f0.o(newList, "newList");
                com.max.hbcommon.base.adapter.d.b(sVar, newList, PostCompilationSelectDialogFragment.X3(PostCompilationSelectDialogFragment.this));
            }
        }
    }

    public static final /* synthetic */ PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a X3(PostCompilationSelectDialogFragment postCompilationSelectDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postCompilationSelectDialogFragment}, null, changeQuickRedirect, true, 30991, new Class[]{PostCompilationSelectDialogFragment.class}, PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a.class);
        return patchProxyResultProxy.isSupported ? (PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a) patchProxyResultProxy.result : postCompilationSelectDialogFragment.b4();
    }

    public static final /* synthetic */ void Z3(PostCompilationSelectDialogFragment postCompilationSelectDialogFragment, PostCompilationItemObj postCompilationItemObj) {
        if (PatchProxy.proxy(new Object[]{postCompilationSelectDialogFragment, postCompilationItemObj}, null, changeQuickRedirect, true, 30992, new Class[]{PostCompilationSelectDialogFragment.class, PostCompilationItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        postCompilationSelectDialogFragment.e4(postCompilationItemObj);
    }

    private final PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30983, new Class[0], PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a.class);
        return patchProxyResultProxy.isSupported ? (PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a) patchProxyResultProxy.result : (PostCompilationSelectDialogFragment$compilationDiffItemCallback$2.a) this.f83079n.getValue();
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30987, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d6 d6Var = this.f83076k;
        d6 d6Var2 = null;
        if (d6Var == null) {
            f0.S("binding");
            d6Var = null;
        }
        RecyclerView recyclerView = d6Var.f109630d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        b bVar = new b(recyclerView, this, recyclerView.getContext(), CollectionsKt__CollectionsKt.E());
        this.f83078m = bVar;
        recyclerView.setAdapter(bVar);
        d6 d6Var3 = this.f83076k;
        if (d6Var3 == null) {
            f0.S("binding");
            d6Var3 = null;
        }
        SmartRefreshLayout smartRefreshLayout = d6Var3.f109631e;
        smartRefreshLayout.i0(false);
        smartRefreshLayout.b0(true);
        smartRefreshLayout.f0(new pg.b() { // from class: com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationSelectDialogFragment$initView$2$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.post_edit.post_setting.PostCompilationSelectDialogFragment$initView$2$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: PostCompilationSelectDialogFragment.kt */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<Boolean> {
                public static ChangeQuickRedirect changeQuickRedirect;

                AnonymousClass1(Object obj) {
                    super(0, obj, PostCompilationSelectDialogFragment.class, "isActive", "isActive()Z", 0);
                }

                @d
                public final Boolean i() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31004, new Class[0], Boolean.class);
                    return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.valueOf(((PostCompilationSelectDialogFragment) this.receiver).isActive());
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31005, new Class[0], Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i();
                }
            }

            @Override // pg.b
            public final void f(@d j it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 31003, new Class[]{j.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                ActivityPostSettingViewModel activityPostSettingViewModel = this.f83088b.f83075j;
                if (activityPostSettingViewModel != null) {
                    activityPostSettingViewModel.w(true, new AnonymousClass1(this.f83088b));
                }
            }
        });
        d6 d6Var4 = this.f83076k;
        if (d6Var4 == null) {
            f0.S("binding");
        } else {
            d6Var2 = d6Var4;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = d6Var2.f109628b;
        bottomButtonLeftItemView.setRightClickListener(new c());
        bottomButtonLeftItemView.setLeftClickListener(new d());
    }

    private final void d4() {
        ActivityPostSettingViewModel activityPostSettingViewModel;
        LiveData<List<PostCompilationItemObj>> liveDataN;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30989, new Class[0], Void.TYPE).isSupported || (activityPostSettingViewModel = this.f83075j) == null || (liveDataN = activityPostSettingViewModel.n()) == null) {
            return;
        }
        liveDataN.k(this, new e());
    }

    private final void e4(PostCompilationItemObj postCompilationItemObj) {
        if (PatchProxy.proxy(new Object[]{postCompilationItemObj}, this, changeQuickRedirect, false, 30988, new Class[]{PostCompilationItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ActivityPostSettingViewModel activityPostSettingViewModel = this.f83075j;
        if (activityPostSettingViewModel != null) {
            activityPostSettingViewModel.v(postCompilationItemObj.getObj_id());
        }
        dismiss();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 30984, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f83075j = (ActivityPostSettingViewModel) new y0(activity).a(ActivityPostSettingViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 30985, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        d6 d6VarC = d6.c(inflater);
        f0.o(d6VarC, "inflate(inflater)");
        this.f83076k = d6VarC;
        if (d6VarC == null) {
            f0.S("binding");
            d6VarC = null;
        }
        RelativeLayout relativeLayoutB = d6VarC.b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        ActivityPostSettingViewModel activityPostSettingViewModel;
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 30990, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f83077l || (activityPostSettingViewModel = this.f83075j) == null) {
            return;
        }
        activityPostSettingViewModel.u(1);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 30986, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        c4();
        d4();
    }
}
