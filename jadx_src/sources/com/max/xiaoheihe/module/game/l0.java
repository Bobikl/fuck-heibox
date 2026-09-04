package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import df.l9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameShotPreviewFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class l0 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f87795f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87796g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final String f87797h = "TagGameShotPreviewFragment";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final String f87798i = "game_shot_list";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final String f87799j = "current_index";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l9 f87800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private b f87801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private ArrayList<GameScreenPicShotObj> f87802d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f87803e;

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final l0 a(@dl.d ArrayList<GameScreenPicShotObj> list, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, new Integer(i10)}, this, changeQuickRedirect, false, 33791, new Class[]{ArrayList.class, Integer.TYPE}, l0.class);
            if (patchProxyResultProxy.isSupported) {
                return (l0) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(list, "list");
            l0 l0Var = new l0();
            Bundle bundle = new Bundle();
            bundle.putSerializable(l0.f87798i, list);
            bundle.putInt(l0.f87799j, i10);
            l0Var.setArguments(bundle);
            return l0Var;
        }
    }

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public interface b {
        @dl.e
        List<GameScreenPicShotObj> a();

        int b();

        void refresh();
    }

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public static final class c extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33792, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            l0.this.U3(i10);
            l0.M3(l0.this);
        }
    }

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33793, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0.L3(l0.this);
        }
    }

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public static final class e implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            b bVarO3;
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33794, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported || (bVarO3 = l0.this.O3()) == null) {
                return;
            }
            l0 l0Var = l0.this;
            List<GameScreenPicShotObj> listA = bVarO3.a();
            if (z10) {
                if (listA == null || listA.size() >= bVarO3.b()) {
                    l0Var.N3().f112923b.setChecked(false);
                } else {
                    GameScreenPicShotObj gameScreenPicShotObj = l0Var.getList().get(l0Var.P3());
                    kotlin.jvm.internal.f0.o(gameScreenPicShotObj, "list[index]");
                    listA.add(gameScreenPicShotObj);
                }
            } else if (listA != null) {
                listA.remove(l0Var.getList().get(l0Var.P3()));
            }
            bVarO3.refresh();
        }
    }

    /* JADX INFO: compiled from: GameShotPreviewFragment.kt */
    public static final class f implements View.OnKeyListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 33795, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            l0.L3(l0.this);
            return true;
        }
    }

    public static final /* synthetic */ void L3(l0 l0Var) {
        if (PatchProxy.proxy(new Object[]{l0Var}, null, changeQuickRedirect, true, 33790, new Class[]{l0.class}, Void.TYPE).isSupported) {
            return;
        }
        l0Var.Q3();
    }

    public static final /* synthetic */ void M3(l0 l0Var) {
        if (PatchProxy.proxy(new Object[]{l0Var}, null, changeQuickRedirect, true, 33789, new Class[]{l0.class}, Void.TYPE).isSupported) {
            return;
        }
        l0Var.R3();
    }

    private final void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33788, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getParentFragmentManager().u().I(R.anim.alpha_in, R.anim.alpha_out).N(8194).x(this).n();
    }

    private final void R3() {
        List<GameScreenPicShotObj> listA;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33786, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = N3().f112925d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f87803e + 1);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.f87802d.size());
        textView.setText(sb2.toString());
        N3().f112923b.setOnCheckedChangeListener(null);
        CheckBox checkBox = N3().f112923b;
        b bVar = this.f87801c;
        if (bVar != null && (listA = bVar.a()) != null && listA.contains(this.f87802d.get(this.f87803e))) {
            z10 = true;
        }
        checkBox.setChecked(z10);
        N3().f112923b.setOnCheckedChangeListener(new e());
    }

    @dl.d
    public final l9 N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33781, new Class[0], l9.class);
        if (patchProxyResultProxy.isSupported) {
            return (l9) patchProxyResultProxy.result;
        }
        l9 l9Var = this.f87800b;
        if (l9Var != null) {
            return l9Var;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.e
    public final b O3() {
        return this.f87801c;
    }

    public final int P3() {
        return this.f87803e;
    }

    public final void S3(@dl.d l9 l9Var) {
        if (PatchProxy.proxy(new Object[]{l9Var}, this, changeQuickRedirect, false, 33782, new Class[]{l9.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(l9Var, "<set-?>");
        this.f87800b = l9Var;
    }

    public final void T3(@dl.e b bVar) {
        this.f87801c = bVar;
    }

    public final void U3(int i10) {
        this.f87803e = i10;
    }

    public final void V3(@dl.d ArrayList<GameScreenPicShotObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 33783, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(arrayList, "<set-?>");
        this.f87802d = arrayList;
    }

    public final void W3(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33787, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new f());
    }

    @dl.d
    public final ArrayList<GameScreenPicShotObj> getList() {
        return this.f87802d;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33784, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        l9 l9VarD = l9.d(this.mInflater, null, false);
        kotlin.jvm.internal.f0.o(l9VarD, "inflate(mInflater, null, false)");
        S3(l9VarD);
        setContentView(N3());
        ViewGroup.LayoutParams layoutParams = N3().b().getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.max.hbutils.utils.t.p(getContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(f87798i);
            kotlin.jvm.internal.f0.n(serializable, "null cannot be cast to non-null type java.util.ArrayList<com.max.xiaoheihe.bean.game.GameScreenPicShotObj>{ kotlin.collections.TypeAliasesKt.ArrayList<com.max.xiaoheihe.bean.game.GameScreenPicShotObj> }");
            this.f87802d = (ArrayList) serializable;
            this.f87803e = arguments.getInt(f87799j);
        }
        R3();
        ViewPager2 viewPager2 = N3().f112927f;
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        viewPager2.setAdapter(new com.max.xiaoheihe.module.game.adapter.a0(mContext, this.f87802d));
        N3().f112927f.setCurrentItem(this.f87803e, false);
        N3().f112927f.setOffscreenPageLimit(5);
        N3().f112927f.registerOnPageChangeCallback(new c());
        N3().f112924c.setOnClickListener(new d());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33785, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewRequireView = requireView();
        kotlin.jvm.internal.f0.o(viewRequireView, "requireView()");
        W3(viewRequireView);
    }
}
