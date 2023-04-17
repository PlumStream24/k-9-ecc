plugins {
    id(ThunderbirdPlugins.Library.android)
    id("org.jetbrains.kotlin.android")
}

dependencies {
    implementation(projects.app.core)

    api(libs.androidx.appcompat)
    api(libs.androidx.activity)
    api(libs.android.material)
    api(libs.androidx.navigation.fragment)
    api(libs.androidx.navigation.ui)
    api(libs.androidx.lifecycle.livedata.ktx)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.biometric)
    implementation(libs.timber)
    implementation(libs.kotlinx.coroutines.core)
    implementation("androidx.core:core-ktx:1.10.0")
}

android {
    namespace = "com.fsck.k9.ui.base"
}
