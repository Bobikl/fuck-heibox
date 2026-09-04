package com.max.hbcommon.base.hblifeevent.activity;

import android.app.Application;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import mh.c;
import mh.d;

/* JADX INFO: compiled from: HBActivityLifeEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.TYPE})
@c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@d(allowedTargets = {AnnotationTarget.CLASS})
public @interface b {
    Class<? extends Application.ActivityLifecycleCallbacks>[] lifeEvents() default {};
}
