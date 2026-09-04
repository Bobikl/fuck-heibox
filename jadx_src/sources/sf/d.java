package sf;

import com.max.commentimagepainter.sharecard.bean.DescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: BuildEmptyDescList.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final ArrayList<DescObj> a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41198, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : CollectionsKt__CollectionsKt.r(new DescObj("", ""), new DescObj("", ""));
    }
}
