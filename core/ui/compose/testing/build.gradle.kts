plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.core.ui.compose.testing"
}

dependencies {
    implementation(projects.core.ui.compose.theme)
    implementation(libs.androidx.compose.material)

    implementation(libs.bundles.shared.jvm.test.compose)
    implementation("androidx.core:core-ktx:1.10.0")
}
