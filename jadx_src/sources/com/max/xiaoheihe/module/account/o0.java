package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.max.hbpermission.PermissionManager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public class o0 extends com.max.hbcommon.base.c implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f79109j = "bitmap";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f79110k = "screen_bitmap";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bitmap f79111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f79112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f79113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<Bitmap> f79114h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private UMShareListener f79115i = new d();

    /* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24279, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            o0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
    public class b implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f79117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f79118b;

        b(Context context, Bitmap bitmap) {
            this.f79117a = context;
            this.f79118b = bitmap;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24280, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.t(this.f79117a, new UMImage(this.f79117a, this.f79118b), null, o0.this.f79115i);
        }
    }

    /* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
    public class c implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f79120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f79121b;

        /* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
        public class a extends com.max.hbcommon.network.d<File> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(Throwable th2) {
                if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 24282, new Class[]{Throwable.class}, Void.TYPE).isSupported && o0.this.isActive()) {
                    super.onError(th2);
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(o0.this.getString(R.string.save_fail) + ": " + th2.toString());
                }
            }

            public void onNext(File file) {
                if (!PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 24283, new Class[]{File.class}, Void.TYPE).isSupported && o0.this.isActive()) {
                    super.onNext(file);
                    if (file != null) {
                        com.max.hbimage.b.l0(c.this.f79121b, file.getAbsolutePath());
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.Z());
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 24284, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((File) obj);
            }
        }

        c(Bitmap bitmap, Context context) {
            this.f79120a = bitmap;
            this.f79121b = context;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24281, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            o0.this.addDisposable((io.reactivex.disposables.b) com.max.hbimage.b.p0(com.max.xiaoheihe.utils.d.T(), this.f79120a).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
        }
    }

    /* JADX INFO: compiled from: ShareMyPCDialogFragment.java */
    public class d implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24287, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            o0.this.Q3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 24286, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(o0.this.getString(R.string.share_fail));
            o0.this.Q3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 24285, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(o0.this.getString(R.string.share_success));
            o0.this.Q3();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    private Bitmap O3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24276, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        this.f79114h.clear();
        LinearLayout linearLayout = this.f79113g;
        if (linearLayout == null) {
            return null;
        }
        Bitmap bitmapL = com.max.hbimage.b.l(linearLayout, linearLayout.getMeasuredWidth(), this.f79113g.getMeasuredHeight());
        this.f79114h.add(bitmapL);
        return bitmapL;
    }

    public static o0 P3(Bitmap bitmap, Bitmap bitmap2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, bitmap2}, null, changeQuickRedirect, true, 24271, new Class[]{Bitmap.class, Bitmap.class}, o0.class);
        if (patchProxyResultProxy.isSupported) {
            return (o0) patchProxyResultProxy.result;
        }
        o0 o0Var = new o0();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f79109j, bitmap);
        bundle.putParcelable(f79110k, bitmap2);
        o0Var.setArguments(bundle);
        return o0Var;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24277, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Bitmap bitmap : this.f79114h) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        if (!this.f79112f.isRecycled()) {
            this.f79112f.recycle();
        }
        System.gc();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 24278, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(getContext()).onActivityResult(i10, i11, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24275, new Class[]{View.class}, Void.TYPE).isSupported) {
        }
        Context context = getContext();
        switch (view.getId()) {
            case R.id.vg_share_qq /* 2131367070 */:
                Bitmap bitmapO3 = O3();
                if (bitmapO3 == null) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(getString(R.string.fail));
                } else {
                    PermissionManager.f71603a.T((FragmentActivity) context, new b(context, bitmapO3));
                }
                break;
            case R.id.vg_share_save /* 2131367072 */:
                Bitmap bitmapO4 = O3();
                if (bitmapO4 == null) {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(getString(R.string.fail));
                } else {
                    PermissionManager.f71603a.T((FragmentActivity) context, new c(bitmapO4, context));
                }
                break;
            case R.id.vg_share_sina /* 2131367073 */:
                Bitmap bitmapO5 = O3();
                if (bitmapO5 == null) {
                    com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(getString(R.string.fail));
                } else {
                    com.max.hbshare.d.v(context, new UMImage(context, bitmapO5), null, this.f79115i);
                }
                break;
            case R.id.vg_share_weixin /* 2131367078 */:
                Bitmap bitmapO6 = O3();
                if (bitmapO6 == null) {
                    com.max.hbutils.utils.c cVar4 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(getString(R.string.fail));
                } else {
                    com.max.hbshare.d.w(context, new UMImage(context, bitmapO6), null, this.f79115i);
                }
                break;
            case R.id.vg_share_weixin_circle /* 2131367079 */:
                Bitmap bitmapO7 = O3();
                if (bitmapO7 == null) {
                    com.max.hbutils.utils.c cVar5 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(getString(R.string.fail));
                } else {
                    com.max.hbshare.d.x(context, new UMImage(context, bitmapO7), null, this.f79115i);
                }
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 24272, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f79111e = (Bitmap) getArguments().getParcelable(f79109j);
            this.f79112f = (Bitmap) getArguments().getParcelable(f79110k);
        }
        return layoutInflater.inflate(R.layout.fragment_share_my_pc_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24274, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q3();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 24273, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        Bitmap bitmap = this.f79111e;
        if (bitmap == null || bitmap.getWidth() <= 0 || this.f79111e.getHeight() <= 0) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getResources().getString(R.string.fail));
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_bg);
        View viewFindViewById = view.findViewById(R.id.vg_user);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_user_avatar);
        TextView textView = (TextView) view.findViewById(R.id.tv_user_name);
        this.f79113g = (LinearLayout) view.findViewById(R.id.ll_share_content);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_img);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.height = (int) (((double) ((((ViewUtils.L(getContext()) - ViewUtils.f(getContext(), 28.0f)) * 1.0f) * this.f79111e.getHeight()) / this.f79111e.getWidth())) + 0.5d);
        imageView2.setLayoutParams(layoutParams);
        imageView2.setImageBitmap(this.f79111e);
        if (com.max.xiaoheihe.utils.i0.s()) {
            viewFindViewById.setVisibility(0);
            com.max.hbimage.b.H(com.max.xiaoheihe.utils.i0.i().getAccount_detail().getAvartar(), imageView);
            textView.setText(com.max.xiaoheihe.utils.i0.i().getAccount_detail().getUsername());
        } else {
            viewFindViewById.setVisibility(8);
        }
        Bitmap bitmap2 = this.f79112f;
        if (bitmap2 != null && bitmap2.getWidth() > 0 && this.f79112f.getHeight() > 0) {
            relativeLayout.setBackgroundDrawable(new BitmapDrawable(this.f79112f));
        }
        View viewFindViewById2 = view.findViewById(R.id.vg_share_weixin);
        View viewFindViewById3 = view.findViewById(R.id.vg_share_weixin_circle);
        View viewFindViewById4 = view.findViewById(R.id.vg_share_qq);
        View viewFindViewById5 = view.findViewById(R.id.vg_share_sina);
        View viewFindViewById6 = view.findViewById(R.id.vg_share_save);
        viewFindViewById2.setOnClickListener(this);
        viewFindViewById3.setOnClickListener(this);
        viewFindViewById4.setOnClickListener(this);
        viewFindViewById5.setOnClickListener(this);
        viewFindViewById6.setOnClickListener(this);
    }
}
