package com.max.xiaoheihe.module.game.adapter.recommend.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.flutter.nativeview.NativeViewBinder;
import com.max.xiaoheihe.module.game.component.VerGameCardView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerGameCardDataBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d implements NativeViewBinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86347b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private Context f86348a;

    /* JADX INFO: compiled from: VerGameCardDataBinder.kt */
    public static final class a implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f86350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f86351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f86352d;

        a(boolean z10, View view, Object obj) {
            this.f86350b = z10;
            this.f86351c = view;
            this.f86352d = obj;
        }

        @Override // com.max.hbimage.b.q
        public void a(@e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36213, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            d.b(d.this, this.f86350b, (VerGameCardView) this.f86351c, drawable, com.max.xiaoheihe.utils.d.e1(((GameCardObj) this.f86352d).getColor()));
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36214, new Class[]{Drawable.class}, Void.TYPE).isSupported || drawable == null) {
                return;
            }
            d.b(d.this, this.f86350b, (VerGameCardView) this.f86351c, drawable, com.max.xiaoheihe.utils.d.e1(((GameCardObj) this.f86352d).getColor()));
        }
    }

    /* JADX INFO: compiled from: VerGameCardDataBinder.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VerGameCardView f86353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f86355d;

        /* JADX INFO: compiled from: VerGameCardDataBinder.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f86356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ VerGameCardView f86357c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f86358d;

            a(d dVar, VerGameCardView verGameCardView, int i10) {
                this.f86356b = dVar;
                this.f86357c = verGameCardView;
                this.f86358d = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36216, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d.a(this.f86356b, this.f86357c, this.f86358d);
            }
        }

        b(VerGameCardView verGameCardView, int i10, d dVar) {
            this.f86353b = verGameCardView;
            this.f86354c = i10;
            this.f86355d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36215, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f86353b.getIv_bg().getMeasuredWidth() <= 0 || this.f86353b.getIv_bg().getMeasuredHeight() <= 0) {
                VerGameCardView verGameCardView = this.f86353b;
                verGameCardView.post(new a(this.f86355d, verGameCardView, this.f86354c));
                return;
            }
            VerGameCardView verGameCardView2 = this.f86353b;
            int i10 = this.f86354c;
            Bitmap bitmapR6 = WebviewFragment.R6(verGameCardView2.getIv_bg());
            f0.o(bitmapR6, "getViewBitmap(game_card.iv_bg)");
            verGameCardView2.setBottomBlur(i10, bitmapR6);
        }
    }

    public d(@dl.d Context context) {
        f0.p(context, "context");
        this.f86348a = context;
    }

    public static final /* synthetic */ void a(d dVar, VerGameCardView verGameCardView, int i10) {
        if (PatchProxy.proxy(new Object[]{dVar, verGameCardView, new Integer(i10)}, null, changeQuickRedirect, true, 36211, new Class[]{d.class, VerGameCardView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dVar.e(verGameCardView, i10);
    }

    public static final /* synthetic */ void b(d dVar, boolean z10, VerGameCardView verGameCardView, Drawable drawable, int i10) {
        if (PatchProxy.proxy(new Object[]{dVar, new Byte(z10 ? (byte) 1 : (byte) 0), verGameCardView, drawable, new Integer(i10)}, null, changeQuickRedirect, true, 36212, new Class[]{d.class, Boolean.TYPE, VerGameCardView.class, Drawable.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dVar.f(z10, verGameCardView, drawable, i10);
    }

    private final void d(ImageView imageView, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{imageView, bitmap}, this, changeQuickRedirect, false, 36210, new Class[]{ImageView.class, Bitmap.class}, Void.TYPE).isSupported || bitmap == null) {
            return;
        }
        zb.b bVar = new zb.b();
        bVar.f141959a = bitmap.getWidth();
        bVar.f141960b = bitmap.getHeight();
        bVar.f141962d = 3;
        imageView.setImageBitmap(zb.a.b(this.f86348a, bitmap, bVar));
    }

    private final void e(VerGameCardView verGameCardView, int i10) {
        if (PatchProxy.proxy(new Object[]{verGameCardView, new Integer(i10)}, this, changeQuickRedirect, false, 36209, new Class[]{VerGameCardView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        verGameCardView.post(new b(verGameCardView, i10, this));
    }

    private final void f(boolean z10, VerGameCardView verGameCardView, Drawable drawable, int i10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), verGameCardView, drawable, new Integer(i10)}, this, changeQuickRedirect, false, 36208, new Class[]{Boolean.TYPE, VerGameCardView.class, Drawable.class, Integer.TYPE}, Void.TYPE).isSupported || drawable == null) {
            return;
        }
        if (z10) {
            verGameCardView.getIv_bg().setImageDrawable(drawable);
        } else {
            verGameCardView.getIv_middle().setImageDrawable(drawable);
            d(verGameCardView.getIv_bg(), com.max.mediaselector.lib.utils.c.e(drawable, ViewUtils.L(BaseApplication.a())));
        }
        e(verGameCardView, i10);
    }

    @dl.d
    public final Context c() {
        return this.f86348a;
    }

    public final void g(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 36206, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.f86348a = context;
    }

    @Override // com.max.xiaoheihe.flutter.nativeview.NativeViewBinder
    public void onViewBind(@dl.d View ver_game_card, @dl.d Object gameCard) {
        if (PatchProxy.proxy(new Object[]{ver_game_card, gameCard}, this, changeQuickRedirect, false, 36207, new Class[]{View.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ver_game_card, "ver_game_card");
        f0.p(gameCard, "gameCard");
        if ((gameCard instanceof GameCardObj) && (ver_game_card instanceof VerGameCardView)) {
            GameCardObj gameCardObj = (GameCardObj) gameCard;
            boolean zG = f0.g("1", gameCardObj.getImg_vertical());
            VerGameCardView verGameCardView = (VerGameCardView) ver_game_card;
            verGameCardView.setType(zG ? VerGameCardView.Type.VERTICAL : VerGameCardView.Type.HORIZONTAL);
            verGameCardView.setRadius(ViewUtils.o(this.f86348a, verGameCardView));
            verGameCardView.getIv_bg().setImageResource(R.drawable.default_game_avater_200x300);
            com.max.hbimage.b.X(this.f86348a, zG ? verGameCardView.getIv_bg() : verGameCardView.getIv_middle(), gameCardObj.getImg(), new a(zG, ver_game_card, gameCard));
            RecommendGameListItemObj game = gameCardObj.getGame();
            verGameCardView.setScore(game != null ? game.getScore() : null);
            RecommendGameListItemObj game2 = gameCardObj.getGame();
            verGameCardView.setGameName(game2 != null ? game2.getGame_name() : null);
            RecommendGameListItemObj game3 = gameCardObj.getGame();
            verGameCardView.i(game3 != null ? game3.getHb_rich_texts() : null);
            verGameCardView.setGamePrice(r1.w(gameCardObj.getGame()));
            RecommendGameListItemObj game4 = gameCardObj.getGame();
            verGameCardView.setDeadlineDate(game4 != null ? game4.getPrice() : null);
            r1.e2(verGameCardView, gameCardObj.getGame(), null);
        }
    }
}
