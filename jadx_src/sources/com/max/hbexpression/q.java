package com.max.hbexpression;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.max.hbexpression.bean.ExpressionObj;

/* JADX INFO: compiled from: ExpressionKeyboardManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface q {

    /* JADX INFO: compiled from: ExpressionKeyboardManager.kt */
    public interface a {
        void o0(@dl.e ExpressionObj expressionObj);
    }

    /* JADX INFO: compiled from: ExpressionKeyboardManager.kt */
    public interface b {
        void expressionDeleteClick(@dl.e View view);
    }

    void C();

    void L1(boolean z10);

    void N1(@dl.e String str);

    @dl.d
    Fragment P();

    void b2(@dl.d yh.a<Boolean> aVar);

    void q1();

    void q2();

    void v2();
}
