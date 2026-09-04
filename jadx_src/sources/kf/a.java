package kf;

import androidx.fragment.app.Fragment;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.xiaoheihe.bean.bbs.BBSCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: PostInteractionListener.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: kf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PostInteractionListener.kt */
    public static final class C1123a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static void a(@d a aVar, @d LinkInfoObj linkInfoObj, @d Map<String, String> params, @d l<? super Boolean, b2> callback) {
            if (PatchProxy.proxy(new Object[]{aVar, linkInfoObj, params, callback}, null, changeQuickRedirect, true, 28502, new Class[]{a.class, LinkInfoObj.class, Map.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(linkInfoObj, "linkInfoObj");
            f0.p(params, "params");
            f0.p(callback, "callback");
        }

        public static boolean b(@d a aVar) {
            return false;
        }

        public static void c(@d a aVar, int i10) {
        }
    }

    @e
    String A();

    void I1();

    void M2(@e String str, @e String str2);

    void R2(int i10);

    @e
    String X();

    void b3(@e String str, int i10);

    @e
    String c3();

    void d(@e ShareImageDialogFragment shareImageDialogFragment);

    void d1(@e Fragment fragment, int i10, @e String str, @e String str2);

    void d3(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7);

    @e
    String getLinkId();

    void h0(@d LinkInfoObj linkInfoObj, @d Map<String, String> map, @d l<? super Boolean, b2> lVar);

    @e
    BBSLinkRecObj i();

    void k(@e String str);

    void l(@e String str, boolean z10);

    void m(@e BBSCommentObj bBSCommentObj, @e BBSCommentObj bBSCommentObj2);

    boolean m0(@e String str);

    void p1();

    void r1(@e BBSUserInfoObj bBSUserInfoObj, @e String str);

    void v(@e String str, @e String str2);

    boolean v0();

    boolean w0();

    void y(@e String str);
}
