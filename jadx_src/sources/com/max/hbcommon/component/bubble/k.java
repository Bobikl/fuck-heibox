package com.max.hbcommon.component.bubble;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.bubble.BubbleView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import pb.p;
import xh.m;

/* JADX INFO: compiled from: BubbleTipsUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f67402a = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: BubbleTipsUtils.kt */
    @t0({"SMAP\nBubbleTipsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BubbleTipsUtils.kt\ncom/max/hbcommon/component/bubble/BubbleTipsUtils$Companion\n+ 2 BubbleTipPopup.kt\ncom/max/hbcommon/component/bubble/BubbleTipPopupKt\n*L\n1#1,127:1\n130#2:128\n*S KotlinDebug\n*F\n+ 1 BubbleTipsUtils.kt\ncom/max/hbcommon/component/bubble/BubbleTipsUtils$Companion\n*L\n36#1:128\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Context mContext, KeyDescObj obj, View view) {
            if (PatchProxy.proxy(new Object[]{mContext, obj, view}, null, changeQuickRedirect, true, bb.c.d.im, new Class[]{Context.class, KeyDescObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(mContext, "$mContext");
            f0.p(obj, "$obj");
            p pVarP = ob.a.p();
            String protocol = obj.getProtocol();
            f0.o(protocol, "getProtocol(...)");
            pVarP.c(mContext, protocol);
        }

        @dl.d
        @m
        public final BubbleView b(@dl.d final Context mContext, @dl.e ArrayList<KeyDescObj> arrayList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, arrayList}, this, changeQuickRedirect, false, bb.c.d.hm, new Class[]{Context.class, ArrayList.class}, BubbleView.class);
            if (patchProxyResultProxy.isSupported) {
                return (BubbleView) patchProxyResultProxy.result;
            }
            f0.p(mContext, "mContext");
            LinearLayout linearLayout = new LinearLayout(mContext);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setBackgroundResource(R.drawable.text_primary_alpha90_2dp);
            if (arrayList != null) {
                for (final KeyDescObj keyDescObj : arrayList) {
                    View viewInflate = LayoutInflater.from(mContext).inflate(R.layout.item_activity_detail, (ViewGroup) linearLayout, false);
                    f0.o(viewInflate, "inflate(...)");
                    ((TextView) viewInflate.findViewById(R.id.tv_text)).setText(keyDescObj.getText());
                    viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.bubble.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            k.a.c(mContext, keyDescObj, view);
                        }
                    });
                    linearLayout.addView(viewInflate);
                }
            }
            return d(mContext, linearLayout);
        }

        @dl.d
        @m
        public final BubbleView d(@dl.d Context mContext, @dl.d View content) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, content}, this, changeQuickRedirect, false, bb.c.d.gm, new Class[]{Context.class, View.class}, BubbleView.class);
            if (patchProxyResultProxy.isSupported) {
                return (BubbleView) patchProxyResultProxy.result;
            }
            f0.p(mContext, "mContext");
            f0.p(content, "content");
            BubbleView bubbleView = new BubbleView(mContext);
            bubbleView.setContentView(content);
            bubbleView.setDirection(BubbleView.TailDirection.Top);
            return bubbleView;
        }

        @dl.d
        @m
        public final BubbleView e(@dl.d Context mContext, @dl.d View content, @n int i10, float f10, @dl.d BubbleView.TailDirection tailDirection, float f11, float f12) {
            Object[] objArr = {mContext, content, new Integer(i10), new Float(f10), tailDirection, new Float(f11), new Float(f12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.fm, new Class[]{Context.class, View.class, Integer.TYPE, cls, BubbleView.TailDirection.class, cls, cls}, BubbleView.class);
            if (patchProxyResultProxy.isSupported) {
                return (BubbleView) patchProxyResultProxy.result;
            }
            f0.p(mContext, "mContext");
            f0.p(content, "content");
            f0.p(tailDirection, "tailDirection");
            BubbleView bubbleView = new BubbleView(mContext);
            bubbleView.setContentView(content);
            bubbleView.setColorRes(i10);
            bubbleView.setRadius(f10);
            bubbleView.setDirection(tailDirection);
            bubbleView.setTailHeight(f11);
            bubbleView.setTailWidth(f12);
            return bubbleView;
        }

        @dl.d
        @m
        public final c f(@dl.d Context context, int i10, int i11, int i12, @dl.d BubbleView view) {
            Object[] objArr = {context, new Integer(i10), new Integer(i11), new Integer(i12), view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.dm, new Class[]{Context.class, cls, cls, cls, BubbleView.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(view, "view");
            c cVarA = c.f67364l.a(context).t(i10).v(i11).q(i12).j(view).a();
            cVarA.N3();
            return cVarA;
        }

        @dl.d
        @m
        public final c g(@dl.d Context context, int i10, int i11, @dl.d BubbleView view) {
            Object[] objArr = {context, new Integer(i10), new Integer(i11), view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.cm, new Class[]{Context.class, cls, cls, BubbleView.class}, c.class);
            if (patchProxyResultProxy.isSupported) {
                return (c) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(view, "view");
            return f(context, i10, i11, -1, view);
        }

        @m
        public final void h(@dl.d Context context, int i10, int i11, @dl.d c.d hideListener, @dl.d BubbleView view) {
            Object[] objArr = {context, new Integer(i10), new Integer(i11), hideListener, view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.em, new Class[]{Context.class, cls, cls, c.d.class, BubbleView.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(hideListener, "hideListener");
            f0.p(view, "view");
            c.f67364l.a(context).t(i10).v(i11).s(hideListener).j(view).a().N3();
        }

        @m
        public final void i(@dl.d Context context, @dl.d BubbleView view, @dl.d View anchorView, int i10, int i11) {
            Object[] objArr = {context, view, anchorView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.am, new Class[]{Context.class, BubbleView.class, View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(view, "view");
            f0.p(anchorView, "anchorView");
            int[] iArr = new int[2];
            anchorView.getLocationInWindow(iArr);
            g(context, iArr[0] + (anchorView.getWidth() / 2) + i10, iArr[1] + (anchorView.getHeight() / 2) + i11, view);
        }

        @m
        public final void j(@dl.d Context context, @dl.d String text, @dl.d View anchorView, float f10, float f11) {
            Object[] objArr = {context, text, anchorView, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.bm, new Class[]{Context.class, String.class, View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(text, "text");
            f0.p(anchorView, "anchorView");
            BubbleTipPopup.a aVar = new BubbleTipPopup.a(context);
            aVar.p1(text);
            aVar.c(anchorView);
            aVar.o0(f10);
            aVar.p0(f11);
            aVar.r().O();
        }
    }

    @dl.d
    @m
    public static final BubbleView a(@dl.d Context context, @dl.e ArrayList<KeyDescObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, arrayList}, null, changeQuickRedirect, true, bb.c.d.Zl, new Class[]{Context.class, ArrayList.class}, BubbleView.class);
        return patchProxyResultProxy.isSupported ? (BubbleView) patchProxyResultProxy.result : f67402a.b(context, arrayList);
    }

    @dl.d
    @m
    public static final BubbleView b(@dl.d Context context, @dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, bb.c.d.Yl, new Class[]{Context.class, View.class}, BubbleView.class);
        return patchProxyResultProxy.isSupported ? (BubbleView) patchProxyResultProxy.result : f67402a.d(context, view);
    }

    @dl.d
    @m
    public static final BubbleView c(@dl.d Context context, @dl.d View view, @n int i10, float f10, @dl.d BubbleView.TailDirection tailDirection, float f11, float f12) {
        Object[] objArr = {context, view, new Integer(i10), new Float(f10), tailDirection, new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Xl, new Class[]{Context.class, View.class, Integer.TYPE, cls, BubbleView.TailDirection.class, cls, cls}, BubbleView.class);
        return patchProxyResultProxy.isSupported ? (BubbleView) patchProxyResultProxy.result : f67402a.e(context, view, i10, f10, tailDirection, f11, f12);
    }

    @dl.d
    @m
    public static final c d(@dl.d Context context, int i10, int i11, int i12, @dl.d BubbleView bubbleView) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), new Integer(i12), bubbleView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Vl, new Class[]{Context.class, cls, cls, cls, BubbleView.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : f67402a.f(context, i10, i11, i12, bubbleView);
    }

    @dl.d
    @m
    public static final c e(@dl.d Context context, int i10, int i11, @dl.d BubbleView bubbleView) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), bubbleView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Ul, new Class[]{Context.class, cls, cls, BubbleView.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : f67402a.g(context, i10, i11, bubbleView);
    }

    @m
    public static final void f(@dl.d Context context, int i10, int i11, @dl.d c.d dVar, @dl.d BubbleView bubbleView) {
        Object[] objArr = {context, new Integer(i10), new Integer(i11), dVar, bubbleView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Wl, new Class[]{Context.class, cls, cls, c.d.class, BubbleView.class}, Void.TYPE).isSupported) {
            return;
        }
        f67402a.h(context, i10, i11, dVar, bubbleView);
    }

    @m
    public static final void g(@dl.d Context context, @dl.d BubbleView bubbleView, @dl.d View view, int i10, int i11) {
        Object[] objArr = {context, bubbleView, view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Sl, new Class[]{Context.class, BubbleView.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f67402a.i(context, bubbleView, view, i10, i11);
    }

    @m
    public static final void h(@dl.d Context context, @dl.d String str, @dl.d View view, float f10, float f11) {
        Object[] objArr = {context, str, view, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Tl, new Class[]{Context.class, String.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f67402a.j(context, str, view, f10, f11);
    }
}
