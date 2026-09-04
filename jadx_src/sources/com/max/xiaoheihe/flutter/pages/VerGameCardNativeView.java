package com.max.xiaoheihe.flutter.pages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.flutter.nativeview.NativeViewBinder;
import com.max.xiaoheihe.flutter.nativeview.NativeViewBinderKt;
import com.max.xiaoheihe.module.game.component.VerGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import df.c10;
import dl.d;
import dl.e;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.f;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerGameCardNativeViewFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VerGameCardNativeView implements PlatformView {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final Context mContext;

    @d
    private final View rootView;

    public VerGameCardNativeView(@d Context mContext, int i10, @e Map<String, ? extends Object> map) {
        f0.p(mContext, "mContext");
        this.mContext = mContext;
        VerGameCardView verGameCardView = c10.d(LayoutInflater.from(mContext), null, false).f109122b;
        f0.o(verGameCardView, "inflate(\n            Lay…lse\n        ).verGameCard");
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VerGameCardScrollNativeView  creationParams = ");
        sb2.append(map);
        sb2.append(' ');
        sb2.append(map != null ? map.get("data") : null);
        aVar.q(sb2.toString());
        Object obj = map != null ? map.get("data") : null;
        if (obj instanceof String) {
            Object objA = k.a((String) obj, GameCardObj.class);
            f0.o(objA, "deserialize(dataStr, GameCardObj::class.java)");
            GameCardObj gameCardObj = (GameCardObj) objA;
            NativeViewBinder nativeViewBinder = NativeViewBinderKt.getNativeViewBinder(mContext, this);
            if (nativeViewBinder != null) {
                nativeViewBinder.onViewBind(verGameCardView, gameCardObj);
            }
        }
        this.rootView = verGameCardView;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @d
    public final Context getMContext() {
        return this.mContext;
    }

    @d
    public final View getRootView() {
        return this.rootView;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    @d
    public View getView() {
        return this.rootView;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onFlutterViewAttached(View view) {
        f.a(this, view);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onFlutterViewDetached() {
        f.b(this);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onInputConnectionLocked() {
        f.c(this);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public /* synthetic */ void onInputConnectionUnlocked() {
        f.d(this);
    }
}
