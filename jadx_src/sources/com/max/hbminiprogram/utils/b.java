package com.max.hbminiprogram.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bb.c;
import com.google.gson.JsonObject;
import com.max.accelworld.f;
import com.max.hbcommon.analytics.l;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.MiniProgramShortCutObj;
import com.max.hbcommon.bean.ShortCutObj;
import com.max.hbcommon.component.i;
import com.max.hbcommon.utils.q;
import com.max.hbminiprogram.R;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.h;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lb.d;
import pb.p;

/* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
    public class a extends s<PostOptionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f71305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f71309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f71310g;

        /* JADX INFO: renamed from: com.max.hbminiprogram.utils.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
        public class ViewOnClickListenerC0574a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostOptionObj f71311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ s.e f71312c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImageView f71313d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextView f71314e;

            ViewOnClickListenerC0574a(PostOptionObj postOptionObj, s.e eVar, ImageView imageView, TextView textView) {
                this.f71311b = postOptionObj;
                this.f71312c = eVar;
                this.f71313d = imageView;
                this.f71314e = textView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.i.f33371q1, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f71311b.getClick_listener().onClick(a.this.f71309f, this.f71312c.b(), this.f71313d, this.f71314e);
                b.g(d.f131154e5, a.this.f71310g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, int i10, Context context2, int i11, int i12, int i13, i iVar, String str) {
            super(context, list, i10);
            this.f71305b = context2;
            this.f71306c = i11;
            this.f71307d = i12;
            this.f71308e = i13;
            this.f71309f = iVar;
            this.f71310g = str;
        }

        public void m(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, c.i.f33361o1, new Class[]{s.e.class, PostOptionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            com.max.hbshare.d.b(this.f71305b, postOptionObj, imageView, textView);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f71306c + this.f71307d;
            if (eVar.getBindingAdapterPosition() == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f71308e - (this.f71307d / 2);
            }
            if (eVar.getBindingAdapterPosition() == getDataList().size() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f71308e - (this.f71307d / 2);
            }
            eVar.b().setLayoutParams(layoutParams);
            if (postOptionObj.getClick_listener() != null) {
                eVar.b().setOnClickListener(new ViewOnClickListenerC0574a(postOptionObj, eVar, imageView, textView));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, c.i.f33366p1, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, postOptionObj);
        }
    }

    /* JADX INFO: renamed from: com.max.hbminiprogram.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
    public class C0575b extends s<PostOptionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f71316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f71320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f71321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ MiniProgramShortCutObj f71322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ShortCutObj f71323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ MiniProgramMenuInfoObj f71324j;

        /* JADX INFO: renamed from: com.max.hbminiprogram.utils.b$b$a */
        /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PostOptionObj f71325b;

            /* JADX INFO: renamed from: com.max.hbminiprogram.utils.b$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
            public class C0576a extends com.max.hbcommon.network.d<File> {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0576a() {
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(Throwable th2) {
                    if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, c.i.f33391u1, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("失败\n" + th2.getMessage());
                }

                public void onNext(File file) {
                    if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, c.i.f33396v1, new Class[]{File.class}, Void.TYPE).isSupported || file == null) {
                        return;
                    }
                    C0575b.this.f71323i.setIconBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
                    C0575b c0575b = C0575b.this;
                    q.c(c0575b.f71316b, c0575b.f71323i.getId(), C0575b.this.f71323i.getLabel(), C0575b.this.f71323i.getIconBitmap(), C0575b.this.f71323i.getIntents());
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.i.f33401w1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((File) obj);
                }
            }

            /* JADX INFO: renamed from: com.max.hbminiprogram.utils.b$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MiniProgramShareViewUtil.java */
            public class C0577b implements com.max.hbimage.b.s {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0577b() {
                }

                @Override // com.max.hbimage.b.s
                public String getFileName(String str) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.i.f33406x1, new Class[]{String.class}, String.class);
                    return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbutils.utils.s.d(str);
                }
            }

            a(PostOptionObj postOptionObj) {
                this.f71325b = postOptionObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.i.f33386t1, new Class[]{View.class}, Void.TYPE).isSupported) {
                }
                C0575b c0575b = C0575b.this;
                b.c(c0575b.f71316b, c0575b.f71320f);
                String name = this.f71325b.getName();
                name.hashCode();
                switch (name) {
                    case "移除小程序":
                        C0575b c0575b2 = C0575b.this;
                        if (c0575b2.f71324j != null && ((h) c0575b2.f71316b).k0() != null) {
                            ((h) C0575b.this.f71316b).k0().a(C0575b.this.f71324j.getApp_name());
                            break;
                        }
                        break;
                    case "刷新":
                        ((h) C0575b.this.f71316b).N();
                        b.g(d.f131168g5, C0575b.this.f71321g);
                        break;
                    case "跳转至社区":
                        ob.a aVar = ob.a.f132240a;
                        p pVarP = ob.a.p();
                        C0575b c0575b3 = C0575b.this;
                        pVarP.c(c0575b3.f71316b, c0575b3.f71324j.getMenu_info().getProtocol());
                        break;
                    case "添加到桌面":
                        C0575b c0575b4 = C0575b.this;
                        if (c0575b4.f71322h != null && c0575b4.f71323i != null) {
                            Object obj = C0575b.this.f71316b;
                            if (obj instanceof h) {
                                ((h) obj).Q();
                            }
                            break;
                        }
                        break;
                    case "添加小程序":
                        C0575b c0575b5 = C0575b.this;
                        if (c0575b5.f71324j != null && ((h) c0575b5.f71316b).k0() != null) {
                            ((h) C0575b.this.f71316b).k0().c(C0575b.this.f71324j.getApp_name());
                            break;
                        }
                        break;
                    case "返回首页":
                        ((h) C0575b.this.f71316b).x0();
                        b.g(d.f131161f5, C0575b.this.f71321g);
                        break;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0575b(Context context, List list, int i10, Context context2, int i11, int i12, int i13, i iVar, String str, MiniProgramShortCutObj miniProgramShortCutObj, ShortCutObj shortCutObj, MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
            super(context, list, i10);
            this.f71316b = context2;
            this.f71317c = i11;
            this.f71318d = i12;
            this.f71319e = i13;
            this.f71320f = iVar;
            this.f71321g = str;
            this.f71322h = miniProgramShortCutObj;
            this.f71323i = shortCutObj;
            this.f71324j = miniProgramMenuInfoObj;
        }

        public void m(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, c.i.f33376r1, new Class[]{s.e.class, PostOptionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
            b.b(this.f71316b, postOptionObj, imageView, (TextView) eVar.i(R.id.tv_name));
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.b().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = this.f71317c + this.f71318d;
            if (eVar.getBindingAdapterPosition() == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f71319e - (this.f71318d / 2);
            }
            if (eVar.getBindingAdapterPosition() == getDataList().size() - 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f71319e - (this.f71318d / 2);
            }
            eVar.b().setLayoutParams(layoutParams);
            imageView.setBackground(ViewUtils.j(imageView.getWidth(), androidx.core.content.d.f(this.f71316b, com.max.hbshare.R.color.background_layer_1_color)));
            eVar.b().setOnClickListener(new a(postOptionObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PostOptionObj postOptionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, postOptionObj}, this, changeQuickRedirect, false, c.i.f33381s1, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, postOptionObj);
        }
    }

    static /* synthetic */ void b(Context context, PostOptionObj postOptionObj, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{context, postOptionObj, imageView, textView}, null, changeQuickRedirect, true, c.i.f33351m1, new Class[]{Context.class, PostOptionObj.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f(context, postOptionObj, imageView, textView);
    }

    static /* synthetic */ void c(Context context, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{context, dialog}, null, changeQuickRedirect, true, c.i.f33356n1, new Class[]{Context.class, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        d(context, dialog);
    }

    private static void d(Context context, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{context, dialog}, null, changeQuickRedirect, true, c.i.f33336j1, new Class[]{Context.class, Dialog.class}, Void.TYPE).isSupported || !(context instanceof Activity) || ((Activity) context).isFinishing() || dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, i iVar, UMShareListener uMShareListener, View view) {
        if (PatchProxy.proxy(new Object[]{context, iVar, uMShareListener, view}, null, changeQuickRedirect, true, c.i.f33346l1, new Class[]{Context.class, i.class, UMShareListener.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        d(context, iVar);
        if (uMShareListener != null) {
            uMShareListener.onCancel(null);
        }
    }

    private static void f(Context context, PostOptionObj postOptionObj, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{context, postOptionObj, imageView, textView}, null, changeQuickRedirect, true, c.i.f33331i1, new Class[]{Context.class, PostOptionObj.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(postOptionObj.getImage_url())) {
            imageView.setImageResource(postOptionObj.getImage_resource_id());
            imageView.setColorFilter(context.getResources().getColor(com.max.hbshare.R.color.text_primary_1_color));
        } else {
            imageView.clearColorFilter();
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.H(postOptionObj.getImage_url(), imageView);
        }
        textView.setTextColor(context.getResources().getColor(com.max.hbshare.R.color.text_primary_2_color));
        textView.setText(postOptionObj.getName());
        imageView.setBackgroundResource(com.max.hbshare.R.drawable.divider_color_concept_23dp);
        int iF = ViewUtils.f(context, 11.0f);
        if (com.max.hbcommon.utils.c.u(postOptionObj.getImage_url())) {
            imageView.setPadding(iF, iF, iF, iF);
        }
    }

    public static void g(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, c.i.f33341k1, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (str2 != null) {
            jsonObject.addProperty("appid", str2);
        }
        l.f66572a.l(str, jsonObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(final Context context, String str, MiniProgramMenuInfoObj miniProgramMenuInfoObj, boolean z10, HBShareProtocolData hBShareProtocolData, UMImage uMImage, final UMShareListener uMShareListener) {
        MiniProgramShortCutObj desktop_info;
        ShortCutObj shortCutObj;
        JsonObject report_extra;
        String src;
        HBShareData hBShareData;
        if (!PatchProxy.proxy(new Object[]{context, str, miniProgramMenuInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), hBShareProtocolData, uMImage, uMShareListener}, null, changeQuickRedirect, true, c.i.f33326h1, new Class[]{Context.class, String.class, MiniProgramMenuInfoObj.class, Boolean.TYPE, HBShareProtocolData.class, UMImage.class, UMShareListener.class}, Void.TYPE).isSupported && (context instanceof h)) {
            h hVar = (h) context;
            if (hVar.isFinishing()) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_share_little_program, (ViewGroup) null);
            final i iVar = new i(context, viewGroup);
            ((BaseActivity) context).N0(iVar);
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.rv_share);
            RecyclerView recyclerView2 = (RecyclerView) viewGroup.findViewById(R.id.rv_action);
            TextView textView = (TextView) viewGroup.findViewById(R.id.tv_share_desc);
            View viewFindViewById = viewGroup.findViewById(R.id.share_divider);
            View viewFindViewById2 = viewGroup.findViewById(R.id.v_out);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_close);
            ArrayList arrayList = new ArrayList();
            if (((miniProgramMenuInfoObj == null || miniProgramMenuInfoObj.getMenu_info() == null || miniProgramMenuInfoObj.getMenu_info().getProtocol() == null || miniProgramMenuInfoObj.getTopic_info() == null || miniProgramMenuInfoObj.getTopic_info().getPic_url() == null) ? false : true) != false) {
                PostOptionObj postOptionObj = new PostOptionObj();
                postOptionObj.setName("跳转至社区");
                postOptionObj.setImage_url(miniProgramMenuInfoObj.getTopic_info().getPic_url());
                arrayList.add(postOptionObj);
            }
            if ((TextUtils.isEmpty(str) || miniProgramMenuInfoObj == null || !Boolean.TRUE.equals(miniProgramMenuInfoObj.getCan_add_to_my_list())) ? false : true) {
                ob.a aVar = ob.a.f132240a;
                boolean z11 = ob.a.o().b() && miniProgramMenuInfoObj != null && Boolean.TRUE.equals(miniProgramMenuInfoObj.is_my_mini_app());
                PostOptionObj postOptionObj2 = new PostOptionObj();
                postOptionObj2.setName(z11 ? "移除小程序" : "添加小程序");
                postOptionObj2.setImage_resource_id(z11 ? R.drawable.miniprogram_delete_main_24x24 : R.drawable.miniprogram_add_main_24x24);
                arrayList.add(postOptionObj2);
            }
            if (miniProgramMenuInfoObj != null) {
                ShortCutObj shortCutObj2 = new ShortCutObj();
                desktop_info = miniProgramMenuInfoObj.getDesktop_info();
                if (desktop_info != null && desktop_info.getName() != null && desktop_info.getProtocol() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    ob.a aVar2 = ob.a.f132240a;
                    sb2.append(ob.a.b().h());
                    sb2.append(!com.max.hbcommon.utils.c.u(str) ? str : desktop_info.getName());
                    shortCutObj2.setId(sb2.toString());
                    shortCutObj2.setLabel(desktop_info.getName());
                    Intent intentX = ob.a.b().x(context);
                    intentX.putExtra(q.f68261b, desktop_info.getProtocol());
                    shortCutObj2.setIntents(new Intent[]{intentX});
                    PostOptionObj postOptionObj3 = new PostOptionObj();
                    postOptionObj3.setName("添加到桌面");
                    postOptionObj3.setImage_resource_id(R.drawable.miniprogram_desktop_24_24);
                    arrayList.add(postOptionObj3);
                }
                shortCutObj = shortCutObj2;
            } else {
                imageView = imageView;
                viewFindViewById2 = viewFindViewById2;
                desktop_info = null;
                shortCutObj = null;
            }
            PostOptionObj postOptionObj4 = new PostOptionObj();
            postOptionObj4.setName("刷新");
            postOptionObj4.setImage_resource_id(R.drawable.common_refresh_line_24x24);
            arrayList.add(postOptionObj4);
            if (!hVar.p0()) {
                PostOptionObj postOptionObj5 = new PostOptionObj();
                postOptionObj5.setName("返回首页");
                postOptionObj5.setImage_resource_id(R.drawable.mall_shop_line_24x24);
                arrayList.add(postOptionObj5);
            }
            int iF = ViewUtils.f(context, 56.0f);
            int iF2 = ViewUtils.f(context, 12.0f);
            int iA = f.a(ViewUtils.L(context) - iF2, iF, ViewUtils.f(context, 12.0f), 0.33f, 0.66f);
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                if (miniProgramMenuInfoObj != null && miniProgramMenuInfoObj.getShare_info() != null) {
                    report_extra = miniProgramMenuInfoObj.getShare_info().getReport_extra();
                    src = miniProgramMenuInfoObj.getShare_info().getSrc();
                } else if (hBShareProtocolData != null) {
                    src = hBShareProtocolData.getSrc();
                    report_extra = hBShareProtocolData.getReport_extra();
                } else {
                    report_extra = null;
                    src = null;
                }
                if (com.max.hbcommon.utils.c.u(src)) {
                    hBShareData = null;
                } else {
                    hBShareData = null;
                    com.max.hbshare.c.a(src, "3", null, report_extra);
                }
                recyclerView.setVisibility(0);
                textView.setVisibility(0);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
                linearLayoutManager.setOrientation(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                HBShareData hBShareData2 = hBShareData;
                a aVar3 = new a(context, arrayList2, R.layout.item_post_share_bottom_smaller, context, iF, iA, iF2, iVar, str);
                HBShareData hBShareData3 = hBShareProtocolData == null ? hBShareData2 : hBShareProtocolData.toHBShareData();
                if (hBShareData3 == null) {
                    hBShareData3 = new HBShareData(false, true, null, null, null, null, uMImage, uMShareListener);
                } else {
                    hBShareData3.setUmImage(uMImage);
                    hBShareData3.setShareListener(uMShareListener);
                }
                com.max.hbshare.d.G(context, hBShareData3, arrayList2);
                if (arrayList2.size() > 0) {
                    textView.setText("分享");
                }
                recyclerView.setAdapter(aVar3);
            } else {
                viewFindViewById.setVisibility(8);
                recyclerView.setVisibility(8);
            }
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context);
            linearLayoutManager2.setOrientation(0);
            recyclerView2.setLayoutManager(linearLayoutManager2);
            recyclerView2.setAdapter(new C0575b(context, arrayList, R.layout.item_miniprogram_share_bottom, context, iF, iA, iF2, iVar, str, desktop_info, shortCutObj, miniProgramMenuInfoObj));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.max.hbminiprogram.utils.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.e(context, iVar, uMShareListener, view);
                }
            };
            viewFindViewById2.setOnClickListener(onClickListener);
            imageView.setOnClickListener(onClickListener);
            iVar.show();
            iVar.f(false);
        }
    }
}
