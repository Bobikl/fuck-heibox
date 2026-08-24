plugins {
    id("com.android.application")
}

android {
    namespace = "dev.heybox.hook"
    compileSdk = 36
    buildToolsVersion = "36.0.0"

    defaultConfig {
        applicationId = "dev.heybox.hook"
        minSdk = 26
        targetSdk = 35
        versionCode = 26
        versionName = "0.6.2"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs["debug"]
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources {
            merges += "META-INF/xposed/*"
            excludes += "META-INF/*.version"
        }
    }

    lint {
        abortOnError = true
        checkReleaseBuilds = false
    }
}

dependencies {
    compileOnly("io.github.libxposed:api:102.0.0")
    // Remote Preferences 的服务协议向后兼容；101 客户端可连接 API 102
    // 框架，同时避免为设置页引入 Android 17 compileSdk 要求。
    implementation("io.github.libxposed:service:101.0.0")
}
