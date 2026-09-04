package com.ss.android.ttvecamera.systemresmanager;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class TESystemResManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f97838a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.a f97839b;

    public enum ActionType {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ActionType f97840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f97841b;

        public a(ActionType actionType) {
            this.f97841b = 0;
            this.f97840a = actionType;
        }

        public a(ActionType actionType, int i10) {
            this.f97840a = actionType;
            this.f97841b = i10;
        }
    }

    public void a(Context context) {
        if (this.f97838a) {
            return;
        }
        sg.a aVar = this.f97839b;
        if (aVar != null) {
            aVar.init(context);
        }
        this.f97838a = true;
    }

    public void b(sg.a aVar) {
        this.f97838a = false;
        this.f97839b = aVar;
    }

    public void c(a aVar) {
        sg.a aVar2;
        if (!this.f97838a || (aVar2 = this.f97839b) == null) {
            return;
        }
        ActionType actionType = aVar.f97840a;
        if (actionType == ActionType.BOOST_CPU) {
            aVar2.b(aVar.f97841b);
        } else if (actionType == ActionType.RESTORE_CPU) {
            aVar2.a();
        }
    }
}
