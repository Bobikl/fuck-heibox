import java.util.Properties

plugins {
    id("com.android.application")
}

val releaseSigningProperties = Properties()
val releaseSigningFile = rootProject.file("keystore.properties")
if (releaseSigningFile.isFile) {
    releaseSigningFile.inputStream().use(releaseSigningProperties::load)
}

fun signingValue(propertyName: String, environmentName: String): String? =
    releaseSigningProperties.getProperty(propertyName)?.trim()?.takeIf { it.isNotEmpty() }
        ?: System.getenv(environmentName)?.trim()?.takeIf { it.isNotEmpty() }

val releaseStorePath = signingValue("storeFile", "HEYBOX_RELEASE_STORE_FILE")
val releaseStorePassword = signingValue("storePassword", "HEYBOX_RELEASE_STORE_PASSWORD")
val releaseKeyAlias = signingValue("keyAlias", "HEYBOX_RELEASE_KEY_ALIAS")
val releaseKeyPassword = signingValue("keyPassword", "HEYBOX_RELEASE_KEY_PASSWORD")
val releaseSigningConfigured = listOf(
    releaseStorePath, releaseStorePassword, releaseKeyAlias, releaseKeyPassword
).all { it != null }

android {
    namespace = "dev.heybox.hook"
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        applicationId = "dev.heybox.hook"
        minSdk = 26
        targetSdk = 35
        versionCode = 34
        versionName = "0.8.1"
    }

    val fixedReleaseSigning = if (releaseSigningConfigured) {
        signingConfigs.create("fixedRelease") {
            storeFile = rootProject.file(requireNotNull(releaseStorePath))
            storePassword = requireNotNull(releaseStorePassword)
            keyAlias = requireNotNull(releaseKeyAlias)
            keyPassword = requireNotNull(releaseKeyPassword)
            enableV1Signing = true
            enableV2Signing = true
        }
    } else {
        null
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // 未提供固定签名时生成 unsigned Release，绝不再悄悄回退到机器 debug key。
            signingConfig = fixedReleaseSigning
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        buildConfig = true
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
}
