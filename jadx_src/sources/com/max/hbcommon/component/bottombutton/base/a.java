package com.max.hbcommon.component.bottombutton.base;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import bb.c;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.component.b;
import com.max.component.g;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseBottomButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({g.class})
public final class a implements g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @d
    public View a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.d.f31491qi, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        BaseBottomButton baseBottomButton = new BaseBottomButton(context);
        baseBottomButton.setText("按钮文案");
        baseBottomButton.setIcon(R.drawable.game_like_filled_24x24);
        baseBottomButton.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
        baseBottomButton.setIconVisible(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Resources resources = context.getResources();
        f0.o(resources, "getResources(...)");
        marginLayoutParams.setMarginStart((int) ShareCardDrawUtilsKt.d(12.0f, resources));
        Resources resources2 = context.getResources();
        f0.o(resources2, "getResources(...)");
        marginLayoutParams.setMarginEnd((int) ShareCardDrawUtilsKt.d(12.0f, resources2));
        baseBottomButton.setLayoutParams(marginLayoutParams);
        return baseBottomButton;
    }

    @Override // com.max.component.g
    @e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/28/1125bdc78813c57d855ca27d47e46f8d.png";
    }

    @Override // com.max.component.g
    @d
    public String c() {
        return "BaseBottomButton";
    }

    @Override // com.max.component.g
    @d
    public String d() {
        return b.f65478e;
    }

    @Override // com.max.component.g
    @d
    public String e() {
        return "BottomButton";
    }
}
