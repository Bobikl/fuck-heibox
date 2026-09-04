package sf;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.y;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.commentimagepainter.sharecard.bean.AccountInfoObj;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.ColorInfoObj;
import com.max.commentimagepainter.sharecard.bean.DescObj;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BuildShareBitmap.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nBuildShareBitmap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildShareBitmap.kt\ncom/max/xiaoheihe/module/mall/cardshare/base/factory/elements/BuildShareBitmapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1864#2,3:46\n*S KotlinDebug\n*F\n+ 1 BuildShareBitmap.kt\ncom/max/xiaoheihe/module/mall/cardshare/base/factory/elements/BuildShareBitmapKt\n*L\n19#1:46,3\n*E\n"})
public final class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    public static final Object a(@dl.d y yVar, @dl.d Context context, @dl.d CardObj cardObj, @dl.d ShareInfoObj shareInfoObj, @dl.d kotlin.coroutines.c<? super Bitmap> cVar) {
        String top;
        String bottom_grad;
        String avatar;
        String username;
        String bottom;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{yVar, context, cardObj, shareInfoObj, cVar}, null, changeQuickRedirect, true, 41200, new Class[]{y.class, Context.class, CardObj.class, ShareInfoObj.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        List<DescObj> descs = cardObj.getDescs();
        ArrayList<DescObj> arrayListA = d.a();
        if (descs != null) {
            int i10 = 0;
            for (Object obj : descs) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                DescObj descObj = (DescObj) obj;
                if (i10 < 2) {
                    arrayListA.get(i10).setDesc(descObj.getDesc());
                    arrayListA.get(i10).setValue(descObj.getValue());
                }
                i10 = i11;
            }
        }
        ColorInfoObj color_v2 = cardObj.getColor_v2();
        String str = "#CCCCCC";
        if (color_v2 == null || (top = color_v2.getTop()) == null) {
            top = "#CCCCCC";
        }
        int iD = com.max.hbutils.utils.a.d(top);
        ColorInfoObj color_v3 = cardObj.getColor_v2();
        if (color_v3 != null && (bottom = color_v3.getBottom()) != null) {
            str = bottom;
        }
        int iD2 = com.max.hbutils.utils.a.d(str);
        ColorInfoObj color_v4 = cardObj.getColor_v2();
        if (color_v4 == null || (bottom_grad = color_v4.getBottom_grad()) == null) {
            bottom_grad = "#00000000";
        }
        int iD3 = com.max.hbutils.utils.a.d(bottom_grad);
        String share_url = shareInfoObj.getShare_url();
        if (share_url == null) {
            share_url = "";
        }
        String name = cardObj.getName();
        if (name == null) {
            name = "";
        }
        String card_id = cardObj.getCard_id();
        if (card_id == null) {
            card_id = "";
        }
        AccountInfoObj account_info = cardObj.getAccount_info();
        if (account_info == null || (avatar = account_info.getAvatar()) == null) {
            avatar = "";
        }
        AccountInfoObj account_info2 = cardObj.getAccount_info();
        if (account_info2 == null || (username = account_info2.getUsername()) == null) {
            username = "";
        }
        String desc = arrayListA.get(0).getDesc();
        if (desc == null) {
            desc = "";
        }
        String value = arrayListA.get(0).getValue();
        String str2 = value == null ? "" : value;
        String desc2 = arrayListA.get(1).getDesc();
        String str3 = desc2 == null ? "" : desc2;
        String value2 = arrayListA.get(1).getValue();
        String str4 = value2 == null ? "" : value2;
        String img = cardObj.getImg();
        return ShareCardDrawUtilsKt.i(iD, iD2, iD3, share_url, name, card_id, avatar, username, desc, str2, str3, str4, img == null ? "" : img, l.d(300, context), l.d(bb.c.b.f30628f7, context), yVar, context, cVar);
    }
}
