package sf;

import com.max.hbcommon.component.bottomsheet.BottomSheetsPictureShare;
import com.max.hbcommon.component.bottomsheet.h;
import com.max.hbcommon.component.bottomsheet.i;
import com.max.hbcommon.component.bottomsheet.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.x70;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuildBottomSheet.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final h a(@dl.d ShareWindowObj windowInfo, @dl.d x70 sharePanelViewBinding) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowInfo, sharePanelViewBinding}, null, changeQuickRedirect, true, 41195, new Class[]{ShareWindowObj.class, x70.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        f0.p(windowInfo, "windowInfo");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        i iVar = new i();
        iVar.e(R.drawable.bottom_sheets_key_discount_28x28).h(R.drawable.bottom_sheets_broken_coupon_80x80).f(false).k(true).g(a.a(windowInfo)).i(sharePanelViewBinding.b());
        return iVar.a();
    }

    @dl.d
    public static final BottomSheetsPictureShare b(@dl.d ShareWindowObj windowInfo, @dl.d x70 sharePanelViewBinding) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowInfo, sharePanelViewBinding}, null, changeQuickRedirect, true, 41196, new Class[]{ShareWindowObj.class, x70.class}, BottomSheetsPictureShare.class);
        if (patchProxyResultProxy.isSupported) {
            return (BottomSheetsPictureShare) patchProxyResultProxy.result;
        }
        f0.p(windowInfo, "windowInfo");
        f0.p(sharePanelViewBinding, "sharePanelViewBinding");
        s sVar = new s();
        sVar.h(true).e(a.a(windowInfo)).f(sharePanelViewBinding.b());
        return sVar.a();
    }
}
