package com.max.hbsearch.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbsearch.R;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbsearch.bean.HotSearchListItemColor;
import com.max.hbsearch.bean.HotSearchListItemImage;
import com.max.hbsearch.bean.HotSearchListItemTag;
import com.max.hbsearch.bean.WelcomePageListItem;
import com.max.hbsearch.n;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlin.z;
import ld.f;

/* JADX INFO: compiled from: HotSearchListItemAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHotSearchListItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotSearchListItemAdapter.kt\ncom/max/hbsearch/adapter/HotSearchListItemAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n254#2,2:265\n254#2,2:267\n254#2,2:269\n254#2,2:271\n254#2,2:273\n254#2,2:275\n254#2,2:277\n254#2,2:279\n254#2,2:282\n254#2,2:284\n1#3:281\n*S KotlinDebug\n*F\n+ 1 HotSearchListItemAdapter.kt\ncom/max/hbsearch/adapter/HotSearchListItemAdapter\n*L\n110#1:265,2\n115#1:267,2\n120#1:269,2\n130#1:271,2\n146#1:273,2\n150#1:275,2\n160#1:277,2\n172#1:279,2\n181#1:282,2\n184#1:284,2\n*E\n"})
public final class HotSearchListItemAdapter extends RecyclerView.Adapter<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f72252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private List<WelcomePageListItem> f72253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private final n f72254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private String f72255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final z f72256f;

    /* JADX INFO: compiled from: HotSearchListItemAdapter.kt */
    public static final class a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final f f72257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d View listItemView, @dl.d f viewBinding) {
            super(listItemView);
            f0.p(listItemView, "listItemView");
            f0.p(viewBinding, "viewBinding");
            this.f72257b = viewBinding;
        }

        @dl.d
        public final f a() {
            return this.f72257b;
        }
    }

    public HotSearchListItemAdapter(@dl.d Context context, @dl.d List<WelcomePageListItem> data, @e n nVar, @e String str) {
        f0.p(context, "context");
        f0.p(data, "data");
        this.f72252b = context;
        this.f72253c = data;
        this.f72254d = nVar;
        this.f72255e = str;
        this.f72256f = b0.c(new yh.a<LayoutInflater>() { // from class: com.max.hbsearch.adapter.HotSearchListItemAdapter$layoutInflater$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final LayoutInflater a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.E6, new Class[0], LayoutInflater.class);
                return patchProxyResultProxy.isSupported ? (LayoutInflater) patchProxyResultProxy.result : kb.c.d(this.f72258b.f72252b);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.LayoutInflater, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ LayoutInflater invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.F6, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    private final void o(String str, TextView textView) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{str, textView}, this, changeQuickRedirect, false, bb.c.k.f33950x6, new Class[]{String.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str != null) {
            textView.setVisibility(0);
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            textView.setText(str);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            textView.setVisibility(8);
        }
    }

    private final void p(String str, a aVar) {
        if (PatchProxy.proxy(new Object[]{str, aVar}, this, changeQuickRedirect, false, bb.c.k.f33994z6, new Class[]{String.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        b2 b2Var = null;
        if (!(!(str == null || u.V1(str)))) {
            str = null;
        }
        if (str != null) {
            ImageView ivGameIcon = aVar.a().f131364b;
            f0.o(ivGameIcon, "ivGameIcon");
            ivGameIcon.setVisibility(0);
            com.max.hbimage.b.K(str, aVar.a().f131364b);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            ImageView ivGameIcon2 = aVar.a().f131364b;
            f0.o(ivGameIcon2, "ivGameIcon");
            ivGameIcon2.setVisibility(8);
        }
    }

    private final void q(HotSearchListItemImage hotSearchListItemImage, a aVar) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{hotSearchListItemImage, aVar}, this, changeQuickRedirect, false, bb.c.k.f33906v6, new Class[]{HotSearchListItemImage.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hotSearchListItemImage == null) {
            ImageView ivHotSearchImage = aVar.a().f131365c;
            f0.o(ivHotSearchImage, "ivHotSearchImage");
            ivHotSearchImage.setVisibility(8);
            Space space = aVar.a().f131366d;
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            layoutParams.width = ViewUtils.f(space.getContext(), 6.0f);
            space.setLayoutParams(layoutParams);
            f0.o(space, "run(...)");
            return;
        }
        Space space2 = aVar.a().f131366d;
        ViewGroup.LayoutParams layoutParams2 = space2.getLayoutParams();
        layoutParams2.width = ViewUtils.f(space2.getContext(), 8.0f);
        space2.setLayoutParams(layoutParams2);
        ImageView ivHotSearchImage2 = aVar.a().f131365c;
        f0.o(ivHotSearchImage2, "ivHotSearchImage");
        int iF = ViewUtils.f(this.f72252b, 3.0f);
        String image = hotSearchListItemImage.getImage();
        if (image == null || u.V1(image)) {
            b.a(ivHotSearchImage2, hotSearchListItemImage.getStyle());
            ivHotSearchImage2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ivHotSearchImage2.setImageResource(R.drawable.game_heybox_platform_filled_v_40x40);
            return;
        }
        Integer style = hotSearchListItemImage.getStyle();
        int code = HotSearchListItemImage.ImageStyle.LandscapeImage.getCode();
        if (style == null || style.intValue() != code) {
            int code2 = HotSearchListItemImage.ImageStyle.SquareImage.getCode();
            if (style == null || style.intValue() != code2) {
                z10 = false;
            }
        }
        if (z10) {
            ivHotSearchImage2.setVisibility(0);
            b.a(ivHotSearchImage2, hotSearchListItemImage.getStyle());
            com.max.hbimage.b.d0(hotSearchListItemImage.getImage(), ivHotSearchImage2, iF);
        } else {
            int code3 = HotSearchListItemImage.ImageStyle.SquareInLandscapeImage.getCode();
            if (style != null && style.intValue() == code3) {
                ivHotSearchImage2.setVisibility(0);
                b.a(ivHotSearchImage2, hotSearchListItemImage.getStyle());
                com.max.hbimage.b.L(hotSearchListItemImage.getImage(), ivHotSearchImage2, -1);
            } else {
                ImageView ivHotSearchImage3 = aVar.a().f131365c;
                f0.o(ivHotSearchImage3, "ivHotSearchImage");
                ivHotSearchImage3.setVisibility(8);
                Space space3 = aVar.a().f131366d;
                ViewGroup.LayoutParams layoutParams3 = space3.getLayoutParams();
                layoutParams3.width = ViewUtils.f(space3.getContext(), 6.0f);
                space3.setLayoutParams(layoutParams3);
                g.f74531b.v("[HotSearchListItemAdapter][onBindViewHolder] error style: " + hotSearchListItemImage.getStyle());
            }
        }
        b2 b2Var = b2.f124493a;
    }

    private final void r(HotSearchListItemColor hotSearchListItemColor, int i10, a aVar) {
        if (PatchProxy.proxy(new Object[]{hotSearchListItemColor, new Integer(i10), aVar}, this, changeQuickRedirect, false, bb.c.k.f33884u6, new Class[]{HotSearchListItemColor.class, Integer.TYPE, a.class}, Void.TYPE).isSupported) {
            return;
        }
        HBLineHeightTextView tvIndex = aVar.a().f131370h;
        f0.o(tvIndex, "tvIndex");
        String start_color = hotSearchListItemColor != null ? hotSearchListItemColor.getStart_color() : null;
        String end_color = hotSearchListItemColor != null ? hotSearchListItemColor.getEnd_color() : null;
        if (start_color == null || end_color == null) {
            tvIndex.getPaint().setShader(null);
            tvIndex.setTextColor(this.f72252b.getColor(R.color.text_secondary_2_color));
        } else {
            b.b(tvIndex, com.max.hbutils.utils.a.g(start_color), com.max.hbutils.utils.a.g(end_color));
        }
        tvIndex.setTextSize(16.0f);
        tvIndex.setTypeface(bb.d.a().b(4));
        tvIndex.setText(String.valueOf(i10 + 1));
    }

    private final void s(final WelcomePageListItem welcomePageListItem, a aVar) {
        if (PatchProxy.proxy(new Object[]{welcomePageListItem, aVar}, this, changeQuickRedirect, false, bb.c.k.A6, new Class[]{WelcomePageListItem.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.a().b().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbsearch.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotSearchListItemAdapter.t(welcomePageListItem, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    public static final void t(WelcomePageListItem itemData, HotSearchListItemAdapter this$0, View view) {
        n nVar;
        SearchNewFragment searchNewFragment;
        n nVar2;
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{itemData, this$0, view}, null, changeQuickRedirect, true, bb.c.k.B6, new Class[]{WelcomePageListItem.class, HotSearchListItemAdapter.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemData, "$itemData");
        f0.p(this$0, "this$0");
        Log.d("HotSearchSliceImpl-dbg", "[onClick] root onClick\nproto: " + itemData.getProto() + "\nsearchHost: " + this$0.f72254d + "\ntext: " + itemData.getText());
        String proto = itemData.getProto();
        if (proto == null) {
            nVar = this$0.f72254d;
            if (nVar instanceof SearchNewFragment) {
                searchNewFragment = (SearchNewFragment) nVar;
            } else {
                searchNewFragment = null;
            }
            if (searchNewFragment != null) {
                searchNewFragment.e1(ob.a.b().C());
            }
            nVar2 = this$0.f72254d;
            if (nVar2 != null) {
                nVar2.s1(new KeyDescObj(itemData.getText(), itemData.getProto(), ""), this$0.f72255e);
                b2 b2Var2 = b2.f124493a;
            }
        } else {
            if (!(!u.V1(proto))) {
                proto = null;
            }
            if (proto != null) {
                ob.a.l().b(this$0.f72252b, proto);
                n nVar3 = this$0.f72254d;
                if (nVar3 != null) {
                    String text = itemData.getText();
                    String proto2 = itemData.getProto();
                    HotSearchListItemImage image = itemData.getImage();
                    nVar3.v1(text, proto2, image != null ? image.getImage() : null);
                    b2Var = b2.f124493a;
                } else {
                    b2Var = null;
                }
                if (b2Var == null) {
                    nVar = this$0.f72254d;
                    if (nVar instanceof SearchNewFragment) {
                        searchNewFragment = (SearchNewFragment) nVar;
                    } else {
                        searchNewFragment = null;
                    }
                    if (searchNewFragment != null) {
                        searchNewFragment.e1(ob.a.b().C());
                    }
                    nVar2 = this$0.f72254d;
                    if (nVar2 != null) {
                        nVar2.s1(new KeyDescObj(itemData.getText(), itemData.getProto(), ""), this$0.f72255e);
                        b2 b2Var3 = b2.f124493a;
                    }
                }
            } else {
                nVar = this$0.f72254d;
                if (nVar instanceof SearchNewFragment) {
                    searchNewFragment = (SearchNewFragment) nVar;
                } else {
                    searchNewFragment = null;
                }
                if (searchNewFragment != null) {
                    searchNewFragment.e1(ob.a.b().C());
                }
                nVar2 = this$0.f72254d;
                if (nVar2 != null) {
                    nVar2.s1(new KeyDescObj(itemData.getText(), itemData.getProto(), ""), this$0.f72255e);
                    b2 b2Var4 = b2.f124493a;
                }
            }
        }
        JsonObject report = itemData.getReport();
        if (report == null) {
            report = new JsonObject();
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.A, null, report);
    }

    private final void u(HotSearchListItemTag hotSearchListItemTag, a aVar) {
        String text;
        HotSearchListItemColor background_color;
        String end_color;
        HotSearchListItemColor background_color2;
        String start_color;
        if (PatchProxy.proxy(new Object[]{hotSearchListItemTag, aVar}, this, changeQuickRedirect, false, bb.c.k.f33972y6, new Class[]{HotSearchListItemTag.class, a.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView tvHotTag = aVar.a().f131368f;
        f0.o(tvHotTag, "tvHotTag");
        b2 b2Var = null;
        Integer numValueOf = (hotSearchListItemTag == null || (background_color2 = hotSearchListItemTag.getBackground_color()) == null || (start_color = background_color2.getStart_color()) == null) ? null : Integer.valueOf(com.max.hbutils.utils.a.g(start_color));
        Integer numValueOf2 = (hotSearchListItemTag == null || (background_color = hotSearchListItemTag.getBackground_color()) == null || (end_color = background_color.getEnd_color()) == null) ? null : Integer.valueOf(com.max.hbutils.utils.a.g(end_color));
        if (hotSearchListItemTag != null && (text = hotSearchListItemTag.getText()) != null) {
            tvHotTag.setText(text);
            tvHotTag.setVisibility(0);
            if (numValueOf != null && numValueOf2 != null) {
                tvHotTag.setBackground(q.k(this.f72252b, numValueOf.intValue(), numValueOf2.intValue(), GradientDrawable.Orientation.LEFT_RIGHT, new float[]{2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f}));
            }
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            tvHotTag.setVisibility(8);
        }
    }

    private final void v(String str, TextView textView) {
        if (PatchProxy.proxy(new Object[]{str, textView}, this, changeQuickRedirect, false, bb.c.k.f33928w6, new Class[]{String.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText(str);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
    }

    private final LayoutInflater x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33796q6, new Class[0], LayoutInflater.class);
        return patchProxyResultProxy.isSupported ? (LayoutInflater) patchProxyResultProxy.result : (LayoutInflater) this.f72256f.getValue();
    }

    @dl.d
    public a A(@dl.d ViewGroup parent, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33818r6, new Class[]{ViewGroup.class, Integer.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        f fVarD = f.d(x(), parent, false);
        f0.o(fVarD, "inflate(...)");
        ConstraintLayout constraintLayoutB = fVarD.b();
        f0.o(constraintLayoutB, "getRoot(...)");
        return new a(constraintLayoutB, fVarD);
    }

    public final void B(@dl.d List<WelcomePageListItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33773p6, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f72253c = list;
    }

    public final void C(@e String str) {
        this.f72255e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33840s6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f72253c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.D6, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        z((a) viewHolder, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.C6, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : A(viewGroup, i10);
    }

    @dl.d
    public final List<WelcomePageListItem> w() {
        return this.f72253c;
    }

    @e
    public final String y() {
        return this.f72255e;
    }

    public void z(@dl.d a holder, int i10) {
        if (PatchProxy.proxy(new Object[]{holder, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33862t6, new Class[]{a.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(holder, "holder");
        WelcomePageListItem welcomePageListItem = (WelcomePageListItem) CollectionsKt___CollectionsKt.R2(this.f72253c, i10);
        if (welcomePageListItem == null) {
            return;
        }
        r(welcomePageListItem.getIndex_color(), i10, holder);
        q(welcomePageListItem.getImage(), holder);
        String text = welcomePageListItem.getText();
        TextView tvHotTitle = holder.a().f131369g;
        f0.o(tvHotTitle, "tvHotTitle");
        v(text, tvHotTitle);
        String desc = welcomePageListItem.getDesc();
        TextView tvHotDesc = holder.a().f131367e;
        f0.o(tvHotDesc, "tvHotDesc");
        o(desc, tvHotDesc);
        u(welcomePageListItem.getRight_tag(), holder);
        p(welcomePageListItem.getIcon(), holder);
        s(welcomePageListItem, holder);
    }
}
