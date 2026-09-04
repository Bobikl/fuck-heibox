package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.bean.AnimationResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.z7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class DebugLottieDialogFragment extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f77591g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77592h = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z7 f77593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private n f77594f;

    /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final DebugLottieDialogFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22622, new Class[0], DebugLottieDialogFragment.class);
            return patchProxyResultProxy.isSupported ? (DebugLottieDialogFragment) patchProxyResultProxy.result : new DebugLottieDialogFragment();
        }
    }

    /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
    public static final class b implements com.max.xiaoheihe.utils.r.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: DebugLottieDialogFragment.kt */
        public static final class a extends DiffUtil.ItemCallback<AnimationResultObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public boolean a(@dl.d AnimationResultObj oldItem, @dl.d AnimationResultObj newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 22628, new Class[]{AnimationResultObj.class, AnimationResultObj.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                kotlin.jvm.internal.f0.p(oldItem, "oldItem");
                kotlin.jvm.internal.f0.p(newItem, "newItem");
                return kotlin.jvm.internal.f0.g(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(AnimationResultObj animationResultObj, AnimationResultObj animationResultObj2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animationResultObj, animationResultObj2}, this, changeQuickRedirect, false, 22630, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(animationResultObj, animationResultObj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(AnimationResultObj animationResultObj, AnimationResultObj animationResultObj2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animationResultObj, animationResultObj2}, this, changeQuickRedirect, false, 22629, new Class[]{Object.class, Object.class}, Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(animationResultObj, animationResultObj2);
            }

            public boolean b(@dl.d AnimationResultObj oldItem, @dl.d AnimationResultObj newItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 22627, new Class[]{AnimationResultObj.class, AnimationResultObj.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                kotlin.jvm.internal.f0.p(oldItem, "oldItem");
                kotlin.jvm.internal.f0.p(newItem, "newItem");
                return kotlin.jvm.internal.f0.g(oldItem, newItem);
            }
        }

        b() {
        }

        @Override // com.max.xiaoheihe.utils.r.f
        public void a(@dl.e List<AnimationResultObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 22625, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            if (list != null) {
                n nVar = DebugLottieDialogFragment.this.f77594f;
                if (nVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(nVar.m());
                    nVar.r(list);
                    com.max.hbcommon.base.adapter.d.a(nVar, arrayList, list, new a());
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    return;
                }
            }
            com.max.hbutils.utils.x.m("[onNext] 未找到缓存lottie数据");
            b2 b2Var = b2.f124493a;
        }

        @Override // com.max.xiaoheihe.utils.r.f
        public void onError(@dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22626, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.x.m("[onError] cause:\n" + th2);
        }
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 22620, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        z7 z7VarD = z7.d(inflater, viewGroup, false);
        kotlin.jvm.internal.f0.o(z7VarD, "inflate(inflater, container, false)");
        this.f77593e = z7VarD;
        if (z7VarD == null) {
            kotlin.jvm.internal.f0.S("binding");
            z7VarD = null;
        }
        ScrollView scrollViewB = z7VarD.b();
        kotlin.jvm.internal.f0.o(scrollViewB, "binding.root");
        return scrollViewB;
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 22621, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        z7 z7Var = this.f77593e;
        if (z7Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            z7Var = null;
        }
        RecyclerView recyclerView = z7Var.f118236c;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        List listE = CollectionsKt__CollectionsKt.E();
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        n nVar = new n(listE, context, new yh.l<AnimationResultObj, b2>() { // from class: com.max.xiaoheihe.module.account.DebugLottieDialogFragment$onViewCreated$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d AnimationResultObj animationResultObj) {
                if (PatchProxy.proxy(new Object[]{animationResultObj}, this, changeQuickRedirect, false, 22623, new Class[]{AnimationResultObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(animationResultObj, "animationResultObj");
                z7 z7Var2 = this.f77596b.f77593e;
                z7 z7Var3 = null;
                if (z7Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    z7Var2 = null;
                }
                AccelWorldLottieKt.a(z7Var2.f118235b, animationResultObj.getType());
                z7 z7Var4 = this.f77596b.f77593e;
                if (z7Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    z7Var4 = null;
                }
                z7Var4.f118235b.E();
                z7 z7Var5 = this.f77596b.f77593e;
                if (z7Var5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    z7Var5 = null;
                }
                z7Var5.f118238e.setText("预览: " + animationResultObj.getType() + ' ' + animationResultObj.getSource_type());
                z7 z7Var6 = this.f77596b.f77593e;
                if (z7Var6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    z7Var3 = z7Var6;
                }
                z7Var3.f118237d.setText("文件路径: " + new File(com.max.xiaoheihe.utils.r.r(animationResultObj.getType())));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(AnimationResultObj animationResultObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animationResultObj}, this, changeQuickRedirect, false, 22624, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(animationResultObj);
                return b2.f124493a;
            }
        });
        this.f77594f = nVar;
        recyclerView.setAdapter(nVar);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation());
        dividerItemDecoration.setDrawable(new ColorDrawable(androidx.core.content.d.f(recyclerView.getContext(), R.color.divider_secondary_2_color)));
        recyclerView.addItemDecoration(dividerItemDecoration);
        com.max.xiaoheihe.utils.r.n(new b());
    }
}
