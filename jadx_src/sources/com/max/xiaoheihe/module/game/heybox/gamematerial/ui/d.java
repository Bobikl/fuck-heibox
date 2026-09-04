package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ImageInfoObj;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialLinkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialLinkAdapter.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLinkAdapter\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n29#2:226\n5#2,2:227\n22#2:229\n7#2:230\n1655#3,8:231\n*S KotlinDebug\n*F\n+ 1 GameMaterialLinkAdapter.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLinkAdapter\n*L\n151#1:226\n151#1:227,2\n151#1:229\n151#1:230\n152#1:231,8\n*E\n"})
@o(parameters = 0)
public final class d extends u<GameMaterialItem> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87585e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f87586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final RecyclerView f87587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final AsyncListDiffer<GameMaterialItem> f87588d;

    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class a extends DiffUtil.ItemCallback<GameMaterialItem> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public boolean a(@dl.d GameMaterialItem oldItem, @dl.d GameMaterialItem newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 37611, new Class[]{GameMaterialItem.class, GameMaterialItem.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(GameMaterialItem gameMaterialItem, GameMaterialItem gameMaterialItem2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialItem, gameMaterialItem2}, this, changeQuickRedirect, false, 37613, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : a(gameMaterialItem, gameMaterialItem2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ boolean areItemsTheSame(GameMaterialItem gameMaterialItem, GameMaterialItem gameMaterialItem2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialItem, gameMaterialItem2}, this, changeQuickRedirect, false, 37612, new Class[]{Object.class, Object.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(gameMaterialItem, gameMaterialItem2);
        }

        public boolean b(@dl.d GameMaterialItem oldItem, @dl.d GameMaterialItem newItem) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oldItem, newItem}, this, changeQuickRedirect, false, 37610, new Class[]{GameMaterialItem.class, GameMaterialItem.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(oldItem, "oldItem");
            f0.p(newItem, "newItem");
            return f0.g(oldItem.getLinkId(), newItem.getLinkId());
        }
    }

    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialItem f87589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f87590c;

        b(GameMaterialItem gameMaterialItem, d dVar) {
            this.f87589b = gameMaterialItem;
            this.f87590c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GameMaterialItem gameMaterialItem;
            Integer linkId;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37614, new Class[]{View.class}, Void.TYPE).isSupported || (gameMaterialItem = this.f87589b) == null || (linkId = gameMaterialItem.getLinkId()) == null) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.F(this.f87590c.n(), this.f87589b.getSource(), String.valueOf(linkId.intValue()), "27", null, null);
        }
    }

    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class c implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f87591a;

        c(ImageView imageView) {
            this.f87591a = imageView;
        }

        @Override // com.max.hbimage.b.q
        public void a(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 37615, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "drawable");
            this.f87591a.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@dl.d Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 37616, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(drawable, "drawable");
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
    public static final class RunnableC0799d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f87593c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d$d$a */
        /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f87594b;

            a(d dVar) {
                this.f87594b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37618, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f87594b.p().invalidateItemDecorations();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.d$d$b */
        /* JADX INFO: compiled from: GameMaterialLinkAdapter.kt */
        public static final class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f87595b;

            b(d dVar) {
                this.f87595b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37619, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f87595b.p().smoothScrollToPosition(0);
            }
        }

        RunnableC0799d(boolean z10) {
            this.f87593c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37617, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            d.this.p().post(new a(d.this));
            if (this.f87593c) {
                d.this.p().postDelayed(new b(d.this), 200L);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Context context, @dl.d RecyclerView recyclerView) {
        super(context, CollectionsKt__CollectionsKt.E());
        f0.p(context, "context");
        f0.p(recyclerView, "recyclerView");
        this.f87586b = context;
        this.f87587c = recyclerView;
        this.f87588d = new AsyncListDiffer<>(new com.max.xiaoheihe.module.game.heybox.gamematerial.ui.a(this), new AsyncDifferConfig.Builder(new a()).build());
    }

    public static /* synthetic */ void s(d dVar, List list, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{dVar, list, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 37601, new Class[]{d.class, List.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        dVar.r(list, z10);
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37602, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f87588d.getCurrentList().size();
    }

    @Override // com.max.hbcommon.base.adapter.u, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37604, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GameMaterialItem gameMaterialItem = this.f87588d.getCurrentList().get(i10);
        f0.o(gameMaterialItem, "mDiffer.currentList[position]");
        return o(i10, gameMaterialItem);
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, GameMaterialItem gameMaterialItem) {
        Object[] objArr = {new Integer(i10), gameMaterialItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37607, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, gameMaterialItem);
    }

    @dl.d
    public final Context n() {
        return this.f87586b;
    }

    public int o(int i10, @dl.d GameMaterialItem data) {
        Object[] objArr = {new Integer(i10), data};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37603, new Class[]{cls, GameMaterialItem.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(data, "data");
        return R.layout.item_game_material;
    }

    @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, 37608, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder((s.e) viewHolder, i10);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public void onBindViewHolder(@dl.d s.e holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, 37605, new Class[]{s.e.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        q(holder, this.f87588d.getCurrentList().get(i10));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 37609, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        q(eVar, (GameMaterialItem) obj);
    }

    @dl.d
    public final RecyclerView p() {
        return this.f87587c;
    }

    public void q(@dl.d s.e viewHolder, @dl.e GameMaterialItem gameMaterialItem) {
        ImageInfoObj img;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{viewHolder, gameMaterialItem}, this, changeQuickRedirect, false, 37606, new Class[]{s.e.class, GameMaterialItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
        TextView textView = (TextView) viewHolder.i(R.id.tv_image_count);
        String url = null;
        int iQ = n.q(gameMaterialItem != null ? gameMaterialItem.getImg_num() : null);
        if (iQ > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) 20849);
            sb2.append(iQ);
            sb2.append((char) 24352);
            textView.setText(sb2.toString());
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        Context context = this.f87586b;
        e.b(context, imageView, (ViewUtils.L(context) - ViewUtils.f(this.f87586b, 30.0f)) / 2, gameMaterialItem != null ? gameMaterialItem.getImg() : null);
        int i11 = imageView.getLayoutParams().width;
        int i12 = imageView.getLayoutParams().height;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(q.l(this.f87586b, i11, i12, i11));
        imageView.setOnClickListener(new b(gameMaterialItem, this));
        Context context2 = this.f87586b;
        if (gameMaterialItem != null && (img = gameMaterialItem.getImg()) != null) {
            url = img.getUrl();
        }
        com.max.hbimage.b.X(context2, imageView, url, new c(imageView));
    }

    public final void r(@dl.d List<GameMaterialItem> list, boolean z10) {
        String name;
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37600, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        String str = this + ", submitList, smooth2Top = " + z10;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (d.class.isAnonymousClass()) {
            name = d.class.getName();
            f0.m(name);
        } else {
            name = d.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((GameMaterialItem) obj).getLinkId())) {
                arrayList.add(obj);
            }
        }
        this.mDataList = arrayList;
        this.f87588d.submitList(arrayList, new RunnableC0799d(z10));
    }
}
