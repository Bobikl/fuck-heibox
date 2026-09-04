package com.max.xiaoheihe.module.chat.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import bb.d;
import com.max.accelworld.c;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.chat.FriendsChatRoomObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.j50;
import df.k50;
import df.l50;
import df.m50;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ChatRoomAvatarView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class ChatRoomAvatarView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f83537n = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f83538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f83539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FrameLayout f83540m;

    public ChatRoomAvatarView(@e Context context) {
        this(context, null);
    }

    public ChatRoomAvatarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomAvatarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f83538k = 50.0f;
        this.f83539l = 28.0f;
        j();
    }

    private final void h(FrameLayout frameLayout, int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{frameLayout, new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 31425, new Class[]{FrameLayout.class, Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k(frameLayout, f10);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView.setGravity(17);
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(d.a().b(5));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('+');
        sb2.append(Math.min(i10 - 3, 99));
        textView.setText(sb2.toString());
        textView.setTextColor(-1);
        frameLayout.addView(textView);
    }

    private final void i(FrameLayout frameLayout, String str, float f10) {
        if (PatchProxy.proxy(new Object[]{frameLayout, str, new Float(f10)}, this, changeQuickRedirect, false, 31424, new Class[]{FrameLayout.class, String.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        k(frameLayout, f10);
        ImageView imageView = new ImageView(getContext());
        frameLayout.addView(imageView);
        Context context = imageView.getContext();
        f0.o(context, "context");
        int iA = (int) c.a(f10 - 8.0f, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        b.H(str, imageView);
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31421, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
        Context context = getContext();
        f0.o(context, "context");
        setRadius(c.a(8.0f, context));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(ViewUtils.w(0, com.max.xiaoheihe.utils.d.E(R.color.heybox_voice_avatar_start_bg_color), com.max.xiaoheihe.utils.d.E(R.color.heybox_voice_avatar_end_bg_color), GradientDrawable.Orientation.LEFT_RIGHT));
        setFlContainer(frameLayout);
        addView(getFlContainer(), new FrameLayout.LayoutParams(-1, -1));
    }

    private final void k(FrameLayout frameLayout, float f10) {
        if (PatchProxy.proxy(new Object[]{frameLayout, new Float(f10)}, this, changeQuickRedirect, false, 31426, new Class[]{FrameLayout.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l.q(frameLayout, R.color.heybox_voice_process_bar_track_color, f10 / 2.0f);
        View view = new View(getContext());
        float f11 = f10 - 4.0f;
        Context context = view.getContext();
        f0.o(context, "context");
        int iA = (int) c.a(f11, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        l.q(view, R.color.heybox_voice_avatar_black_bg_color, f11 / 2.0f);
        frameLayout.addView(view);
    }

    private final void l(FrameLayout frameLayout, String str, int i10, int i11, int i12) {
        Object[] objArr = {frameLayout, str, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31423, new Class[]{FrameLayout.class, String.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        frameLayout.removeAllViews();
        if (i11 == 1) {
            i(frameLayout, str, this.f83538k);
        } else if (i10 + 1 != 4 || i12 <= 4) {
            i(frameLayout, str, this.f83539l);
        } else {
            h(frameLayout, i12, this.f83539l);
        }
    }

    @dl.d
    public final FrameLayout getFlContainer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31419, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f83540m;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("flContainer");
        return null;
    }

    public final void setData(@e FriendsChatRoomObj friendsChatRoomObj) {
        View view;
        View view2;
        if (PatchProxy.proxy(new Object[]{friendsChatRoomObj}, this, changeQuickRedirect, false, 31422, new Class[]{FriendsChatRoomObj.class}, Void.TYPE).isSupported) {
            return;
        }
        getFlContainer().removeAllViews();
        if (friendsChatRoomObj != null) {
            int iQ = n.q(friendsChatRoomObj.getCount());
            List<String> users_avatar = friendsChatRoomObj.getUsers_avatar();
            int size = users_avatar != null ? users_avatar.size() : 0;
            if (iQ > 0 && size > 0) {
                if (size != 1) {
                    if (size == 2) {
                        Context context = getContext();
                        f0.o(context, "context");
                        m50 m50VarC = m50.c(kb.c.d(context));
                        FrameLayout vgAvatar1 = m50VarC.f113294b;
                        f0.o(vgAvatar1, "vgAvatar1");
                        List<String> users_avatar2 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar2);
                        int i10 = size;
                        l(vgAvatar1, users_avatar2.get(0), 0, i10, iQ);
                        FrameLayout vgAvatar2 = m50VarC.f113295c;
                        f0.o(vgAvatar2, "vgAvatar2");
                        List<String> users_avatar3 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar3);
                        l(vgAvatar2, users_avatar3.get(1), 1, i10, iQ);
                        LinearLayout linearLayoutB = m50VarC.b();
                        f0.o(linearLayoutB, "{\n                      …oot\n                    }");
                        view2 = linearLayoutB;
                    } else if (size != 3) {
                        Context context2 = getContext();
                        f0.o(context2, "context");
                        j50 j50VarC = j50.c(kb.c.d(context2));
                        FrameLayout vgAvatar3 = j50VarC.f112020b;
                        f0.o(vgAvatar3, "vgAvatar1");
                        List<String> users_avatar4 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar4);
                        int i11 = size;
                        l(vgAvatar3, users_avatar4.get(0), 0, i11, iQ);
                        FrameLayout vgAvatar4 = j50VarC.f112021c;
                        f0.o(vgAvatar4, "vgAvatar2");
                        List<String> users_avatar5 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar5);
                        l(vgAvatar4, users_avatar5.get(1), 1, i11, iQ);
                        FrameLayout vgAvatar5 = j50VarC.f112022d;
                        f0.o(vgAvatar5, "vgAvatar3");
                        List<String> users_avatar6 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar6);
                        l(vgAvatar5, users_avatar6.get(2), 2, i11, iQ);
                        FrameLayout vgAvatar6 = j50VarC.f112023e;
                        f0.o(vgAvatar6, "vgAvatar4");
                        List<String> users_avatar7 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar7);
                        l(vgAvatar6, users_avatar7.get(3), 3, i11, iQ);
                        ConstraintLayout constraintLayoutB = j50VarC.b();
                        f0.o(constraintLayoutB, "{\n                      …oot\n                    }");
                        view2 = constraintLayoutB;
                    } else {
                        Context context3 = getContext();
                        f0.o(context3, "context");
                        l50 l50VarC = l50.c(kb.c.d(context3));
                        FrameLayout vgAvatar7 = l50VarC.f112872b;
                        f0.o(vgAvatar7, "vgAvatar1");
                        List<String> users_avatar8 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar8);
                        int i12 = size;
                        l(vgAvatar7, users_avatar8.get(0), 0, i12, iQ);
                        FrameLayout vgAvatar8 = l50VarC.f112873c;
                        f0.o(vgAvatar8, "vgAvatar2");
                        List<String> users_avatar9 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar9);
                        l(vgAvatar8, users_avatar9.get(1), 1, i12, iQ);
                        FrameLayout vgAvatar9 = l50VarC.f112874d;
                        f0.o(vgAvatar9, "vgAvatar3");
                        List<String> users_avatar10 = friendsChatRoomObj.getUsers_avatar();
                        f0.m(users_avatar10);
                        l(vgAvatar9, users_avatar10.get(2), 2, i12, iQ);
                        ConstraintLayout constraintLayoutB2 = l50VarC.b();
                        f0.o(constraintLayoutB2, "{\n                      …oot\n                    }");
                        view2 = constraintLayoutB2;
                    }
                    view = view2;
                } else {
                    Context context4 = getContext();
                    f0.o(context4, "context");
                    FrameLayout frameLayoutB = k50.c(kb.c.d(context4)).b();
                    float f10 = this.f83538k;
                    Context context5 = frameLayoutB.getContext();
                    f0.o(context5, "context");
                    int iA = (int) c.a(f10, context5);
                    frameLayoutB.setLayoutParams(new FrameLayout.LayoutParams(iA, iA));
                    f0.o(frameLayoutB, "this");
                    List<String> users_avatar11 = friendsChatRoomObj.getUsers_avatar();
                    f0.m(users_avatar11);
                    l(frameLayoutB, users_avatar11.get(0), 0, size, iQ);
                    f0.o(frameLayoutB, "{\n                      …  }\n                    }");
                    view = frameLayoutB;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                }
                layoutParams.gravity = 17;
                view.setLayoutParams(layoutParams);
                getFlContainer().addView(view);
            }
        }
    }

    public final void setFlContainer(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 31420, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f83540m = frameLayout;
    }
}
