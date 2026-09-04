package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.widget.MediumBoldTextView;
import com.max.mediaselector.lib.widget.SquareRelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ot;
import df.pt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GalleryPagingAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nGalleryPagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPagingAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/GalleryPagingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n1864#2,3:308\n*S KotlinDebug\n*F\n+ 1 GalleryPagingAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/GalleryPagingAdapter\n*L\n99#1:308,3\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class GalleryPagingAdapter extends PagingDataAdapter<LocalMedia, c> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f80271l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f80272m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f80273n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f80274o = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Context f80276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final String f80277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final yh.l<com.max.xiaoheihe.module.bbs.post_edit.e, b2> f80278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<LocalMedia> f80279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlin.z f80280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final b f80269j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f80270k = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final a f80275p = new a();

    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    public static final class a extends DiffUtil.ItemCallback<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public boolean a(@dl.d LocalMedia oldItem, @dl.d LocalMedia newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27338, new Class[]{LocalMedia.class, LocalMedia.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.E(), newItem.E()) && oldItem.L() == newItem.L() && oldItem.getWidth() == newItem.getWidth() && oldItem.getHeight() == newItem.getHeight();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(LocalMedia localMedia, LocalMedia localMedia2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, localMedia2}, this, changeQuickRedirect, false, 27340, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(localMedia, localMedia2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(LocalMedia localMedia, LocalMedia localMedia2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia, localMedia2}, this, changeQuickRedirect, false, 27339, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(localMedia, localMedia2);
        }

        public boolean b(@dl.d LocalMedia oldItem, @dl.d LocalMedia newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 27337, new Class[]{LocalMedia.class, LocalMedia.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return oldItem.z() == newItem.z() && f0.g(oldItem.H(), newItem.H());
        }
    }

    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static final /* synthetic */ int a(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 27335, new Class[]{b.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.c();
        }

        public static final /* synthetic */ int b(b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 27336, new Class[]{b.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : bVar.d();
        }

        private final int c() {
            return 0;
        }

        private final int d() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static abstract class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f80281b = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d View itemView) {
            super(itemView);
            f0.p(itemView, "itemView");
        }

        public abstract void a(int i10, @dl.e LocalMedia localMedia, @dl.d Context context, @dl.d me.d dVar);
    }

    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class d extends c {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f80282f = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final ot f80283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private final String f80284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final yh.l<Integer, b2> f80285e;

        /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f80287c;

            a(int i10) {
                this.f80287c = i10;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27342, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                d.this.f80285e.invoke(Integer.valueOf(this.f80287c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@dl.d ot headerViewBinding, @dl.d View itemView, @dl.e String str, @dl.d yh.l<? super Integer, b2> selectListener) {
            super(itemView);
            f0.p(headerViewBinding, "headerViewBinding");
            f0.p(itemView, "itemView");
            f0.p(selectListener, "selectListener");
            this.f80283c = headerViewBinding;
            this.f80284d = str;
            this.f80285e = selectListener;
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter.c
        public void a(int i10, @dl.e LocalMedia localMedia, @dl.d Context context, @dl.d me.d imageEngine) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10), localMedia, context, imageEngine}, this, changeQuickRedirect, false, 27341, new Class[]{Integer.TYPE, LocalMedia.class, Context.class, me.d.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(imageEngine, "imageEngine");
            b bVar = GalleryPagingAdapter.f80269j;
            if (i10 == b.a(bVar)) {
                this.f80283c.f114311c.setText("拍照");
                this.f80283c.f114310b.setImageResource(R.drawable.common_camera_filled_24x24);
            } else if (i10 == b.b(bVar)) {
                TextView textView = this.f80283c.f114311c;
                String str = this.f80284d;
                textView.setText(str == null || kotlin.text.u.V1(str) ? d0.f87251w : this.f80284d);
                this.f80283c.f114310b.setImageResource(R.drawable.common_all_filled_24x24);
            } else {
                Log.e("PostToolHeaderViewHolder-dbg", "[bind] error header pos: " + i10);
            }
            this.itemView.setOnClickListener(new a(i10));
        }
    }

    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    @t0({"SMAP\nGalleryPagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryPagingAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/GalleryPagingAdapter$PostToolMediaItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,307:1\n262#2,2:308\n262#2,2:310\n262#2,2:312\n262#2,2:314\n*S KotlinDebug\n*F\n+ 1 GalleryPagingAdapter.kt\ncom/max/xiaoheihe/module/bbs/adapter/GalleryPagingAdapter$PostToolMediaItemViewHolder\n*L\n252#1:308,2\n261#1:310,2\n266#1:312,2\n270#1:314,2\n*E\n"})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class e extends c {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f80288f = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final pt f80289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final yh.l<LocalMedia, b2> f80290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final yh.l<LocalMedia, u> f80291e;

        /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalMedia f80293c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f80294d;

            a(LocalMedia localMedia, Context context) {
                this.f80293c = localMedia;
                this.f80294d = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27346, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                u uVar = (u) e.this.f80291e.invoke(this.f80293c);
                if (uVar.e() == 0) {
                    e.this.f80289c.f114608b.setColorFilter(com.max.mediaselector.lib.utils.s.g(this.f80294d, R.color.ps_color_80));
                    e.this.f80289c.f114609c.setCheckNumber(uVar.f(), false);
                } else {
                    e.this.f80289c.f114608b.clearColorFilter();
                    e.this.f80289c.f114609c.setCheckNumber(-1, false);
                }
            }
        }

        /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27347, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                e.this.f80289c.f114609c.performClick();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(@dl.d pt mediaViewBinding, @dl.d View itemView, @dl.d yh.l<? super LocalMedia, b2> adaptSelectNum, @dl.d yh.l<? super LocalMedia, u> onSelectListener) {
            super(itemView);
            f0.p(mediaViewBinding, "mediaViewBinding");
            f0.p(itemView, "itemView");
            f0.p(adaptSelectNum, "adaptSelectNum");
            f0.p(onSelectListener, "onSelectListener");
            this.f80289c = mediaViewBinding;
            this.f80290d = adaptSelectNum;
            this.f80291e = onSelectListener;
        }

        private final void g(LocalMedia localMedia, Context context) {
            if (PatchProxy.proxy(new Object[]{localMedia, context}, this, changeQuickRedirect, false, 27344, new Class[]{LocalMedia.class, Context.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = this.f80289c.f114610d;
            f0.o(textView, "mediaViewBinding.tvDurationV2");
            textView.setVisibility(8);
            this.f80289c.f114611e.setVisibility(0);
            if (com.max.mediaselector.lib.config.f.f(localMedia.A())) {
                this.f80289c.f114611e.setText(context.getString(R.string.ps_gif_tag));
                return;
            }
            if (com.max.mediaselector.lib.config.f.j(localMedia.A())) {
                this.f80289c.f114611e.setText(context.getString(R.string.ps_webp_tag));
            } else {
                if (com.max.mediaselector.lib.utils.l.r(localMedia.getWidth(), localMedia.getHeight())) {
                    this.f80289c.f114611e.setText(context.getString(R.string.ps_long_chart));
                    return;
                }
                MediumBoldTextView mediumBoldTextView = this.f80289c.f114611e;
                f0.o(mediumBoldTextView, "mediaViewBinding.tvMediaTag");
                mediumBoldTextView.setVisibility(8);
            }
        }

        private final void h(LocalMedia localMedia) {
            if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 27345, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
                return;
            }
            MediumBoldTextView mediumBoldTextView = this.f80289c.f114611e;
            f0.o(mediumBoldTextView, "mediaViewBinding.tvMediaTag");
            mediumBoldTextView.setVisibility(8);
            TextView bindVideoMedia$lambda$2 = this.f80289c.f114610d;
            f0.o(bindVideoMedia$lambda$2, "bindVideoMedia$lambda$2");
            bindVideoMedia$lambda$2.setVisibility(0);
            bindVideoMedia$lambda$2.setText(com.max.mediaselector.lib.utils.g.c(localMedia.w()));
            bb.d.d(bindVideoMedia$lambda$2, 2);
            bindVideoMedia$lambda$2.setBackground(ViewUtils.E(ViewUtils.f(bindVideoMedia$lambda$2.getContext(), 2.0f), bindVideoMedia$lambda$2.getContext().getColor(R.color.text_primary_1_color_alpha60)));
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter.c
        public void a(int i10, @dl.e LocalMedia localMedia, @dl.d Context context, @dl.d me.d imageEngine) {
            Object objB;
            if (PatchProxy.proxy(new Object[]{new Integer(i10), localMedia, context, imageEngine}, this, changeQuickRedirect, false, 27343, new Class[]{Integer.TYPE, LocalMedia.class, Context.class, me.d.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(imageEngine, "imageEngine");
            if (localMedia == null) {
                return;
            }
            localMedia.f75199l = i10;
            try {
                Result.a aVar = Result.f124476c;
                imageEngine.f(context, localMedia.E(), this.f80289c.f114608b);
                objB = Result.b(b2.f124493a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                Log.e("PostToolMediaItemViewHolder-dbg", "[bind]\nload failed for " + localMedia.E() + ", pos: " + i10 + "\ncause: " + thE);
            }
            this.f80290d.invoke(localMedia);
            if (localMedia.B() > 0) {
                this.f80289c.f114608b.setColorFilter(com.max.mediaselector.lib.utils.s.g(context, R.color.ps_color_80));
                this.f80289c.f114609c.setCheckNumber(localMedia.B(), false);
            } else {
                this.f80289c.f114608b.clearColorFilter();
                this.f80289c.f114609c.setCheckNumber(-1, false);
            }
            this.f80289c.f114609c.setOnClickListener(new a(localMedia, context));
            this.itemView.setOnClickListener(new b());
            int iD = localMedia.d();
            if (iD == com.max.mediaselector.lib.config.h.c()) {
                g(localMedia, context);
            } else if (iD == com.max.mediaselector.lib.config.h.d()) {
                h(localMedia);
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter$onCreateViewHolder$1, reason: invalid class name */
    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.l<Integer, b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass1(Object obj) {
            super(1, obj, GalleryPagingAdapter.class, "onSelectHeaderItemAction", "onSelectHeaderItemAction(I)V", 0);
        }

        public final void i(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27349, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GalleryPagingAdapter.B((GalleryPagingAdapter) this.receiver, i10);
        }

        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 27350, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            i(num.intValue());
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter$onCreateViewHolder$2, reason: invalid class name */
    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements yh.l<LocalMedia, b2> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass2(Object obj) {
            super(1, obj, GalleryPagingAdapter.class, "onAdaptSelectNum", "onAdaptSelectNum(Lcom/max/mediaselector/lib/entity/LocalMedia;)V", 0);
        }

        public final void i(@dl.d LocalMedia p10) {
            if (PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 27351, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(p10, "p0");
            GalleryPagingAdapter.A((GalleryPagingAdapter) this.receiver, p10);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(LocalMedia localMedia) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 27352, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            i(localMedia);
            return b2.f124493a;
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter$onCreateViewHolder$3, reason: invalid class name */
    /* JADX INFO: compiled from: GalleryPagingAdapter.kt */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements yh.l<LocalMedia, u> {
        public static ChangeQuickRedirect changeQuickRedirect;

        AnonymousClass3(Object obj) {
            super(1, obj, GalleryPagingAdapter.class, "onSelectMediaItemAction", "onSelectMediaItemAction(Lcom/max/mediaselector/lib/entity/LocalMedia;)Lcom/max/xiaoheihe/module/bbs/adapter/SelectResult;", 0);
        }

        @dl.d
        public final u i(@dl.d LocalMedia p10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{p10}, this, changeQuickRedirect, false, 27353, new Class[]{LocalMedia.class}, u.class);
            if (patchProxyResultProxy.isSupported) {
                return (u) patchProxyResultProxy.result;
            }
            f0.p(p10, "p0");
            return GalleryPagingAdapter.C((GalleryPagingAdapter) this.receiver, p10);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.module.bbs.adapter.u, java.lang.Object] */
        @Override // yh.l
        public /* bridge */ /* synthetic */ u invoke(LocalMedia localMedia) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 27354, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i(localMedia);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryPagingAdapter(@dl.d Context context, @dl.e String str, @dl.d yh.l<? super com.max.xiaoheihe.module.bbs.post_edit.e, b2> onGalleryPostEvent) {
        super(f80275p, null, null, 6, null);
        f0.p(context, "context");
        f0.p(onGalleryPostEvent, "onGalleryPostEvent");
        this.f80276e = context;
        this.f80277f = str;
        this.f80278g = onGalleryPostEvent;
        this.f80279h = new ArrayList();
        this.f80280i = b0.c(new yh.a<com.max.mediaselector.c>() { // from class: com.max.xiaoheihe.module.bbs.adapter.GalleryPagingAdapter$imageEngine$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final com.max.mediaselector.c a() {
                return com.max.mediaselector.c.f74745a;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.max.mediaselector.c, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ com.max.mediaselector.c invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27348, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    public static final /* synthetic */ void A(GalleryPagingAdapter galleryPagingAdapter, LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{galleryPagingAdapter, localMedia}, null, changeQuickRedirect, true, 27333, new Class[]{GalleryPagingAdapter.class, LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        galleryPagingAdapter.F(localMedia);
    }

    public static final /* synthetic */ void B(GalleryPagingAdapter galleryPagingAdapter, int i10) {
        if (PatchProxy.proxy(new Object[]{galleryPagingAdapter, new Integer(i10)}, null, changeQuickRedirect, true, 27332, new Class[]{GalleryPagingAdapter.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        galleryPagingAdapter.I(i10);
    }

    public static final /* synthetic */ u C(GalleryPagingAdapter galleryPagingAdapter, LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{galleryPagingAdapter, localMedia}, null, changeQuickRedirect, true, 27334, new Class[]{GalleryPagingAdapter.class, LocalMedia.class}, u.class);
        return patchProxyResultProxy.isSupported ? (u) patchProxyResultProxy.result : galleryPagingAdapter.J(localMedia);
    }

    private final me.d E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27319, new Class[0], me.d.class);
        return patchProxyResultProxy.isSupported ? (me.d) patchProxyResultProxy.result : (me.d) this.f80280i.getValue();
    }

    private final void F(LocalMedia localMedia) {
        if (PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 27324, new Class[]{LocalMedia.class}, Void.TYPE).isSupported) {
            return;
        }
        for (LocalMedia localMedia2 : this.f80279h) {
            if (f0.g(localMedia2.E(), localMedia.E()) && localMedia2.d() == localMedia.d() && localMedia2.L() == localMedia.L() && localMedia2.getWidth() == localMedia.getWidth() && localMedia2.getHeight() == localMedia.getHeight()) {
                localMedia.G0(localMedia2.B());
            }
        }
    }

    private final void I(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27323, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b bVar = f80269j;
        if (i10 == b.a(bVar)) {
            this.f80278g.invoke(com.max.xiaoheihe.module.bbs.post_edit.e.a.f82949b);
        } else if (i10 == b.b(bVar)) {
            this.f80278g.invoke(com.max.xiaoheihe.module.bbs.post_edit.e.b.f82951b);
        }
    }

    private final u J(LocalMedia localMedia) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{localMedia}, this, changeQuickRedirect, false, 27325, new Class[]{LocalMedia.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        if (!this.f80279h.contains(localMedia)) {
            if (localMedia.d() == com.max.mediaselector.lib.config.h.c() && this.f80279h.size() >= 30) {
                return new u(-1, 0);
            }
            if (localMedia.d() == com.max.mediaselector.lib.config.h.d() && this.f80279h.size() >= 1) {
                return new u(-1, 0);
            }
            this.f80279h.add(localMedia);
            localMedia.G0(this.f80279h.size());
            this.f80278g.invoke(new com.max.xiaoheihe.module.bbs.post_edit.e.c(localMedia, 0));
            return new u(0, this.f80279h.size());
        }
        int iIndexOf = this.f80279h.indexOf(localMedia);
        this.f80279h.remove(localMedia);
        int i10 = 0;
        for (Object obj : this.f80279h) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            LocalMedia localMedia2 = (LocalMedia) obj;
            if (i10 >= iIndexOf) {
                localMedia2.G0(localMedia2.B() - 1);
                if (localMedia2.f75199l < getItemCount()) {
                    notifyItemChanged(localMedia2.f75199l);
                }
            }
            i10 = i11;
        }
        localMedia.G0(0);
        this.f80278g.invoke(new com.max.xiaoheihe.module.bbs.post_edit.e.c(localMedia, 1));
        return new u(1, 0);
    }

    public final void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f80279h.clear();
    }

    public void G(@dl.d c holder, int i10) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 27326, new Class[]{c.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        b bVar = f80269j;
        if (i10 != b.a(bVar) && i10 != b.b(bVar)) {
            z10 = false;
        }
        if (z10) {
            holder.a(i10, null, this.f80276e, E());
        } else {
            holder.a(i10, getItem(fi.u.u(i10 - 2, 0)), this.f80276e, E());
        }
    }

    @dl.d
    public c H(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 27322, new Class[]{ViewGroup.class, Integer.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 0 || i10 == 1) {
            ot otVarD = ot.d(layoutInflaterFrom, parent, false);
            f0.o(otVarD, "inflate(inflater, parent, false)");
            SquareRelativeLayout squareRelativeLayoutB = otVarD.b();
            f0.o(squareRelativeLayoutB, "binding.root");
            return new d(otVarD, squareRelativeLayoutB, this.f80277f, new AnonymousClass1(this));
        }
        pt ptVarD = pt.d(layoutInflaterFrom, parent, false);
        f0.o(ptVarD, "inflate(inflater, parent, false)");
        SquareRelativeLayout squareRelativeLayoutB2 = ptVarD.b();
        f0.o(squareRelativeLayoutB2, "binding.root");
        return new e(ptVarD, squareRelativeLayoutB2, new AnonymousClass2(this), new AnonymousClass3(this));
    }

    public final void K() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27328, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E().a(this.f80276e);
    }

    public final void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E().d(this.f80276e);
    }

    @Override // androidx.paging.PagingDataAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27321, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.getItemCount() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27320, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        b bVar = f80269j;
        if (i10 == b.a(bVar)) {
            return 0;
        }
        return i10 == b.b(bVar) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 27331, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        G((c) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 27330, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : H(viewGroup, i10);
    }
}
