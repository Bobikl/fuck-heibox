package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcustomview.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameCardListV2Obj;
import com.max.xiaoheihe.bean.game.recommend.GameCardV2Obj;
import com.max.xiaoheihe.module.game.adapter.recommend.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendGameAlbumCard.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class RecommendGameAlbumCard extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f86951u = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f86952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f86953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f86954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f86955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MoreButton f86956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f86957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f86958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f86959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f86960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<GameCardV2Obj> f86961t;

    /* JADX INFO: compiled from: RecommendGameAlbumCard.kt */
    public enum Type {
        Rectangle,
        Square;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36954, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36953, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: RecommendGameAlbumCard.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86962a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Rectangle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Square.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86962a = iArr;
        }
    }

    public RecommendGameAlbumCard(@dl.e Context context) {
        this(context, null);
    }

    public RecommendGameAlbumCard(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendGameAlbumCard(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        setElevation(0.0f);
        setCardElevation(0.0f);
        setRadius(0.0f);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36948, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_recommend_game_ablum, this);
        View viewFindViewById = findViewById(R.id.iv_card_bg);
        f0.o(viewFindViewById, "findViewById(R.id.iv_card_bg)");
        setIv_card_bg((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.view_gradient);
        f0.o(viewFindViewById2, "findViewById(R.id.view_gradient)");
        setView_gradient(viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_card_icon);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_card_icon)");
        setIv_card_icon((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_card_title);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_card_title)");
        setTv_card_title((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.mb_more);
        f0.o(viewFindViewById5, "findViewById(R.id.mb_more)");
        setMb_more((MoreButton) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.ll_bottom);
        f0.o(viewFindViewById6, "findViewById(R.id.ll_bottom)");
        setLl_bottom((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_desc)");
        setTv_desc((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.rv);
        f0.o(viewFindViewById8, "findViewById(R.id.rv)");
        setRv((RecyclerView) viewFindViewById8);
        getIv_card_bg().getLayoutParams().height = (ViewUtils.L(getContext()) * 180) / 375;
        setGameList(new ArrayList());
        getRv().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        getRv().addItemDecoration(new d(ViewUtils.f(getContext(), 8.0f), ViewUtils.f(getContext(), 12.0f)));
        Context context = getContext();
        f0.o(context, "context");
        setAdapter(new e(context, getGameList()));
        getRv().setAdapter(getAdapter());
        gc.a aVar = new gc.a();
        aVar.d(ViewUtils.f(getContext(), 7.0f));
        getRv().setOnFlingListener(null);
        aVar.attachToRecyclerView(getRv());
    }

    @dl.d
    public final e getAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36944, new Class[0], e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        e eVar = this.f86960s;
        if (eVar != null) {
            return eVar;
        }
        f0.S("adapter");
        return null;
    }

    @dl.d
    public final List<GameCardV2Obj> getGameList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<GameCardV2Obj> list = this.f86961t;
        if (list != null) {
            return list;
        }
        f0.S("gameList");
        return null;
    }

    @dl.d
    public final ImageView getIv_card_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36928, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86952k;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_card_bg");
        return null;
    }

    @dl.d
    public final ImageView getIv_card_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36932, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86954m;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_card_icon");
        return null;
    }

    @dl.d
    public final LinearLayout getLl_bottom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36938, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86957p;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_bottom");
        return null;
    }

    @dl.d
    public final MoreButton getMb_more() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36936, new Class[0], MoreButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (MoreButton) patchProxyResultProxy.result;
        }
        MoreButton moreButton = this.f86956o;
        if (moreButton != null) {
            return moreButton;
        }
        f0.S("mb_more");
        return null;
    }

    @dl.d
    public final RecyclerView getRv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36942, new Class[0], RecyclerView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RecyclerView) patchProxyResultProxy.result;
        }
        RecyclerView recyclerView = this.f86959r;
        if (recyclerView != null) {
            return recyclerView;
        }
        f0.S("rv");
        return null;
    }

    @dl.d
    public final TextView getTv_card_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36934, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86955n;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_card_title");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36940, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86958q;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final View getView_gradient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36930, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86953l;
        if (view != null) {
            return view;
        }
        f0.S("view_gradient");
        return null;
    }

    public final void setAdapter(@dl.d e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(eVar, "<set-?>");
        this.f86960s = eVar;
    }

    public final void setGameList(@dl.d List<GameCardV2Obj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36947, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f86961t = list;
    }

    public final void setGames(@dl.d List<GameCardV2Obj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36951, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        getGameList().clear();
        getGameList().addAll(list);
        e adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setIv_card_bg(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36929, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86952k = imageView;
    }

    public final void setIv_card_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36933, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86954m = imageView;
    }

    public final void setLl_bottom(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36939, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86957p = linearLayout;
    }

    public final void setMainColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36950, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getLl_bottom().setBackgroundColor(i10);
        getView_gradient().setBackground(ViewUtils.P(0, ViewUtils.k(0.0f, i10), i10));
    }

    public final void setMb_more(@dl.d MoreButton moreButton) {
        if (PatchProxy.proxy(new Object[]{moreButton}, this, changeQuickRedirect, false, 36937, new Class[]{MoreButton.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(moreButton, "<set-?>");
        this.f86956o = moreButton;
    }

    public final void setReportInfo(int i10, @dl.d Object data) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), data}, this, changeQuickRedirect, false, 36949, new Class[]{Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        getRv().setTag(i10, data);
        if (data instanceof GameCardListV2Obj) {
            e adapter = getAdapter();
            PathSrcNode pathSrcNode = new PathSrcNode();
            GameCardListV2Obj gameCardListV2Obj = (GameCardListV2Obj) data;
            pathSrcNode.setPath(gameCardListV2Obj.getReport_path());
            pathSrcNode.setAddition(gameCardListV2Obj.getReport_additional() != null ? gameCardListV2Obj.getReport_additional() : new JsonObject());
            adapter.q(pathSrcNode);
        }
    }

    public final void setRv(@dl.d RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{recyclerView}, this, changeQuickRedirect, false, 36943, new Class[]{RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recyclerView, "<set-?>");
        this.f86959r = recyclerView;
    }

    public final void setTv_card_title(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36935, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86955n = textView;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36941, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86958q = textView;
    }

    public final void setType(@dl.d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36952, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f86962a[type.ordinal()];
        if (i10 == 1) {
            getAdapter().r(NormalGameCard.Type.LightRectangle);
        } else {
            if (i10 != 2) {
                return;
            }
            getAdapter().r(NormalGameCard.Type.LightSquare);
        }
    }

    public final void setView_gradient(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36931, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86953l = view;
    }
}
