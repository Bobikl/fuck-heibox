package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderObj;
import com.max.xiaoheihe.module.game.adapter.e0;
import com.max.xiaoheihe.module.game.adapter.f0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: SteamGameShotFolderPopupWindow.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c extends PopupWindow {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87031d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RecyclerView f87032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Context f87033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private f0 f87034c;

    /* JADX INFO: compiled from: SteamGameShotFolderPopupWindow.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37023, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            c.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamGameShotFolderPopupWindow.kt */
    public static final class b extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@d Rect outRect, @d View view, @d RecyclerView parent, @d RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 37024, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(outRect, "outRect");
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(parent, "parent");
            kotlin.jvm.internal.f0.p(state, "state");
            int iF = ViewUtils.f(c.this.f87033b, 8.0f);
            int iF2 = ViewUtils.f(c.this.f87033b, 12.0f);
            int childAdapterPosition = parent.getChildAdapterPosition(view) % 2;
            int i10 = childAdapterPosition == 0 ? iF2 : 0;
            if (childAdapterPosition == 0) {
                iF2 = iF;
            }
            outRect.set(i10, 0, iF2, iF);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.component.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SteamGameShotFolderPopupWindow.kt */
    public static final class ViewOnClickListenerC0787c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0787c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37025, new Class[]{View.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.o.b()) {
                c.this.dismiss();
            }
        }
    }

    public c(@e Context context) {
        super(context);
        kotlin.jvm.internal.f0.m(context);
        this.f87033b = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.layout_steam_game_shot_popup_window, (ViewGroup) null));
        setWidth(-1);
        setHeight(ViewUtils.J(this.f87033b) - ViewUtils.f(context, 78.0f));
        setAnimationStyle(R.style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        c();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37020, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackgroundDrawable(q.n(this.f87033b, R.color.black_alpha50));
        getContentView().findViewById(R.id.vg_dialog_root).setOnClickListener(new a());
        View viewFindViewById = getContentView().findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById, "contentView.findViewById<RecyclerView>(R.id.rv)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f87032a = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this.f87033b, 2));
        RecyclerView recyclerView3 = this.f87032a;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        if (recyclerView3.getItemDecorationCount() == 0) {
            RecyclerView recyclerView4 = this.f87032a;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.f0.S("mRecyclerView");
            } else {
                recyclerView2 = recyclerView4;
            }
            recyclerView2.addItemDecoration(new b());
        }
        getContentView().setOnClickListener(new ViewOnClickListenerC0787c());
    }

    @e
    public final f0 b() {
        return this.f87034c;
    }

    public final void d(@e List<GameShotPictureFolderObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37021, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f87034c = new f0(this.f87033b, list);
        RecyclerView recyclerView = this.f87032a;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.f87034c);
        f0 f0Var = this.f87034c;
        if (f0Var != null) {
            f0Var.notifyDataSetChanged();
        }
    }

    public final void e(@e f0 f0Var) {
        this.f87034c = f0Var;
    }

    public final void f(@d e0 listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, 37022, new Class[]{e0.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(listener, "listener");
        f0 f0Var = this.f87034c;
        if (f0Var == null) {
            return;
        }
        f0Var.r(listener);
    }
}
