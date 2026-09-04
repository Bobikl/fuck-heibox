package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.component.NumberCheckView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameScreenPicShotObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GameScreenShotAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class y extends com.max.hbcommon.base.adapter.s<GameScreenPicShotObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f86411k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f86412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ArrayList<GameScreenPicShotObj> f86413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f86414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f86415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f86416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f86417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<GameScreenPicShotObj> f86418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f86419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private a f86420j;

    /* JADX INFO: compiled from: GameScreenShotAdapter.kt */
    public interface a {
        void a(boolean z10, int i10);

        void b(int i10, @dl.d ImageView imageView);
    }

    /* JADX INFO: compiled from: GameScreenShotAdapter.kt */
    public static final class b implements NumberCheckView.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GameScreenPicShotObj f86421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f86422b;

        b(GameScreenPicShotObj gameScreenPicShotObj, y yVar) {
            this.f86421a = gameScreenPicShotObj;
            this.f86422b = yVar;
        }

        @Override // com.max.hbcommon.component.NumberCheckView.b
        public boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35667, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return this.f86422b.m().size() < this.f86422b.q();
        }

        @Override // com.max.hbcommon.component.NumberCheckView.b
        public void b(boolean z10) {
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35666, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f86421a.setChecked(z10);
            if (!z10) {
                this.f86422b.m().remove(this.f86421a);
                this.f86422b.notifyDataSetChanged();
            } else if (!this.f86422b.m().contains(this.f86421a)) {
                this.f86422b.m().add(this.f86421a);
            }
            a aVarR = this.f86422b.r();
            if (aVarR != null) {
                aVarR.a(z10, this.f86422b.m().size());
            }
        }

        @Override // com.max.hbcommon.component.NumberCheckView.b
        public int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35668, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f86422b.m().size();
        }
    }

    /* JADX INFO: compiled from: GameScreenShotAdapter.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NumberCheckView f86424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f86426e;

        c(NumberCheckView numberCheckView, com.max.hbcommon.base.adapter.s.e eVar, ImageView imageView) {
            this.f86424c = numberCheckView;
            this.f86425d = eVar;
            this.f86426e = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35669, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (y.this.s() && y.this.u()) {
                this.f86424c.performClick();
                return;
            }
            a aVarR = y.this.r();
            if (aVarR != null) {
                int absoluteAdapterPosition = this.f86425d.getAbsoluteAdapterPosition();
                ImageView iv_img = this.f86426e;
                kotlin.jvm.internal.f0.o(iv_img, "iv_img");
                aVarR.b(absoluteAdapterPosition, iv_img);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d Context context, @dl.d ArrayList<GameScreenPicShotObj> list, int i10, int i11) {
        super(context, list, R.layout.item_game_screen_shot);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f86412b = context;
        this.f86413c = list;
        this.f86414d = i10;
        this.f86415e = i11;
        this.f86418h = new ArrayList();
        this.f86419i = 9;
    }

    @dl.d
    public final List<GameScreenPicShotObj> m() {
        return this.f86418h;
    }

    @dl.d
    public final Context n() {
        return this.f86412b;
    }

    @dl.d
    public final ArrayList<GameScreenPicShotObj> o() {
        return this.f86413c;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameScreenPicShotObj gameScreenPicShotObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameScreenPicShotObj}, this, changeQuickRedirect, false, 35665, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        v(eVar, gameScreenPicShotObj);
    }

    public final int p() {
        return this.f86415e;
    }

    public final int q() {
        return this.f86419i;
    }

    @dl.e
    public final a r() {
        return this.f86420j;
    }

    public final boolean s() {
        return this.f86416f;
    }

    public final int t() {
        return this.f86414d;
    }

    public final boolean u() {
        return this.f86417g;
    }

    public void v(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameScreenPicShotObj gameScreenPicShotObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameScreenPicShotObj}, this, changeQuickRedirect, false, 35664, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameScreenPicShotObj.class}, Void.TYPE).isSupported || eVar == null || gameScreenPicShotObj == null) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_desc);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_icon);
        TextView textView = (TextView) eVar.i(R.id.tv_desc);
        NumberCheckView numberCheckView = (NumberCheckView) eVar.i(R.id.ncv_check);
        ViewGroup viewGroup2 = (ViewGroup) eVar.i(R.id.vg_container);
        if (this.f86416f) {
            numberCheckView.setVisibility(0);
            numberCheckView.setOnCheckedChangeListener(new b(gameScreenPicShotObj, this));
            int iIndexOf = this.f86418h.indexOf(gameScreenPicShotObj) + 1;
            if (iIndexOf <= 0) {
                iIndexOf = -1;
            }
            numberCheckView.setCheckNumber(iIndexOf, false);
        } else {
            numberCheckView.setVisibility(8);
        }
        if (com.max.hbcommon.utils.c.u(gameScreenPicShotObj.getDesc())) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            textView.setText(gameScreenPicShotObj.getDesc());
            if (com.max.hbcommon.utils.c.u(gameScreenPicShotObj.getIcon())) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                com.max.hbimage.b.L(gameScreenPicShotObj.getIcon(), imageView2, R.drawable.default_game_avatar_351x351);
            }
        }
        viewGroup2.getLayoutParams().height = (((ViewUtils.L(this.f86412b) - ViewUtils.f(this.f86412b, this.f86414d + (this.f86415e * 2.0f))) * 9) / 2) / 16;
        com.max.hbimage.b.L(gameScreenPicShotObj.getThumb(), imageView, R.drawable.default_game_avater_351x150);
        eVar.itemView.setOnClickListener(new c(numberCheckView, eVar, imageView));
    }

    public final void w(int i10) {
        this.f86419i = i10;
    }

    public final void x(@dl.e a aVar) {
        this.f86420j = aVar;
    }

    public final void y(boolean z10) {
        this.f86416f = z10;
    }

    public final void z(boolean z10) {
        this.f86417g = z10;
    }
}
