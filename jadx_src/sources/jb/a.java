package jb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bb.c;
import com.max.hbcommon.R;
import com.max.hbimage.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NormalNotificationInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends com.max.hbcommon.component.inappnotification.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private final String f124313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private final String f124314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private String f124315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private Drawable f124316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private View.OnClickListener f124317n;

    public a(@e String str, @e String str2, @e Context context, boolean z10, long j10) {
        super(context, z10, j10, false, null, 0, 0, false, false, 504, null);
        this.f124313j = str;
        this.f124314k = str2;
    }

    public /* synthetic */ a(String str, String str2, Context context, boolean z10, long j10, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? null : context, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? 0L : j10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@e String str, @e String str2, @e Drawable drawable, @e Context context, boolean z10, long j10, @d View.OnClickListener clickListener) {
        this(str, str2, context, z10, j10);
        f0.p(clickListener, "clickListener");
        this.f124316m = drawable;
        this.f124317n = clickListener;
    }

    public /* synthetic */ a(String str, String str2, Drawable drawable, Context context, boolean z10, long j10, View.OnClickListener onClickListener, int i10, u uVar) {
        this(str, str2, drawable, (i10 & 8) != 0 ? null : context, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? 0L : j10, onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@e String str, @e String str2, @e String str3, @e Context context, boolean z10, long j10, @d View.OnClickListener clickListener) {
        this(str, str2, context, z10, j10);
        f0.p(clickListener, "clickListener");
        this.f124315l = str3;
        this.f124317n = clickListener;
    }

    public /* synthetic */ a(String str, String str2, String str3, Context context, boolean z10, long j10, View.OnClickListener onClickListener, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : context, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? 0L : j10, onClickListener);
    }

    @Override // com.max.hbcommon.component.inappnotification.a
    @e
    public View g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.P0, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        Context contextF = f();
        if (contextF == null) {
            return null;
        }
        View viewInflate = kb.c.d(contextF).inflate(R.layout.layout_notification, (ViewGroup) new FrameLayout(contextF), false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_msg);
        if (com.max.hbcommon.utils.c.u(this.f124315l)) {
            Drawable drawable = this.f124316m;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        } else {
            b.K(this.f124315l, imageView);
        }
        textView.setText(this.f124313j);
        textView2.setText(this.f124314k);
        viewInflate.setOnClickListener(this.f124317n);
        return viewInflate;
    }
}
