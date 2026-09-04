package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.chat.component.ChatRoomAvatarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFriendsChatRoomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ak implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f108583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ChatRoomAvatarView f108587e;

    private ak(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ChatRoomAvatarView chatRoomAvatarView) {
        this.f108583a = cardView;
        this.f108584b = imageView;
        this.f108585c = textView;
        this.f108586d = textView2;
        this.f108587e = chatRoomAvatarView;
    }

    @androidx.annotation.n0
    public static ak a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18423, new Class[]{View.class}, ak.class);
        if (patchProxyResultProxy.isSupported) {
            return (ak) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_speak;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_speak);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_title;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                if (textView2 != null) {
                    i10 = R.id.v_chat_room_avatar;
                    ChatRoomAvatarView chatRoomAvatarView = (ChatRoomAvatarView) l3.d.a(view, R.id.v_chat_room_avatar);
                    if (chatRoomAvatarView != null) {
                        return new ak((CardView) view, imageView, textView, textView2, chatRoomAvatarView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ak c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18421, new Class[]{LayoutInflater.class}, ak.class);
        return patchProxyResultProxy.isSupported ? (ak) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ak d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18422, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ak.class);
        if (patchProxyResultProxy.isSupported) {
            return (ak) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_friends_chat_room, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f108583a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18424, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
