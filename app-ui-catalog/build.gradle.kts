plugins {
    id(ThunderbirdPlugins.App.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.ui.catalog"

    defaultConfig {
        applicationId = "app.k9mail.ui.catalog"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.core.ui.compose.designsystem)
    implementation(libs.androidx.compose.material)
    implementation("androidx.core:core-ktx:1.10.0")

    androidTestImplementation(libs.androidx.test.ext.junit.ktx)
    androidTestImplementation(libs.androidx.test.espresso.core)
}
