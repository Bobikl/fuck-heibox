package com.max.xiaoheihe.module.bbs.post_edit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.JsonArray;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.bean.bbs.HtmlLinkContentObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LinkEditHashTagManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nLinkEditHashTagManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkEditHashTagManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/LinkEditHashTagManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n*L\n1#1,143:1\n1855#2,2:144\n1855#2,2:146\n1855#2,2:153\n29#3:148\n5#3,2:149\n22#3:151\n7#3:152\n*S KotlinDebug\n*F\n+ 1 LinkEditHashTagManager.kt\ncom/max/xiaoheihe/module/bbs/post_edit/LinkEditHashTagManager\n*L\n51#1:144,2\n75#1:146,2\n109#1:153,2\n104#1:148\n104#1:149,2\n104#1:151\n104#1:152\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class i {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82987j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Activity f82988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j f82989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private LayoutInflater f82990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f82991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private LinearLayout f82992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private Bundle f82993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final LinkInfoObj f82994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f82995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f82996i;

    /* JADX INFO: compiled from: LinkEditHashTagManager.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82998c;

        a(String str) {
            this.f82998c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29674, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i.this.f82996i.remove(this.f82998c);
            i.this.f82989b.j1();
        }
    }

    public i(@dl.d Activity context, @dl.d j linkEditHost, @dl.d LayoutInflater mInflater, int i10, @dl.d LinearLayout llTopic, @dl.e Bundle bundle, @dl.e LinkInfoObj linkInfoObj) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(linkEditHost, "linkEditHost");
        kotlin.jvm.internal.f0.p(mInflater, "mInflater");
        kotlin.jvm.internal.f0.p(llTopic, "llTopic");
        this.f82988a = context;
        this.f82989b = linkEditHost;
        this.f82990c = mInflater;
        this.f82991d = i10;
        this.f82992e = llTopic;
        this.f82993f = bundle;
        this.f82994g = linkInfoObj;
        this.f82996i = new ArrayList<>();
        l();
    }

    private final void l() {
        ArrayList<ConceptPostTagObj> hashtags;
        Serializable serializable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29668, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = this.f82993f;
        if (bundle != null && (serializable = bundle.getSerializable("tags")) != null && (serializable instanceof ArrayList)) {
            for (Object obj : (Iterable) serializable) {
                if (obj instanceof String) {
                    this.f82996i.add((String) obj);
                }
            }
        }
        int i10 = this.f82991d;
        if (i10 == 0 || i10 == 9) {
            Bundle bundle2 = this.f82993f;
            this.f82995h = bundle2 != null ? bundle2.getString("hashtag") : null;
        } else if (i10 == 14 || i10 == 11 || i10 == 12) {
            Bundle bundle3 = this.f82993f;
            this.f82995h = bundle3 != null ? bundle3.getString("hashtag") : null;
        }
        String str = this.f82995h;
        if (str != null) {
            String str2 = this.f82996i.contains(str) ^ true ? str : null;
            if (str2 != null) {
                this.f82996i.add(str2);
            }
        }
        LinkInfoObj linkInfoObj = this.f82994g;
        if (linkInfoObj == null || (hashtags = linkInfoObj.getHashtags()) == null) {
            return;
        }
        for (ConceptPostTagObj conceptPostTagObj : hashtags) {
            if (!com.max.hbcommon.utils.c.u(conceptPostTagObj.getName())) {
                ArrayList<String> arrayList = this.f82996i;
                String name = conceptPostTagObj.getName();
                kotlin.jvm.internal.f0.m(name);
                arrayList.add(name);
            }
        }
    }

    public final void c(@dl.d String hashtagName) {
        String name;
        if (PatchProxy.proxy(new Object[]{hashtagName}, this, changeQuickRedirect, false, 29671, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(hashtagName, "hashtagName");
        String str = "addHashTag, hashtagName = " + hashtagName;
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (i.class.isAnonymousClass()) {
            name = i.class.getName();
            kotlin.jvm.internal.f0.m(name);
        } else {
            name = i.class.getSimpleName();
            kotlin.jvm.internal.f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
    }

    public final void d(@dl.d Map<String, String> paramsMap, @dl.e HtmlLinkContentObj htmlLinkContentObj) {
        if (PatchProxy.proxy(new Object[]{paramsMap, htmlLinkContentObj}, this, changeQuickRedirect, false, 29673, new Class[]{Map.class, HtmlLinkContentObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(paramsMap, "paramsMap");
        JsonArray jsonArray = new JsonArray();
        if (com.max.hbcommon.utils.c.w(this.f82996i)) {
            return;
        }
        for (String hashtagName : this.f82996i) {
            kotlin.jvm.internal.f0.o(hashtagName, "hashtagName");
            jsonArray.add(kotlin.text.u.l2(hashtagName, "#", "", false, 4, null));
        }
        paramsMap.put("hashtags", jsonArray.toString());
    }

    @dl.e
    public final Bundle e() {
        return this.f82993f;
    }

    @dl.e
    public final LinkInfoObj f() {
        return this.f82994g;
    }

    @dl.d
    public final LayoutInflater g() {
        return this.f82990c;
    }

    @dl.d
    public final List<String> h() {
        return this.f82996i;
    }

    @dl.e
    public final List<String> i() {
        return this.f82996i;
    }

    public final int j() {
        return this.f82991d;
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29669, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f82996i.size() >= 5) {
            com.max.hbutils.utils.c.f(this.f82988a.getString(R.string.toast_hashtag_count_limit));
        } else {
            this.f82989b.F1();
        }
    }

    public final void m(@dl.d ArrayList<String> hashTags) {
        if (PatchProxy.proxy(new Object[]{hashTags}, this, changeQuickRedirect, false, 29670, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(hashTags, "hashTags");
        this.f82996i = hashTags;
    }

    public final void n(@dl.e Bundle bundle) {
        this.f82993f = bundle;
    }

    public final void o(@dl.d LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{layoutInflater}, this, changeQuickRedirect, false, 29667, new Class[]{LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(layoutInflater, "<set-?>");
        this.f82990c = layoutInflater;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void p() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (String str : this.f82996i) {
            View viewInflate = this.f82990c.inflate(R.layout.item_topics_new, (ViewGroup) this.f82992e, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_close);
            imageView.setImageResource(R.drawable.bbs_topic_filled_24x24);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = ViewUtils.f(this.f82988a, 10.0f);
            layoutParams.height = ViewUtils.f(this.f82988a, 10.0f);
            imageView.setLayoutParams(layoutParams);
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            textView.setText(str);
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new a(str));
            this.f82992e.addView(viewInflate);
        }
    }
}
