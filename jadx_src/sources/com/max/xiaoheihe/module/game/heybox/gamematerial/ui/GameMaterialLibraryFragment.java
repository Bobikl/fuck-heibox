package com.max.xiaoheihe.module.game.heybox.gamematerial.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.n0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.UiState;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialLibraryViewModel;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.g9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import kotlin.z;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameMaterialLibraryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMaterialLibraryFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLibraryFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n106#2,15:326\n29#3:341\n5#3,2:342\n22#3:344\n7#3:345\n1855#4,2:346\n*S KotlinDebug\n*F\n+ 1 GameMaterialLibraryFragment.kt\ncom/max/xiaoheihe/module/game/heybox/gamematerial/ui/GameMaterialLibraryFragment\n*L\n43#1:326,15\n112#1:341\n112#1:342,2\n112#1:344\n112#1:345\n293#1:346,2\n*E\n"})
@m(path = lb.d.f131248s1)
@o(parameters = 0)
public final class GameMaterialLibraryFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f87470t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f87471u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f87472v = "topic_id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g9 f87473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private androidx.viewpager.widget.a f87474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final z f87475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f87476s;

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object objInstantiateItem;
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37559, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext)) {
                androidx.viewpager.widget.a aVar = GameMaterialLibraryFragment.this.f87474q;
                if (aVar != null) {
                    g9 g9Var = GameMaterialLibraryFragment.this.f87473p;
                    if (g9Var == null) {
                        f0.S("binding");
                        g9Var = null;
                    }
                    ViewPager viewPager = g9Var.f110885r;
                    g9 g9Var2 = GameMaterialLibraryFragment.this.f87473p;
                    if (g9Var2 == null) {
                        f0.S("binding");
                        g9Var2 = null;
                    }
                    objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, g9Var2.f110885r.getCurrentItem());
                } else {
                    objInstantiateItem = null;
                }
                String strW3 = objInstantiateItem instanceof GameMaterialListFragment ? ((GameMaterialListFragment) objInstantiateItem).W3() : null;
                if (strW3 != null) {
                    GameMaterialLibraryFragment gameMaterialLibraryFragment = GameMaterialLibraryFragment.this;
                    Intent intentN1 = PictureVideoEditPostActivity.N1(gameMaterialLibraryFragment.getContext(), new String[]{strW3}, null, null, GameMaterialLibraryFragment.J4(gameMaterialLibraryFragment).o().getValue(), PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE);
                    intentN1.putExtra(PictureVideoEditPostFragment.f82339h4, 1);
                    ((com.max.hbcommon.base.d) gameMaterialLibraryFragment).mContext.startActivity(intentN1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class c implements HBSecondaryMenuWindowTabLayout.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout.a
        public void a(@dl.e String str, @dl.e String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 37583, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            HBSecondaryMenuWindowTabLayout.a.C0539a.a(this, str, str2);
        }

        @Override // com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout.a
        public void b(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37582, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            GameMaterialLibraryFragment.J4(GameMaterialLibraryFragment.this).r(i10, i11);
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class d extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<KeyDescObj> f87479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends KeyDescObj> list, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f87479l = list;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37585, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f87479l.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37584, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : GameMaterialListFragment.f87507h.a(i10, this.f87479l.get(i10));
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialObj f87480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameMaterialLibraryFragment f87481c;

        /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GameMaterialLibraryFragment f87482a;

            a(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
                this.f87482a = gameMaterialLibraryFragment;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj sortKey) {
                if (PatchProxy.proxy(new Object[]{view, sortKey}, this, changeQuickRedirect, false, 37596, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameMaterialLibraryViewModel gameMaterialLibraryViewModelJ4 = GameMaterialLibraryFragment.J4(this.f87482a);
                f0.o(sortKey, "sortKey");
                gameMaterialLibraryViewModelJ4.u(sortKey);
            }
        }

        e(GameMaterialObj gameMaterialObj, GameMaterialLibraryFragment gameMaterialLibraryFragment) {
            this.f87480b = gameMaterialObj;
            this.f87481c = gameMaterialLibraryFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList<KeyDescObj> sortFilter;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37595, new Class[]{View.class}, Void.TYPE).isSupported || (sortFilter = this.f87480b.getSortFilter()) == null) {
                return;
            }
            GameMaterialLibraryFragment gameMaterialLibraryFragment = this.f87481c;
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((com.max.hbcommon.base.d) gameMaterialLibraryFragment).mContext, sortFilter);
            heyBoxPopupMenu.setTitle(R.string.game_material_filter_sort);
            heyBoxPopupMenu.R(new a(gameMaterialLibraryFragment));
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameMaterialObj f87483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameMaterialLibraryFragment f87484c;

        /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
        public static final class a implements HeyBoxPopupMenu.h {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GameMaterialLibraryFragment f87485a;

            a(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
                this.f87485a = gameMaterialLibraryFragment;
            }

            @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
            public final void a(View view, KeyDescObj sizeKey) {
                if (PatchProxy.proxy(new Object[]{view, sizeKey}, this, changeQuickRedirect, false, 37598, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameMaterialLibraryViewModel gameMaterialLibraryViewModelJ4 = GameMaterialLibraryFragment.J4(this.f87485a);
                f0.o(sizeKey, "sizeKey");
                gameMaterialLibraryViewModelJ4.t(sizeKey);
            }
        }

        f(GameMaterialObj gameMaterialObj, GameMaterialLibraryFragment gameMaterialLibraryFragment) {
            this.f87483b = gameMaterialObj;
            this.f87484c = gameMaterialLibraryFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList<KeyDescObj> sizeFilter;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37597, new Class[]{View.class}, Void.TYPE).isSupported || (sizeFilter = this.f87483b.getSizeFilter()) == null) {
                return;
            }
            GameMaterialLibraryFragment gameMaterialLibraryFragment = this.f87484c;
            HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(((com.max.hbcommon.base.d) gameMaterialLibraryFragment).mContext, sizeFilter);
            heyBoxPopupMenu.setTitle(R.string.game_material_filter_size);
            heyBoxPopupMenu.R(new a(gameMaterialLibraryFragment));
            heyBoxPopupMenu.show();
        }
    }

    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    public static final class g implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f87487b;

        g(boolean z10) {
            this.f87487b = z10;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public final void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 37599, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            float f10 = i10;
            g9 g9Var = GameMaterialLibraryFragment.this.f87473p;
            g9 g9Var2 = null;
            if (g9Var == null) {
                f0.S("binding");
                g9Var = null;
            }
            float fAbs = Math.abs(f10 / g9Var.f110869b.getTotalScrollRange());
            g9 g9Var3 = GameMaterialLibraryFragment.this.f87473p;
            if (g9Var3 == null) {
                f0.S("binding");
                g9Var3 = null;
            }
            g9Var3.f110883p.setAlpha(fAbs);
            double d10 = fAbs;
            int i11 = R.color.text_primary_1_color;
            if (d10 > 0.5d) {
                if (GameMaterialLibraryFragment.this.f87476s) {
                    GameMaterialLibraryFragment.this.f87476s = false;
                    g9 g9Var4 = GameMaterialLibraryFragment.this.f87473p;
                    if (g9Var4 == null) {
                        f0.S("binding");
                        g9Var4 = null;
                    }
                    g9Var4.f110878k.setTitleTextColor(GameMaterialLibraryFragment.this.getResources().getColor(R.color.text_primary_1_color));
                    g9 g9Var5 = GameMaterialLibraryFragment.this.f87473p;
                    if (g9Var5 == null) {
                        f0.S("binding");
                        g9Var5 = null;
                    }
                    g9Var5.f110878k.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    t.M(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext, true);
                    g9 g9Var6 = GameMaterialLibraryFragment.this.f87473p;
                    if (g9Var6 == null) {
                        f0.S("binding");
                    } else {
                        g9Var2 = g9Var6;
                    }
                    g9Var2.f110878k.setContentView(com.max.xiaoheihe.utils.d.r0(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext));
                    return;
                }
                return;
            }
            if (GameMaterialLibraryFragment.this.f87476s) {
                return;
            }
            GameMaterialLibraryFragment.this.f87476s = true;
            g9 g9Var7 = GameMaterialLibraryFragment.this.f87473p;
            if (g9Var7 == null) {
                f0.S("binding");
                g9Var7 = null;
            }
            g9Var7.f110878k.setTitleTextColor(GameMaterialLibraryFragment.this.getResources().getColor(R.color.transparent));
            g9 g9Var8 = GameMaterialLibraryFragment.this.f87473p;
            if (g9Var8 == null) {
                f0.S("binding");
                g9Var8 = null;
            }
            ImageView appbarNavButtonView = g9Var8.f110878k.getAppbarNavButtonView();
            if (this.f87487b) {
                i11 = R.color.text_primary_1_color_night;
            }
            appbarNavButtonView.setColorFilter(com.max.xiaoheihe.utils.d.E(i11));
            t.M(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext, !this.f87487b);
            g9 g9Var9 = GameMaterialLibraryFragment.this.f87473p;
            if (g9Var9 == null) {
                f0.S("binding");
            } else {
                g9Var2 = g9Var9;
            }
            g9Var2.f110878k.setContentView(this.f87487b ? com.max.xiaoheihe.utils.d.s0(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext) : com.max.xiaoheihe.utils.d.r0(((com.max.hbcommon.base.d) GameMaterialLibraryFragment.this).mContext));
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1", f = "GameMaterialLibraryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f87488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f87489c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$1", f = "GameMaterialLibraryFragment.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07941 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87491b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameMaterialLibraryFragment f87492c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$1$a */
            /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
            public static final class a implements kotlinx.coroutines.flow.f<UiState<? extends GameMaterialObj>> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameMaterialLibraryFragment f87493b;

                a(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
                    this.f87493b = gameMaterialLibraryFragment;
                }

                @dl.e
                public final Object a(@dl.d UiState<GameMaterialObj> uiState, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiState, cVar}, this, changeQuickRedirect, false, 37568, new Class[]{UiState.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    if (uiState instanceof UiState.Error) {
                        GameMaterialLibraryFragment.Q4(this.f87493b);
                    } else if (uiState instanceof UiState.Loading) {
                        GameMaterialLibraryFragment.R4(this.f87493b);
                    } else if (uiState instanceof UiState.Success) {
                        GameMaterialLibraryFragment.P4(this.f87493b);
                        GameMaterialLibraryFragment.N4(this.f87493b, (GameMaterialObj) ((UiState.Success) uiState).d());
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(UiState<? extends GameMaterialObj> uiState, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiState, cVar}, this, changeQuickRedirect, false, 37569, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(uiState, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07941(GameMaterialLibraryFragment gameMaterialLibraryFragment, kotlin.coroutines.c<? super C07941> cVar) {
                super(2, cVar);
                this.f87492c = gameMaterialLibraryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37565, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C07941(this.f87492c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37567, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37566, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C07941) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37564, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f87491b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    kotlinx.coroutines.flow.u<UiState<GameMaterialObj>> uVarP = GameMaterialLibraryFragment.J4(this.f87492c).p();
                    a aVar = new a(this.f87492c);
                    this.f87491b = 1;
                    if (uVarP.a(aVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$2", f = "GameMaterialLibraryFragment.kt", i = {}, l = {bb.c.b.f31029x1}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87494b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameMaterialLibraryFragment f87495c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$2$a */
            /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
            public static final class a implements kotlinx.coroutines.flow.f<KeyDescObj> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameMaterialLibraryFragment f87496b;

                a(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
                    this.f87496b = gameMaterialLibraryFragment;
                }

                @dl.e
                public final Object a(@dl.e KeyDescObj keyDescObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37574, new Class[]{KeyDescObj.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    com.max.heybox.hblog.g.f74531b.q("GameMaterialLibraryFragment, sortKey = " + keyDescObj);
                    g9 g9Var = null;
                    if ((keyDescObj != null ? keyDescObj.getDesc() : null) == null) {
                        g9 g9Var2 = this.f87496b.f87473p;
                        if (g9Var2 == null) {
                            f0.S("binding");
                        } else {
                            g9Var = g9Var2;
                        }
                        g9Var.f110872e.setChecked(false);
                    } else {
                        g9 g9Var3 = this.f87496b.f87473p;
                        if (g9Var3 == null) {
                            f0.S("binding");
                            g9Var3 = null;
                        }
                        g9Var3.f110872e.setChecked(!keyDescObj.isIs_default());
                        g9 g9Var4 = this.f87496b.f87473p;
                        if (g9Var4 == null) {
                            f0.S("binding");
                        } else {
                            g9Var = g9Var4;
                        }
                        g9Var.f110872e.setText(keyDescObj.getDesc());
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(KeyDescObj keyDescObj, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37575, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(keyDescObj, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GameMaterialLibraryFragment gameMaterialLibraryFragment, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f87495c = gameMaterialLibraryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37571, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f87495c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37573, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37572, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37570, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f87494b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    kotlinx.coroutines.flow.u<KeyDescObj> uVarN = GameMaterialLibraryFragment.J4(this.f87495c).n();
                    a aVar = new a(this.f87495c);
                    this.f87494b = 1;
                    if (uVarN.a(aVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$3", f = "GameMaterialLibraryFragment.kt", i = {}, l = {bb.c.b.I1}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f87497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ GameMaterialLibraryFragment f87498c;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$registerEvents$1$3$a */
            /* JADX INFO: compiled from: GameMaterialLibraryFragment.kt */
            public static final class a implements kotlinx.coroutines.flow.f<KeyDescObj> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameMaterialLibraryFragment f87499b;

                a(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
                    this.f87499b = gameMaterialLibraryFragment;
                }

                @dl.e
                public final Object a(@dl.e KeyDescObj keyDescObj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37580, new Class[]{KeyDescObj.class, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    g9 g9Var = null;
                    if ((keyDescObj != null ? keyDescObj.getDesc() : null) == null) {
                        g9 g9Var2 = this.f87499b.f87473p;
                        if (g9Var2 == null) {
                            f0.S("binding");
                        } else {
                            g9Var = g9Var2;
                        }
                        g9Var.f110871d.setChecked(false);
                    } else {
                        g9 g9Var3 = this.f87499b.f87473p;
                        if (g9Var3 == null) {
                            f0.S("binding");
                            g9Var3 = null;
                        }
                        g9Var3.f110871d.setChecked(!keyDescObj.isIs_default());
                        g9 g9Var4 = this.f87499b.f87473p;
                        if (g9Var4 == null) {
                            f0.S("binding");
                        } else {
                            g9Var = g9Var4;
                        }
                        g9Var.f110871d.setText(keyDescObj.getDesc());
                    }
                    return b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(KeyDescObj keyDescObj, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, cVar}, this, changeQuickRedirect, false, 37581, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(keyDescObj, cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(GameMaterialLibraryFragment gameMaterialLibraryFragment, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.f87498c = gameMaterialLibraryFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37577, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass3(this.f87498c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37579, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37578, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37576, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f87497b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    kotlinx.coroutines.flow.u<KeyDescObj> uVarM = GameMaterialLibraryFragment.J4(this.f87498c).m();
                    a aVar = new a(this.f87498c);
                    this.f87497b = 1;
                    if (uVarM.a(aVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 37561, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.coroutines.c) patchProxyResultProxy.result;
            }
            AnonymousClass1 anonymousClass1 = GameMaterialLibraryFragment.this.new AnonymousClass1(cVar);
            anonymousClass1.f87489c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37563, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 37562, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37560, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f87488b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            q0 q0Var = (q0) this.f87489c;
            k.f(q0Var, null, null, new C07941(GameMaterialLibraryFragment.this, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass2(GameMaterialLibraryFragment.this, null), 3, null);
            k.f(q0Var, null, null, new AnonymousClass3(GameMaterialLibraryFragment.this, null), 3, null);
            return b2.f124493a;
        }
    }

    public GameMaterialLibraryFragment() {
        final yh.a<Fragment> aVar = new yh.a<Fragment>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37586, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<c1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37587, new Class[0], c1.class);
                return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : (c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37588, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f87475r = FragmentViewModelLazyKt.h(this, kotlin.jvm.internal.n0.d(GameMaterialLibraryViewModel.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37589, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37590, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37592, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37591, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (u2.a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.game.heybox.gamematerial.ui.GameMaterialLibraryFragment$special$$inlined$viewModels$default$5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37593, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37594, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        this.f87476s = true;
    }

    public static final /* synthetic */ GameMaterialLibraryViewModel J4(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialLibraryFragment}, null, changeQuickRedirect, true, 37554, new Class[]{GameMaterialLibraryFragment.class}, GameMaterialLibraryViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialLibraryViewModel) patchProxyResultProxy.result : gameMaterialLibraryFragment.S4();
    }

    public static final /* synthetic */ void N4(GameMaterialLibraryFragment gameMaterialLibraryFragment, GameMaterialObj gameMaterialObj) {
        if (PatchProxy.proxy(new Object[]{gameMaterialLibraryFragment, gameMaterialObj}, null, changeQuickRedirect, true, 37558, new Class[]{GameMaterialLibraryFragment.class, GameMaterialObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialLibraryFragment.U4(gameMaterialObj);
    }

    public static final /* synthetic */ void P4(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialLibraryFragment}, null, changeQuickRedirect, true, 37557, new Class[]{GameMaterialLibraryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialLibraryFragment.showContentView();
    }

    public static final /* synthetic */ void Q4(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialLibraryFragment}, null, changeQuickRedirect, true, 37555, new Class[]{GameMaterialLibraryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialLibraryFragment.showError();
    }

    public static final /* synthetic */ void R4(GameMaterialLibraryFragment gameMaterialLibraryFragment) {
        if (PatchProxy.proxy(new Object[]{gameMaterialLibraryFragment}, null, changeQuickRedirect, true, 37556, new Class[]{GameMaterialLibraryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMaterialLibraryFragment.showLoading();
    }

    private final GameMaterialLibraryViewModel S4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37541, new Class[0], GameMaterialLibraryViewModel.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialLibraryViewModel) patchProxyResultProxy.result : (GameMaterialLibraryViewModel) this.f87475r.getValue();
    }

    private final void T4(GameMaterialObj gameMaterialObj) {
        if (PatchProxy.proxy(new Object[]{gameMaterialObj}, this, changeQuickRedirect, false, 37547, new Class[]{GameMaterialObj.class}, Void.TYPE).isSupported) {
            return;
        }
        g9 g9Var = this.f87473p;
        g9 g9Var2 = null;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        g9Var.f110884q.setVisibility(0);
        g9 g9Var3 = this.f87473p;
        if (g9Var3 == null) {
            f0.S("binding");
            g9Var3 = null;
        }
        g9Var3.f110884q.setText(getText(R.string.game_material_bottom_button_text));
        g9 g9Var4 = this.f87473p;
        if (g9Var4 == null) {
            f0.S("binding");
            g9Var4 = null;
        }
        FloatingPostButton floatingPostButton = g9Var4.f110884q;
        Drawable drawableI = ViewUtils.i(ViewUtils.f(this.mContext, 20.0f), com.max.xiaoheihe.utils.d.e1(gameMaterialObj.getHeaderBgColorStart()), com.max.xiaoheihe.utils.d.e1(gameMaterialObj.getHeaderBgColorEnd()));
        drawableI.setAlpha(bb.c.b.I1);
        floatingPostButton.setBackground(drawableI);
        String avatar = gameMaterialObj.getAvatar();
        if (avatar != null) {
            g9 g9Var5 = this.f87473p;
            if (g9Var5 == null) {
                f0.S("binding");
                g9Var5 = null;
            }
            g9Var5.f110884q.setIconImage(avatar);
        }
        g9 g9Var6 = this.f87473p;
        if (g9Var6 == null) {
            f0.S("binding");
        } else {
            g9Var2 = g9Var6;
        }
        g9Var2.f110884q.setOnClickListener(new b());
    }

    private final void U4(GameMaterialObj gameMaterialObj) {
        if (PatchProxy.proxy(new Object[]{gameMaterialObj}, this, changeQuickRedirect, false, 37545, new Class[]{GameMaterialObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Y4(gameMaterialObj);
        T4(gameMaterialObj);
    }

    private final void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37551, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g9 g9Var = this.f87473p;
        g9 g9Var2 = null;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        ViewGroup.LayoutParams layoutParams = g9Var.f110878k.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t.f73584e;
        if (this.backIconInvisible) {
            g9 g9Var3 = this.f87473p;
            if (g9Var3 == null) {
                f0.S("binding");
                g9Var3 = null;
            }
            g9Var3.f110878k.setBackIconInvisible();
        } else {
            g9 g9Var4 = this.f87473p;
            if (g9Var4 == null) {
                f0.S("binding");
                g9Var4 = null;
            }
            g9Var4.f110878k.setTitleTextColor(getResources().getColor(R.color.aco_orange));
            g9 g9Var5 = this.f87473p;
            if (g9Var5 == null) {
                f0.S("binding");
                g9Var5 = null;
            }
            g9Var5.f110878k.getAppbarNavButtonView().setImageResource(R.drawable.ic_0icon_arrow_24);
            g9 g9Var6 = this.f87473p;
            if (g9Var6 == null) {
                f0.S("binding");
                g9Var6 = null;
            }
            g9Var6.f110878k.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
            g9 g9Var7 = this.f87473p;
            if (g9Var7 == null) {
                f0.S("binding");
                g9Var7 = null;
            }
            g9Var7.f110878k.getAppbarNavButtonView().setPadding(ViewUtils.f(this.mContext, 10.0f), 0, ViewUtils.f(this.mContext, 10.0f), 0);
        }
        g9 g9Var8 = this.f87473p;
        if (g9Var8 == null) {
            f0.S("binding");
            g9Var8 = null;
        }
        g9Var8.f110872e.setImage(R.drawable.common_filter2_filled_24x24);
        g9 g9Var9 = this.f87473p;
        if (g9Var9 == null) {
            f0.S("binding");
        } else {
            g9Var2 = g9Var9;
        }
        g9Var2.f110871d.setImage(R.drawable.common_filter_filled_24x24);
    }

    private final void W4(List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37553, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        g9 g9Var = this.f87473p;
        g9 g9Var2 = null;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        g9Var.f110877j.L();
        for (KeyDescObj keyDescObj : list) {
            g9 g9Var3 = this.f87473p;
            if (g9Var3 == null) {
                f0.S("binding");
                g9Var3 = null;
            }
            HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = g9Var3.f110877j;
            g9 g9Var4 = this.f87473p;
            if (g9Var4 == null) {
                f0.S("binding");
                g9Var4 = null;
            }
            hBSecondaryMenuWindowTabLayout.i(g9Var4.f110877j.I());
        }
        g9 g9Var5 = this.f87473p;
        if (g9Var5 == null) {
            f0.S("binding");
            g9Var5 = null;
        }
        HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout2 = g9Var5.f110877j;
        g9 g9Var6 = this.f87473p;
        if (g9Var6 == null) {
            f0.S("binding");
            g9Var6 = null;
        }
        hBSecondaryMenuWindowTabLayout2.setupWithViewPager(g9Var6.f110885r);
        g9 g9Var7 = this.f87473p;
        if (g9Var7 == null) {
            f0.S("binding");
            g9Var7 = null;
        }
        g9Var7.f110877j.l0(new ArrayList<>(list));
        g9 g9Var8 = this.f87473p;
        if (g9Var8 == null) {
            f0.S("binding");
        } else {
            g9Var2 = g9Var8;
        }
        g9Var2.f110877j.setOnSecondWindowItemCheckedListener(new c());
    }

    private final void X4(List<? extends KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 37552, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f87474q = new d(list, getChildFragmentManager());
        g9 g9Var = this.f87473p;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        g9Var.f110885r.setAdapter(this.f87474q);
    }

    private final void Y4(GameMaterialObj gameMaterialObj) {
        String name;
        if (PatchProxy.proxy(new Object[]{gameMaterialObj}, this, changeQuickRedirect, false, 37546, new Class[]{GameMaterialObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<KeyDescObj> queryFilter = gameMaterialObj.getQueryFilter();
        if (queryFilter != null) {
            X4(queryFilter);
            W4(queryFilter);
        }
        g9 g9Var = this.f87473p;
        g9 g9Var2 = null;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        g9Var.f110872e.setOnClickListener(new e(gameMaterialObj, this));
        g9 g9Var3 = this.f87473p;
        if (g9Var3 == null) {
            f0.S("binding");
            g9Var3 = null;
        }
        g9Var3.f110871d.setOnClickListener(new f(gameMaterialObj, this));
        g9 g9Var4 = this.f87473p;
        if (g9Var4 == null) {
            f0.S("binding");
            g9Var4 = null;
        }
        g9Var4.f110876i.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.e1(gameMaterialObj.getHeaderBgColorStart()), com.max.xiaoheihe.utils.d.e1(gameMaterialObj.getHeaderBgColorEnd())));
        String icon = gameMaterialObj.getIcon();
        g9 g9Var5 = this.f87473p;
        if (g9Var5 == null) {
            f0.S("binding");
            g9Var5 = null;
        }
        com.max.hbimage.b.K(icon, g9Var5.f110874g);
        g9 g9Var6 = this.f87473p;
        if (g9Var6 == null) {
            f0.S("binding");
            g9Var6 = null;
        }
        g9Var6.f110879l.setText(gameMaterialObj.getTitle());
        g9 g9Var7 = this.f87473p;
        if (g9Var7 == null) {
            f0.S("binding");
            g9Var7 = null;
        }
        TextView textView = g9Var7.f110881n;
        v0 v0Var = v0.f124986a;
        String string = getString(R.string.game_material_total_links);
        f0.o(string, "getString(R.string.game_material_total_links)");
        String str = String.format(string, Arrays.copyOf(new Object[]{gameMaterialObj.getTotalCnt()}, 1));
        f0.o(str, "format(format, *args)");
        textView.setText(str);
        g9 g9Var8 = this.f87473p;
        if (g9Var8 == null) {
            f0.S("binding");
            g9Var8 = null;
        }
        TextView textView2 = g9Var8.f110880m;
        String string2 = getString(R.string.game_material_today_links);
        f0.o(string2, "getString(R.string.game_material_today_links)");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{gameMaterialObj.getTodayCnt()}, 1));
        f0.o(str2, "format(format, *args)");
        textView2.setText(str2);
        boolean zG = f0.g(gameMaterialObj.getStatusBarStyle(), AccelWorldLottieKt.f76443a);
        String str3 = "updateHeader, isTextLight = " + zG;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (GameMaterialLibraryFragment.class.isAnonymousClass()) {
            name = GameMaterialLibraryFragment.class.getName();
            f0.m(name);
        } else {
            name = GameMaterialLibraryFragment.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str3);
        aVar.q(sb2.toString());
        if (zG) {
            g9 g9Var9 = this.f87473p;
            if (g9Var9 == null) {
                f0.S("binding");
                g9Var9 = null;
            }
            g9Var9.f110879l.setTextColor(getResources().getColor(R.color.white, null));
            g9 g9Var10 = this.f87473p;
            if (g9Var10 == null) {
                f0.S("binding");
                g9Var10 = null;
            }
            g9Var10.f110881n.setTextColor(getResources().getColor(R.color.white_alpha90, null));
            g9 g9Var11 = this.f87473p;
            if (g9Var11 == null) {
                f0.S("binding");
                g9Var11 = null;
            }
            g9Var11.f110880m.setTextColor(getResources().getColor(R.color.white_alpha90, null));
        } else {
            g9 g9Var12 = this.f87473p;
            if (g9Var12 == null) {
                f0.S("binding");
                g9Var12 = null;
            }
            g9Var12.f110879l.setTextColor(getResources().getColor(R.color.black, null));
            g9 g9Var13 = this.f87473p;
            if (g9Var13 == null) {
                f0.S("binding");
                g9Var13 = null;
            }
            g9Var13.f110881n.setTextColor(getResources().getColor(R.color.black_alpha90, null));
            g9 g9Var14 = this.f87473p;
            if (g9Var14 == null) {
                f0.S("binding");
                g9Var14 = null;
            }
            g9Var14.f110880m.setTextColor(getResources().getColor(R.color.black_alpha90, null));
        }
        t.M(this.mContext, !zG);
        g9 g9Var15 = this.f87473p;
        if (g9Var15 == null) {
            f0.S("binding");
            g9Var15 = null;
        }
        g9Var15.f110878k.setContentView(zG ? com.max.xiaoheihe.utils.d.s0(this.mContext) : com.max.xiaoheihe.utils.d.r0(this.mContext));
        g9 g9Var16 = this.f87473p;
        if (g9Var16 == null) {
            f0.S("binding");
        } else {
            g9Var2 = g9Var16;
        }
        g9Var2.f110869b.e(new g(zG));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("topic_id")) == null) {
            return;
        }
        S4().v(string);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@dl.e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37543, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        g9 g9VarC = g9.c(this.mInflater);
        f0.o(g9VarC, "inflate(mInflater)");
        this.f87473p = g9VarC;
        if (g9VarC == null) {
            f0.S("binding");
            g9VarC = null;
        }
        setContentView(g9VarC);
        V4();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return true;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37548, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        S4().s();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37550, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        S4().s();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void r4(@dl.e TopicInfoObj topicInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37544, new Class[]{TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || topicInfoObj == null) {
            return;
        }
        g9 g9Var = this.f87473p;
        if (g9Var == null) {
            f0.S("binding");
            g9Var = null;
        }
        l4(g9Var.f110878k, topicInfoObj, z10);
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37549, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.registerEvents();
        androidx.lifecycle.z.a(this).g(new AnonymousClass1(null));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean w4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean x4() {
        return false;
    }
}
