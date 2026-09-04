package com.max.xiaoheihe.module.game.xbox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.base.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfo;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: XboxFriendListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nXboxFriendListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XboxFriendListFragment.kt\ncom/max/xiaoheihe/module/game/xbox/XboxFriendListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
@o(parameters = 0)
public final class c extends d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88544g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private s<XboxFriendInfo> f88545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private t f88546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ArrayList<XboxFriendInfo> f88547d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private a f88548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView f88549f;

    private final void M3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38423, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.m(view);
        View viewFindViewById = view.findViewById(R.id.rv);
        f0.o(viewFindViewById, "rootView!!.findViewById(R.id.rv)");
        this.f88549f = (RecyclerView) viewFindViewById;
    }

    private final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38424, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        this.f88545b = new b(mContext, this.f88547d);
        RecyclerView recyclerView = this.f88549f;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setClipToPadding(false);
        RecyclerView recyclerView3 = this.f88549f;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setClipChildren(false);
        RecyclerView recyclerView4 = this.f88549f;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 4.0f));
        RecyclerView recyclerView5 = this.f88549f;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
        } else {
            recyclerView2 = recyclerView5;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f88546c = new t(this.f88545b);
    }

    private final void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        RecyclerView recyclerView = this.f88549f;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_xbox_friend_header, (ViewGroup) recyclerView, false);
        f0.o(viewInflate, "mInflater.inflate(R.layo…er, mRecyclerView, false)");
        if (this.f88548e instanceof XboxAchievementRankActivity) {
            ((TextView) viewInflate.findViewById(R.id.tv_name_header)).setText("昵称");
        }
        t tVar = this.f88546c;
        if (tVar != null) {
            tVar.p(R.layout.item_xbox_friend_header, viewInflate);
        }
    }

    private final void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38428, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f88549f;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.f88546c);
        RecyclerView recyclerView3 = this.f88549f;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.getLayoutParams().height = -2;
    }

    public final void L3(@dl.d XboxFriendInfoWrapper data) {
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 38430, new Class[]{XboxFriendInfoWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        ArrayList<XboxFriendInfo> list = data.getList();
        if (list != null) {
            int size = this.f88547d.size();
            int size2 = list.size();
            this.f88547d.addAll(list);
            t tVar = this.f88546c;
            if (tVar != null) {
                tVar.notifyItemRangeChanged(size, size2);
            }
            showContentView();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void Q3(@dl.d XboxFriendInfoWrapper data) {
        t tVar;
        t tVar2;
        if (PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 38429, new Class[]{XboxFriendInfoWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        this.f88547d.clear();
        XboxFriendInfo user_rank = data.getUser_rank();
        if (user_rank != null) {
            user_rank.setMyself(true);
            this.f88547d.add(user_rank);
        }
        if (data.getList() != null) {
            ArrayList<XboxFriendInfo> list = data.getList();
            f0.m(list);
            if (list.isEmpty()) {
                tVar = this.f88546c;
                if ((tVar == null && tVar.A(R.layout.item_xbox_friend_header)) && (tVar2 = this.f88546c) != null) {
                    tVar2.F(R.layout.item_xbox_friend_header);
                }
            } else {
                t tVar3 = this.f88546c;
                if ((tVar3 == null || tVar3.A(R.layout.item_xbox_friend_header)) ? false : true) {
                    O3();
                }
            }
        } else {
            tVar = this.f88546c;
            if (tVar == null && tVar.A(R.layout.item_xbox_friend_header)) {
                tVar2.F(R.layout.item_xbox_friend_header);
            }
        }
        ArrayList<XboxFriendInfo> list2 = data.getList();
        if (list2 != null) {
            this.f88547d.addAll(list2);
        }
        t tVar4 = this.f88546c;
        if (tVar4 != null) {
            tVar4.notifyDataSetChanged();
        }
        showContentView();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38427, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_rv);
        M3(view);
        N3();
        O3();
        P3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 38426, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            this.f88548e = (a) context;
        }
    }
}
