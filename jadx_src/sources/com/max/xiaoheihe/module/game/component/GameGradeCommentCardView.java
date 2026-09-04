package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameDetailsWrapperObj;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.fc;
import df.gc;
import df.hc;
import dl.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameGradeCommentCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameGradeCommentCardView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f86734l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private TYPE f86735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f86736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f86737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f86738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f86739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private String f86740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private GameDetailsWrapperObj f86741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private WeakReference<Fragment> f86742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private String f86743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private l3.c f86744k;

    /* JADX INFO: compiled from: GameGradeCommentCardView.kt */
    public enum TYPE {
        STEAM_OWNED,
        NOT_STEAM,
        STEAM_UNOWNED;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static TYPE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36565, new Class[]{String.class}, TYPE.class);
            return (TYPE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TYPE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36564, new Class[0], TYPE[].class);
            return (TYPE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GameGradeCommentCardView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86745a;

        static {
            int[] iArr = new int[TYPE.valuesCustom().length];
            try {
                iArr[TYPE.STEAM_OWNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TYPE.NOT_STEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TYPE.STEAM_UNOWNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86745a = iArr;
        }
    }

    /* JADX INFO: compiled from: GameGradeCommentCardView.kt */
    public static final class b implements SliceGradeView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.view.slicegradeview.SliceGradeView.a
        public void a(@dl.d View view, int i10) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 36566, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            GameGradeCommentCardView.a(GameGradeCommentCardView.this, i10 + 1);
        }
    }

    /* JADX INFO: compiled from: GameGradeCommentCardView.kt */
    public static final class c implements SliceGradeView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.view.slicegradeview.SliceGradeView.a
        public void a(@dl.d View view, int i10) {
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 36567, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            GameGradeCommentCardView.a(GameGradeCommentCardView.this, i10 + 1);
        }
    }

    /* JADX INFO: compiled from: GameGradeCommentCardView.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86749c;

        d(int i10) {
            this.f86749c = i10;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36568, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameGradeCommentCardView.a(GameGradeCommentCardView.this, this.f86749c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameGradeCommentCardView(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.f86735b = TYPE.STEAM_OWNED;
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameGradeCommentCardView(@dl.d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f86735b = TYPE.STEAM_OWNED;
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameGradeCommentCardView(@dl.d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f86735b = TYPE.STEAM_OWNED;
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameGradeCommentCardView(@dl.d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        this.f86735b = TYPE.STEAM_OWNED;
        i();
    }

    public static final /* synthetic */ void a(GameGradeCommentCardView gameGradeCommentCardView, int i10) {
        if (PatchProxy.proxy(new Object[]{gameGradeCommentCardView, new Integer(i10)}, null, changeQuickRedirect, true, 36563, new Class[]{GameGradeCommentCardView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameGradeCommentCardView.b(i10);
    }

    private final void b(int i10) {
        GameDetailsWrapperObj gameDetailsWrapperObj;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36556, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (gameDetailsWrapperObj = this.f86741h) == null || !i0.e(getContext())) {
            return;
        }
        if (gameDetailsWrapperObj.getUser_comment() != null) {
            Context context = getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k(context, this.f86740g, n.q(gameDetailsWrapperObj.getUser_comment().getScore()), this.f86743j, false).C(2).A();
        } else {
            Context context2 = getContext();
            f0.o(context2, "context");
            com.max.xiaoheihe.base.router.b.k(context2, this.f86740g, i10, this.f86743j, f0.g("1", com.max.hbcache.c.o(com.max.hbcache.c.f66129j0, "1"))).C(1).A();
        }
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36560, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        fc fcVarC = fc.c(LayoutInflater.from(getContext()));
        this.f86744k = fcVarC;
        f0.n(fcVarC, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.GgccvNotSteamBinding");
        LinearLayout linearLayout = fcVarC.f110517c;
        f0.o(linearLayout, "binding.vgPlayed");
        h(this, linearLayout, 0, 2, null);
        fcVarC.f110516b.setOnGradeClickListener(new b());
        LinearLayout linearLayout2 = fcVarC.f110518d;
        f0.o(linearLayout2, "binding.vgWantToPlay");
        h(this, linearLayout2, 0, 2, null);
        fcVarC.f110516b.setEnableSlide(false);
        fcVarC.f110516b.setMinGrade(0);
        fcVarC.f110516b.setGrade(0);
        addView(fcVarC.b());
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        gc gcVarC = gc.c(LayoutInflater.from(getContext()));
        this.f86744k = gcVarC;
        f0.n(gcVarC, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.GgccvSteamOwnedBinding");
        gcVarC.f110935d.setEnableSlide(false);
        gcVarC.f110935d.setMinGrade(0);
        gcVarC.f110935d.setGrade(this.f86737d);
        if (this.f86738e) {
            gcVarC.f110933b.setText("我已评价");
        } else {
            gcVarC.f110933b.setText(com.max.xiaoheihe.utils.d.n0(R.string.game_rating_hint));
            h(this, this, 0, 2, null);
            gcVarC.f110935d.setOnGradeClickListener(new c());
        }
        addView(gcVarC.b());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void f() {
        LinkInfoObj user_comment;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        hc hcVarC = hc.c(LayoutInflater.from(getContext()));
        this.f86744k = hcVarC;
        f0.n(hcVarC, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.GgccvSteamUnownedBinding");
        if (this.f86738e) {
            hcVarC.f111395b.setText("我已想玩");
        } else {
            hcVarC.f111395b.setText("想玩");
        }
        if (this.f86738e) {
            GameDetailsWrapperObj gameDetailsWrapperObj = this.f86741h;
            if (com.max.hbcommon.utils.c.u((gameDetailsWrapperObj == null || (user_comment = gameDetailsWrapperObj.getUser_comment()) == null) ? null : user_comment.getDescription())) {
                hcVarC.f111396c.setVisibility(0);
            } else {
                hcVarC.f111396c.setVisibility(8);
            }
        } else {
            hcVarC.f111396c.setVisibility(0);
        }
        addView(hcVarC.b());
        h(this, this, 0, 2, null);
    }

    private final void g(ViewGroup viewGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 36557, new Class[]{ViewGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        WeakReference<Fragment> weakReference = this.f86742i;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            Log.d("cqtest", "Null Fragment");
        } else {
            Log.d("cqtest", "Has Fragment");
            viewGroup.setOnClickListener(new d(i10));
        }
    }

    static /* synthetic */ void h(GameGradeCommentCardView gameGradeCommentCardView, ViewGroup viewGroup, int i10, int i11, Object obj) {
        Object[] objArr = {gameGradeCommentCardView, viewGroup, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36558, new Class[]{GameGradeCommentCardView.class, ViewGroup.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        gameGradeCommentCardView.g(viewGroup, i10);
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36555, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        removeAllViews();
        int i10 = a.f86745a[this.f86735b.ordinal()];
        if (i10 == 1) {
            e();
        } else if (i10 == 2) {
            d();
        } else {
            if (i10 != 3) {
                return;
            }
            f();
        }
    }

    public final boolean c() {
        return this.f86738e;
    }

    @e
    public final String getAvatar() {
        return this.f86736c;
    }

    @e
    public final WeakReference<Fragment> getFragmentRef() {
        return this.f86742i;
    }

    @e
    public final GameDetailsWrapperObj getGameDetail() {
        return this.f86741h;
    }

    @e
    public final String getGameId() {
        return this.f86740g;
    }

    @e
    public final String getGameType() {
        return this.f86739f;
    }

    public final int getGrade() {
        return this.f86737d;
    }

    @e
    public final String getPlatform() {
        return this.f86743j;
    }

    @dl.d
    public final TYPE getStyle() {
        return this.f86735b;
    }

    public final void setAvatar(@e String str) {
        this.f86736c = str;
    }

    public final void setCommentHint(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36562, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        l3.c cVar = this.f86744k;
        if (cVar instanceof gc) {
            f0.n(cVar, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.GgccvSteamOwnedBinding");
            ((gc) cVar).f110933b.setText(str);
        } else if (cVar instanceof hc) {
            f0.n(cVar, "null cannot be cast to non-null type com.max.xiaoheihe.databinding.GgccvSteamUnownedBinding");
            ((hc) cVar).f111395b.setText(str);
        }
    }

    public final void setCommented(boolean z10) {
        this.f86738e = z10;
    }

    public final void setFragmentRef(@e WeakReference<Fragment> weakReference) {
        this.f86742i = weakReference;
    }

    public final void setGameDetail(@e GameDetailsWrapperObj gameDetailsWrapperObj) {
        this.f86741h = gameDetailsWrapperObj;
    }

    public final void setGameId(@e String str) {
        this.f86740g = str;
    }

    public final void setGameType(@e String str) {
        this.f86739f = str;
    }

    public final void setGrade(int i10) {
        this.f86737d = i10;
    }

    public final void setPlatform(@e String str) {
        this.f86743j = str;
    }

    public final void setStyle(@dl.d TYPE value) {
        if (PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, 36554, new Class[]{TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(value, "value");
        this.f86735b = value;
        i();
    }
}
