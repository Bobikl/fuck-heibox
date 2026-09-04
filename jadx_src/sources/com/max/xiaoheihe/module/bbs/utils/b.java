package com.max.xiaoheihe.module.bbs.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbsearch.SearchNewActivity;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.CountDownTopPanel;
import com.max.video.impl.PlainVideoUI;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkVoteObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSVoteOptionObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.bean.bbs.FeedsContentAdObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecLinksObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentRecSwitchObj;
import com.max.xiaoheihe.bean.bbs.ForbidInfoObj;
import com.max.xiaoheihe.bean.bbs.ImageInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkVoteInfoObj;
import com.max.xiaoheihe.bean.bbs.VoteOptionObj;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.news.FeedsContentArtRecObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentEntryObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameCommentObj;
import com.max.xiaoheihe.bean.news.FeedsContentGameObj;
import com.max.xiaoheihe.bean.news.FeedsContentNewsTopicObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecHashObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecNewsObj;
import com.max.xiaoheihe.bean.news.FeedsUiKitObj;
import com.max.xiaoheihe.bean.news.NewsMenuObj;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.TopicDetailActivity;
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentView;
import com.max.xiaoheihe.module.bbs.component.BBSLinkImageContentViewV2;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListBottomBar;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListTopView;
import com.max.xiaoheihe.module.bbs.component.BBSTagRecommendView;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeComment;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.PostPageParam;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.GameStoreActivity;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.news.NewsHelper;
import com.max.xiaoheihe.module.story.StoryActivity;
import com.max.xiaoheihe.module.webview.NativePostWebActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import df.cg;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BBSUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f83396a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f83397b = "default";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f83398c = "feedback";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f83399d = "news_feed";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f83400e = "conciseness";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f83401f = "channels";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f83402g;

    /* JADX INFO: compiled from: BBSUtils.java */
    public class a extends com.max.hbcommon.base.adapter.s<CollectionFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f83405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerView.Adapter f83406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f83407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f83409h;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BBSUtils.java */
        public class ViewOnClickListenerC0723a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CollectionFolder f83410b;

            ViewOnClickListenerC0723a(CollectionFolder collectionFolder) {
                this.f83410b = collectionFolder;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31256, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                a aVar = a.this;
                Context context = aVar.f83403b;
                String str = aVar.f83404c;
                List list = aVar.f83405d;
                RecyclerView.Adapter adapter = aVar.f83406e;
                int i10 = aVar.f83407f;
                String id2 = this.f83410b.getId();
                a aVar2 = a.this;
                b.B(context, str, list, adapter, i10, id2, aVar2.f83408g, aVar2.f83409h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, int i10, Context context2, String str, List list2, RecyclerView.Adapter adapter, int i11, com.max.hbcommon.component.i iVar, String str2) {
            super(context, list, i10);
            this.f83403b = context2;
            this.f83404c = str;
            this.f83405d = list2;
            this.f83406e = adapter;
            this.f83407f = i11;
            this.f83408g = iVar;
            this.f83409h = str2;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, CollectionFolder collectionFolder) {
            if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31254, new Class[]{com.max.hbcommon.base.adapter.s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_folder_name);
            textView.setText(collectionFolder.getName());
            textView.setOnClickListener(new ViewOnClickListenerC0723a(collectionFolder));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, CollectionFolder collectionFolder) {
            if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31255, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, collectionFolder);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BBSUtils.java */
    public class ViewOnClickListenerC0724b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83412b;

        ViewOnClickListenerC0724b(com.max.hbcommon.component.i iVar) {
            this.f83412b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31257, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f83412b.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f83415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerView.Adapter f83416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f83417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f83418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f83419h;

        /* JADX INFO: compiled from: BBSUtils.java */
        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31259, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BBSUtils.java */
        public class DialogInterfaceOnClickListenerC0725b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f83421b;

            DialogInterfaceOnClickListenerC0725b(EditText editText) {
                this.f83421b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31260, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f83421b.getText().toString().getBytes(Charset.defaultCharset()).length > 24) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("最多输入8个字");
                    return;
                }
                dialogInterface.dismiss();
                c cVar2 = c.this;
                Context context = cVar2.f83413b;
                String str = cVar2.f83414c;
                List list = cVar2.f83415d;
                RecyclerView.Adapter adapter = cVar2.f83416e;
                int i11 = cVar2.f83417f;
                String string = this.f83421b.getText().toString();
                c cVar3 = c.this;
                b.f(context, str, list, adapter, i11, string, cVar3.f83418g, cVar3.f83419h);
            }
        }

        c(Context context, String str, List list, RecyclerView.Adapter adapter, int i10, com.max.hbcommon.component.i iVar, String str2) {
            this.f83413b = context;
            this.f83414c = str;
            this.f83415d = list;
            this.f83416e = adapter;
            this.f83417f = i10;
            this.f83418g = iVar;
            this.f83419h = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31258, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EditText editTextI = b.i(this.f83413b);
            new com.max.hbcommon.view.a.f(this.f83413b).t(R.string.create, new DialogInterfaceOnClickListenerC0725b(editTextI)).n(R.string.cancel, new a()).i(editTextI).y("创建收藏夹").d().show();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f83423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f83424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RecyclerView.Adapter f83425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Dialog f83426e;

        d(int i10, List list, RecyclerView.Adapter adapter, Dialog dialog) {
            this.f83423b = i10;
            this.f83424c = list;
            this.f83425d = adapter;
            this.f83426e = dialog;
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31261, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("移动成功");
            int i10 = this.f83423b;
            if (i10 == -1) {
                Iterator it = this.f83424c.iterator();
                while (it.hasNext()) {
                    if (((BBSLinkObj) it.next()).isChecked()) {
                        it.remove();
                    }
                }
                this.f83425d.notifyDataSetChanged();
            } else {
                this.f83424c.remove(i10);
                this.f83425d.notifyItemRemoved(this.f83423b);
            }
            this.f83426e.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31262, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Dialog f83427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f83428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f83430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ RecyclerView.Adapter f83431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f83432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f83433h;

        e(Dialog dialog, Context context, String str, List list, RecyclerView.Adapter adapter, int i10, String str2) {
            this.f83427b = dialog;
            this.f83428c = context;
            this.f83429d = str;
            this.f83430e = list;
            this.f83431f = adapter;
            this.f83432g = i10;
            this.f83433h = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31264, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("创建失败");
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31263, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            this.f83427b.dismiss();
            b.h(this.f83428c, this.f83429d, this.f83430e, this.f83431f, this.f83432g, this.f83433h);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31265, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83435c;

        f(Context context, String str) {
            this.f83434b = context;
            this.f83435c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31266, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f83434b, this.f83435c);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class g extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f83436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f83437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f83438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f83439e;

        g(RecyclerView recyclerView, int i10, int i11, int i12) {
            this.f83436b = recyclerView;
            this.f83437c = i10;
            this.f83438d = i11;
            this.f83439e = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@n0 Rect rect, @n0 View view, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 31267, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            if (!(this.f83436b.getAdapter() instanceof com.max.hbcommon.base.adapter.t) || recyclerView.getChildAdapterPosition(view) > ((com.max.hbcommon.base.adapter.t) this.f83436b.getAdapter()).u() - 1) {
                if (layoutParams.getSpanIndex() % 2 == 0) {
                    rect.set(this.f83437c, 0, this.f83438d, this.f83439e);
                } else {
                    rect.set(this.f83438d, 0, this.f83437c, this.f83439e);
                }
            }
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class h implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ cg f83441b;

        h(BBSLinkObj bBSLinkObj, cg cgVar) {
            this.f83440a = bBSLinkObj;
            this.f83441b = cgVar;
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 31268, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            if ("1".equals(this.f83440a.getThumb().getFill_type())) {
                this.f83441b.f109383d.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                this.f83441b.f109383d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            this.f83441b.f109383d.setImageDrawable(drawable);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ cg f83444d;

        i(Context context, BBSLinkObj bBSLinkObj, cg cgVar) {
            this.f83442b = context;
            this.f83443c = bBSLinkObj;
            this.f83444d = cgVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31269, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(this.f83442b)) {
                String str = "1".equals(this.f83443c.getIs_award_link()) ? "0" : "1";
                b.b(this.f83443c, str);
                this.f83443c.setIs_award_link(str);
                this.f83443c.setLink_award_num(String.valueOf("1".equals(str) ? com.max.hbutils.utils.n.q(this.f83443c.getLink_award_num()) + 1 : Math.max(0, com.max.hbutils.utils.n.q(this.f83443c.getLink_award_num()) - 1)));
                this.f83444d.f109388i.setText(this.f83443c.getLink_award_num());
                if ("1".equals(this.f83443c.getIs_award_link())) {
                    this.f83444d.f109388i.setTextColor(this.f83442b.getResources().getColor(R.color.text_primary_1_color));
                    this.f83444d.f109386g.setChecked(true, true);
                } else {
                    this.f83444d.f109388i.setTextColor(this.f83442b.getResources().getColor(R.color.text_secondary_2_color));
                    this.f83444d.f109386g.setChecked(false);
                }
            }
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f83446c;

        j(BBSLinkObj bBSLinkObj, Context context) {
            this.f83445b = bBSLinkObj;
            this.f83446c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31270, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.b(this.f83445b.getAd_report());
            if (b.w(this.f83445b.getContent_type())) {
                com.max.xiaoheihe.base.router.b.k0(this.f83446c, this.f83445b.getProtocol());
            } else {
                b.E(this.f83446c, this.f83445b);
            }
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f83448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f83449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f83450e;

        k(BBSLinkObj bBSLinkObj, y yVar, View view, Context context) {
            this.f83447b = bBSLinkObj;
            this.f83448c = yVar;
            this.f83449d = view;
            this.f83450e = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31253, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f83447b.getIs_deleted() == null || !"1".equals(this.f83447b.getIs_deleted())) {
                AbsVideoView absVideoView = (AbsVideoView) this.f83449d.findViewById(R.id.video_view);
                if (absVideoView != null && absVideoView.getCurrentPosition() > 0) {
                    absVideoView.getCurrentPosition();
                }
                b.E(this.f83450e, this.f83447b);
            }
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f83452c;

        l(Context context, BBSTopicObj bBSTopicObj) {
            this.f83451b = context;
            this.f83452c = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31273, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b.H(this.f83451b, this.f83452c);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class m extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f83453b;

        m(l0.g gVar) {
            this.f83453b = gVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31275, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31274, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            l0.g gVar = this.f83453b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31276, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 31277, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class o extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31278, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result == null || com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.x.j("举报成功，我们将尽快受理");
            } else {
                com.max.hbutils.utils.x.j(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31279, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class p extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31280, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (result == null || com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.x.j("举报成功，我们将尽快受理");
            } else {
                com.max.hbutils.utils.x.j(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31281, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class q extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31271, new Class[]{Result.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(result.getMsg())) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(result.getMsg());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31272, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f83455c;

        r(Context context, BBSUserInfoObj bBSUserInfoObj) {
            this.f83454b = context;
            this.f83455c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31282, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(this.f83454b, this.f83455c.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f83457c;

        s(Context context, BBSUserInfoObj bBSUserInfoObj) {
            this.f83456b = context;
            this.f83457c = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31283, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.T(this.f83456b, this.f83457c.getUserid()).A();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f83458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.adapter.s.e f83459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f83461e;

        t(y yVar, com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj, Context context) {
            this.f83458b = yVar;
            this.f83459c = eVar;
            this.f83460d = bBSLinkObj;
            this.f83461e = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31284, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            y yVar = this.f83458b;
            if (yVar != null) {
                yVar.a(this.f83459c, this.f83460d);
            }
            AbsVideoView absVideoView = (AbsVideoView) this.f83459c.i(R.id.video_view);
            if (absVideoView != null && absVideoView.getCurrentPosition() > 0) {
                absVideoView.getCurrentPosition();
            }
            b.E(this.f83461e, this.f83460d);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f83462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f83463c;

        u(BBSLinkObj bBSLinkObj, Context context) {
            this.f83462b = bBSLinkObj;
            this.f83463c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31285, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BBSLinkObj bBSLinkObj = this.f83462b;
            bBSLinkObj.setRoot_comment_id(bBSLinkObj.getSub().getComment_id());
            b.E(this.f83463c, this.f83462b);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f83465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WikiArticelObj f83466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83467e;

        v(String str, Context context, WikiArticelObj wikiArticelObj, String str2) {
            this.f83464b = str;
            this.f83465c = context;
            this.f83466d = wikiArticelObj;
            this.f83467e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31286, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f83464b)) {
                return;
            }
            if ((this.f83465c instanceof SearchNewActivity) && this.f83466d.getReport_id() != null) {
                com.max.hbcommon.utils.k.f(this.f83466d.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f83466d.getCustom_index(), this.f83466d.getCustom_suggested_from());
            }
            if (!this.f83464b.startsWith("http")) {
                com.max.xiaoheihe.base.router.b.k0(this.f83465c, this.f83464b);
                return;
            }
            Intent intent = new Intent(this.f83465c, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", this.f83464b);
            intent.putExtra("title", this.f83467e);
            this.f83465c.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f83468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f83469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83470d;

        w(ImageView imageView, int i10, String str) {
            this.f83468b = imageView;
            this.f83469c = i10;
            this.f83470d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31287, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageViewerHelper.a(this.f83468b.getContext()).m(ImageViewerHelper.d(this.f83468b, this.f83469c), this.f83470d.split(";")).d(this.f83469c).p();
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public class x extends com.max.hbcommon.network.d<Result<CollectionFolders>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f83473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RecyclerView.Adapter f83474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f83475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f83476g;

        x(Context context, String str, List list, RecyclerView.Adapter adapter, int i10, String str2) {
            this.f83471b = context;
            this.f83472c = str;
            this.f83473d = list;
            this.f83474e = adapter;
            this.f83475f = i10;
            this.f83476g = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31289, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<CollectionFolders> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31288, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            List<CollectionFolder> folders = result.getResult().getFolders();
            if (com.max.hbcommon.utils.c.w(folders)) {
                return;
            }
            b.Y(this.f83471b, this.f83472c, this.f83473d, this.f83474e, this.f83475f, folders, this.f83476g);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31290, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CollectionFolders>) obj);
        }
    }

    /* JADX INFO: compiled from: BBSUtils.java */
    public interface y {
        void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj);
    }

    public static void A(@n0 String str, @n0 ImageView imageView, @n0 String str2, int i10, int i11, boolean z10) {
        Object[] objArr = {str, imageView, str2, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31230, new Class[]{String.class, ImageView.class, String.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.P(str, imageView, R.drawable.common_default_placeholder_375x210, -1, -1, 1.0f, false, i10, false, true);
        imageView.setClickable(false);
    }

    public static io.reactivex.disposables.b B(Context context, String str, List<BBSLinkObj> list, RecyclerView.Adapter adapter, int i10, String str2, Dialog dialog, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, list, adapter, new Integer(i10), str2, dialog, str3}, null, changeQuickRedirect, true, 31233, new Class[]{Context.class, String.class, List.class, RecyclerView.Adapter.class, Integer.TYPE, String.class, Dialog.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a7(str2, str3, 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(i10, list, adapter, dialog));
    }

    public static void C(Context context, FeedsContentBaseObj feedsContentBaseObj) {
        if (PatchProxy.proxy(new Object[]{context, feedsContentBaseObj}, null, changeQuickRedirect, true, 31209, new Class[]{Context.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        D(context, feedsContentBaseObj, false);
    }

    private static void D(Context context, FeedsContentBaseObj feedsContentBaseObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, feedsContentBaseObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31210, new Class[]{Context.class, FeedsContentBaseObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (feedsContentBaseObj instanceof BBSLinkObj) {
            BBSLinkObj bBSLinkObj = (BBSLinkObj) feedsContentBaseObj;
            if (com.max.hbcommon.utils.c.x(bBSLinkObj.getHas_video())) {
                VideoInfoObj video_info = bBSLinkObj.getVideo_info();
                if (video_info != null) {
                    video_info.setLink_id(bBSLinkObj.getLinkid());
                }
                context.startActivity(StoryActivity.P0(context, bBSLinkObj.toStoryItemsObj(), l0.A0(bBSLinkObj), bBSLinkObj.getH_src()));
                return;
            }
            if (z10) {
                if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getMaxjia())) {
                    com.max.xiaoheihe.base.router.b.k0(context, bBSLinkObj.getMaxjia());
                    return;
                }
                if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getClick_protocol())) {
                    com.max.xiaoheihe.base.router.b.k0(context, bBSLinkObj.getClick_protocol());
                    return;
                }
                com.sankuai.waimai.router.core.i iVarJ = j(context, bBSLinkObj);
                if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getComment_id())) {
                    com.max.xiaoheihe.router.interceptors.m.l(iVarJ, "comment_id", bBSLinkObj.getComment_id());
                }
                com.max.xiaoheihe.base.router.b.z0(iVarJ);
                return;
            }
        }
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.G0))) {
            try {
                Intent intent = new Intent(context, (Class<?>) NativePostWebActivity.class);
                intent.putExtra("link_id", ((BBSLinkObj) feedsContentBaseObj).getLinkid());
                com.max.xiaoheihe.utils.d.G1(context, intent);
                return;
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("NativeWebActionActivity start error: " + th2.getMessage());
                return;
            }
        }
        if (context instanceof SearchNewActivity) {
            com.max.hbcommon.utils.k.o();
            if (feedsContentBaseObj.getReport_id() != null) {
                com.max.hbcommon.utils.k.f(feedsContentBaseObj.getReport_id(), UiKitSpanObj.TYPE_CLICK, feedsContentBaseObj.getCustom_index(), feedsContentBaseObj.getCustom_suggested_from());
            }
        }
        if (!com.max.hbcommon.utils.c.u(feedsContentBaseObj.getMaxjia())) {
            com.max.xiaoheihe.base.router.b.k0(context, feedsContentBaseObj.getMaxjia());
            return;
        }
        if ("6".equals(feedsContentBaseObj.getContent_type())) {
            com.max.xiaoheihe.utils.d.G1(context, GameStoreActivity.R1(context));
            return;
        }
        if ("12".equals(feedsContentBaseObj.getContent_type()) || "13".equals(feedsContentBaseObj.getContent_type())) {
            FeedsContentGameObj feedsContentGameObj = (FeedsContentGameObj) feedsContentBaseObj;
            com.max.xiaoheihe.utils.d.G1(context, z.b(context, feedsContentGameObj.getGame().getH_src(), feedsContentGameObj.getGame().getAppid(), "mobile", null, i0.m(), i0.j(), null));
            return;
        }
        if ("1".equals(feedsContentBaseObj.getContent_type()) || "2".equals(feedsContentBaseObj.getContent_type()) || "4".equals(feedsContentBaseObj.getContent_type()) || "14".equals(feedsContentBaseObj.getContent_type()) || "20".equals(feedsContentBaseObj.getContent_type()) || "15".equals(feedsContentBaseObj.getContent_type()) || "16".equals(feedsContentBaseObj.getContent_type()) || BBSLinkObj.CONTENT_TYPE_NEWS_TOP.equals(feedsContentBaseObj.getContent_type()) || BBSLinkObj.CONTENT_TYPE_LINK_NEWS_WITH_TOP_USER.equals(feedsContentBaseObj.getContent_type()) || feedsContentBaseObj.isZhiHuNewsFeedsLink()) {
            com.max.xiaoheihe.base.router.b.z0(j(context, (BBSLinkObj) feedsContentBaseObj));
            return;
        }
        if (BBSLinkObj.CONTENT_TYPE_UI_KIT.equals(feedsContentBaseObj.getContent_type())) {
            BBSLinkObj link = ((FeedsUiKitObj) feedsContentBaseObj).getLink();
            if (link != null) {
                com.max.xiaoheihe.base.router.b.z0(j(context, link));
                return;
            }
            return;
        }
        if ("19".equals(feedsContentBaseObj.getContent_type())) {
            com.max.xiaoheihe.base.router.b.z0(k(context, (BBSLinkObj) feedsContentBaseObj, false));
            return;
        }
        if ("18".equals(feedsContentBaseObj.getContent_type())) {
            com.max.xiaoheihe.utils.d.I1(context);
            return;
        }
        if ("10".equals(feedsContentBaseObj.getContent_type())) {
            H(context, ((FeedsContentEntryObj) feedsContentBaseObj).getTopic());
            return;
        }
        if ("22".equals(feedsContentBaseObj.getContent_type())) {
            com.max.xiaoheihe.base.router.b.i0(context, lb.d.f131171h1);
            return;
        }
        if ("27".equals(feedsContentBaseObj.getContent_type()) || "26".equals(feedsContentBaseObj.getContent_type()) || "28".equals(feedsContentBaseObj.getContent_type()) || "29".equals(feedsContentBaseObj.getContent_type())) {
            com.max.xiaoheihe.base.router.b.k0(context, ((BBSLinkObj) feedsContentBaseObj).getProtocol());
            com.max.hbcommon.utils.k.b(feedsContentBaseObj.getAd_report());
            return;
        }
        if (!"42".equals(feedsContentBaseObj.getContent_type())) {
            if ("40".equals(feedsContentBaseObj.getContent_type()) && (feedsContentBaseObj instanceof BBSLinkObj)) {
                E(context, (BBSLinkObj) feedsContentBaseObj);
                return;
            }
            return;
        }
        if (feedsContentBaseObj instanceof FeedsContentGameCommentObj) {
            FeedsContentGameCommentObj feedsContentGameCommentObj = (FeedsContentGameCommentObj) feedsContentBaseObj;
            if (feedsContentGameCommentObj.getLink() != null) {
                E(context, feedsContentGameCommentObj.getLink());
            }
        }
    }

    public static void E(Context context, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{context, bBSLinkObj}, null, changeQuickRedirect, true, 31208, new Class[]{Context.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        D(context, bBSLinkObj, true);
    }

    public static void F(Context context, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 31206, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        G(context, str, str2, str3, str4, str5, null);
    }

    public static void G(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 31207, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSLinkObj bBSLinkObj = new BBSLinkObj();
        bBSLinkObj.setH_src(str);
        bBSLinkObj.setLinkid(str2);
        bBSLinkObj.setLink_tag(str3);
        bBSLinkObj.setHas_video(str4);
        bBSLinkObj.setRoot_comment_id(str5);
        bBSLinkObj.setComment_id(str6);
        E(context, bBSLinkObj);
    }

    public static void H(Context context, BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{context, bBSTopicObj}, null, changeQuickRedirect, true, 31203, new Class[]{Context.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        I(context, bBSTopicObj, "link");
    }

    public static void I(Context context, BBSTopicObj bBSTopicObj, String str) {
        if (PatchProxy.proxy(new Object[]{context, bBSTopicObj, str}, null, changeQuickRedirect, true, 31204, new Class[]{Context.class, BBSTopicObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        J(context, bBSTopicObj, str, null, null, null, null);
    }

    public static void J(Context context, BBSTopicObj bBSTopicObj, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{context, bBSTopicObj, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 31205, new Class[]{Context.class, BBSTopicObj.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported || context == null || bBSTopicObj == null) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(bBSTopicObj.getProtocol())) {
            com.max.xiaoheihe.base.router.b.k0(context, bBSTopicObj.getProtocol());
            return;
        }
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(bBSTopicObj.getTopic_id())) {
            context.startActivity(TopicDetailActivity.M1(context, null, bBSTopicObj, null));
            return;
        }
        Intent intentN3 = ChannelsDetailActivity.n3(context, bBSTopicObj.getH_src(), bBSTopicObj.getTopic_id(), bBSTopicObj.getGame() != null ? bBSTopicObj.getGame().getAppid() : null, bBSTopicObj.getGame() != null ? bBSTopicObj.getGame().getGame_type() : null, null, null, null, null, str, str2);
        if (!com.max.hbcommon.utils.c.u(str3)) {
            ChannelsDetailActivity.a3(intentN3, str3);
        }
        ChannelsDetailActivity.f3(intentN3, str4, str5);
        com.max.xiaoheihe.utils.d.G1(context, intentN3);
    }

    public static void K(Context context, com.max.hbcommon.base.adapter.s.e eVar, FeedsContentEntryObj feedsContentEntryObj) {
        int i10;
        int iF;
        View view;
        int i11 = 1;
        if (PatchProxy.proxy(new Object[]{context, eVar, feedsContentEntryObj}, null, changeQuickRedirect, true, 31235, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, FeedsContentEntryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_bg);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_img);
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_menu);
        com.max.hbimage.b.d0(feedsContentEntryObj.getTopic().getBg_pic_url(), imageView, ViewUtils.m(context, ViewUtils.L(context), ViewUtils.f(context, 70.0f)));
        com.max.hbimage.b.d0(feedsContentEntryObj.getTopic().getPic_url(), imageView2, ViewUtils.o(context, imageView2));
        textView.setText(feedsContentEntryObj.getTopic().getName());
        int iL = ViewUtils.L(context) - ViewUtils.f(context, 130.0f);
        viewGroup.removeAllViews();
        if (com.max.hbcommon.utils.c.w(feedsContentEntryObj.getItems())) {
            return;
        }
        int iF2 = ViewUtils.f(context, 7.0f);
        int iF3 = ViewUtils.f(context, 4.0f);
        int iH0 = ViewUtils.h0(context, ViewUtils.m(context, ViewUtils.f(context, 34.0f), ViewUtils.f(context, 20.0f)));
        int i12 = 0;
        for (NewsMenuObj newsMenuObj : feedsContentEntryObj.getItems()) {
            if (newsMenuObj.getRich_text() != null) {
                RichStackModelView richStackModelView = new RichStackModelView(context);
                richStackModelView.setRichStackData(newsMenuObj.getRich_text());
                iF = ViewUtils.W(richStackModelView) + iF3;
                i10 = i11;
                view = richStackModelView;
            } else {
                TextView textView2 = new TextView(context);
                String maxjia = newsMenuObj.getMaxjia();
                StateListDrawable stateListDrawable = new StateListDrawable();
                int[] iArr = new int[i11];
                iArr[0] = 16842919;
                float f10 = iH0;
                stateListDrawable.addState(iArr, com.max.hbutils.utils.q.o(context, R.color.white_alpha10, f10));
                stateListDrawable.addState(new int[0], com.max.hbutils.utils.q.o(context, R.color.white_alpha20, f10));
                textView2.setPadding(iF2, 0, iF2, 0);
                textView2.setGravity(17);
                i10 = 1;
                textView2.setTextSize(1, 10.0f);
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                textView2.setBackgroundDrawable(stateListDrawable);
                textView2.setText(newsMenuObj.getName());
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine(true);
                textView2.setTypeface(bb.d.a().b(0));
                textView2.setOnClickListener(new f(context, maxjia));
                iF = (int) (ViewUtils.f(context, 18.0f) + ViewUtils.S(textView2.getPaint(), newsMenuObj.getName()));
                view = textView2;
            }
            i12 += iF;
            if (i12 > iL + iF3) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.rightMargin = iF3;
            viewGroup.addView(view, layoutParams);
            i11 = i10;
        }
    }

    public static void L(Context context, BBSLinkObj bBSLinkObj, BBSUserInfoObj bBSUserInfoObj, com.max.hbcommon.base.adapter.s.e eVar, View.OnLongClickListener onLongClickListener) {
        if (PatchProxy.proxy(new Object[]{context, bBSLinkObj, bBSUserInfoObj, eVar, onLongClickListener}, null, changeQuickRedirect, true, 31239, new Class[]{Context.class, BBSLinkObj.class, BBSUserInfoObj.class, com.max.hbcommon.base.adapter.s.e.class, View.OnLongClickListener.class}, Void.TYPE).isSupported || bBSLinkObj == null) {
            return;
        }
        cg cgVarA = cg.a(eVar.itemView);
        if (bBSLinkObj.getThumb() != null) {
            cgVarA.f109383d.setVisibility(0);
            W(context, cgVarA.f109383d, bBSLinkObj.getThumb(), -1);
            int i10 = cgVarA.f109383d.getLayoutParams().width;
            int i11 = cgVarA.f109383d.getLayoutParams().height;
            cgVarA.f109383d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            cgVarA.f109383d.setImageDrawable(com.max.hbutils.utils.q.l(context, i10, i11, i10));
            com.max.hbimage.b.X(context, cgVarA.f109383d, bBSLinkObj.getThumb().getUrl(), new h(bBSLinkObj, cgVarA));
            if ("1".equals(bBSLinkObj.getHas_video())) {
                cgVarA.f109394o.setVisibility(0);
                cgVarA.f109394o.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha40, 2.0f));
            } else {
                cgVarA.f109394o.setVisibility(8);
            }
        } else {
            cgVarA.f109383d.setVisibility(8);
            cgVarA.f109394o.setVisibility(8);
        }
        com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), cgVarA.f109382c, R.drawable.common_default_avatar_40x40);
        cgVarA.f109389j.setText(bBSUserInfoObj.getUsername());
        if (w(bBSLinkObj.getContent_type())) {
            cgVarA.f109386g.setVisibility(8);
            cgVarA.f109388i.setText(!com.max.hbcommon.utils.c.u(bBSLinkObj.getContent_extra_desc()) ? bBSLinkObj.getContent_extra_desc() : "推广");
            cgVarA.f109388i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            cgVarA.f109393n.setOnClickListener(null);
        } else {
            cgVarA.f109386g.setVisibility(0);
            cgVarA.f109388i.setText(String.valueOf(com.max.hbutils.utils.n.q(bBSLinkObj.getLink_award_num())));
            if ("1".equals(bBSLinkObj.getIs_award_link())) {
                cgVarA.f109386g.setChecked(true);
                cgVarA.f109388i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else {
                cgVarA.f109386g.setChecked(false);
                cgVarA.f109388i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            }
            cgVarA.f109393n.setOnClickListener(new i(context, bBSLinkObj, cgVarA));
        }
        cgVarA.f109390k.setClickableAt(false);
        cgVarA.f109387h.setClickableAt(false);
        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
            cgVarA.f109390k.setVisibility(0);
            cgVarA.f109390k.setText(bBSLinkObj.getTitle());
            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription()) || bBSLinkObj.getThumb() != null) {
                cgVarA.f109387h.setVisibility(8);
            } else {
                cgVarA.f109387h.setVisibility(0);
                cgVarA.f109387h.setText(bBSLinkObj.getDescription());
            }
        } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
            cgVarA.f109390k.setVisibility(8);
            cgVarA.f109387h.setVisibility(8);
        } else {
            cgVarA.f109390k.setVisibility(0);
            cgVarA.f109390k.setText(bBSLinkObj.getDescription());
            cgVarA.f109387h.setVisibility(8);
        }
        if (bBSLinkObj.getAd_report() != null && !"1".equals(bBSLinkObj.getIsReported())) {
            com.max.hbcommon.utils.k.c(bBSLinkObj.getAd_report());
            bBSLinkObj.setIsReported("1");
        }
        if (bBSLinkObj.getBottom_rich_text() != null) {
            int iL = (ViewUtils.L(context) - ViewUtils.f(context, 52.0f)) / 2;
            cgVarA.f109385f.setVisibility(0);
            cgVarA.f109385f.setMMaxWidth(iL);
            cgVarA.f109385f.setRichStackData(bBSLinkObj.getBottom_rich_text());
        } else {
            cgVarA.f109385f.setVisibility(8);
        }
        if (bBSLinkObj.getImage_rb_rich_text() != null) {
            int iL2 = (ViewUtils.L(context) - ViewUtils.f(context, 34.0f)) / 2;
            cgVarA.f109384e.setVisibility(0);
            cgVarA.f109384e.setMMaxWidth(iL2);
            cgVarA.f109384e.setRichStackData(bBSLinkObj.getImage_rb_rich_text());
        } else {
            cgVarA.f109384e.setVisibility(8);
        }
        eVar.itemView.setTag(bBSLinkObj);
        eVar.itemView.setOnClickListener(new j(bBSLinkObj, context));
        if (com.max.hbcommon.utils.c.w(bBSLinkObj.getFeedback())) {
            eVar.itemView.setOnLongClickListener(null);
        } else {
            eVar.itemView.setOnLongClickListener(onLongClickListener);
        }
    }

    public static void M(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj, String str, int i10, UMShareListener uMShareListener, y yVar) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj, str, new Integer(i10), uMShareListener, yVar}, null, changeQuickRedirect, true, 31225, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class, String.class, Integer.TYPE, UMShareListener.class, y.class}, Void.TYPE).isSupported) {
            return;
        }
        N(eVar, bBSLinkObj, str, i10, uMShareListener, yVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0671  */
    /* JADX WARN: Code duplicated, block: B:168:0x0677  */
    /* JADX WARN: Code duplicated, block: B:169:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:171:0x06db  */
    /* JADX WARN: Code duplicated, block: B:174:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:175:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:179:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:181:0x0706  */
    /* JADX WARN: Code duplicated, block: B:182:0x070c  */
    /* JADX WARN: Code duplicated, block: B:185:0x071d  */
    /* JADX WARN: Code duplicated, block: B:187:0x072f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0740  */
    /* JADX WARN: Code duplicated, block: B:190:0x074a  */
    /* JADX WARN: Code duplicated, block: B:192:0x078f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0797  */
    /* JADX WARN: Code duplicated, block: B:195:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:197:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x07da  */
    /* JADX WARN: Code duplicated, block: B:201:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:203:0x0802  */
    /* JADX WARN: Code duplicated, block: B:205:0x0808  */
    /* JADX WARN: Code duplicated, block: B:207:0x080f  */
    /* JADX WARN: Code duplicated, block: B:208:0x081c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0829  */
    /* JADX WARN: Code duplicated, block: B:211:0x082f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0836  */
    /* JADX WARN: Code duplicated, block: B:215:0x0850  */
    /* JADX WARN: Code duplicated, block: B:216:0x0866  */
    /* JADX WARN: Code duplicated, block: B:218:0x0872  */
    /* JADX WARN: Code duplicated, block: B:219:0x0874  */
    /* JADX WARN: Code duplicated, block: B:221:0x0893  */
    /* JADX WARN: Code duplicated, block: B:223:0x08af  */
    /* JADX WARN: Code duplicated, block: B:224:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:226:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:227:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:230:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:232:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:233:0x0903  */
    /* JADX WARN: Code duplicated, block: B:235:0x090d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0914  */
    /* JADX WARN: Code duplicated, block: B:238:0x0920  */
    /* JADX WARN: Instruction removed from duplicated block: B:190:0x074a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:215:0x0850, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:219:0x0874, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:223:0x08af, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:227:0x08cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void N(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj, String str, int i10, UMShareListener uMShareListener, y yVar, boolean z10) {
        com.max.hbcommon.base.adapter.s.e eVar2;
        View view;
        View view2;
        BBSLinkImageContentView bBSLinkImageContentView;
        BBSLinkImageContentViewV2 bBSLinkImageContentViewV2;
        View view3;
        String str2;
        CharSequence charSequence;
        String str3;
        KeyDescObj special_tag;
        int iL;
        float f10;
        float f11;
        View view4;
        int i11;
        int i12;
        boolean z11;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String str4;
        String str5;
        String str6;
        int i13;
        int i14;
        int i15;
        String str7;
        TextView textView4;
        TextView textView5;
        ImageView imageView;
        String str8;
        String str9;
        String string;
        String str10;
        String str11;
        TextView textView6;
        CheckBox checkBox;
        SpannableStringBuilder spannableStringBuilder;
        KeyDescObj special_tag2;
        AbsVideoView absVideoView;
        int i16;
        BBSLinkObj bBSLinkObj2 = bBSLinkObj;
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj2, str, new Integer(i10), uMShareListener, yVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31226, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class, String.class, Integer.TYPE, UMShareListener.class, y.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        int iF = ("feedback".equals(str) || f83401f.equals(str)) ? 0 : ViewUtils.f(context, 2.0f);
        int iF2 = iF > 0 ? ViewUtils.f(context, 4.0f) : 0;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        String str12 = "1";
        switch (eVar.d()) {
            case R.layout.item_channels_link /* 2131558996 */:
            case R.layout.item_channels_link_swipe /* 2131558997 */:
            case R.layout.item_concept_moments_link /* 2131559032 */:
                eVar2 = eVar;
                if (R.layout.item_channels_link_swipe == eVar.d() || (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin == i10 && ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == iF2)) {
                    view = viewB;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i10;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iF2;
                    view = viewB;
                    view.setLayoutParams(layoutParams);
                }
                TextView textView7 = (TextView) eVar2.i(R.id.tv_title);
                ExpressionTextView expressionTextView = (ExpressionTextView) eVar2.i(R.id.tv_content);
                BBSLinkImageContentView bBSLinkImageContentView2 = (BBSLinkImageContentView) eVar2.i(R.id.ll_img);
                BBSLinkImageContentViewV2 bBSLinkImageContentViewV3 = (BBSLinkImageContentViewV2) eVar2.i(R.id.ll_img_v2);
                View viewI = eVar2.i(R.id.vg_thumb);
                ImageView imageView2 = (ImageView) eVar2.i(R.id.iv_thumb);
                ImageView imageView3 = (ImageView) eVar2.i(R.id.iv_video_play);
                view2 = view;
                TextView textView8 = (TextView) eVar2.i(R.id.tv_video_duration);
                BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) eVar2.i(R.id.vg_title);
                BBSLinkListBottomBar bBSLinkListBottomBar = (BBSLinkListBottomBar) eVar2.i(R.id.vg_bottom_bar);
                O(eVar, bBSLinkObj);
                String title = bBSLinkObj.getTitle();
                if ((f83400e.equals(str) || f83401f.equals(str)) && "1".equals(bBSLinkObj.getHas_video()) && com.max.hbcommon.utils.c.u(title)) {
                    title = bBSLinkObj.getDescription();
                }
                String str13 = title;
                BBSUserSectionView.BBSUserSectionType bBSUserSectionType = BBSUserSectionView.BBSUserSectionType.Link;
                bBSUserSectionView.setType(bBSUserSectionType);
                bBSLinkListBottomBar.setType(bBSUserSectionType);
                if (bBSLinkObj.getUser() != null) {
                    BBSUserInfoObj user = bBSLinkObj.getUser();
                    bBSLinkImageContentViewV2 = bBSLinkImageContentViewV3;
                    s sVar = new s(context, user);
                    bBSLinkImageContentView = bBSLinkImageContentView2;
                    view3 = viewI;
                    bBSUserSectionView.f80846b.setClickable(true);
                    str2 = "1";
                    bBSUserSectionView.f80846b.setAvatar(user.getAvartar(), user.getAvatar_decoration());
                    bBSUserSectionView.f80846b.setOnClickListener(sVar);
                    bBSUserSectionView.setName(user.getUsername());
                    bBSUserSectionView.f80847c.setOnClickListener(sVar);
                    AccountDetailObj accountDetailObjV1 = com.max.xiaoheihe.utils.d.V1(user);
                    bBSUserSectionView.a(accountDetailObjV1.getBbs_medal(), accountDetailObjV1.getMedals(), accountDetailObjV1.getUserid());
                    if (user.getLevel_info() != null) {
                        bBSUserSectionView.f80850f.setVisibility(0);
                        bBSUserSectionView.setLevel(com.max.hbutils.utils.n.q(user.getLevel_info().getLevel()));
                    } else {
                        bBSUserSectionView.f80850f.setVisibility(8);
                    }
                } else {
                    bBSLinkImageContentView = bBSLinkImageContentView2;
                    bBSLinkImageContentViewV2 = bBSLinkImageContentViewV3;
                    view3 = viewI;
                    str2 = "1";
                    bBSUserSectionView.f80846b.setAvatar((String) null, (AvatarDecorationObj) null);
                    bBSUserSectionView.f80846b.setClickable(false);
                    bBSUserSectionView.setName(null);
                    bBSUserSectionView.f80847c.setOnClickListener(null);
                    bBSUserSectionView.f80849e.setVisibility(8);
                }
                String comment_num = bBSLinkObj.getComment_num();
                String link_award_num = bBSLinkObj.getLink_award_num();
                bBSLinkListBottomBar.f80805b.f80993d.setNum(comment_num);
                bBSLinkListBottomBar.f80805b.f80991b.setNum(link_award_num);
                NewsHelper.b().d(bBSLinkListBottomBar.f80805b.f80991b, bBSLinkObj2);
                bBSLinkListBottomBar.f80807d.setRichStackData(bBSLinkObj.getBottom_rich_text());
                if ("6".equals(bBSLinkObj.getSpecial_type())) {
                    eVar2.i(R.id.vg_item).setBackgroundColor(context.getResources().getColor(R.color.interactive_color));
                    bBSUserSectionView.f80847c.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    textView7.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    expressionTextView.setTextSize(1, 14.0f);
                    expressionTextView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                } else {
                    eVar2.i(R.id.vg_item).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.list_item_bg));
                    textView7.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    if (f83399d.equals(str)) {
                        expressionTextView.setTextSize(1, 16.0f);
                        expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    } else if (f83401f.equals(str)) {
                        if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                            expressionTextView.setTextSize(1, 15.0f);
                            expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                        } else {
                            expressionTextView.setTextSize(1, 14.0f);
                            expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                        }
                    } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                        expressionTextView.setTextSize(1, 15.0f);
                        expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    } else {
                        expressionTextView.setTextSize(1, 14.0f);
                        expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                    }
                }
                if ("20".equals(bBSLinkObj.getLink_tag())) {
                    ForbidInfoObj forbid_info = bBSLinkObj.getForbid_info();
                    if (forbid_info != null) {
                        String duration = forbid_info.getDuration();
                        SpannableString spannableString = new SpannableString(String.format(context.getResources().getString(R.string.forbid_reason_format), forbid_info.getReason(), duration));
                        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.badge_bg_color)), spannableString.length() - duration.length(), spannableString.length(), 33);
                        textView7.setVisibility(0);
                        textView7.setText(spannableString);
                        bBSLinkListBottomBar.f80805b.setType(BBSLinkListLikeComment.Type.CommentOnly);
                        bBSLinkListBottomBar.f80805b.f80993d.setNum(bBSLinkObj.getComment_num());
                    }
                    str3 = str2;
                } else {
                    if (com.max.hbcommon.utils.c.u(str13)) {
                        charSequence = "";
                        str3 = str2;
                        textView7.setVisibility(8);
                    } else {
                        textView7.setVisibility(0);
                        charSequence = "";
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                        KeyDescObj special_tag3 = bBSLinkObj.getSpecial_tag();
                        if (special_tag3 != null) {
                            String name = special_tag3.getName();
                            int iE1 = com.max.xiaoheihe.utils.d.e1(special_tag3.getColor());
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                            int color = context.getResources().getColor(R.color.white);
                            int iF3 = ViewUtils.f(context, 1.0f);
                            spannableStringBuilder2.append((CharSequence) name).append((CharSequence) " ");
                            spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name, dimensionPixelSize, color, iE1, iE1, iF3, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, name.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) str13);
                        String fire_status = bBSLinkObj.getFire_status();
                        str3 = str2;
                        if (str3.equals(fire_status)) {
                            spannableStringBuilder2.append((CharSequence) fire_status);
                            spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_small_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                        } else if ("2".equals(fire_status)) {
                            spannableStringBuilder2.append((CharSequence) fire_status);
                            spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_large_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                        }
                        textView7.setText(spannableStringBuilder2);
                    }
                    if (f83399d.equals(str)) {
                        expressionTextView.setMaxLines(5);
                    } else if (com.max.hbcommon.utils.c.u(str13)) {
                        expressionTextView.setMaxLines(4);
                    } else {
                        expressionTextView.setMaxLines(3);
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                    if (com.max.hbcommon.utils.c.u(str13) && (special_tag = bBSLinkObj.getSpecial_tag()) != null) {
                        String name2 = special_tag.getName();
                        int iE2 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
                        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                        int color2 = context.getResources().getColor(R.color.white);
                        int iF4 = ViewUtils.f(context, 1.0f);
                        spannableStringBuilder3.append((CharSequence) name2).append((CharSequence) " ");
                        spannableStringBuilder3.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name2, dimensionPixelSize2, color2, iE2, iE2, iF4, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, name2.length(), 33);
                    }
                    if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                        spannableStringBuilder3.append((CharSequence) bBSLinkObj.getDescription());
                    }
                    if (spannableStringBuilder3.length() > 0) {
                        expressionTextView.setVisibility(0);
                        expressionTextView.setText(spannableStringBuilder3);
                    } else {
                        expressionTextView.setVisibility(8);
                    }
                    if (eVar.d() != R.layout.item_concept_moments_link) {
                        bBSLinkListBottomBar.f80805b.setType(BBSLinkListLikeComment.Type.Comment);
                        bBSLinkListBottomBar.f80805b.f80991b.setNum(bBSLinkObj.getLink_award_num());
                        bBSLinkListBottomBar.f80805b.f80993d.setNum(bBSLinkObj.getComment_num());
                    }
                }
                if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getImg_text_margin())) {
                    ((ViewGroup.MarginLayoutParams) view3.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
                    ((ViewGroup.MarginLayoutParams) bBSLinkImageContentView.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
                    ((ViewGroup.MarginLayoutParams) bBSLinkImageContentViewV2.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
                }
                if (str3.equals(bBSLinkObj.getHas_video())) {
                    if (1 == bBSLinkObj.getVertical()) {
                        iL = (int) ((ViewUtils.L(context) * 172.0f) / 375.0f);
                        f10 = iL * 230.0f;
                        f11 = 172.0f;
                    } else {
                        iL = (int) ((ViewUtils.L(context) * 230.0f) / 375.0f);
                        f10 = iL * 172.0f;
                        f11 = 230.0f;
                    }
                    int i17 = (int) (f10 / f11);
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2.height != i17) {
                        layoutParams2.width = iL;
                        layoutParams2.height = i17;
                        view4 = view3;
                        view4.setLayoutParams(layoutParams2);
                    } else {
                        view4 = view3;
                    }
                    if (textView8 != null) {
                        if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDuration())) {
                            i11 = 0;
                            i12 = 8;
                            textView8.setVisibility(8);
                        } else {
                            i11 = 0;
                            textView8.setVisibility(0);
                            textView8.setText(bBSLinkObj.getDuration());
                        }
                        view4.setVisibility(i11);
                        bBSLinkImageContentView.setVisibility(i12);
                        bBSLinkImageContentViewV2.setVisibility(i12);
                        com.max.hbimage.b.e0(bBSLinkObj.getVideo_thumb(), imageView2, ViewUtils.n(context, ViewUtils.L(context) / 3, ViewUtils.L(context) / 3, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
                        imageView3.getLayoutParams().height = ViewUtils.f(context, 24.0f);
                        imageView3.getLayoutParams().width = ViewUtils.f(context, 31.0f);
                        int iF5 = ViewUtils.f(context, 9.92f);
                        int iF6 = ViewUtils.f(context, 6.6f);
                        imageView3.setPadding(iF5, iF6, iF5, iF6);
                        imageView3.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha60, ViewUtils.h0(context, ViewUtils.p(context, imageView3, ViewUtils.ViewType.BUTTON))));
                    } else {
                        i11 = 0;
                    }
                    i12 = 8;
                    view4.setVisibility(i11);
                    bBSLinkImageContentView.setVisibility(i12);
                    bBSLinkImageContentViewV2.setVisibility(i12);
                    com.max.hbimage.b.e0(bBSLinkObj.getVideo_thumb(), imageView2, ViewUtils.n(context, ViewUtils.L(context) / 3, ViewUtils.L(context) / 3, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
                    imageView3.getLayoutParams().height = ViewUtils.f(context, 24.0f);
                    imageView3.getLayoutParams().width = ViewUtils.f(context, 31.0f);
                    int iF7 = ViewUtils.f(context, 9.92f);
                    int iF8 = ViewUtils.f(context, 6.6f);
                    imageView3.setPadding(iF7, iF8, iF7, iF8);
                    imageView3.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha60, ViewUtils.h0(context, ViewUtils.p(context, imageView3, ViewUtils.ViewType.BUTTON))));
                } else {
                    BBSLinkImageContentViewV2 bBSLinkImageContentViewV4 = bBSLinkImageContentViewV2;
                    BBSLinkImageContentView bBSLinkImageContentView3 = bBSLinkImageContentView;
                    view3.setVisibility(8);
                    if (com.max.hbcommon.utils.c.w(bBSLinkObj.getThumbs()) || com.max.hbcommon.utils.c.w(bBSLinkObj.getImgs())) {
                        bBSLinkImageContentView3.setVisibility(8);
                        bBSLinkImageContentViewV4.setVisibility(8);
                    } else if ((bBSLinkObj.getPositions() != null) == true) {
                        bBSLinkImageContentViewV4.setVisibility(0);
                        bBSLinkImageContentView3.setVisibility(8);
                        bBSLinkImageContentViewV4.setImages(bBSLinkObj.getPositions(), bBSLinkObj.getImgs(), com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                    } else {
                        bBSLinkImageContentView3.setVisibility(0);
                        bBSLinkImageContentViewV4.setVisibility(8);
                        bBSLinkImageContentView3.setImages(bBSLinkObj.getImgs(), str, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                    }
                }
                break;
            case R.layout.item_channels_link_top /* 2131558998 */:
                eVar2 = eVar;
                view2 = viewB;
                ((BBSLinkListTopView) eVar2.i(R.id.llt)).setTitle(bBSLinkObj.getTitle());
                break;
            case R.layout.item_concept_rec_hashtag /* 2131559035 */:
                view2 = viewB;
                eVar2 = eVar;
                ((BBSTagRecommendView) eVar2.i(R.id.tr)).b(bBSLinkObj.getHashtags());
                break;
            case R.layout.item_link_list /* 2131559285 */:
            case R.layout.item_link_list_swipe /* 2131559287 */:
                if (R.layout.item_link_list_swipe != eVar.d() && (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin != i10 || ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin != iF2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i10;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iF2;
                    viewB.setLayoutParams(layoutParams);
                }
                TextView textView9 = (TextView) eVar.i(R.id.tv_time);
                CardView cardView = (CardView) eVar.i(R.id.cv_link);
                HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) eVar.i(R.id.avatar);
                ImageView imageView4 = (ImageView) eVar.i(R.id.iv_avatar);
                view2 = viewB;
                RelativeLayout relativeLayout = (RelativeLayout) eVar.i(R.id.rl_medal_level);
                TextView textView10 = (TextView) eVar.i(R.id.tv_title);
                TextView textView11 = (TextView) eVar.i(R.id.tv_name);
                View viewI2 = eVar.i(R.id.ll_content);
                ExpressionTextView expressionTextView2 = (ExpressionTextView) eVar.i(R.id.tv_content);
                View viewI3 = eVar.i(R.id.vg_forbid_desc);
                TextView textView12 = (TextView) eVar.i(R.id.tv_forbid_desc);
                TextView textView13 = (TextView) eVar.i(R.id.tv_forbid_comment);
                TextView textView14 = (TextView) eVar.i(R.id.tv_bottom_left_desc);
                ImageView imageView5 = (ImageView) eVar.i(R.id.iv_comment);
                TextView textView15 = (TextView) eVar.i(R.id.tv_comment);
                ImageView imageView6 = (ImageView) eVar.i(R.id.iv_up);
                TextView textView16 = (TextView) eVar.i(R.id.tv_up);
                CheckBox checkBox2 = (CheckBox) eVar.i(R.id.cb_feedback_up);
                ImageView imageView7 = (ImageView) eVar.i(R.id.iv_feedback_finished);
                View viewI4 = eVar.i(R.id.vg_video);
                AbsVideoView absVideoView2 = (AbsVideoView) eVar.i(R.id.video_view);
                View viewI5 = eVar.i(R.id.divider);
                O(eVar, bBSLinkObj);
                if (cardView != null) {
                    if (iF > 0) {
                        if (viewI5 != null) {
                            viewI5.setVisibility(8);
                        }
                        cardView.setRadius(iF);
                    } else {
                        if (viewI5 != null) {
                            viewI5.setVisibility(0);
                        }
                        cardView.setRadius(0.0f);
                    }
                }
                String title2 = bBSLinkObj.getTitle();
                if ((f83400e.equals(str) || f83401f.equals(str)) && "1".equals(bBSLinkObj.getHas_video()) && com.max.hbcommon.utils.c.u(title2)) {
                    title2 = bBSLinkObj.getDescription();
                }
                if (bBSLinkObj.getUser() != null) {
                    BBSUserInfoObj user2 = bBSLinkObj.getUser();
                    r rVar = new r(context, user2);
                    textView11.setText(user2.getUsername());
                    textView11.setOnClickListener(rVar);
                    if (imageView4 != null) {
                        com.max.hbimage.b.I(user2.getAvartar(), imageView4, R.drawable.common_default_avatar_40x40);
                        imageView4.setOnClickListener(rVar);
                    }
                    if (heyBoxAvatarView != null) {
                        heyBoxAvatarView.setAvatar(user2.getAvartar(), user2.getAvatar_decoration());
                        heyBoxAvatarView.setOnClickListener(rVar);
                    }
                    com.max.xiaoheihe.utils.d.k1(relativeLayout, user2, f83400e.equals(str) ? 14 : 12);
                    z11 = false;
                } else {
                    str12 = "1";
                    textView11.setText((CharSequence) null);
                    z11 = false;
                    textView11.setClickable(false);
                    if (imageView4 != null) {
                        com.max.hbimage.b.I(null, imageView4, R.drawable.common_default_avatar_40x40);
                        imageView4.setClickable(false);
                    }
                    if (heyBoxAvatarView != null) {
                        heyBoxAvatarView.setAvatar((String) null, (AvatarDecorationObj) null);
                        heyBoxAvatarView.setClickable(false);
                    }
                    relativeLayout.setVisibility(8);
                }
                if (textView9 != null) {
                    if (f83400e.equals(str)) {
                        textView9.setText(t(context, bBSLinkObj2));
                    } else {
                        textView9.setText(u(context, bBSLinkObj2, z11));
                    }
                }
                if ("6".equals(bBSLinkObj.getSpecial_type())) {
                    eVar.i(R.id.vg_item).setBackgroundColor(context.getResources().getColor(R.color.interactive_color));
                    if (imageView7 != 0) {
                        imageView7.setVisibility(0);
                    }
                    textView11.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    textView3 = textView10;
                    textView3.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    textView = expressionTextView2;
                    textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
                    textView.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    if (textView14 != null) {
                        textView2 = textView14;
                        textView2.setTextColor(context.getResources().getColor(R.color.background_layer_2_color));
                    } else {
                        textView2 = textView14;
                    }
                    str4 = f83399d;
                } else {
                    textView = expressionTextView2;
                    textView2 = textView14;
                    textView3 = textView10;
                    eVar.i(R.id.vg_item).setBackgroundDrawable(context.getResources().getDrawable(R.drawable.list_item_bg));
                    if (imageView7 != null) {
                        imageView7.setVisibility(8);
                    }
                    textView3.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                    str4 = f83399d;
                    if (textView != null) {
                        if (str4.equals(str)) {
                            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_16));
                            textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                        } else if (f83401f.equals(str)) {
                            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                                textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_15));
                                textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                            } else {
                                textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
                                textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                            }
                        } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getTitle())) {
                            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_15));
                            textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                        } else {
                            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
                            textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                        }
                    }
                    if (textView2 != null) {
                        textView2.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                    }
                }
                boolean zEquals = "20".equals(bBSLinkObj.getLink_tag());
                String str14 = ad.a.G;
                String str15 = "·";
                if (zEquals) {
                    ForbidInfoObj forbid_info2 = bBSLinkObj.getForbid_info();
                    if (forbid_info2 != null) {
                        String duration2 = forbid_info2.getDuration();
                        SpannableString spannableString2 = new SpannableString(String.format(context.getResources().getString(R.string.forbid_reason_format), forbid_info2.getReason(), duration2));
                        spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.badge_bg_color)), spannableString2.length() - duration2.length(), spannableString2.length(), 33);
                        textView3.setVisibility(0);
                        textView3.setText(spannableString2);
                        if (viewI3 != null) {
                            viewI3.setVisibility(0);
                            textView12.setText(bBSLinkObj.getDescription());
                            i16 = 0;
                            textView13.setText(String.format(context.getResources().getString(R.string.forbid_comment_format), !com.max.hbcommon.utils.c.u(forbid_info2.getComment()) ? forbid_info2.getComment() : context.getResources().getString(R.string.not_have)));
                        } else {
                            i16 = 0;
                        }
                        imageView6.setVisibility(8);
                        textView16.setVisibility(8);
                        imageView5.setVisibility(i16);
                        textView15.setVisibility(i16);
                        bb.d.d(textView15, 2);
                        textView15.setText(bBSLinkObj.getComment_num());
                        StringBuilder sb2 = new StringBuilder();
                        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getTopic_name())) {
                            sb2.append(bBSLinkObj.getTopic_name());
                        }
                        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                            if (sb2.length() > 0) {
                                sb2.append("·");
                            }
                            sb2.append(bBSLinkObj.getPost_tag());
                        } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                            if (sb2.length() > 0) {
                                sb2.append("·");
                            }
                            if (ad.a.a(ad.a.G, false)) {
                                sb2.append(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                            } else {
                                sb2.append(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                            }
                        }
                        textView2.setText(sb2);
                    }
                    str5 = "";
                    str6 = str12;
                } else {
                    ImageView imageView8 = imageView5;
                    TextView textView17 = textView15;
                    if (com.max.hbcommon.utils.c.u(title2)) {
                        textView2 = textView2;
                        str14 = ad.a.G;
                        str15 = "·";
                        imageView8 = imageView8;
                        str5 = "";
                        str6 = str12;
                        i13 = 8;
                        textView17 = textView17;
                        textView3.setVisibility(8);
                    } else {
                        textView3.setVisibility(0);
                        str5 = "";
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str5);
                        KeyDescObj special_tag4 = bBSLinkObj.getSpecial_tag();
                        if (special_tag4 != null) {
                            String name3 = special_tag4.getName();
                            int iE3 = com.max.xiaoheihe.utils.d.e1(special_tag4.getColor());
                            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                            int color3 = context.getResources().getColor(R.color.white);
                            int iF9 = ViewUtils.f(context, 1.0f);
                            spannableStringBuilder4.append((CharSequence) name3).append((CharSequence) " ");
                            spannableStringBuilder4.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name3, dimensionPixelSize3, color3, iE3, iE3, iF9, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, name3.length(), 33);
                        }
                        spannableStringBuilder4.append((CharSequence) title2);
                        String fire_status2 = bBSLinkObj.getFire_status();
                        str6 = str12;
                        if (str6.equals(fire_status2)) {
                            spannableStringBuilder4.append((CharSequence) fire_status2);
                            spannableStringBuilder4.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_small_18), spannableStringBuilder4.length() - fire_status2.length(), spannableStringBuilder4.length(), 33);
                        } else if ("2".equals(fire_status2)) {
                            spannableStringBuilder4.append((CharSequence) fire_status2);
                            spannableStringBuilder4.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_large_18), spannableStringBuilder4.length() - fire_status2.length(), spannableStringBuilder4.length(), 33);
                        }
                        textView3.setText(spannableStringBuilder4);
                        i13 = 8;
                    }
                    if (viewI3 != null) {
                        viewI3.setVisibility(i13);
                    }
                    if (textView != null) {
                        if (str4.equals(str)) {
                            textView.setMaxLines(5);
                        } else {
                            if (com.max.hbcommon.utils.c.u(title2)) {
                                textView.setMaxLines(4);
                            } else {
                                textView.setMaxLines(3);
                            }
                            spannableStringBuilder = new SpannableStringBuilder(str5);
                            if (com.max.hbcommon.utils.c.u(title2)) {
                                special_tag2 = bBSLinkObj.getSpecial_tag();
                                if (special_tag2 != null) {
                                    String name4 = special_tag2.getName();
                                    int iE4 = com.max.xiaoheihe.utils.d.e1(special_tag2.getColor());
                                    int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                                    int color4 = context.getResources().getColor(R.color.white);
                                    int iF10 = ViewUtils.f(context, 1.0f);
                                    spannableStringBuilder.append((CharSequence) name4).append((CharSequence) " ");
                                    com.max.hbcustomview.f fVar = new com.max.hbcustomview.f(name4, dimensionPixelSize4, color4, iE4, iE4, iF10, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f));
                                    i14 = 0;
                                    spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(fVar, 0), 0, name4.length(), 33);
                                } else {
                                    i14 = 0;
                                }
                                spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                            } else {
                                i14 = 0;
                                spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                            }
                            if (spannableStringBuilder.length() > 0) {
                                textView.setVisibility(i14);
                                textView.setText(spannableStringBuilder);
                            } else {
                                i15 = 8;
                                textView.setVisibility(8);
                            }
                            if (viewI2 != null) {
                                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                                    viewI2.setVisibility(i15);
                                } else {
                                    viewI2.setVisibility(i14);
                                }
                            }
                            if ("10".equalsIgnoreCase(bBSLinkObj.getLink_tag())) {
                                imageView6.setVisibility(i15);
                                textView16.setVisibility(i15);
                                if ("6".equals(bBSLinkObj.getSpecial_type())) {
                                    checkBox = checkBox2;
                                    checkBox.setVisibility(i15);
                                    imageView8.setVisibility(i15);
                                    textView17.setVisibility(i15);
                                    if (textView2 != null) {
                                        textView2.setText(bBSLinkObj.getFinished_tag());
                                    }
                                } else {
                                    textView6 = textView2;
                                    TextView textView18 = textView17;
                                    checkBox = checkBox2;
                                    bb.d.d(checkBox, 0);
                                    checkBox.setText("\uf0d8 " + bBSLinkObj.getLink_award_num() + context.getResources().getString(R.string.support_up));
                                    checkBox.setVisibility(0);
                                    imageView8.setVisibility(0);
                                    textView18.setVisibility(0);
                                    textView18.setText(bBSLinkObj.getComment_num());
                                    if (textView6 != null) {
                                        if (ad.a.a(str14, false)) {
                                            textView6.setText(com.max.hbutils.utils.w.p(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                        } else {
                                            textView6.setText(com.max.hbutils.utils.w.s(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                        }
                                    }
                                }
                                checkBox.setOnCheckedChangeListener(null);
                                checkBox.setChecked(str6.equals(bBSLinkObj.getIs_award_link()));
                            } else {
                                str7 = str14;
                                textView4 = textView2;
                                textView5 = textView17;
                                imageView = imageView8;
                                if (eVar.d() != R.layout.item_concept_moments_link) {
                                    imageView6.setVisibility(0);
                                    textView16.setVisibility(0);
                                    imageView.setVisibility(0);
                                    textView5.setVisibility(0);
                                    bb.d.d(textView5, 2);
                                    textView16.setText(bBSLinkObj.getLink_award_num());
                                    textView5.setText(bBSLinkObj.getComment_num());
                                    if (checkBox2 != null) {
                                        checkBox2.setVisibility(8);
                                    }
                                    if (textView4 != null) {
                                        if (str4.equals(str)) {
                                            if (ad.a.a(str7, false)) {
                                                textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                            } else {
                                                textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                            }
                                        } else if (bBSLinkObj.getTopic() != null) {
                                            if (ad.a.a(str7, false)) {
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(bBSLinkObj.getTopic().getName());
                                                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                                    str10 = str15;
                                                    if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                                        str11 = str5;
                                                    } else {
                                                        str11 = str10 + com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at());
                                                    }
                                                } else {
                                                    str11 = str15 + bBSLinkObj.getPost_tag();
                                                }
                                                sb3.append(str11);
                                                string = sb3.toString();
                                            } else {
                                                str8 = str15;
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(bBSLinkObj.getTopic().getName());
                                                if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                                    str9 = str8 + bBSLinkObj.getPost_tag();
                                                } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                                    str9 = str5;
                                                } else {
                                                    str9 = str8 + com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at());
                                                }
                                                sb4.append(str9);
                                                string = sb4.toString();
                                            }
                                            textView4.setText(string);
                                        } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                            textView4.setText(bBSLinkObj.getPost_tag());
                                        } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                            if (ad.a.a(str7, false)) {
                                                textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                            } else {
                                                textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        spannableStringBuilder = new SpannableStringBuilder(str5);
                        if (com.max.hbcommon.utils.c.u(title2)) {
                            special_tag2 = bBSLinkObj.getSpecial_tag();
                            if (special_tag2 != null) {
                                String name5 = special_tag2.getName();
                                int iE5 = com.max.xiaoheihe.utils.d.e1(special_tag2.getColor());
                                int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                                int color5 = context.getResources().getColor(R.color.white);
                                int iF11 = ViewUtils.f(context, 1.0f);
                                spannableStringBuilder.append((CharSequence) name5).append((CharSequence) " ");
                                com.max.hbcustomview.f fVar2 = new com.max.hbcustomview.f(name5, dimensionPixelSize5, color5, iE5, iE5, iF11, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f));
                                i14 = 0;
                                spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(fVar2, 0), 0, name5.length(), 33);
                            } else {
                                i14 = 0;
                            }
                            spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                        } else {
                            i14 = 0;
                            spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                        }
                        if (spannableStringBuilder.length() > 0) {
                            textView.setVisibility(i14);
                            textView.setText(spannableStringBuilder);
                        } else {
                            i15 = 8;
                            textView.setVisibility(8);
                        }
                        if (viewI2 != null) {
                            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                                viewI2.setVisibility(i14);
                            } else {
                                viewI2.setVisibility(i15);
                            }
                        }
                        if ("10".equalsIgnoreCase(bBSLinkObj.getLink_tag())) {
                            imageView6.setVisibility(i15);
                            textView16.setVisibility(i15);
                            if ("6".equals(bBSLinkObj.getSpecial_type())) {
                                checkBox = checkBox2;
                                checkBox.setVisibility(i15);
                                imageView8.setVisibility(i15);
                                textView17.setVisibility(i15);
                                if (textView2 != null) {
                                    textView2.setText(bBSLinkObj.getFinished_tag());
                                }
                            } else {
                                textView6 = textView2;
                                TextView textView19 = textView17;
                                checkBox = checkBox2;
                                bb.d.d(checkBox, 0);
                                checkBox.setText("\uf0d8 " + bBSLinkObj.getLink_award_num() + context.getResources().getString(R.string.support_up));
                                checkBox.setVisibility(0);
                                imageView8.setVisibility(0);
                                textView19.setVisibility(0);
                                textView19.setText(bBSLinkObj.getComment_num());
                                if (textView6 != null) {
                                    if (ad.a.a(str14, false)) {
                                        textView6.setText(com.max.hbutils.utils.w.p(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                    } else {
                                        textView6.setText(com.max.hbutils.utils.w.s(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                    }
                                }
                            }
                            checkBox.setOnCheckedChangeListener(null);
                            checkBox.setChecked(str6.equals(bBSLinkObj.getIs_award_link()));
                        } else {
                            str7 = str14;
                            textView4 = textView2;
                            textView5 = textView17;
                            imageView = imageView8;
                            if (eVar.d() != R.layout.item_concept_moments_link) {
                                imageView6.setVisibility(0);
                                textView16.setVisibility(0);
                                imageView.setVisibility(0);
                                textView5.setVisibility(0);
                                bb.d.d(textView5, 2);
                                textView16.setText(bBSLinkObj.getLink_award_num());
                                textView5.setText(bBSLinkObj.getComment_num());
                                if (checkBox2 != null) {
                                    checkBox2.setVisibility(8);
                                }
                                if (textView4 != null) {
                                    if (str4.equals(str)) {
                                        if (ad.a.a(str7, false)) {
                                            textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                        } else {
                                            textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                        }
                                    } else if (bBSLinkObj.getTopic() != null) {
                                        if (ad.a.a(str7, false)) {
                                            StringBuilder sb5 = new StringBuilder();
                                            sb5.append(bBSLinkObj.getTopic().getName());
                                            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                                str11 = str15 + bBSLinkObj.getPost_tag();
                                            } else {
                                                str10 = str15;
                                                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                                    str11 = str5;
                                                } else {
                                                    str11 = str10 + com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at());
                                                }
                                            }
                                            sb5.append(str11);
                                            string = sb5.toString();
                                        } else {
                                            str8 = str15;
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append(bBSLinkObj.getTopic().getName());
                                            if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                                str9 = str8 + bBSLinkObj.getPost_tag();
                                            } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                                str9 = str5;
                                            } else {
                                                str9 = str8 + com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at());
                                            }
                                            sb6.append(str9);
                                            string = sb6.toString();
                                        }
                                        textView4.setText(string);
                                    } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                        textView4.setText(bBSLinkObj.getPost_tag());
                                    } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                        if (ad.a.a(str7, false)) {
                                            textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                        } else {
                                            textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i14 = 0;
                    }
                    i15 = 8;
                    if (viewI2 != null) {
                        if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                            viewI2.setVisibility(i14);
                        } else {
                            viewI2.setVisibility(i15);
                        }
                    }
                    if ("10".equalsIgnoreCase(bBSLinkObj.getLink_tag())) {
                        imageView6.setVisibility(i15);
                        textView16.setVisibility(i15);
                        if ("6".equals(bBSLinkObj.getSpecial_type())) {
                            checkBox = checkBox2;
                            checkBox.setVisibility(i15);
                            imageView8.setVisibility(i15);
                            textView17.setVisibility(i15);
                            if (textView2 != null) {
                                textView2.setText(bBSLinkObj.getFinished_tag());
                            }
                        } else {
                            textView6 = textView2;
                            TextView textView110 = textView17;
                            checkBox = checkBox2;
                            bb.d.d(checkBox, 0);
                            checkBox.setText("\uf0d8 " + bBSLinkObj.getLink_award_num() + context.getResources().getString(R.string.support_up));
                            checkBox.setVisibility(0);
                            imageView8.setVisibility(0);
                            textView110.setVisibility(0);
                            textView110.setText(bBSLinkObj.getComment_num());
                            if (textView6 != null) {
                                if (ad.a.a(str14, false)) {
                                    textView6.setText(com.max.hbutils.utils.w.p(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                } else {
                                    textView6.setText(com.max.hbutils.utils.w.s(context, com.max.hbutils.utils.n.r(bBSLinkObj.getCreate_at())));
                                }
                            }
                        }
                        checkBox.setOnCheckedChangeListener(null);
                        checkBox.setChecked(str6.equals(bBSLinkObj.getIs_award_link()));
                    } else {
                        str7 = str14;
                        textView4 = textView2;
                        textView5 = textView17;
                        imageView = imageView8;
                        if (eVar.d() != R.layout.item_concept_moments_link) {
                            imageView6.setVisibility(0);
                            textView16.setVisibility(0);
                            imageView.setVisibility(0);
                            textView5.setVisibility(0);
                            bb.d.d(textView5, 2);
                            textView16.setText(bBSLinkObj.getLink_award_num());
                            textView5.setText(bBSLinkObj.getComment_num());
                            if (checkBox2 != null) {
                                checkBox2.setVisibility(8);
                            }
                            if (textView4 != null) {
                                if (str4.equals(str)) {
                                    if (ad.a.a(str7, false)) {
                                        textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                    } else {
                                        textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                    }
                                } else if (bBSLinkObj.getTopic() != null) {
                                    if (ad.a.a(str7, false)) {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(bBSLinkObj.getTopic().getName());
                                        if (com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                            str11 = str15 + bBSLinkObj.getPost_tag();
                                        } else {
                                            str10 = str15;
                                            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                                str11 = str5;
                                            } else {
                                                str11 = str10 + com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at());
                                            }
                                        }
                                        sb7.append(str11);
                                        string = sb7.toString();
                                    } else {
                                        str8 = str15;
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(bBSLinkObj.getTopic().getName());
                                        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                            str9 = str8 + bBSLinkObj.getPost_tag();
                                        } else if (com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                            str9 = str5;
                                        } else {
                                            str9 = str8 + com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at());
                                        }
                                        sb8.append(str9);
                                        string = sb8.toString();
                                    }
                                    textView4.setText(string);
                                } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
                                    textView4.setText(bBSLinkObj.getPost_tag());
                                } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
                                    if (ad.a.a(str7, false)) {
                                        textView4.setText(com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()));
                                    } else {
                                        textView4.setText(com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
                                    }
                                }
                            }
                        }
                    }
                }
                String str16 = str5;
                FrameLayout frameLayout = (FrameLayout) eVar.i(R.id.ll_pic);
                ImageView imageView9 = (ImageView) eVar.i(R.id.iv_pic_single);
                ImageView imageView10 = (ImageView) eVar.i(R.id.iv_pic_style_code_1);
                ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_nine_pic);
                List<String> thumbs = bBSLinkObj.getThumbs();
                List<String> imgs = bBSLinkObj.getImgs();
                if (com.max.hbcommon.utils.c.w(thumbs)) {
                    frameLayout.setVisibility(8);
                    imageView10.setVisibility(8);
                } else {
                    frameLayout.setVisibility(0);
                    if (str6.equals(bBSLinkObj.getStyle_code())) {
                        String str17 = thumbs.get(0);
                        imageView10.setVisibility(0);
                        imageView9.setVisibility(8);
                        viewGroup.setVisibility(8);
                        A(str17, imageView10, str17, -1, 0, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                    } else {
                        imageView9.setVisibility(8);
                        imageView10.setVisibility(8);
                        viewGroup.setVisibility(0);
                        ViewGroup viewGroup2 = (ViewGroup) eVar.i(R.id.vg_pic_row_2);
                        ViewGroup viewGroup3 = (ViewGroup) eVar.i(R.id.vg_pic_row_3);
                        ImageView imageView11 = (ImageView) eVar.i(R.id.iv_nine_pic_1);
                        ImageView imageView12 = (ImageView) eVar.i(R.id.iv_nine_pic_2);
                        ImageView imageView13 = (ImageView) eVar.i(R.id.iv_nine_pic_3);
                        ImageView imageView14 = (ImageView) eVar.i(R.id.iv_nine_pic_4);
                        ImageView imageView15 = (ImageView) eVar.i(R.id.iv_nine_pic_5);
                        ImageView imageView16 = (ImageView) eVar.i(R.id.iv_nine_pic_6);
                        ImageView imageView17 = (ImageView) eVar.i(R.id.iv_nine_pic_7);
                        ImageView imageView18 = (ImageView) eVar.i(R.id.iv_nine_pic_8);
                        ImageView imageView19 = (ImageView) eVar.i(R.id.iv_nine_pic_9);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(imageView11);
                        arrayList.add(imageView12);
                        arrayList.add(imageView13);
                        arrayList.add(imageView14);
                        arrayList.add(imageView15);
                        arrayList.add(imageView16);
                        arrayList.add(imageView17);
                        arrayList.add(imageView18);
                        arrayList.add(imageView19);
                        String str18 = str16;
                        for (int i18 = 0; i18 < imgs.size(); i18++) {
                            str18 = str18 + imgs.get(i18) + ";";
                        }
                        viewGroup2.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        for (int i19 = 0; i19 < 9; i19++) {
                            ImageView imageView20 = (ImageView) arrayList.get(i19);
                            if (thumbs.size() == 4) {
                                if (i19 == 2) {
                                    imageView20.setVisibility(4);
                                } else if (i19 == 3 || i19 == 4) {
                                    int i20 = i19 - 1;
                                    String str19 = thumbs.get(i20);
                                    imageView20.setVisibility(0);
                                    A(str19, imageView20, str18, -1, i20, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                                } else if (i19 < thumbs.size()) {
                                    String str20 = thumbs.get(i19);
                                    imageView20.setVisibility(0);
                                    A(str20, imageView20, str18, -1, i19, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                                } else {
                                    imageView20.setVisibility(4);
                                }
                            } else if (i19 < thumbs.size()) {
                                String str21 = thumbs.get(i19);
                                imageView20.setVisibility(0);
                                A(str21, imageView20, str18, -1, i19, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                            } else {
                                imageView20.setVisibility(4);
                            }
                        }
                    }
                }
                if (str6.equals(bBSLinkObj.getHas_video())) {
                    viewI4.setVisibility(0);
                    ze.d ui2 = absVideoView2.getUi();
                    if (ui2 == null || !(ui2.getPanelTop() instanceof CountDownTopPanel)) {
                        ui2 = new PlainVideoUI(context);
                        ui2.m(new CountDownTopPanel(context));
                        absVideoView = absVideoView2;
                        absVideoView.p(ui2).S(context);
                    } else {
                        absVideoView = absVideoView2;
                    }
                    com.max.hbimage.b.L(bBSLinkObj.getVideo_thumb(), ui2.getCoverView(), R.drawable.common_default_placeholder_375x210);
                    ViewGroup.LayoutParams layoutParams3 = viewI4.getLayoutParams();
                    if (i10 > 0) {
                        int iL2 = ViewUtils.L(context) - ViewUtils.f(context, 28.0f);
                        int i21 = (int) (((iL2 * 9.0f) / 16.0f) + 0.5f);
                        if (layoutParams3.height != i21) {
                            layoutParams3.width = iL2;
                            layoutParams3.height = i21;
                            viewI4.setLayoutParams(layoutParams3);
                        }
                    } else {
                        int iL3 = ViewUtils.L(context) - ViewUtils.f(context, 20.0f);
                        int i22 = (int) (((iL3 * 9.0f) / 16.0f) + 0.5f);
                        if (layoutParams3.height != i22) {
                            layoutParams3.width = iL3;
                            layoutParams3.height = i22;
                            viewI4.setLayoutParams(layoutParams3);
                        }
                    }
                    bBSLinkObj2 = bBSLinkObj;
                    absVideoView.setTag(bBSLinkObj2);
                } else {
                    bBSLinkObj2 = bBSLinkObj;
                    viewI4.setVisibility(8);
                    absVideoView2.setTag(null);
                }
                eVar2 = eVar;
                break;
            case R.layout.item_top_link /* 2131559564 */:
                eVar.p(R.id.tv_title, bBSLinkObj.getTitle());
                eVar.i(R.id.divider).setVisibility(0);
                if (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin != i10) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i10;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i10;
                    viewB.setLayoutParams(layoutParams);
                    break;
                }
            default:
                eVar2 = eVar;
                view2 = viewB;
                break;
        }
        if (eVar.d() != R.layout.item_top_link && eVar.d() != R.layout.item_channels_link_top && eVar.d() != R.layout.item_link_list && eVar.d() != R.layout.item_link_list_swipe && eVar.d() != R.layout.item_channels_link && eVar.d() != R.layout.item_channels_link_swipe && eVar.d() != R.layout.item_video_cell && eVar.d() != R.layout.item_concept_moments_link) {
            View view5 = view2;
            view5.setTag(null);
            view5.setOnClickListener(null);
            return;
        }
        View view6 = view2;
        t tVar = new t(yVar, eVar2, bBSLinkObj2, context);
        if (R.layout.item_link_list_swipe == eVar.d()) {
            eVar2.i(R.id.cv_link).setTag(bBSLinkObj2);
            eVar2.i(R.id.cv_link).setOnClickListener(tVar);
        } else if (R.layout.item_channels_link_swipe == eVar.d()) {
            eVar2.i(R.id.vg_item).setTag(bBSLinkObj2);
            eVar2.i(R.id.vg_item).setOnClickListener(tVar);
        } else {
            view6.setTag(bBSLinkObj2);
            view6.setOnClickListener(tVar);
        }
    }

    public static void O(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, null, changeQuickRedirect, true, 31227, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = eVar.b().getContext();
        View viewI = eVar.i(R.id.vg_sub);
        LinearLayout linearLayout = (LinearLayout) eVar.i(R.id.ll_sub_avatar);
        TextView textView = (TextView) eVar.i(R.id.tv_sub_desc);
        if (viewI != null) {
            if (bBSLinkObj.getSub() == null) {
                viewI.setVisibility(8);
                return;
            }
            viewI.setVisibility(0);
            List<BBSUserInfoObj> users = bBSLinkObj.getSub().getUsers();
            if (users != null) {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                int i10 = 0;
                while (i10 < users.size() && i10 <= 2) {
                    BBSUserInfoObj bBSUserInfoObj = users.get(i10);
                    ImageView imageView = new ImageView(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(context, 20.0f), ViewUtils.f(context, 20.0f));
                    layoutParams.leftMargin = i10 == 0 ? 0 : -ViewUtils.f(context, 3.0f);
                    imageView.setLayoutParams(layoutParams);
                    linearLayout.addView(imageView);
                    com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), imageView, R.drawable.common_default_avatar_40x40);
                    i10++;
                }
            } else {
                linearLayout.setVisibility(8);
            }
            textView.setText(bBSLinkObj.getSub().getDesc());
            if (com.max.hbcommon.utils.c.u(bBSLinkObj.getSub().getComment_id())) {
                viewI.setOnClickListener(null);
            } else {
                viewI.setOnClickListener(new u(bBSLinkObj, context));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x044a  */
    /* JADX WARN: Code duplicated, block: B:104:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:109:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:112:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:117:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:118:0x050b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0523  */
    /* JADX WARN: Code duplicated, block: B:32:0x0176  */
    /* JADX WARN: Code duplicated, block: B:35:0x017e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0184  */
    /* JADX WARN: Code duplicated, block: B:38:0x018c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0197  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01db  */
    /* JADX WARN: Code duplicated, block: B:48:0x0228  */
    /* JADX WARN: Code duplicated, block: B:50:0x0231  */
    /* JADX WARN: Code duplicated, block: B:52:0x023a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0249  */
    /* JADX WARN: Code duplicated, block: B:55:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0302  */
    /* JADX WARN: Code duplicated, block: B:65:0x030f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0317  */
    /* JADX WARN: Code duplicated, block: B:68:0x031c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0322  */
    /* JADX WARN: Code duplicated, block: B:71:0x0327  */
    /* JADX WARN: Code duplicated, block: B:74:0x0336  */
    /* JADX WARN: Code duplicated, block: B:76:0x033c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0395  */
    /* JADX WARN: Code duplicated, block: B:79:0x039e  */
    /* JADX WARN: Code duplicated, block: B:82:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:88:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:89:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x03db  */
    /* JADX WARN: Code duplicated, block: B:95:0x0421  */
    /* JADX WARN: Code duplicated, block: B:97:0x042d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0430  */
    public static void P(Context context, View view, BBSLinkObj bBSLinkObj, String str, int i10, UMShareListener uMShareListener, y yVar) {
        ImageView imageView;
        boolean z10;
        String str2;
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        KeyDescObj special_tag;
        SpannableStringBuilder spannableStringBuilder2;
        KeyDescObj special_tag2;
        String fire_status;
        View view2;
        BBSLinkImageContentViewV2 bBSLinkImageContentViewV2;
        BBSLinkImageContentView bBSLinkImageContentView;
        boolean z11;
        float f10;
        int iF;
        int i13;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        ForbidInfoObj forbid_info;
        if (PatchProxy.proxy(new Object[]{context, view, bBSLinkObj, str, new Integer(i10), uMShareListener, yVar}, null, changeQuickRedirect, true, 31222, new Class[]{Context.class, View.class, BBSLinkObj.class, String.class, Integer.TYPE, UMShareListener.class, y.class}, Void.TYPE).isSupported) {
            return;
        }
        ExpressionTextView expressionTextView = (ExpressionTextView) view.findViewById(R.id.tv_content);
        if (bBSLinkObj.getIs_deleted() != null && bBSLinkObj.getIs_deleted().equals("1")) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("");
            spannableStringBuilder3.append((CharSequence) bBSLinkObj.getDescription());
            if (spannableStringBuilder3.length() > 0) {
                expressionTextView.setVisibility(0);
                expressionTextView.setText(spannableStringBuilder3);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) expressionTextView.getLayoutParams();
                layoutParams2.setMargins(ViewUtils.f(context, 10.0f), ViewUtils.f(context, 8.0f), ViewUtils.f(context, 10.0f), ViewUtils.f(context, 8.0f));
                expressionTextView.setLayoutParams(layoutParams2);
            }
            view.findViewById(R.id.v_placeholder).setVisibility(8);
            view.findViewById(R.id.tv_origin_name).setVisibility(8);
            view.findViewById(R.id.tv_title).setVisibility(8);
            return;
        }
        if (bBSLinkObj.getUser() != null && bBSLinkObj.getUser().getUsername() != null) {
            ((TextView) view.findViewById(R.id.tv_origin_name)).setText("@" + bBSLinkObj.getUser().getUsername());
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_time);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_title);
        View viewFindViewById = view.findViewById(R.id.ll_content);
        BBSLinkImageContentView bBSLinkImageContentView2 = (BBSLinkImageContentView) view.findViewById(R.id.ll_img);
        BBSLinkImageContentViewV2 bBSLinkImageContentViewV3 = (BBSLinkImageContentViewV2) view.findViewById(R.id.ll_img_v2);
        View viewFindViewById2 = view.findViewById(R.id.vg_thumb);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_thumb);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_video_play);
        String title = bBSLinkObj.getTitle();
        boolean zEquals = f83400e.equals(str);
        String str3 = f83401f;
        if (zEquals || f83401f.equals(str)) {
            imageView = imageView3;
            if ("1".equals(bBSLinkObj.getHas_video()) && com.max.hbcommon.utils.c.u(title)) {
                z10 = true;
            }
            if (z10) {
                title = bBSLinkObj.getDescription();
            }
            str2 = title;
            if (textView2 == null) {
                if (f83400e.equals(str)) {
                    textView2.setText(t(context, bBSLinkObj));
                } else {
                    textView2.setText(u(context, bBSLinkObj, false));
                }
            }
            textView3.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
            if (expressionTextView != null) {
                expressionTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
                expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
            }
            if ("20".equals(bBSLinkObj.getLink_tag())) {
                forbid_info = bBSLinkObj.getForbid_info();
                if (forbid_info != null) {
                    String duration = forbid_info.getDuration();
                    SpannableString spannableString = new SpannableString(String.format(context.getResources().getString(R.string.forbid_reason_format), forbid_info.getReason(), duration));
                    spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.badge_bg_color)), spannableString.length() - duration.length(), spannableString.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(spannableString);
                }
                str3 = f83401f;
                bBSLinkImageContentView2 = bBSLinkImageContentView2;
                bBSLinkImageContentViewV3 = bBSLinkImageContentViewV3;
            } else {
                if (com.max.hbcommon.utils.c.u(str2)) {
                    str3 = f83401f;
                    bBSLinkImageContentView2 = bBSLinkImageContentView2;
                    bBSLinkImageContentViewV3 = bBSLinkImageContentViewV3;
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    spannableStringBuilder2 = new SpannableStringBuilder("");
                    special_tag2 = bBSLinkObj.getSpecial_tag();
                    if (special_tag2 != null) {
                        String name = special_tag2.getName();
                        int iE1 = com.max.xiaoheihe.utils.d.e1(special_tag2.getColor());
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                        int color = context.getResources().getColor(R.color.white);
                        int iF2 = ViewUtils.f(context, 1.0f);
                        spannableStringBuilder2.append((CharSequence) name).append((CharSequence) " ");
                        spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name, dimensionPixelSize, color, iE1, iE1, iF2, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, name.length(), 33);
                    }
                    spannableStringBuilder2.append((CharSequence) str2);
                    fire_status = bBSLinkObj.getFire_status();
                    if ("1".equals(fire_status)) {
                        spannableStringBuilder2.append((CharSequence) fire_status);
                        spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_small_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                    } else if ("2".equals(fire_status)) {
                        spannableStringBuilder2.append((CharSequence) fire_status);
                        spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_large_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                    }
                    textView3.setText(spannableStringBuilder2);
                }
                if (expressionTextView != null) {
                    if (f83399d.equals(str)) {
                        expressionTextView.setMaxLines(5);
                    } else if (com.max.hbcommon.utils.c.u(str2)) {
                        expressionTextView.setMaxLines(4);
                    } else {
                        expressionTextView.setMaxLines(3);
                    }
                    spannableStringBuilder = new SpannableStringBuilder("");
                    if (com.max.hbcommon.utils.c.u(str2)) {
                        special_tag = bBSLinkObj.getSpecial_tag();
                        if (special_tag != null) {
                            String name2 = special_tag.getName();
                            int iE2 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
                            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                            int color2 = context.getResources().getColor(R.color.white);
                            int iF3 = ViewUtils.f(context, 1.0f);
                            spannableStringBuilder.append((CharSequence) name2).append((CharSequence) " ");
                            com.max.hbcustomview.f fVar = new com.max.hbcustomview.f(name2, dimensionPixelSize2, color2, iE2, iE2, iF3, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f));
                            i12 = 0;
                            spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(fVar, 0), 0, name2.length(), 33);
                        } else {
                            i12 = 0;
                        }
                        spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                    } else {
                        i12 = 0;
                        spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                    }
                    if (spannableStringBuilder.length() > 0) {
                        expressionTextView.setVisibility(i12);
                        expressionTextView.setText(spannableStringBuilder);
                        i11 = 8;
                    } else {
                        i11 = 8;
                        expressionTextView.setVisibility(8);
                    }
                } else {
                    i11 = 8;
                    i12 = 0;
                }
                if (viewFindViewById != null) {
                    if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                        viewFindViewById.setVisibility(i11);
                    } else {
                        viewFindViewById.setVisibility(i12);
                    }
                }
            }
            if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getImg_text_margin())) {
                ((ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
                ((ViewGroup.MarginLayoutParams) bBSLinkImageContentView2.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
                ((ViewGroup.MarginLayoutParams) bBSLinkImageContentViewV3.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
            }
            if ("1".equals(bBSLinkObj.getHas_video())) {
                int iL = ViewUtils.L(context);
                if (str3.equals(str)) {
                    f10 = 24.0f;
                } else {
                    f10 = 28.0f;
                }
                iF = iL - ViewUtils.f(context, f10);
                i13 = (int) (((iF * 9.0f) / 16.0f) + 0.5f);
                layoutParams = viewFindViewById2.getLayoutParams();
                if (layoutParams.height != i13) {
                    layoutParams.width = iF;
                    layoutParams.height = i13;
                    viewFindViewById2.setLayoutParams(layoutParams);
                }
                viewFindViewById2.setVisibility(0);
                bBSLinkImageContentView2.setVisibility(8);
                bBSLinkImageContentViewV3.setVisibility(8);
                com.max.hbimage.b.e0(bBSLinkObj.getVideo_thumb(), imageView2, ViewUtils.n(context, ViewUtils.L(context) / 3, ViewUtils.L(context) / 3, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
                ImageView imageView4 = imageView;
                imageView4.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha60, ViewUtils.h0(context, ViewUtils.p(context, imageView4, ViewUtils.ViewType.BUTTON))));
                view2 = view;
                textView = (TextView) view2.findViewById(R.id.tv_video_duration);
                if (textView != null) {
                    if (bBSLinkObj.getVideo_info() != null || bBSLinkObj.getVideo_info().getDuration() == null) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(bBSLinkObj.getVideo_info().getDuration());
                    }
                }
            } else {
                view2 = view;
                bBSLinkImageContentViewV2 = bBSLinkImageContentViewV3;
                bBSLinkImageContentView = bBSLinkImageContentView2;
                viewFindViewById2.setVisibility(8);
                if (com.max.hbcommon.utils.c.w(bBSLinkObj.getImgs())) {
                    bBSLinkImageContentView.setVisibility(8);
                    bBSLinkImageContentViewV2.setVisibility(8);
                } else {
                    if (bBSLinkObj.getPositions() != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bBSLinkImageContentViewV2.setVisibility(0);
                        bBSLinkImageContentView.setVisibility(8);
                        bBSLinkImageContentViewV2.setImages(bBSLinkObj.getPositions(), bBSLinkObj.getImgs(), com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                    } else {
                        bBSLinkImageContentView.setVisibility(0);
                        bBSLinkImageContentViewV2.setVisibility(8);
                        bBSLinkImageContentView.setImages(bBSLinkObj.getImgs(), str, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                    }
                }
            }
            view2.setOnClickListener(new k(bBSLinkObj, yVar, view2, context));
        }
        imageView = imageView3;
        z10 = false;
        if (z10) {
            title = bBSLinkObj.getDescription();
        }
        str2 = title;
        if (textView2 == null) {
            if (f83400e.equals(str)) {
                textView2.setText(t(context, bBSLinkObj));
            } else {
                textView2.setText(u(context, bBSLinkObj, false));
            }
        }
        textView3.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        if (expressionTextView != null) {
            expressionTextView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_14));
            expressionTextView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
        }
        if ("20".equals(bBSLinkObj.getLink_tag())) {
            forbid_info = bBSLinkObj.getForbid_info();
            if (forbid_info != null) {
                String duration2 = forbid_info.getDuration();
                SpannableString spannableString2 = new SpannableString(String.format(context.getResources().getString(R.string.forbid_reason_format), forbid_info.getReason(), duration2));
                spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.badge_bg_color)), spannableString2.length() - duration2.length(), spannableString2.length(), 33);
                textView3.setVisibility(0);
                textView3.setText(spannableString2);
            }
            str3 = f83401f;
            bBSLinkImageContentView2 = bBSLinkImageContentView2;
            bBSLinkImageContentViewV3 = bBSLinkImageContentViewV3;
        } else {
            if (com.max.hbcommon.utils.c.u(str2)) {
                textView3.setVisibility(0);
                spannableStringBuilder2 = new SpannableStringBuilder("");
                special_tag2 = bBSLinkObj.getSpecial_tag();
                if (special_tag2 != null) {
                    String name3 = special_tag2.getName();
                    int iE3 = com.max.xiaoheihe.utils.d.e1(special_tag2.getColor());
                    int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                    int color3 = context.getResources().getColor(R.color.white);
                    int iF4 = ViewUtils.f(context, 1.0f);
                    spannableStringBuilder2.append((CharSequence) name3).append((CharSequence) " ");
                    spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(name3, dimensionPixelSize3, color3, iE3, iE3, iF4, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f)), 0), 0, name3.length(), 33);
                }
                spannableStringBuilder2.append((CharSequence) str2);
                fire_status = bBSLinkObj.getFire_status();
                if ("1".equals(fire_status)) {
                    spannableStringBuilder2.append((CharSequence) fire_status);
                    spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_small_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                } else if ("2".equals(fire_status)) {
                    spannableStringBuilder2.append((CharSequence) fire_status);
                    spannableStringBuilder2.setSpan(new com.max.hbcustomview.spans.b(context, R.drawable.fire_status_large_18), spannableStringBuilder2.length() - fire_status.length(), spannableStringBuilder2.length(), 33);
                }
                textView3.setText(spannableStringBuilder2);
            } else {
                str3 = f83401f;
                bBSLinkImageContentView2 = bBSLinkImageContentView2;
                bBSLinkImageContentViewV3 = bBSLinkImageContentViewV3;
                textView3.setVisibility(8);
            }
            if (expressionTextView != null) {
                if (f83399d.equals(str)) {
                    expressionTextView.setMaxLines(5);
                } else if (com.max.hbcommon.utils.c.u(str2)) {
                    expressionTextView.setMaxLines(3);
                } else {
                    expressionTextView.setMaxLines(4);
                }
                spannableStringBuilder = new SpannableStringBuilder("");
                if (com.max.hbcommon.utils.c.u(str2)) {
                    special_tag = bBSLinkObj.getSpecial_tag();
                    if (special_tag != null) {
                        String name4 = special_tag.getName();
                        int iE4 = com.max.xiaoheihe.utils.d.e1(special_tag.getColor());
                        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.text_size_10);
                        int color4 = context.getResources().getColor(R.color.white);
                        int iF5 = ViewUtils.f(context, 1.0f);
                        spannableStringBuilder.append((CharSequence) name4).append((CharSequence) " ");
                        com.max.hbcustomview.f fVar2 = new com.max.hbcustomview.f(name4, dimensionPixelSize4, color4, iE4, iE4, iF5, ViewUtils.f(context, 4.0f), ViewUtils.f(context, 2.0f));
                        i12 = 0;
                        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(fVar2, 0), 0, name4.length(), 33);
                    } else {
                        i12 = 0;
                    }
                    spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                } else {
                    i12 = 0;
                    spannableStringBuilder.append((CharSequence) bBSLinkObj.getDescription());
                }
                if (spannableStringBuilder.length() > 0) {
                    expressionTextView.setVisibility(i12);
                    expressionTextView.setText(spannableStringBuilder);
                    i11 = 8;
                } else {
                    i11 = 8;
                    expressionTextView.setVisibility(8);
                }
            } else {
                i11 = 8;
                i12 = 0;
            }
            if (viewFindViewById != null) {
                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) {
                    viewFindViewById.setVisibility(i12);
                } else {
                    viewFindViewById.setVisibility(i11);
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getImg_text_margin())) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
            ((ViewGroup.MarginLayoutParams) bBSLinkImageContentView2.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
            ((ViewGroup.MarginLayoutParams) bBSLinkImageContentViewV3.getLayoutParams()).topMargin = ViewUtils.f(context, com.max.hbutils.utils.n.p(bBSLinkObj.getImg_text_margin()));
        }
        if ("1".equals(bBSLinkObj.getHas_video())) {
            int iL2 = ViewUtils.L(context);
            if (str3.equals(str)) {
                f10 = 24.0f;
            } else {
                f10 = 28.0f;
            }
            iF = iL2 - ViewUtils.f(context, f10);
            i13 = (int) (((iF * 9.0f) / 16.0f) + 0.5f);
            layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams.height != i13) {
                layoutParams.width = iF;
                layoutParams.height = i13;
                viewFindViewById2.setLayoutParams(layoutParams);
            }
            viewFindViewById2.setVisibility(0);
            bBSLinkImageContentView2.setVisibility(8);
            bBSLinkImageContentViewV3.setVisibility(8);
            com.max.hbimage.b.e0(bBSLinkObj.getVideo_thumb(), imageView2, ViewUtils.n(context, ViewUtils.L(context) / 3, ViewUtils.L(context) / 3, ViewUtils.ViewType.IMAGE), R.drawable.common_default_placeholder_375x210);
            ImageView imageView5 = imageView;
            imageView5.setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color_alpha60, ViewUtils.h0(context, ViewUtils.p(context, imageView5, ViewUtils.ViewType.BUTTON))));
            view2 = view;
            textView = (TextView) view2.findViewById(R.id.tv_video_duration);
            if (textView != null) {
                if (bBSLinkObj.getVideo_info() != null) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(8);
                }
            }
        } else {
            view2 = view;
            bBSLinkImageContentViewV2 = bBSLinkImageContentViewV3;
            bBSLinkImageContentView = bBSLinkImageContentView2;
            viewFindViewById2.setVisibility(8);
            if (com.max.hbcommon.utils.c.w(bBSLinkObj.getImgs())) {
                if (bBSLinkObj.getPositions() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    bBSLinkImageContentViewV2.setVisibility(0);
                    bBSLinkImageContentView.setVisibility(8);
                    bBSLinkImageContentViewV2.setImages(bBSLinkObj.getPositions(), bBSLinkObj.getImgs(), com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                } else {
                    bBSLinkImageContentView.setVisibility(0);
                    bBSLinkImageContentViewV2.setVisibility(8);
                    bBSLinkImageContentView.setImages(bBSLinkObj.getImgs(), str, com.max.hbcommon.utils.c.x(bBSLinkObj.getDisable_image_click()));
                }
            } else {
                bBSLinkImageContentView.setVisibility(8);
                bBSLinkImageContentViewV2.setVisibility(8);
            }
        }
        view2.setOnClickListener(new k(bBSLinkObj, yVar, view2, context));
    }

    public static void Q(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, null, changeQuickRedirect, true, 31228, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) eVar.i(R.id.iv_bg);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_avatar);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_time);
        TextView textView3 = (TextView) eVar.i(R.id.tv_title);
        TextView textView4 = (TextView) eVar.i(R.id.tv_topic);
        TextView textView5 = (TextView) eVar.i(R.id.tv_view_num);
        TextView textView6 = (TextView) eVar.i(R.id.tv_comment_num);
        Context context = eVar.b().getContext();
        if (bBSLinkObj.getImgs() == null || bBSLinkObj.getImgs().size() <= 0) {
            com.max.hbimage.b.c(imageView);
        } else {
            com.max.hbimage.b.d0(bBSLinkObj.getImgs().get(0), imageView, ViewUtils.f(context, 2.0f));
        }
        if (bBSLinkObj.getUser() != null) {
            com.max.hbimage.b.I(bBSLinkObj.getUser().getAvartar(), imageView2, R.drawable.common_default_avatar_40x40);
            textView.setText(bBSLinkObj.getUser().getUsername());
        } else {
            com.max.hbimage.b.c(imageView2);
            textView.setText((CharSequence) null);
        }
        Drawable drawableT = ViewUtils.T(ViewUtils.f(context, 5.0f), ViewUtils.f(context, 6.0f), 2, context.getResources().getColor(R.color.background_layer_2_color));
        textView2.setText((bBSLinkObj.getVideo_info() == null || com.max.hbcommon.utils.c.u(bBSLinkObj.getVideo_info().getDuration())) ? "" : bBSLinkObj.getVideo_info().getDuration());
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawableT, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setText(bBSLinkObj.getTitle());
        if (bBSLinkObj.getVideo_info() == null || com.max.hbcommon.utils.c.u(bBSLinkObj.getVideo_info().getRec_reason())) {
            textView4.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
            textView4.setText(bBSLinkObj.getPost_tag());
        } else {
            textView4.setTextColor(context.getResources().getColor(R.color.interactive_color));
            textView4.setText(bBSLinkObj.getVideo_info().getRec_reason());
        }
        textView5.setText(bBSLinkObj.getClick());
        textView6.setText(bBSLinkObj.getComment_num());
    }

    public static void R(com.max.hbcommon.base.adapter.s.e eVar, WikiArticelObj wikiArticelObj) {
        if (PatchProxy.proxy(new Object[]{eVar, wikiArticelObj}, null, changeQuickRedirect, true, 31229, new Class[]{com.max.hbcommon.base.adapter.s.e.class, WikiArticelObj.class}, Void.TYPE).isSupported || wikiArticelObj == null) {
            return;
        }
        eVar.p(R.id.tv_content, wikiArticelObj.getArticle_name());
        com.max.hbimage.b.K(wikiArticelObj.getWiki().getAppicon(), (ImageView) eVar.i(R.id.iv_icon));
        eVar.p(R.id.tv_name, wikiArticelObj.getWiki().getName());
        View viewB = eVar.b();
        viewB.setOnClickListener(new v(wikiArticelObj.getArticle_url(), viewB.getContext(), wikiArticelObj, wikiArticelObj.getArticle_name()));
    }

    @SuppressLint({"CheckResult"})
    public static void S(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 31252, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.xiaoheihe.network.i.a().D8(str, str2, str3, str4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p());
    }

    @SuppressLint({"CheckResult"})
    public static void T(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, 31251, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.xiaoheihe.network.i.a().a5(str, str2, str3, str4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o());
    }

    public static void U(Context context, RecyclerView recyclerView) {
        if (PatchProxy.proxy(new Object[]{context, recyclerView}, null, changeQuickRedirect, true, 31237, new Class[]{Context.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        V(context, recyclerView, ViewUtils.f(context, 4.0f) / 2, ViewUtils.f(context, 5.0f), 0);
    }

    public static void V(Context context, RecyclerView recyclerView, int i10, int i11, int i12) {
        Object[] objArr = {context, recyclerView, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31238, new Class[]{Context.class, RecyclerView.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        recyclerView.addItemDecoration(new g(recyclerView, i12, i10, i11));
    }

    public static void W(Context context, ImageView imageView, ImageInfoObj imageInfoObj, int i10) {
        if (PatchProxy.proxy(new Object[]{context, imageView, imageInfoObj, new Integer(i10)}, null, changeQuickRedirect, true, 31236, new Class[]{Context.class, ImageView.class, ImageInfoObj.class, Integer.TYPE}, Void.TYPE).isSupported || imageInfoObj == null || context == null || imageView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iL = (ViewUtils.L(context) - ViewUtils.f(context, i10 >= 0 ? i10 : 12)) / 2;
        layoutParams.width = iL;
        if (com.max.hbutils.utils.n.p(imageInfoObj.getRatio()) > 0.0f) {
            layoutParams.height = (int) (iL / com.max.hbutils.utils.n.p(imageInfoObj.getRatio()));
        } else if (com.max.hbutils.utils.n.q(imageInfoObj.getWidth()) > com.max.hbutils.utils.n.q(imageInfoObj.getHeight())) {
            layoutParams.height = (iL * 3) / 4;
        } else if (com.max.hbutils.utils.n.q(imageInfoObj.getWidth()) < com.max.hbutils.utils.n.q(imageInfoObj.getHeight())) {
            layoutParams.height = (iL * 4) / 3;
        } else {
            layoutParams.height = iL;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static void X(String str) {
        Activity activityE;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31249, new Class[]{String.class}, Void.TYPE).isSupported || (activityE = HeyBoxApplication.C().E()) == null || activityE.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activityE).y("无法关注用户").l(str).u("我知道了", new n()).F();
    }

    public static void Y(Context context, String str, List<BBSLinkObj> list, RecyclerView.Adapter adapter, int i10, List<CollectionFolder> list2, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, list, adapter, new Integer(i10), list2, str2}, null, changeQuickRedirect, true, 31232, new Class[]{Context.class, String.class, List.class, RecyclerView.Adapter.class, Integer.TYPE, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_select_collection, (ViewGroup) null, false);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(context, true, viewInflate);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bb_cancel);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        View viewFindViewById = viewInflate.findViewById(R.id.v_blank);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_choices);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_action);
        ArrayList arrayList = new ArrayList();
        for (CollectionFolder collectionFolder : list2) {
            if (str == null || !str.equals(collectionFolder.getId())) {
                arrayList.add(collectionFolder);
            }
        }
        textView.setText("收藏内容");
        a aVar = new a(context, arrayList, R.layout.item_collection_folder, context, str, list, adapter, i10, iVar, str2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aVar);
        ViewOnClickListenerC0724b viewOnClickListenerC0724b = new ViewOnClickListenerC0724b(iVar);
        Drawable drawable = context.getResources().getDrawable(R.drawable.ic_0icon_action_add_dark_20);
        drawable.setBounds(0, 0, ViewUtils.f(context, 20.0f), ViewUtils.f(context, 20.0f));
        textView2.setCompoundDrawablePadding(ViewUtils.f(context, 4.0f));
        textView2.setText("创建收藏夹");
        textView2.setCompoundDrawables(drawable, null, null, null);
        ((View) textView2.getParent()).setOnClickListener(new c(context, str, list, adapter, i10, iVar, str2));
        bottomButtonLeftItemView.setRightClickListener(viewOnClickListenerC0724b);
        viewFindViewById.setOnClickListener(viewOnClickListenerC0724b);
        iVar.show();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    public static PostPageParam a(Context context, BBSLinkObj bBSLinkObj, boolean z10) {
        VideoInfoObj videoInfoObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31216, new Class[]{Context.class, BBSLinkObj.class, Boolean.TYPE}, PostPageParam.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageParam) patchProxyResultProxy.result;
        }
        VideoInfoObj video_info = bBSLinkObj.getVideo_info();
        if (video_info != null) {
            if (TextUtils.isEmpty(video_info.getVideo_url()) && (video_info.getVideo_urls() == null || video_info.getVideo_urls().size() == 0)) {
                if (TextUtils.isEmpty(bBSLinkObj.getVideo_url())) {
                    videoInfoObj = null;
                } else {
                    video_info.setVideo_url(bBSLinkObj.getVideo_url());
                }
            }
            return new PostPageParam(context, bBSLinkObj.getH_src(), bBSLinkObj.getLinkid(), bBSLinkObj.getLink_tag(), bBSLinkObj.getRoot_comment_id(), Boolean.valueOf(z10), l0.A0(bBSLinkObj), Boolean.valueOf(!"1".equals(bBSLinkObj.getFrom_specified_topic())), 0L, null, bBSLinkObj.getVertical(), com.max.hbcommon.utils.c.u(bBSLinkObj.getText()) ? null : bBSLinkObj.toLinkInfoObj(), bBSLinkObj.getPage_url(), videoInfoObj, bBSLinkObj.getComment_id());
        }
        if (!TextUtils.isEmpty(bBSLinkObj.getVideo_url())) {
            video_info = new VideoInfoObj();
            video_info.setVideo_url(bBSLinkObj.getVideo_url());
        }
        videoInfoObj = video_info;
        return new PostPageParam(context, bBSLinkObj.getH_src(), bBSLinkObj.getLinkid(), bBSLinkObj.getLink_tag(), bBSLinkObj.getRoot_comment_id(), Boolean.valueOf(z10), l0.A0(bBSLinkObj), Boolean.valueOf(!"1".equals(bBSLinkObj.getFrom_specified_topic())), 0L, null, bBSLinkObj.getVertical(), com.max.hbcommon.utils.c.u(bBSLinkObj.getText()) ? null : bBSLinkObj.toLinkInfoObj(), bBSLinkObj.getPage_url(), videoInfoObj, bBSLinkObj.getComment_id());
    }

    public static void b(BBSLinkObj bBSLinkObj, String str) {
        if (PatchProxy.proxy(new Object[]{bBSLinkObj, str}, null, changeQuickRedirect, true, 31223, new Class[]{BBSLinkObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().z2(null, bBSLinkObj.getLinkid(), str, l0.Y(bBSLinkObj)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q());
    }

    public static boolean c(FeedsContentBaseObj feedsContentBaseObj, FeedsContentBaseObj feedsContentBaseObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsContentBaseObj, feedsContentBaseObj2}, null, changeQuickRedirect, true, 31211, new Class[]{FeedsContentBaseObj.class, FeedsContentBaseObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (feedsContentBaseObj == null || feedsContentBaseObj2 == null) {
            return feedsContentBaseObj == feedsContentBaseObj2;
        }
        String content_type = feedsContentBaseObj.getContent_type();
        if (content_type.equals(feedsContentBaseObj2.getContent_type())) {
            if ("12".equals(content_type) || "13".equals(content_type)) {
                FeedsContentGameObj feedsContentGameObj = (FeedsContentGameObj) feedsContentBaseObj;
                FeedsContentGameObj feedsContentGameObj2 = (FeedsContentGameObj) feedsContentBaseObj2;
                if (feedsContentGameObj.getGame() != null && feedsContentGameObj2.getGame() != null && feedsContentGameObj.getGame().getGame_type() != null && feedsContentGameObj2.getGame().getGame_type() != null && feedsContentGameObj.getGame().getAppid() != null && feedsContentGameObj2.getGame().getAppid() != null && feedsContentGameObj.getGame().getGame_type().equals(feedsContentGameObj2.getGame().getGame_type()) && feedsContentGameObj.getGame().getAppid().equals(feedsContentGameObj2.getGame().getAppid())) {
                    return true;
                }
            } else {
                if ("18".equals(content_type)) {
                    return true;
                }
                if ("7".equals(content_type)) {
                    FeedsContentNewsTopicObj feedsContentNewsTopicObj = (FeedsContentNewsTopicObj) feedsContentBaseObj;
                    FeedsContentNewsTopicObj feedsContentNewsTopicObj2 = (FeedsContentNewsTopicObj) feedsContentBaseObj2;
                    if (feedsContentNewsTopicObj.getNews_topics() != null && feedsContentNewsTopicObj.getNews_topics().size() > 0 && feedsContentNewsTopicObj2.getNews_topics() != null && feedsContentNewsTopicObj2.getNews_topics().size() > 0 && feedsContentNewsTopicObj.getNews_topics().get(0).getId() != null && feedsContentNewsTopicObj2.getNews_topics().get(0).getId() != null) {
                        feedsContentNewsTopicObj.getNews_topics().get(0).getId().equals(feedsContentNewsTopicObj2.getNews_topics().get(0).getId());
                        return false;
                    }
                } else if ("10".equals(content_type)) {
                    FeedsContentEntryObj feedsContentEntryObj = (FeedsContentEntryObj) feedsContentBaseObj;
                    FeedsContentEntryObj feedsContentEntryObj2 = (FeedsContentEntryObj) feedsContentBaseObj2;
                    if (feedsContentEntryObj.getFormated_time() != null && feedsContentEntryObj2.getFormated_time() != null && feedsContentEntryObj.getFormated_time().equals(feedsContentEntryObj2.getFormated_time())) {
                        return true;
                    }
                } else if ("21".equals(content_type) || BBSLinkObj.CONTENT_TYPE_EXPRESS_NEWS.equals(content_type)) {
                    FeedsContentRecNewsObj feedsContentRecNewsObj = (FeedsContentRecNewsObj) feedsContentBaseObj;
                    FeedsContentRecNewsObj feedsContentRecNewsObj2 = (FeedsContentRecNewsObj) feedsContentBaseObj2;
                    if (feedsContentRecNewsObj.getTopic_id() != null && feedsContentRecNewsObj2.getTopic_id() != null && feedsContentRecNewsObj.getTopic_id().equals(feedsContentRecNewsObj2.getTopic_id())) {
                        return true;
                    }
                } else if (BBSLinkObj.CONTENT_TYPE_REC_LINK.equals(content_type)) {
                    FeedsContentRecLinksObj feedsContentRecLinksObj = (FeedsContentRecLinksObj) feedsContentBaseObj;
                    FeedsContentRecLinksObj feedsContentRecLinksObj2 = (FeedsContentRecLinksObj) feedsContentBaseObj2;
                    if (feedsContentRecLinksObj.getItems() != null && feedsContentRecLinksObj2.getItems() != null && feedsContentRecLinksObj.getItems().equals(feedsContentRecLinksObj2.getItems())) {
                        return true;
                    }
                } else if ("22".equals(content_type)) {
                    FeedsContentRecSwitchObj feedsContentRecSwitchObj = (FeedsContentRecSwitchObj) feedsContentBaseObj;
                    FeedsContentRecSwitchObj feedsContentRecSwitchObj2 = (FeedsContentRecSwitchObj) feedsContentBaseObj2;
                    if (feedsContentRecSwitchObj.getImg() != null && feedsContentRecSwitchObj2.getImg() != null && feedsContentRecSwitchObj.getImg().equals(feedsContentRecSwitchObj2.getImg())) {
                        return true;
                    }
                } else if ("23".equals(content_type)) {
                    FeedsContentAdObj feedsContentAdObj = (FeedsContentAdObj) feedsContentBaseObj;
                    FeedsContentAdObj feedsContentAdObj2 = (FeedsContentAdObj) feedsContentBaseObj2;
                    if (feedsContentAdObj.getBanners() != null && feedsContentAdObj2.getBanners() != null && feedsContentAdObj.getBanners().size() > 0 && feedsContentAdObj2.getBanners().size() > 0 && feedsContentAdObj.getBanners().get(0).getTitle() != null && feedsContentAdObj2.getBanners().get(0).getTitle() != null && feedsContentAdObj.getBanners().get(0).getTitle().equals(feedsContentAdObj2.getBanners().get(0).getText())) {
                        return true;
                    }
                } else if ("24".equals(content_type)) {
                    FeedsContentRecHashObj feedsContentRecHashObj = (FeedsContentRecHashObj) feedsContentBaseObj;
                    FeedsContentRecHashObj feedsContentRecHashObj2 = (FeedsContentRecHashObj) feedsContentBaseObj2;
                    if (feedsContentRecHashObj.getHashtags() != null && feedsContentRecHashObj2.getHashtags() != null && feedsContentRecHashObj.getHashtags().size() > 0 && feedsContentRecHashObj2.getHashtags().size() > 0 && feedsContentRecHashObj.getHashtags().get(0).getId() != null && feedsContentRecHashObj2.getHashtags().get(0).getId() != null && feedsContentRecHashObj.getHashtags().get(0).getId().equals(feedsContentRecHashObj2.getHashtags().get(0).getId())) {
                        return true;
                    }
                } else {
                    if (!BBSLinkObj.CONTENT_TYPE_REC_WRITE_ARTICLE.equals(content_type)) {
                        if (BBSLinkObj.CONTENT_TYPE_UI_KIT.equals(content_type)) {
                            return feedsContentBaseObj == feedsContentBaseObj2;
                        }
                        if (BBSLinkObj.CONTENT_TYPE_REC_USERS.equals(content_type)) {
                            return feedsContentBaseObj == feedsContentBaseObj2;
                        }
                        if ("42".equals(content_type)) {
                            return feedsContentBaseObj == feedsContentBaseObj2;
                        }
                        if (!(feedsContentBaseObj instanceof BBSLinkObj) || !(feedsContentBaseObj2 instanceof BBSLinkObj)) {
                            return feedsContentBaseObj == feedsContentBaseObj2;
                        }
                        BBSLinkObj bBSLinkObj = (BBSLinkObj) feedsContentBaseObj;
                        BBSLinkObj bBSLinkObj2 = (BBSLinkObj) feedsContentBaseObj2;
                        return (bBSLinkObj.getLinkid() == null || bBSLinkObj2.getLinkid() == null || !bBSLinkObj.getLinkid().equals(bBSLinkObj2.getLinkid())) ? false : true;
                    }
                    FeedsContentArtRecObj feedsContentArtRecObj = (FeedsContentArtRecObj) feedsContentBaseObj;
                    FeedsContentArtRecObj feedsContentArtRecObj2 = (FeedsContentArtRecObj) feedsContentBaseObj2;
                    if (feedsContentArtRecObj.getCard_img() != null && feedsContentArtRecObj2.getCard_img() != null && feedsContentArtRecObj.getCard_img().equals(feedsContentArtRecObj2.getCard_img())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static BBSLinkVoteObj d(LinkVoteInfoObj linkVoteInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkVoteInfoObj}, null, changeQuickRedirect, true, 31248, new Class[]{LinkVoteInfoObj.class}, BBSLinkVoteObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkVoteObj) patchProxyResultProxy.result;
        }
        BBSLinkVoteObj bBSLinkVoteObj = new BBSLinkVoteObj();
        if (linkVoteInfoObj != null) {
            bBSLinkVoteObj.setVote_title(linkVoteInfoObj.getTitle());
            bBSLinkVoteObj.setVote_type(linkVoteInfoObj.getVote_type());
            bBSLinkVoteObj.setVote_num(com.max.hbutils.utils.n.q(linkVoteInfoObj.getVote_choose_limit()));
            if (!com.max.hbcommon.utils.c.w(linkVoteInfoObj.getVote_options())) {
                ArrayList arrayList = new ArrayList();
                for (VoteOptionObj voteOptionObj : linkVoteInfoObj.getVote_options()) {
                    BBSVoteOptionObj bBSVoteOptionObj = new BBSVoteOptionObj();
                    bBSVoteOptionObj.setImgurl(voteOptionObj.getImg());
                    bBSVoteOptionObj.setText(voteOptionObj.getText());
                    arrayList.add(bBSVoteOptionObj);
                }
                bBSLinkVoteObj.setOption_list(arrayList);
            }
            if (!com.max.hbcommon.utils.c.u(linkVoteInfoObj.getExpire_at_ts())) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(com.max.hbutils.utils.n.r(linkVoteInfoObj.getExpire_at_ts()) * 1000);
                bBSLinkVoteObj.setVote_end_date(calendar);
            }
            bBSLinkVoteObj.setOption_mode(linkVoteInfoObj.getOption_mode());
        }
        return bBSLinkVoteObj;
    }

    private static void e(io.reactivex.disposables.a aVar, String str, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{aVar, str, gVar}, null, changeQuickRedirect, true, 31247, new Class[]{io.reactivex.disposables.a.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ob(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m(gVar)));
    }

    public static io.reactivex.disposables.b f(Context context, String str, List<BBSLinkObj> list, RecyclerView.Adapter adapter, int i10, String str2, Dialog dialog, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, list, adapter, new Integer(i10), str2, dialog, str3}, null, changeQuickRedirect, true, 31234, new Class[]{Context.class, String.class, List.class, RecyclerView.Adapter.class, Integer.TYPE, String.class, Dialog.class, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ob(str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(dialog, context, str, list, adapter, i10, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.max.hbcommon.base.f g(Context context) {
        if (context instanceof com.max.hbcommon.base.f) {
            return (com.max.hbcommon.base.f) context;
        }
        return null;
    }

    public static io.reactivex.disposables.b h(Context context, String str, List<BBSLinkObj> list, RecyclerView.Adapter adapter, int i10, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, list, adapter, new Integer(i10), str2}, null, changeQuickRedirect, true, 31231, new Class[]{Context.class, String.class, List.class, RecyclerView.Adapter.class, Integer.TYPE, String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v(0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new x(context, str, list, adapter, i10, str2));
    }

    public static EditText i(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 31250, new Class[]{Context.class}, EditText.class);
        if (patchProxyResultProxy.isSupported) {
            return (EditText) patchProxyResultProxy.result;
        }
        EditText editText = new EditText(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = ViewUtils.f(context, 14.0f);
        layoutParams.rightMargin = ViewUtils.f(context, 14.0f);
        layoutParams.topMargin = ViewUtils.f(context, 20.0f);
        layoutParams.bottomMargin = ViewUtils.f(context, 23.0f);
        layoutParams.height = ViewUtils.f(context, 40.0f);
        layoutParams.width = -1;
        editText.setGravity(17);
        editText.setLayoutParams(layoutParams);
        editText.setHint("输入收藏夹标题（8字内）");
        editText.setTextSize(14.0f);
        editText.setTextColor(com.max.hbcommon.utils.l.a(R.color.text_primary_1_color));
        editText.setSingleLine();
        editText.setBackgroundResource(R.color.background_layer_2_color);
        return editText;
    }

    public static com.sankuai.waimai.router.core.i j(Context context, BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj}, null, changeQuickRedirect, true, 31212, new Class[]{Context.class, BBSLinkObj.class}, com.sankuai.waimai.router.core.i.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result : k(context, bBSLinkObj, !com.max.hbcommon.utils.c.u(bBSLinkObj.getRoot_comment_id()));
    }

    private static com.sankuai.waimai.router.core.i k(Context context, BBSLinkObj bBSLinkObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31213, new Class[]{Context.class, BBSLinkObj.class, Boolean.TYPE}, com.sankuai.waimai.router.core.i.class);
        return patchProxyResultProxy.isSupported ? (com.sankuai.waimai.router.core.i) patchProxyResultProxy.result : com.max.xiaoheihe.base.router.b.B(a(context, bBSLinkObj, z10), l(bBSLinkObj));
    }

    public static PostPageFactory.PostType l(BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, null, changeQuickRedirect, true, 31214, new Class[]{BBSLinkObj.class}, PostPageFactory.PostType.class);
        return patchProxyResultProxy.isSupported ? (PostPageFactory.PostType) patchProxyResultProxy.result : m(bBSLinkObj.getLink_tag(), bBSLinkObj.getUse_concept_type());
    }

    public static PostPageFactory.PostType m(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 31215, new Class[]{String.class, String.class}, PostPageFactory.PostType.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostPageFactory.PostType) patchProxyResultProxy.result;
        }
        if ("28".equals(str) || "27".equals(str) || "26".equals(str) || com.max.hbcommon.utils.c.x(str2)) {
            return PostPageFactory.PostType.PICTURE_TEXT;
        }
        if (y(str)) {
            return PostPageFactory.PostType.WEB_NEWS;
        }
        return z(str) ? PostPageFactory.PostType.WIKI : PostPageFactory.PostType.NORMAL;
    }

    private static String n(BBSLinkObj bBSLinkObj, BBSLinkObj bBSLinkObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj, bBSLinkObj2}, null, changeQuickRedirect, true, 31224, new Class[]{BBSLinkObj.class, BBSLinkObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (bBSLinkObj2 == null) {
            return "";
        }
        if (bBSLinkObj.getDescription() == null) {
            return null;
        }
        return com.max.xiaoheihe.utils.j.e(bBSLinkObj.getUser().getUserid(), bBSLinkObj.getUser().getUsername(), bBSLinkObj.getDescription());
    }

    public static String o(Context context, BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj}, null, changeQuickRedirect, true, 31217, new Class[]{Context.class, BBSLinkObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = context.getResources().getString(R.string.default_share_desc);
        return (bBSLinkObj == null || com.max.hbcommon.utils.c.u(bBSLinkObj.getDescription())) ? string : bBSLinkObj.getDescription();
    }

    public static String p(Context context, LinkInfoObj linkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkInfoObj}, null, changeQuickRedirect, true, 31218, new Class[]{Context.class, LinkInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = context.getResources().getString(R.string.default_share_desc);
        return (linkInfoObj == null || com.max.hbcommon.utils.c.u(linkInfoObj.getDescription())) ? string : linkInfoObj.getDescription();
    }

    public static String q(Context context, LinkInfoObj linkInfoObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31220, new Class[]{Context.class, LinkInfoObj.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String string = context.getResources().getString(R.string.default_share_desc);
        if (linkInfoObj == null) {
            return string;
        }
        if (!"1".equals(linkInfoObj.getIs_web()) || com.max.hbcommon.utils.c.u(linkInfoObj.getText()) || !linkInfoObj.getText().startsWith(Constants.ARRAY_TYPE) || !linkInfoObj.getText().endsWith("]")) {
            return !com.max.hbcommon.utils.c.u(linkInfoObj.getText()) ? com.max.xiaoheihe.utils.d.M1(linkInfoObj.getText()) : string;
        }
        List<BBSTextObj> listB = null;
        try {
            listB = com.max.hbutils.utils.k.b(linkInfoObj.getText(), BBSTextObj.class);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (listB == null || listB.size() <= 0) {
            return string;
        }
        if (z10) {
            string = "";
        }
        for (BBSTextObj bBSTextObj : listB) {
            if ("text".equalsIgnoreCase(bBSTextObj.getType()) && !com.max.hbcommon.utils.c.u(bBSTextObj.getText())) {
                if (!z10) {
                    string = com.max.xiaoheihe.utils.d.M1(bBSTextObj.getText());
                    break;
                }
                string = string + bBSTextObj.getText() + "\n";
            }
        }
        return (!z10 || com.max.hbcommon.utils.c.u(string)) ? string : string.substring(0, string.length() - 1);
    }

    public static UMImage r(Context context, BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj}, null, changeQuickRedirect, true, 31219, new Class[]{Context.class, BBSLinkObj.class}, UMImage.class);
        if (patchProxyResultProxy.isSupported) {
            return (UMImage) patchProxyResultProxy.result;
        }
        if (bBSLinkObj == null) {
            return null;
        }
        if ("1".equals(bBSLinkObj.getHas_video())) {
            String thumb = bBSLinkObj.getVideo_info() != null ? bBSLinkObj.getVideo_info().getThumb() : bBSLinkObj.getVideo_thumb();
            if (com.max.hbcommon.utils.c.u(thumb)) {
                return null;
            }
            return new UMImage(context, thumb);
        }
        if (bBSLinkObj.getImgs() == null || bBSLinkObj.getImgs().size() <= 0) {
            return null;
        }
        String str = bBSLinkObj.getImgs().get(0);
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        return new UMImage(context, str);
    }

    public static UMImage s(Context context, LinkInfoObj linkInfoObj) {
        List<BBSTextObj> listB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, linkInfoObj}, null, changeQuickRedirect, true, 31221, new Class[]{Context.class, LinkInfoObj.class}, UMImage.class);
        if (patchProxyResultProxy.isSupported) {
            return (UMImage) patchProxyResultProxy.result;
        }
        if (linkInfoObj == null) {
            return null;
        }
        if ("1".equals(linkInfoObj.getHas_video())) {
            String thumb = linkInfoObj.getVideo_info() != null ? linkInfoObj.getVideo_info().getThumb() : linkInfoObj.getVideo_thumb();
            if (com.max.hbcommon.utils.c.u(thumb)) {
                return null;
            }
            return new UMImage(context, thumb);
        }
        if (!"1".equals(linkInfoObj.getIs_web()) || com.max.hbcommon.utils.c.u(linkInfoObj.getText()) || !linkInfoObj.getText().startsWith(Constants.ARRAY_TYPE) || !linkInfoObj.getText().endsWith("]")) {
            return null;
        }
        try {
            listB = com.max.hbutils.utils.k.b(linkInfoObj.getText(), BBSTextObj.class);
        } catch (Exception e10) {
            e10.printStackTrace();
            listB = null;
        }
        if (listB == null || listB.size() <= 0) {
            return null;
        }
        for (BBSTextObj bBSTextObj : listB) {
            if (SocialConstants.PARAM_IMG_URL.equalsIgnoreCase(bBSTextObj.getType()) && !com.max.hbcommon.utils.c.u(bBSTextObj.getUrl())) {
                return new UMImage(context, bBSTextObj.getUrl());
            }
        }
        return null;
    }

    public static String t(Context context, BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj}, null, changeQuickRedirect, true, 31245, new Class[]{Context.class, BBSLinkObj.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : u(context, bBSLinkObj, true);
    }

    public static String u(Context context, BBSLinkObj bBSLinkObj, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSLinkObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 31246, new Class[]{Context.class, BBSLinkObj.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getFormated_time())) {
            sb2.append(bBSLinkObj.getFormated_time());
        } else if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getCreate_at())) {
            sb2.append(ad.a.a(ad.a.G, false) ? com.max.hbutils.utils.w.q(context, bBSLinkObj.getCreate_at()) : com.max.hbutils.utils.w.t(context, bBSLinkObj.getCreate_at()));
        }
        if (!com.max.hbcommon.utils.c.u(bBSLinkObj.getPost_tag())) {
            if (sb2.length() > 0) {
                sb2.append("·");
            }
            sb2.append(bBSLinkObj.getPost_tag());
        } else if (z10 && bBSLinkObj.getTopic() != null) {
            if (sb2.length() > 0) {
                sb2.append("·");
            }
            sb2.append(bBSLinkObj.getTopic().getName());
        }
        return sb2.toString();
    }

    public static TextView v(Context context, BBSTopicObj bBSTopicObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bBSTopicObj}, null, changeQuickRedirect, true, 31240, new Class[]{Context.class, BBSTopicObj.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(context);
        textView.setBackgroundResource(R.drawable.divider_color_concept_2dp);
        textView.setGravity(17);
        int iF = ViewUtils.f(context, 4.0f);
        textView.setPadding(iF, 0, iF, 0);
        textView.setTextSize(1, 9.0f);
        textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(bBSTopicObj.getName());
        textView.setOnClickListener(new l(context, bBSTopicObj));
        return textView;
    }

    public static boolean w(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31241, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "28".equals(str) || "29".equals(str);
    }

    public static boolean x(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31243, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "27".equals(str) || "28".equals(str);
    }

    public static boolean y(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31242, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return "11".equals(str) || "13".equals(str) || "1".equals(str) || "21".equals(str) || "29".equals(str) || com.max.hbutils.utils.n.q(str) > com.max.hbutils.utils.n.q("24");
    }

    public static boolean z(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31244, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "23".equals(str);
    }
}
