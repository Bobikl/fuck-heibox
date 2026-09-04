package com.max.hbcommon.bean.question;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: QuestionListObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class QuestionListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<QuestionObj> question_list;

    public QuestionListObj(@e List<QuestionObj> list) {
        this.question_list = list;
    }

    public static /* synthetic */ QuestionListObj copy$default(QuestionListObj questionListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{questionListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31610w5, new Class[]{QuestionListObj.class, List.class, Integer.TYPE, Object.class}, QuestionListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (QuestionListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = questionListObj.question_list;
        }
        return questionListObj.copy(list);
    }

    @e
    public final List<QuestionObj> component1() {
        return this.question_list;
    }

    @d
    public final QuestionListObj copy(@e List<QuestionObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, c.d.f31588v5, new Class[]{List.class}, QuestionListObj.class);
        return patchProxyResultProxy.isSupported ? (QuestionListObj) patchProxyResultProxy.result : new QuestionListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31676z5, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuestionListObj) && f0.g(this.question_list, ((QuestionListObj) obj).question_list);
    }

    @e
    public final List<QuestionObj> getQuestion_list() {
        return this.question_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31654y5, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<QuestionObj> list = this.question_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setQuestion_list(@e List<QuestionObj> list) {
        this.question_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31632x5, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "QuestionListObj(question_list=" + this.question_list + ')';
    }
}
