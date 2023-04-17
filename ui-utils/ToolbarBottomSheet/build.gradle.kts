plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    api(libs.android.material)
    implementation("androidx.core:core-ktx:1.10.0")
}

android {
    namespace = "app.k9mail.ui.utils.bottomsheet"
}
