package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderObj;
import com.max.xiaoheihe.module.game.adapter.e0;
import com.max.xiaoheihe.module.game.adapter.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameShotFolderPopupWindow.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends PopupWindow {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87025d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RecyclerView f87026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Context f87027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private z f87028c;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.component.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GameShotFolderPopupWindow.kt */
    public static final class ViewOnClickListenerC0786a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0786a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36702, new Class[]{View.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.o.b()) {
                a.this.dismiss();
            }
        }
    }

    public a(@e Context context) {
        super(context);
        f0.m(context);
        this.f87027b = context;
        setContentView(LayoutInflater.from(context).inflate(R.layout.layout_game_shot_folder_poplist, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R.style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        b();
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36699, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setBackgroundDrawable(this.f87027b.getResources().getDrawable(R.drawable.bg_transpant));
        View viewFindViewById = getContentView().findViewById(R.id.rv);
        f0.o(viewFindViewById, "contentView.findViewById<RecyclerView>(R.id.rv)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f87026a = recyclerView;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f87027b));
        getContentView().setOnClickListener(new ViewOnClickListenerC0786a());
    }

    @e
    public final z a() {
        return this.f87028c;
    }

    public final void c(@e List<GameShotPictureFolderObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36700, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f87028c = new z(this.f87027b, list);
        RecyclerView recyclerView = this.f87026a;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.f87028c);
        z zVar = this.f87028c;
        if (zVar != null) {
            zVar.notifyDataSetChanged();
        }
    }

    public final void d(@e z zVar) {
        this.f87028c = zVar;
    }

    public final void e(@d e0 listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, 36701, new Class[]{e0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        z zVar = this.f87028c;
        if (zVar == null) {
            return;
        }
        zVar.p(listener);
    }
}
