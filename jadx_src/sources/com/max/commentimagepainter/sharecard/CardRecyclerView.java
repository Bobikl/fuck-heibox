package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: CardRecyclerView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f65280b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f65281c = "CustomRecyclerView";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: CardRecyclerView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CardRecyclerView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CardRecyclerView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public CardRecyclerView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
    }

    public /* synthetic */ CardRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int getScreenWidth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Fh, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public final void e(@dl.d List<CardObj> list, @dl.d y lifecycleOwner, @dl.d l<? super Integer, b2> scrollStateIdLeCallback) {
        if (PatchProxy.proxy(new Object[]{list, lifecycleOwner, scrollStateIdLeCallback}, this, changeQuickRedirect, false, bb.c.b.Dh, new Class[]{List.class, y.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        int screenWidth = getScreenWidth();
        Resources resources = getResources();
        f0.o(resources, "getResources(...)");
        int iE = screenWidth - ShareCardDrawUtilsKt.e(76, resources);
        Resources resources2 = getResources();
        f0.o(resources2, "getResources(...)");
        int iE2 = ShareCardDrawUtilsKt.e(468, resources2);
        Context context = getContext();
        f0.o(context, "getContext(...)");
        CardStackLayoutManager cardStackLayoutManager = new CardStackLayoutManager(context, 0, false);
        cardStackLayoutManager.setInitialPrefetchItemCount(3);
        Resources resources3 = getResources();
        f0.o(resources3, "getResources(...)");
        RecyclerView.Adapter cardAdapter = new CardAdapter(iE, iE2, resources3, list, lifecycleOwner);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        setLayoutManager(cardStackLayoutManager);
        setAdapter(cardAdapter);
        Resources resources4 = getResources();
        f0.o(resources4, "getResources(...)");
        addItemDecoration(new b(ShareCardDrawUtilsKt.e(4, resources4)));
        pagerSnapHelper.attachToRecyclerView(this);
        RecyclerView.OnScrollListener fVar = new f(pagerSnapHelper, cardStackLayoutManager, scrollStateIdLeCallback);
        addOnScrollListener(fVar);
        fVar.onScrollStateChanged(this, 0);
    }

    public final void f(@dl.d List<CardObjV2> list, @dl.d y lifecycleOwner, @dl.d l<? super Integer, b2> scrollStateIdLeCallback) {
        if (PatchProxy.proxy(new Object[]{list, lifecycleOwner, scrollStateIdLeCallback}, this, changeQuickRedirect, false, bb.c.b.Eh, new Class[]{List.class, y.class, l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "list");
        f0.p(lifecycleOwner, "lifecycleOwner");
        f0.p(scrollStateIdLeCallback, "scrollStateIdLeCallback");
        Resources resources = getResources();
        f0.o(resources, "getResources(...)");
        setAdapter(new c(resources, list, lifecycleOwner));
        Context context = getContext();
        f0.o(context, "getContext(...)");
        CardStackLayoutManager cardStackLayoutManager = new CardStackLayoutManager(context, 0, false);
        cardStackLayoutManager.setInitialPrefetchItemCount(3);
        setLayoutManager(cardStackLayoutManager);
        Resources resources2 = getResources();
        f0.o(resources2, "getResources(...)");
        addItemDecoration(new b(ShareCardDrawUtilsKt.e(4, resources2)));
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(this);
        RecyclerView.OnScrollListener fVar = new f(pagerSnapHelper, cardStackLayoutManager, scrollStateIdLeCallback);
        addOnScrollListener(fVar);
        fVar.onScrollStateChanged(this, 0);
    }
}
