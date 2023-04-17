plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation(projects.app.ui.legacy)
    implementation(projects.app.core)

    implementation(libs.timber)
    implementation("androidx.core:core-ktx:1.10.0")
}

android {
    namespace = "app.k9mail.ui.widget.list"

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        debug {
            manifestPlaceholders["appAuthRedirectScheme"] = "FIXME: override this in your app project"
        }
        release {
            manifestPlaceholders["appAuthRedirectScheme"] = "FIXME: override this in your app project"
        }
    }
}
