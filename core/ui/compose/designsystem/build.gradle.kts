plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "app.k9mail.core.ui.compose.designsystem"
    resourcePrefix = "designsystem_"
}

dependencies {
    api(projects.core.ui.compose.theme)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.material.icons.extended)
    implementation("androidx.core:core-ktx:1.10.0")

    testImplementation(projects.core.ui.compose.testing)
}
