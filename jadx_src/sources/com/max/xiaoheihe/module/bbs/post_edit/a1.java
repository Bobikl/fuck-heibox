package com.max.xiaoheihe.module.bbs.post_edit;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.g80;
import df.h80;
import df.i80;
import df.j80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TopicChooseUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.jvm.internal.t0({"SMAP\nTopicChooseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicChooseUtils.kt\ncom/max/xiaoheihe/module/bbs/post_edit/TopicChooseUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1855#2:251\n1855#2,2:252\n1856#2:254\n766#2:255\n857#2,2:256\n1603#2,9:258\n1855#2:267\n1856#2:269\n1612#2:270\n1855#2:271\n1856#2:273\n1855#2,2:274\n1#3:268\n1#3:272\n*S KotlinDebug\n*F\n+ 1 TopicChooseUtils.kt\ncom/max/xiaoheihe/module/bbs/post_edit/TopicChooseUtils\n*L\n154#1:251\n156#1:252,2\n154#1:254\n205#1:255\n205#1:256,2\n205#1:258,9\n205#1:267\n205#1:269\n205#1:270\n209#1:271\n209#1:273\n243#1:274,2\n205#1:268\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a1 f82828a = new a1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82829b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: TopicChooseUtils.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashtagObj f82830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f82831c;

        a(HashtagObj hashtagObj, Context context) {
            this.f82830b = hashtagObj;
            this.f82831c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30856, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f82830b.getAct_protocol())) {
                com.max.xiaoheihe.base.router.b.k0(this.f82831c, this.f82830b.getAct_protocol());
            } else {
                Context context = this.f82831c;
                context.startActivity(HashtagDetailActivity.x2(context, this.f82830b.getName()));
            }
        }
    }

    private a1() {
    }

    public static /* synthetic */ void k(a1 a1Var, Context context, BBSTopicObj bBSTopicObj, View view, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {a1Var, context, bBSTopicObj, view, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 30843, new Class[]{a1.class, Context.class, BBSTopicObj.class, View.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        a1Var.j(context, bBSTopicObj, view, z10, (i10 & 16) != 0 ? false : z11 ? 1 : 0);
    }

    @dl.d
    public final ArrayList<String> a(@dl.e ArrayList<TopicHashtagWrapper> arrayList) {
        BBSTopicObj topic;
        ArrayList<String> irrelevant_topic_ids;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 30847, new Class[]{ArrayList.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            for (TopicHashtagWrapper topicHashtagWrapper : arrayList) {
                if (topicHashtagWrapper.isTopic() && (topic = topicHashtagWrapper.getTopic()) != null && (irrelevant_topic_ids = topic.getIrrelevant_topic_ids()) != null) {
                    kotlin.jvm.internal.f0.o(irrelevant_topic_ids, "irrelevant_topic_ids");
                    for (String str : irrelevant_topic_ids) {
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public final int b(@dl.e ArrayList<TopicHashtagWrapper> arrayList) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 30855, new Class[]{ArrayList.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((TopicHashtagWrapper) it.next()).getTopic() != null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public final boolean c(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d String hashtagName) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, hashtagName}, this, changeQuickRedirect, false, 30850, new Class[]{ArrayList.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(hashtagName, "hashtagName");
        if (arrayList != null) {
            Iterator<TopicHashtagWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                HashtagObj hashtag = it.next().getHashtag();
                if (kotlin.jvm.internal.f0.g(hashtagName, hashtag != null ? hashtag.getName() : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d BBSTopicObj item) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, item}, this, changeQuickRedirect, false, 30848, new Class[]{ArrayList.class, BBSTopicObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(item, "item");
        String topic_id = item.getTopic_id();
        kotlin.jvm.internal.f0.o(topic_id, "item.topic_id");
        return f(arrayList, topic_id);
    }

    public final boolean e(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d HashtagObj item) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, item}, this, changeQuickRedirect, false, 30849, new Class[]{ArrayList.class, HashtagObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(item, "item");
        String name = item.getName();
        kotlin.jvm.internal.f0.o(name, "item.name");
        return c(arrayList, name);
    }

    public final boolean f(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d String topicId) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, topicId}, this, changeQuickRedirect, false, 30851, new Class[]{ArrayList.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(topicId, "topicId");
        if (arrayList != null) {
            Iterator<TopicHashtagWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                BBSTopicObj topic = it.next().getTopic();
                if (kotlin.jvm.internal.f0.g(topicId, topic != null ? topic.getTopic_id() : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void g(@dl.d Context context, @dl.d HashtagObj data, @dl.d View itemView) {
        if (PatchProxy.proxy(new Object[]{context, data, itemView}, this, changeQuickRedirect, false, 30845, new Class[]{Context.class, HashtagObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(itemView, "itemView");
        g80 g80VarA = g80.a(itemView);
        kotlin.jvm.internal.f0.o(g80VarA, "bind(itemView)");
        g80VarA.b().setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
        g80VarA.f110866d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
        g80VarA.f110865c.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
        g80VarA.f110867e.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.xiaoheihe.utils.d.e1(data.getStart_color()), com.max.xiaoheihe.utils.d.e1(data.getEnd_color())));
        if (com.max.hbcommon.utils.c.u(data.getSub_title())) {
            g80VarA.f110867e.setVisibility(8);
        } else {
            g80VarA.f110867e.setText(data.getSub_title());
            g80VarA.f110867e.setVisibility(0);
        }
        g80VarA.f110866d.setText(data.getName());
    }

    public final void h(@dl.d Context context, @dl.d HashtagObj data, @dl.d View itemView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, data, itemView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 30844, new Class[]{Context.class, HashtagObj.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(itemView, "itemView");
        h80 h80VarA = h80.a(itemView);
        kotlin.jvm.internal.f0.o(h80VarA, "bind(itemView)");
        if (z10) {
            h80VarA.b().setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color, 3.0f));
            h80VarA.f111327d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color));
            h80VarA.f111325b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color));
            h80VarA.f111326c.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color));
        } else {
            h80VarA.b().setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
            h80VarA.f111327d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            h80VarA.f111326c.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            h80VarA.f111325b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        }
        if (com.max.hbcommon.utils.c.u(data.getSub_title())) {
            h80VarA.f111328e.setVisibility(8);
        } else {
            h80VarA.f111328e.setText(data.getSub_title());
            h80VarA.f111328e.setVisibility(0);
            h80VarA.f111328e.setBackground(ViewUtils.x(ViewUtils.f(context, 2.0f), com.max.xiaoheihe.utils.d.e1(data.getStart_color()), com.max.xiaoheihe.utils.d.e1(data.getEnd_color())));
        }
        h80VarA.f111327d.setText(data.getName());
        h80VarA.f111325b.setOnClickListener(new a(data, context));
    }

    public final void i(@dl.d Context context, @dl.d TopicHashtagWrapper data, @dl.d View itemView) {
        String pic_url;
        if (PatchProxy.proxy(new Object[]{context, data, itemView}, this, changeQuickRedirect, false, 30846, new Class[]{Context.class, TopicHashtagWrapper.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(itemView, "itemView");
        i80 i80VarA = i80.a(itemView);
        kotlin.jvm.internal.f0.o(i80VarA, "bind(itemView)");
        if (kotlin.jvm.internal.f0.g(TopicHashtagWrapper.TYPE_CREATE, data.getSearch_type())) {
            i80VarA.f111686h.setVisibility(0);
            i80VarA.f111683e.setVisibility(8);
            TextView textView = i80VarA.f111684f;
            HashtagObj hashtag = data.getHashtag();
            kotlin.jvm.internal.f0.m(hashtag);
            textView.setText(hashtag.getName());
            i80VarA.f111682d.setVisibility(8);
            i80VarA.f111681c.setVisibility(0);
            return;
        }
        if (data.isTopic() && data.getTopic() != null) {
            i80VarA.f111686h.setVisibility(8);
            i80VarA.f111682d.setVisibility(0);
            i80VarA.f111681c.setVisibility(8);
            BBSTopicObj topic = data.getTopic();
            if (topic != null && (pic_url = topic.getPic_url()) != null) {
                com.max.hbimage.b.d0(pic_url, i80VarA.f111682d, ViewUtils.f(context, 2.0f));
            }
            BBSTopicObj topic2 = data.getTopic();
            if (com.max.hbcommon.utils.c.u(topic2 != null ? topic2.getDesc() : null)) {
                i80VarA.f111683e.setVisibility(8);
            } else {
                TextView textView2 = i80VarA.f111683e;
                BBSTopicObj topic3 = data.getTopic();
                kotlin.jvm.internal.f0.m(topic3);
                textView2.setText(topic3.getDesc());
                i80VarA.f111683e.setVisibility(0);
            }
            TextView textView3 = i80VarA.f111684f;
            BBSTopicObj topic4 = data.getTopic();
            kotlin.jvm.internal.f0.m(topic4);
            textView3.setText(topic4.getName());
            return;
        }
        if (!data.isHashtag() || data.getHashtag() == null) {
            return;
        }
        i80VarA.f111686h.setVisibility(8);
        i80VarA.f111682d.setVisibility(8);
        i80VarA.f111681c.setVisibility(0);
        TextView textView4 = i80VarA.f111684f;
        HashtagObj hashtag2 = data.getHashtag();
        kotlin.jvm.internal.f0.m(hashtag2);
        textView4.setText(hashtag2.getName());
        HashtagObj hashtag3 = data.getHashtag();
        kotlin.jvm.internal.f0.m(hashtag3);
        if (com.max.hbcommon.utils.c.u(hashtag3.getDesc())) {
            i80VarA.f111683e.setVisibility(8);
            return;
        }
        TextView textView5 = i80VarA.f111683e;
        HashtagObj hashtag4 = data.getHashtag();
        kotlin.jvm.internal.f0.m(hashtag4);
        textView5.setText(hashtag4.getDesc());
        i80VarA.f111683e.setVisibility(0);
    }

    public final void j(@dl.d Context context, @dl.d BBSTopicObj data, @dl.d View itemView, boolean z10, boolean z11) {
        Object[] objArr = {context, data, itemView, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 30842, new Class[]{Context.class, BBSTopicObj.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(data, "data");
        kotlin.jvm.internal.f0.p(itemView, "itemView");
        j80 j80VarA = j80.a(itemView);
        kotlin.jvm.internal.f0.o(j80VarA, "bind(itemView)");
        if (z10 || !z11) {
            j80VarA.b().setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
            j80VarA.f112087d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            j80VarA.b().setBackground(com.max.hbutils.utils.q.o(context, R.color.text_primary_1_color, 3.0f));
            j80VarA.f112087d.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color));
        }
        com.max.hbimage.b.K(data.getPic_url(), j80VarA.f112086c);
        j80VarA.f112087d.setText(data.getName());
        if (z10) {
            j80VarA.f112085b.setVisibility(0);
        } else {
            j80VarA.f112085b.setVisibility(8);
        }
    }

    public final void l(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d HashtagObj removeItem) {
        if (PatchProxy.proxy(new Object[]{arrayList, removeItem}, this, changeQuickRedirect, false, 30854, new Class[]{ArrayList.class, HashtagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(removeItem, "removeItem");
        if (arrayList != null) {
            Iterator<TopicHashtagWrapper> it = arrayList.iterator();
            kotlin.jvm.internal.f0.o(it, "it.iterator()");
            while (it.hasNext()) {
                TopicHashtagWrapper next = it.next();
                kotlin.jvm.internal.f0.o(next, "iterator.next()");
                String name = removeItem.getName();
                HashtagObj hashtag = next.getHashtag();
                if (kotlin.jvm.internal.f0.g(name, hashtag != null ? hashtag.getName() : null)) {
                    it.remove();
                }
            }
        }
    }

    public final void m(@dl.e ArrayList<TopicHashtagWrapper> arrayList, @dl.d BBSTopicObj removeItem) {
        if (PatchProxy.proxy(new Object[]{arrayList, removeItem}, this, changeQuickRedirect, false, 30853, new Class[]{ArrayList.class, BBSTopicObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(removeItem, "removeItem");
        if (arrayList != null) {
            Iterator<TopicHashtagWrapper> it = arrayList.iterator();
            kotlin.jvm.internal.f0.o(it, "it.iterator()");
            while (it.hasNext()) {
                TopicHashtagWrapper next = it.next();
                kotlin.jvm.internal.f0.o(next, "iterator.next()");
                String topic_id = removeItem.getTopic_id();
                BBSTopicObj topic = next.getTopic();
                if (kotlin.jvm.internal.f0.g(topic_id, topic != null ? topic.getTopic_id() : null)) {
                    it.remove();
                }
            }
        }
    }

    public final boolean n(@dl.d ArrayList<TopicHashtagWrapper> checkedList, @dl.d List<String> topicIds) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{checkedList, topicIds}, this, changeQuickRedirect, false, 30852, new Class[]{ArrayList.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(checkedList, "checkedList");
        kotlin.jvm.internal.f0.p(topicIds, "topicIds");
        ArrayList arrayList = new ArrayList();
        for (Object obj : checkedList) {
            if (((TopicHashtagWrapper) obj).isTopic()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BBSTopicObj topic = ((TopicHashtagWrapper) it.next()).getTopic();
            String topic_id = topic != null ? topic.getTopic_id() : null;
            if (topic_id != null) {
                arrayList2.add(topic_id);
            }
        }
        if (arrayList2.size() != topicIds.size()) {
            return false;
        }
        for (String str : topicIds) {
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.f0.g((String) next, str));
            if (((String) next) == null) {
                return false;
            }
        }
        return true;
    }
}
