package com.max.xiaoheihe.module.favour;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.utils.BBSKtUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.m6;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourLinkFolderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourLinkFolderActivity.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,513:1\n262#2,2:514\n*S KotlinDebug\n*F\n+ 1 FavourLinkFolderActivity.kt\ncom/max/xiaoheihe/module/favour/FavourLinkFolderActivity\n*L\n111#1:514,2\n*E\n"})
@o(parameters = 0)
public final class FavourLinkFolderActivity extends BaseActivity implements FavourLinkFolderFragment.c {

    @dl.d
    public static final a T = new a(null);
    public static final int U = 8;

    @dl.d
    private static final String V = FavourCollectionContentFragment.f83664o;

    @dl.d
    private static final String W = "folder_default";

    @dl.d
    public static final String X = "添加内容";

    @dl.d
    public static final String Y = "批量管理";

    @dl.d
    public static final String Z = "编辑收藏夹";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    public static final String f83730a0 = "清理失效内容";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    public static final String f83731b0 = "删除收藏夹";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f83732c0 = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean L;
    private TabLayout M;
    private ViewPager2 N;
    private FragmentStateAdapter O;

    @dl.e
    private String P;

    @dl.e
    private String Q;
    private boolean R = true;

    @dl.d
    private final HashMap<Integer, Fragment> S = new HashMap<>();

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @xh.m
        public static /* synthetic */ void d() {
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31829, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderActivity.W;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31828, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : FavourLinkFolderActivity.V;
        }

        @dl.d
        @xh.m
        public final Intent e(@dl.d Context context, @dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, this, changeQuickRedirect, false, 31830, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) FavourLinkFolderActivity.class);
            intent.putExtra(c(), str);
            intent.putExtra(a(), str2);
            return intent;
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Dialog f83735d;

        b(String str, Dialog dialog) {
            this.f83734c = str;
            this.f83735d = dialog;
        }

        public void onNext(@dl.d Result<Object> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31831, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            ((BaseActivity) FavourLinkFolderActivity.this).f66616q.setTitle(this.f83734c);
            this.f83735d.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31832, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<Object> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31833, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            for (Fragment fragment : FavourLinkFolderActivity.this.S.values()) {
                HashMap map = FavourLinkFolderActivity.this.S;
                ViewPager2 viewPager2 = FavourLinkFolderActivity.this.N;
                if (viewPager2 == null) {
                    f0.S("mViewPager");
                    viewPager2 = null;
                }
                Object obj = map.get(Integer.valueOf(viewPager2.getCurrentItem()));
                f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.FavourLinkFolderFragment");
                ((FavourLinkFolderFragment) obj).s4();
            }
            if (com.max.hbcommon.utils.c.u(t10.getMsg())) {
                return;
            }
            com.max.hbutils.utils.c.f(t10.getMsg());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31834, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class d extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31835, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            FavourLinkFolderFragment favourLinkFolderFragmentE = FavourLinkFolderFragment.f83779t.e(FavourLinkFolderActivity.this.P, String.valueOf(i10));
            FavourLinkFolderActivity.this.S.put(Integer.valueOf(i10), favourLinkFolderFragmentE);
            return favourLinkFolderFragmentE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class e implements com.google.android.material.tabs.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f83738a = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.google.android.material.tabs.d.b
        public final void a(@dl.d TabLayout.h tab, int i10) {
            if (PatchProxy.proxy(new Object[]{tab, new Integer(i10)}, this, changeQuickRedirect, false, 31836, new Class[]{TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            if (i10 == 0) {
                tab.D("收藏顺序");
            } else {
                tab.D("最近更新");
            }
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f83739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FavourLinkFolderActivity f83740c;

        f(yh.a<b2> aVar, FavourLinkFolderActivity favourLinkFolderActivity) {
            this.f83739b = aVar;
            this.f83740c = favourLinkFolderActivity;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31838, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
        }

        public void onNext(@dl.d Result<Object> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31837, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            super.onNext(t10);
            this.f83739b.invoke();
            this.f83740c.finish();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31839, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31840, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewPager2 viewPager2 = null;
            ((BaseActivity) FavourLinkFolderActivity.this).f66616q.setAction((CharSequence) null);
            HashMap map = FavourLinkFolderActivity.this.S;
            ViewPager2 viewPager3 = FavourLinkFolderActivity.this.N;
            if (viewPager3 == null) {
                f0.S("mViewPager");
                viewPager3 = null;
            }
            Object obj = map.get(Integer.valueOf(viewPager3.getCurrentItem()));
            f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.FavourLinkFolderFragment");
            ((FavourLinkFolderFragment) obj).m4();
            FavourLinkFolderActivity.this.o2();
            if (FavourLinkFolderActivity.this.L) {
                return;
            }
            ViewPager2 viewPager4 = FavourLinkFolderActivity.this.N;
            if (viewPager4 == null) {
                f0.S("mViewPager");
            } else {
                viewPager2 = viewPager4;
            }
            viewPager2.setUserInputEnabled(true);
            FavourLinkFolderActivity.this.R = true;
            FavourLinkFolderActivity.Z1(FavourLinkFolderActivity.this);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31841, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (FavourLinkFolderActivity.this.L) {
                FavourLinkFolderActivity.c2(FavourLinkFolderActivity.this);
            } else {
                FavourLinkFolderActivity.b2(FavourLinkFolderActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class i extends s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FavourLinkFolderActivity f83743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f83747f;

        /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f83749c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f83750d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ FavourLinkFolderActivity f83751e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f83752f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f83753g;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class DialogInterfaceOnClickListenerC0734a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ EditText f83754b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FavourLinkFolderActivity f83755c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.component.i f83756d;

                DialogInterfaceOnClickListenerC0734a(EditText editText, FavourLinkFolderActivity favourLinkFolderActivity, com.max.hbcommon.component.i iVar) {
                    this.f83754b = editText;
                    this.f83755c = favourLinkFolderActivity;
                    this.f83756d = iVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    String string = this.f83754b.getText().toString();
                    Charset charsetDefaultCharset = Charset.defaultCharset();
                    f0.o(charsetDefaultCharset, "defaultCharset()");
                    byte[] bytes = string.getBytes(charsetDefaultCharset);
                    f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length > 24) {
                        com.max.hbutils.utils.c.f("最多输入8个字");
                    } else {
                        dialogInterface.dismiss();
                        FavourLinkFolderActivity.M1(this.f83755c, this.f83754b.getText().toString(), this.f83756d);
                    }
                }
            }

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f83757b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            a(String str, String str2, com.max.hbcommon.component.i iVar, FavourLinkFolderActivity favourLinkFolderActivity, String str3, String str4) {
                this.f83748b = str;
                this.f83749c = str2;
                this.f83750d = iVar;
                this.f83751e = favourLinkFolderActivity;
                this.f83752f = str3;
                this.f83753g = str4;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31849, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String str = this.f83748b;
                if (f0.g(str, this.f83749c)) {
                    this.f83750d.dismiss();
                    this.f83751e.f2();
                    return;
                }
                if (f0.g(str, this.f83752f)) {
                    EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(((BaseActivity) this.f83751e).f66601b);
                    com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(((BaseActivity) this.f83751e).f66601b).u("修改", new DialogInterfaceOnClickListenerC0734a(editTextI, this.f83751e, this.f83750d)).n(R.string.cancel, b.f83757b).i(editTextI).y("修改名称").d();
                    f0.o(aVarD, "private fun showModFolde…      dialog.show()\n    }");
                    aVarD.show();
                    return;
                }
                if (f0.g(str, this.f83753g)) {
                    HashMap map = this.f83751e.S;
                    ViewPager2 viewPager2 = this.f83751e.N;
                    ViewPager2 viewPager3 = null;
                    if (viewPager2 == null) {
                        f0.S("mViewPager");
                        viewPager2 = null;
                    }
                    Object obj = map.get(Integer.valueOf(viewPager2.getCurrentItem()));
                    f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.FavourLinkFolderFragment");
                    ((FavourLinkFolderFragment) obj).E4();
                    ViewPager2 viewPager4 = this.f83751e.N;
                    if (viewPager4 == null) {
                        f0.S("mViewPager");
                    } else {
                        viewPager3 = viewPager4;
                    }
                    viewPager3.setUserInputEnabled(false);
                    this.f83751e.R = false;
                    FavourLinkFolderActivity.Z1(this.f83751e);
                    this.f83751e.n2();
                    this.f83750d.dismiss();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ArrayList<String> arrayList, FavourLinkFolderActivity favourLinkFolderActivity, String str, com.max.hbcommon.component.i iVar, String str2, String str3, Activity activity) {
            super(activity, arrayList, R.layout.item_collection_folder);
            this.f83743b = favourLinkFolderActivity;
            this.f83744c = str;
            this.f83745d = iVar;
            this.f83746e = str2;
            this.f83747f = str3;
        }

        public void m(@dl.d s.e viewHolder, @dl.d String data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 31847, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            View viewI = viewHolder.i(R.id.divider);
            if (f0.g("1", this.f83743b.Q) && viewHolder.getAdapterPosition() == getItemCount() - 1) {
                if (viewI != null) {
                    viewI.setVisibility(8);
                }
            } else if (viewI != null) {
                viewI.setVisibility(0);
            }
            TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
            textView.setText(data);
            textView.setOnClickListener(new a(data, this.f83744c, this.f83745d, this.f83743b, this.f83746e, this.f83747f));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 31848, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83758b;

        j(com.max.hbcommon.component.i iVar) {
            this.f83758b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31852, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83758b.dismiss();
        }
    }

    /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83759b;

        k(com.max.hbcommon.component.i iVar) {
            this.f83759b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31868, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83759b.dismiss();
        }
    }

    public static final /* synthetic */ void M1(FavourLinkFolderActivity favourLinkFolderActivity, String str, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderActivity, str, dialog}, null, changeQuickRedirect, true, 31827, new Class[]{FavourLinkFolderActivity.class, String.class, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderActivity.e2(str, dialog);
    }

    public static final /* synthetic */ void Z1(FavourLinkFolderActivity favourLinkFolderActivity) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderActivity}, null, changeQuickRedirect, true, 31826, new Class[]{FavourLinkFolderActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderActivity.l2();
    }

    public static final /* synthetic */ void b2(FavourLinkFolderActivity favourLinkFolderActivity) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderActivity}, null, changeQuickRedirect, true, 31825, new Class[]{FavourLinkFolderActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderActivity.p2();
    }

    public static final /* synthetic */ void c2(FavourLinkFolderActivity favourLinkFolderActivity) {
        if (PatchProxy.proxy(new Object[]{favourLinkFolderActivity}, null, changeQuickRedirect, true, 31824, new Class[]{FavourLinkFolderActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkFolderActivity.q2();
    }

    @SuppressLint({"AutoDispose"})
    private final void e2(String str, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{str, dialog}, this, changeQuickRedirect, false, 31816, new Class[]{String.class, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().S4(this.P, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str, dialog)));
    }

    @dl.d
    public static final String h2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31822, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : T.a();
    }

    @dl.d
    public static final String i2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31821, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : T.c();
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31813, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = new d(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.N;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            f0.S("mViewPager");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(3);
        ViewPager2 viewPager4 = this.N;
        if (viewPager4 == null) {
            f0.S("mViewPager");
            viewPager4 = null;
        }
        FragmentStateAdapter fragmentStateAdapter = this.O;
        if (fragmentStateAdapter == null) {
            f0.S("mPagerAdapter");
            fragmentStateAdapter = null;
        }
        viewPager4.setAdapter(fragmentStateAdapter);
        if (this.L) {
            ViewPager2 viewPager5 = this.N;
            if (viewPager5 == null) {
                f0.S("mViewPager");
            } else {
                viewPager3 = viewPager5;
            }
            viewPager3.setUserInputEnabled(false);
            return;
        }
        TabLayout tabLayout = this.M;
        if (tabLayout == null) {
            f0.S("mTabLayout");
            tabLayout = null;
        }
        ViewPager2 viewPager6 = this.N;
        if (viewPager6 == null) {
            f0.S("mViewPager");
        } else {
            viewPager3 = viewPager6;
        }
        new com.google.android.material.tabs.d(tabLayout, viewPager3, e.f83738a).a();
    }

    @dl.d
    @xh.m
    public static final Intent k2(@dl.d Context context, @dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 31823, new Class[]{Context.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : T.e(context, str, str2);
    }

    private final void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31812, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TabLayout tabLayout = this.M;
        if (tabLayout == null) {
            f0.S("mTabLayout");
            tabLayout = null;
        }
        View childAt = tabLayout.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = linearLayout.getChildAt(i10);
            if (childAt2 != null) {
                childAt2.setClickable(this.R);
            }
        }
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31815, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.f66602c.inflate(R.layout.dialog_select_collection, (ViewGroup) null, false);
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bb_cancel);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        View viewFindViewById = viewInflate.findViewById(R.id.v_blank);
        View viewFindViewById2 = viewInflate.findViewById(R.id.rv_choices);
        f0.o(viewFindViewById2, "mContentView.findViewById(R.id.rv_choices)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_action);
        ArrayList arrayList = new ArrayList();
        arrayList.add("清空失效内容");
        if (f0.g("1", this.Q)) {
            textView2.setVisibility(8);
        } else {
            arrayList.add("修改名称");
            textView2.setVisibility(0);
        }
        arrayList.add("批量操作");
        textView.setText("管理");
        i iVar2 = new i(arrayList, this, "清空失效内容", iVar, "修改名称", "批量操作", this.f66601b);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(iVar2);
        j jVar = new j(iVar);
        textView2.setCompoundDrawablePadding(ViewUtils.f(this.f66601b, 4.0f));
        textView2.setText(f83731b0);
        textView2.setTextColor(this.f66601b.getResources().getColor(R.color.red));
        Object parent = textView2.getParent();
        f0.n(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.component.i f83766b;

                a(com.max.hbcommon.component.i iVar) {
                    this.f83766b = iVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31846, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    this.f83766b.dismiss();
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31842, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                View viewInflate2 = LayoutInflater.from(((BaseActivity) this.f83760b).f66601b).inflate(R.layout.dialog_select_collection, (ViewGroup) null, false);
                final com.max.hbcommon.component.i iVar3 = new com.max.hbcommon.component.i((Context) ((BaseActivity) this.f83760b).f66601b, true, viewInflate2);
                BottomButtonLeftItemView bottomButtonLeftItemView2 = (BottomButtonLeftItemView) viewInflate2.findViewById(R.id.bb_cancel);
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_title);
                View viewFindViewById3 = viewInflate2.findViewById(R.id.v_blank);
                View viewFindViewById4 = viewInflate2.findViewById(R.id.rv_choices);
                f0.o(viewFindViewById4, "contentView.findViewById(R.id.rv_choices)");
                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_action);
                textView3.setText("删除收藏夹后，该收藏夹中的内容也会被一并删除");
                textView4.setTextColor(((BaseActivity) this.f83760b).f66601b.getResources().getColor(R.color.red));
                textView4.setText("确认删除");
                final FavourLinkFolderActivity favourLinkFolderActivity = this.f83760b;
                final com.max.hbcommon.component.i iVar4 = iVar;
                textView4.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialog$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 31843, new Class[]{View.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        iVar3.dismiss();
                        FavourLinkFolderActivity favourLinkFolderActivity2 = favourLinkFolderActivity;
                        final com.max.hbcommon.component.i iVar5 = iVar4;
                        favourLinkFolderActivity2.m2(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity.showModFolderDialog.1.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31845, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31844, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                iVar5.dismiss();
                            }
                        });
                    }
                });
                ((RecyclerView) viewFindViewById4).setVisibility(8);
                a aVar = new a(iVar3);
                viewFindViewById3.setOnClickListener(aVar);
                bottomButtonLeftItemView2.setRightClickListener(aVar);
                iVar3.show();
            }
        });
        bottomButtonLeftItemView.setRightClickListener(jVar);
        viewFindViewById.setOnClickListener(jVar);
        iVar.show();
    }

    private final void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31814, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m6 m6VarC = m6.c(this.f66602c);
        m6VarC.f113299d.setText("管理");
        f0.o(m6VarC, "inflate(mInflater).apply…tle.text = \"管理\"\n        }");
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, (View) m6VarC.b());
        final List listP = CollectionsKt__CollectionsKt.P(X, Y, Z, f83730a0, f83731b0);
        final Activity activity = this.f66601b;
        m6VarC.f113298c.setAdapter(new s<String>(listP, activity) { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialogV2$adapter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f83770c;

                a(String str) {
                    this.f83770c = str;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31857, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    FavourLinkFolderActivity$showModFolderDialogV2$adapter$1.m(FavourLinkFolderActivity$showModFolderDialogV2$adapter$1.this, this.f83770c);
                }
            }

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f83771b = new b();
                public static ChangeQuickRedirect changeQuickRedirect;

                b() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31865, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class c implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ EditText f83772b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FavourLinkFolderActivity f83773c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.component.i f83774d;

                c(EditText editText, FavourLinkFolderActivity favourLinkFolderActivity, com.max.hbcommon.component.i iVar) {
                    this.f83772b = editText;
                    this.f83773c = favourLinkFolderActivity;
                    this.f83774d = iVar;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31866, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    String string = this.f83772b.getText().toString();
                    Charset charsetDefaultCharset = Charset.defaultCharset();
                    f0.o(charsetDefaultCharset, "defaultCharset()");
                    byte[] bytes = string.getBytes(charsetDefaultCharset);
                    f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length > 24) {
                        com.max.hbutils.utils.c.f("最多输入8个字");
                    } else {
                        dialogInterface.dismiss();
                        FavourLinkFolderActivity.M1(this.f83773c, this.f83772b.getText().toString(), this.f83774d);
                    }
                }
            }

            /* JADX INFO: compiled from: FavourLinkFolderActivity.kt */
            public static final class d implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final d f83775b = new d();
                public static ChangeQuickRedirect changeQuickRedirect;

                d() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31867, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }

            public static final /* synthetic */ void m(FavourLinkFolderActivity$showModFolderDialogV2$adapter$1 favourLinkFolderActivity$showModFolderDialogV2$adapter$1, String str) {
                if (PatchProxy.proxy(new Object[]{favourLinkFolderActivity$showModFolderDialogV2$adapter$1, str}, null, changeQuickRedirect, true, 31856, new Class[]{FavourLinkFolderActivity$showModFolderDialogV2$adapter$1.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                favourLinkFolderActivity$showModFolderDialogV2$adapter$1.o(str);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            private final void o(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 31854, new Class[]{String.class}, Void.TYPE).isSupported) {
                }
                switch (str.hashCode()) {
                    case -885793220:
                        if (str.equals(FavourLinkFolderActivity.f83731b0)) {
                            iVar.dismiss();
                            com.max.hbcommon.view.a.f fVarV = new com.max.hbcommon.view.a.f(((BaseActivity) this).f66601b).y(FavourLinkFolderActivity.f83731b0).l("删除后，会同步移除收藏夹中的内容").v(true);
                            final FavourLinkFolderActivity favourLinkFolderActivity = this;
                            fVarV.u("确认删除", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$4
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(final DialogInterface dialogInterface, int i10) {
                                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31862, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                                        return;
                                    }
                                    favourLinkFolderActivity.m2(new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$4.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ b2 invoke() {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31864, new Class[0], Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            invoke2();
                                            return b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31863, new Class[0], Void.TYPE).isSupported) {
                                                return;
                                            }
                                            dialogInterface.dismiss();
                                        }
                                    });
                                }
                            }).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f83771b).w(true).F();
                            break;
                        }
                        break;
                    case 787883387:
                        if (str.equals(FavourLinkFolderActivity.Y)) {
                            iVar.dismiss();
                            HashMap map = this.S;
                            ViewPager2 viewPager2 = this.N;
                            ViewPager2 viewPager3 = null;
                            if (viewPager2 == null) {
                                f0.S("mViewPager");
                                viewPager2 = null;
                            }
                            Object obj = map.get(Integer.valueOf(viewPager2.getCurrentItem()));
                            f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.FavourLinkFolderFragment");
                            ((FavourLinkFolderFragment) obj).E4();
                            ViewPager2 viewPager4 = this.N;
                            if (viewPager4 == null) {
                                f0.S("mViewPager");
                            } else {
                                viewPager3 = viewPager4;
                            }
                            viewPager3.setUserInputEnabled(false);
                            this.n2();
                            break;
                        }
                        break;
                    case 859763097:
                        if (str.equals(FavourLinkFolderActivity.X)) {
                            String str2 = this.P;
                            if (str2 != null) {
                                FavourLinkFolderActivity favourLinkFolderActivity2 = this;
                                FavourAddLinkToFolderActivity.a aVar = FavourAddLinkToFolderActivity.R;
                                Activity mContext = ((BaseActivity) favourLinkFolderActivity2).f66601b;
                                f0.o(mContext, "mContext");
                                favourLinkFolderActivity2.startActivityForResult(aVar.a(mContext, str2), 1);
                            }
                            iVar.dismiss();
                            break;
                        }
                        break;
                    case 1101954021:
                        if (str.equals(FavourLinkFolderActivity.Z)) {
                            iVar.dismiss();
                            EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(((BaseActivity) this).f66601b);
                            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(((BaseActivity) this).f66601b).u("修改", new c(editTextI, this, iVar)).n(R.string.cancel, d.f83775b).i(editTextI).y("修改名称").d();
                            f0.o(aVarD, "private fun showModFolde…      dialog.show()\n    }");
                            aVarD.show();
                            break;
                        }
                        break;
                    case 1252608364:
                        if (str.equals(FavourLinkFolderActivity.f83730a0)) {
                            iVar.dismiss();
                            BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                            Activity mContext2 = ((BaseActivity) this).f66601b;
                            f0.o(mContext2, "mContext");
                            io.reactivex.disposables.a compositeDisposable = this.V0();
                            f0.o(compositeDisposable, "compositeDisposable");
                            String str3 = this.P;
                            FavourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$2 favourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$2 = new FavourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$2(this);
                            final FavourLinkFolderActivity favourLinkFolderActivity3 = this;
                            companion.g(mContext2, compositeDisposable, str3, FavourLinkFolderActivity.f83730a0, "将清理该收藏夹内的所有失效内容", favourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.favour.FavourLinkFolderActivity$showModFolderDialogV2$adapter$1$onOptionClickV2$3
                                public static ChangeQuickRedirect changeQuickRedirect;

                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31861, new Class[0], Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31860, new Class[0], Void.TYPE).isSupported) {
                                        return;
                                    }
                                    HashMap map2 = favourLinkFolderActivity3.S;
                                    ViewPager2 viewPager5 = favourLinkFolderActivity3.N;
                                    if (viewPager5 == null) {
                                        f0.S("mViewPager");
                                        viewPager5 = null;
                                    }
                                    Object obj2 = map2.get(Integer.valueOf(viewPager5.getCurrentItem()));
                                    FavourLinkFolderFragment favourLinkFolderFragment = obj2 instanceof FavourLinkFolderFragment ? (FavourLinkFolderFragment) obj2 : null;
                                    if (favourLinkFolderFragment != null) {
                                        favourLinkFolderFragment.s4();
                                    }
                                }
                            });
                            break;
                        }
                        break;
                }
            }

            public void n(@dl.d s.e viewHolder, @dl.d String data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 31853, new Class[]{s.e.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                View viewI = viewHolder.i(R.id.divider);
                if (viewI != null) {
                    viewI.setVisibility(0);
                }
                TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
                if (textView != null) {
                    FavourLinkFolderActivity favourLinkFolderActivity = this;
                    if (f0.g(data, FavourLinkFolderActivity.f83731b0)) {
                        textView.setTextColor(((BaseActivity) favourLinkFolderActivity).f66601b.getColor(R.color.alert_color));
                    } else {
                        textView.setTextColor(((BaseActivity) favourLinkFolderActivity).f66601b.getColor(R.color.text_primary_1_color));
                    }
                    textView.setText(data);
                }
                View viewB = viewHolder.b();
                if (viewB != null) {
                    FavourLinkFolderActivity favourLinkFolderActivity2 = this;
                    viewB.setOnClickListener(new a(data));
                    viewB.setBackgroundColor(((BaseActivity) favourLinkFolderActivity2).f66601b.getColor(R.color.background_layer_2_color));
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, String str) {
                if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 31855, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                n(eVar, str);
            }
        });
        m6VarC.f113298c.setLayoutManager(new LinearLayoutManager(this.f66601b, 1, false));
        k kVar = new k(iVar);
        BottomButtonLeftItemView bottomButtonLeftItemView = m6VarC.f113297b;
        bottomButtonLeftItemView.setLeftClickListener(kVar);
        bottomButtonLeftItemView.setShowLeftButton(true);
        bottomButtonLeftItemView.setShowRightButton(false);
        bottomButtonLeftItemView.k(false);
        m6VarC.f113300e.setOnClickListener(kVar);
        iVar.show();
    }

    @SuppressLint({"AutoDispose"})
    public final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31817, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X6(this.P, 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @Override // com.max.xiaoheihe.module.favour.FavourLinkFolderFragment.c
    public void h(@dl.d String newtitile) {
        if (PatchProxy.proxy(new Object[]{newtitile}, this, changeQuickRedirect, false, 31820, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newtitile, "newtitile");
        this.f66616q.setTitle(newtitile);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31809, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_vp_with_title_material);
        getWindow().setFormat(-3);
        t.h0(getWindow());
        t.M(this.f66601b, true);
        int iN = t.n(this.f66601b);
        View viewZ0 = Z0();
        f0.n(viewZ0, "null cannot be cast to non-null type android.view.ViewGroup");
        TabLayout tabLayout = null;
        t.c(iN, (ViewGroup) viewZ0, null);
        View viewFindViewById = this.f66608i.findViewById(R.id.vp);
        f0.o(viewFindViewById, "mContentView.findViewById(R.id.vp)");
        this.N = (ViewPager2) viewFindViewById;
        View viewFindViewById2 = this.f66608i.findViewById(R.id.tab);
        f0.o(viewFindViewById2, "mContentView.findViewById(R.id.tab)");
        this.M = (TabLayout) viewFindViewById2;
        this.P = getIntent().getStringExtra(V);
        this.Q = getIntent().getStringExtra(W);
        this.f66617r.setVisibility(0);
        this.f66617r.setBackgroundColor(androidx.core.content.res.i.e(getResources(), R.color.divider_secondary_2_color, null));
        if (this.L) {
            TabLayout tabLayout2 = this.M;
            if (tabLayout2 == null) {
                f0.S("mTabLayout");
            } else {
                tabLayout = tabLayout2;
            }
            tabLayout.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = this.f66617r.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ViewUtils.f(getViewContext(), 4.0f);
            }
        }
        j2();
        o2();
    }

    @SuppressLint({"AutoDispose"})
    public final void m2(@dl.d yh.a<b2> onFinish) {
        if (PatchProxy.proxy(new Object[]{onFinish}, this, changeQuickRedirect, false, 31818, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onFinish, "onFinish");
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q9(this.P, Integer.valueOf(this.L ? 1 : 0)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(onFinish, this)));
    }

    public final void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31811, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setAction(getString(R.string.done));
        this.f66616q.setActionIcon((Drawable) null);
        this.f66616q.setActionOnClickListener(new g());
    }

    public final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31810, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setAction("管理");
        this.f66616q.setActionOnClickListener(new h());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31819, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1 && i11 == -1) {
            HashMap<Integer, Fragment> map = this.S;
            ViewPager2 viewPager2 = this.N;
            if (viewPager2 == null) {
                f0.S("mViewPager");
                viewPager2 = null;
            }
            Fragment fragment = map.get(Integer.valueOf(viewPager2.getCurrentItem()));
            f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.FavourLinkFolderFragment");
            ((FavourLinkFolderFragment) fragment).q4();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 31808, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L = ad.a.b(ad.a.E, false, 2, null);
        super.onCreate(bundle);
    }
}
