package eb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bb.c;
import com.max.component.g;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomButtonLeftItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({g.class})
public final class b implements g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @d
    public View a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.d.Qh, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        BottomButtonLeftItemView bottomButtonLeftItemView = new BottomButtonLeftItemView(context);
        bottomButtonLeftItemView.setShowLeftButton(true);
        bottomButtonLeftItemView.setShowRightButton(true);
        bottomButtonLeftItemView.k(true);
        BaseBottomButton leftButton = bottomButtonLeftItemView.getLeftButton();
        if (leftButton != null) {
            leftButton.setText("左侧按钮");
            leftButton.setIcon(R.drawable.game_like_filled_24x24);
            leftButton.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayBlack);
            leftButton.setIconVisible(true);
        }
        BaseBottomButton rightbutton = bottomButtonLeftItemView.getRightbutton();
        if (rightbutton != null) {
            rightbutton.setText("右侧按钮");
            rightbutton.setIcon(R.drawable.game_like_filled_24x24);
            rightbutton.setButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
            rightbutton.setIconVisible(true);
        }
        bottomButtonLeftItemView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return bottomButtonLeftItemView;
    }

    @Override // com.max.component.g
    @e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/28/5a3528469eb81f9ca2edc8da3dd34edd.png";
    }

    @Override // com.max.component.g
    @d
    public String c() {
        return "BottomButtonLeftItemView";
    }

    @Override // com.max.component.g
    @d
    public String d() {
        return com.max.component.b.f65478e;
    }

    @Override // com.max.component.g
    @d
    public String e() {
        return "BottomBar";
    }
}
