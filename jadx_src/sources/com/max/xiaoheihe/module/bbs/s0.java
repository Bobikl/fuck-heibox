package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.max.xiaoheihe.bean.bbs.HashPostLinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostBtnObj;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public class s0 extends com.max.hbcommon.base.swipeback.a {
    private static final String A = "contribute_text";
    private static final String B = "normal";
    private static final String C = "concept";
    private static final String D = "timeline";
    private static final String E = "other";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f83215r = "type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f83216s = "topic_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f83217t = "post_link_info";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f83218u = "menus";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f83219v = "hash_tag";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f83220w = "team";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f83221x = "bbs";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f83222y = "contribute_video";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f83223z = "contribute_picture_text";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f83224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f83225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f83226l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HashPostLinkInfoObj f83229o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<BBSTopicMenuObj> f83231q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f83227m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f83228n = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f83230p = false;

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27158, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27159, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83234b;

        c(Context context) {
            this.f83234b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27160, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (s0.this.f83229o != null) {
                PictureVideoEditPostActivity.O1(this.f83234b, null, s0.W3(s0.this), null, null, s0.this.f83227m, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, s0.this.f83228n);
            } else {
                PictureVideoEditPostActivity.O1(this.f83234b, new String[]{s0.this.f83226l}, null, null, s0.this.f83225k, s0.this.f83227m, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, s0.this.f83228n);
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83236b;

        d(Context context) {
            this.f83236b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27161, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (s0.this.f83229o != null) {
                PictureVideoEditPostActivity.O1(this.f83236b, null, s0.W3(s0.this), null, null, s0.this.f83227m, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO, s0.this.f83228n);
            } else {
                PictureVideoEditPostActivity.O1(this.f83236b, new String[]{s0.this.f83226l}, null, null, s0.this.f83225k, s0.this.f83227m, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO, s0.this.f83228n);
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83238b;

        e(Context context) {
            this.f83238b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27162, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.sankuai.waimai.router.common.c cVarD = com.max.xiaoheihe.base.router.b.d(this.f83238b, null, s0.this.f83225k, null, s0.this.f83226l, s0.this.f83227m);
            if (s0.this.f83229o != null && !com.max.hbcommon.utils.c.w(s0.this.f83229o.getTopicinfos())) {
                cVarD.S(NewLinkEditFragment.W4, s0.this.f83229o.getTopicinfos());
            }
            cVarD.U("source", s0.this.f83228n);
            cVarD.A();
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83240b;

        f(Context context) {
            this.f83240b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27163, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MainActivity.E4) {
                Intent intent = new Intent(this.f83240b, (Class<?>) PostTabActivity.class);
                intent.putExtra(PictureVideoEditPostFragment.f82332a4, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE);
                intent.putExtra(PictureVideoEditPostFragment.f82350s4, new String[]{s0.this.f83226l});
                intent.putExtra("source", s0.this.f83228n);
                s0.this.startActivity(intent);
            } else {
                com.max.xiaoheihe.base.router.b.t(this.f83240b, null, s0.this.f83226l, null).A();
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83242b;

        g(Context context) {
            this.f83242b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27164, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PictureVideoEditPostActivity.O1(this.f83242b, new String[]{s0.this.f83226l}, null, null, s0.this.f83225k, s0.this.f83227m, PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_PICTURE, s0.this.f83228n);
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostBtnObj f83244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f83245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSTopicMenuObj f83246d;

        h(PostBtnObj postBtnObj, Context context, BBSTopicMenuObj bBSTopicMenuObj) {
            this.f83244b = postBtnObj;
            this.f83245c = context;
            this.f83246d = bBSTopicMenuObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27165, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (s0.this.getActivity() instanceof ChannelsDetailActivity) {
                ((ChannelsDetailActivity) s0.this.getActivity()).M3(this.f83244b.getText());
            }
            if (com.max.hbcommon.utils.c.u(this.f83244b.getProtocol())) {
                com.max.xiaoheihe.base.router.b.r(this.f83245c, s0.this.f83225k, this.f83244b, this.f83246d.getParams()).U("source", s0.this.f83228n).A();
            } else {
                com.max.xiaoheihe.base.router.b.k0(this.f83245c, this.f83244b.getProtocol());
            }
            s0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: WritePostTypeDialogFragment.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83248b;

        i(Context context) {
            this.f83248b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27166, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.q(this.f83248b, s0.this.f83225k, s0.this.f83226l, false).U("source", s0.this.f83228n).A();
            s0.this.dismiss();
        }
    }

    static /* synthetic */ PictureVideoLinkDraftObj W3(s0 s0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{s0Var}, null, changeQuickRedirect, true, 27157, new Class[]{s0.class}, PictureVideoLinkDraftObj.class);
        return patchProxyResultProxy.isSupported ? (PictureVideoLinkDraftObj) patchProxyResultProxy.result : s0Var.e4();
    }

    private void b4(LinearLayout linearLayout, int i10) {
        if (PatchProxy.proxy(new Object[]{linearLayout, new Integer(i10)}, this, changeQuickRedirect, false, 27153, new Class[]{LinearLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c4(null, linearLayout, i10, f83223z);
        c4(null, linearLayout, i10, A);
        c4(null, linearLayout, i10, f83222y);
        if (MainActivity.E4) {
            return;
        }
        c4(null, linearLayout, i10, "normal");
    }

    private void c4(BBSTopicMenuObj bBSTopicMenuObj, LinearLayout linearLayout, int i10, String str) {
        if (PatchProxy.proxy(new Object[]{bBSTopicMenuObj, linearLayout, new Integer(i10), str}, this, changeQuickRedirect, false, 27154, new Class[]{BBSTopicMenuObj.class, LinearLayout.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = linearLayout.getContext();
        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_post_cat, (ViewGroup) linearLayout, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        layoutParams.width = i10;
        viewInflate.setLayoutParams(layoutParams);
        linearLayout.addView(viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        if (str == null) {
            d4(context, imageView, textView, viewInflate);
            return;
        }
        switch (str) {
            case "timeline":
                imageView.setImageResource(R.drawable.ic_write_moment_post);
                textView.setText(R.string.bbs_timeline);
                viewInflate.setOnClickListener(new f(context));
                return;
            case "contribute_video":
                imageView.setImageResource(R.drawable.publish_video);
                textView.setText(R.string.contribute_video);
                viewInflate.setOnClickListener(new d(context));
                return;
            case "contribute_picture_text":
                imageView.setImageResource(R.drawable.publish_picture);
                textView.setText(R.string.contribute_picture_text);
                viewInflate.setOnClickListener(new c(context));
                return;
            case "other":
                if (bBSTopicMenuObj != null && bBSTopicMenuObj.getPost_btn() != null) {
                    PostBtnObj post_btn = bBSTopicMenuObj.getPost_btn();
                    com.max.hbimage.b.K(post_btn.getImg(), imageView);
                    imageView.clearColorFilter();
                    textView.setText(post_btn.getText());
                    viewInflate.setOnClickListener(new h(post_btn, context, bBSTopicMenuObj));
                    return;
                }
                break;
            case "contribute_text":
                textView.setText(R.string.contribute_text);
                imageView.setImageResource(R.drawable.publish_artical);
                viewInflate.setOnClickListener(new e(context));
                return;
            case "concept":
                imageView.setImageResource(R.drawable.publish_post);
                textView.setText("动态");
                viewInflate.setOnClickListener(new g(context));
                return;
        }
        d4(context, imageView, textView, viewInflate);
    }

    private void d4(Context context, ImageView imageView, TextView textView, View view) {
        if (PatchProxy.proxy(new Object[]{context, imageView, textView, view}, this, changeQuickRedirect, false, 27155, new Class[]{Context.class, ImageView.class, TextView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        imageView.setImageResource(R.drawable.publish_post);
        textView.setText(R.string.links);
        view.setOnClickListener(new i(context));
    }

    private PictureVideoLinkDraftObj e4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27156, new Class[0], PictureVideoLinkDraftObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureVideoLinkDraftObj) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.max.hbcommon.utils.c.u(this.f83226l)) {
            arrayList.add(this.f83226l);
        }
        ArrayList arrayList2 = new ArrayList();
        HashPostLinkInfoObj hashPostLinkInfoObj = this.f83229o;
        if (hashPostLinkInfoObj != null && !com.max.hbcommon.utils.c.w(hashPostLinkInfoObj.getTopicinfos())) {
            arrayList2.addAll(this.f83229o.getTopicinfos());
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
        pictureVideoLinkDraftObj.setHashtagList(arrayList);
        pictureVideoLinkDraftObj.setCheckedTopics(arrayList2);
        return pictureVideoLinkDraftObj;
    }

    public static s0 f4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 27150, new Class[]{String.class, String.class}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        s0 s0Var = new s0();
        Bundle bundle = new Bundle();
        bundle.putString("type", "bbs");
        bundle.putString("topic_id", str);
        bundle.putString(f83219v, str2);
        s0Var.setArguments(bundle);
        return s0Var;
    }

    public static s0 g4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 27147, new Class[0], s0.class);
        return patchProxyResultProxy.isSupported ? (s0) patchProxyResultProxy.result : new s0();
    }

    public static s0 h4(String str, String str2, ArrayList<BBSTopicMenuObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, arrayList}, null, changeQuickRedirect, true, 27148, new Class[]{String.class, String.class, ArrayList.class}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        s0 s0Var = new s0();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("topic_id", str2);
        bundle.putSerializable(f83218u, arrayList);
        s0Var.setArguments(bundle);
        return s0Var;
    }

    public static s0 i4(String str, String str2, String str3, HashPostLinkInfoObj hashPostLinkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, hashPostLinkInfoObj}, null, changeQuickRedirect, true, 27149, new Class[]{String.class, String.class, String.class, HashPostLinkInfoObj.class}, s0.class);
        if (patchProxyResultProxy.isSupported) {
            return (s0) patchProxyResultProxy.result;
        }
        s0 s0Var = new s0();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putSerializable(f83217t, hashPostLinkInfoObj);
        bundle.putString(f83219v, str2);
        bundle.putString("h_src", str3);
        s0Var.setArguments(bundle);
        return s0Var;
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 27151, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.fragment_write_post_type, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        float fL;
        float f10;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 27152, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.f83224j = getArguments().getString("type");
            this.f83225k = getArguments().getString("topic_id");
            this.f83231q = (ArrayList) getArguments().getSerializable(f83218u);
            this.f83226l = getArguments().getString(f83219v);
            this.f83227m = getArguments().getString("h_src");
            this.f83228n = getArguments().getString("source", "");
            this.f83229o = (HashPostLinkInfoObj) getArguments().getSerializable(f83217t);
        }
        JsonObject jsonObject = new JsonObject();
        com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
        jsonObject.addProperty("page", lVar.e());
        jsonObject.addProperty("tag", this.f83226l);
        jsonObject.addProperty("h_src", this.f83227m);
        lVar.l(lb.d.B0, jsonObject);
        Context context = getContext();
        if (context == null) {
            return;
        }
        view.setOnClickListener(new a());
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_type);
        bottomButtonLeftItemView.setRightClickListener(new b());
        linearLayout.removeAllViews();
        ArrayList<BBSTopicMenuObj> arrayList = this.f83231q;
        int size = arrayList != null ? arrayList.size() : 0;
        this.f83230p = false;
        if (!f83220w.equals(this.f83224j) || size <= 0) {
            if ("bbs".equals(this.f83224j)) {
                b4(linearLayout, (int) (ViewUtils.L(context) / (MainActivity.E4 ? 3.0f : 4.0f)));
                return;
            } else {
                b4(linearLayout, (int) (ViewUtils.L(context) / (MainActivity.E4 ? 3.0f : 4.0f)));
                return;
            }
        }
        this.f83230p = true;
        float f11 = size;
        if ((!MainActivity.E4 ? 4.0f : 3.0f) + f11 > 5.0f) {
            fL = ViewUtils.L(context);
            f10 = 4.5f;
        } else {
            fL = ViewUtils.L(context) * 1.0f;
            f10 = f11 + (MainActivity.E4 ? 3.0f : 4.0f);
        }
        int i10 = (int) (fL / f10);
        b4(linearLayout, i10);
        for (int i11 = 0; i11 < size; i11++) {
            c4(this.f83231q.get(i11), linearLayout, i10, "other");
        }
    }
}
