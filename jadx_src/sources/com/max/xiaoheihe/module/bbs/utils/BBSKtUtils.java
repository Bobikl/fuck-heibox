package com.max.xiaoheihe.module.bbs.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.i;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.x;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.AddCollectionFolder;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.module.favour.FavourCollectionContentFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.m6;
import df.p10;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.v1;
import yh.l;

/* JADX INFO: compiled from: BBSKtUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSKtUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Companion f83254a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83255b = 0;

    /* JADX INFO: compiled from: BBSKtUtils.kt */
    @t0({"SMAP\nBBSKtUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSKtUtils.kt\ncom/max/xiaoheihe/module/bbs/utils/BBSKtUtils$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,619:1\n314#2,11:620\n262#3,2:631\n262#3,2:633\n*S KotlinDebug\n*F\n+ 1 BBSKtUtils.kt\ncom/max/xiaoheihe/module/bbs/utils/BBSKtUtils$Companion\n*L\n234#1:620,11\n408#1:631,2\n411#1:633,2\n*E\n"})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83256b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.reactivex.disposables.a f83257c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ yh.a<Boolean> f83258d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f83259e;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BBSKtUtils.kt */
            public static final class C0720a extends com.max.hbcommon.network.d<Result<Object>> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ yh.a<Boolean> f83260b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.a<b2> f83261c;

                C0720a(yh.a<Boolean> aVar, yh.a<b2> aVar2) {
                    this.f83260b = aVar;
                    this.f83261c = aVar2;
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(@dl.d Throwable e10) {
                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31124, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(e10, "e");
                    if (this.f83260b.invoke().booleanValue()) {
                        super.onError(e10);
                    }
                }

                public void onNext(@dl.d Result<Object> result) {
                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31123, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(result, "result");
                    if (this.f83260b.invoke().booleanValue()) {
                        this.f83261c.invoke();
                        if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                            return;
                        }
                        com.max.hbutils.utils.c.f(result.getMsg());
                    }
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31125, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result<Object>) obj);
                }
            }

            a(String str, io.reactivex.disposables.a aVar, yh.a<Boolean> aVar2, yh.a<b2> aVar3) {
                this.f83256b = str;
                this.f83257c = aVar;
                this.f83258d = aVar2;
                this.f83259e = aVar3;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31122, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83257c.c((C0720a) com.max.xiaoheihe.network.i.a().X6(this.f83256b, 1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0720a(this.f83258d, this.f83259e)));
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f83269b = new b();
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31126, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class c implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f83270b = new c();
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31152, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class d extends com.max.hbcommon.network.d<Result<CollectionFolders>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ yh.a<Boolean> f83310b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f83311c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ LifecycleCoroutineScope f83312d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f83313e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ yh.a<b2> f83314f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ LayoutInflater f83315g;

            d(yh.a<Boolean> aVar, Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, yh.a<b2> aVar2, LayoutInflater layoutInflater) {
                this.f83310b = aVar;
                this.f83311c = context;
                this.f83312d = lifecycleCoroutineScope;
                this.f83313e = str;
                this.f83314f = aVar2;
                this.f83315g = layoutInflater;
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31158, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f83310b.invoke().booleanValue()) {
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<CollectionFolders> result) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31159, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f83310b.invoke().booleanValue()) {
                    CollectionFolders result2 = result.getResult();
                    List<CollectionFolder> folders = result2 != null ? result2.getFolders() : null;
                    if (folders != null && !folders.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        BBSKtUtils.f83254a.i(this.f83311c, this.f83312d, this.f83310b, this.f83313e, new LinkedHashMap(), this.f83314f);
                    } else {
                        BBSKtUtils.f83254a.q(this.f83311c, this.f83315g, this.f83313e, new LinkedHashMap(), folders, "移动到收藏夹", this.f83312d, this.f83310b, this.f83314f);
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31160, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<CollectionFolders>) obj);
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class e implements com.max.hbimage.b.q {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p10 f83317b;

            e(BBSLinkObj bBSLinkObj, p10 p10Var) {
                this.f83316a = bBSLinkObj;
                this.f83317b = p10Var;
            }

            @Override // com.max.hbimage.b.q
            public void a(@dl.d Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 31166, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(drawable, "drawable");
                if (f0.g("1", this.f83316a.getThumb().getFill_type())) {
                    this.f83317b.f114386c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    this.f83317b.f114386c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                this.f83317b.f114386c.setImageDrawable(drawable);
            }

            @Override // com.max.hbimage.b.q
            public /* synthetic */ void b(Drawable drawable) {
                com.max.hbimage.d.a(this, drawable);
            }

            @Override // com.max.hbimage.b.q
            public void onLoadFailed(@dl.d Drawable drawable) {
                if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 31167, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(drawable, "drawable");
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class f implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83318b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f83319c;

            f(BBSLinkObj bBSLinkObj, Context context) {
                this.f83318b = bBSLinkObj;
                this.f83319c = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31168, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.utils.k.b(this.f83318b.getAd_report());
                if (com.max.xiaoheihe.module.bbs.utils.b.w(this.f83318b.getContent_type())) {
                    com.max.xiaoheihe.base.router.b.k0(this.f83319c, this.f83318b.getProtocol());
                } else {
                    com.max.xiaoheihe.module.bbs.utils.b.E(this.f83319c, this.f83318b);
                }
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class g implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l<Integer, b2> f83320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p10 f83321c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f83322d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f83323e;

            /* JADX WARN: Multi-variable type inference failed */
            g(l<? super Integer, b2> lVar, p10 p10Var, Context context, BBSLinkObj bBSLinkObj) {
                this.f83320b = lVar;
                this.f83321c = p10Var;
                this.f83322d = context;
                this.f83323e = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31169, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                l<Integer, b2> lVar = this.f83320b;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(this.f83321c.f114396m.getId()));
                }
                if (i0.e(this.f83322d)) {
                    String str = f0.g("1", this.f83323e.getIs_award_link()) ? "0" : "1";
                    com.max.xiaoheihe.module.bbs.utils.b.b(this.f83323e, str);
                    this.f83323e.setIs_award_link(str);
                    this.f83323e.setLink_award_num(String.valueOf(f0.g("1", str) ? n.q(this.f83323e.getLink_award_num()) + 1 : (int) Math.max(0.0d, n.q(this.f83323e.getLink_award_num()) - 1)));
                    this.f83321c.f114391h.setText(this.f83323e.getLink_award_num());
                    if (f0.g("1", this.f83323e.getIs_award_link())) {
                        this.f83321c.f114391h.setTextColor(this.f83322d.getResources().getColor(R.color.text_primary_1_color));
                        this.f83321c.f114388e.setChecked(true, true);
                    } else {
                        this.f83321c.f114391h.setTextColor(this.f83322d.getResources().getColor(R.color.text_secondary_2_color));
                        this.f83321c.f114388e.setChecked(false);
                    }
                }
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class h extends s<CollectionFolder> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p<CollectionFolder> f83324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f83325c;

            /* JADX INFO: compiled from: BBSKtUtils.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ p<CollectionFolder> f83326b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CollectionFolder f83327c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.max.hbcommon.component.i f83328d;

                /* JADX WARN: Multi-variable type inference failed */
                a(p<? super CollectionFolder> pVar, CollectionFolder collectionFolder, com.max.hbcommon.component.i iVar) {
                    this.f83326b = pVar;
                    this.f83327c = collectionFolder;
                    this.f83328d = iVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31188, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (this.f83326b.isActive()) {
                        p<CollectionFolder> pVar = this.f83326b;
                        kotlin.Result.a aVar = kotlin.Result.f124476c;
                        pVar.resumeWith(kotlin.Result.b(this.f83327c));
                    }
                    this.f83328d.dismiss();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            h(Context context, List<CollectionFolder> list, p<? super CollectionFolder> pVar, com.max.hbcommon.component.i iVar) {
                super(context, list, R.layout.item_collection_folder);
                this.f83324b = pVar;
                this.f83325c = iVar;
            }

            public void m(@dl.d s.e viewHolder, @dl.d CollectionFolder data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 31186, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
                textView.setText(data.getName());
                textView.setOnClickListener(new a(this.f83324b, data, this.f83325c));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
                if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31187, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, collectionFolder);
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class i implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f83329b;

            i(com.max.hbcommon.component.i iVar) {
                this.f83329b = iVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31189, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83329b.dismiss();
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class j implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f83330b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f83331c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ LifecycleCoroutineScope f83332d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ yh.a<Boolean> f83333e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f83334f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f83335g;

            j(com.max.hbcommon.component.i iVar, Context context, LifecycleCoroutineScope lifecycleCoroutineScope, yh.a<Boolean> aVar, String str, Map<String, String> map) {
                this.f83330b = iVar;
                this.f83331c = context;
                this.f83332d = lifecycleCoroutineScope;
                this.f83333e = aVar;
                this.f83334f = str;
                this.f83335g = map;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31190, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83330b.dismiss();
                Companion.j(BBSKtUtils.f83254a, this.f83331c, this.f83332d, this.f83333e, this.f83334f, this.f83335g, null, 32, null);
            }
        }

        /* JADX INFO: compiled from: BBSKtUtils.kt */
        public static final class k implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f83336b;

            k(com.max.hbcommon.component.i iVar) {
                this.f83336b = iVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31202, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f83336b.dismiss();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static final /* synthetic */ Object a(Companion companion, String str, String str2, Map map, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, str, str2, map, cVar}, null, changeQuickRedirect, true, 31114, new Class[]{Companion.class, String.class, String.class, Map.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : companion.f(str, str2, map, cVar);
        }

        public static final /* synthetic */ Object b(Companion companion, String str, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, str, cVar}, null, changeQuickRedirect, true, 31115, new Class[]{Companion.class, String.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : companion.k(str, cVar);
        }

        public static final /* synthetic */ Object c(Companion companion, String str, String str2, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, str, str2, cVar}, null, changeQuickRedirect, true, 31116, new Class[]{Companion.class, String.class, String.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : companion.m(str, str2, cVar);
        }

        public static final /* synthetic */ Object d(Companion companion, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, cVar}, null, changeQuickRedirect, true, 31112, new Class[]{Companion.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : companion.o(cVar);
        }

        public static final /* synthetic */ Object e(Companion companion, Context context, List list, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{companion, context, list, cVar}, null, changeQuickRedirect, true, 31113, new Class[]{Companion.class, Context.class, List.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : companion.p(context, list, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0047  */
        private final Object f(String str, String str2, Map<String, String> map, kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
            BBSKtUtils$Companion$addToCollectionFolder$1 bBSKtUtils$Companion$addToCollectionFolder$1;
            boolean z10 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, map, cVar}, this, changeQuickRedirect, false, 31106, new Class[]{String.class, String.class, Map.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof BBSKtUtils$Companion$addToCollectionFolder$1) {
                bBSKtUtils$Companion$addToCollectionFolder$1 = (BBSKtUtils$Companion$addToCollectionFolder$1) cVar;
                int i10 = bBSKtUtils$Companion$addToCollectionFolder$1.f83264d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bBSKtUtils$Companion$addToCollectionFolder$1.f83264d = i10 - Integer.MIN_VALUE;
                } else {
                    bBSKtUtils$Companion$addToCollectionFolder$1 = new BBSKtUtils$Companion$addToCollectionFolder$1(this, cVar);
                }
            } else {
                bBSKtUtils$Companion$addToCollectionFolder$1 = new BBSKtUtils$Companion$addToCollectionFolder$1(this, cVar);
            }
            Object objH = bBSKtUtils$Companion$addToCollectionFolder$1.f83262b;
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            int i11 = bBSKtUtils$Companion$addToCollectionFolder$1.f83264d;
            try {
                if (i11 == 0) {
                    kotlin.t0.n(objH);
                    CoroutineDispatcher coroutineDispatcherC = e1.c();
                    BBSKtUtils$Companion$addToCollectionFolder$r$1 bBSKtUtils$Companion$addToCollectionFolder$r$1 = new BBSKtUtils$Companion$addToCollectionFolder$r$1(str, str2, map, null);
                    bBSKtUtils$Companion$addToCollectionFolder$1.f83264d = 1;
                    objH = kotlinx.coroutines.i.h(coroutineDispatcherC, bBSKtUtils$Companion$addToCollectionFolder$r$1, bBSKtUtils$Companion$addToCollectionFolder$1);
                    if (objH == objH2) {
                        return objH2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(objH);
                }
                z10 = true;
            } catch (Exception unused) {
            }
            return kotlin.coroutines.jvm.internal.a.a(z10);
        }

        public static /* synthetic */ void j(Companion companion, Context context, LifecycleCoroutineScope lifecycleCoroutineScope, yh.a aVar, String str, Map map, yh.a aVar2, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{companion, context, lifecycleCoroutineScope, aVar, str, map, aVar2, new Integer(i10), obj}, null, changeQuickRedirect, true, 31101, new Class[]{Companion.class, Context.class, LifecycleCoroutineScope.class, yh.a.class, String.class, Map.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            companion.i(context, lifecycleCoroutineScope, aVar, str, map, (i10 & 32) != 0 ? null : aVar2);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039  */
        private final Object k(String str, kotlin.coroutines.c<? super CollectionFolder> cVar) throws Throwable {
            BBSKtUtils$Companion$createNewFavFolder$1 bBSKtUtils$Companion$createNewFavFolder$1;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, this, changeQuickRedirect, false, 31108, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof BBSKtUtils$Companion$createNewFavFolder$1) {
                bBSKtUtils$Companion$createNewFavFolder$1 = (BBSKtUtils$Companion$createNewFavFolder$1) cVar;
                int i10 = bBSKtUtils$Companion$createNewFavFolder$1.f83307d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bBSKtUtils$Companion$createNewFavFolder$1.f83307d = i10 - Integer.MIN_VALUE;
                } else {
                    bBSKtUtils$Companion$createNewFavFolder$1 = new BBSKtUtils$Companion$createNewFavFolder$1(this, cVar);
                }
            } else {
                bBSKtUtils$Companion$createNewFavFolder$1 = new BBSKtUtils$Companion$createNewFavFolder$1(this, cVar);
            }
            Object objH = bBSKtUtils$Companion$createNewFavFolder$1.f83305b;
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            int i11 = bBSKtUtils$Companion$createNewFavFolder$1.f83307d;
            try {
                if (i11 == 0) {
                    kotlin.t0.n(objH);
                    CoroutineDispatcher coroutineDispatcherC = e1.c();
                    BBSKtUtils$Companion$createNewFavFolder$r$1 bBSKtUtils$Companion$createNewFavFolder$r$1 = new BBSKtUtils$Companion$createNewFavFolder$r$1(str, null);
                    bBSKtUtils$Companion$createNewFavFolder$1.f83307d = 1;
                    objH = kotlinx.coroutines.i.h(coroutineDispatcherC, bBSKtUtils$Companion$createNewFavFolder$r$1, bBSKtUtils$Companion$createNewFavFolder$1);
                    if (objH == objH2) {
                        return objH2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(objH);
                }
                return ((AddCollectionFolder) ((Result) objH).getResult()).getFolder();
            } catch (Exception e10) {
                com.max.heybox.hblog.g.f74531b.M("BBSKtUtils, createNewFavFolder Exception " + e10.getMessage());
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003e  */
        private final Object m(String str, String str2, kotlin.coroutines.c<? super Boolean> cVar) throws Throwable {
            BBSKtUtils$Companion$moveToCollectionFolder$1 bBSKtUtils$Companion$moveToCollectionFolder$1;
            boolean z10 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cVar}, this, changeQuickRedirect, false, 31107, new Class[]{String.class, String.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof BBSKtUtils$Companion$moveToCollectionFolder$1) {
                bBSKtUtils$Companion$moveToCollectionFolder$1 = (BBSKtUtils$Companion$moveToCollectionFolder$1) cVar;
                int i10 = bBSKtUtils$Companion$moveToCollectionFolder$1.f83339d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bBSKtUtils$Companion$moveToCollectionFolder$1.f83339d = i10 - Integer.MIN_VALUE;
                } else {
                    bBSKtUtils$Companion$moveToCollectionFolder$1 = new BBSKtUtils$Companion$moveToCollectionFolder$1(this, cVar);
                }
            } else {
                bBSKtUtils$Companion$moveToCollectionFolder$1 = new BBSKtUtils$Companion$moveToCollectionFolder$1(this, cVar);
            }
            Object objH = bBSKtUtils$Companion$moveToCollectionFolder$1.f83337b;
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            int i11 = bBSKtUtils$Companion$moveToCollectionFolder$1.f83339d;
            try {
                if (i11 == 0) {
                    kotlin.t0.n(objH);
                    CoroutineDispatcher coroutineDispatcherC = e1.c();
                    BBSKtUtils$Companion$moveToCollectionFolder$r$1 bBSKtUtils$Companion$moveToCollectionFolder$r$1 = new BBSKtUtils$Companion$moveToCollectionFolder$r$1(str, str2, null);
                    bBSKtUtils$Companion$moveToCollectionFolder$1.f83339d = 1;
                    objH = kotlinx.coroutines.i.h(coroutineDispatcherC, bBSKtUtils$Companion$moveToCollectionFolder$r$1, bBSKtUtils$Companion$moveToCollectionFolder$1);
                    if (objH == objH2) {
                        return objH2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(objH);
                }
                z10 = true;
            } catch (Exception unused) {
            }
            return kotlin.coroutines.jvm.internal.a.a(z10);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        private final Object o(kotlin.coroutines.c<? super List<CollectionFolder>> cVar) throws Throwable {
            BBSKtUtils$Companion$requestCollectionFolders$1 bBSKtUtils$Companion$requestCollectionFolders$1;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 31104, new Class[]{kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (cVar instanceof BBSKtUtils$Companion$requestCollectionFolders$1) {
                bBSKtUtils$Companion$requestCollectionFolders$1 = (BBSKtUtils$Companion$requestCollectionFolders$1) cVar;
                int i10 = bBSKtUtils$Companion$requestCollectionFolders$1.f83345d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bBSKtUtils$Companion$requestCollectionFolders$1.f83345d = i10 - Integer.MIN_VALUE;
                } else {
                    bBSKtUtils$Companion$requestCollectionFolders$1 = new BBSKtUtils$Companion$requestCollectionFolders$1(this, cVar);
                }
            } else {
                bBSKtUtils$Companion$requestCollectionFolders$1 = new BBSKtUtils$Companion$requestCollectionFolders$1(this, cVar);
            }
            Object objH = bBSKtUtils$Companion$requestCollectionFolders$1.f83343b;
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            int i11 = bBSKtUtils$Companion$requestCollectionFolders$1.f83345d;
            try {
                if (i11 == 0) {
                    kotlin.t0.n(objH);
                    CoroutineDispatcher coroutineDispatcherC = e1.c();
                    BBSKtUtils$Companion$requestCollectionFolders$result$1 bBSKtUtils$Companion$requestCollectionFolders$result$1 = new BBSKtUtils$Companion$requestCollectionFolders$result$1(null);
                    bBSKtUtils$Companion$requestCollectionFolders$1.f83345d = 1;
                    objH = kotlinx.coroutines.i.h(coroutineDispatcherC, bBSKtUtils$Companion$requestCollectionFolders$result$1, bBSKtUtils$Companion$requestCollectionFolders$1);
                    if (objH == objH2) {
                        return objH2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(objH);
                }
                List<CollectionFolder> folders = ((CollectionFolders) ((Result) objH).getResult()).getFolders();
                return folders == null ? new ArrayList() : folders;
            } catch (Exception unused) {
                return new ArrayList();
            }
        }

        private final Object p(final Context context, List<CollectionFolder> list, kotlin.coroutines.c<? super CollectionFolder> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, list, cVar}, this, changeQuickRedirect, false, 31105, new Class[]{Context.class, List.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            final q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar.F0();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_select_collection, (ViewGroup) null, false);
            final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(context, true, viewInflate);
            View viewFindViewById = viewInflate.findViewById(R.id.bb_cancel);
            f0.o(viewFindViewById, "mContentView.findViewById(R.id.bb_cancel)");
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            View viewFindViewById2 = viewInflate.findViewById(R.id.v_blank);
            View viewFindViewById3 = viewInflate.findViewById(R.id.rv_choices);
            f0.o(viewFindViewById3, "mContentView.findViewById(R.id.rv_choices)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_action);
            textView.setText("收藏内容");
            h hVar = new h(context, list, qVar, iVar);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(hVar);
            i iVar2 = new i(iVar);
            Drawable drawable = context.getResources().getDrawable(R.drawable.ic_0icon_action_add_dark_20);
            drawable.setBounds(0, 0, ViewUtils.f(context, 20.0f), ViewUtils.f(context, 20.0f));
            textView2.setCompoundDrawablePadding(ViewUtils.f(context, 4.0f));
            textView2.setText("创建收藏夹");
            textView2.setCompoundDrawables(drawable, null, null, null);
            Object parent = textView2.getParent();
            f0.n(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$selectCollectionFolder$2$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: compiled from: BBSKtUtils.kt */
                public static final class a implements DialogInterface.OnClickListener {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final a f83350b = new a();
                    public static ChangeQuickRedirect changeQuickRedirect;

                    a() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31185, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31175, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    final EditText editTextI = b.i(context);
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(context);
                    final p<CollectionFolder> pVar = qVar;
                    final i iVar3 = iVar;
                    com.max.hbcommon.view.a aVarD = fVar.t(R.string.create, new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BBSKtUtils.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1", f = "BBSKtUtils.kt", i = {}, l = {bb.c.b.D2, bb.c.b.J2}, m = "invokeSuspend", n = {}, s = {})
                        public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            int f83354b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ EditText f83355c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            final /* synthetic */ p<CollectionFolder> f83356d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            final /* synthetic */ i f83357e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(EditText editText, p<? super CollectionFolder> pVar, i iVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.f83355c = editText;
                                this.f83356d = pVar;
                                this.f83357e = iVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.d
                            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31178, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f83355c, this.f83356d, this.f83357e, cVar);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31180, new Class[]{Object.class, Object.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                            }

                            @dl.e
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31179, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.e
                            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31177, new Class[]{Object.class}, Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                Object objH = kotlin.coroutines.intrinsics.b.h();
                                int i10 = this.f83354b;
                                if (i10 != 0) {
                                    if (i10 == 1) {
                                        kotlin.t0.n(obj);
                                    } else {
                                        if (i10 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.t0.n(obj);
                                    }
                                    return b2.f124493a;
                                }
                                kotlin.t0.n(obj);
                                BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                                String string = this.f83355c.getText().toString();
                                this.f83354b = 1;
                                obj = BBSKtUtils.Companion.b(companion, string, this);
                                if (obj == objH) {
                                    return objH;
                                }
                                CollectionFolder collectionFolder = (CollectionFolder) obj;
                                g.f74531b.M("BBSKtUtils, createNewFavFolder data " + collectionFolder);
                                if (collectionFolder != null) {
                                    p<CollectionFolder> pVar = this.f83356d;
                                    i iVar = this.f83357e;
                                    if (pVar.isActive()) {
                                        kotlin.Result.a aVar = kotlin.Result.f124476c;
                                        pVar.resumeWith(kotlin.Result.b(collectionFolder));
                                    }
                                    n2 n2VarE = e1.e();
                                    BBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1$1$1 bBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1$1$1 = new BBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1$1$1(iVar, null);
                                    this.f83354b = 2;
                                    if (kotlinx.coroutines.i.h(n2VarE, bBSKtUtils$Companion$selectCollectionFolder$2$1$createFolderDialog$1$1$1$1, this) == objH) {
                                        return objH;
                                    }
                                }
                                return b2.f124493a;
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31176, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                                return;
                            }
                            String string = editTextI.getText().toString();
                            Charset charsetDefaultCharset = Charset.defaultCharset();
                            f0.o(charsetDefaultCharset, "defaultCharset()");
                            byte[] bytes = string.getBytes(charsetDefaultCharset);
                            f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                            if (bytes.length > 24) {
                                com.max.hbutils.utils.c.f("最多输入8个字");
                            } else {
                                dialogInterface.dismiss();
                                k.f(v1.f130503b, null, null, new AnonymousClass1(editTextI, pVar, iVar3, null), 3, null);
                            }
                        }
                    }).n(R.string.cancel, a.f83350b).i(editTextI).y("创建收藏夹").d();
                    f0.o(aVarD, "continuation ->\n        …                .create()");
                    aVarD.show();
                }
            });
            ((BottomButtonLeftItemView) viewFindViewById).setRightClickListener(iVar2);
            viewFindViewById2.setOnClickListener(iVar2);
            iVar.show();
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT;
        }

        public static /* synthetic */ void r(Companion companion, Context context, LayoutInflater layoutInflater, String str, Map map, List list, String str2, LifecycleCoroutineScope lifecycleCoroutineScope, yh.a aVar, yh.a aVar2, int i10, Object obj) {
            if (PatchProxy.proxy(new Object[]{companion, context, layoutInflater, str, map, list, str2, lifecycleCoroutineScope, aVar, aVar2, new Integer(i10), obj}, null, changeQuickRedirect, true, 31103, new Class[]{Companion.class, Context.class, LayoutInflater.class, String.class, Map.class, List.class, String.class, LifecycleCoroutineScope.class, yh.a.class, yh.a.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            companion.q(context, layoutInflater, str, map, list, (i10 & 32) != 0 ? null : str2, lifecycleCoroutineScope, aVar, (i10 & 256) != 0 ? null : aVar2);
        }

        public final void g(@dl.d Context context, @dl.d io.reactivex.disposables.a compositeDisposable, @dl.e String str, @dl.d String titleText, @dl.d String msgText, @dl.d yh.a<Boolean> isActiveChecker, @dl.d yh.a<b2> onFinish) {
            if (PatchProxy.proxy(new Object[]{context, compositeDisposable, str, titleText, msgText, isActiveChecker, onFinish}, this, changeQuickRedirect, false, 31111, new Class[]{Context.class, io.reactivex.disposables.a.class, String.class, String.class, String.class, yh.a.class, yh.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(compositeDisposable, "compositeDisposable");
            f0.p(titleText, "titleText");
            f0.p(msgText, "msgText");
            f0.p(isActiveChecker, "isActiveChecker");
            f0.p(onFinish, "onFinish");
            new com.max.hbcommon.view.a.f(context).y(titleText).l(msgText).v(true).u("确认清理", new a(str, compositeDisposable, isActiveChecker, onFinish)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), b.f83269b).w(true).F();
        }

        public final void h(@dl.d Context context, @dl.d String linkId, @dl.d Map<String, String> params, @dl.d y lifecycleOwner, @dl.d l<? super Boolean, b2> callback) {
            if (PatchProxy.proxy(new Object[]{context, linkId, params, lifecycleOwner, callback}, this, changeQuickRedirect, false, 31099, new Class[]{Context.class, String.class, Map.class, y.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(linkId, "linkId");
            f0.p(params, "params");
            f0.p(lifecycleOwner, "lifecycleOwner");
            f0.p(callback, "callback");
            kotlinx.coroutines.k.f(z.a(lifecycleOwner), e1.c(), null, new BBSKtUtils$Companion$collectionLink$1(context, linkId, params, callback, null), 2, null);
        }

        public final void i(@dl.d final Context context, @dl.d final LifecycleCoroutineScope lifecycleScope, @dl.d final yh.a<Boolean> isActiveChecker, @dl.e final String str, @dl.d Map<String, String> params, @dl.e final yh.a<b2> aVar) {
            if (PatchProxy.proxy(new Object[]{context, lifecycleScope, isActiveChecker, str, params, aVar}, this, changeQuickRedirect, false, 31100, new Class[]{Context.class, LifecycleCoroutineScope.class, yh.a.class, String.class, Map.class, yh.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(lifecycleScope, "lifecycleScope");
            f0.p(isActiveChecker, "isActiveChecker");
            f0.p(params, "params");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", str);
            com.max.hbcommon.analytics.d.d("3", lb.d.f131268v0, null, jsonObject);
            final EditText editTextI = com.max.xiaoheihe.module.bbs.utils.b.i(context);
            com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(context).u("新建", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: BBSKtUtils.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1", f = "BBSKtUtils.kt", i = {3}, l = {108, 110, 118, 124, 138}, m = "invokeSuspend", n = {Progress.D}, s = {"L$0"})
                public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f83289b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f83290c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ EditText f83291d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ yh.a<Boolean> f83292e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ String f83293f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Context f83294g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ DialogInterface f83295h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    final /* synthetic */ yh.a<b2> f83296i;

                    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: BBSKtUtils.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$1", f = "BBSKtUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C07211 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f83297b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ DialogInterface f83298c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C07211(DialogInterface dialogInterface, kotlin.coroutines.c<? super C07211> cVar) {
                            super(2, cVar);
                            this.f83298c = dialogInterface;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31141, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07211(this.f83298c, cVar);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31143, new Class[]{Object.class, Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                        }

                        @dl.e
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31142, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07211) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31140, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.f83297b != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                            this.f83298c.dismiss();
                            return b2.f124493a;
                        }
                    }

                    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: BBSKtUtils.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$2", f = "BBSKtUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f83299b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ yh.a<b2> f83300c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final /* synthetic */ DialogInterface f83301d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(yh.a<b2> aVar, DialogInterface dialogInterface, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                            super(2, cVar);
                            this.f83300c = aVar;
                            this.f83301d = dialogInterface;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31145, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f83300c, this.f83301d, cVar);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31147, new Class[]{Object.class, Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                        }

                        @dl.e
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31146, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31144, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.f83299b != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                            yh.a<b2> aVar = this.f83300c;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                            this.f83301d.dismiss();
                            return b2.f124493a;
                        }
                    }

                    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$3, reason: invalid class name */
                    /* JADX INFO: compiled from: BBSKtUtils.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$createNewCollectFolder$createFolderDialog$1$1$3", f = "BBSKtUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class AnonymousClass3 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f83302b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ yh.a<b2> f83303c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final /* synthetic */ DialogInterface f83304d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(yh.a<b2> aVar, DialogInterface dialogInterface, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                            super(2, cVar);
                            this.f83303c = aVar;
                            this.f83304d = dialogInterface;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.d
                        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31149, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(this.f83303c, this.f83304d, cVar);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31151, new Class[]{Object.class, Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                        }

                        @dl.e
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31150, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31148, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.f83302b != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                            yh.a<b2> aVar = this.f83303c;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                            this.f83304d.dismiss();
                            return b2.f124493a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EditText editText, yh.a<Boolean> aVar, String str, Context context, DialogInterface dialogInterface, yh.a<b2> aVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.f83291d = editText;
                        this.f83292e = aVar;
                        this.f83293f = str;
                        this.f83294g = context;
                        this.f83295h = dialogInterface;
                        this.f83296i = aVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31137, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f83291d, this.f83292e, this.f83293f, this.f83294g, this.f83295h, this.f83296i, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31139, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31138, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
                    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0132 A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        CollectionFolder collectionFolder;
                        n2 n2VarE;
                        AnonymousClass3 anonymousClass3;
                        String id2;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31136, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i10 = this.f83290c;
                        if (i10 == 0) {
                            kotlin.t0.n(obj);
                            BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                            String string = this.f83291d.getText().toString();
                            this.f83290c = 1;
                            obj = BBSKtUtils.Companion.b(companion, string, this);
                            if (obj == objH) {
                                return objH;
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    kotlin.t0.n(obj);
                                    return b2.f124493a;
                                }
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        collectionFolder = (CollectionFolder) this.f83289b;
                                        kotlin.t0.n(obj);
                                        if (((Boolean) obj).booleanValue() && this.f83292e.invoke().booleanValue()) {
                                            x.p("加入收藏夹成功");
                                            JsonObject jsonObject = new JsonObject();
                                            jsonObject.addProperty("link_id", this.f83293f);
                                            if (collectionFolder != null) {
                                                id2 = collectionFolder.getId();
                                            } else {
                                                id2 = null;
                                            }
                                            jsonObject.addProperty(FavourCollectionContentFragment.f83664o, id2);
                                            com.max.hbcommon.analytics.d.d("1", lb.d.f131275w0, null, jsonObject);
                                        }
                                        n2VarE = e1.e();
                                        anonymousClass3 = new AnonymousClass3(this.f83296i, this.f83295h, null);
                                        this.f83289b = null;
                                        this.f83290c = 5;
                                        if (kotlinx.coroutines.i.h(n2VarE, anonymousClass3, this) == objH) {
                                            return objH;
                                        }
                                        return b2.f124493a;
                                    }
                                    if (i10 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                                kotlin.t0.n(obj);
                                return b2.f124493a;
                            }
                            kotlin.t0.n(obj);
                        }
                        collectionFolder = (CollectionFolder) obj;
                        if (!this.f83292e.invoke().booleanValue()) {
                            n2 n2VarE2 = e1.e();
                            C07211 c07211 = new C07211(this.f83295h, null);
                            this.f83290c = 2;
                            if (kotlinx.coroutines.i.h(n2VarE2, c07211, this) == objH) {
                                return objH;
                            }
                            return b2.f124493a;
                        }
                        if (this.f83293f != null) {
                            BBSKtUtils.Companion companion2 = BBSKtUtils.f83254a;
                            String id3 = collectionFolder != null ? collectionFolder.getId() : null;
                            String str = this.f83293f;
                            this.f83289b = collectionFolder;
                            this.f83290c = 4;
                            obj = BBSKtUtils.Companion.c(companion2, id3, str, this);
                            if (obj == objH) {
                                return objH;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                x.p("加入收藏夹成功");
                                JsonObject jsonObject2 = new JsonObject();
                                jsonObject2.addProperty("link_id", this.f83293f);
                                if (collectionFolder != null) {
                                    id2 = collectionFolder.getId();
                                } else {
                                    id2 = null;
                                }
                                jsonObject2.addProperty(FavourCollectionContentFragment.f83664o, id2);
                                com.max.hbcommon.analytics.d.d("1", lb.d.f131275w0, null, jsonObject2);
                            }
                            n2VarE = e1.e();
                            anonymousClass3 = new AnonymousClass3(this.f83296i, this.f83295h, null);
                            this.f83289b = null;
                            this.f83290c = 5;
                            if (kotlinx.coroutines.i.h(n2VarE, anonymousClass3, this) == objH) {
                                return objH;
                            }
                        } else if (this.f83292e.invoke().booleanValue()) {
                            x.p(this.f83294g.getString(R.string.success));
                            n2 n2VarE3 = e1.e();
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f83296i, this.f83295h, null);
                            this.f83290c = 3;
                            if (kotlinx.coroutines.i.h(n2VarE3, anonymousClass2, this) == objH) {
                                return objH;
                            }
                        }
                        return b2.f124493a;
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    String string;
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31135, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    Editable text = editTextI.getText();
                    if (text == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    Charset charsetDefaultCharset = Charset.defaultCharset();
                    f0.o(charsetDefaultCharset, "defaultCharset()");
                    byte[] bytes = string.getBytes(charsetDefaultCharset);
                    f0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    if (bytes.length > 24) {
                        com.max.hbutils.utils.c.f("最多输入8个字");
                    } else {
                        k.f(lifecycleScope, null, null, new AnonymousClass1(editTextI, isActiveChecker, str, context, dialogInterface, aVar, null), 3, null);
                    }
                }
            }).n(R.string.cancel, c.f83270b).i(editTextI).y("新建收藏夹").w(true).d();
            f0.o(aVarD, "context: Context,\n      …                .create()");
            aVarD.show();
        }

        @dl.d
        public final io.reactivex.disposables.b l(@dl.d Context context, @dl.d LayoutInflater inflater, @dl.d LifecycleCoroutineScope lifecycleScope, @dl.d String linkId, @dl.d yh.a<Boolean> isActiveChecker, @dl.d yh.a<b2> onFinish) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, inflater, lifecycleScope, linkId, isActiveChecker, onFinish}, this, changeQuickRedirect, false, 31110, new Class[]{Context.class, LayoutInflater.class, LifecycleCoroutineScope.class, String.class, yh.a.class, yh.a.class}, io.reactivex.disposables.b.class);
            if (patchProxyResultProxy.isSupported) {
                return (io.reactivex.disposables.b) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(inflater, "inflater");
            f0.p(lifecycleScope, "lifecycleScope");
            f0.p(linkId, "linkId");
            f0.p(isActiveChecker, "isActiveChecker");
            f0.p(onFinish, "onFinish");
            d disposable = (d) com.max.xiaoheihe.network.i.a().v(1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(isActiveChecker, context, lifecycleScope, linkId, onFinish, inflater));
            f0.o(disposable, "disposable");
            return disposable;
        }

        public final void n(@dl.d Context context, @dl.d BBSLinkObj bbsLinkObj, @dl.d BBSUserInfoObj user, @dl.d s.e viewHolder, @dl.e View.OnLongClickListener onLongClickListener, @dl.e l<? super Integer, b2> lVar) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{context, bbsLinkObj, user, viewHolder, onLongClickListener, lVar}, this, changeQuickRedirect, false, 31109, new Class[]{Context.class, BBSLinkObj.class, BBSUserInfoObj.class, s.e.class, View.OnLongClickListener.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(bbsLinkObj, "bbsLinkObj");
            f0.p(user, "user");
            f0.p(viewHolder, "viewHolder");
            p10 p10VarA = p10.a(viewHolder.itemView);
            f0.o(p10VarA, "bind(viewHolder.itemView)");
            if (bbsLinkObj.getThumb() != null) {
                p10VarA.f114395l.setVisibility(0);
                com.max.xiaoheihe.module.bbs.utils.b.W(context, p10VarA.f114386c, bbsLinkObj.getThumb(), 33);
                int i10 = p10VarA.f114386c.getLayoutParams().width;
                int i11 = p10VarA.f114386c.getLayoutParams().height;
                p10VarA.f114386c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                p10VarA.f114386c.setImageDrawable(com.max.hbutils.utils.q.l(context, i10, i11, i10));
                com.max.hbimage.b.X(context, p10VarA.f114386c, bbsLinkObj.getThumb().getUrl(), new e(bbsLinkObj, p10VarA));
                if (f0.g("1", bbsLinkObj.getHas_video())) {
                    p10VarA.f114397n.setVisibility(0);
                    p10VarA.f114397n.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha40, 2.0f));
                } else {
                    p10VarA.f114397n.setVisibility(8);
                }
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                p10VarA.f114395l.setVisibility(8);
                p10VarA.f114397n.setVisibility(8);
            }
            if (f0.g("1", bbsLinkObj.getFollow_status()) || f0.g("3", bbsLinkObj.getFollow_status())) {
                LinearLayout linearLayout = p10VarA.f114398o;
                f0.o(linearLayout, "viewBinding.vgYourFollow");
                linearLayout.setVisibility(0);
                p10VarA.f114387d.setImageResource(R.drawable.common_me_green);
            } else {
                LinearLayout linearLayout2 = p10VarA.f114398o;
                f0.o(linearLayout2, "viewBinding.vgYourFollow");
                linearLayout2.setVisibility(8);
            }
            com.max.hbimage.b.I(user.getAvartar(), p10VarA.f114385b, R.drawable.common_default_avatar_40x40);
            p10VarA.f114392i.setText(user.getUsername());
            if (com.max.xiaoheihe.module.bbs.utils.b.w(bbsLinkObj.getContent_type())) {
                p10VarA.f114388e.setVisibility(8);
                p10VarA.f114391h.setText(!com.max.hbcommon.utils.c.u(bbsLinkObj.getContent_extra_desc()) ? bbsLinkObj.getContent_extra_desc() : "推广");
                p10VarA.f114391h.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
                p10VarA.f114396m.setOnClickListener(null);
            } else {
                p10VarA.f114388e.setVisibility(0);
                p10VarA.f114391h.setText(String.valueOf(n.q(bbsLinkObj.getLink_award_num())));
                if (f0.g("1", bbsLinkObj.getIs_award_link())) {
                    p10VarA.f114388e.setChecked(true);
                    p10VarA.f114391h.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                } else {
                    p10VarA.f114388e.setChecked(false);
                    p10VarA.f114391h.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
                }
                p10VarA.f114396m.setOnClickListener(new g(lVar, p10VarA, context, bbsLinkObj));
            }
            p10VarA.f114393j.setClickableAt(false);
            p10VarA.f114393j.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            p10VarA.f114390g.setClickableAt(false);
            if (!com.max.hbcommon.utils.c.u(bbsLinkObj.getTitle())) {
                p10VarA.f114393j.setVisibility(0);
                p10VarA.f114393j.setText(bbsLinkObj.getTitle());
                if (com.max.hbcommon.utils.c.u(bbsLinkObj.getDescription()) || bbsLinkObj.getThumb() != null) {
                    p10VarA.f114390g.setVisibility(8);
                } else {
                    p10VarA.f114390g.setVisibility(0);
                    p10VarA.f114390g.setText(bbsLinkObj.getDescription());
                }
            } else if (com.max.hbcommon.utils.c.u(bbsLinkObj.getDescription())) {
                p10VarA.f114393j.setVisibility(8);
                p10VarA.f114390g.setVisibility(8);
            } else {
                p10VarA.f114393j.setVisibility(0);
                p10VarA.f114393j.setText(bbsLinkObj.getDescription());
                p10VarA.f114390g.setVisibility(8);
            }
            if (bbsLinkObj.getAd_report() != null && !f0.g("1", bbsLinkObj.getIsReported())) {
                com.max.hbcommon.utils.k.c(bbsLinkObj.getAd_report());
                bbsLinkObj.setIsReported("1");
            }
            viewHolder.itemView.setTag(bbsLinkObj);
            viewHolder.itemView.setOnClickListener(new f(bbsLinkObj, context));
            if (com.max.hbcommon.utils.c.w(bbsLinkObj.getFeedback())) {
                viewHolder.itemView.setOnLongClickListener(null);
            } else {
                viewHolder.itemView.setOnLongClickListener(onLongClickListener);
            }
        }

        public final void q(@dl.d final Context context, @dl.d LayoutInflater inflater, @dl.d final String linkID, @dl.d Map<String, String> params, @dl.d final List<CollectionFolder> folders, @dl.e String str, @dl.d final LifecycleCoroutineScope lifecycleScope, @dl.d final yh.a<Boolean> isActiveChecker, @dl.e final yh.a<b2> aVar) {
            if (PatchProxy.proxy(new Object[]{context, inflater, linkID, params, folders, str, lifecycleScope, isActiveChecker, aVar}, this, changeQuickRedirect, false, 31102, new Class[]{Context.class, LayoutInflater.class, String.class, Map.class, List.class, String.class, LifecycleCoroutineScope.class, yh.a.class, yh.a.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(inflater, "inflater");
            f0.p(linkID, "linkID");
            f0.p(params, "params");
            f0.p(folders, "folders");
            f0.p(lifecycleScope, "lifecycleScope");
            f0.p(isActiveChecker, "isActiveChecker");
            m6 m6VarC = m6.c(inflater);
            f0.o(m6VarC, "inflate(inflater)");
            final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(context, true, (View) m6VarC.b());
            k kVar = new k(iVar);
            m6VarC.f113300e.setOnClickListener(kVar);
            if (!(str == null || kotlin.text.u.V1(str))) {
                m6VarC.f113299d.setText(str);
            }
            BottomButtonLeftItemView bottomButtonLeftItemView = m6VarC.f113297b;
            bottomButtonLeftItemView.setLeftClickListener(kVar);
            bottomButtonLeftItemView.setRightClickListener(new j(iVar, context, lifecycleScope, isActiveChecker, linkID, params));
            s<CollectionFolder> sVar = new s<CollectionFolder>(context, folders) { // from class: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1
                public static ChangeQuickRedirect changeQuickRedirect;

                public void m(@dl.d s.e viewHolder, @dl.d final CollectionFolder data) {
                    if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 31191, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(viewHolder, "viewHolder");
                    f0.p(data, "data");
                    TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
                    textView.setText(data.getName());
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    View viewB = viewHolder.b();
                    if (viewB != null) {
                        final LifecycleCoroutineScope lifecycleCoroutineScope = lifecycleScope;
                        final i iVar2 = iVar;
                        final String str2 = linkID;
                        final yh.a<Boolean> aVar2 = isActiveChecker;
                        final yh.a<b2> aVar3 = aVar;
                        viewB.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1$onBindViewHolder$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1$onBindViewHolder$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: BBSKtUtils.kt */
                            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1$onBindViewHolder$2$1", f = "BBSKtUtils.kt", i = {}, l = {194, bb.c.b.O0}, m = "invokeSuspend", n = {}, s = {})
                            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                int f83371b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                final /* synthetic */ CollectionFolder f83372c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                final /* synthetic */ String f83373d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                final /* synthetic */ yh.a<Boolean> f83374e;

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                final /* synthetic */ yh.a<b2> f83375f;

                                /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1$onBindViewHolder$2$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: BBSKtUtils.kt */
                                @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.bbs.utils.BBSKtUtils$Companion$showCollectionFolderSelectDialogFragment$adapter$1$onBindViewHolder$2$1$1", f = "BBSKtUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                public static final class C07221 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    int f83376b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    final /* synthetic */ yh.a<b2> f83377c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    final /* synthetic */ String f83378d;

                                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                                    final /* synthetic */ CollectionFolder f83379e;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C07221(yh.a<b2> aVar, String str, CollectionFolder collectionFolder, kotlin.coroutines.c<? super C07221> cVar) {
                                        super(2, cVar);
                                        this.f83377c = aVar;
                                        this.f83378d = str;
                                        this.f83379e = collectionFolder;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.d
                                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31199, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07221(this.f83377c, this.f83378d, this.f83379e, cVar);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31201, new Class[]{Object.class, Object.class}, Object.class);
                                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                                    }

                                    @dl.e
                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31200, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07221) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.e
                                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31198, new Class[]{Object.class}, Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        kotlin.coroutines.intrinsics.b.h();
                                        if (this.f83376b != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.t0.n(obj);
                                        JsonObject jsonObject = new JsonObject();
                                        String str = this.f83378d;
                                        CollectionFolder collectionFolder = this.f83379e;
                                        jsonObject.addProperty("link_id", str);
                                        jsonObject.addProperty(FavourCollectionContentFragment.f83664o, collectionFolder.getId());
                                        com.max.hbcommon.analytics.d.d("1", lb.d.f131275w0, null, jsonObject);
                                        x.p("加入收藏夹成功");
                                        yh.a<b2> aVar = this.f83377c;
                                        if (aVar == null) {
                                            return null;
                                        }
                                        aVar.invoke();
                                        return b2.f124493a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(CollectionFolder collectionFolder, String str, yh.a<Boolean> aVar, yh.a<b2> aVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.f83372c = collectionFolder;
                                    this.f83373d = str;
                                    this.f83374e = aVar;
                                    this.f83375f = aVar2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.d
                                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 31195, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f83372c, this.f83373d, this.f83374e, this.f83375f, cVar);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31197, new Class[]{Object.class, Object.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                                }

                                @dl.e
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 31196, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @dl.e
                                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31194, new Class[]{Object.class}, Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    Object objH = kotlin.coroutines.intrinsics.b.h();
                                    int i10 = this.f83371b;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            kotlin.t0.n(obj);
                                        } else {
                                            if (i10 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.t0.n(obj);
                                        }
                                        return b2.f124493a;
                                    }
                                    kotlin.t0.n(obj);
                                    BBSKtUtils.Companion companion = BBSKtUtils.f83254a;
                                    String id2 = this.f83372c.getId();
                                    String str = this.f83373d;
                                    this.f83371b = 1;
                                    obj = BBSKtUtils.Companion.c(companion, id2, str, this);
                                    if (obj == objH) {
                                        return objH;
                                    }
                                    if (((Boolean) obj).booleanValue() && this.f83374e.invoke().booleanValue()) {
                                        n2 n2VarE = e1.e();
                                        C07221 c07221 = new C07221(this.f83375f, this.f83373d, this.f83372c, null);
                                        this.f83371b = 2;
                                        if (kotlinx.coroutines.i.h(n2VarE, c07221, this) == objH) {
                                            return objH;
                                        }
                                    }
                                    return b2.f124493a;
                                }
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31193, new Class[]{View.class}, Void.TYPE).isSupported) {
                                    return;
                                }
                                k.f(lifecycleCoroutineScope, null, null, new AnonymousClass1(data, str2, aVar2, aVar3, null), 3, null);
                                iVar2.dismiss();
                            }
                        });
                    }
                }

                @Override // com.max.hbcommon.base.adapter.s
                public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
                    if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31192, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    m(eVar, collectionFolder);
                }
            };
            RecyclerView recyclerView = m6VarC.f113298c;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.setAdapter(sVar);
            iVar.show();
        }
    }
}
