package com.max.xiaoheihe.module.trade;

import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.qcloud.core.util.IOUtils;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeItemCheckSetter.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f93336l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final BaseActivity f93337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final View f93338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final a f93340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f93341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f93342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f93343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f93344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f93345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f93346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f93347k;

    /* JADX INFO: compiled from: TradeItemCheckSetter.kt */
    public interface a {
        void J();

        void L();

        void d0();

        void h1();
    }

    /* JADX INFO: compiled from: TradeItemCheckSetter.kt */
    public static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f93348b = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: TradeItemCheckSetter.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45293, new Class[]{View.class}, Void.TYPE).isSupported) {
            }
            if (d.this.g()) {
                switch (view.getId()) {
                    case R.id.tv_btn_cancel /* 2131364677 */:
                        d.this.c().h1();
                        break;
                    case R.id.tv_btn_confirm /* 2131364678 */:
                        d.this.c().L();
                        break;
                    default:
                        d.this.c().J();
                        break;
                }
            }
            switch (view.getId()) {
                case R.id.tv_btn_cancel /* 2131364677 */:
                    d.this.c().h1();
                    break;
                case R.id.tv_btn_confirm /* 2131364678 */:
                    d.this.c().L();
                    break;
                case R.id.tv_btn_put_off /* 2131364679 */:
                    d.this.c().d0();
                    break;
                default:
                    d.this.c().J();
                    break;
            }
        }
    }

    public d(@dl.d BaseActivity mContext, @dl.d View bottomBar, boolean z10, @dl.d a listener) {
        f0.p(mContext, "mContext");
        f0.p(bottomBar, "bottomBar");
        f0.p(listener, "listener");
        this.f93337a = mContext;
        this.f93338b = bottomBar;
        this.f93339c = z10;
        this.f93340d = listener;
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (this.f93339c) {
            TextView textView2 = this.f93341e;
            if (textView2 == null) {
                f0.S("tv_btn_confirm");
                textView2 = null;
            }
            textView2.getLayoutParams().width = ViewUtils.f(this.f93337a, 80.0f);
            TextView textView3 = this.f93343g;
            if (textView3 == null) {
                f0.S("tv_btn_cancel");
                textView3 = null;
            }
            textView3.getLayoutParams().width = ViewUtils.f(this.f93337a, 80.0f);
            TextView textView4 = this.f93342f;
            if (textView4 == null) {
                f0.S("tv_btn_put_off");
                textView4 = null;
            }
            textView4.setVisibility(8);
            TextView textView5 = this.f93341e;
            if (textView5 == null) {
                f0.S("tv_btn_confirm");
            } else {
                textView = textView5;
            }
            textView.setText("上架");
            return;
        }
        TextView textView6 = this.f93341e;
        if (textView6 == null) {
            f0.S("tv_btn_confirm");
            textView6 = null;
        }
        textView6.getLayoutParams().width = ViewUtils.f(this.f93337a, 68.0f);
        TextView textView7 = this.f93343g;
        if (textView7 == null) {
            f0.S("tv_btn_cancel");
            textView7 = null;
        }
        textView7.getLayoutParams().width = ViewUtils.f(this.f93337a, 68.0f);
        TextView textView8 = this.f93342f;
        if (textView8 == null) {
            f0.S("tv_btn_put_off");
            textView8 = null;
        }
        textView8.setVisibility(0);
        TextView textView9 = this.f93341e;
        if (textView9 == null) {
            f0.S("tv_btn_confirm");
        } else {
            textView = textView9;
        }
        textView.setText("改价");
    }

    private final void e() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45290, new Class[0], Void.TYPE).isSupported && this.f93347k) {
            try {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f93338b, "translationY", 0.0f, ViewUtils.f(this.f93337a, 54.0f) + 0.0f);
                objectAnimatorOfFloat.start();
                this.f93337a.addValueAnimator(objectAnimatorOfFloat);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f93347k = false;
        }
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45289, new Class[0], Void.TYPE).isSupported || this.f93347k) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f93338b, "translationY", ViewUtils.f(this.f93337a, 54.0f) + 0.0f, 0.0f);
        objectAnimatorOfFloat.start();
        this.f93337a.addValueAnimator(objectAnimatorOfFloat);
        a();
        this.f93347k = true;
    }

    @dl.d
    public final View b() {
        return this.f93338b;
    }

    @dl.d
    public final a c() {
        return this.f93340d;
    }

    @dl.d
    public final BaseActivity d() {
        return this.f93337a;
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = this.f93338b.findViewById(R.id.tv_btn_confirm);
        f0.o(viewFindViewById, "bottomBar.findViewById(R.id.tv_btn_confirm)");
        this.f93341e = (TextView) viewFindViewById;
        View viewFindViewById2 = this.f93338b.findViewById(R.id.tv_btn_put_off);
        f0.o(viewFindViewById2, "bottomBar.findViewById(R.id.tv_btn_put_off)");
        this.f93342f = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.f93338b.findViewById(R.id.tv_btn_cancel);
        f0.o(viewFindViewById3, "bottomBar.findViewById(R.id.tv_btn_cancel)");
        this.f93343g = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.f93338b.findViewById(R.id.iv_all);
        f0.o(viewFindViewById4, "bottomBar.findViewById(R.id.iv_all)");
        this.f93344h = (ImageView) viewFindViewById4;
        View viewFindViewById5 = this.f93338b.findViewById(R.id.tv_count);
        f0.o(viewFindViewById5, "bottomBar.findViewById(R.id.tv_count)");
        this.f93345i = (TextView) viewFindViewById5;
        View viewFindViewById6 = this.f93338b.findViewById(R.id.tv_desc);
        f0.o(viewFindViewById6, "bottomBar.findViewById(R.id.tv_desc)");
        this.f93346j = (TextView) viewFindViewById6;
        this.f93338b.setOnClickListener(b.f93348b);
        c cVar = new c();
        TextView textView = this.f93341e;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_btn_confirm");
            textView = null;
        }
        textView.setOnClickListener(cVar);
        TextView textView3 = this.f93343g;
        if (textView3 == null) {
            f0.S("tv_btn_cancel");
            textView3 = null;
        }
        textView3.setOnClickListener(cVar);
        TextView textView4 = this.f93342f;
        if (textView4 == null) {
            f0.S("tv_btn_put_off");
            textView4 = null;
        }
        textView4.setOnClickListener(cVar);
        ImageView imageView = this.f93344h;
        if (imageView == null) {
            f0.S("iv_all");
            imageView = null;
        }
        imageView.setOnClickListener(cVar);
        TextView textView5 = this.f93346j;
        if (textView5 == null) {
            f0.S("tv_desc");
            textView5 = null;
        }
        textView5.setOnClickListener(cVar);
        TextView textView6 = this.f93345i;
        if (textView6 == null) {
            f0.S("tv_count");
        } else {
            textView2 = textView6;
        }
        textView2.setOnClickListener(cVar);
    }

    public final boolean g() {
        return this.f93339c;
    }

    public final void h(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45292, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 > 0) {
            i();
        } else {
            e();
        }
        ImageView imageView = null;
        if (i10 < ItemInventoryFragment.V.a()) {
            TextView textView = this.f93345i;
            if (textView == null) {
                f0.S("tv_count");
                textView = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(i10);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(i11);
            sb2.append(')');
            textView.setText(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('(');
            sb3.append(i10);
            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb3.append(i11);
            sb3.append(')');
            String string = sb3.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f93337a.getResources().getColor(R.color.delete_red)), 1, StringsKt__StringsKt.s3(string, "/", 0, false, 6, null), 33);
            TextView textView2 = this.f93345i;
            if (textView2 == null) {
                f0.S("tv_count");
                textView2 = null;
            }
            textView2.setText(spannableStringBuilder);
        }
        ImageView imageView2 = this.f93344h;
        if (imageView2 == null) {
            f0.S("iv_all");
        } else {
            imageView = imageView2;
        }
        imageView.setImageResource(z10 ? R.drawable.account_cb_checked_16_16x16 : R.drawable.common_cb_unchecked);
    }
}
